/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package manthe;

import a.a;
import java.awt.Color;
import manthe.V;
import manthe.Y;
import manthe.cB;
import manthe.dR;
import manthe.ds;
import manthe.eJ;
import manthe.ef;
import manthe.ex;
import manthe.mA;
import manthe.o7;
import manthe.on;
import manthe.qN;
import manthe.tV;
import manthe.tW;
import org.lwjgl.opengl.GL11;

public class ac {
    private static final mA a;
    private static final mA b;
    private static final boolean c;
    private static final qN d;

    public static void a(double d10, double d11, double d12, double d13, double d14, double d15, double d16, Color color) {
        ef ef2 = ds.r();
        dR dR2 = ds.m();
        eJ eJ2 = ds.k();
        ds.M().a(0.0);
        GL11.glPushMatrix();
        GL11.glTranslated((double)d10, (double)(d11 + 1.4), (double)d12);
        GL11.glNormal3d((double)0.0, (double)1.0, (double)0.0);
        double d17 = 0.0;
        double d18 = d13 - ds.k().z();
        double d19 = d15 - ds.k().g();
        if (d19 > 0.0 && d18 > 0.0) {
            d17 = Math.toDegrees(-Math.atan(d18 / d19));
        } else if (d19 > 0.0 && d18 < 0.0) {
            d17 = Math.toDegrees(-Math.atan(d18 / d19));
        } else if (d19 < 0.0 && d18 > 0.0) {
            d17 = -90.0 + Math.toDegrees(Math.atan(d19 / d18));
        } else if (d19 < 0.0 && d18 < 0.0) {
            d17 = 90.0 + Math.toDegrees(Math.atan(d19 / d18));
        }
        GL11.glRotated((double)(-d17), (double)0.0, (double)1.0, (double)0.0);
        double d20 = d14 - eJ2.l() + d16 / 2.0 + 0.2;
        if (cB.h) {
            d20 = d14 - 0.3 - eJ2.l();
        }
        double d21 = d15 - eJ2.g();
        double d22 = Y.e(d18 * d18 + d21 * d21);
        float f10 = (float)(-(Math.atan2(d20, d22) * 180.0 / Math.PI));
        GL11.glRotated((double)f10, (double)1.0, (double)0.0, (double)0.0);
        GL11.glDisable((int)2896);
        GL11.glDisable((int)2929);
        double d23 = 0.5;
        double d24 = -1.0;
        GL11.glEnable((int)3042);
        GL11.glDisable((int)3553);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glEnable((int)2848);
        GL11.glPushMatrix();
        GL11.glColor4d((double)((float)color.getRed() / 255.0f), (double)((float)color.getGreen() / 255.0f), (double)((float)color.getBlue() / 255.0f), (double)((float)color.getAlpha() / 255.0f));
        GL11.glLineWidth((float)3.0f);
        GL11.glBegin((int)2);
        GL11.glVertex2d((double)(-d23), (double)(-d24));
        GL11.glVertex2d((double)d23, (double)(-d24));
        GL11.glVertex2d((double)d23, (double)d24);
        GL11.glVertex2d((double)(-d23), (double)d24);
        GL11.glEnd();
        GL11.glEnable((int)2929);
        GL11.glBegin((int)2);
        GL11.glVertex2d((double)(-d23), (double)(-d24));
        GL11.glVertex2d((double)d23, (double)(-d24));
        GL11.glVertex2d((double)d23, (double)d24);
        GL11.glVertex2d((double)(-d23), (double)d24);
        GL11.glEnd();
        GL11.glPopMatrix();
        GL11.glEnable((int)3553);
        GL11.glDisable((int)3042);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        GL11.glEnable((int)2896);
        GL11.glPopMatrix();
        ds.M().b(0.0);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
    }

