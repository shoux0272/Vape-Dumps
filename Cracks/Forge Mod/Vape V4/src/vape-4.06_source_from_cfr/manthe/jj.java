/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.A5;
import manthe.BG;
import manthe.V;
import manthe.bP;
import manthe.gJ;

public class jj
extends gJ {
    public final BG a = this.b("minX", true, Double.TYPE);
    public final BG e = this.b("minY", true, Double.TYPE);
    public final BG m = this.b("minZ", true, Double.TYPE);
    private final BG d = this.b("maxX", true, Double.TYPE);
    private final BG s = this.b("maxY", true, Double.TYPE);
    private final BG u = this.b("maxZ", true, Double.TYPE);
    private final bP p;
    private final bP g = this.a("addCoord", true, A5.b4, Double.TYPE, Double.TYPE, Double.TYPE);
    private final bP n = this.a("expand", true, A5.b4, Double.TYPE, Double.TYPE, Double.TYPE);
    private final bP o = this.a("calculateIntercept", true, A5.cH, A5.aW, A5.aW);
    private final bP q = this.a("isVecInside", true, Boolean.TYPE, A5.aW);
    private final bP i;
    private final bP r;
    private final bP l;
    private final bP k;
    private final bP j;
    private bP t;
    private bP f;
    private bP h;
    private bP v;

    public jj() {
        super(A5.b4);
        if (V.c() >= 23) {
            this.i = this.a("func_72317_d", false, A5.b4, Double.TYPE, Double.TYPE, Double.TYPE);
        } else {
            this.i = this.a("offset", true, A5.b4, Double.TYPE, Double.TYPE, Double.TYPE);
            this.t = this.a("contract", true, A5.b4, Double.TYPE, Double.TYPE, Double.TYPE);
        }
        this.l = this.a("calculateXOffset", true, Double.TYPE, A5.b4, Double.TYPE);
        this.r = this.a("calculateYOffset", true, Double.TYPE, A5.b4, Double.TYPE);
        this.k = this.a("calculateZOffset", true, Double.TYPE, A5.b4, Double.TYPE);
        this.j = this.a("intersectsWith", true, Boolean.TYPE, A5.b4);
        if (V.c() == 13) {
            this.f = this.a("copy", true, A5.b4, new Class[0]);
            this.h = this.a("getOffsetBoundingBox", true, A5.b4, Double.TYPE, Double.TYPE, Double.TYPE);
            this.v = this.a("setBB", true, Void.TYPE, A5.b4);
        }
        this.p = this.a("<init>", false, Void.TYPE, Double.TYPE, Double.TYPE, Double.TYPE, Double.TYPE, Double.TYPE, Double.TYPE);
    }

    public Object a(double d10, double d11, double d12, double d13, double d14, double d15) {
        return this.p.a(new Object[]{d10, d11, d12, d13, d14, d15});
    }

    public Object a(Object object, double d10, double d11, double d12) {
        return this.g.e(object, d10, d11, d12);
    }

    public Object c(Object object, double d10, double d11, double d12) {
        return this.n.e(object, d10, d11, d12);
    }

    public Object a(Object object, Object object2, Object object3) {
        return this.o.e(object, object2, object3);
    }

    public boolean a(Object object, Object object2) {
        return this.q.h(object, object2);
    }

    public Object b(Object object, double d10, double d11, double d12) {
        return this.i.e(object, d10, d11, d12);
    }

    public double d(Object object) {
        return this.a.g(object);
    }

    public double g(Object object) {
        return this.e.g(object);
    }

    public double f(Object object) {
        return this.m.g(object);
    }

    public double e(Object object) {
        return this.d.g(object);
    }

    public double c(Object object) {
        return this.s.g(object);
    }

    public double a(Object object) {
        return this.u.g(object);
    }

    private Object b(Object object) {
        return this.f.e(object, new Object[0]);
    }

    private Object d(Object object, double d10, double d11, double d12) {
        return this.h.e(object, d10, d11, d12);
    }

    private double b(Object object, Object object2, double d10) {
        return this.l.m(object, object2, d10);
    }

    private double c(Object object, Object object2, double d10) {
        return this.r.m(object, object2, d10);
    }

    private double a(Object object, Object object2, double d10) {
        return this.k.m(object, object2, d10);
    }

    private void c(Object object, Object object2) {
        this.v.p(object, object2);
    }

    private Object e(Object object, double d10, double d11, double d12) {
        return this.t.e(object, d10, d11, d12);
    }

    private boolean b(Object object, Object object2) {
        return this.j.h(object, object2);
    }

    static Object a(jj jj2, Object object) {
        return jj2.b(object);
    }

    static Object b(jj jj2, Object object, double d10, double d11, double d12) {
        return jj2.d(object, d10, d11, d12);
    }

    static double c(jj jj2, Object object, Object object2, double d10) {
        return jj2.b(object, object2, d10);
    }

    static double a(jj jj2, Object object, Object object2, double d10) {
        return jj2.c(object, object2, d10);
    }

    static double b(jj jj2, Object object, Object object2, double d10) {
        return jj2.a(object, object2, d10);
    }

    static void a(jj jj2, Object object, Object object2) {
        jj2.c(object, object2);
    }

    static Object a(jj jj2, Object object, double d10, double d11, double d12) {
        return jj2.e(object, d10, d11, d12);
    }

    static boolean b(jj jj2, Object object, Object object2) {
        return jj2.b(object, object2);
    }
}

