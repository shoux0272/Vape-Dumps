/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import a.a;
import java.awt.Color;
import org.lwjgl.opengl.GL11;

public class iReSqtkUVgoCkiReSqtkUVg {
    private static iReSqtkUVgQBHiReSqtkUVg a;
    private static iReSqtkUVgQBHiReSqtkUVg b;
    private static boolean c;
    private static iReSqtkUVgLcXiReSqtkUVg d;

    public static void a(double d2, double d3, double d4, double d5, double d6, double d7, double d8, Color color) {
        iReSqtkUVgvwXiReSqtkUVg iReSqtkUVgvwXiReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.s();
        iReSqtkUVgpeziReSqtkUVg iReSqtkUVgpeziReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.h();
        iReSqtkUVgtlXiReSqtkUVg iReSqtkUVgtlXiReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.e();
        iReSqtkUVgeLLiReSqtkUVg.n().a(0.0);
        GL11.glPushMatrix();
        GL11.glTranslated((double)d2, (double)(d3 + 1.4), (double)d4);
        GL11.glNormal3d((double)0.0, (double)1.0, (double)0.0);
        double d9 = 0.0;
        double d10 = d5 - iReSqtkUVgeLLiReSqtkUVg.e().z();
        double d11 = d7 - iReSqtkUVgeLLiReSqtkUVg.e().B();
        if (d11 > 0.0 && d10 > 0.0) {
            d9 = Math.toDegrees(-Math.atan(d10 / d11));
        } else if (d11 > 0.0 && d10 < 0.0) {
            d9 = Math.toDegrees(-Math.atan(d10 / d11));
        } else if (d11 < 0.0 && d10 > 0.0) {
            d9 = -90.0 + Math.toDegrees(Math.atan(d11 / d10));
        } else if (d11 < 0.0 && d10 < 0.0) {
            d9 = 90.0 + Math.toDegrees(Math.atan(d11 / d10));
        }
        GL11.glRotated((double)(-d9), (double)0.0, (double)1.0, (double)0.0);
        double d12 = d6 - iReSqtkUVgtlXiReSqtkUVg2.A() + d8 / 2.0 + 0.2;
        if (iReSqtkUVgVUTiReSqtkUVg.a) {
            d12 = d6 - 0.3 - iReSqtkUVgtlXiReSqtkUVg2.A();
        }
        double d13 = d7 - iReSqtkUVgtlXiReSqtkUVg2.B();
        double d14 = iReSqtkUVgKexiReSqtkUVg.a(d10 * d10 + d13 * d13);
        float f = (float)(-(Math.atan2(d12, d14) * 180.0 / Math.PI));
        GL11.glRotated((double)f, (double)1.0, (double)0.0, (double)0.0);
        GL11.glDisable((int)2896);
        GL11.glDisable((int)2929);
        double d15 = 0.5;
        double d16 = -1.0;
        GL11.glEnable((int)3042);
        GL11.glDisable((int)3553);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glEnable((int)2848);
        GL11.glPushMatrix();
        GL11.glColor4d((double)((float)color.getRed() / 255.0f), (double)((float)color.getGreen() / 255.0f), (double)((float)color.getBlue() / 255.0f), (double)((float)color.getAlpha() / 255.0f));
        GL11.glLineWidth((float)3.0f);
        GL11.glBegin((int)2);
        GL11.glVertex2d((double)(-d15), (double)(-d16));
        GL11.glVertex2d((double)d15, (double)(-d16));
        GL11.glVertex2d((double)d15, (double)d16);
        GL11.glVertex2d((double)(-d15), (double)d16);
        GL11.glEnd();
        GL11.glEnable((int)2929);
        GL11.glBegin((int)2);
        GL11.glVertex2d((double)(-d15), (double)(-d16));
        GL11.glVertex2d((double)d15, (double)(-d16));
        GL11.glVertex2d((double)d15, (double)d16);
        GL11.glVertex2d((double)(-d15), (double)d16);
        GL11.glEnd();
        GL11.glPopMatrix();
        GL11.glEnable((int)3553);
        GL11.glDisable((int)3042);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        GL11.glEnable((int)2896);
        GL11.glPopMatrix();
        iReSqtkUVgeLLiReSqtkUVg.n().b(0.0);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
    }

