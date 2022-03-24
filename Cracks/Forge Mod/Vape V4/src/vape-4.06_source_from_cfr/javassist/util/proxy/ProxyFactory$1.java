/*
 * Decompiled with CFR 0.150.
 */
package javassist.util.proxy;

import javassist.util.proxy.ProxyFactory;
import javassist.util.proxy.ProxyFactory$ClassLoaderProvider;

class ProxyFactory$1
implements ProxyFactory$ClassLoaderProvider {
    ProxyFactory$1() {
    }

    @Override
    public ClassLoader get(ProxyFactory proxyFactory) {
        return proxyFactory.getClassLoader0();
    }
}

