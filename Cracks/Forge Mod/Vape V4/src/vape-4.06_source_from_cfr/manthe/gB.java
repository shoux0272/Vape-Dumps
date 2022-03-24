/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.A5;
import manthe.BG;
import manthe.V;
import manthe.gJ;

public class gB
extends gJ {
    private final BG f = this.b("renderer", false, A5.a9);
    private final BG d = this.b("entity", false, A5.ba);
    private final BG e;
    private final BG a = this.b("renderPartialTicks", false, Double.TYPE);

    public gB() {
        super(A5.bs);
        this.e = V.c() >= 23 ? this.b("state", false, A5.aA) : this.b("block", false, A5.F);
    }

    private Object a(Object object) {
        return this.f.f(object);
    }

    private Object b(Object object) {
        return this.d.f(object);
    }

    private Object c(Object object) {
        return this.e.f(object);
    }

    private double d(Object object) {
        return this.a.b(object);
    }

    static Object c(gB gB2, Object object) {
        return gB2.a(object);
    }

    static Object a(gB gB2, Object object) {
        return gB2.b(object);
    }

    static Object b(gB gB2, Object object) {
        return gB2.c(object);
    }

    static double d(gB gB2, Object object) {
        return gB2.d(object);
    }
}

