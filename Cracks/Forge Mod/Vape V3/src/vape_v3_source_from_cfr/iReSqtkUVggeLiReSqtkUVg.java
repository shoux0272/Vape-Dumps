/*
 * Decompiled with CFR 0.150.
 */
import java.util.Collection;

public class iReSqtkUVggeLiReSqtkUVg
extends iReSqtkUVgYJSiReSqtkUVg {
    private iReSqtkUVgYewiReSqtkUVg b;
    private iReSqtkUVgYewiReSqtkUVg c;
    private iReSqtkUVgYewiReSqtkUVg d;
    private iReSqtkUVgYewiReSqtkUVg e;
    private iReSqtkUVgYewiReSqtkUVg f;
    private iReSqtkUVgYewiReSqtkUVg g;
    private iReSqtkUVgYewiReSqtkUVg h;
    private iReSqtkUVgYewiReSqtkUVg i;
    private iReSqtkUVgYewiReSqtkUVg j;
    private iReSqtkUVgYewiReSqtkUVg k;
    private iReSqtkUVgYewiReSqtkUVg l;
    private iReSqtkUVgYewiReSqtkUVg m;
    private iReSqtkUVgYewiReSqtkUVg n;
    private iReSqtkUVgYewiReSqtkUVg o;
    private iReSqtkUVgYewiReSqtkUVg p;
    private iReSqtkUVgYewiReSqtkUVg q;
    private iReSqtkUVgYewiReSqtkUVg r;
    private iReSqtkUVgYewiReSqtkUVg s;
    private iReSqtkUVgYewiReSqtkUVg t;
    private final iReSqtkUVgkgTiReSqtkUVg u;
    private final iReSqtkUVgkgTiReSqtkUVg v;
    private final iReSqtkUVgkgTiReSqtkUVg w;
    private final iReSqtkUVgkgTiReSqtkUVg x;
    private final iReSqtkUVgkgTiReSqtkUVg y;
    private final iReSqtkUVgkgTiReSqtkUVg z;
    private final iReSqtkUVgkgTiReSqtkUVg A;
    private final iReSqtkUVgkgTiReSqtkUVg B;
    private final iReSqtkUVgkgTiReSqtkUVg C;
    private final iReSqtkUVgkgTiReSqtkUVg D = this.a("prevRenderYawOffset", true, Float.TYPE);
    private final iReSqtkUVgkgTiReSqtkUVg E = this.a("prevRotationYawHead", true, Float.TYPE);
    private final iReSqtkUVgkgTiReSqtkUVg F;
    private final iReSqtkUVgkgTiReSqtkUVg G;

    public iReSqtkUVggeLiReSqtkUVg() {
        super(iReSqtkUVgSzRiReSqtkUVg.n);
        this.u = this.a("moveForward", true, Float.TYPE);
        this.v = this.a("moveStrafing", true, Float.TYPE);
        if (iReSqtkUVgauSiReSqtkUVg.d() >= 23) {
            this.w = this.b("SPRINTING_SPEED_BOOST", true, iReSqtkUVgSzRiReSqtkUVg.ap);
            this.i = this.a("getHeldItemMainhand", true, iReSqtkUVgSzRiReSqtkUVg.v, new Class[0]);
            this.j = this.a("swingArm", true, Void.TYPE, iReSqtkUVgSzRiReSqtkUVg.cL);
            this.m = this.a("removePotionEffect", true, Void.TYPE, iReSqtkUVgSzRiReSqtkUVg.ac);
        } else {
            this.w = this.b("sprintingSpeedBoostModifier", true, iReSqtkUVgSzRiReSqtkUVg.ap);
            this.i = this.a("getHeldItem", true, iReSqtkUVgSzRiReSqtkUVg.v, new Class[0]);
            this.j = this.a("swingItem", true, Void.TYPE, new Class[0]);
            this.m = this.a("removePotionEffect", true, Void.TYPE, Integer.TYPE);
        }
        this.x = this.a("rotationYawHead", true, Float.TYPE);
        this.y = this.a("isSwingInProgress", true, Boolean.TYPE);
        this.F = this.a("deathTime", true, Integer.TYPE);
        this.b = this.a("getHealth", true, Float.TYPE, new Class[0]);
        this.d = this.a("getLook", true, iReSqtkUVgSzRiReSqtkUVg.ce, Float.TYPE);
        this.e = this.a("canEntityBeSeen", true, Boolean.TYPE, iReSqtkUVgSzRiReSqtkUVg.c);
        this.g = this.a("isPotionActive", true, Boolean.TYPE, iReSqtkUVgSzRiReSqtkUVg.ac);
        this.h = this.a("getActivePotionEffect", true, iReSqtkUVgSzRiReSqtkUVg.ad, iReSqtkUVgSzRiReSqtkUVg.ac);
        this.r = this.a("getActivePotionEffects", true, Collection.class, new Class[0]);
        this.t = this.a("getAttributeMap", true, iReSqtkUVgSzRiReSqtkUVg.cs, new Class[0]);
        this.s = this.a("updatePotionEffects", true, Void.TYPE, new Class[0]);
        this.k = this.a("getEntityAttribute", true, iReSqtkUVgSzRiReSqtkUVg.ao, iReSqtkUVgSzRiReSqtkUVg.aq);
        this.l = this.a("addPotionEffect", true, Void.TYPE, iReSqtkUVgSzRiReSqtkUVg.ad);
        this.n = this.a("isOnLadder", true, Boolean.TYPE, new Class[0]);
        this.o = this.a("getMaxHealth", true, Float.TYPE, new Class[0]);
        this.q = this.a("<init>", false, Void.TYPE, iReSqtkUVgSzRiReSqtkUVg.k);
        this.z = this.a("limbSwing", true, Float.TYPE);
        this.A = this.a("limbSwingAmount", true, Float.TYPE);
        this.B = this.a("prevLimbSwingAmount", true, Float.TYPE);
        this.C = this.a("renderYawOffset", true, Float.TYPE);
        this.G = this.a("jumpTicks", true, Integer.TYPE);
        if (iReSqtkUVgauSiReSqtkUVg.d() == 13) {
            this.c = this.a("getPosition", true, iReSqtkUVgSzRiReSqtkUVg.ce, Float.TYPE);
            this.f = this.a("rayTrace", true, iReSqtkUVgSzRiReSqtkUVg.cg, Double.TYPE, Float.TYPE);
        } else {
            this.c = new iReSqtkUVgYewiReSqtkUVg(iReSqtkUVgSzRiReSqtkUVg.c, "getPositionEyes", true, false, iReSqtkUVgSzRiReSqtkUVg.ce, Float.TYPE);
            this.f = new iReSqtkUVgYewiReSqtkUVg(iReSqtkUVgSzRiReSqtkUVg.c, "rayTrace", true, false, iReSqtkUVgSzRiReSqtkUVg.cg, Double.TYPE, Float.TYPE);
        }
    }

    private float c(Object object) {
        return this.b.g(object, new Object[0]);
    }

    private int d(Object object) {
        return this.F.d(object);
    }

    private void a(Object object, int n) {
        this.G.a(object, n);
    }

    public Object a(Object object, float f) {
        return this.c.j(object, Float.valueOf(f));
    }

    public Object b(Object object, float f) {
        return this.d.j(object, Float.valueOf(f));
    }

    public boolean a(Object object, Object object2) {
        return this.e.b(object, object2);
    }

    public Object a(Object object, double d2, float f) {
        return this.f.j(object, d2, Float.valueOf(f));
    }

    private boolean b(Object object, Object object2) {
        return this.g.b(object, object2);
    }

    private Object c(Object object, Object object2) {
        return this.h.j(object, object2);
    }

    private Object e(Object object) {
        return this.r.j(object, new Object[0]);
    }

    private float f(Object object) {
        return this.v.f(object);
    }

    private void c(Object object, float f) {
        this.v.a(object, f);
    }

    private float g(Object object) {
        return this.u.f(object);
    }

    private void d(Object object, float f) {
        this.u.a(object, f);
    }

    private Object h(Object object) {
        return this.i.j(object, new Object[0]);
    }

    private void i(Object object) {
        this.j.a(object, new Object[0]);
    }

    private void d(Object object, Object object2) {
        this.j.a(object, new Object[]{object2});
    }

    private Object e(Object object, Object object2) {
        return this.k.j(object, object2);
    }

    private Object j(Object object) {
        return this.t.j(object, new Object[0]);
    }

    private Object a() {
        return this.w.h(null);
    }

    private float k(Object object) {
        return this.x.f(object);
    }

    private void e(Object object, float f) {
        this.x.a(object, f);
    }

    public float a(Object object) {
        return this.D.f(object);
    }

    public float b(Object object) {
        return this.E.f(object);
    }

    private void f(Object object, Object object2) {
        this.l.a(object, new Object[]{object2});
    }

    private void b(Object object, int n) {
        this.m.a(object, new Object[]{n});
    }

    private void g(Object object, Object object2) {
        this.m.a(object, new Object[]{object2});
    }

    private void l(Object object) {
        this.s.a(object, new Object[0]);
    }

    private boolean m(Object object) {
        return this.y.a(object);
    }

    private boolean n(Object object) {
        return this.n.b(object, new Object[0]);
    }

    private float o(Object object) {
        return this.o.g(object, new Object[0]);
    }

    private float p(Object object) {
        return this.z.f(object);
    }

    private void f(Object object, float f) {
        this.z.a(object, f);
    }

    private float q(Object object) {
        return this.A.f(object);
    }

    private void g(Object object, float f) {
        this.A.a(object, f);
    }

    private float r(Object object) {
        return this.B.f(object);
    }

    private void h(Object object, float f) {
        this.B.a(object, f);
    }

    private float s(Object object) {
        return this.C.f(object);
    }

    private Object t(Object object) {
        return this.q.a(object);
    }

    static /* synthetic */ Object a(iReSqtkUVggeLiReSqtkUVg iReSqtkUVggeLiReSqtkUVg2) {
        return iReSqtkUVggeLiReSqtkUVg2.a();
    }

    static /* synthetic */ float a(iReSqtkUVggeLiReSqtkUVg iReSqtkUVggeLiReSqtkUVg2, Object object) {
        return iReSqtkUVggeLiReSqtkUVg2.c(object);
    }

    static /* synthetic */ int b(iReSqtkUVggeLiReSqtkUVg iReSqtkUVggeLiReSqtkUVg2, Object object) {
        return iReSqtkUVggeLiReSqtkUVg2.d(object);
    }

    static /* synthetic */ void a(iReSqtkUVggeLiReSqtkUVg iReSqtkUVggeLiReSqtkUVg2, Object object, int n) {
        iReSqtkUVggeLiReSqtkUVg2.a(object, n);
    }

    static /* synthetic */ boolean a(iReSqtkUVggeLiReSqtkUVg iReSqtkUVggeLiReSqtkUVg2, Object object, Object object2) {
        return iReSqtkUVggeLiReSqtkUVg2.b(object, object2);
    }

    static /* synthetic */ Object b(iReSqtkUVggeLiReSqtkUVg iReSqtkUVggeLiReSqtkUVg2, Object object, Object object2) {
        return iReSqtkUVggeLiReSqtkUVg2.c(object, object2);
    }

    static /* synthetic */ float c(iReSqtkUVggeLiReSqtkUVg iReSqtkUVggeLiReSqtkUVg2, Object object) {
        return iReSqtkUVggeLiReSqtkUVg2.f(object);
    }

    static /* synthetic */ void a(iReSqtkUVggeLiReSqtkUVg iReSqtkUVggeLiReSqtkUVg2, Object object, float f) {
        iReSqtkUVggeLiReSqtkUVg2.c(object, f);
    }

    static /* synthetic */ float d(iReSqtkUVggeLiReSqtkUVg iReSqtkUVggeLiReSqtkUVg2, Object object) {
        return iReSqtkUVggeLiReSqtkUVg2.g(object);
    }

    static /* synthetic */ void b(iReSqtkUVggeLiReSqtkUVg iReSqtkUVggeLiReSqtkUVg2, Object object, float f) {
        iReSqtkUVggeLiReSqtkUVg2.d(object, f);
    }

    static /* synthetic */ Object e(iReSqtkUVggeLiReSqtkUVg iReSqtkUVggeLiReSqtkUVg2, Object object) {
        return iReSqtkUVggeLiReSqtkUVg2.h(object);
    }

    static /* synthetic */ void c(iReSqtkUVggeLiReSqtkUVg iReSqtkUVggeLiReSqtkUVg2, Object object, Object object2) {
        iReSqtkUVggeLiReSqtkUVg2.d(object, object2);
    }

    static /* synthetic */ void f(iReSqtkUVggeLiReSqtkUVg iReSqtkUVggeLiReSqtkUVg2, Object object) {
        iReSqtkUVggeLiReSqtkUVg2.i(object);
    }

    static /* synthetic */ Object d(iReSqtkUVggeLiReSqtkUVg iReSqtkUVggeLiReSqtkUVg2, Object object, Object object2) {
        return iReSqtkUVggeLiReSqtkUVg2.e(object, object2);
    }

    static /* synthetic */ Object g(iReSqtkUVggeLiReSqtkUVg iReSqtkUVggeLiReSqtkUVg2, Object object) {
        return iReSqtkUVggeLiReSqtkUVg2.j(object);
    }

    static /* synthetic */ void c(iReSqtkUVggeLiReSqtkUVg iReSqtkUVggeLiReSqtkUVg2, Object object, float f) {
        iReSqtkUVggeLiReSqtkUVg2.e(object, f);
    }

    static /* synthetic */ float h(iReSqtkUVggeLiReSqtkUVg iReSqtkUVggeLiReSqtkUVg2, Object object) {
        return iReSqtkUVggeLiReSqtkUVg2.k(object);
    }

    static /* synthetic */ void e(iReSqtkUVggeLiReSqtkUVg iReSqtkUVggeLiReSqtkUVg2, Object object, Object object2) {
        iReSqtkUVggeLiReSqtkUVg2.f(object, object2);
    }

    static /* synthetic */ void f(iReSqtkUVggeLiReSqtkUVg iReSqtkUVggeLiReSqtkUVg2, Object object, Object object2) {
        iReSqtkUVggeLiReSqtkUVg2.g(object, object2);
    }

    static /* synthetic */ void b(iReSqtkUVggeLiReSqtkUVg iReSqtkUVggeLiReSqtkUVg2, Object object, int n) {
        iReSqtkUVggeLiReSqtkUVg2.b(object, n);
    }

    static /* synthetic */ boolean i(iReSqtkUVggeLiReSqtkUVg iReSqtkUVggeLiReSqtkUVg2, Object object) {
        return iReSqtkUVggeLiReSqtkUVg2.m(object);
    }

    static /* synthetic */ boolean j(iReSqtkUVggeLiReSqtkUVg iReSqtkUVggeLiReSqtkUVg2, Object object) {
        return iReSqtkUVggeLiReSqtkUVg2.n(object);
    }

    static /* synthetic */ float k(iReSqtkUVggeLiReSqtkUVg iReSqtkUVggeLiReSqtkUVg2, Object object) {
        return iReSqtkUVggeLiReSqtkUVg2.o(object);
    }

    static /* synthetic */ float l(iReSqtkUVggeLiReSqtkUVg iReSqtkUVggeLiReSqtkUVg2, Object object) {
        return iReSqtkUVggeLiReSqtkUVg2.p(object);
    }

    static /* synthetic */ void d(iReSqtkUVggeLiReSqtkUVg iReSqtkUVggeLiReSqtkUVg2, Object object, float f) {
        iReSqtkUVggeLiReSqtkUVg2.f(object, f);
    }

    static /* synthetic */ float m(iReSqtkUVggeLiReSqtkUVg iReSqtkUVggeLiReSqtkUVg2, Object object) {
        return iReSqtkUVggeLiReSqtkUVg2.q(object);
    }

    static /* synthetic */ void e(iReSqtkUVggeLiReSqtkUVg iReSqtkUVggeLiReSqtkUVg2, Object object, float f) {
        iReSqtkUVggeLiReSqtkUVg2.g(object, f);
    }

    static /* synthetic */ float n(iReSqtkUVggeLiReSqtkUVg iReSqtkUVggeLiReSqtkUVg2, Object object) {
        return iReSqtkUVggeLiReSqtkUVg2.r(object);
    }

    static /* synthetic */ void f(iReSqtkUVggeLiReSqtkUVg iReSqtkUVggeLiReSqtkUVg2, Object object, float f) {
        iReSqtkUVggeLiReSqtkUVg2.h(object, f);
    }

    static /* synthetic */ float o(iReSqtkUVggeLiReSqtkUVg iReSqtkUVggeLiReSqtkUVg2, Object object) {
        return iReSqtkUVggeLiReSqtkUVg2.s(object);
    }

    static /* synthetic */ Object p(iReSqtkUVggeLiReSqtkUVg iReSqtkUVggeLiReSqtkUVg2, Object object) {
        return iReSqtkUVggeLiReSqtkUVg2.t(object);
    }

    static /* synthetic */ Object q(iReSqtkUVggeLiReSqtkUVg iReSqtkUVggeLiReSqtkUVg2, Object object) {
        return iReSqtkUVggeLiReSqtkUVg2.e(object);
    }
}

