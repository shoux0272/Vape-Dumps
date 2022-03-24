/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.gK;

public class oC {
    public double b;
    public double a;
    public double d;
    private static String[] c;

    public oC() {
        this.b = 0.0;
        this.a = 0.0;
        this.d = 0.0;
    }

    public oC(gK gK2) {
        this.b = gK2.g();
        this.a = gK2.h();
        this.d = gK2.f();
    }

    public oC(double d10, double d11, double d12) {
        this.b = d10;
        this.a = d11;
        this.d = d12;
    }

    public double a() {
        return this.b;
    }

    public void b(double d10) {
        this.b = d10;
    }

    public double b() {
        return this.a;
    }

    public void a(double d10) {
        this.a = d10;
    }

    public double d() {
        return this.d;
    }

    public void c(double d10) {
        this.d = d10;
    }

    public void a(float f10) {
        float f11 = (float)Math.cos(f10);
        float f12 = (float)Math.sin(f10);
        double d10 = this.b;
        double d11 = this.a * (double)f11 + this.d * (double)f12;
        double d12 = this.d * (double)f11 - this.a * (double)f12;
        this.b = d10;
        this.a = d11;
        this.d = d12;
    }

    public void b(float f10) {
        float f11 = (float)Math.cos(f10);
        float f12 = (float)Math.sin(f10);
        double d10 = this.b * (double)f11 + this.d * (double)f12;
        double d11 = this.a;
        double d12 = this.d * (double)f11 - this.b * (double)f12;
        this.b = d10;
        this.a = d11;
        this.d = d12;
    }

    public static void b(String[] arrstring) {
        c = arrstring;
    }

    public static String[] c() {
        return c;
    }

    static {
        if (oC.c() != null) {
            oC.b(new String[2]);
        }
    }
}

