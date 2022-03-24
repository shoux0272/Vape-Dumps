/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.A5;
import manthe.V;
import manthe.bP;
import manthe.cy;
import manthe.gJ;

public class jn
extends gJ {
    private final bP f = this.a("func_149065_a", cy.c, A5.ba, A5.r);
    private final bP d;
    private final bP i;
    private final bP e;
    private final bP g;
    private final bP h;
    private final bP a;

    public jn() {
        super(A5.R);
        if (V.c() >= 23) {
            this.d = this.a("getX", true, Integer.TYPE, new Class[0]);
            this.i = this.a("getY", true, Integer.TYPE, new Class[0]);
            this.e = this.a("getZ", true, Integer.TYPE, new Class[0]);
        } else {
            this.d = this.a("func_149062_c", cy.c, Byte.TYPE, new Class[0]);
            this.i = this.a("func_149061_d", cy.c, Byte.TYPE, new Class[0]);
            this.e = this.a("func_149064_e", cy.c, Byte.TYPE, new Class[0]);
        }
        this.g = this.a("func_149066_f", cy.c, Byte.TYPE, new Class[0]);
        this.h = this.a("func_149063_g", cy.c, Byte.TYPE, new Class[0]);
        this.a = this.a("func_149060_h", cy.c, Boolean.TYPE, new Class[0]);
    }

    private Object a(Object object, Object object2) {
        return this.f.e(object, object2);
    }

    private int c(Object object) {
        return this.d.k(object, new Object[0]);
    }

    private int d(Object object) {
        return this.i.k(object, new Object[0]);
    }

    private int f(Object object) {
        return this.e.k(object, new Object[0]);
    }

    private byte b(Object object) {
        return this.g.k(object, new Object[0]);
    }

    private byte a(Object object) {
        return this.h.k(object, new Object[0]);
    }

    private boolean e(Object object) {
        return this.a.h(object, new Object[0]);
    }

    static Object a(jn jn2, Object object, Object object2) {
        return jn2.a(object, object2);
    }

    static int b(jn jn2, Object object) {
        return jn2.c(object);
    }

    static int d(jn jn2, Object object) {
        return jn2.d(object);
    }

    static int c(jn jn2, Object object) {
        return jn2.f(object);
    }

    static byte e(jn jn2, Object object) {
        return jn2.b(object);
    }

    static byte a(jn jn2, Object object) {
        return jn2.a(object);
    }

    static boolean f(jn jn2, Object object) {
        return jn2.e(object);
    }
}

