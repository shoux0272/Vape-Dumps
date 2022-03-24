/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.A5;
import manthe.BG;
import manthe.V;
import manthe.bP;
import manthe.cM;
import manthe.gJ;

public class jU
extends gJ {
    private final BG d;
    private final bP q = this.a("removeAttributesModifiersFromEntity", true, Void.TYPE, A5.cF, A5.de, Integer.TYPE);
    private final bP i;
    private final bP k;
    private BG o;
    private BG j;
    private BG g;
    private BG l;
    private BG e;
    private BG f;
    private BG n;
    private BG r;
    private BG s;
    private BG m;
    private BG a;
    private BG t;
    private bP h;
    private bP p;

    public jU() {
        super(A5.c2);
        if (V.c() >= 23) {
            this.t = this.a("REGISTRY", true, A5.bm);
            this.h = this.b("getPotionById", true, A5.c2, Integer.TYPE);
            this.p = this.b("getIdFromPotion", true, Integer.TYPE, A5.c2);
        } else {
            this.n = this.a("fireResistance", true, A5.c2);
            this.e = this.a("regeneration", true, A5.c2);
            this.f = this.a("resistance", true, A5.c2);
            this.a = this.a("damageBoost", true, A5.c2);
            this.o = this.a("moveSpeed", true, A5.c2);
            this.s = this.a("blindness", true, A5.c2);
            this.j = this.a("moveSlowdown", true, A5.c2);
            this.r = this.a("jump", true, A5.c2);
            this.l = this.a("heal", true, A5.c2);
            this.g = this.a("potionTypes", true, cM.b(A5.c2));
            this.m = this.b("id", true, Integer.TYPE);
        }
        this.i = this.a("hasStatusIcon", true, Boolean.TYPE, new Class[0]);
        this.k = this.a("getStatusIconIndex", true, Integer.TYPE, new Class[0]);
        this.d = this.b("isBadEffect", true, Boolean.TYPE);
    }

    private boolean a(Object object) {
        return this.i.h(object, new Object[0]);
    }

    private int d(Object object) {
        return this.k.o(object, new Object[0]);
    }

    private Object i() {
        return this.o.f(null);
    }

    private Object e() {
        return this.j.f(null);
    }

    private void a(Object object, Object object2, Object object3, int n6) {
        this.q.p(object, object2, object3, n6);
    }

    private Object[] l() {
        return this.g.e(null);
    }

    private boolean e(Object object) {
        return this.d.d(object);
    }

    private Object j() {
        return this.l.f(null);
    }

    private Object m() {
        return this.e.f(null);
    }

    private Object f() {
        return this.n.f(null);
    }

    private Object h() {
        return this.f.f(null);
    }

    private Object g() {
        return this.r.f(null);
    }

    private Object n() {
        return this.s.f(null);
    }

    private int c(Object object) {
        return this.m.c(object);
    }

    private Object a(int n6) {
        return this.h.e(null, n6);
    }

    private Object k() {
        return this.t.f(null);
    }

    private int b(Object object) {
        return this.p.o(null, object);
    }

    public Object d() {
        return this.a.f(null);
    }

    static Object a(jU jU2, int n6) {
        return jU2.a(n6);
    }

    static Object f(jU jU2) {
        return jU2.i();
    }

    static Object g(jU jU2) {
        return jU2.e();
    }

    static Object h(jU jU2) {
        return jU2.j();
    }

    static Object a(jU jU2) {
        return jU2.m();
    }

    static Object i(jU jU2) {
        return jU2.h();
    }

    static Object e(jU jU2) {
        return jU2.f();
    }

    static Object c(jU jU2) {
        return jU2.g();
    }

    static Object j(jU jU2) {
        return jU2.n();
    }

    static Object b(jU jU2) {
        return jU2.k();
    }

    static Object[] d(jU jU2) {
        return jU2.l();
    }

    static boolean a(jU jU2, Object object) {
        return jU2.a(object);
    }

    static int d(jU jU2, Object object) {
        return jU2.d(object);
    }

    static boolean c(jU jU2, Object object) {
        return jU2.e(object);
    }

    static int b(jU jU2, Object object) {
        return jU2.b(object);
    }

    static int e(jU jU2, Object object) {
        return jU2.c(object);
    }

    static void a(jU jU2, Object object, Object object2, Object object3, int n6) {
        jU2.a(object, object2, object3, n6);
    }
}

