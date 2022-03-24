/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.util.Random;
import java.util.UUID;
import javassist.bytecode.CodeAttribute$RuntimeCopyException;
import manthe.A5;
import manthe.BG;
import manthe.V;
import manthe.bP;
import manthe.cy;
import manthe.gJ;

public class i_
extends gJ {
    public final BG az = this.b("entityId", true, Integer.TYPE);
    public final BG y = this.b("posX", true, Double.TYPE);
    public final BG V = this.b("posY", true, Double.TYPE);
    public final BG n = this.b("posZ", true, Double.TYPE);
    public final BG aG = this.b("motionX", true, Double.TYPE);
    public final BG p = this.b("motionY", true, Double.TYPE);
    public final BG P = this.b("motionZ", true, Double.TYPE);
    public final BG j = this.b("rotationYaw", true, Float.TYPE);
    public final BG ac = this.b("rotationPitch", true, Float.TYPE);
    public final BG af = this.b("onGround", true, Boolean.TYPE);
    public final BG am = this.b("isDead", true, Boolean.TYPE);
    public final BG d = this.b("ticksExisted", true, Integer.TYPE);
    public final BG i;
    public final BG s = this.b("lastTickPosX", true, Double.TYPE);
    public final BG aF = this.b("lastTickPosY", true, Double.TYPE);
    public final BG e = this.b("lastTickPosZ", true, Double.TYPE);
    public final BG aD;
    public final BG aH = this.b("height", true, Float.TYPE);
    public final BG A;
    public final BG Q;
    public final BG ab;
    public final BG ap;
    public final BG aB;
    public final BG l;
    public final BG f;
    public final BG aa;
    public final BG ar;
    public final BG aA;
    public final BG ah;
    public final BG aE;
    public final BG M;
    public final BG aw;
    private final BG aq;
    private final BG as;
    private final BG O;
    private final BG q;
    private final BG k;
    private final BG R;
    private final BG aJ;
    private final BG ak;
    private final bP S;
    private final bP ae;
    private final bP K;
    private final bP al;
    private final bP aj;
    private final bP ao;
    private final bP aI;
    private final bP Z;
    private final bP ax;
    private final bP v;
    private final bP N;
    private final bP av;
    private final bP z;
    private final bP r;
    private final bP w;
    private final bP U;
    private final bP aC;
    private final bP g;
    private final bP x;
    public bP H;
    public bP u;
    public bP C;
    public bP at;
    public bP h;
    public bP m;
    public bP W;
    public bP au;
    public bP ag;
    public bP a;
    public bP E;
    public bP I;
    public bP F;
    public bP ai;
    private bP X;
    private BG ad;
    private BG o;
    private bP an;
    private bP ay;
    private bP G;
    private bP D;
    private bP T;
    private bP t;
    private BG Y;
    private BG B;
    private BG J;
    private static int L;

    public i_() {
        super(A5.ba);
        this.aD = this.b("width", true, Float.TYPE);
        this.A = this.b("prevRotationYaw", true, Float.TYPE);
        this.Q = this.b("prevRotationPitch", true, Float.TYPE);
        this.q = this.b("prevPosX", true, Double.TYPE);
        this.k = this.b("prevPosY", true, Double.TYPE);
        this.R = this.b("prevPosZ", true, Double.TYPE);
        this.ab = this.b("boundingBox", true, A5.b4);
        this.ap = this.b("ridingEntity", true, A5.ba);
        this.aB = this.b("rand", true, Random.class);
        this.f = this.b("noClip", true, Boolean.TYPE);
        this.aa = this.b("isInWeb", true, Boolean.TYPE);
        this.i = this.b("fallDistance", true, Float.TYPE);
        this.l = this.b("hurtResistantTime", true, Integer.TYPE);
        this.ak = this.b("entityUniqueID", true, UUID.class);
        if (manthe.V.c() == 13) {
            this.Y = this.b("field_70135_K", false, Boolean.TYPE);
            this.B = this.b("yOffset", true, Float.TYPE);
            this.J = this.b("ySize", true, Float.TYPE);
            this.ay = this.a("updateFallState", true, Void.TYPE, Double.TYPE, Boolean.TYPE);
            this.t = this.a("func_145780_a", false, Void.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, A5.F);
            this.v = this.a("func_145748_c_", false, A5.bG, new Class[0]);
            this.av = this.a("copyDataFrom", true, Void.TYPE, A5.ba, Boolean.TYPE);
        } else {
            if (manthe.V.c() < 23) {
                this.ay = this.a("updateFallState", true, Void.TYPE, Double.TYPE, Boolean.TYPE, A5.F, A5.ao);
            }
            this.T = this.a("playStepSound", true, Void.TYPE, A5.ao, A5.F);
            this.v = this.a("getDisplayName", true, A5.bG, new Class[0]);
            this.av = this.a("copyDataFromOld", true, Void.TYPE, A5.ba);
            this.au = this.a("getEntityBoundingBox", true, A5.b4, new Class[0]);
        }
        if (manthe.V.c() >= 23) {
            this.ar = this.b("world", true, A5.r);
            this.a = this.a("func_70091_d", false, Void.TYPE, A5.bd, Double.TYPE, Double.TYPE, Double.TYPE);
        } else {
            this.ar = this.b("worldObj", true, A5.r);
            this.ad = this.b("fire", true, Integer.TYPE);
            this.o = this.b("fireResistance", true, Integer.TYPE);
            this.G = this.a("playSound", true, Void.TYPE, String.class, Float.TYPE, Float.TYPE);
            this.D = this.a("getSwimSound", true, String.class, new Class[0]);
            this.a = this.a("moveEntity", true, Void.TYPE, Double.TYPE, Double.TYPE, Double.TYPE);
        }
        this.aA = this.b("stepHeight", true, Float.TYPE);
        this.ah = this.b("isCollidedHorizontally", true, Boolean.TYPE);
        this.aE = this.b("isCollidedVertically", true, Boolean.TYPE);
        this.M = this.b("isCollided", true, Boolean.TYPE);
        this.aJ = this.b("prevDistanceWalkedModified", true, Float.TYPE);
        this.aq = this.b("distanceWalkedModified", true, Float.TYPE);
        this.as = this.b("distanceWalkedOnStepModified", true, Float.TYPE);
        this.O = this.b("nextStepDistance", true, Integer.TYPE);
        this.aw = manthe.V.c() >= 23 ? this.b("serverPosY", true, Long.TYPE) : this.b("serverPosY", true, Integer.TYPE);
        this.u = this.a("getDistanceToEntity", true, Float.TYPE, A5.ba);
        this.C = this.a("isSprinting", true, Boolean.TYPE, new Class[0]);
        this.x = this.a("isBurning", true, Boolean.TYPE, new Class[0]);
        this.at = this.a("isInvisible", true, Boolean.TYPE, new Class[0]);
        this.h = this.a("isRiding", true, Boolean.TYPE, new Class[0]);
        this.F = this.a("isSneaking", true, Boolean.TYPE, new Class[0]);
        this.H = this.a(manthe.V.c() == 13 ? "getCommandSenderName" : "getName", true, String.class, new Class[0]);
        this.m = this.a("canBeCollidedWith", true, Boolean.TYPE, new Class[0]);
        this.W = this.a("getCollisionBorderSize", true, Float.TYPE, new Class[0]);
        this.g = this.a("isOffsetPositionInLiquid", true, Boolean.TYPE, Double.TYPE, Double.TYPE, Double.TYPE);
        if (!cy.c) {
            this.an = this.a("canRiderInteract", false, Boolean.TYPE, new Class[0]);
        }
        this.I = this.a("setVelocity", true, Void.TYPE, Double.TYPE, Double.TYPE, Double.TYPE);
        this.S = this.a("getEyeHeight", true, Float.TYPE, new Class[0]);
        this.ae = this.a("canTriggerWalking", true, Boolean.TYPE, new Class[0]);
        this.K = this.a("isInWater", true, Boolean.TYPE, new Class[0]);
        this.al = manthe.V.c() > 13 ? this.a("isInLava", true, Boolean.TYPE, new Class[0]) : this.a("handleLavaMovement", true, Boolean.TYPE, new Class[0]);
        this.aj = this.a("func_145775_I", cy.c, Void.TYPE, new Class[0]);
        this.ao = this.a("isWet", true, Boolean.TYPE, new Class[0]);
        this.aI = this.a("dealFireDamage", true, Void.TYPE, Integer.TYPE);
        this.Z = this.a("setFire", true, Void.TYPE, Integer.TYPE);
        this.ax = this.a("setFlag", true, Void.TYPE, Integer.TYPE, Boolean.TYPE);
        this.N = this.a("getUniqueID", true, UUID.class, new Class[0]);
        this.z = this.a("setPositionAndRotation", true, Void.TYPE, Double.TYPE, Double.TYPE, Double.TYPE, Float.TYPE, Float.TYPE);
        this.r = this.a("setAngles", true, Void.TYPE, Float.TYPE, Float.TYPE);
        this.w = this.a("<init>", false, Void.TYPE, A5.r);
        this.U = this.a("setInvisible", true, Void.TYPE, Boolean.TYPE);
        this.aC = this.a("setPosition", true, Void.TYPE, Double.TYPE, Double.TYPE, Double.TYPE);
        this.ag = this.a("setSprinting", true, Void.TYPE, Boolean.TYPE);
        this.E = this.a("setSneaking", true, Void.TYPE, Boolean.TYPE);
        this.ai = this.a("onUpdate", true, Void.TYPE, new Class[0]);
        this.X = this.a("moveFlying", true, Void.TYPE, Float.TYPE, Float.TYPE, Float.TYPE);
    }

    private void d(Object object, double d10, double d11, double d12) {
        this.I.p(object, d10, d11, d12);
    }

    private boolean b(Object object, double d10, double d11, double d12) {
        return this.g.h(object, d10, d11, d12);
    }

    private void a(Object object, Object object2, double d10, double d11, double d12) {
        this.a.p(object, object2, d10, d11, d12);
    }

    private void c(Object object, double d10, double d11, double d12) {
        this.a.p(object, d10, d11, d12);
    }

    private void a(Object object, float f10, float f11, float f12) {
        this.X.p(object, Float.valueOf(f10), Float.valueOf(f11), Float.valueOf(f12));
    }

    private int af(Object object) {
        return this.az.c(object);
    }

    private double s(Object object) {
        return this.y.g(object);
    }

    private double J(Object object) {
        return this.V.g(object);
    }

    private double t(Object object) {
        return this.n.g(object);
    }

    private double g(Object object) {
        return this.aG.g(object);
    }

    private double ac(Object object) {
        return this.p.g(object);
    }

    private double d(Object object) {
        return this.P.g(object);
    }

    private void j(Object object, double d10) {
        this.aG.a(object, d10);
    }

    private void f(Object object, double d10) {
        this.p.a(object, d10);
    }

    private void l(Object object, double d10) {
        this.P.a(object, d10);
    }

    private void a(Object object, float f10) {
        this.j.a(object, f10);
    }

    private void b(Object object, float f10) {
        this.ac.a(object, f10);
    }

    private void j(Object object, float f10) {
        this.A.a(object, f10);
    }

    private void e(Object object, float f10) {
        this.Q.a(object, f10);
    }

    private float V(Object object) {
        return this.j.b(object);
    }

    private float f(Object object) {
        return this.ac.b(object);
    }

    private float Q(Object object) {
        return this.A.b(object);
    }

    private float n(Object object) {
        return this.Q.b(object);
    }

    private String q(Object object) {
        return (String)this.H.e(object, new Object[0]);
    }

    private float a(Object object, Object object2) {
        return this.u.f(object, object2);
    }

    private boolean i(Object object) {
        return this.af.d(object);
    }

    private void g(Object object, boolean bl) {
        this.af.a(object, bl);
    }

    private float W(Object object) {
        return this.i.b(object);
    }

    private void i(Object object, float f10) {
        this.i.a(object, f10);
    }

    private int ah(Object object) {
        return this.l.c(object);
    }

    private boolean aa(Object object) {
        return this.am.d(object);
    }

    private int O(Object object) {
        return this.d.c(object);
    }

    private boolean aj(Object object) {
        return this.C.h(object, new Object[0]);
    }

    private boolean S(Object object) {
        return this.F.h(object, new Object[0]);
    }

    private boolean Z(Object object) {
        return this.at.h(object, new Object[0]);
    }

    private boolean z(Object object) {
        return this.h.h(object, new Object[0]);
    }

    private boolean k(Object object) {
        return this.x.h(object, new Object[0]);
    }

    private double A(Object object) {
        return this.s.g(object);
    }

    private void e(Object object, double d10) {
        this.s.a(object, d10);
    }

    private double E(Object object) {
        return this.aF.g(object);
    }

    private void i(Object object, double d10) {
        this.aF.a(object, d10);
    }

    private double T(Object object) {
        return this.e.g(object);
    }

    private void g(Object object, double d10) {
        this.e.a(object, d10);
    }

    private float e(Object object) {
        return this.aH.b(object);
    }

    private float M(Object object) {
        return this.aD.b(object);
    }

    private Object w(Object object) {
        return this.ab.f(object);
    }

    private boolean ai(Object object) {
        return this.m.h(object, new Object[0]);
    }

    private float h(Object object) {
        return this.W.f(object, new Object[0]);
    }

    private Object x(Object object) {
        return this.ap.f(object);
    }

    private boolean L(Object object) {
        return this.an.h(object, new Object[0]);
    }

    private float B(Object object) {
        return this.S.f(object, new Object[0]);
    }

    private Random ab(Object object) {
        return (Random)this.aB.f(object);
    }

    private boolean v(Object object) {
        return this.f.d(object);
    }

    private void h(Object object, boolean bl) {
        this.f.a(object, bl);
    }

    private void a(Object object, double d10) {
        this.y.a(object, d10);
    }

    private void d(Object object, double d10) {
        this.V.a(object, d10);
    }

    private void c(Object object, double d10) {
        this.n.a(object, d10);
    }

    private float P(Object object) {
        return this.B.b(object);
    }

    private float D(Object object) {
        return this.J.b(object);
    }

    private void c(Object object, float f10) {
        this.J.a(object, f10);
    }

    private boolean F(Object object) {
        return this.aa.d(object);
    }

    private void f(Object object, boolean bl) {
        this.aa.a(object, bl);
    }

    private Object Y(Object object) {
        return this.ar.f(object);
    }

    private boolean C(Object object) {
        return this.Y.d(object);
    }

    private float y(Object object) {
        return this.aA.b(object);
    }

    private void h(Object object, float f10) {
        this.aA.a(object, f10);
    }

    private boolean I(Object object) {
        return this.ah.d(object);
    }

    private boolean R(Object object) {
        return this.aE.d(object);
    }

    private void a(Object object, boolean bl) {
        this.ah.a(object, bl);
    }

    private void c(Object object, boolean bl) {
        this.aE.a(object, bl);
    }

    private void e(Object object, boolean bl) {
        this.M.a(object, bl);
    }

    private void a(Object object, double d10, boolean bl) {
        this.ay.p(object, d10, bl);
    }

    private void a(Object object, double d10, boolean bl, Object object2, Object object3) {
        this.ay.p(object, d10, bl, object2, object3);
    }

    private boolean N(Object object) {
        return this.ae.h(object, new Object[0]);
    }

    private float l(Object object) {
        return this.aq.b(object);
    }

    private float ad(Object object) {
        return this.as.b(object);
    }

    private void g(Object object, float f10) {
        this.aq.a(object, f10);
    }

    private float b(Object object) {
        return this.aJ.b(object);
    }

    private void d(Object object, float f10) {
        this.aJ.a(object, f10);
    }

    private void f(Object object, float f10) {
        this.as.a(object, f10);
    }

    private int o(Object object) {
        return this.O.c(object);
    }

    private void c(Object object, int n6) {
        this.O.a(object, n6);
    }

    private boolean ak(Object object) {
        return this.K.h(object, new Object[0]);
    }

    private boolean u(Object object) {
        return this.al.h(object, new Object[0]);
    }

    private void a(Object object, String string, float f10, float f11) {
        this.G.p(object, string, Float.valueOf(f10), Float.valueOf(f11));
    }

    private String a(Object object) {
        return (String)this.D.e(object, new Object[0]);
    }

    private void a(Object object, int n6, int n10, int n11, Object object2) {
        this.t.p(object, n6, n10, n11, object2);
    }

    private void r(Object object) {
        this.aj.p(object, new Object[0]);
    }

    private boolean K(Object object) {
        return this.ao.h(object, new Object[0]);
    }

    private void a(Object object, int n6) {
        this.aI.p(object, n6);
    }

    private int U(Object object) {
        return this.ad.c(object);
    }

    private void d(Object object, int n6) {
        this.ad.a(object, n6);
    }

    private void b(Object object, int n6) {
        this.Z.p(object, n6);
    }

    private int p(Object object) {
        return this.o.c(object);
    }

    private void c(Object object, Object object2) {
        this.ab.a(object, object2);
    }

    private void a(Object object, Object object2, Object object3) {
        this.T.p(object, object2, object3);
    }

    private double ag(Object object) {
        return this.q.g(object);
    }

    private double H(Object object) {
        return this.k.g(object);
    }

    private double m(Object object) {
        return this.R.g(object);
    }

    private void h(Object object, double d10) {
        this.q.a(object, d10);
    }

    private void k(Object object, double d10) {
        this.k.a(object, d10);
    }

    private void b(Object object, double d10) {
        this.R.a(object, d10);
    }

    private void a(Object object, int n6, boolean bl) {
        this.ax.p(object, n6, bl);
    }

    private Object X(Object object) {
        return this.v.e(object, new Object[0]);
    }

    private UUID c(Object object) {
        return (UUID)this.N.e(object, new Object[0]);
    }

    private void a(Object object, UUID uUID) {
        this.ak.a(object, uUID);
    }

    private void a(Object object, Object object2, boolean bl) {
        if (manthe.V.c() >= 15) {
            this.av.p(object, object2);
        } else {
            this.av.p(object, object2, bl);
        }
    }

    private void a(Object object, double d10, double d11, double d12, float f10, float f11) {
        this.z.p(object, d10, d11, d12, Float.valueOf(f10), Float.valueOf(f11));
    }

    private void a(Object object, float f10, float f11) {
        this.r.p(object, Float.valueOf(f10), Float.valueOf(f11));
    }

    private Object G(Object object) {
        return this.w.a(object);
    }

    private Object ae(Object object) {
        return this.au.e(object, new Object[0]);
    }

    private void d(Object object, boolean bl) {
        this.U.p(object, bl);
    }

    private void a(Object object, double d10, double d11, double d12) {
        this.aC.p(object, d10, d11, d12);
    }

    private void b(Object object, boolean bl) {
        this.E.p(object, bl);
    }

    private long j(Object object) {
        return manthe.V.c() >= 23 ? this.aw.l(object) : (long)this.aw.c(object);
    }

    private void b(Object object, Object object2) {
        this.ap.a(object, object2);
    }

    static Object V(i_ i_2, Object object) {
        return i_2.G(object);
    }

    static String E(i_ i_2, Object object) {
        return i_2.q(object);
    }

    static int I(i_ i_2, Object object) {
        return i_2.af(object);
    }

    static double S(i_ i_2, Object object) {
        return i_2.s(object);
    }

    static void g(i_ i_2, Object object, double d10) {
        i_2.a(object, d10);
    }

    static double aj(i_ i_2, Object object) {
        return i_2.J(object);
    }

    static void a(i_ i_2, Object object, double d10) {
        i_2.d(object, d10);
    }

    static double ai(i_ i_2, Object object) {
        return i_2.t(object);
    }

    static void f(i_ i_2, Object object, double d10) {
        i_2.c(object, d10);
    }

    static double e(i_ i_2, Object object) {
        return i_2.g(object);
    }

    static void h(i_ i_2, Object object, double d10) {
        i_2.j(object, d10);
    }

    static double ak(i_ i_2, Object object) {
        return i_2.ac(object);
    }

    static void j(i_ i_2, Object object, double d10) {
        i_2.f(object, d10);
    }

    static double p(i_ i_2, Object object) {
        return i_2.d(object);
    }

    static void k(i_ i_2, Object object, double d10) {
        i_2.l(object, d10);
    }

    static float K(i_ i_2, Object object) {
        return i_2.V(object);
    }

    static void i(i_ i_2, Object object, float f10) {
        i_2.a(object, f10);
    }

    static float ae(i_ i_2, Object object) {
        return i_2.f(object);
    }

    static void c(i_ i_2, Object object, float f10) {
        i_2.b(object, f10);
    }

    static float T(i_ i_2, Object object) {
        return i_2.Q(object);
    }

    static void e(i_ i_2, Object object, float f10) {
        i_2.j(object, f10);
    }

    static float g(i_ i_2, Object object) {
        return i_2.n(object);
    }

    static void h(i_ i_2, Object object, float f10) {
        i_2.e(object, f10);
    }

    static float a(i_ i_2, Object object, Object object2) {
        return i_2.a(object, object2);
    }

    static boolean x(i_ i_2, Object object) {
        return i_2.i(object);
    }

    static void d(i_ i_2, Object object, boolean bl) {
        i_2.g(object, bl);
    }

    static boolean U(i_ i_2, Object object) {
        return i_2.k(object);
    }

    static boolean G(i_ i_2, Object object) {
        return i_2.aa(object);
    }

    static int Y(i_ i_2, Object object) {
        return i_2.O(object);
    }

    static boolean d(i_ i_2, Object object) {
        return i_2.S(object);
    }

    static void f(i_ i_2, Object object, boolean bl) {
        i_2.b(object, bl);
    }

    static boolean aa(i_ i_2, Object object) {
        return i_2.aj(object);
    }

    static boolean ah(i_ i_2, Object object) {
        return i_2.Z(object);
    }

    static void b(i_ i_2, Object object, boolean bl) {
        i_2.d(object, bl);
    }

    static boolean y(i_ i_2, Object object) {
        return i_2.z(object);
    }

    static double m(i_ i_2, Object object) {
        return i_2.A(object);
    }

    static void e(i_ i_2, Object object, double d10) {
        i_2.e(object, d10);
    }

    static double L(i_ i_2, Object object) {
        return i_2.E(object);
    }

    static void d(i_ i_2, Object object, double d10) {
        i_2.i(object, d10);
    }

    static double b(i_ i_2, Object object) {
        return i_2.T(object);
    }

    static void c(i_ i_2, Object object, double d10) {
        i_2.g(object, d10);
    }

    static float af(i_ i_2, Object object) {
        return i_2.e(object);
    }

    static float W(i_ i_2, Object object) {
        return i_2.M(object);
    }

    static Object s(i_ i_2, Object object) {
        return i_2.w(object);
    }

    static void c(i_ i_2, Object object, Object object2) {
        i_2.c(object, object2);
    }

    static boolean w(i_ i_2, Object object) {
        return i_2.ai(object);
    }

    static float ab(i_ i_2, Object object) {
        return i_2.h(object);
    }

    static Object F(i_ i_2, Object object) {
        return i_2.x(object);
    }

    static void b(i_ i_2, Object object, Object object2) {
        i_2.b(object, object2);
    }

    static boolean Q(i_ i_2, Object object) {
        return i_2.L(object);
    }

    static float h(i_ i_2, Object object) {
        return i_2.B(object);
    }

    static Random ad(i_ i_2, Object object) {
        return i_2.ab(object);
    }

    static boolean k(i_ i_2, Object object) {
        return i_2.v(object);
    }

    static void a(i_ i_2, Object object, boolean bl) {
        i_2.h(object, bl);
    }

    static float N(i_ i_2, Object object) {
        return i_2.P(object);
    }

    static float l(i_ i_2, Object object) {
        return i_2.D(object);
    }

    static void d(i_ i_2, Object object, float f10) {
        i_2.c(object, f10);
    }

    static boolean C(i_ i_2, Object object) {
        return i_2.F(object);
    }

    static void g(i_ i_2, Object object, boolean bl) {
        i_2.f(object, bl);
    }

    static Object n(i_ i_2, Object object) {
        return i_2.Y(object);
    }

    static float u(i_ i_2, Object object) {
        return i_2.W(object);
    }

    static void f(i_ i_2, Object object, float f10) {
        i_2.i(object, f10);
    }

    static int D(i_ i_2, Object object) {
        return i_2.ah(object);
    }

    static boolean J(i_ i_2, Object object) {
        return i_2.C(object);
    }

    static float H(i_ i_2, Object object) {
        return i_2.y(object);
    }

    static void a(i_ i_2, Object object, float f10) {
        i_2.h(object, f10);
    }

    static void h(i_ i_2, Object object, boolean bl) {
        i_2.a(object, bl);
    }

    static void c(i_ i_2, Object object, boolean bl) {
        i_2.c(object, bl);
    }

    static void e(i_ i_2, Object object, boolean bl) {
        i_2.e(object, bl);
    }

    static boolean O(i_ i_2, Object object) {
        return i_2.I(object);
    }

    static boolean r(i_ i_2, Object object) {
        return i_2.R(object);
    }

    static void a(i_ i_2, Object object, double d10, boolean bl) {
        i_2.a(object, d10, bl);
    }

    static void a(i_ i_2, Object object, double d10, boolean bl, Object object2, Object object3) {
        i_2.a(object, d10, bl, object2, object3);
    }

    static boolean f(i_ i_2, Object object) {
        return i_2.N(object);
    }

    static float o(i_ i_2, Object object) {
        return i_2.l(object);
    }

    static void j(i_ i_2, Object object, float f10) {
        i_2.g(object, f10);
    }

    static float B(i_ i_2, Object object) {
        return i_2.b(object);
    }

    static void b(i_ i_2, Object object, float f10) {
        i_2.d(object, f10);
    }

    static float M(i_ i_2, Object object) {
        return i_2.ad(object);
    }

    static void g(i_ i_2, Object object, float f10) {
        i_2.f(object, f10);
    }

    static int X(i_ i_2, Object object) {
        return i_2.o(object);
    }

    static void c(i_ i_2, Object object, int n6) {
        i_2.c(object, n6);
    }

    static boolean t(i_ i_2, Object object) {
        return i_2.ak(object);
    }

    static boolean R(i_ i_2, Object object) {
        return i_2.u(object);
    }

    static void a(i_ i_2, Object object, String string, float f10, float f11) {
        i_2.a(object, string, f10, f11);
    }

    static String P(i_ i_2, Object object) {
        return i_2.a(object);
    }

    static void a(i_ i_2, Object object, int n6, int n10, int n11, Object object2) {
        i_2.a(object, n6, n10, n11, object2);
    }

    static void a(i_ i_2, Object object) {
        i_2.r(object);
    }

    static boolean i(i_ i_2, Object object) {
        return i_2.K(object);
    }

    static void b(i_ i_2, Object object, int n6) {
        i_2.a(object, n6);
    }

    static int ac(i_ i_2, Object object) {
        return i_2.U(object);
    }

    static void a(i_ i_2, Object object, int n6) {
        i_2.b(object, n6);
    }

    static void d(i_ i_2, Object object, int n6) {
        i_2.d(object, n6);
    }

    static int A(i_ i_2, Object object) {
        return i_2.p(object);
    }

    static void a(i_ i_2, Object object, Object object2, Object object3) {
        i_2.a(object, object2, object3);
    }

    static double Z(i_ i_2, Object object) {
        return i_2.ag(object);
    }

    static void i(i_ i_2, Object object, double d10) {
        i_2.h(object, d10);
    }

    static double q(i_ i_2, Object object) {
        return i_2.H(object);
    }

    static void b(i_ i_2, Object object, double d10) {
        i_2.k(object, d10);
    }

    static double v(i_ i_2, Object object) {
        return i_2.m(object);
    }

    static void l(i_ i_2, Object object, double d10) {
        i_2.b(object, d10);
    }

    static void a(i_ i_2, Object object, int n6, boolean bl) {
        i_2.a(object, n6, bl);
    }

    static Object z(i_ i_2, Object object) {
        return i_2.X(object);
    }

    static UUID j(i_ i_2, Object object) {
        return i_2.c(object);
    }

    static void a(i_ i_2, Object object, UUID uUID) {
        i_2.a(object, uUID);
    }

    static void a(i_ i_2, Object object, Object object2, boolean bl) {
        i_2.a(object, object2, bl);
    }

    static void a(i_ i_2, Object object, double d10, double d11, double d12, float f10, float f11) {
        i_2.a(object, d10, d11, d12, f10, f11);
    }

    static void a(i_ i_2, Object object, float f10, float f11) {
        i_2.a(object, f10, f11);
    }

    static Object c(i_ i_2, Object object) {
        return i_2.ae(object);
    }

    static void c(i_ i_2, Object object, double d10, double d11, double d12) {
        i_2.a(object, d10, d11, d12);
    }

    static long ag(i_ i_2, Object object) {
        return i_2.j(object);
    }

    static void a(i_ i_2, Object object, Object object2, double d10, double d11, double d12) {
        i_2.a(object, object2, d10, d11, d12);
    }

    static void a(i_ i_2, Object object, double d10, double d11, double d12) {
        i_2.c(object, d10, d11, d12);
    }

    static void a(i_ i_2, Object object, float f10, float f11, float f12) {
        i_2.a(object, f10, f11, f12);
    }

    static void b(i_ i_2, Object object, double d10, double d11, double d12) {
        i_2.d(object, d10, d11, d12);
    }

    static boolean d(i_ i_2, Object object, double d10, double d11, double d12) {
        return i_2.b(object, d10, d11, d12);
    }

    public static void a(int n6) {
        L = n6;
    }

    public static int d() {
        return L;
    }

    public static int e() {
        int n6 = i_.d();
        if (n6 == 0) {
            return 125;
        }
        return 0;
    }

    private static CodeAttribute$RuntimeCopyException a(CodeAttribute$RuntimeCopyException codeAttribute$RuntimeCopyException) {
        return codeAttribute$RuntimeCopyException;
    }

    static {
        if (i_.d() == 0) {
            i_.a(16);
        }
    }
}