    public static void a(double d2, double d3, double d4, double d5, double d6, double d7, double d8, Color color, Color color2, double d9, double d10, double d11) {
        double d12;
        double d13;
        double d14;
        double d15;
        double d16;
        double d17;
        if (color2 != null) {
            GL11.glColor4d((double)((float)color2.getRed() / 255.0f), (double)((float)color2.getGreen() / 255.0f), (double)((float)color2.getBlue() / 255.0f), (double)((float)color2.getAlpha() / 255.0f));
            b.b();
            d17 = d2 + d5 - d9;
            d16 = d2 - d9;
            d15 = d3 + d6 - d10;
            d14 = d3 - d10;
            d13 = d4 + d7 - d11;
            d12 = d4 - d11;
            b.a(d16, d14, d12);
            b.a(d16, d15, d12);
            b.a(d17, d14, d12);
            b.a(d17, d15, d12);
            b.a(d17, d14, d13);
            b.a(d17, d15, d13);
            b.a(d16, d14, d13);
            b.a(d16, d15, d13);
            b.a(d17, d15, d12);
            b.a(d17, d14, d12);
            b.a(d16, d15, d12);
            b.a(d16, d14, d12);
            b.a(d16, d15, d13);
            b.a(d16, d14, d13);
            b.a(d17, d15, d13);
            b.a(d17, d14, d13);
            b.a(d16, d15, d12);
            b.a(d17, d15, d12);
            b.a(d17, d15, d13);
            b.a(d16, d15, d13);
            b.a(d16, d15, d12);
            b.a(d16, d15, d13);
            b.a(d17, d15, d13);
            b.a(d17, d15, d12);
            b.a(d16, d14, d12);
            b.a(d17, d14, d12);
            b.a(d17, d14, d13);
            b.a(d16, d14, d13);
            b.a(d16, d14, d12);
            b.a(d16, d14, d13);
            b.a(d17, d14, d13);
            b.a(d17, d14, d12);
            b.a(d16, d14, d12);
            b.a(d16, d15, d12);
            b.a(d16, d14, d13);
            b.a(d16, d15, d13);
            b.a(d17, d14, d13);
            b.a(d17, d15, d13);
            b.a(d17, d14, d12);
            b.a(d17, d15, d12);
            b.a(d16, d15, d13);
            b.a(d16, d14, d13);
            b.a(d16, d15, d12);
            b.a(d16, d14, d12);
            b.a(d17, d15, d12);
            b.a(d17, d14, d12);
            b.a(d17, d15, d13);
            b.a(d17, d14, d13);
            b.c();
        }
        if (color != null) {
            GL11.glColor4d((double)((float)color.getRed() / 255.0f), (double)((float)color.getGreen() / 255.0f), (double)((float)color.getBlue() / 255.0f), (double)((float)color.getAlpha() / 255.0f));
            a.b();
            d17 = d2 + d5 - d9;
            d16 = d2 - d9;
            d15 = d3 + d6 - d10;
            d14 = d3 - d10;
            d13 = d4 + d7 - d11;
            d12 = d4 - d11;
            a.a(d16, d14, d12);
            a.a(d17, d14, d12);
            a.a(d16, d14, d13);
            a.a(d17, d14, d13);
            a.a(d16, d14, d12);
            a.a(d16, d14, d13);
            a.a(d17, d14, d12);
            a.a(d17, d14, d13);
            a.a(d16, d15, d12);
            a.a(d17, d15, d12);
            a.a(d16, d15, d13);
            a.a(d17, d15, d13);
            a.a(d16, d15, d12);
            a.a(d16, d15, d13);
            a.a(d17, d15, d12);
            a.a(d17, d15, d13);
            a.a(d16, d14, d12);
            a.a(d16, d15, d12);
            a.a(d16, d14, d13);
            a.a(d16, d15, d13);
            a.a(d17, d14, d13);
            a.a(d17, d15, d13);
            a.a(d17, d14, d12);
            a.a(d17, d15, d12);
            a.c();
        }
    }

    public static void a(iReSqtkUVgWjniReSqtkUVg iReSqtkUVgWjniReSqtkUVg2, double d2, double d3, double d4) {
        iReSqtkUVgoCkiReSqtkUVg.a(iReSqtkUVgWjniReSqtkUVg2.a, iReSqtkUVgWjniReSqtkUVg2.b, iReSqtkUVgWjniReSqtkUVg2.c, 1.0, 1.0, 1.0, 0.1, iReSqtkUVgWjniReSqtkUVg2.e, null, d2, d3, d4);
    }

