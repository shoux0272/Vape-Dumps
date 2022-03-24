/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.A5;
import manthe.BG;
import manthe.V;
import manthe.bP;
import manthe.gJ;

public class he
extends gJ {
    private final bP g;
    private final BG p = this.b("movementInput", true, A5.d1);
    public bP e;
    public bP k;
    public bP d;
    private BG j;
    private BG f;
    private BG q;
    private BG r;
    private BG i;
    private BG o;
    private BG h;
    private BG n;
    private BG m;
    private BG l;
    private static String a;

    public he() {
        super(A5.u);
        if (V.c() > 13) {
            if (V.c() >= 23) {
                this.j = this.b("field_191988_bg", false, Float.TYPE);
                this.f = this.b("connection", true, A5.dV);
            } else {
                this.f = this.b("sendQueue", true, A5.dV);
            }
            this.q = this.b("lastReportedPosX", true, Double.TYPE);
            this.r = this.b("lastReportedPosY", true, Double.TYPE);
            this.i = this.b("lastReportedPosZ", true, Double.TYPE);
            this.o = this.b("lastReportedYaw", true, Float.TYPE);
            this.h = this.b("lastReportedPitch", true, Float.TYPE);
            this.n = this.b("serverSneakState", true, Boolean.TYPE);
            this.m = this.b("serverSprintState", true, Boolean.TYPE);
            this.l = this.b("positionUpdateTicks", true, Integer.TYPE);
            this.e = this.a("sendChatMessage", true, Void.TYPE, String.class);
            this.k = this.a("onUpdateWalkingPlayer", true, Void.TYPE, new Class[0]);
        }
        this.g = this.a("setSprinting", true, Void.TYPE, Boolean.TYPE);
        this.d = this.a("playSound", true, Void.TYPE, String.class, Float.TYPE, Float.TYPE);
    }

    public float c(Object object) {
        return this.j.b(object);
    }

    public void c(Object object, float f10) {
        this.j.a(object, f10);
    }

    public Object b(Object object) {
        return this.p.f(object);
    }

    private Object a(Object object) {
        return this.f.f(object);
    }

    private double d(Object object) {
        return this.q.g(object);
    }

    private double j(Object object) {
        return this.r.g(object);
    }

    private double f(Object object) {
        return this.i.g(object);
    }

    private float h(Object object) {
        return this.o.b(object);
    }

    private float e(Object object) {
        return this.h.b(object);
    }

    private boolean g(Object object) {
        return this.n.d(object);
    }

    private boolean k(Object object) {
        return this.m.d(object);
    }

    private void b(Object object, double d10) {
        this.q.a(object, d10);
    }

    private void a(Object object, double d10) {
        this.r.a(object, d10);
    }

    private void c(Object object, double d10) {
        this.i.a(object, d10);
    }

    private void a(Object object, float f10) {
        this.o.a(object, f10);
    }

    private void b(Object object, float f10) {
        this.h.a(object, f10);
    }

    private void a(Object object, boolean bl) {
        this.n.a(object, bl);
    }

    private void c(Object object, boolean bl) {
        this.m.a(object, bl);
    }

    private int i(Object object) {
        return this.l.c(object);
    }

    private void a(Object object, int n6) {
        this.l.a(object, n6);
    }

    private void b(Object object, boolean bl) {
        this.g.p(object, bl);
    }

    private void a(Object object, String string) {
        this.e.p(object, string);
    }

    static Object g(he he2, Object object) {
        return he2.a(object);
    }

    static double a(he he2, Object object) {
        return he2.d(object);
    }

    static void a(he he2, Object object, double d10) {
        he2.b(object, d10);
    }

    static double i(he he2, Object object) {
        return he2.j(object);
    }

    static void b(he he2, Object object, double d10) {
        he2.a(object, d10);
    }

    static double c(he he2, Object object) {
        return he2.f(object);
    }

    static void c(he he2, Object object, double d10) {
        he2.c(object, d10);
    }

    static float b(he he2, Object object) {
        return he2.h(object);
    }

    static void a(he he2, Object object, float f10) {
        he2.a(object, f10);
    }

    static float f(he he2, Object object) {
        return he2.e(object);
    }

    static void b(he he2, Object object, float f10) {
        he2.b(object, f10);
    }

    static boolean e(he he2, Object object) {
        return he2.g(object);
    }

    static void b(he he2, Object object, boolean bl) {
        he2.a(object, bl);
    }

    static boolean d(he he2, Object object) {
        return he2.k(object);
    }

    static void a(he he2, Object object, boolean bl) {
        he2.c(object, bl);
    }

    static int h(he he2, Object object) {
        return he2.i(object);
    }

    static void a(he he2, Object object, int n6) {
        he2.a(object, n6);
    }

    static void c(he he2, Object object, boolean bl) {
        he2.b(object, bl);
    }

    static void a(he he2, Object object, String string) {
        he2.a(object, string);
    }

    public static void b(String string) {
        a = string;
    }

    public static String d() {
        return a;
    }

    static {
        if (he.d() == null) {
            he.b("gUzzvb");
        }
    }
}