    public static void a(double d10, double d11, double d12, double d13, double d14, double d15, double d16, Color color, Color color2, double d17, double d18, double d19) {
        double d20;
        double d21;
        double d22;
        double d23;
        double d24;
        double d25;
        if (color2 != null) {
            GL11.glColor4d((double)((float)color2.getRed() / 255.0f), (double)((float)color2.getGreen() / 255.0f), (double)((float)color2.getBlue() / 255.0f), (double)((float)color2.getAlpha() / 255.0f));
            b.c();
            d25 = d10 + d13 - d17;
            d24 = d10 - d17;
            d23 = d11 + d14 - d18;
            d22 = d11 - d18;
            d21 = d12 + d15 - d19;
            d20 = d12 - d19;
            b.a(d24, d22, d20);
            b.a(d24, d23, d20);
            b.a(d25, d22, d20);
            b.a(d25, d23, d20);
            b.a(d25, d22, d21);
            b.a(d25, d23, d21);
            b.a(d24, d22, d21);
            b.a(d24, d23, d21);
            b.a(d25, d23, d20);
            b.a(d25, d22, d20);
            b.a(d24, d23, d20);
            b.a(d24, d22, d20);
            b.a(d24, d23, d21);
            b.a(d24, d22, d21);
            b.a(d25, d23, d21);
            b.a(d25, d22, d21);
            b.a(d24, d23, d20);
            b.a(d25, d23, d20);
            b.a(d25, d23, d21);
            b.a(d24, d23, d21);
            b.a(d24, d23, d20);
            b.a(d24, d23, d21);
            b.a(d25, d23, d21);
            b.a(d25, d23, d20);
            b.a(d24, d22, d20);
            b.a(d25, d22, d20);
            b.a(d25, d22, d21);
            b.a(d24, d22, d21);
            b.a(d24, d22, d20);
            b.a(d24, d22, d21);
            b.a(d25, d22, d21);
            b.a(d25, d22, d20);
            b.a(d24, d22, d20);
            b.a(d24, d23, d20);
            b.a(d24, d22, d21);
            b.a(d24, d23, d21);
            b.a(d25, d22, d21);
            b.a(d25, d23, d21);
            b.a(d25, d22, d20);
            b.a(d25, d23, d20);
            b.a(d24, d23, d21);
            b.a(d24, d22, d21);
            b.a(d24, d23, d20);
            b.a(d24, d22, d20);
            b.a(d25, d23, d20);
            b.a(d25, d22, d20);
            b.a(d25, d23, d21);
            b.a(d25, d22, d21);
            b.a();
        }
        if (color != null) {
            GL11.glColor4d((double)((float)color.getRed() / 255.0f), (double)((float)color.getGreen() / 255.0f), (double)((float)color.getBlue() / 255.0f), (double)((float)color.getAlpha() / 255.0f));
            a.c();
            d25 = d10 + d13 - d17;
            d24 = d10 - d17;
            d23 = d11 + d14 - d18;
            d22 = d11 - d18;
            d21 = d12 + d15 - d19;
            d20 = d12 - d19;
            a.a(d24, d22, d20);
            a.a(d25, d22, d20);
            a.a(d24, d22, d21);
            a.a(d25, d22, d21);
            a.a(d24, d22, d20);
            a.a(d24, d22, d21);
            a.a(d25, d22, d20);
            a.a(d25, d22, d21);
            a.a(d24, d23, d20);
            a.a(d25, d23, d20);
            a.a(d24, d23, d21);
            a.a(d25, d23, d21);
            a.a(d24, d23, d20);
            a.a(d24, d23, d21);
            a.a(d25, d23, d20);
            a.a(d25, d23, d21);
            a.a(d24, d22, d20);
            a.a(d24, d23, d20);
            a.a(d24, d22, d21);
            a.a(d24, d23, d21);
            a.a(d25, d22, d21);
            a.a(d25, d23, d21);
            a.a(d25, d22, d20);
            a.a(d25, d23, d20);
            a.a();
        }
    }

