/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.A5;
import manthe.BG;
import manthe.V;
import manthe.gJ;

public class iy
extends gJ {
    private final BG d = this.b("damageReduceAmount", true, Integer.TYPE);
    private final BG e;
    private final BG a = this.b("material", true, A5.h);

    public iy() {
        super(A5.cN);
        this.e = V.c() >= 23 ? this.b("armorType", true, A5.cb) : this.b("armorType", true, Integer.TYPE);
    }

    private int a(Object object) {
        return this.d.c(object);
    }

    private int b(Object object) {
        return this.e.c(object);
    }

    private Object d(Object object) {
        return this.e.f(object);
    }

    private Object c(Object object) {
        return this.a.f(object);
    }

    static int c(iy iy2, Object object) {
        return iy2.a(object);
    }

    static Object b(iy iy2, Object object) {
        return iy2.d(object);
    }

    static int d(iy iy2, Object object) {
        return iy2.b(object);
    }

    static Object a(iy iy2, Object object) {
        return iy2.c(object);
    }
}

