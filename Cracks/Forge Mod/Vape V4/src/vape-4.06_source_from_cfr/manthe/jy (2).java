/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.A5;
import manthe.BG;
import manthe.V;
import manthe.gJ;

public class jy
extends gJ {
    private final BG j;
    private final BG a;
    private final BG i = this.b("jump", true, Boolean.TYPE);
    private final BG f = this.b("sneak", true, Boolean.TYPE);
    private BG d;
    private BG e;
    private BG g;
    private BG h;

    public jy() {
        super(A5.d1);
        this.j = this.b("moveStrafe", true, Float.TYPE);
        if (V.c() >= 23) {
            this.d = this.b("forwardKeyDown", true, Boolean.TYPE);
            this.e = this.b("backKeyDown", true, Boolean.TYPE);
            this.g = this.b("leftKeyDown", true, Boolean.TYPE);
            this.h = this.b("rightKeyDown", true, Boolean.TYPE);
            this.a = this.b("field_192832_b", false, Float.TYPE);
        } else {
            this.a = this.b("moveForward", true, Float.TYPE);
        }
    }

    private boolean a(Object object) {
        return this.d.d(object);
    }

    private void b(Object object, boolean bl) {
        this.d.a(object, bl);
    }

    private boolean e(Object object) {
        return this.e.d(object);
    }

    private void e(Object object, boolean bl) {
        this.e.a(object, bl);
    }

    private boolean c(Object object) {
        return this.g.d(object);
    }

    private void f(Object object, boolean bl) {
        this.g.a(object, bl);
    }

    private boolean d(Object object) {
        return this.d.d(object);
    }

    private void c(Object object, boolean bl) {
        this.h.a(object, bl);
    }

    private boolean b(Object object) {
        return this.i.d(object);
    }

    private boolean h(Object object) {
        return this.f.d(object);
    }

    private void d(Object object, boolean bl) {
        this.i.a(object, bl);
    }

    private void a(Object object, boolean bl) {
        this.f.a(object, bl);
    }

    private float g(Object object) {
        return this.j.b(object);
    }

    private float f(Object object) {
        return this.a.b(object);
    }

    private void b(Object object, float f10) {
        this.j.a(object, f10);
    }

    private void a(Object object, float f10) {
        this.a.a(object, f10);
    }

    static boolean g(jy jy2, Object object) {
        return jy2.a(object);
    }

    static void b(jy jy2, Object object, boolean bl) {
        jy2.b(object, bl);
    }

    static boolean a(jy jy2, Object object) {
        return jy2.e(object);
    }

    static void d(jy jy2, Object object, boolean bl) {
        jy2.e(object, bl);
    }

    static boolean e(jy jy2, Object object) {
        return jy2.c(object);
    }

    static void a(jy jy2, Object object, boolean bl) {
        jy2.f(object, bl);
    }

    static boolean f(jy jy2, Object object) {
        return jy2.d(object);
    }

    static void c(jy jy2, Object object, boolean bl) {
        jy2.c(object, bl);
    }

    static float c(jy jy2, Object object) {
        return jy2.g(object);
    }

    static void a(jy jy2, Object object, float f10) {
        jy2.b(object, f10);
    }

    static float h(jy jy2, Object object) {
        return jy2.f(object);
    }

    static void b(jy jy2, Object object, float f10) {
        jy2.a(object, f10);
    }

    static boolean d(jy jy2, Object object) {
        return jy2.b(object);
    }

    static void f(jy jy2, Object object, boolean bl) {
        jy2.d(object, bl);
    }

    static boolean b(jy jy2, Object object) {
        return jy2.h(object);
    }

    static void e(jy jy2, Object object, boolean bl) {
        jy2.a(object, bl);
    }
}