    public static void a(double d2, double d3, double d4, iReSqtkUVgWjniReSqtkUVg iReSqtkUVgWjniReSqtkUVg2, Color color) {
        iReSqtkUVgNHCiReSqtkUVg iReSqtkUVgNHCiReSqtkUVg2;
        GL11.glColor4d((double)((float)iReSqtkUVgWjniReSqtkUVg2.e.getRed() / 255.0f), (double)((float)iReSqtkUVgWjniReSqtkUVg2.e.getGreen() / 255.0f), (double)((float)iReSqtkUVgWjniReSqtkUVg2.e.getBlue() / 255.0f), (double)((float)iReSqtkUVgWjniReSqtkUVg2.e.getAlpha() / 255.0f));
        b.b();
        double d5 = (double)(iReSqtkUVgWjniReSqtkUVg2.a + 1) - d2;
        double d6 = (double)iReSqtkUVgWjniReSqtkUVg2.a - d2;
        double d7 = (double)(iReSqtkUVgWjniReSqtkUVg2.b + 1) - d3;
        double d8 = (double)iReSqtkUVgWjniReSqtkUVg2.b - d3;
        double d9 = (double)(iReSqtkUVgWjniReSqtkUVg2.c + 1) - d4;
        double d10 = (double)iReSqtkUVgWjniReSqtkUVg2.c - d4;
        b.a(d6, d8, d10);
        b.a(d6, d7, d10);
        b.a(d5, d8, d10);
        b.a(d5, d7, d10);
        b.a(d5, d8, d9);
        b.a(d5, d7, d9);
        b.a(d6, d8, d9);
        b.a(d6, d7, d9);
        b.a(d5, d7, d10);
        b.a(d5, d8, d10);
        b.a(d6, d7, d10);
        b.a(d6, d8, d10);
        b.a(d6, d7, d9);
        b.a(d6, d8, d9);
        b.a(d5, d7, d9);
        b.a(d5, d8, d9);
        b.a(d6, d7, d10);
        b.a(d5, d7, d10);
        b.a(d5, d7, d9);
        b.a(d6, d7, d9);
        b.a(d6, d7, d10);
        b.a(d6, d7, d9);
        b.a(d5, d7, d9);
        b.a(d5, d7, d10);
        b.a(d6, d8, d10);
        b.a(d5, d8, d10);
        b.a(d5, d8, d9);
        b.a(d6, d8, d9);
        b.a(d6, d8, d10);
        b.a(d6, d8, d9);
        b.a(d5, d8, d9);
        b.a(d5, d8, d10);
        b.a(d6, d8, d10);
        b.a(d6, d7, d10);
        b.a(d6, d8, d9);
        b.a(d6, d7, d9);
        b.a(d5, d8, d9);
        b.a(d5, d7, d9);
        b.a(d5, d8, d10);
        b.a(d5, d7, d10);
        b.a(d6, d7, d9);
        b.a(d6, d8, d9);
        b.a(d6, d7, d10);
        b.a(d6, d8, d10);
        b.a(d5, d7, d10);
        b.a(d5, d8, d10);
        b.a(d5, d7, d9);
        b.a(d5, d8, d9);
        b.c();
        if (iReSqtkUVgWjniReSqtkUVg2 instanceof iReSqtkUVgNHCiReSqtkUVg && (iReSqtkUVgNHCiReSqtkUVg2 = (iReSqtkUVgNHCiReSqtkUVg)iReSqtkUVgWjniReSqtkUVg2).a() > 0.0f) {
            GL11.glColor4d((double)((double)(255 - iReSqtkUVgNHCiReSqtkUVg2.e.getRed()) / 255.0), (double)((255.0 - (double)iReSqtkUVgNHCiReSqtkUVg2.e.getGreen()) / 255.0), (double)((255.0 - (double)iReSqtkUVgNHCiReSqtkUVg2.e.getBlue()) / 255.0), (double)0.7);
            GL11.glLineWidth((float)3.0f);
            a.b();
            a.a(d6, d8, d10);
            a.a(d6, d7, d10);
            a.a(d5, d8, d10);
            a.a(d5, d7, d10);
            a.a(d6, d8, d9);
            a.a(d6, d7, d9);
            a.a(d5, d8, d9);
            a.a(d5, d7, d9);
            a.a(d5, d8, d10);
            a.a(d5, d8, d9);
            a.a(d5, d7, d10);
            a.a(d5, d7, d9);
            a.a(d6, d8, d10);
            a.a(d6, d8, d9);
            a.a(d6, d7, d10);
            a.a(d6, d7, d9);
            a.a(d6, d8, d10);
            a.a(d5, d8, d10);
            a.a(d6, d7, d10);
            a.a(d5, d7, d10);
            a.a(d6, d8, d9);
            a.a(d5, d8, d9);
            a.a(d6, d7, d9);
            a.a(d5, d7, d9);
            a.c();
        }
    }

