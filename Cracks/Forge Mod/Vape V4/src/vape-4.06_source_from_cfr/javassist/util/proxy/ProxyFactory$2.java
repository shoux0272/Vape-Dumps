/*
 * Decompiled with CFR 0.150.
 */
package javassist.util.proxy;

import javassist.util.proxy.ProxyFactory$UniqueName;

class ProxyFactory$2
implements ProxyFactory$UniqueName {
    private final String sep = "_$$_jvst" + Integer.toHexString(this.hashCode() & 0xFFF) + "_";
    private int counter = 0;

    ProxyFactory$2() {
    }

    @Override
    public String get(String string) {
        return string + this.sep + Integer.toHexString(this.counter++);
    }
}

