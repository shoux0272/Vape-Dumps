/*
 * Decompiled with CFR 0.150.
 */
package javassist.tools.rmi;

import java.applet.Applet;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.net.Socket;
import java.net.URL;
import javassist.tools.rmi.ObjectNotFoundException;
import javassist.tools.rmi.Proxy;
import javassist.tools.rmi.RemoteException;
import javassist.tools.rmi.RemoteRef;

public class ObjectImporter
implements Serializable {
    private static final long serialVersionUID = 1L;
    private final byte[] endofline = new byte[]{13, 10};
    private String servername;
    private String orgServername;
    private int port;
    private int orgPort;
    protected byte[] lookupCommand = "POST /lookup HTTP/1.0".getBytes();
    protected byte[] rmiCommand = "POST /rmi HTTP/1.0".getBytes();
    private static final Class<?>[] proxyConstructorParamTypes = new Class[]{ObjectImporter.class, Integer.TYPE};

    public ObjectImporter(Applet applet) {
        URL uRL = applet.getCodeBase();
        this.orgServername = this.servername = uRL.getHost();
        this.orgPort = this.port = uRL.getPort();
    }

    public ObjectImporter(String string, int n6) {
        this.orgServername = this.servername = string;
        this.orgPort = this.port = n6;
    }

    public Object getObject(String string) {
        try {
            return this.lookupObject(string);
        }
        catch (ObjectNotFoundException objectNotFoundException) {
            return null;
        }
    }

    public void setHttpProxy(String string, int n6) {
        String string2 = "POST http://" + this.orgServername + ":" + this.orgPort;
        String string3 = string2 + "/lookup HTTP/1.0";
        this.lookupCommand = string3.getBytes();
        string3 = string2 + "/rmi HTTP/1.0";
        this.rmiCommand = string3.getBytes();
        this.servername = string;
        this.port = n6;
    }

    public Object lookupObject(String string) throws ObjectNotFoundException {
        try {
            Socket socket = new Socket(this.servername, this.port);
            OutputStream outputStream = socket.getOutputStream();
            outputStream.write(this.lookupCommand);
            outputStream.write(this.endofline);
            outputStream.write(this.endofline);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
            objectOutputStream.writeUTF(string);
            objectOutputStream.flush();
            BufferedInputStream bufferedInputStream = new BufferedInputStream(socket.getInputStream());
            this.skipHeader(bufferedInputStream);
            ObjectInputStream objectInputStream = new ObjectInputStream(bufferedInputStream);
            int n6 = objectInputStream.readInt();
            String string2 = objectInputStream.readUTF();
            objectInputStream.close();
            objectOutputStream.close();
            socket.close();
            if (n6 >= 0) {
                return this.createProxy(n6, string2);
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
            throw new ObjectNotFoundException(string, exception);
        }
        throw new ObjectNotFoundException(string);
    }

    private Object createProxy(int n6, String string) throws Exception {
        Class<?> class_ = Class.forName(string);
        Constructor<?> constructor = class_.getConstructor(proxyConstructorParamTypes);
        return constructor.newInstance(this, n6);
    }

    public Object call(int n6, int n10, Object[] arrobject) throws RemoteException {
        String string;
        Object object;
        boolean bl;
        try {
            Socket socket = new Socket(this.servername, this.port);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(socket.getOutputStream());
            ((OutputStream)bufferedOutputStream).write(this.rmiCommand);
            ((OutputStream)bufferedOutputStream).write(this.endofline);
            ((OutputStream)bufferedOutputStream).write(this.endofline);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(bufferedOutputStream);
            objectOutputStream.writeInt(n6);
            objectOutputStream.writeInt(n10);
            this.writeParameters(objectOutputStream, arrobject);
            objectOutputStream.flush();
            BufferedInputStream bufferedInputStream = new BufferedInputStream(socket.getInputStream());
            this.skipHeader(bufferedInputStream);
            ObjectInputStream objectInputStream = new ObjectInputStream(bufferedInputStream);
            bl = objectInputStream.readBoolean();
            object = null;
            string = null;
            if (bl) {
                object = objectInputStream.readObject();
            } else {
                string = objectInputStream.readUTF();
            }
            objectInputStream.close();
            objectOutputStream.close();
            socket.close();
            if (object instanceof RemoteRef) {
                RemoteRef remoteRef = (RemoteRef)object;
                object = this.createProxy(remoteRef.c, remoteRef.a);
            }
        }
        catch (ClassNotFoundException classNotFoundException) {
            throw new RemoteException(classNotFoundException);
        }
        catch (IOException iOException) {
            throw new RemoteException(iOException);
        }
        catch (Exception exception) {
            throw new RemoteException(exception);
        }
        if (bl) {
            return object;
        }
        throw new RemoteException(string);
    }

    private void skipHeader(InputStream inputStream) throws IOException {
        int n6;
        do {
            int n10;
            n6 = 0;
            while ((n10 = inputStream.read()) >= 0 && n10 != 13) {
                ++n6;
            }
            inputStream.read();
        } while (n6 > 0);
    }

    private void writeParameters(ObjectOutputStream objectOutputStream, Object[] arrobject) throws IOException {
        int n6 = arrobject.length;
        objectOutputStream.writeInt(n6);
        for (int k = 0; k < n6; ++k) {
            if (arrobject[k] instanceof Proxy) {
                Proxy proxy = (Proxy)arrobject[k];
                objectOutputStream.writeObject(new RemoteRef(proxy._getObjectId()));
                continue;
            }
            objectOutputStream.writeObject(arrobject[k]);
        }
    }
}

