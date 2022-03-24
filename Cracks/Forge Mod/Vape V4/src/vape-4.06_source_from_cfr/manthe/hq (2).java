/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.A5;
import manthe.BG;
import manthe.bP;
import manthe.gJ;

public class hq
extends gJ {
    private final bP f;
    private final BG l = this.b("sendQueue", true, A5.dV);
    private final BG d = this.b("wasSprinting", true, Boolean.TYPE);
    private final BG i = this.b("wasSneaking", true, Boolean.TYPE);
    private final BG e = this.b("oldPosX", true, Double.TYPE);
    private final BG a = this.b("oldMinY", true, Double.TYPE);
    private final BG n = this.b("oldPosY", true, Double.TYPE);
    private final BG g = this.b("oldPosZ", true, Double.TYPE);
    private final BG j = this.b("oldRotationYaw", true, Float.TYPE);
    private final BG o = this.b("oldRotationPitch", true, Float.TYPE);
    private final BG m = this.b("ticksSinceMovePacket", true, Integer.TYPE);
    private final BG h = this.b("wasOnGround", true, Boolean.TYPE);
    public bP k;

    public hq() {
        super(A5.cv);
        this.f = this.a("sendChatMessage", true, Void.TYPE, String.class);
        this.k = this.a("sendMotionUpdates", true, Void.TYPE, new Class[0]);
    }

    private Object h(Object object) {
        return this.l.f(object);
    }

    private boolean i(Object object) {
        return this.d.d(object);
    }

    private void c(Object object, boolean bl) {
        this.d.a(object, bl);
    }

    private boolean c(Object object) {
        return this.i.d(object);
    }

    private void b(Object object, boolean bl) {
        this.i.a(object, bl);
    }

    private double g(Object object) {
        return this.e.g(object);
    }

    private void a(Object object, double d10) {
        this.e.a(object, d10);
    }

    private double d(Object object) {
        return this.a.g(object);
    }

    private void b(Object object, double d10) {
        this.a.a(object, d10);
    }

    private double a(Object object) {
        return this.n.g(object);
    }

    private void c(Object object, double d10) {
        this.n.a(object, d10);
    }

    private double e(Object object) {
        return this.g.g(object);
    }

    private void d(Object object, double d10) {
        this.g.a(object, d10);
    }

    private float b(Object object) {
        return this.j.b(object);
    }

    private void b(Object object, float f10) {
        this.j.a(object, f10);
    }

    private float f(Object object) {
        return this.o.b(object);
    }

    private void a(Object object, float f10) {
        this.o.a(object, f10);
    }

    private int j(Object object) {
        return this.m.c(object);
    }

    private void a(Object object, int n6) {
        this.m.a(object, n6);
    }

    private void a(Object object, boolean bl) {
        this.h.a(object, bl);
    }

    private void a(Object object, String string) {
        this.f.p(object, string);
    }

    static Object i(hq hq2, Object object) {
        return hq2.h(object);
    }

    static boolean e(hq hq2, Object object) {
        return hq2.i(object);
    }

    static void c(hq hq2, Object object, boolean bl) {
        hq2.c(object, bl);
    }

    static boolean c(hq hq2, Object object) {
        return hq2.c(object);
    }

    static void a(hq hq2, Object object, boolean bl) {
        hq2.b(object, bl);
    }

    static double b(hq hq2, Object object) {
        return hq2.g(object);
    }

    static void c(hq hq2, Object object, double d10) {
        hq2.a(object, d10);
    }

    static double g(hq hq2, Object object) {
        return hq2.d(object);
    }

    static void d(hq hq2, Object object, double d10) {
        hq2.b(object, d10);
    }

    static double d(hq hq2, Object object) {
        return hq2.a(object);
    }

    static void b(hq hq2, Object object, double d10) {
        hq2.c(object, d10);
    }

    static double a(hq hq2, Object object) {
        return hq2.e(object);
    }

    static void a(hq hq2, Object object, double d10) {
        hq2.d(object, d10);
    }

    static float f(hq hq2, Object object) {
        return hq2.b(object);
    }

    static void a(hq hq2, Object object, float f10) {
        hq2.b(object, f10);
    }

    static float j(hq hq2, Object object) {
        return hq2.f(object);
    }

    static void b(hq hq2, Object object, float f10) {
        hq2.a(object, f10);
    }

    static int h(hq hq2, Object object) {
        return hq2.j(object);
    }

    static void a(hq hq2, Object object, int n6) {
        hq2.a(object, n6);
    }

    static void b(hq hq2, Object object, boolean bl) {
        hq2.a(object, bl);
    }

    static void a(hq hq2, Object object, String string) {
        hq2.a(object, string);
    }
}

