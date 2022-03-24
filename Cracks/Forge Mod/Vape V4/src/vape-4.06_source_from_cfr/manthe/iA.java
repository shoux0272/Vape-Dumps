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

public class iA
extends gJ {
    private final bP B = this.a("<init>", false, Void.TYPE, A5.r, A5.al);
    private final BG h = this.b("inventory", true, A5.aj);
    private final BG e = this.b("inventoryContainer", true, A5.aS);
    private final BG j = this.b("capabilities", true, A5.c6);
    private final BG C = this.b("openContainer", true, A5.aS);
    private final BG l = this.b("fishEntity", true, A5.c5);
    private final BG u = this.b("sleeping", true, Boolean.TYPE);
    private final BG m = this.b("field_71094_bP", true, Double.TYPE);
    private final BG q = this.b("field_71095_bQ", true, Double.TYPE);
    private final BG A = this.b("field_71085_bR", true, Double.TYPE);
    private final BG f = this.b("field_71091_bM", true, Double.TYPE);
    private final BG p = this.b("field_71096_bN", true, Double.TYPE);
    private final BG y = this.b("field_71097_bO", true, Double.TYPE);
    private final bP k;
    private final bP x;
    private final bP w;
    private final bP s;
    private final bP E;
    private final bP r;
    private final bP n;
    private final bP a;
    private final bP v;
    private final bP t;
    private final bP g;
    private bP z;
    private bP i;
    private bP d;
    private bP o;
    private bP D;

    public iA() {
        super(A5.cc);
        if (V.c() >= 23) {
            this.D = this.a("resetCooldown", true, Void.TYPE, new Class[0]);
            this.o = this.a("getCooledAttackStrength", true, Float.TYPE, Float.TYPE);
            this.s = this.a(A5.cF, "getHeldItemMainhand", true, A5.bT, new Class[0]);
            this.n = this.a(A5.cF, "isActiveItemStackBlocking", true, Boolean.TYPE, new Class[0]);
            this.a = this.a(A5.cF, "getItemInUseCount", true, Integer.TYPE, new Class[0]);
            this.v = this.a(A5.u, "isHandActive", true, Boolean.TYPE, new Class[0]);
            this.t = this.a(A5.cF, "getItemInUseMaxCount", true, Integer.TYPE, new Class[0]);
        } else {
            this.s = this.a("getCurrentEquippedItem", true, A5.bT, new Class[0]);
            this.n = this.a("isBlocking", true, Boolean.TYPE, new Class[0]);
            this.a = this.a("getItemInUseCount", true, Integer.TYPE, new Class[0]);
            this.v = this.a("isUsingItem", true, Boolean.TYPE, new Class[0]);
            this.i = this.a("setItemInUse", true, Void.TYPE, A5.bT, Integer.TYPE);
            this.t = this.a("getItemInUseDuration", true, Integer.TYPE, new Class[0]);
        }
        this.g = this.a("getAIMoveSpeed", true, Float.TYPE, new Class[0]);
        this.k = this.a("closeScreen", true, Void.TYPE, new Class[0]);
        this.x = this.a("attackTargetEntityWithCurrentItem", true, Void.TYPE, A5.ba);
        this.w = this.a("getFoodStats", true, A5.o, new Class[0]);
        this.E = this.a("getTeam", true, A5.dJ, new Class[0]);
        this.r = this.a("getGameProfile", true, A5.al, new Class[0]);
        if (!cy.c) {
            this.z = this.a("refreshDisplayName", false, Void.TYPE, new Class[0]);
        }
    }

    private Object a(Object object, Object object2) {
        return this.B.a(new Object[]{object, object2});
    }

    private float x(Object object) {
        return this.g.f(object, new Object[0]);
    }

    private boolean y(Object object) {
        return this.u.d(object);
    }

    private void d(Object object) {
        this.k.p(object, new Object[0]);
    }

    private void a(Object object, Object object2, int n6) {
        this.i.p(object, object2, n6);
    }

    private void e(Object object) {
    }

    public Object f(Object object) {
        return this.h.f(object);
    }

    private Object n(Object object) {
        return this.e.f(object);
    }

    private void b(Object object, Object object2) {
        this.x.p(object, object2);
    }

    private Object p(Object object) {
        return this.l.f(object);
    }

    private int g(Object object) {
        return this.t.o(object, new Object[0]);
    }

    private Object s(Object object) {
        return this.w.e(object, new Object[0]);
    }

    private Object c(Object object) {
        return this.s.e(object, new Object[0]);
    }

    private float a(Object object, float f10) {
        return this.o.f(object, Float.valueOf(f10));
    }

    private void o(Object object) {
        this.D.p(object, new Object[0]);
    }

    private Object m(Object object) {
        return this.E.e(object, new Object[0]);
    }

    private Object w(Object object) {
        return this.r.e(object, new Object[0]);
    }

    private Object i(Object object) {
        return this.j.f(object);
    }

    private Object q(Object object) {
        return this.C.f(object);
    }

    private boolean j(Object object) {
        return this.n.h(object, new Object[0]);
    }

    private void a(Object object) {
        this.z.p(object, new Object[0]);
    }

    private int k(Object object) {
        return this.a.o(object, new Object[0]);
    }

    private boolean h(Object object) {
        return this.v.h(object, new Object[0]);
    }

    private double u(Object object) {
        return this.m.g(object);
    }

    private double l(Object object) {
        return this.q.g(object);
    }

    private double t(Object object) {
        return this.A.g(object);
    }

    private double v(Object object) {
        return this.f.g(object);
    }

    private double r(Object object) {
        return this.p.g(object);
    }

    private double b(Object object) {
        return this.y.g(object);
    }

    private void c(Object object, double d10) {
        this.m.a(object, d10);
    }

    private void f(Object object, double d10) {
        this.q.a(object, d10);
    }

    private void a(Object object, double d10) {
        this.A.a(object, d10);
    }

    private void d(Object object, double d10) {
        this.f.a(object, d10);
    }

    private void b(Object object, double d10) {
        this.p.a(object, d10);
    }

    private void e(Object object, double d10) {
        this.y.a(object, d10);
    }

    static Object b(iA iA2, Object object, Object object2) {
        return iA2.a(object, object2);
    }

    static float i(iA iA2, Object object) {
        return iA2.x(object);
    }

    static boolean g(iA iA2, Object object) {
        return iA2.y(object);
    }

    static void h(iA iA2, Object object) {
        iA2.d(object);
    }

    static void a(iA iA2, Object object, Object object2, int n6) {
        iA2.a(object, object2, n6);
    }

    static int l(iA iA2, Object object) {
        return iA2.g(object);
    }

    static Object v(iA iA2, Object object) {
        return iA2.n(object);
    }

    static void a(iA iA2, Object object, Object object2) {
        iA2.b(object, object2);
    }

    static Object m(iA iA2, Object object) {
        return iA2.p(object);
    }

    static Object s(iA iA2, Object object) {
        return iA2.s(object);
    }

    static Object u(iA iA2, Object object) {
        return iA2.c(object);
    }

    static Object a(iA iA2, Object object) {
        return iA2.w(object);
    }

    static Object b(iA iA2, Object object) {
        return iA2.m(object);
    }

    static Object f(iA iA2, Object object) {
        return iA2.i(object);
    }

    static Object w(iA iA2, Object object) {
        return iA2.q(object);
    }

    static float a(iA iA2, Object object, float f10) {
        return iA2.a(object, f10);
    }

    static void k(iA iA2, Object object) {
        iA2.o(object);
    }

    static boolean n(iA iA2, Object object) {
        return iA2.j(object);
    }

    static boolean c(iA iA2, Object object) {
        return iA2.h(object);
    }

    static void r(iA iA2, Object object) {
        iA2.a(object);
    }

    static int e(iA iA2, Object object) {
        return iA2.k(object);
    }

    static double j(iA iA2, Object object) {
        return iA2.u(object);
    }

    static void f(iA iA2, Object object, double d10) {
        iA2.c(object, d10);
    }

    static double d(iA iA2, Object object) {
        return iA2.l(object);
    }

    static void b(iA iA2, Object object, double d10) {
        iA2.f(object, d10);
    }

    static double p(iA iA2, Object object) {
        return iA2.t(object);
    }

    static void c(iA iA2, Object object, double d10) {
        iA2.a(object, d10);
    }

    static double o(iA iA2, Object object) {
        return iA2.v(object);
    }

    static void d(iA iA2, Object object, double d10) {
        iA2.d(object, d10);
    }

    static double t(iA iA2, Object object) {
        return iA2.r(object);
    }

    static void e(iA iA2, Object object, double d10) {
        iA2.b(object, d10);
    }

    static double q(iA iA2, Object object) {
        return iA2.b(object);
    }

    static void a(iA iA2, Object object, double d10) {
        iA2.e(object, d10);
    }
}

