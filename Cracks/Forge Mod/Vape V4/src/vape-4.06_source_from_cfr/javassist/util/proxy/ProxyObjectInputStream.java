/*
 * Decompiled with CFR 0.150.
 */
package javassist.util.proxy;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import javassist.util.proxy.ProxyFactory;

public class ProxyObjectInputStream
extends ObjectInputStream {
    private ClassLoader loader = Thread.currentThread().getContextClassLoader();

    public ProxyObjectInputStream(InputStream inputStream) throws IOException {
        super(inputStream);
        if (this.loader == null) {
            this.loader = ClassLoader.getSystemClassLoader();
        }
    }

    public void setClassLoader(ClassLoader classLoader) {
        if (classLoader != null) {
            this.loader = classLoader;
        } else {
            classLoader = ClassLoader.getSystemClassLoader();
        }
    }

    @Override
    protected ObjectStreamClass readClassDescriptor() throws IOException, ClassNotFoundException {
        boolean bl = this.readBoolean();
        if (bl) {
            String string = (String)this.readObject();
            Class<?> class_ = this.loader.loadClass(string);
            int n6 = this.readInt();
            Class[] arrclass = new Class[n6];
            for (int k = 0; k < n6; ++k) {
                string = (String)this.readObject();
                arrclass[k] = this.loader.loadClass(string);
            }
            n6 = this.readInt();
            byte[] arrby = new byte[n6];
            this.read(arrby);
            ProxyFactory proxyFactory = new ProxyFactory();
            proxyFactory.setUseCache(true);
            proxyFactory.setUseWriteReplace(false);
            proxyFactory.setSuperclass(class_);
            proxyFactory.setInterfaces(arrclass);
            Class<?> class_2 = proxyFactory.createClass(arrby);
            return ObjectStreamClass.lookup(class_2);
        }
        return super.readClassDescriptor();
    }
}

