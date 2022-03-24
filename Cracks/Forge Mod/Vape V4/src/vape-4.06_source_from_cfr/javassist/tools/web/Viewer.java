/*
 * Decompiled with CFR 0.150.
 */
package javassist.tools.web;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.net.URLConnection;

public class Viewer
extends ClassLoader {
    private String server;
    private int port;

    public static void main(String[] arrstring) throws Throwable {
        if (arrstring.length >= 3) {
            Viewer viewer = new Viewer(arrstring[0], Integer.parseInt(arrstring[1]));
            String[] arrstring2 = new String[arrstring.length - 3];
            System.arraycopy(arrstring, 3, arrstring2, 0, arrstring.length - 3);
            viewer.run(arrstring[2], arrstring2);
        } else {
            System.err.println("Usage: java javassist.tools.web.Viewer <host> <port> class [args ...]");
        }
    }

    public Viewer(String string, int n6) {
        this.server = string;
        this.port = n6;
    }

    public String getServer() {
        return this.server;
    }

    public int getPort() {
        return this.port;
    }

    public void run(String string, String[] arrstring) throws Throwable {
        Class<?> class_ = this.loadClass(string);
        try {
            class_.getDeclaredMethod("main", String[].class).invoke(null, new Object[]{arrstring});
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    @Override
    protected synchronized Class<?> loadClass(String string, boolean bl) throws ClassNotFoundException {
        Class<?> class_ = this.findLoadedClass(string);
        if (class_ == null) {
            class_ = this.findClass(string);
        }
        if (class_ == null) {
            throw new ClassNotFoundException(string);
        }
        if (bl) {
            this.resolveClass(class_);
        }
        return class_;
    }

    @Override
    protected Class<?> findClass(String string) throws ClassNotFoundException {
        Class<?> class_ = null;
        if (string.startsWith("java.") || string.startsWith("javax.") || string.equals("a.Cd")) {
            class_ = this.findSystemClass(string);
        }
        if (class_ == null) {
            try {
                byte[] arrby = this.fetchClass(string);
                if (arrby != null) {
                    class_ = this.defineClass(string, arrby, 0, arrby.length);
                }
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
        return class_;
    }

    protected byte[] fetchClass(String string) throws Exception {
        byte[] arrby;
        URL uRL = new URL("http", this.server, this.port, "/" + string.replace('.', '/') + ".class");
        URLConnection uRLConnection = uRL.openConnection();
        uRLConnection.connect();
        int n6 = uRLConnection.getContentLength();
        InputStream inputStream = uRLConnection.getInputStream();
        if (n6 <= 0) {
            arrby = this.readStream(inputStream);
        } else {
            int n10;
            arrby = new byte[n6];
            int n11 = 0;
            do {
                if ((n10 = inputStream.read(arrby, n11, n6 - n11)) >= 0) continue;
                inputStream.close();
                throw new IOException("the stream was closed: " + string);
            } while ((n11 += n10) < n6);
        }
        inputStream.close();
        return arrby;
    }

    private byte[] readStream(InputStream inputStream) throws IOException {
        byte[] arrby;
        byte[] arrby2 = new byte[4096];
        int n6 = 0;
        int n10 = 0;
        do {
            if (arrby2.length - (n6 += n10) > 0) continue;
            arrby = new byte[arrby2.length * 2];
            System.arraycopy(arrby2, 0, arrby, 0, n6);
            arrby2 = arrby;
        } while ((n10 = inputStream.read(arrby2, n6, arrby2.length - n6)) >= 0);
        arrby = new byte[n6];
        System.arraycopy(arrby2, 0, arrby, 0, n6);
        return arrby;
    }
}

