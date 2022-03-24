/*
 * Decompiled with CFR 0.150.
 */
public class iReSqtkUVghgeiReSqtkUVg
extends iReSqtkUVgYJSiReSqtkUVg {
    private final iReSqtkUVgYewiReSqtkUVg d;
    public iReSqtkUVgYewiReSqtkUVg b;
    public iReSqtkUVgYewiReSqtkUVg c;
    private final iReSqtkUVgkgTiReSqtkUVg e = this.a("movementInput", true, iReSqtkUVgSzRiReSqtkUVg.p);
    private iReSqtkUVgkgTiReSqtkUVg f;
    private iReSqtkUVgkgTiReSqtkUVg g;
    private iReSqtkUVgkgTiReSqtkUVg h;
    private iReSqtkUVgkgTiReSqtkUVg i;
    private iReSqtkUVgkgTiReSqtkUVg j;
    private iReSqtkUVgkgTiReSqtkUVg k;
    private iReSqtkUVgkgTiReSqtkUVg l;
    private iReSqtkUVgkgTiReSqtkUVg m;
    private iReSqtkUVgkgTiReSqtkUVg n;
    private iReSqtkUVgkgTiReSqtkUVg o;

    public iReSqtkUVghgeiReSqtkUVg() {
        super(iReSqtkUVgSzRiReSqtkUVg.e);
        if (iReSqtkUVgauSiReSqtkUVg.d() > 13) {
            if (iReSqtkUVgauSiReSqtkUVg.d() >= 23) {
                this.f = this.a("field_191988_bg", false, Float.TYPE);
                this.g = this.a("connection", true, iReSqtkUVgSzRiReSqtkUVg.aa);
            } else {
                this.g = this.a("sendQueue", true, iReSqtkUVgSzRiReSqtkUVg.aa);
            }
            this.h = this.a("lastReportedPosX", true, Double.TYPE);
            this.i = this.a("lastReportedPosY", true, Double.TYPE);
            this.j = this.a("lastReportedPosZ", true, Double.TYPE);
            this.k = this.a("lastReportedYaw", true, Float.TYPE);
            this.l = this.a("lastReportedPitch", true, Float.TYPE);
            this.m = this.a("serverSneakState", true, Boolean.TYPE);
            this.n = this.a("serverSprintState", true, Boolean.TYPE);
            this.o = this.a("positionUpdateTicks", true, Integer.TYPE);
            this.b = this.a("sendChatMessage", true, Void.TYPE, String.class);
            this.c = this.a("onUpdateWalkingPlayer", true, Void.TYPE, new Class[0]);
        }
        this.d = this.a("setSprinting", true, Void.TYPE, Boolean.TYPE);
    }

    public float a(Object object) {
        return this.f.f(object);
    }

    public void a(Object object, float f) {
        this.f.a(object, f);
    }

    public Object b(Object object) {
        return this.e.h(object);
    }

    private Object c(Object object) {
        return this.g.h(object);
    }

    private double d(Object object) {
        return this.h.g(object);
    }

    private double e(Object object) {
        return this.i.g(object);
    }

    private double f(Object object) {
        return this.j.g(object);
    }

    private float g(Object object) {
        return this.k.f(object);
    }

    private float h(Object object) {
        return this.l.f(object);
    }

    private boolean i(Object object) {
        return this.m.a(object);
    }

    private boolean j(Object object) {
        return this.n.a(object);
    }

    private void a(Object object, double d2) {
        this.h.a(object, d2);
    }

    private void b(Object object, double d2) {
        this.i.a(object, d2);
    }

    private void c(Object object, double d2) {
        this.j.a(object, d2);
    }

    private void b(Object object, float f) {
        this.k.a(object, f);
    }

    private void c(Object object, float f) {
        this.l.a(object, f);
    }

    private void a(Object object, boolean bl) {
        this.m.a(object, bl);
    }

    private void b(Object object, boolean bl) {
        this.n.a(object, bl);
    }

    private int k(Object object) {
        return this.o.d(object);
    }

    private void a(Object object, int n) {
        this.o.a(object, n);
    }

    private void c(Object object, boolean bl) {
        this.d.a(object, new Object[]{bl});
    }

    private void a(Object object, String string) {
        this.b.a(object, new Object[]{string});
    }

    static /* synthetic */ Object a(iReSqtkUVghgeiReSqtkUVg iReSqtkUVghgeiReSqtkUVg2, Object object) {
        return iReSqtkUVghgeiReSqtkUVg2.c(object);
    }

    static /* synthetic */ double b(iReSqtkUVghgeiReSqtkUVg iReSqtkUVghgeiReSqtkUVg2, Object object) {
        return iReSqtkUVghgeiReSqtkUVg2.d(object);
    }

    static /* synthetic */ void a(iReSqtkUVghgeiReSqtkUVg iReSqtkUVghgeiReSqtkUVg2, Object object, double d2) {
        iReSqtkUVghgeiReSqtkUVg2.a(object, d2);
    }

    static /* synthetic */ double c(iReSqtkUVghgeiReSqtkUVg iReSqtkUVghgeiReSqtkUVg2, Object object) {
        return iReSqtkUVghgeiReSqtkUVg2.e(object);
    }

    static /* synthetic */ void b(iReSqtkUVghgeiReSqtkUVg iReSqtkUVghgeiReSqtkUVg2, Object object, double d2) {
        iReSqtkUVghgeiReSqtkUVg2.b(object, d2);
    }

    static /* synthetic */ double d(iReSqtkUVghgeiReSqtkUVg iReSqtkUVghgeiReSqtkUVg2, Object object) {
        return iReSqtkUVghgeiReSqtkUVg2.f(object);
    }

    static /* synthetic */ void c(iReSqtkUVghgeiReSqtkUVg iReSqtkUVghgeiReSqtkUVg2, Object object, double d2) {
        iReSqtkUVghgeiReSqtkUVg2.c(object, d2);
    }

    static /* synthetic */ float e(iReSqtkUVghgeiReSqtkUVg iReSqtkUVghgeiReSqtkUVg2, Object object) {
        return iReSqtkUVghgeiReSqtkUVg2.g(object);
    }

    static /* synthetic */ void a(iReSqtkUVghgeiReSqtkUVg iReSqtkUVghgeiReSqtkUVg2, Object object, float f) {
        iReSqtkUVghgeiReSqtkUVg2.b(object, f);
    }

    static /* synthetic */ float f(iReSqtkUVghgeiReSqtkUVg iReSqtkUVghgeiReSqtkUVg2, Object object) {
        return iReSqtkUVghgeiReSqtkUVg2.h(object);
    }

    static /* synthetic */ void b(iReSqtkUVghgeiReSqtkUVg iReSqtkUVghgeiReSqtkUVg2, Object object, float f) {
        iReSqtkUVghgeiReSqtkUVg2.c(object, f);
    }

    static /* synthetic */ boolean g(iReSqtkUVghgeiReSqtkUVg iReSqtkUVghgeiReSqtkUVg2, Object object) {
        return iReSqtkUVghgeiReSqtkUVg2.i(object);
    }

    static /* synthetic */ void a(iReSqtkUVghgeiReSqtkUVg iReSqtkUVghgeiReSqtkUVg2, Object object, boolean bl) {
        iReSqtkUVghgeiReSqtkUVg2.a(object, bl);
    }

    static /* synthetic */ boolean h(iReSqtkUVghgeiReSqtkUVg iReSqtkUVghgeiReSqtkUVg2, Object object) {
        return iReSqtkUVghgeiReSqtkUVg2.j(object);
    }

    static /* synthetic */ void b(iReSqtkUVghgeiReSqtkUVg iReSqtkUVghgeiReSqtkUVg2, Object object, boolean bl) {
        iReSqtkUVghgeiReSqtkUVg2.b(object, bl);
    }

    static /* synthetic */ int i(iReSqtkUVghgeiReSqtkUVg iReSqtkUVghgeiReSqtkUVg2, Object object) {
        return iReSqtkUVghgeiReSqtkUVg2.k(object);
    }

    static /* synthetic */ void a(iReSqtkUVghgeiReSqtkUVg iReSqtkUVghgeiReSqtkUVg2, Object object, int n) {
        iReSqtkUVghgeiReSqtkUVg2.a(object, n);
    }

    static /* synthetic */ void c(iReSqtkUVghgeiReSqtkUVg iReSqtkUVghgeiReSqtkUVg2, Object object, boolean bl) {
        iReSqtkUVghgeiReSqtkUVg2.c(object, bl);
    }

    static /* synthetic */ void a(iReSqtkUVghgeiReSqtkUVg iReSqtkUVghgeiReSqtkUVg2, Object object, String string) {
        iReSqtkUVghgeiReSqtkUVg2.a(object, string);
    }
}

