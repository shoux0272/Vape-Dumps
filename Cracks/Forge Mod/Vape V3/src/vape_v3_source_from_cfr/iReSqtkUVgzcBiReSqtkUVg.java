/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;
import java.util.UUID;

public class iReSqtkUVgzcBiReSqtkUVg
extends iReSqtkUVgYJSiReSqtkUVg {
    public final iReSqtkUVgkgTiReSqtkUVg b = this.a("entityId", true, Integer.TYPE);
    public final iReSqtkUVgkgTiReSqtkUVg c = this.a("posX", true, Double.TYPE);
    public final iReSqtkUVgkgTiReSqtkUVg d = this.a("posY", true, Double.TYPE);
    public final iReSqtkUVgkgTiReSqtkUVg e = this.a("posZ", true, Double.TYPE);
    public final iReSqtkUVgkgTiReSqtkUVg f = this.a("motionX", true, Double.TYPE);
    public final iReSqtkUVgkgTiReSqtkUVg g = this.a("motionY", true, Double.TYPE);
    public final iReSqtkUVgkgTiReSqtkUVg h = this.a("motionZ", true, Double.TYPE);
    public final iReSqtkUVgkgTiReSqtkUVg i = this.a("rotationYaw", true, Float.TYPE);
    public final iReSqtkUVgkgTiReSqtkUVg j = this.a("rotationPitch", true, Float.TYPE);
    public final iReSqtkUVgkgTiReSqtkUVg k = this.a("onGround", true, Boolean.TYPE);
    public final iReSqtkUVgkgTiReSqtkUVg l = this.a("isDead", true, Boolean.TYPE);
    public final iReSqtkUVgkgTiReSqtkUVg m = this.a("ticksExisted", true, Integer.TYPE);
    public final iReSqtkUVgkgTiReSqtkUVg n;
    private final iReSqtkUVgkgTiReSqtkUVg A = this.a("lastTickPosX", true, Double.TYPE);
    private final iReSqtkUVgkgTiReSqtkUVg B = this.a("lastTickPosY", true, Double.TYPE);
    private final iReSqtkUVgkgTiReSqtkUVg C = this.a("lastTickPosZ", true, Double.TYPE);
    private final iReSqtkUVgkgTiReSqtkUVg D;
    private final iReSqtkUVgkgTiReSqtkUVg E = this.a("height", true, Float.TYPE);
    private final iReSqtkUVgkgTiReSqtkUVg F;
    private final iReSqtkUVgkgTiReSqtkUVg G;
    private final iReSqtkUVgkgTiReSqtkUVg H;
    private final iReSqtkUVgkgTiReSqtkUVg I;
    private final iReSqtkUVgkgTiReSqtkUVg J;
    private final iReSqtkUVgkgTiReSqtkUVg K;
    public final iReSqtkUVgkgTiReSqtkUVg o;
    public final iReSqtkUVgkgTiReSqtkUVg p;
    public final iReSqtkUVgkgTiReSqtkUVg q;
    public final iReSqtkUVgkgTiReSqtkUVg r;
    public final iReSqtkUVgkgTiReSqtkUVg s;
    public final iReSqtkUVgkgTiReSqtkUVg t;
    public final iReSqtkUVgkgTiReSqtkUVg u;
    private iReSqtkUVgkgTiReSqtkUVg L;
    private iReSqtkUVgkgTiReSqtkUVg M;
    private iReSqtkUVgkgTiReSqtkUVg N;
    private iReSqtkUVgkgTiReSqtkUVg O;
    private iReSqtkUVgkgTiReSqtkUVg P;
    private iReSqtkUVgkgTiReSqtkUVg Q;
    private iReSqtkUVgkgTiReSqtkUVg R;
    private iReSqtkUVgkgTiReSqtkUVg S;
    private iReSqtkUVgkgTiReSqtkUVg T;
    private iReSqtkUVgkgTiReSqtkUVg U;
    private iReSqtkUVgYewiReSqtkUVg V;
    private iReSqtkUVgYewiReSqtkUVg W;
    private iReSqtkUVgYewiReSqtkUVg X;
    private iReSqtkUVgYewiReSqtkUVg Y;
    private iReSqtkUVgYewiReSqtkUVg Z;
    private iReSqtkUVgYewiReSqtkUVg aa;
    private iReSqtkUVgYewiReSqtkUVg ab;
    private iReSqtkUVgYewiReSqtkUVg ac;
    private iReSqtkUVgYewiReSqtkUVg ad;
    private iReSqtkUVgYewiReSqtkUVg ae;
    private iReSqtkUVgYewiReSqtkUVg af;
    private iReSqtkUVgYewiReSqtkUVg ag;
    private iReSqtkUVgYewiReSqtkUVg ah;
    private iReSqtkUVgYewiReSqtkUVg ai;
    private iReSqtkUVgYewiReSqtkUVg aj;
    private iReSqtkUVgYewiReSqtkUVg ak;
    private iReSqtkUVgYewiReSqtkUVg al;
    private iReSqtkUVgYewiReSqtkUVg am;
    private iReSqtkUVgYewiReSqtkUVg an;
    private iReSqtkUVgYewiReSqtkUVg ao;
    private iReSqtkUVgYewiReSqtkUVg ap;
    private iReSqtkUVgYewiReSqtkUVg aq;
    private iReSqtkUVgYewiReSqtkUVg ar;
    private iReSqtkUVgYewiReSqtkUVg as;
    private iReSqtkUVgYewiReSqtkUVg at;
    private iReSqtkUVgYewiReSqtkUVg au;
    private iReSqtkUVgYewiReSqtkUVg av;
    public iReSqtkUVgYewiReSqtkUVg v;
    public iReSqtkUVgYewiReSqtkUVg w;
    private iReSqtkUVgYewiReSqtkUVg aw;
    private iReSqtkUVgYewiReSqtkUVg ax;
    private iReSqtkUVgkgTiReSqtkUVg ay;
    private iReSqtkUVgkgTiReSqtkUVg az;
    private iReSqtkUVgkgTiReSqtkUVg aA;
    public iReSqtkUVgYewiReSqtkUVg x;
    public iReSqtkUVgYewiReSqtkUVg y;
    public iReSqtkUVgYewiReSqtkUVg z;

    public iReSqtkUVgzcBiReSqtkUVg() {
        super(iReSqtkUVgSzRiReSqtkUVg.c);
        this.D = this.a("width", true, Float.TYPE);
        this.F = this.a("prevRotationYaw", true, Float.TYPE);
        this.G = this.a("prevRotationPitch", true, Float.TYPE);
        this.Q = this.a("prevPosX", true, Double.TYPE);
        this.R = this.a("prevPosY", true, Double.TYPE);
        this.S = this.a("prevPosZ", true, Double.TYPE);
        this.H = this.a("boundingBox", true, iReSqtkUVgSzRiReSqtkUVg.cf);
        this.I = this.a("ridingEntity", true, iReSqtkUVgSzRiReSqtkUVg.c);
        this.J = this.a("rand", true, Random.class);
        this.o = this.a("noClip", true, Boolean.TYPE);
        this.p = this.a("isInWeb", true, Boolean.TYPE);
        this.n = this.a("fallDistance", true, Float.TYPE);
        this.K = this.a("hurtResistantTime", true, Integer.TYPE);
        this.U = this.a("entityUniqueID", true, UUID.class);
        if (iReSqtkUVgauSiReSqtkUVg.d() == 13) {
            this.ay = this.a("field_70135_K", false, Boolean.TYPE);
            this.az = this.a("yOffset", true, Float.TYPE);
            this.aA = this.a("ySize", true, Float.TYPE);
            this.ae = this.a("updateFallState", true, Void.TYPE, Double.TYPE, Boolean.TYPE);
            this.ax = this.a("func_145780_a", false, Void.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, iReSqtkUVgSzRiReSqtkUVg.G);
            this.ao = this.a("func_145748_c_", false, iReSqtkUVgSzRiReSqtkUVg.ct, new Class[0]);
            this.aq = this.a("copyDataFrom", true, Void.TYPE, iReSqtkUVgSzRiReSqtkUVg.c, Boolean.TYPE);
        } else {
            if (iReSqtkUVgauSiReSqtkUVg.d() < 23) {
                this.ae = this.a("updateFallState", true, Void.TYPE, Double.TYPE, Boolean.TYPE, iReSqtkUVgSzRiReSqtkUVg.G, iReSqtkUVgSzRiReSqtkUVg.bT);
            }
            this.aw = this.a("playStepSound", true, Void.TYPE, iReSqtkUVgSzRiReSqtkUVg.bT, iReSqtkUVgSzRiReSqtkUVg.G);
            this.ao = this.a("getDisplayName", true, iReSqtkUVgSzRiReSqtkUVg.ct, new Class[0]);
            this.aq = this.a("copyDataFromOld", true, Void.TYPE, iReSqtkUVgSzRiReSqtkUVg.c);
            this.v = this.a("getEntityBoundingBox", true, iReSqtkUVgSzRiReSqtkUVg.cf, new Class[0]);
        }
        if (iReSqtkUVgauSiReSqtkUVg.d() >= 23) {
            this.q = this.a("world", true, iReSqtkUVgSzRiReSqtkUVg.k);
            this.x = this.a("func_70091_d", false, Void.TYPE, iReSqtkUVgSzRiReSqtkUVg.cT, Double.TYPE, Double.TYPE, Double.TYPE);
        } else {
            this.q = this.a("worldObj", true, iReSqtkUVgSzRiReSqtkUVg.k);
            this.O = this.a("fire", true, Integer.TYPE);
            this.P = this.a("fireResistance", true, Integer.TYPE);
            this.ah = this.a("playSound", true, Void.TYPE, String.class, Float.TYPE, Float.TYPE);
            this.ai = this.a("getSwimSound", true, String.class, new Class[0]);
            this.x = this.a("moveEntity", true, Void.TYPE, Double.TYPE, Double.TYPE, Double.TYPE);
        }
        this.r = this.a("stepHeight", true, Float.TYPE);
        this.s = this.a("isCollidedHorizontally", true, Boolean.TYPE);
        this.t = this.a("isCollidedVertically", true, Boolean.TYPE);
        this.u = this.a("isCollided", true, Boolean.TYPE);
        this.T = this.a("prevDistanceWalkedModified", true, Float.TYPE);
        this.L = this.a("distanceWalkedModified", true, Float.TYPE);
        this.M = this.a("distanceWalkedOnStepModified", true, Float.TYPE);
        this.N = this.a("nextStepDistance", true, Integer.TYPE);
        this.W = this.a("getDistanceToEntity", true, Float.TYPE, iReSqtkUVgSzRiReSqtkUVg.c);
        this.X = this.a("isSprinting", true, Boolean.TYPE, new Class[0]);
        this.z = this.a("isSneaking", true, Boolean.TYPE, new Class[0]);
        this.Y = this.a("isInvisible", true, Boolean.TYPE, new Class[0]);
        this.Z = this.a("isRiding", true, Boolean.TYPE, new Class[0]);
        this.V = this.a(iReSqtkUVgauSiReSqtkUVg.d() == 13 ? "getCommandSenderName" : "getName", true, String.class, new Class[0]);
        this.aa = this.a("canBeCollidedWith", true, Boolean.TYPE, new Class[0]);
        this.ab = this.a("getCollisionBorderSize", true, Float.TYPE, new Class[0]);
        this.ac = this.a("canRiderInteract", false, Boolean.TYPE, new Class[0]);
        this.ad = this.a("getEyeHeight", true, Float.TYPE, new Class[0]);
        this.af = this.a("canTriggerWalking", true, Boolean.TYPE, new Class[0]);
        this.ag = this.a("isInWater", true, Boolean.TYPE, new Class[0]);
        this.aj = this.a("func_145775_I", false, Void.TYPE, new Class[0]);
        this.ak = this.a("isWet", true, Boolean.TYPE, new Class[0]);
        this.al = this.a("dealFireDamage", true, Void.TYPE, Integer.TYPE);
        this.am = this.a("setFire", true, Void.TYPE, Integer.TYPE);
        this.an = this.a("setFlag", true, Void.TYPE, Integer.TYPE, Boolean.TYPE);
        this.ap = this.a("getUniqueID", true, UUID.class, new Class[0]);
        this.ar = this.a("setPositionAndRotation", true, Void.TYPE, Double.TYPE, Double.TYPE, Double.TYPE, Float.TYPE, Float.TYPE);
        this.as = this.a("setAngles", true, Void.TYPE, Float.TYPE, Float.TYPE);
        this.at = this.a("<init>", false, Void.TYPE, iReSqtkUVgSzRiReSqtkUVg.k);
        this.au = this.a("setInvisible", true, Void.TYPE, Boolean.TYPE);
        this.av = this.a("setPosition", true, Void.TYPE, Double.TYPE, Double.TYPE, Double.TYPE);
        this.w = this.a("setSprinting", true, Void.TYPE, Boolean.TYPE);
        this.y = this.a("setSneaking", true, Void.TYPE, Boolean.TYPE);
    }

    private int a(Object object) {
        return this.b.d(object);
    }

    private double b(Object object) {
        return this.c.g(object);
    }

    private double c(Object object) {
        return this.d.g(object);
    }

    private double d(Object object) {
        return this.e.g(object);
    }

    private double e(Object object) {
        return this.f.g(object);
    }

    private double f(Object object) {
        return this.g.g(object);
    }

    private double g(Object object) {
        return this.h.g(object);
    }

    private void a(Object object, double d2) {
        this.f.a(object, d2);
    }

    private void b(Object object, double d2) {
        this.g.a(object, d2);
    }

    private void c(Object object, double d2) {
        this.h.a(object, d2);
    }

    private void a(Object object, float f) {
        this.i.a(object, f);
    }

    private void b(Object object, float f) {
        this.j.a(object, f);
    }

    private void c(Object object, float f) {
        this.F.a(object, f);
    }

    private void d(Object object, float f) {
        this.G.a(object, f);
    }

    private float h(Object object) {
        return this.i.f(object);
    }

    private float i(Object object) {
        return this.j.f(object);
    }

    private float j(Object object) {
        return this.F.f(object);
    }

    private float k(Object object) {
        return this.G.f(object);
    }

    private String l(Object object) {
        return (String)this.V.j(object, new Object[0]);
    }

    private float a(Object object, Object object2) {
        return this.W.g(object, object2);
    }

    private boolean m(Object object) {
        return this.k.a(object);
    }

    private void a(Object object, boolean bl) {
        this.k.a(object, bl);
    }

    private float n(Object object) {
        return this.n.f(object);
    }

    private void e(Object object, float f) {
        this.n.a(object, f);
    }

    private int o(Object object) {
        return this.K.d(object);
    }

    private boolean p(Object object) {
        return this.l.a(object);
    }

    private int q(Object object) {
        return this.m.d(object);
    }

    private boolean r(Object object) {
        return this.X.b(object, new Object[0]);
    }

    private boolean s(Object object) {
        return this.z.b(object, new Object[0]);
    }

    private boolean t(Object object) {
        return this.Y.b(object, new Object[0]);
    }

    private boolean u(Object object) {
        return this.Z.b(object, new Object[0]);
    }

    private double v(Object object) {
        return this.A.g(object);
    }

    private void d(Object object, double d2) {
        this.A.a(object, d2);
    }

    private double w(Object object) {
        return this.B.g(object);
    }

    private void e(Object object, double d2) {
        this.B.a(object, d2);
    }

    private double x(Object object) {
        return this.C.g(object);
    }

    private void f(Object object, double d2) {
        this.C.a(object, d2);
    }

    private float y(Object object) {
        return this.E.f(object);
    }

    private float z(Object object) {
        return this.D.f(object);
    }

    private Object A(Object object) {
        return this.H.h(object);
    }

    private boolean B(Object object) {
        return this.aa.b(object, new Object[0]);
    }

    private float C(Object object) {
        return this.ab.g(object, new Object[0]);
    }

    private Object D(Object object) {
        return this.I.h(object);
    }

    private boolean E(Object object) {
        return this.ac.b(object, new Object[0]);
    }

    private float F(Object object) {
        return this.ad.g(object, new Object[0]);
    }

    private Random G(Object object) {
        return (Random)this.J.h(object);
    }

    private boolean H(Object object) {
        return this.o.a(object);
    }

    private void g(Object object, double d2) {
        this.c.a(object, d2);
    }

    private void h(Object object, double d2) {
        this.d.a(object, d2);
    }

    private void i(Object object, double d2) {
        this.e.a(object, d2);
    }

    private float I(Object object) {
        return this.az.f(object);
    }

    private float J(Object object) {
        return this.aA.f(object);
    }

    private void f(Object object, float f) {
        this.aA.a(object, f);
    }

    private boolean K(Object object) {
        return this.p.a(object);
    }

    private void b(Object object, boolean bl) {
        this.p.a(object, bl);
    }

    private Object L(Object object) {
        return this.q.h(object);
    }

    private boolean M(Object object) {
        return this.ay.a(object);
    }

    private float N(Object object) {
        return this.r.f(object);
    }

    private void g(Object object, float f) {
        this.r.a(object, f);
    }

    private boolean O(Object object) {
        return this.s.a(object);
    }

    private boolean P(Object object) {
        return this.t.a(object);
    }

    private void c(Object object, boolean bl) {
        this.s.a(object, bl);
    }

    private void d(Object object, boolean bl) {
        this.t.a(object, bl);
    }

    private void e(Object object, boolean bl) {
        this.u.a(object, bl);
    }

    private void a(Object object, double d2, boolean bl) {
        this.ae.a(object, new Object[]{d2, bl});
    }

    private void a(Object object, double d2, boolean bl, Object object2, Object object3) {
        this.ae.a(object, new Object[]{d2, bl, object2, object3});
    }

    private boolean Q(Object object) {
        return this.af.b(object, new Object[0]);
    }

    private float R(Object object) {
        return this.L.f(object);
    }

    private float S(Object object) {
        return this.M.f(object);
    }

    private void h(Object object, float f) {
        this.L.a(object, f);
    }

    private float T(Object object) {
        return this.T.f(object);
    }

    private void i(Object object, float f) {
        this.T.a(object, f);
    }

    private void j(Object object, float f) {
        this.M.a(object, f);
    }

    private int U(Object object) {
        return this.N.d(object);
    }

    private void a(Object object, int n) {
        this.N.a(object, n);
    }

    private boolean V(Object object) {
        return this.ag.b(object, new Object[0]);
    }

    private void a(Object object, String string, float f, float f2) {
        this.ah.a(object, new Object[]{string, Float.valueOf(f), Float.valueOf(f2)});
    }

    private String W(Object object) {
        return (String)this.ai.j(object, new Object[0]);
    }

    private void a(Object object, int n, int n2, int n3, Object object2) {
        this.ax.a(object, new Object[]{n, n2, n3, object2});
    }

    private void X(Object object) {
        this.aj.a(object, new Object[0]);
    }

    private boolean Y(Object object) {
        return this.ak.b(object, new Object[0]);
    }

    private void b(Object object, int n) {
        this.al.a(object, new Object[]{n});
    }

    private int Z(Object object) {
        return this.O.d(object);
    }

    private void c(Object object, int n) {
        this.O.a(object, n);
    }

    private void d(Object object, int n) {
        this.am.a(object, new Object[]{n});
    }

    private int aa(Object object) {
        return this.P.d(object);
    }

    private void b(Object object, Object object2) {
        this.H.a(object, object2);
    }

    private void a(Object object, Object object2, Object object3) {
        this.aw.a(object, new Object[]{object2, object3});
    }

    private double ab(Object object) {
        return this.Q.g(object);
    }

    private double ac(Object object) {
        return this.R.g(object);
    }

    private double ad(Object object) {
        return this.S.g(object);
    }

    private void j(Object object, double d2) {
        this.Q.a(object, d2);
    }

    private void k(Object object, double d2) {
        this.R.a(object, d2);
    }

    private void l(Object object, double d2) {
        this.S.a(object, d2);
    }

    private void a(Object object, int n, boolean bl) {
        this.an.a(object, new Object[]{n, bl});
    }

    private Object ae(Object object) {
        return this.ao.j(object, new Object[0]);
    }

    private UUID af(Object object) {
        return (UUID)this.ap.j(object, new Object[0]);
    }

    private void a(Object object, UUID uUID) {
        this.U.a(object, uUID);
    }

    private void a(Object object, Object object2, boolean bl) {
        this.aq.a(object, new Object[]{object2, bl});
    }

    private void a(Object object, double d2, double d3, double d4, float f, float f2) {
        this.ar.a(object, new Object[]{d2, d3, d4, Float.valueOf(f), Float.valueOf(f2)});
    }

    private void a(Object object, float f, float f2) {
        this.as.a(object, new Object[]{Float.valueOf(f), Float.valueOf(f2)});
    }

    private Object ag(Object object) {
        return this.at.a(object);
    }

    private Object ah(Object object) {
        return this.v.j(object, new Object[0]);
    }

    private void f(Object object, boolean bl) {
        this.au.a(object, new Object[]{bl});
    }

    private void a(Object object, double d2, double d3, double d4) {
        this.av.a(object, new Object[]{d2, d3, d4});
    }

    private void g(Object object, boolean bl) {
        this.y.a(object, new Object[]{bl});
    }

    static /* synthetic */ String a(iReSqtkUVgzcBiReSqtkUVg iReSqtkUVgzcBiReSqtkUVg2, Object object) {
        return iReSqtkUVgzcBiReSqtkUVg2.l(object);
    }

    static /* synthetic */ int b(iReSqtkUVgzcBiReSqtkUVg iReSqtkUVgzcBiReSqtkUVg2, Object object) {
        return iReSqtkUVgzcBiReSqtkUVg2.a(object);
    }

    static /* synthetic */ double c(iReSqtkUVgzcBiReSqtkUVg iReSqtkUVgzcBiReSqtkUVg2, Object object) {
        return iReSqtkUVgzcBiReSqtkUVg2.b(object);
    }

    static /* synthetic */ double d(iReSqtkUVgzcBiReSqtkUVg iReSqtkUVgzcBiReSqtkUVg2, Object object) {
        return iReSqtkUVgzcBiReSqtkUVg2.c(object);
    }

    static /* synthetic */ double e(iReSqtkUVgzcBiReSqtkUVg iReSqtkUVgzcBiReSqtkUVg2, Object object) {
        return iReSqtkUVgzcBiReSqtkUVg2.d(object);
    }

    static /* synthetic */ double f(iReSqtkUVgzcBiReSqtkUVg iReSqtkUVgzcBiReSqtkUVg2, Object object) {
        return iReSqtkUVgzcBiReSqtkUVg2.e(object);
    }

    static /* synthetic */ void a(iReSqtkUVgzcBiReSqtkUVg iReSqtkUVgzcBiReSqtkUVg2, Object object, double d2) {
        iReSqtkUVgzcBiReSqtkUVg2.a(object, d2);
    }

    static /* synthetic */ double g(iReSqtkUVgzcBiReSqtkUVg iReSqtkUVgzcBiReSqtkUVg2, Object object) {
        return iReSqtkUVgzcBiReSqtkUVg2.f(object);
    }

    static /* synthetic */ void b(iReSqtkUVgzcBiReSqtkUVg iReSqtkUVgzcBiReSqtkUVg2, Object object, double d2) {
        iReSqtkUVgzcBiReSqtkUVg2.b(object, d2);
    }

    static /* synthetic */ double h(iReSqtkUVgzcBiReSqtkUVg iReSqtkUVgzcBiReSqtkUVg2, Object object) {
        return iReSqtkUVgzcBiReSqtkUVg2.g(object);
    }

    static /* synthetic */ void c(iReSqtkUVgzcBiReSqtkUVg iReSqtkUVgzcBiReSqtkUVg2, Object object, double d2) {
        iReSqtkUVgzcBiReSqtkUVg2.c(object, d2);
    }

    static /* synthetic */ float i(iReSqtkUVgzcBiReSqtkUVg iReSqtkUVgzcBiReSqtkUVg2, Object object) {
        return iReSqtkUVgzcBiReSqtkUVg2.h(object);
    }

    static /* synthetic */ void a(iReSqtkUVgzcBiReSqtkUVg iReSqtkUVgzcBiReSqtkUVg2, Object object, float f) {
        iReSqtkUVgzcBiReSqtkUVg2.a(object, f);
    }

    static /* synthetic */ float j(iReSqtkUVgzcBiReSqtkUVg iReSqtkUVgzcBiReSqtkUVg2, Object object) {
        return iReSqtkUVgzcBiReSqtkUVg2.i(object);
    }

    static /* synthetic */ void b(iReSqtkUVgzcBiReSqtkUVg iReSqtkUVgzcBiReSqtkUVg2, Object object, float f) {
        iReSqtkUVgzcBiReSqtkUVg2.b(object, f);
    }

    static /* synthetic */ float k(iReSqtkUVgzcBiReSqtkUVg iReSqtkUVgzcBiReSqtkUVg2, Object object) {
        return iReSqtkUVgzcBiReSqtkUVg2.j(object);
    }

    static /* synthetic */ void c(iReSqtkUVgzcBiReSqtkUVg iReSqtkUVgzcBiReSqtkUVg2, Object object, float f) {
        iReSqtkUVgzcBiReSqtkUVg2.c(object, f);
    }

    static /* synthetic */ float l(iReSqtkUVgzcBiReSqtkUVg iReSqtkUVgzcBiReSqtkUVg2, Object object) {
        return iReSqtkUVgzcBiReSqtkUVg2.k(object);
    }

    static /* synthetic */ void d(iReSqtkUVgzcBiReSqtkUVg iReSqtkUVgzcBiReSqtkUVg2, Object object, float f) {
        iReSqtkUVgzcBiReSqtkUVg2.d(object, f);
    }

    static /* synthetic */ float a(iReSqtkUVgzcBiReSqtkUVg iReSqtkUVgzcBiReSqtkUVg2, Object object, Object object2) {
        return iReSqtkUVgzcBiReSqtkUVg2.a(object, object2);
    }

    static /* synthetic */ boolean m(iReSqtkUVgzcBiReSqtkUVg iReSqtkUVgzcBiReSqtkUVg2, Object object) {
        return iReSqtkUVgzcBiReSqtkUVg2.m(object);
    }

    static /* synthetic */ void a(iReSqtkUVgzcBiReSqtkUVg iReSqtkUVgzcBiReSqtkUVg2, Object object, boolean bl) {
        iReSqtkUVgzcBiReSqtkUVg2.a(object, bl);
    }

    static /* synthetic */ boolean n(iReSqtkUVgzcBiReSqtkUVg iReSqtkUVgzcBiReSqtkUVg2, Object object) {
        return iReSqtkUVgzcBiReSqtkUVg2.p(object);
    }

    static /* synthetic */ int o(iReSqtkUVgzcBiReSqtkUVg iReSqtkUVgzcBiReSqtkUVg2, Object object) {
        return iReSqtkUVgzcBiReSqtkUVg2.q(object);
    }

    static /* synthetic */ boolean p(iReSqtkUVgzcBiReSqtkUVg iReSqtkUVgzcBiReSqtkUVg2, Object object) {
        return iReSqtkUVgzcBiReSqtkUVg2.s(object);
    }

    static /* synthetic */ boolean q(iReSqtkUVgzcBiReSqtkUVg iReSqtkUVgzcBiReSqtkUVg2, Object object) {
        return iReSqtkUVgzcBiReSqtkUVg2.r(object);
    }

    static /* synthetic */ boolean r(iReSqtkUVgzcBiReSqtkUVg iReSqtkUVgzcBiReSqtkUVg2, Object object) {
        return iReSqtkUVgzcBiReSqtkUVg2.t(object);
    }

    static /* synthetic */ boolean s(iReSqtkUVgzcBiReSqtkUVg iReSqtkUVgzcBiReSqtkUVg2, Object object) {
        return iReSqtkUVgzcBiReSqtkUVg2.u(object);
    }

    static /* synthetic */ double t(iReSqtkUVgzcBiReSqtkUVg iReSqtkUVgzcBiReSqtkUVg2, Object object) {
        return iReSqtkUVgzcBiReSqtkUVg2.v(object);
    }

    static /* synthetic */ void d(iReSqtkUVgzcBiReSqtkUVg iReSqtkUVgzcBiReSqtkUVg2, Object object, double d2) {
        iReSqtkUVgzcBiReSqtkUVg2.d(object, d2);
    }

    static /* synthetic */ double u(iReSqtkUVgzcBiReSqtkUVg iReSqtkUVgzcBiReSqtkUVg2, Object object) {
        return iReSqtkUVgzcBiReSqtkUVg2.w(object);
    }

    static /* synthetic */ void e(iReSqtkUVgzcBiReSqtkUVg iReSqtkUVgzcBiReSqtkUVg2, Object object, double d2) {
        iReSqtkUVgzcBiReSqtkUVg2.e(object, d2);
    }

    static /* synthetic */ double v(iReSqtkUVgzcBiReSqtkUVg iReSqtkUVgzcBiReSqtkUVg2, Object object) {
        return iReSqtkUVgzcBiReSqtkUVg2.x(object);
    }

    static /* synthetic */ void f(iReSqtkUVgzcBiReSqtkUVg iReSqtkUVgzcBiReSqtkUVg2, Object object, double d2) {
        iReSqtkUVgzcBiReSqtkUVg2.f(object, d2);
    }

    static /* synthetic */ float w(iReSqtkUVgzcBiReSqtkUVg iReSqtkUVgzcBiReSqtkUVg2, Object object) {
        return iReSqtkUVgzcBiReSqtkUVg2.y(object);
    }

    static /* synthetic */ float x(iReSqtkUVgzcBiReSqtkUVg iReSqtkUVgzcBiReSqtkUVg2, Object object) {
        return iReSqtkUVgzcBiReSqtkUVg2.z(object);
    }

    static /* synthetic */ Object y(iReSqtkUVgzcBiReSqtkUVg iReSqtkUVgzcBiReSqtkUVg2, Object object) {
        return iReSqtkUVgzcBiReSqtkUVg2.A(object);
    }

    static /* synthetic */ void b(iReSqtkUVgzcBiReSqtkUVg iReSqtkUVgzcBiReSqtkUVg2, Object object, Object object2) {
        iReSqtkUVgzcBiReSqtkUVg2.b(object, object2);
    }

    static /* synthetic */ boolean z(iReSqtkUVgzcBiReSqtkUVg iReSqtkUVgzcBiReSqtkUVg2, Object object) {
        return iReSqtkUVgzcBiReSqtkUVg2.B(object);
    }

    static /* synthetic */ float A(iReSqtkUVgzcBiReSqtkUVg iReSqtkUVgzcBiReSqtkUVg2, Object object) {
        return iReSqtkUVgzcBiReSqtkUVg2.C(object);
    }

    static /* synthetic */ Object B(iReSqtkUVgzcBiReSqtkUVg iReSqtkUVgzcBiReSqtkUVg2, Object object) {
        return iReSqtkUVgzcBiReSqtkUVg2.D(object);
    }

    static /* synthetic */ boolean C(iReSqtkUVgzcBiReSqtkUVg iReSqtkUVgzcBiReSqtkUVg2, Object object) {
        return iReSqtkUVgzcBiReSqtkUVg2.E(object);
    }

    static /* synthetic */ float D(iReSqtkUVgzcBiReSqtkUVg iReSqtkUVgzcBiReSqtkUVg2, Object object) {
        return iReSqtkUVgzcBiReSqtkUVg2.F(object);
    }

    static /* synthetic */ Random E(iReSqtkUVgzcBiReSqtkUVg iReSqtkUVgzcBiReSqtkUVg2, Object object) {
        return iReSqtkUVgzcBiReSqtkUVg2.G(object);
    }

    static /* synthetic */ boolean F(iReSqtkUVgzcBiReSqtkUVg iReSqtkUVgzcBiReSqtkUVg2, Object object) {
        return iReSqtkUVgzcBiReSqtkUVg2.H(object);
    }

    static /* synthetic */ void g(iReSqtkUVgzcBiReSqtkUVg iReSqtkUVgzcBiReSqtkUVg2, Object object, double d2) {
        iReSqtkUVgzcBiReSqtkUVg2.g(object, d2);
    }

    static /* synthetic */ void h(iReSqtkUVgzcBiReSqtkUVg iReSqtkUVgzcBiReSqtkUVg2, Object object, double d2) {
        iReSqtkUVgzcBiReSqtkUVg2.h(object, d2);
    }

    static /* synthetic */ void i(iReSqtkUVgzcBiReSqtkUVg iReSqtkUVgzcBiReSqtkUVg2, Object object, double d2) {
        iReSqtkUVgzcBiReSqtkUVg2.i(object, d2);
    }

    static /* synthetic */ float G(iReSqtkUVgzcBiReSqtkUVg iReSqtkUVgzcBiReSqtkUVg2, Object object) {
        return iReSqtkUVgzcBiReSqtkUVg2.I(object);
    }

    static /* synthetic */ float H(iReSqtkUVgzcBiReSqtkUVg iReSqtkUVgzcBiReSqtkUVg2, Object object) {
        return iReSqtkUVgzcBiReSqtkUVg2.J(object);
    }

    static /* synthetic */ void e(iReSqtkUVgzcBiReSqtkUVg iReSqtkUVgzcBiReSqtkUVg2, Object object, float f) {
        iReSqtkUVgzcBiReSqtkUVg2.f(object, f);
    }

    static /* synthetic */ boolean I(iReSqtkUVgzcBiReSqtkUVg iReSqtkUVgzcBiReSqtkUVg2, Object object) {
        return iReSqtkUVgzcBiReSqtkUVg2.K(object);
    }

    static /* synthetic */ void b(iReSqtkUVgzcBiReSqtkUVg iReSqtkUVgzcBiReSqtkUVg2, Object object, boolean bl) {
        iReSqtkUVgzcBiReSqtkUVg2.b(object, bl);
    }

    static /* synthetic */ Object J(iReSqtkUVgzcBiReSqtkUVg iReSqtkUVgzcBiReSqtkUVg2, Object object) {
        return iReSqtkUVgzcBiReSqtkUVg2.L(object);
    }

    static /* synthetic */ float K(iReSqtkUVgzcBiReSqtkUVg iReSqtkUVgzcBiReSqtkUVg2, Object object) {
        return iReSqtkUVgzcBiReSqtkUVg2.n(object);
    }

    static /* synthetic */ void f(iReSqtkUVgzcBiReSqtkUVg iReSqtkUVgzcBiReSqtkUVg2, Object object, float f) {
        iReSqtkUVgzcBiReSqtkUVg2.e(object, f);
    }

    static /* synthetic */ int L(iReSqtkUVgzcBiReSqtkUVg iReSqtkUVgzcBiReSqtkUVg2, Object object) {
        return iReSqtkUVgzcBiReSqtkUVg2.o(object);
    }

    static /* synthetic */ boolean M(iReSqtkUVgzcBiReSqtkUVg iReSqtkUVgzcBiReSqtkUVg2, Object object) {
        return iReSqtkUVgzcBiReSqtkUVg2.M(object);
    }

    static /* synthetic */ float N(iReSqtkUVgzcBiReSqtkUVg iReSqtkUVgzcBiReSqtkUVg2, Object object) {
        return iReSqtkUVgzcBiReSqtkUVg2.N(object);
    }

    static /* synthetic */ void g(iReSqtkUVgzcBiReSqtkUVg iReSqtkUVgzcBiReSqtkUVg2, Object object, float f) {
        iReSqtkUVgzcBiReSqtkUVg2.g(object, f);
    }

    static /* synthetic */ void c(iReSqtkUVgzcBiReSqtkUVg iReSqtkUVgzcBiReSqtkUVg2, Object object, boolean bl) {
        iReSqtkUVgzcBiReSqtkUVg2.c(object, bl);
    }

    static /* synthetic */ void d(iReSqtkUVgzcBiReSqtkUVg iReSqtkUVgzcBiReSqtkUVg2, Object object, boolean bl) {
        iReSqtkUVgzcBiReSqtkUVg2.d(object, bl);
    }

    static /* synthetic */ void e(iReSqtkUVgzcBiReSqtkUVg iReSqtkUVgzcBiReSqtkUVg2, Object object, boolean bl) {
        iReSqtkUVgzcBiReSqtkUVg2.e(object, bl);
    }

    static /* synthetic */ boolean O(iReSqtkUVgzcBiReSqtkUVg iReSqtkUVgzcBiReSqtkUVg2, Object object) {
        return iReSqtkUVgzcBiReSqtkUVg2.O(object);
    }

    static /* synthetic */ boolean P(iReSqtkUVgzcBiReSqtkUVg iReSqtkUVgzcBiReSqtkUVg2, Object object) {
        return iReSqtkUVgzcBiReSqtkUVg2.P(object);
    }

    static /* synthetic */ void a(iReSqtkUVgzcBiReSqtkUVg iReSqtkUVgzcBiReSqtkUVg2, Object object, double d2, boolean bl) {
        iReSqtkUVgzcBiReSqtkUVg2.a(object, d2, bl);
    }

    static /* synthetic */ void a(iReSqtkUVgzcBiReSqtkUVg iReSqtkUVgzcBiReSqtkUVg2, Object object, double d2, boolean bl, Object object2, Object object3) {
        iReSqtkUVgzcBiReSqtkUVg2.a(object, d2, bl, object2, object3);
    }

    static /* synthetic */ boolean Q(iReSqtkUVgzcBiReSqtkUVg iReSqtkUVgzcBiReSqtkUVg2, Object object) {
        return iReSqtkUVgzcBiReSqtkUVg2.Q(object);
    }

    static /* synthetic */ float R(iReSqtkUVgzcBiReSqtkUVg iReSqtkUVgzcBiReSqtkUVg2, Object object) {
        return iReSqtkUVgzcBiReSqtkUVg2.R(object);
    }

    static /* synthetic */ void h(iReSqtkUVgzcBiReSqtkUVg iReSqtkUVgzcBiReSqtkUVg2, Object object, float f) {
        iReSqtkUVgzcBiReSqtkUVg2.h(object, f);
    }

    static /* synthetic */ float S(iReSqtkUVgzcBiReSqtkUVg iReSqtkUVgzcBiReSqtkUVg2, Object object) {
        return iReSqtkUVgzcBiReSqtkUVg2.T(object);
    }

    static /* synthetic */ void i(iReSqtkUVgzcBiReSqtkUVg iReSqtkUVgzcBiReSqtkUVg2, Object object, float f) {
        iReSqtkUVgzcBiReSqtkUVg2.i(object, f);
    }

    static /* synthetic */ float T(iReSqtkUVgzcBiReSqtkUVg iReSqtkUVgzcBiReSqtkUVg2, Object object) {
        return iReSqtkUVgzcBiReSqtkUVg2.S(object);
    }

    static /* synthetic */ void j(iReSqtkUVgzcBiReSqtkUVg iReSqtkUVgzcBiReSqtkUVg2, Object object, float f) {
        iReSqtkUVgzcBiReSqtkUVg2.j(object, f);
    }

    static /* synthetic */ int U(iReSqtkUVgzcBiReSqtkUVg iReSqtkUVgzcBiReSqtkUVg2, Object object) {
        return iReSqtkUVgzcBiReSqtkUVg2.U(object);
    }

    static /* synthetic */ void a(iReSqtkUVgzcBiReSqtkUVg iReSqtkUVgzcBiReSqtkUVg2, Object object, int n) {
        iReSqtkUVgzcBiReSqtkUVg2.a(object, n);
    }

    static /* synthetic */ boolean V(iReSqtkUVgzcBiReSqtkUVg iReSqtkUVgzcBiReSqtkUVg2, Object object) {
        return iReSqtkUVgzcBiReSqtkUVg2.V(object);
    }

    static /* synthetic */ void a(iReSqtkUVgzcBiReSqtkUVg iReSqtkUVgzcBiReSqtkUVg2, Object object, String string, float f, float f2) {
        iReSqtkUVgzcBiReSqtkUVg2.a(object, string, f, f2);
    }

    static /* synthetic */ String W(iReSqtkUVgzcBiReSqtkUVg iReSqtkUVgzcBiReSqtkUVg2, Object object) {
        return iReSqtkUVgzcBiReSqtkUVg2.W(object);
    }

    static /* synthetic */ void a(iReSqtkUVgzcBiReSqtkUVg iReSqtkUVgzcBiReSqtkUVg2, Object object, int n, int n2, int n3, Object object2) {
        iReSqtkUVgzcBiReSqtkUVg2.a(object, n, n2, n3, object2);
    }

    static /* synthetic */ void X(iReSqtkUVgzcBiReSqtkUVg iReSqtkUVgzcBiReSqtkUVg2, Object object) {
        iReSqtkUVgzcBiReSqtkUVg2.X(object);
    }

    static /* synthetic */ boolean Y(iReSqtkUVgzcBiReSqtkUVg iReSqtkUVgzcBiReSqtkUVg2, Object object) {
        return iReSqtkUVgzcBiReSqtkUVg2.Y(object);
    }

    static /* synthetic */ void b(iReSqtkUVgzcBiReSqtkUVg iReSqtkUVgzcBiReSqtkUVg2, Object object, int n) {
        iReSqtkUVgzcBiReSqtkUVg2.b(object, n);
    }

    static /* synthetic */ int Z(iReSqtkUVgzcBiReSqtkUVg iReSqtkUVgzcBiReSqtkUVg2, Object object) {
        return iReSqtkUVgzcBiReSqtkUVg2.Z(object);
    }

    static /* synthetic */ void c(iReSqtkUVgzcBiReSqtkUVg iReSqtkUVgzcBiReSqtkUVg2, Object object, int n) {
        iReSqtkUVgzcBiReSqtkUVg2.d(object, n);
    }

    static /* synthetic */ void d(iReSqtkUVgzcBiReSqtkUVg iReSqtkUVgzcBiReSqtkUVg2, Object object, int n) {
        iReSqtkUVgzcBiReSqtkUVg2.c(object, n);
    }

    static /* synthetic */ int aa(iReSqtkUVgzcBiReSqtkUVg iReSqtkUVgzcBiReSqtkUVg2, Object object) {
        return iReSqtkUVgzcBiReSqtkUVg2.aa(object);
    }

    static /* synthetic */ void a(iReSqtkUVgzcBiReSqtkUVg iReSqtkUVgzcBiReSqtkUVg2, Object object, Object object2, Object object3) {
        iReSqtkUVgzcBiReSqtkUVg2.a(object, object2, object3);
    }

    static /* synthetic */ double ab(iReSqtkUVgzcBiReSqtkUVg iReSqtkUVgzcBiReSqtkUVg2, Object object) {
        return iReSqtkUVgzcBiReSqtkUVg2.ab(object);
    }

    static /* synthetic */ double ac(iReSqtkUVgzcBiReSqtkUVg iReSqtkUVgzcBiReSqtkUVg2, Object object) {
        return iReSqtkUVgzcBiReSqtkUVg2.ac(object);
    }

    static /* synthetic */ double ad(iReSqtkUVgzcBiReSqtkUVg iReSqtkUVgzcBiReSqtkUVg2, Object object) {
        return iReSqtkUVgzcBiReSqtkUVg2.ad(object);
    }

    static /* synthetic */ void j(iReSqtkUVgzcBiReSqtkUVg iReSqtkUVgzcBiReSqtkUVg2, Object object, double d2) {
        iReSqtkUVgzcBiReSqtkUVg2.j(object, d2);
    }

    static /* synthetic */ void k(iReSqtkUVgzcBiReSqtkUVg iReSqtkUVgzcBiReSqtkUVg2, Object object, double d2) {
        iReSqtkUVgzcBiReSqtkUVg2.k(object, d2);
    }

    static /* synthetic */ void l(iReSqtkUVgzcBiReSqtkUVg iReSqtkUVgzcBiReSqtkUVg2, Object object, double d2) {
        iReSqtkUVgzcBiReSqtkUVg2.l(object, d2);
    }

    static /* synthetic */ void a(iReSqtkUVgzcBiReSqtkUVg iReSqtkUVgzcBiReSqtkUVg2, Object object, int n, boolean bl) {
        iReSqtkUVgzcBiReSqtkUVg2.a(object, n, bl);
    }

    static /* synthetic */ Object ae(iReSqtkUVgzcBiReSqtkUVg iReSqtkUVgzcBiReSqtkUVg2, Object object) {
        return iReSqtkUVgzcBiReSqtkUVg2.ae(object);
    }

    static /* synthetic */ UUID af(iReSqtkUVgzcBiReSqtkUVg iReSqtkUVgzcBiReSqtkUVg2, Object object) {
        return iReSqtkUVgzcBiReSqtkUVg2.af(object);
    }

    static /* synthetic */ void a(iReSqtkUVgzcBiReSqtkUVg iReSqtkUVgzcBiReSqtkUVg2, Object object, UUID uUID) {
        iReSqtkUVgzcBiReSqtkUVg2.a(object, uUID);
    }

    static /* synthetic */ void a(iReSqtkUVgzcBiReSqtkUVg iReSqtkUVgzcBiReSqtkUVg2, Object object, Object object2, boolean bl) {
        iReSqtkUVgzcBiReSqtkUVg2.a(object, object2, bl);
    }

    static /* synthetic */ void a(iReSqtkUVgzcBiReSqtkUVg iReSqtkUVgzcBiReSqtkUVg2, Object object, double d2, double d3, double d4, float f, float f2) {
        iReSqtkUVgzcBiReSqtkUVg2.a(object, d2, d3, d4, f, f2);
    }

    static /* synthetic */ void a(iReSqtkUVgzcBiReSqtkUVg iReSqtkUVgzcBiReSqtkUVg2, Object object, float f, float f2) {
        iReSqtkUVgzcBiReSqtkUVg2.a(object, f, f2);
    }

    static /* synthetic */ Object ag(iReSqtkUVgzcBiReSqtkUVg iReSqtkUVgzcBiReSqtkUVg2, Object object) {
        return iReSqtkUVgzcBiReSqtkUVg2.ag(object);
    }

    static /* synthetic */ Object ah(iReSqtkUVgzcBiReSqtkUVg iReSqtkUVgzcBiReSqtkUVg2, Object object) {
        return iReSqtkUVgzcBiReSqtkUVg2.ah(object);
    }

    static /* synthetic */ void f(iReSqtkUVgzcBiReSqtkUVg iReSqtkUVgzcBiReSqtkUVg2, Object object, boolean bl) {
        iReSqtkUVgzcBiReSqtkUVg2.f(object, bl);
    }

    static /* synthetic */ void a(iReSqtkUVgzcBiReSqtkUVg iReSqtkUVgzcBiReSqtkUVg2, Object object, double d2, double d3, double d4) {
        iReSqtkUVgzcBiReSqtkUVg2.a(object, d2, d3, d4);
    }

    static /* synthetic */ void g(iReSqtkUVgzcBiReSqtkUVg iReSqtkUVgzcBiReSqtkUVg2, Object object, boolean bl) {
        iReSqtkUVgzcBiReSqtkUVg2.g(object, bl);
    }
}

