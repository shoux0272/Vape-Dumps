/*
 * Decompiled with CFR 0.150.
 */
public class iReSqtkUVgdgbiReSqtkUVg
extends iReSqtkUVgYJSiReSqtkUVg {
    private final iReSqtkUVgYewiReSqtkUVg c;
    private final iReSqtkUVgkgTiReSqtkUVg d = this.a("sendQueue", true, iReSqtkUVgSzRiReSqtkUVg.aa);
    private final iReSqtkUVgkgTiReSqtkUVg e = this.a("wasSprinting", true, Boolean.TYPE);
    private final iReSqtkUVgkgTiReSqtkUVg f = this.a("wasSneaking", true, Boolean.TYPE);
    private final iReSqtkUVgkgTiReSqtkUVg g = this.a("oldPosX", true, Double.TYPE);
    private final iReSqtkUVgkgTiReSqtkUVg h = this.a("oldMinY", true, Double.TYPE);
    private final iReSqtkUVgkgTiReSqtkUVg i = this.a("oldPosY", true, Double.TYPE);
    private final iReSqtkUVgkgTiReSqtkUVg j = this.a("oldPosZ", true, Double.TYPE);
    private final iReSqtkUVgkgTiReSqtkUVg k = this.a("oldRotationYaw", true, Float.TYPE);
    private final iReSqtkUVgkgTiReSqtkUVg l = this.a("oldRotationPitch", true, Float.TYPE);
    private final iReSqtkUVgkgTiReSqtkUVg m = this.a("ticksSinceMovePacket", true, Integer.TYPE);
    private final iReSqtkUVgkgTiReSqtkUVg n = this.a("wasOnGround", true, Boolean.TYPE);
    public iReSqtkUVgYewiReSqtkUVg b;

    public iReSqtkUVgdgbiReSqtkUVg() {
        super(iReSqtkUVgSzRiReSqtkUVg.bR);
        this.c = this.a("sendChatMessage", true, Void.TYPE, String.class);
        this.b = this.a("sendMotionUpdates", true, Void.TYPE, new Class[0]);
    }

    private Object a(Object object) {
        return this.d.h(object);
    }

    private boolean b(Object object) {
        return this.e.a(object);
    }

    private void a(Object object, boolean bl) {
        this.e.a(object, bl);
    }

    private boolean c(Object object) {
        return this.f.a(object);
    }

    private void b(Object object, boolean bl) {
        this.f.a(object, bl);
    }

    private double d(Object object) {
        return this.g.g(object);
    }

    private void a(Object object, double d2) {
        this.g.a(object, d2);
    }

    private double e(Object object) {
        return this.h.g(object);
    }

    private void b(Object object, double d2) {
        this.h.a(object, d2);
    }

    private double f(Object object) {
        return this.i.g(object);
    }

    private void c(Object object, double d2) {
        this.i.a(object, d2);
    }

    private double g(Object object) {
        return this.j.g(object);
    }

    private void d(Object object, double d2) {
        this.j.a(object, d2);
    }

    private float h(Object object) {
        return this.k.f(object);
    }

    private void a(Object object, float f) {
        this.k.a(object, f);
    }

    private float i(Object object) {
        return this.l.f(object);
    }

    private void b(Object object, float f) {
        this.l.a(object, f);
    }

    private int j(Object object) {
        return this.m.d(object);
    }

    private void a(Object object, int n) {
        this.m.a(object, n);
    }

    private void c(Object object, boolean bl) {
        this.n.a(object, bl);
    }

    private void a(Object object, String string) {
        this.c.a(object, new Object[]{string});
    }

    static /* synthetic */ Object a(iReSqtkUVgdgbiReSqtkUVg iReSqtkUVgdgbiReSqtkUVg2, Object object) {
        return iReSqtkUVgdgbiReSqtkUVg2.a(object);
    }

    static /* synthetic */ boolean b(iReSqtkUVgdgbiReSqtkUVg iReSqtkUVgdgbiReSqtkUVg2, Object object) {
        return iReSqtkUVgdgbiReSqtkUVg2.b(object);
    }

    static /* synthetic */ void a(iReSqtkUVgdgbiReSqtkUVg iReSqtkUVgdgbiReSqtkUVg2, Object object, boolean bl) {
        iReSqtkUVgdgbiReSqtkUVg2.a(object, bl);
    }

    static /* synthetic */ boolean c(iReSqtkUVgdgbiReSqtkUVg iReSqtkUVgdgbiReSqtkUVg2, Object object) {
        return iReSqtkUVgdgbiReSqtkUVg2.c(object);
    }

    static /* synthetic */ void b(iReSqtkUVgdgbiReSqtkUVg iReSqtkUVgdgbiReSqtkUVg2, Object object, boolean bl) {
        iReSqtkUVgdgbiReSqtkUVg2.b(object, bl);
    }

    static /* synthetic */ double d(iReSqtkUVgdgbiReSqtkUVg iReSqtkUVgdgbiReSqtkUVg2, Object object) {
        return iReSqtkUVgdgbiReSqtkUVg2.d(object);
    }

    static /* synthetic */ void a(iReSqtkUVgdgbiReSqtkUVg iReSqtkUVgdgbiReSqtkUVg2, Object object, double d2) {
        iReSqtkUVgdgbiReSqtkUVg2.a(object, d2);
    }

    static /* synthetic */ double e(iReSqtkUVgdgbiReSqtkUVg iReSqtkUVgdgbiReSqtkUVg2, Object object) {
        return iReSqtkUVgdgbiReSqtkUVg2.e(object);
    }

    static /* synthetic */ void b(iReSqtkUVgdgbiReSqtkUVg iReSqtkUVgdgbiReSqtkUVg2, Object object, double d2) {
        iReSqtkUVgdgbiReSqtkUVg2.b(object, d2);
    }

    static /* synthetic */ double f(iReSqtkUVgdgbiReSqtkUVg iReSqtkUVgdgbiReSqtkUVg2, Object object) {
        return iReSqtkUVgdgbiReSqtkUVg2.f(object);
    }

    static /* synthetic */ void c(iReSqtkUVgdgbiReSqtkUVg iReSqtkUVgdgbiReSqtkUVg2, Object object, double d2) {
        iReSqtkUVgdgbiReSqtkUVg2.c(object, d2);
    }

    static /* synthetic */ double g(iReSqtkUVgdgbiReSqtkUVg iReSqtkUVgdgbiReSqtkUVg2, Object object) {
        return iReSqtkUVgdgbiReSqtkUVg2.g(object);
    }

    static /* synthetic */ void d(iReSqtkUVgdgbiReSqtkUVg iReSqtkUVgdgbiReSqtkUVg2, Object object, double d2) {
        iReSqtkUVgdgbiReSqtkUVg2.d(object, d2);
    }

    static /* synthetic */ float h(iReSqtkUVgdgbiReSqtkUVg iReSqtkUVgdgbiReSqtkUVg2, Object object) {
        return iReSqtkUVgdgbiReSqtkUVg2.h(object);
    }

    static /* synthetic */ void a(iReSqtkUVgdgbiReSqtkUVg iReSqtkUVgdgbiReSqtkUVg2, Object object, float f) {
        iReSqtkUVgdgbiReSqtkUVg2.a(object, f);
    }

    static /* synthetic */ float i(iReSqtkUVgdgbiReSqtkUVg iReSqtkUVgdgbiReSqtkUVg2, Object object) {
        return iReSqtkUVgdgbiReSqtkUVg2.i(object);
    }

    static /* synthetic */ void b(iReSqtkUVgdgbiReSqtkUVg iReSqtkUVgdgbiReSqtkUVg2, Object object, float f) {
        iReSqtkUVgdgbiReSqtkUVg2.b(object, f);
    }

    static /* synthetic */ int j(iReSqtkUVgdgbiReSqtkUVg iReSqtkUVgdgbiReSqtkUVg2, Object object) {
        return iReSqtkUVgdgbiReSqtkUVg2.j(object);
    }

    static /* synthetic */ void a(iReSqtkUVgdgbiReSqtkUVg iReSqtkUVgdgbiReSqtkUVg2, Object object, int n) {
        iReSqtkUVgdgbiReSqtkUVg2.a(object, n);
    }

    static /* synthetic */ void c(iReSqtkUVgdgbiReSqtkUVg iReSqtkUVgdgbiReSqtkUVg2, Object object, boolean bl) {
        iReSqtkUVgdgbiReSqtkUVg2.c(object, bl);
    }

    static /* synthetic */ void a(iReSqtkUVgdgbiReSqtkUVg iReSqtkUVgdgbiReSqtkUVg2, Object object, String string) {
        iReSqtkUVgdgbiReSqtkUVg2.a(object, string);
    }
}

