/*
 * Decompiled with CFR 0.150.
 */
public class iReSqtkUVgYQPiReSqtkUVg
extends iReSqtkUVgYJSiReSqtkUVg {
    public final iReSqtkUVgkgTiReSqtkUVg b = this.a("minX", true, Double.TYPE);
    public final iReSqtkUVgkgTiReSqtkUVg c = this.a("minY", true, Double.TYPE);
    public final iReSqtkUVgkgTiReSqtkUVg d = this.a("minZ", true, Double.TYPE);
    public final iReSqtkUVgkgTiReSqtkUVg e = this.a("maxX", true, Double.TYPE);
    public final iReSqtkUVgkgTiReSqtkUVg f = this.a("maxY", true, Double.TYPE);
    public final iReSqtkUVgkgTiReSqtkUVg g = this.a("maxZ", true, Double.TYPE);
    private final iReSqtkUVgYewiReSqtkUVg h;
    private final iReSqtkUVgYewiReSqtkUVg i = this.a("addCoord", true, iReSqtkUVgSzRiReSqtkUVg.cf, Double.TYPE, Double.TYPE, Double.TYPE);
    private final iReSqtkUVgYewiReSqtkUVg j = this.a("expand", true, iReSqtkUVgSzRiReSqtkUVg.cf, Double.TYPE, Double.TYPE, Double.TYPE);
    private final iReSqtkUVgYewiReSqtkUVg k = this.a("calculateIntercept", true, iReSqtkUVgSzRiReSqtkUVg.cg, iReSqtkUVgSzRiReSqtkUVg.ce, iReSqtkUVgSzRiReSqtkUVg.ce);
    private final iReSqtkUVgYewiReSqtkUVg l = this.a("isVecInside", true, Boolean.TYPE, iReSqtkUVgSzRiReSqtkUVg.ce);
    private final iReSqtkUVgYewiReSqtkUVg m;
    private final iReSqtkUVgYewiReSqtkUVg n;
    private iReSqtkUVgYewiReSqtkUVg o;
    private iReSqtkUVgYewiReSqtkUVg p;
    private iReSqtkUVgYewiReSqtkUVg q;
    private iReSqtkUVgYewiReSqtkUVg r;
    private iReSqtkUVgYewiReSqtkUVg s;
    private iReSqtkUVgYewiReSqtkUVg t;
    private iReSqtkUVgYewiReSqtkUVg u;

    public iReSqtkUVgYQPiReSqtkUVg() {
        super(iReSqtkUVgSzRiReSqtkUVg.cf);
        if (iReSqtkUVgauSiReSqtkUVg.d() >= 23) {
            this.m = this.a("func_72317_d", false, iReSqtkUVgSzRiReSqtkUVg.cf, Double.TYPE, Double.TYPE, Double.TYPE);
        } else {
            this.m = this.a("offset", true, iReSqtkUVgSzRiReSqtkUVg.cf, Double.TYPE, Double.TYPE, Double.TYPE);
            this.q = this.a("contract", true, iReSqtkUVgSzRiReSqtkUVg.cf, Double.TYPE, Double.TYPE, Double.TYPE);
        }
        this.o = this.a("calculateXOffset", true, Double.TYPE, iReSqtkUVgSzRiReSqtkUVg.cf, Double.TYPE);
        this.n = this.a("calculateYOffset", true, Double.TYPE, iReSqtkUVgSzRiReSqtkUVg.cf, Double.TYPE);
        this.p = this.a("calculateZOffset", true, Double.TYPE, iReSqtkUVgSzRiReSqtkUVg.cf, Double.TYPE);
        this.r = this.a("intersectsWith", true, Boolean.TYPE, iReSqtkUVgSzRiReSqtkUVg.cf);
        if (iReSqtkUVgauSiReSqtkUVg.d() == 13) {
            this.s = this.a("copy", true, iReSqtkUVgSzRiReSqtkUVg.cf, new Class[0]);
            this.t = this.a("getOffsetBoundingBox", true, iReSqtkUVgSzRiReSqtkUVg.cf, Double.TYPE, Double.TYPE, Double.TYPE);
            this.u = this.a("setBB", true, Void.TYPE, iReSqtkUVgSzRiReSqtkUVg.cf);
        }
        this.h = this.a("<init>", false, Void.TYPE, Double.TYPE, Double.TYPE, Double.TYPE, Double.TYPE, Double.TYPE, Double.TYPE);
    }

    public Object a(double d2, double d3, double d4, double d5, double d6, double d7) {
        return this.h.a(new Object[]{d2, d3, d4, d5, d6, d7});
    }

    public Object a(Object object, double d2, double d3, double d4) {
        return this.i.j(object, d2, d3, d4);
    }

    public Object b(Object object, double d2, double d3, double d4) {
        return this.j.j(object, d2, d3, d4);
    }

    public Object a(Object object, Object object2, Object object3) {
        return this.k.j(object, object2, object3);
    }

    public boolean a(Object object, Object object2) {
        return this.l.b(object, object2);
    }

    public Object c(Object object, double d2, double d3, double d4) {
        return this.m.j(object, d2, d3, d4);
    }

    public double a(Object object) {
        return this.b.g(object);
    }

    public double b(Object object) {
        return this.c.g(object);
    }

    public double c(Object object) {
        return this.d.g(object);
    }

    public double d(Object object) {
        return this.e.g(object);
    }

    public double e(Object object) {
        return this.f.g(object);
    }

    public double f(Object object) {
        return this.g.g(object);
    }

    private Object g(Object object) {
        return this.s.j(object, new Object[0]);
    }

    private Object d(Object object, double d2, double d3, double d4) {
        return this.t.j(object, d2, d3, d4);
    }

    private double a(Object object, Object object2, double d2) {
        return this.o.h(object, object2, d2);
    }

    private double b(Object object, Object object2, double d2) {
        return this.n.h(object, object2, d2);
    }

    private double c(Object object, Object object2, double d2) {
        return this.p.h(object, object2, d2);
    }

    private void b(Object object, Object object2) {
        this.u.a(object, new Object[]{object2});
    }

    private Object e(Object object, double d2, double d3, double d4) {
        return this.q.j(object, d2, d3, d4);
    }

    private boolean c(Object object, Object object2) {
        return this.r.b(object, object2);
    }

    static /* synthetic */ Object a(iReSqtkUVgYQPiReSqtkUVg iReSqtkUVgYQPiReSqtkUVg2, Object object) {
        return iReSqtkUVgYQPiReSqtkUVg2.g(object);
    }

    static /* synthetic */ Object a(iReSqtkUVgYQPiReSqtkUVg iReSqtkUVgYQPiReSqtkUVg2, Object object, double d2, double d3, double d4) {
        return iReSqtkUVgYQPiReSqtkUVg2.d(object, d2, d3, d4);
    }

    static /* synthetic */ double a(iReSqtkUVgYQPiReSqtkUVg iReSqtkUVgYQPiReSqtkUVg2, Object object, Object object2, double d2) {
        return iReSqtkUVgYQPiReSqtkUVg2.a(object, object2, d2);
    }

    static /* synthetic */ double b(iReSqtkUVgYQPiReSqtkUVg iReSqtkUVgYQPiReSqtkUVg2, Object object, Object object2, double d2) {
        return iReSqtkUVgYQPiReSqtkUVg2.b(object, object2, d2);
    }

    static /* synthetic */ double c(iReSqtkUVgYQPiReSqtkUVg iReSqtkUVgYQPiReSqtkUVg2, Object object, Object object2, double d2) {
        return iReSqtkUVgYQPiReSqtkUVg2.c(object, object2, d2);
    }

    static /* synthetic */ void a(iReSqtkUVgYQPiReSqtkUVg iReSqtkUVgYQPiReSqtkUVg2, Object object, Object object2) {
        iReSqtkUVgYQPiReSqtkUVg2.b(object, object2);
    }

    static /* synthetic */ Object b(iReSqtkUVgYQPiReSqtkUVg iReSqtkUVgYQPiReSqtkUVg2, Object object, double d2, double d3, double d4) {
        return iReSqtkUVgYQPiReSqtkUVg2.e(object, d2, d3, d4);
    }

    static /* synthetic */ boolean b(iReSqtkUVgYQPiReSqtkUVg iReSqtkUVgYQPiReSqtkUVg2, Object object, Object object2) {
        return iReSqtkUVgYQPiReSqtkUVg2.c(object, object2);
    }
}

