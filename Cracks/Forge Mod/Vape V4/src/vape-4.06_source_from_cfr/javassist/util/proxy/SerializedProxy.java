/*
 * Decompiled with CFR 0.150.
 */
package javassist.util.proxy;

import java.io.InvalidClassException;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import javassist.util.proxy.MethodHandler;
import javassist.util.proxy.Proxy;
import javassist.util.proxy.ProxyFactory;
import javassist.util.proxy.ProxyObject;
import javassist.util.proxy.SerializedProxy$1;

class SerializedProxy
implements Serializable {
    private static final long serialVersionUID = 1L;
    private String superClass;
    private String[] interfaces;
    private byte[] filterSignature;
    private MethodHandler handler;

    SerializedProxy(Class<?> class_, byte[] arrby, MethodHandler methodHandler) {
        this.filterSignature = arrby;
        this.handler = methodHandler;
        this.superClass = class_.getSuperclass().getName();
        Class<?>[] arrclass = class_.getInterfaces();
        int n6 = arrclass.length;
        this.interfaces = new String[n6 - 1];
        String string = ProxyObject.class.getName();
        String string2 = Proxy.class.getName();
        for (int k = 0; k < n6; ++k) {
            String string3 = arrclass[k].getName();
            if (string3.equals(string) || string3.equals(string2)) continue;
            this.interfaces[k] = string3;
        }
    }

    protected Class<?> loadClass(String string) throws ClassNotFoundException {
        try {
            return (Class)AccessController.doPrivileged(new SerializedProxy$1(this, string));
        }
        catch (PrivilegedActionException privilegedActionException) {
            throw new RuntimeException("cannot load the class: " + string, privilegedActionException.getException());
        }
    }

    Object readResolve() throws ObjectStreamException {
        try {
            int n6 = this.interfaces.length;
            Class[] arrclass = new Class[n6];
            for (int k = 0; k < n6; ++k) {
                arrclass[k] = this.loadClass(this.interfaces[k]);
            }
            ProxyFactory proxyFactory = new ProxyFactory();
            proxyFactory.setSuperclass(this.loadClass(this.superClass));
            proxyFactory.setInterfaces(arrclass);
            Proxy proxy = (Proxy)proxyFactory.createClass(this.filterSignature).getConstructor(new Class[0]).newInstance(new Object[0]);
            proxy.setHandler(this.handler);
            return proxy;
        }
        catch (NoSuchMethodException noSuchMethodException) {
            throw new InvalidClassException(noSuchMethodException.getMessage());
        }
        catch (InvocationTargetException invocationTargetException) {
            throw new InvalidClassException(invocationTargetException.getMessage());
        }
        catch (ClassNotFoundException classNotFoundException) {
            throw new InvalidClassException(classNotFoundException.getMessage());
        }
        catch (InstantiationException instantiationException) {
            throw new InvalidObjectException(instantiationException.getMessage());
        }
        catch (IllegalAccessException illegalAccessException) {
            throw new InvalidClassException(illegalAccessException.getMessage());
        }
    }
}