    public static void a(tV tV2, double d10, double d11, double d12) {
        ac.a(tV2.a, tV2.b, tV2.f, 1.0, 1.0, 1.0, 0.1, tV2.c, null, d10, d11, d12);
    }

    public static void a(double d10, double d11, double d12, tV tV2) {
        tW tW2;
        GL11.glColor4d((double)((float)tV2.c.getRed() / 255.0f), (double)((float)tV2.c.getGreen() / 255.0f), (double)((float)tV2.c.getBlue() / 255.0f), (double)((float)tV2.c.getAlpha() / 255.0f));
        b.c();
        double d13 = (double)(tV2.a + 1) - d10;
        double d14 = (double)tV2.a - d10;
        double d15 = (double)(tV2.b + 1) - d11;
        double d16 = (double)tV2.b - d11;
        double d17 = (double)(tV2.f + 1) - d12;
        double d18 = (double)tV2.f - d12;
        b.a(d14, d16, d18);
        b.a(d14, d15, d18);
        b.a(d13, d16, d18);
        b.a(d13, d15, d18);
        b.a(d13, d16, d17);
        b.a(d13, d15, d17);
        b.a(d14, d16, d17);
        b.a(d14, d15, d17);
        b.a(d13, d15, d18);
        b.a(d13, d16, d18);
        b.a(d14, d15, d18);
        b.a(d14, d16, d18);
        b.a(d14, d15, d17);
        b.a(d14, d16, d17);
        b.a(d13, d15, d17);
        b.a(d13, d16, d17);
        b.a(d14, d15, d18);
        b.a(d13, d15, d18);
        b.a(d13, d15, d17);
        b.a(d14, d15, d17);
        b.a(d14, d15, d18);
        b.a(d14, d15, d17);
        b.a(d13, d15, d17);
        b.a(d13, d15, d18);
        b.a(d14, d16, d18);
        b.a(d13, d16, d18);
        b.a(d13, d16, d17);
        b.a(d14, d16, d17);
        b.a(d14, d16, d18);
        b.a(d14, d16, d17);
        b.a(d13, d16, d17);
        b.a(d13, d16, d18);
        b.a(d14, d16, d18);
        b.a(d14, d15, d18);
        b.a(d14, d16, d17);
        b.a(d14, d15, d17);
        b.a(d13, d16, d17);
        b.a(d13, d15, d17);
        b.a(d13, d16, d18);
        b.a(d13, d15, d18);
        b.a(d14, d15, d17);
        b.a(d14, d16, d17);
        b.a(d14, d15, d18);
        b.a(d14, d16, d18);
        b.a(d13, d15, d18);
        b.a(d13, d16, d18);
        b.a(d13, d15, d17);
        b.a(d13, d16, d17);
        b.a();
        if (tV2 instanceof tW && (tW2 = (tW)tV2).c() > 0.0f) {
            GL11.glColor4d((double)((double)(255 - tW2.c.getRed()) / 255.0), (double)((255.0 - (double)tW2.c.getGreen()) / 255.0), (double)((255.0 - (double)tW2.c.getBlue()) / 255.0), (double)0.7);
            GL11.glLineWidth((float)3.0f);
            a.c();
            a.a(d14, d16, d18);
            a.a(d14, d15, d18);
            a.a(d13, d16, d18);
            a.a(d13, d15, d18);
            a.a(d14, d16, d17);
            a.a(d14, d15, d17);
            a.a(d13, d16, d17);
            a.a(d13, d15, d17);
            a.a(d13, d16, d18);
            a.a(d13, d16, d17);
            a.a(d13, d15, d18);
            a.a(d13, d15, d17);
            a.a(d14, d16, d18);
            a.a(d14, d16, d17);
            a.a(d14, d15, d18);
            a.a(d14, d15, d17);
            a.a(d14, d16, d18);
            a.a(d13, d16, d18);
            a.a(d14, d15, d18);
            a.a(d13, d15, d18);
            a.a(d14, d16, d17);
            a.a(d13, d16, d17);
            a.a(d14, d15, d17);
            a.a(d13, d15, d17);
            a.a();
        }
    }

