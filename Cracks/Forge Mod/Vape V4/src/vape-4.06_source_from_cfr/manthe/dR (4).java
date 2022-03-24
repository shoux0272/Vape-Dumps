/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package manthe;

import java.awt.Color;
import manthe.V;
import manthe.cy;
import manthe.gz;
import org.lwjgl.opengl.GL11;

public class dR
extends cy {
    public dR(Object object) {
        super(object);
    }

    public int d(String string, double d10, double d11, int n6) {
        if (V.c() > 13) {
            return dR.a.M().bC.a(this.b, string, (float)d10, (float)d11, n6);
        }
        return dR.a.M().bC.a(this.b, string, (int)d10, (int)d11, n6);
    }

    public int d(String string, double d10, double d11, Color color) {
        return this.d(string, d10, d11, color.getRGB());
    }

    public int c(String string, double d10, double d11, int n6) {
        return dR.a.M().bC.b(this.b, string, (int)d10, (int)d11, n6);
    }

    public int c(String string, double d10, double d11, Color color) {
        return this.c(string, d10, d11, color.getRGB());
    }

    public int a(String string, double d10, double d11, int n6, double d12) {
        double d13 = 1.0 / d12;
        GL11.glScaled((double)d12, (double)d12, (double)d12);
        int n10 = this.c(string, d10 * d13, d11 * d13, n6);
        GL11.glScaled((double)d13, (double)d13, (double)d13);
        return n10;
    }

    public int c(String string) {
        return dR.a.M().bC.a(this.b, string);
    }

    public int a(String string, double d10, double d11, int n6) {
        return this.c(string, (double)((int)d10 - this.c(string) / 2), (double)((int)d11), n6);
    }

    public int b(String string, double d10, double d11, int n6) {
        return this.d(string, d10 - (double)(this.c(string) / 2), d11, n6);
    }

    public int a(String string, double d10, double d11, Color color) {
        return this.a(string, d10, d11, color.getRGB());
    }

    public int b(String string, double d10, double d11, Color color) {
        return this.b(string, d10, d11, color.getRGB());
    }

    public int f() {
        return dR.a.M().bC.d(this.b);
    }

    public int h() {
        return this.f() / 2;
    }

    public gz g() {
        return new gz(dR.a.M().bC.a(this.b));
    }

    public int b(String string) {
        return this.f();
    }

    public double a(String string) {
        return this.h();
    }

    public float a(Object object) {
        return dR.a.M().bC.c(object);
    }

    public float b(Object object) {
        return dR.a.M().bC.b(object);
    }

    public void c(Object object, float f10) {
        dR.a.M().bC.c(object, f10);
    }

    public void a(Object object, float f10) {
        dR.a.M().bC.a(object, f10);
    }

    public void b(Object object, float f10) {
        dR.a.M().bC.b(object, f10);
    }
}