    public static void a(iReSqtkUVgjSjiReSqtkUVg iReSqtkUVgjSjiReSqtkUVg2, double d2, Color color, Color color2, float f) {
        iReSqtkUVgvwXiReSqtkUVg iReSqtkUVgvwXiReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.s();
        double d3 = iReSqtkUVgvwXiReSqtkUVg2.e();
        double d4 = iReSqtkUVgvwXiReSqtkUVg2.f();
        double d5 = iReSqtkUVgvwXiReSqtkUVg2.g();
        double d6 = iReSqtkUVgjSjiReSqtkUVg2.Q() + (iReSqtkUVgjSjiReSqtkUVg2.z() - iReSqtkUVgjSjiReSqtkUVg2.Q()) * (double)f;
        double d7 = iReSqtkUVgjSjiReSqtkUVg2.R() + (iReSqtkUVgjSjiReSqtkUVg2.A() - iReSqtkUVgjSjiReSqtkUVg2.R()) * (double)f;
        double d8 = iReSqtkUVgjSjiReSqtkUVg2.S() + (iReSqtkUVgjSjiReSqtkUVg2.B() - iReSqtkUVgjSjiReSqtkUVg2.S()) * (double)f;
        GL11.glPushMatrix();
        iReSqtkUVgeLLiReSqtkUVg.n().a(1.0);
        GL11.glEnable((int)3042);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glLineWidth((float)1.5f);
        GL11.glDisable((int)3553);
        GL11.glEnable((int)2848);
        GL11.glDisable((int)2929);
        GL11.glDepthMask((boolean)false);
        double d9 = 0.15;
        iReSqtkUVgoCkiReSqtkUVg.a(d6 - (double)(iReSqtkUVgjSjiReSqtkUVg2.U() / 2.0f) - d9, d7, d8 - (double)(iReSqtkUVgjSjiReSqtkUVg2.U() / 2.0f) - d9, (double)iReSqtkUVgjSjiReSqtkUVg2.U() + d9 * 2.0, iReSqtkUVgjSjiReSqtkUVg2.T(), (double)iReSqtkUVgjSjiReSqtkUVg2.U() + d9 * 2.0, d2, color, color2, d3, d4, d5);
        GL11.glDepthMask((boolean)true);
        GL11.glEnable((int)2929);
        GL11.glEnable((int)3553);
        GL11.glDisable((int)2848);
        GL11.glDisable((int)3042);
        iReSqtkUVgeLLiReSqtkUVg.n().b(1.0);
        GL11.glPopMatrix();
    }

    public static void a(String string, double d2, double d3, double d4, double d5, double d6, int n, Color color, double d7) {
        iReSqtkUVgvwXiReSqtkUVg iReSqtkUVgvwXiReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.s();
        iReSqtkUVgpeziReSqtkUVg iReSqtkUVgpeziReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.h();
        iReSqtkUVgeLLiReSqtkUVg.n().a(0.0);
        GL11.glPushMatrix();
        GL11.glTranslated((double)d2, (double)(d3 + d7), (double)d4);
        GL11.glNormal3d((double)0.0, (double)1.0, (double)0.0);
        GL11.glRotated((double)(-iReSqtkUVgvwXiReSqtkUVg2.i()), (double)0.0, (double)1.0, (double)0.0);
        GL11.glRotated((double)iReSqtkUVgvwXiReSqtkUVg2.h(), (double)1.0, (double)0.0, (double)0.0);
        float f = d6 / 5.0 <= 2.0 ? 2.0f : (float)(d6 / 5.0);
        float f2 = (float)(0.01666666753590107 * ((double)f * d5));
        GL11.glScaled((double)(-f2), (double)(-f2), (double)f2);
        boolean bl = GL11.glIsEnabled((int)2896);
        if (bl) {
            GL11.glDisable((int)2896);
        }
        int n2 = iReSqtkUVgpeziReSqtkUVg2.a(string) / 2;
        int n3 = -(iReSqtkUVgpeziReSqtkUVg2.b(string) - 1);
        iReSqtkUVguKSiReSqtkUVg.a((double)(-n2) - 2.0, (double)n3 - 2.0, (double)n2 + 2.0, 2.0, color);
        GL11.glDisable((int)2929);
        iReSqtkUVguKSiReSqtkUVg.a((double)(-n2) - 2.0, (double)n3 - 2.0, (double)n2 + 2.0, 2.0, color);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        iReSqtkUVgpeziReSqtkUVg2.b(string, (double)(-n2), (double)n3 + 0.1, n);
        GL11.glEnable((int)2929);
        iReSqtkUVgpeziReSqtkUVg2.b(string, (double)(-n2), (double)n3 + 0.1, n);
        if (bl) {
            GL11.glEnable((int)2896);
        }
        GL11.glEnable((int)2929);
        GL11.glPopMatrix();
        iReSqtkUVgeLLiReSqtkUVg.n().b(0.0);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
    }

    public static Color a(Color color) {
        int n = color.getRGB();
        n = 0xFFFFFF - n;
        return new Color(n);
    }

    public static double[] a(double d2, double d3, double d4) {
        return a.a.trn(d2, d3, d4);
    }

    static {
        c = iReSqtkUVgauSiReSqtkUVg.d() > 13;
        d = new iReSqtkUVgLcXiReSqtkUVg("#.#");
        a = iReSqtkUVgFuiiReSqtkUVg.e.h();
        b = new iReSqtkUVgQBHiReSqtkUVg();
        b.a(48, 7);
    }
}