    public static void a(ex ex2, double d10, Color color, Color color2, float f10) {
        ef ef2 = ds.r();
        double d11 = ef2.m();
        double d12 = ef2.n();
        double d13 = ef2.j();
        double d14 = ex2.T() + (ex2.z() - ex2.T()) * (double)f10;
        double d15 = ex2.R() + (ex2.l() - ex2.R()) * (double)f10;
        double d16 = ex2.X() + (ex2.g() - ex2.X()) * (double)f10;
        GL11.glPushMatrix();
        ds.M().a(1.0);
        GL11.glEnable((int)3042);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glLineWidth((float)1.5f);
        GL11.glDisable((int)3553);
        GL11.glEnable((int)2848);
        GL11.glDisable((int)2929);
        GL11.glDepthMask((boolean)false);
        double d17 = 0.15;
        ac.a(d14 - (double)(ex2.A() / 2.0f) - d17, d15, d16 - (double)(ex2.A() / 2.0f) - d17, (double)ex2.A() + d17 * 2.0, ex2.n(), (double)ex2.A() + d17 * 2.0, d10, color, color2, d11, d12, d13);
        GL11.glDepthMask((boolean)true);
        GL11.glEnable((int)2929);
        GL11.glEnable((int)3553);
        GL11.glDisable((int)2848);
        GL11.glDisable((int)3042);
        ds.M().b(1.0);
        GL11.glPopMatrix();
    }

    public static void a(String string, double d10, double d11, double d12, double d13, double d14, int n6, Color color, double d15) {
        ef ef2 = ds.r();
        dR dR2 = ds.m();
        ds.M().a(0.0);
        GL11.glPushMatrix();
        GL11.glTranslated((double)d10, (double)(d11 + d15), (double)d12);
        GL11.glNormal3d((double)0.0, (double)1.0, (double)0.0);
        GL11.glRotated((double)(-ef2.i()), (double)0.0, (double)1.0, (double)0.0);
        GL11.glRotated((double)ef2.g(), (double)1.0, (double)0.0, (double)0.0);
        float f10 = d14 / 5.0 <= 2.0 ? 2.0f : (float)(d14 / 5.0);
        float f11 = (float)(0.01666666753590107 * ((double)f10 * d13));
        GL11.glScaled((double)(-f11), (double)(-f11), (double)f11);
        boolean bl = GL11.glIsEnabled((int)2896);
        if (bl) {
            GL11.glDisable((int)2896);
        }
        int n10 = dR2.c(string) / 2;
        int n11 = -(dR2.b(string) - 1);
        o7.a((double)(-n10) - 2.0, (double)n11 - 2.0, (double)n10 + 2.0, 2.0, color);
        GL11.glDisable((int)2929);
        o7.a((double)(-n10) - 2.0, (double)n11 - 2.0, (double)n10 + 2.0, 2.0, color);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        dR2.c(string, (double)(-n10), (double)n11 + 0.1, n6);
        GL11.glEnable((int)2929);
        dR2.c(string, (double)(-n10), (double)n11 + 0.1, n6);
        if (bl) {
            GL11.glEnable((int)2896);
        }
        GL11.glEnable((int)2929);
        GL11.glPopMatrix();
        ds.M().b(0.0);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
    }

    public static Color a(Color color) {
        int n6 = color.getRGB();
        n6 = 0xFFFFFF - n6;
        return new Color(n6);
    }

    public static double[] a(double d10, double d11, double d12) {
        return a.a.trn(d10, d11, d12);
    }

    static {
        c = V.c() > 13;
        d = new qN("#.#");
        a = on.p.y();
        b = new mA();
        b.a(48, 7);
    }
}

