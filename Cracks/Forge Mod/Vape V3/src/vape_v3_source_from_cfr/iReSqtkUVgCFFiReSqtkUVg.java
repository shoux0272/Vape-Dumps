/*
 * Decompiled with CFR 0.150.
 */
import a.a;

public class iReSqtkUVgCFFiReSqtkUVg
extends iReSqtkUVgYJSiReSqtkUVg {
    private final iReSqtkUVgYewiReSqtkUVg b;
    private final iReSqtkUVgYewiReSqtkUVg c;
    private final iReSqtkUVgYewiReSqtkUVg d;
    private final iReSqtkUVgYewiReSqtkUVg e;
    private final iReSqtkUVgYewiReSqtkUVg f;
    private final iReSqtkUVgYewiReSqtkUVg g;
    private final iReSqtkUVgYewiReSqtkUVg h;
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
    private final iReSqtkUVgkgTiReSqtkUVg t;
    private final iReSqtkUVgkgTiReSqtkUVg u;
    private final iReSqtkUVgkgTiReSqtkUVg v;
    private final iReSqtkUVgkgTiReSqtkUVg w;
    private final iReSqtkUVgkgTiReSqtkUVg x;
    private iReSqtkUVgkgTiReSqtkUVg y;
    private iReSqtkUVgkgTiReSqtkUVg z;
    private iReSqtkUVgkgTiReSqtkUVg A;
    private iReSqtkUVgkgTiReSqtkUVg B;

    public iReSqtkUVgCFFiReSqtkUVg() {
        super(iReSqtkUVgSzRiReSqtkUVg.b);
        if (iReSqtkUVgauSiReSqtkUVg.d() == 13) {
            this.i = this.a("thePlayer", true, a.a.gc("net/minecraft/client/entity/EntityClientPlayerMP"));
            this.l = this.a("fontRenderer", true, iReSqtkUVgSzRiReSqtkUVg.o);
        } else {
            this.i = iReSqtkUVgauSiReSqtkUVg.d() >= 23 ? this.a("player", true, iReSqtkUVgSzRiReSqtkUVg.e) : this.a("thePlayer", true, iReSqtkUVgSzRiReSqtkUVg.e);
            this.l = this.a("fontRendererObj", true, iReSqtkUVgSzRiReSqtkUVg.o);
            this.y = this.a("renderManager", true, iReSqtkUVgSzRiReSqtkUVg.C);
            this.z = this.a("renderItem", true, iReSqtkUVgSzRiReSqtkUVg.cq);
        }
        this.k = iReSqtkUVgauSiReSqtkUVg.d() >= 23 ? this.a("world", true, iReSqtkUVgSzRiReSqtkUVg.m) : this.a("theWorld", true, iReSqtkUVgSzRiReSqtkUVg.m);
        this.B = this.a("inGameHasFocus", true, Boolean.TYPE);
        this.j = this.a("currentScreen", true, iReSqtkUVgSzRiReSqtkUVg.f);
        this.m = this.a("gameSettings", true, iReSqtkUVgSzRiReSqtkUVg.i);
        this.n = this.a("renderViewEntity", true, iReSqtkUVgauSiReSqtkUVg.d() == 13 ? iReSqtkUVgSzRiReSqtkUVg.n : iReSqtkUVgSzRiReSqtkUVg.c);
        this.o = this.a("playerController", true, iReSqtkUVgSzRiReSqtkUVg.q);
        this.p = this.a("objectMouseOver", true, iReSqtkUVgSzRiReSqtkUVg.cg);
        this.q = this.a("pointedEntity", true, iReSqtkUVgSzRiReSqtkUVg.c);
        this.r = this.a("entityRenderer", true, iReSqtkUVgSzRiReSqtkUVg.r);
        this.s = this.a("displayHeight", true, Integer.TYPE);
        this.t = this.a("displayWidth", true, Integer.TYPE);
        this.u = this.a("timer", true, iReSqtkUVgSzRiReSqtkUVg.am);
        this.v = this.a("renderGlobal", true, iReSqtkUVgSzRiReSqtkUVg.aw);
        this.w = this.a("rightClickDelayTimer", true, Integer.TYPE);
        this.x = this.a("mouseHelper", true, iReSqtkUVgSzRiReSqtkUVg.bh);
        if (iReSqtkUVgauSiReSqtkUVg.d() <= 15) {
            this.A = this.a("effectRenderer", true, iReSqtkUVgSzRiReSqtkUVg.cU);
        }
        this.b = this.b("getMinecraft", true, iReSqtkUVgSzRiReSqtkUVg.b, new Class[0]);
        this.c = this.a("shutdown", true, Void.TYPE, new Class[0]);
        this.d = this.a("displayGuiScreen", true, Void.TYPE, iReSqtkUVgSzRiReSqtkUVg.f);
        this.e = this.a("setIngameFocus", true, Void.TYPE, new Class[0]);
        this.f = this.a("getTextureManager", true, iReSqtkUVgSzRiReSqtkUVg.P, new Class[0]);
        this.g = this.a("getFramebuffer", true, iReSqtkUVgSzRiReSqtkUVg.R, new Class[0]);
        this.h = this.b("getSystemTime", true, Long.TYPE, new Class[0]);
    }

    public Object a() {
        return this.b.j(null, new Object[0]);
    }

    public Object a(Object object) {
        return this.i.h(object);
    }

    public void b(Object object) {
        this.c.a(object, new Object[0]);
    }

    public Object c(Object object) {
        return this.j.h(object);
    }

    public void a(Object object, Object object2) {
        this.j.a(object, object2);
    }

    public Object d(Object object) {
        return this.k.h(object);
    }

    public void b(Object object, Object object2) {
        this.d.a(object, new Object[]{object2});
    }

    public Object e(Object object) {
        return this.l.h(object);
    }

    public Object f(Object object) {
        return this.m.h(object);
    }

    public Object g(Object object) {
        return this.n.h(object);
    }

    public void c(Object object, Object object2) {
        this.n.a(object, object2);
    }

    public Object h(Object object) {
        return this.o.h(object);
    }

    public Object i(Object object) {
        return this.p.h(object);
    }

    public void d(Object object, Object object2) {
        this.p.a(object, object2);
    }

    public Object j(Object object) {
        return this.q.h(object);
    }

    public void e(Object object, Object object2) {
        this.q.a(object, object2);
    }

    public Object k(Object object) {
        return this.r.h(object);
    }

    public int l(Object object) {
        return this.t.d(object);
    }

    public int m(Object object) {
        return this.s.d(object);
    }

    public void a(Object object, int n) {
        this.t.a(object, n);
    }

    public void b(Object object, int n) {
        this.s.a(object, n);
    }

    public Object n(Object object) {
        return this.y.h(object);
    }

    public void o(Object object) {
        this.e.a(object, new Object[0]);
    }

    public boolean p(Object object) {
        return this.e.b(object, new Object[0]);
    }

    public Object q(Object object) {
        return this.f.j(object, new Object[0]);
    }

    public Object r(Object object) {
        return this.g.j(object, new Object[0]);
    }

    private Object t(Object object) {
        return this.z.h(object);
    }

    private Object u(Object object) {
        return this.u.h(object);
    }

    private Object v(Object object) {
        return this.v.h(object);
    }

    private int w(Object object) {
        return this.w.d(object);
    }

    private void c(Object object, int n) {
        this.w.a(object, n);
    }

    private long b() {
        return this.h.f(null, new Object[0]);
    }

    private Object x(Object object) {
        return this.x.h(object);
    }

    public boolean s(Object object) {
        return this.B.a(object);
    }

    private Object y(Object object) {
        return this.A.h(object);
    }

    static /* synthetic */ Object a(iReSqtkUVgCFFiReSqtkUVg iReSqtkUVgCFFiReSqtkUVg2, Object object) {
        return iReSqtkUVgCFFiReSqtkUVg2.t(object);
    }

    static /* synthetic */ Object b(iReSqtkUVgCFFiReSqtkUVg iReSqtkUVgCFFiReSqtkUVg2, Object object) {
        return iReSqtkUVgCFFiReSqtkUVg2.v(object);
    }

    static /* synthetic */ int c(iReSqtkUVgCFFiReSqtkUVg iReSqtkUVgCFFiReSqtkUVg2, Object object) {
        return iReSqtkUVgCFFiReSqtkUVg2.w(object);
    }

    static /* synthetic */ void a(iReSqtkUVgCFFiReSqtkUVg iReSqtkUVgCFFiReSqtkUVg2, Object object, int n) {
        iReSqtkUVgCFFiReSqtkUVg2.c(object, n);
    }

    static /* synthetic */ Object d(iReSqtkUVgCFFiReSqtkUVg iReSqtkUVgCFFiReSqtkUVg2, Object object) {
        return iReSqtkUVgCFFiReSqtkUVg2.u(object);
    }

    static /* synthetic */ long a(iReSqtkUVgCFFiReSqtkUVg iReSqtkUVgCFFiReSqtkUVg2) {
        return iReSqtkUVgCFFiReSqtkUVg2.b();
    }

    static /* synthetic */ Object e(iReSqtkUVgCFFiReSqtkUVg iReSqtkUVgCFFiReSqtkUVg2, Object object) {
        return iReSqtkUVgCFFiReSqtkUVg2.x(object);
    }

    static /* synthetic */ Object f(iReSqtkUVgCFFiReSqtkUVg iReSqtkUVgCFFiReSqtkUVg2, Object object) {
        return iReSqtkUVgCFFiReSqtkUVg2.y(object);
    }
}

