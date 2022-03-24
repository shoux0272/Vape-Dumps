/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.A5;
import manthe.BG;
import manthe.V;
import manthe.bP;
import manthe.cy;
import manthe.gJ;

public class h5
extends gJ {
    private final bP p;
    private final bP d;
    private final bP e;
    private final bP n;
    private final bP x;
    private final bP l;
    private final bP M;
    private final bP f;
    public final bP P;
    private final BG B;
    private final BG z;
    private final BG K;
    private final BG A;
    private final BG D;
    private final BG H;
    private final BG a;
    private final BG q;
    private final BG s;
    private final BG t;
    private final BG C;
    private final BG j;
    private final BG y;
    private final BG r;
    private final BG N;
    private final BG o;
    private final BG w;
    private final BG u;
    private final BG O;
    private final BG G;
    private final BG I;
    private final BG L;
    public bP k;
    public bP i;
    public bP h;
    public bP E;
    private BG m;
    private BG J;
    private BG F;
    private BG v;
    private static String[] g;

    public h5() {
        super(A5.d0);
        if (V.c() == 13) {
            this.B = this.b("thePlayer", true, A5.cv);
            this.A = this.b("fontRenderer", true, A5.l);
        } else {
            this.B = V.c() >= 23 ? this.b("player", true, A5.u) : this.b("thePlayer", true, A5.u);
            this.A = this.b("fontRendererObj", true, A5.l);
            this.J = this.b("renderManager", true, A5.a);
            this.F = this.b("renderItem", true, A5.ax);
            this.m = this.b("leftClickCounter", true, Integer.TYPE);
        }
        this.K = V.c() >= 23 ? this.b("world", true, A5.b6) : this.b("theWorld", true, A5.b6);
        this.O = this.a("debugFPS", true, Integer.TYPE);
        this.I = this.b("inGameHasFocus", true, Boolean.TYPE);
        this.z = this.b("currentScreen", true, A5.aE);
        this.D = this.b("gameSettings", true, A5.dr);
        this.H = this.b("renderViewEntity", true, V.c() == 13 ? A5.cF : A5.ba);
        this.a = this.b("playerController", true, A5.aZ);
        this.q = this.b("objectMouseOver", true, A5.cH);
        this.s = this.b("pointedEntity", true, A5.ba);
        this.t = this.b("entityRenderer", true, A5.a9);
        this.C = this.b("displayHeight", true, Integer.TYPE);
        this.j = this.b("displayWidth", true, Integer.TYPE);
        this.y = this.b("timer", true, A5.dq);
        this.r = this.b("renderGlobal", true, A5.dp);
        this.N = this.b("rightClickDelayTimer", true, Integer.TYPE);
        this.o = this.b("mouseHelper", true, A5.q);
        this.w = this.b("session", true, A5.bu);
        this.u = this.b("ingameGUI", true, A5.ac);
        this.L = this.b("myNetworkManager", true, A5.aU);
        if (V.c() <= 15) {
            this.v = this.b("effectRenderer", true, A5.K);
        }
        this.G = this.b("currentServerData", true, A5.D);
        this.p = this.b("getMinecraft", true, A5.d0, new Class[0]);
        this.d = this.a("shutdown", true, Void.TYPE, new Class[0]);
        this.h = this.a("displayGuiScreen", true, Void.TYPE, A5.aE);
        this.e = this.a("setIngameFocus", true, Void.TYPE, new Class[0]);
        this.n = this.a("getTextureManager", true, A5.ai, new Class[0]);
        this.x = this.a("getFramebuffer", true, A5.g, new Class[0]);
        this.l = this.b("getSystemTime", true, Long.TYPE, new Class[0]);
        this.k = this.a("runTick", true, Void.TYPE, new Class[0]);
        this.i = this.a("func_147116_af", cy.c, Void.TYPE, new Class[0]);
        this.E = this.a("isSingleplayer", true, Boolean.TYPE, new Class[0]);
        this.M = this.a("getIntegratedServer", true, A5.dM, new Class[0]);
        this.f = this.a("getNetHandler", true, A5.dV, new Class[0]);
        this.P = this.a("func_147121_ag", cy.c, Void.TYPE, new Class[0]);
    }

    public Object x(Object object) {
        return this.u.f(object);
    }

    public int g() {
        return this.O.c(null);
    }

    public Object f() {
        return this.p.e(null, new Object[0]);
    }

    public Object l(Object object) {
        return this.f.e(object, new Object[0]);
    }

    public Object y(Object object) {
        return this.M.e(object, new Object[0]);
    }

    public Object o(Object object) {
        return this.G.f(object);
    }

    public Object k(Object object) {
        return this.B.f(object);
    }

    public void t(Object object) {
        this.d.p(object, new Object[0]);
    }

    public Object F(Object object) {
        return this.z.f(object);
    }

    public void c(Object object, Object object2) {
        this.z.a(object, object2);
    }

    public Object s(Object object) {
        return this.K.f(object);
    }

    public void e(Object object, Object object2) {
        this.h.p(object, object2);
    }

    public Object G(Object object) {
        return this.A.f(object);
    }

    public Object i(Object object) {
        return this.D.f(object);
    }

    public Object c(Object object) {
        return this.H.f(object);
    }

    public void f(Object object, Object object2) {
        this.H.a(object, object2);
    }

    public Object e(Object object) {
        return this.a.f(object);
    }

    public Object m(Object object) {
        return this.q.f(object);
    }

    public void d(Object object, Object object2) {
        this.q.a(object, object2);
    }

    public Object E(Object object) {
        return this.s.f(object);
    }

    public void b(Object object, Object object2) {
        this.s.a(object, object2);
    }

    public Object b(Object object) {
        return this.t.f(object);
    }

    public int q(Object object) {
        return this.j.c(object);
    }

    public int d(Object object) {
        return this.C.c(object);
    }

    public void c(Object object, int n6) {
        this.j.a(object, n6);
    }

    public void b(Object object, int n6) {
        this.C.a(object, n6);
    }

    public Object r(Object object) {
        return this.J.f(object);
    }

    public void B(Object object) {
        this.e.p(object, new Object[0]);
    }

    public boolean u(Object object) {
        return this.I.d(object);
    }

    public Object w(Object object) {
        return this.n.e(object, new Object[0]);
    }

    public Object C(Object object) {
        return this.x.e(object, new Object[0]);
    }

    private Object v(Object object) {
        return this.F.f(object);
    }

    private Object f(Object object) {
        return this.y.f(object);
    }

    private Object p(Object object) {
        return this.r.f(object);
    }

    private int A(Object object) {
        return this.N.c(object);
    }

    private void d(Object object, int n6) {
        this.N.a(object, n6);
    }

    private long e() {
        return this.l.l(null, new Object[0]);
    }

    private Object n(Object object) {
        return this.o.f(object);
    }

    public boolean j(Object object) {
        return this.I.d(object);
    }

    private Object h(Object object) {
        return this.v.f(object);
    }

    private void a(Object object, Object object2) {
        this.w.a(object, object2);
    }

    private Object D(Object object) {
        return this.w.f(object);
    }

    private boolean z(Object object) {
        return this.E.h(object, new Object[0]);
    }

    private int a(Object object) {
        return this.m.c(object);
    }

    private void a(Object object, int n6) {
        this.m.a(object, n6);
    }

    private Object g(Object object) {
        return this.L.f(object);
    }

    static Object e(h5 h52, Object object) {
        return h52.v(object);
    }

    static Object j(h5 h52, Object object) {
        return h52.p(object);
    }

    static int h(h5 h52, Object object) {
        return h52.A(object);
    }

    static void b(h5 h52, Object object, int n6) {
        h52.d(object, n6);
    }

    static Object b(h5 h52, Object object) {
        return h52.f(object);
    }

    static long a(h5 h52) {
        return h52.e();
    }

    static Object i(h5 h52, Object object) {
        return h52.n(object);
    }

    static Object f(h5 h52, Object object) {
        return h52.h(object);
    }

    static Object c(h5 h52, Object object) {
        return h52.D(object);
    }

    static void a(h5 h52, Object object, Object object2) {
        h52.a(object, object2);
    }

    static boolean d(h5 h52, Object object) {
        return h52.z(object);
    }

    static int a(h5 h52, Object object) {
        return h52.a(object);
    }

    static void a(h5 h52, Object object, int n6) {
        h52.a(object, n6);
    }

    static Object g(h5 h52, Object object) {
        return h52.g(object);
    }

    public static void b(String[] arrstring) {
        g = arrstring;
    }

    public static String[] d() {
        return g;
    }

    static {
        if (h5.d() == null) {
            h5.b(new String[5]);
        }
    }
}

