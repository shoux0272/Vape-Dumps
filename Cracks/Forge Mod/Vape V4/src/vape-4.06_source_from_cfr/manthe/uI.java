/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.vT;

class uI {
    private final Object b;
    private final long a;

    private uI(Object object) {
        this.b = object;
        this.a = System.currentTimeMillis();
    }

    public Object a() {
        return this.b;
    }

    public boolean a(long l) {
        long l6 = System.currentTimeMillis();
        return l6 - this.a > l;
    }

    uI(Object object, vT vT2) {
        this(object);
    }
}

