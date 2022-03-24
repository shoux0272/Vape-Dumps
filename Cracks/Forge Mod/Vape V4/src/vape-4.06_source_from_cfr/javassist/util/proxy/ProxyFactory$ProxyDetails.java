/*
 * Decompiled with CFR 0.150.
 */
package javassist.util.proxy;

import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

class ProxyFactory$ProxyDetails {
    byte[] signature;
    Reference<Class<?>> proxyClass;
    boolean isUseWriteReplace;

    ProxyFactory$ProxyDetails(byte[] arrby, Class<?> class_, boolean bl) {
        this.signature = arrby;
        this.proxyClass = new WeakReference(class_);
        this.isUseWriteReplace = bl;
    }
}

