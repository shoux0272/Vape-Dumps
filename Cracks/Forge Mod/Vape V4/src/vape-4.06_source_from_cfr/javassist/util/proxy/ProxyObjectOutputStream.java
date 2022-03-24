/*
 * Decompiled with CFR 0.150.
 */
package javassist.util.proxy;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import java.io.OutputStream;
import javassist.util.proxy.Proxy;
import javassist.util.proxy.ProxyFactory;
import javassist.util.proxy.ProxyObject;

public class ProxyObjectOutputStream
extends ObjectOutputStream {
    public ProxyObjectOutputStream(OutputStream outputStream) throws IOException {
        super(outputStream);
    }

    @Override
    protected void writeClassDescriptor(ObjectStreamClass objectStreamClass) throws IOException {
        Class<?> class_ = objectStreamClass.forClass();
        if (ProxyFactory.isProxyClass(class_)) {
            this.writeBoolean(true);
            Class<?> class_2 = class_.getSuperclass();
            Class<?>[] arrclass = class_.getInterfaces();
            byte[] arrby = ProxyFactory.getFilterSignature(class_);
            String string = class_2.getName();
            this.writeObject(string);
            this.writeInt(arrclass.length - 1);
            for (int k = 0; k < arrclass.length; ++k) {
                Class<?> class_3 = arrclass[k];
                if (class_3 == ProxyObject.class || class_3 == Proxy.class) continue;
                string = arrclass[k].getName();
                this.writeObject(string);
            }
            this.writeInt(arrby.length);
            this.write(arrby);
        } else {
            this.writeBoolean(false);
            super.writeClassDescriptor(objectStreamClass);
        }
    }
}

