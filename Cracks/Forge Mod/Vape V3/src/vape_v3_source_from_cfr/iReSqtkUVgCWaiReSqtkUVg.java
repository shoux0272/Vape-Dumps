/*
 * Decompiled with CFR 0.150.
 */
public class iReSqtkUVgCWaiReSqtkUVg
extends iReSqtkUVgYJSiReSqtkUVg {
    private final iReSqtkUVgkgTiReSqtkUVg b = this.a("keyBindAttack", true, iReSqtkUVgSzRiReSqtkUVg.j);
    private final iReSqtkUVgkgTiReSqtkUVg c = this.a("keyBindUseItem", true, iReSqtkUVgSzRiReSqtkUVg.j);
    private final iReSqtkUVgkgTiReSqtkUVg d = this.a("guiScale", true, Integer.TYPE);
    private final iReSqtkUVgkgTiReSqtkUVg e = this.a("keyBindInventory", true, iReSqtkUVgSzRiReSqtkUVg.j);
    private final iReSqtkUVgkgTiReSqtkUVg f = this.a("viewBobbing", true, Boolean.TYPE);
    private final iReSqtkUVgkgTiReSqtkUVg g;
    private final iReSqtkUVgkgTiReSqtkUVg h;
    private final iReSqtkUVgkgTiReSqtkUVg i;
    private final iReSqtkUVgkgTiReSqtkUVg j;
    private final iReSqtkUVgkgTiReSqtkUVg k;
    private final iReSqtkUVgkgTiReSqtkUVg l;
    private final iReSqtkUVgkgTiReSqtkUVg m;
    private final iReSqtkUVgkgTiReSqtkUVg n;
    private final iReSqtkUVgkgTiReSqtkUVg o;
    private final iReSqtkUVgkgTiReSqtkUVg p;
    private final iReSqtkUVgkgTiReSqtkUVg q;
    private final iReSqtkUVgkgTiReSqtkUVg r;
    private final iReSqtkUVgkgTiReSqtkUVg s;
    private iReSqtkUVgkgTiReSqtkUVg t = this.a("ofFastRender", false, Boolean.TYPE);
    private iReSqtkUVgkgTiReSqtkUVg u;
    private iReSqtkUVgkgTiReSqtkUVg v;

    public iReSqtkUVgCWaiReSqtkUVg() {
        super(iReSqtkUVgSzRiReSqtkUVg.i);
        this.n = this.a("gammaSetting", true, Float.TYPE);
        this.v = this.a("ofAaLevel", true, Integer.TYPE);
        this.s = this.a("fboEnable", true, Boolean.TYPE);
        this.g = this.a("keyBindForward", true, iReSqtkUVgSzRiReSqtkUVg.j);
        this.h = this.a("keyBindBack", true, iReSqtkUVgSzRiReSqtkUVg.j);
        this.i = this.a("keyBindLeft", true, iReSqtkUVgSzRiReSqtkUVg.j);
        this.j = this.a("keyBindRight", true, iReSqtkUVgSzRiReSqtkUVg.j);
        this.k = this.a("keyBindJump", true, iReSqtkUVgSzRiReSqtkUVg.j);
        this.l = this.a("keyBindSneak", true, iReSqtkUVgSzRiReSqtkUVg.j);
        this.o = this.a("keyBindSprint", true, iReSqtkUVgSzRiReSqtkUVg.j);
        this.p = this.a("keyBindDrop", true, iReSqtkUVgSzRiReSqtkUVg.j);
        this.r = this.a("hideGUI", true, Boolean.TYPE);
        this.u = this.a("thirdPersonView", true, Integer.TYPE);
        this.q = this.a("mouseSensitivity", true, Float.TYPE);
        this.m = iReSqtkUVgauSiReSqtkUVg.d() > 13 ? this.a("clouds", true, Integer.TYPE) : this.a("clouds", true, Boolean.TYPE);
    }

    private Object a(Object object) {
        return this.b.h(object);
    }

    private Object b(Object object) {
        return this.c.h(object);
    }

    private Object c(Object object) {
        return this.g.h(object);
    }

    private Object d(Object object) {
        return this.h.h(object);
    }

    private Object e(Object object) {
        return this.i.h(object);
    }

    private Object f(Object object) {
        return this.j.h(object);
    }

    private Object g(Object object) {
        return this.k.h(object);
    }

    private Object h(Object object) {
        return this.l.h(object);
    }

    private Object i(Object object) {
        return this.o.h(object);
    }

    private Object j(Object object) {
        return this.p.h(object);
    }

    private int k(Object object) {
        return this.d.d(object);
    }

    private void a(Object object, int n) {
        this.d.a(object, n);
    }

    private Object l(Object object) {
        return this.e.h(object);
    }

    private boolean m(Object object) {
        return this.f.a(object);
    }

    private void a(Object object, boolean bl) {
        this.f.a(object, bl);
    }

    private boolean n(Object object) {
        if (this.t.a()) {
            return false;
        }
        return this.t.a(object);
    }

    private void b(Object object, boolean bl) {
        if (this.t.a()) {
            return;
        }
        this.t.a(object, bl);
    }

    private int o(Object object) {
        if (this.v.a()) {
            return 0;
        }
        return this.v.d(object);
    }

    private void c(Object object, boolean bl) {
        this.m.a(object, bl);
    }

    private boolean p(Object object) {
        return this.m.a(object);
    }

    private void b(Object object, int n) {
        this.m.a(object, n);
    }

    private int q(Object object) {
        return this.m.d(object);
    }

    private float r(Object object) {
        return this.n.f(object);
    }

    private void a(Object object, float f) {
        this.n.a(object, f);
    }

    private boolean s(Object object) {
        return this.r.a(object);
    }

    private void d(Object object, boolean bl) {
        this.r.a(object, bl);
    }

    private int t(Object object) {
        return this.u.d(object);
    }

    private void c(Object object, int n) {
        this.u.a(object, n);
    }

    private float u(Object object) {
        return this.q.f(object);
    }

    private boolean v(Object object) {
        return this.s.a(object);
    }

    static /* synthetic */ Object a(iReSqtkUVgCWaiReSqtkUVg iReSqtkUVgCWaiReSqtkUVg2, Object object) {
        return iReSqtkUVgCWaiReSqtkUVg2.a(object);
    }

    static /* synthetic */ Object b(iReSqtkUVgCWaiReSqtkUVg iReSqtkUVgCWaiReSqtkUVg2, Object object) {
        return iReSqtkUVgCWaiReSqtkUVg2.b(object);
    }

    static /* synthetic */ Object c(iReSqtkUVgCWaiReSqtkUVg iReSqtkUVgCWaiReSqtkUVg2, Object object) {
        return iReSqtkUVgCWaiReSqtkUVg2.l(object);
    }

    static /* synthetic */ Object d(iReSqtkUVgCWaiReSqtkUVg iReSqtkUVgCWaiReSqtkUVg2, Object object) {
        return iReSqtkUVgCWaiReSqtkUVg2.c(object);
    }

    static /* synthetic */ Object e(iReSqtkUVgCWaiReSqtkUVg iReSqtkUVgCWaiReSqtkUVg2, Object object) {
        return iReSqtkUVgCWaiReSqtkUVg2.d(object);
    }

    static /* synthetic */ Object f(iReSqtkUVgCWaiReSqtkUVg iReSqtkUVgCWaiReSqtkUVg2, Object object) {
        return iReSqtkUVgCWaiReSqtkUVg2.e(object);
    }

    static /* synthetic */ Object g(iReSqtkUVgCWaiReSqtkUVg iReSqtkUVgCWaiReSqtkUVg2, Object object) {
        return iReSqtkUVgCWaiReSqtkUVg2.f(object);
    }

    static /* synthetic */ Object h(iReSqtkUVgCWaiReSqtkUVg iReSqtkUVgCWaiReSqtkUVg2, Object object) {
        return iReSqtkUVgCWaiReSqtkUVg2.g(object);
    }

    static /* synthetic */ Object i(iReSqtkUVgCWaiReSqtkUVg iReSqtkUVgCWaiReSqtkUVg2, Object object) {
        return iReSqtkUVgCWaiReSqtkUVg2.h(object);
    }

    static /* synthetic */ int j(iReSqtkUVgCWaiReSqtkUVg iReSqtkUVgCWaiReSqtkUVg2, Object object) {
        return iReSqtkUVgCWaiReSqtkUVg2.k(object);
    }

    static /* synthetic */ boolean k(iReSqtkUVgCWaiReSqtkUVg iReSqtkUVgCWaiReSqtkUVg2, Object object) {
        return iReSqtkUVgCWaiReSqtkUVg2.m(object);
    }

    static /* synthetic */ void a(iReSqtkUVgCWaiReSqtkUVg iReSqtkUVgCWaiReSqtkUVg2, Object object, boolean bl) {
        iReSqtkUVgCWaiReSqtkUVg2.a(object, bl);
    }

    static /* synthetic */ boolean l(iReSqtkUVgCWaiReSqtkUVg iReSqtkUVgCWaiReSqtkUVg2, Object object) {
        return iReSqtkUVgCWaiReSqtkUVg2.n(object);
    }

    static /* synthetic */ void b(iReSqtkUVgCWaiReSqtkUVg iReSqtkUVgCWaiReSqtkUVg2, Object object, boolean bl) {
        iReSqtkUVgCWaiReSqtkUVg2.b(object, bl);
    }

    static /* synthetic */ int m(iReSqtkUVgCWaiReSqtkUVg iReSqtkUVgCWaiReSqtkUVg2, Object object) {
        return iReSqtkUVgCWaiReSqtkUVg2.q(object);
    }

    static /* synthetic */ boolean n(iReSqtkUVgCWaiReSqtkUVg iReSqtkUVgCWaiReSqtkUVg2, Object object) {
        return iReSqtkUVgCWaiReSqtkUVg2.p(object);
    }

    static /* synthetic */ void a(iReSqtkUVgCWaiReSqtkUVg iReSqtkUVgCWaiReSqtkUVg2, Object object, int n) {
        iReSqtkUVgCWaiReSqtkUVg2.b(object, n);
    }

    static /* synthetic */ void c(iReSqtkUVgCWaiReSqtkUVg iReSqtkUVgCWaiReSqtkUVg2, Object object, boolean bl) {
        iReSqtkUVgCWaiReSqtkUVg2.c(object, bl);
    }

    static /* synthetic */ float o(iReSqtkUVgCWaiReSqtkUVg iReSqtkUVgCWaiReSqtkUVg2, Object object) {
        return iReSqtkUVgCWaiReSqtkUVg2.r(object);
    }

    static /* synthetic */ void a(iReSqtkUVgCWaiReSqtkUVg iReSqtkUVgCWaiReSqtkUVg2, Object object, float f) {
        iReSqtkUVgCWaiReSqtkUVg2.a(object, f);
    }

    static /* synthetic */ Object p(iReSqtkUVgCWaiReSqtkUVg iReSqtkUVgCWaiReSqtkUVg2, Object object) {
        return iReSqtkUVgCWaiReSqtkUVg2.i(object);
    }

    static /* synthetic */ Object q(iReSqtkUVgCWaiReSqtkUVg iReSqtkUVgCWaiReSqtkUVg2, Object object) {
        return iReSqtkUVgCWaiReSqtkUVg2.j(object);
    }

    static /* synthetic */ void b(iReSqtkUVgCWaiReSqtkUVg iReSqtkUVgCWaiReSqtkUVg2, Object object, int n) {
        iReSqtkUVgCWaiReSqtkUVg2.a(object, n);
    }

    static /* synthetic */ boolean r(iReSqtkUVgCWaiReSqtkUVg iReSqtkUVgCWaiReSqtkUVg2, Object object) {
        return iReSqtkUVgCWaiReSqtkUVg2.s(object);
    }

    static /* synthetic */ void d(iReSqtkUVgCWaiReSqtkUVg iReSqtkUVgCWaiReSqtkUVg2, Object object, boolean bl) {
        iReSqtkUVgCWaiReSqtkUVg2.d(object, bl);
    }

    static /* synthetic */ int s(iReSqtkUVgCWaiReSqtkUVg iReSqtkUVgCWaiReSqtkUVg2, Object object) {
        return iReSqtkUVgCWaiReSqtkUVg2.t(object);
    }

    static /* synthetic */ void c(iReSqtkUVgCWaiReSqtkUVg iReSqtkUVgCWaiReSqtkUVg2, Object object, int n) {
        iReSqtkUVgCWaiReSqtkUVg2.c(object, n);
    }

    static /* synthetic */ float t(iReSqtkUVgCWaiReSqtkUVg iReSqtkUVgCWaiReSqtkUVg2, Object object) {
        return iReSqtkUVgCWaiReSqtkUVg2.u(object);
    }

    static /* synthetic */ int u(iReSqtkUVgCWaiReSqtkUVg iReSqtkUVgCWaiReSqtkUVg2, Object object) {
        return iReSqtkUVgCWaiReSqtkUVg2.o(object);
    }

    static /* synthetic */ boolean v(iReSqtkUVgCWaiReSqtkUVg iReSqtkUVgCWaiReSqtkUVg2, Object object) {
        return iReSqtkUVgCWaiReSqtkUVg2.v(object);
    }
}

