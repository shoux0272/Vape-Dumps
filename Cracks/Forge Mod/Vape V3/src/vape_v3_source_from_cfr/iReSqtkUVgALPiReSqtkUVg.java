/*
 * Decompiled with CFR 0.150.
 */
public class iReSqtkUVgALPiReSqtkUVg
extends iReSqtkUVgYJSiReSqtkUVg {
    private final iReSqtkUVgkgTiReSqtkUVg b = this.a("inventory", true, iReSqtkUVgSzRiReSqtkUVg.u);
    private final iReSqtkUVgkgTiReSqtkUVg c = this.a("inventoryContainer", true, iReSqtkUVgSzRiReSqtkUVg.A);
    private final iReSqtkUVgkgTiReSqtkUVg d = this.a("capabilities", true, iReSqtkUVgSzRiReSqtkUVg.aN);
    private final iReSqtkUVgkgTiReSqtkUVg e = this.a("openContainer", true, iReSqtkUVgSzRiReSqtkUVg.A);
    private final iReSqtkUVgkgTiReSqtkUVg f = this.a("fishEntity", true, iReSqtkUVgSzRiReSqtkUVg.bs);
    private final iReSqtkUVgkgTiReSqtkUVg g = this.a("field_71094_bP", true, Double.TYPE);
    private final iReSqtkUVgkgTiReSqtkUVg h = this.a("field_71095_bQ", true, Double.TYPE);
    private final iReSqtkUVgkgTiReSqtkUVg i = this.a("field_71085_bR", true, Double.TYPE);
    private final iReSqtkUVgkgTiReSqtkUVg j = this.a("field_71091_bM", true, Double.TYPE);
    private final iReSqtkUVgkgTiReSqtkUVg k = this.a("field_71096_bN", true, Double.TYPE);
    private final iReSqtkUVgkgTiReSqtkUVg l = this.a("field_71097_bO", true, Double.TYPE);
    private iReSqtkUVgYewiReSqtkUVg m;
    private iReSqtkUVgYewiReSqtkUVg n;
    private iReSqtkUVgYewiReSqtkUVg o;
    private iReSqtkUVgYewiReSqtkUVg p;
    private iReSqtkUVgYewiReSqtkUVg q;
    private iReSqtkUVgYewiReSqtkUVg r;
    private iReSqtkUVgYewiReSqtkUVg s;
    private iReSqtkUVgYewiReSqtkUVg t;
    private iReSqtkUVgYewiReSqtkUVg u;
    private iReSqtkUVgYewiReSqtkUVg v;
    private iReSqtkUVgYewiReSqtkUVg w;
    private iReSqtkUVgYewiReSqtkUVg x;
    private iReSqtkUVgYewiReSqtkUVg y;
    private iReSqtkUVgYewiReSqtkUVg z;
    private iReSqtkUVgYewiReSqtkUVg A;

    public iReSqtkUVgALPiReSqtkUVg() {
        super(iReSqtkUVgSzRiReSqtkUVg.d);
        if (iReSqtkUVgauSiReSqtkUVg.d() >= 23) {
            this.A = this.a("resetCooldown", true, Void.TYPE, new Class[0]);
            this.z = this.a("getCooledAttackStrength", true, Float.TYPE, Float.TYPE);
            this.p = this.a(iReSqtkUVgSzRiReSqtkUVg.n, "getHeldItemMainhand", true, iReSqtkUVgSzRiReSqtkUVg.v, new Class[0]);
            this.s = this.a(iReSqtkUVgSzRiReSqtkUVg.n, "isActiveItemStackBlocking", true, Boolean.TYPE, new Class[0]);
            this.u = this.a(iReSqtkUVgSzRiReSqtkUVg.n, "getItemInUseCount", true, Integer.TYPE, new Class[0]);
            this.v = this.a(iReSqtkUVgSzRiReSqtkUVg.e, "isHandActive", true, Boolean.TYPE, new Class[0]);
            this.y = this.a(iReSqtkUVgSzRiReSqtkUVg.n, "getItemInUseMaxCount", true, Integer.TYPE, new Class[0]);
        } else {
            this.p = this.a("getCurrentEquippedItem", true, iReSqtkUVgSzRiReSqtkUVg.v, new Class[0]);
            this.s = this.a("isBlocking", true, Boolean.TYPE, new Class[0]);
            this.u = this.a("getItemInUseCount", true, Integer.TYPE, new Class[0]);
            this.v = this.a("isUsingItem", true, Boolean.TYPE, new Class[0]);
            this.w = this.a("setItemInUse", true, Void.TYPE, iReSqtkUVgSzRiReSqtkUVg.v, Integer.TYPE);
            this.y = this.a("getItemInUseDuration", true, Integer.TYPE, new Class[0]);
        }
        this.m = this.a("closeScreen", true, Void.TYPE, new Class[0]);
        this.n = this.a("attackTargetEntityWithCurrentItem", true, Void.TYPE, iReSqtkUVgSzRiReSqtkUVg.c);
        this.o = this.a("getFoodStats", true, iReSqtkUVgSzRiReSqtkUVg.an, new Class[0]);
        this.q = this.a("getTeam", true, iReSqtkUVgSzRiReSqtkUVg.au, new Class[0]);
        this.r = this.a("getGameProfile", true, iReSqtkUVgSzRiReSqtkUVg.ay, new Class[0]);
        this.t = this.a("refreshDisplayName", false, Void.TYPE, new Class[0]);
    }

    private void b(Object object) {
        this.m.a(object, new Object[0]);
    }

    private void a(Object object, Object object2, int n) {
        this.w.a(object, new Object[]{object2, n});
    }

    private void c(Object object) {
    }

    public Object a(Object object) {
        return this.b.h(object);
    }

    private Object d(Object object) {
        return this.c.h(object);
    }

    private void a(Object object, Object object2) {
        this.n.a(object, new Object[]{object2});
    }

    private Object e(Object object) {
        return this.f.h(object);
    }

    private int f(Object object) {
        return this.y.e(object, new Object[0]);
    }

    private Object g(Object object) {
        return this.o.j(object, new Object[0]);
    }

    private Object h(Object object) {
        return this.p.j(object, new Object[0]);
    }

    private float a(Object object, float f) {
        return this.z.g(object, Float.valueOf(f));
    }

    private void i(Object object) {
        this.A.a(object, new Object[0]);
    }

    private Object j(Object object) {
        return this.q.j(object, new Object[0]);
    }

    private Object k(Object object) {
        return this.r.j(object, new Object[0]);
    }

    private Object l(Object object) {
        return this.d.h(object);
    }

    private Object m(Object object) {
        return this.e.h(object);
    }

    private boolean n(Object object) {
        return this.s.b(object, new Object[0]);
    }

    private void o(Object object) {
        this.t.a(object, new Object[0]);
    }

    private int p(Object object) {
        return this.u.e(object, new Object[0]);
    }

    private boolean q(Object object) {
        return this.v.b(object, new Object[0]);
    }

    private double r(Object object) {
        return this.g.g(object);
    }

    private double s(Object object) {
        return this.h.g(object);
    }

    private double t(Object object) {
        return this.i.g(object);
    }

    private double u(Object object) {
        return this.j.g(object);
    }

    private double v(Object object) {
        return this.k.g(object);
    }

    private double w(Object object) {
        return this.l.g(object);
    }

    private void a(Object object, double d2) {
        this.g.a(object, d2);
    }

    private void b(Object object, double d2) {
        this.h.a(object, d2);
    }

    private void c(Object object, double d2) {
        this.i.a(object, d2);
    }

    private void d(Object object, double d2) {
        this.j.a(object, d2);
    }

    private void e(Object object, double d2) {
        this.k.a(object, d2);
    }

    private void f(Object object, double d2) {
        this.l.a(object, d2);
    }

    static /* synthetic */ void a(iReSqtkUVgALPiReSqtkUVg iReSqtkUVgALPiReSqtkUVg2, Object object) {
        iReSqtkUVgALPiReSqtkUVg2.b(object);
    }

    static /* synthetic */ void a(iReSqtkUVgALPiReSqtkUVg iReSqtkUVgALPiReSqtkUVg2, Object object, Object object2, int n) {
        iReSqtkUVgALPiReSqtkUVg2.a(object, object2, n);
    }

    static /* synthetic */ int b(iReSqtkUVgALPiReSqtkUVg iReSqtkUVgALPiReSqtkUVg2, Object object) {
        return iReSqtkUVgALPiReSqtkUVg2.f(object);
    }

    static /* synthetic */ Object c(iReSqtkUVgALPiReSqtkUVg iReSqtkUVgALPiReSqtkUVg2, Object object) {
        return iReSqtkUVgALPiReSqtkUVg2.d(object);
    }

    static /* synthetic */ void a(iReSqtkUVgALPiReSqtkUVg iReSqtkUVgALPiReSqtkUVg2, Object object, Object object2) {
        iReSqtkUVgALPiReSqtkUVg2.a(object, object2);
    }

    static /* synthetic */ Object d(iReSqtkUVgALPiReSqtkUVg iReSqtkUVgALPiReSqtkUVg2, Object object) {
        return iReSqtkUVgALPiReSqtkUVg2.e(object);
    }

    static /* synthetic */ Object e(iReSqtkUVgALPiReSqtkUVg iReSqtkUVgALPiReSqtkUVg2, Object object) {
        return iReSqtkUVgALPiReSqtkUVg2.g(object);
    }

    static /* synthetic */ Object f(iReSqtkUVgALPiReSqtkUVg iReSqtkUVgALPiReSqtkUVg2, Object object) {
        return iReSqtkUVgALPiReSqtkUVg2.h(object);
    }

    static /* synthetic */ Object g(iReSqtkUVgALPiReSqtkUVg iReSqtkUVgALPiReSqtkUVg2, Object object) {
        return iReSqtkUVgALPiReSqtkUVg2.k(object);
    }

    static /* synthetic */ Object h(iReSqtkUVgALPiReSqtkUVg iReSqtkUVgALPiReSqtkUVg2, Object object) {
        return iReSqtkUVgALPiReSqtkUVg2.j(object);
    }

    static /* synthetic */ Object i(iReSqtkUVgALPiReSqtkUVg iReSqtkUVgALPiReSqtkUVg2, Object object) {
        return iReSqtkUVgALPiReSqtkUVg2.l(object);
    }

    static /* synthetic */ Object j(iReSqtkUVgALPiReSqtkUVg iReSqtkUVgALPiReSqtkUVg2, Object object) {
        return iReSqtkUVgALPiReSqtkUVg2.m(object);
    }

    static /* synthetic */ float a(iReSqtkUVgALPiReSqtkUVg iReSqtkUVgALPiReSqtkUVg2, Object object, float f) {
        return iReSqtkUVgALPiReSqtkUVg2.a(object, f);
    }

    static /* synthetic */ void k(iReSqtkUVgALPiReSqtkUVg iReSqtkUVgALPiReSqtkUVg2, Object object) {
        iReSqtkUVgALPiReSqtkUVg2.i(object);
    }

    static /* synthetic */ boolean l(iReSqtkUVgALPiReSqtkUVg iReSqtkUVgALPiReSqtkUVg2, Object object) {
        return iReSqtkUVgALPiReSqtkUVg2.n(object);
    }

    static /* synthetic */ boolean m(iReSqtkUVgALPiReSqtkUVg iReSqtkUVgALPiReSqtkUVg2, Object object) {
        return iReSqtkUVgALPiReSqtkUVg2.q(object);
    }

    static /* synthetic */ void n(iReSqtkUVgALPiReSqtkUVg iReSqtkUVgALPiReSqtkUVg2, Object object) {
        iReSqtkUVgALPiReSqtkUVg2.o(object);
    }

    static /* synthetic */ int o(iReSqtkUVgALPiReSqtkUVg iReSqtkUVgALPiReSqtkUVg2, Object object) {
        return iReSqtkUVgALPiReSqtkUVg2.p(object);
    }

    static /* synthetic */ double p(iReSqtkUVgALPiReSqtkUVg iReSqtkUVgALPiReSqtkUVg2, Object object) {
        return iReSqtkUVgALPiReSqtkUVg2.r(object);
    }

    static /* synthetic */ double q(iReSqtkUVgALPiReSqtkUVg iReSqtkUVgALPiReSqtkUVg2, Object object) {
        return iReSqtkUVgALPiReSqtkUVg2.s(object);
    }

    static /* synthetic */ double r(iReSqtkUVgALPiReSqtkUVg iReSqtkUVgALPiReSqtkUVg2, Object object) {
        return iReSqtkUVgALPiReSqtkUVg2.t(object);
    }

    static /* synthetic */ double s(iReSqtkUVgALPiReSqtkUVg iReSqtkUVgALPiReSqtkUVg2, Object object) {
        return iReSqtkUVgALPiReSqtkUVg2.u(object);
    }

    static /* synthetic */ double t(iReSqtkUVgALPiReSqtkUVg iReSqtkUVgALPiReSqtkUVg2, Object object) {
        return iReSqtkUVgALPiReSqtkUVg2.v(object);
    }

    static /* synthetic */ double u(iReSqtkUVgALPiReSqtkUVg iReSqtkUVgALPiReSqtkUVg2, Object object) {
        return iReSqtkUVgALPiReSqtkUVg2.w(object);
    }

    static /* synthetic */ void a(iReSqtkUVgALPiReSqtkUVg iReSqtkUVgALPiReSqtkUVg2, Object object, double d2) {
        iReSqtkUVgALPiReSqtkUVg2.a(object, d2);
    }

    static /* synthetic */ void b(iReSqtkUVgALPiReSqtkUVg iReSqtkUVgALPiReSqtkUVg2, Object object, double d2) {
        iReSqtkUVgALPiReSqtkUVg2.b(object, d2);
    }

    static /* synthetic */ void c(iReSqtkUVgALPiReSqtkUVg iReSqtkUVgALPiReSqtkUVg2, Object object, double d2) {
        iReSqtkUVgALPiReSqtkUVg2.c(object, d2);
    }

    static /* synthetic */ void d(iReSqtkUVgALPiReSqtkUVg iReSqtkUVgALPiReSqtkUVg2, Object object, double d2) {
        iReSqtkUVgALPiReSqtkUVg2.d(object, d2);
    }

    static /* synthetic */ void e(iReSqtkUVgALPiReSqtkUVg iReSqtkUVgALPiReSqtkUVg2, Object object, double d2) {
        iReSqtkUVgALPiReSqtkUVg2.e(object, d2);
    }

    static /* synthetic */ void f(iReSqtkUVgALPiReSqtkUVg iReSqtkUVgALPiReSqtkUVg2, Object object, double d2) {
        iReSqtkUVgALPiReSqtkUVg2.f(object, d2);
    }
}

