/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Mouse
 *  org.lwjgl.opengl.GL11
 */
import java.awt.Color;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.Arrays;
import java.util.HashSet;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;

public final class iReSqtkUVguKSiReSqtkUVg {
    private static IntBuffer a;
    private static FloatBuffer b;
    private static FloatBuffer c;

    private iReSqtkUVguKSiReSqtkUVg() {
    }

    public static void a(Color color) {
        GL11.glColor4f((float)((float)color.getRed() / 255.0f), (float)((float)color.getGreen() / 255.0f), (float)((float)color.getBlue() / 255.0f), (float)((float)color.getAlpha() / 255.0f));
    }

    public static void a(double d2, double d3, double d4, double d5) {
        GL11.glEnable((int)3089);
        iReSqtkUVgdAbiReSqtkUVg iReSqtkUVgdAbiReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.o();
        int n = iReSqtkUVgeLLiReSqtkUVg.q();
        int n2 = iReSqtkUVgdAbiReSqtkUVg2.d();
        int n3 = (int)(d4 * (double)n2);
        int n4 = (int)(d5 * (double)n2);
        double d6 = d2 * (double)n2;
        int n5 = (int)d6;
        double d7 = d3 * (double)n2;
        int n6 = (int)((double)n - d7 - (double)n4);
        GL11.glScissor((int)n5, (int)n6, (int)n3, (int)n4);
    }

    public static void a(Color color, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9) {
        iReSqtkUVguKSiReSqtkUVg.a(color);
        GL11.glBegin((int)7);
        GL11.glVertex2d((double)d2, (double)d3);
        GL11.glVertex2d((double)d4, (double)d5);
        GL11.glVertex2d((double)d6, (double)d7);
        GL11.glVertex2d((double)d8, (double)d9);
        GL11.glEnd();
        GL11.glColor4d((double)1.0, (double)1.0, (double)1.0, (double)1.0);
    }

    public static void a(Color color, iReSqtkUVgnCWiReSqtkUVg iReSqtkUVgnCWiReSqtkUVg2) {
        iReSqtkUVguKSiReSqtkUVg.a(color, iReSqtkUVgnCWiReSqtkUVg2.c(), iReSqtkUVgnCWiReSqtkUVg2.e_() + iReSqtkUVgnCWiReSqtkUVg2.l(), iReSqtkUVgnCWiReSqtkUVg2.c() + iReSqtkUVgnCWiReSqtkUVg2.k(), iReSqtkUVgnCWiReSqtkUVg2.e_() + iReSqtkUVgnCWiReSqtkUVg2.l(), iReSqtkUVgnCWiReSqtkUVg2.c() + iReSqtkUVgnCWiReSqtkUVg2.k(), iReSqtkUVgnCWiReSqtkUVg2.e_(), iReSqtkUVgnCWiReSqtkUVg2.c(), iReSqtkUVgnCWiReSqtkUVg2.e_());
    }

    public static void a(Color color, double d2, iReSqtkUVgnCWiReSqtkUVg iReSqtkUVgnCWiReSqtkUVg2, Integer ... arrinteger) {
        HashSet<Integer> hashSet = new HashSet<Integer>(Arrays.asList(arrinteger));
        boolean bl = hashSet.contains(4);
        if (bl || hashSet.contains(0)) {
            iReSqtkUVguKSiReSqtkUVg.a(color, iReSqtkUVgnCWiReSqtkUVg2.c(), iReSqtkUVgnCWiReSqtkUVg2.e_() + iReSqtkUVgnCWiReSqtkUVg2.l(), iReSqtkUVgnCWiReSqtkUVg2.c() + d2, iReSqtkUVgnCWiReSqtkUVg2.e_() + iReSqtkUVgnCWiReSqtkUVg2.l(), iReSqtkUVgnCWiReSqtkUVg2.c() + d2, iReSqtkUVgnCWiReSqtkUVg2.e_(), iReSqtkUVgnCWiReSqtkUVg2.c(), iReSqtkUVgnCWiReSqtkUVg2.e_());
        }
        if (bl || hashSet.contains(3)) {
            iReSqtkUVguKSiReSqtkUVg.a(color, iReSqtkUVgnCWiReSqtkUVg2.c() + d2, iReSqtkUVgnCWiReSqtkUVg2.e_() + iReSqtkUVgnCWiReSqtkUVg2.l(), iReSqtkUVgnCWiReSqtkUVg2.c() + iReSqtkUVgnCWiReSqtkUVg2.k() - d2, iReSqtkUVgnCWiReSqtkUVg2.e_() + iReSqtkUVgnCWiReSqtkUVg2.l(), iReSqtkUVgnCWiReSqtkUVg2.c() + iReSqtkUVgnCWiReSqtkUVg2.k() - d2, iReSqtkUVgnCWiReSqtkUVg2.e_() + iReSqtkUVgnCWiReSqtkUVg2.l() - d2, iReSqtkUVgnCWiReSqtkUVg2.c() + d2, iReSqtkUVgnCWiReSqtkUVg2.e_() + iReSqtkUVgnCWiReSqtkUVg2.l() - d2);
        }
        if (bl || hashSet.contains(2)) {
            iReSqtkUVguKSiReSqtkUVg.a(color, iReSqtkUVgnCWiReSqtkUVg2.c() + iReSqtkUVgnCWiReSqtkUVg2.k() - d2, iReSqtkUVgnCWiReSqtkUVg2.e_() + iReSqtkUVgnCWiReSqtkUVg2.l(), iReSqtkUVgnCWiReSqtkUVg2.c() + iReSqtkUVgnCWiReSqtkUVg2.k(), iReSqtkUVgnCWiReSqtkUVg2.e_() + iReSqtkUVgnCWiReSqtkUVg2.l(), iReSqtkUVgnCWiReSqtkUVg2.c() + iReSqtkUVgnCWiReSqtkUVg2.k(), iReSqtkUVgnCWiReSqtkUVg2.e_(), iReSqtkUVgnCWiReSqtkUVg2.c() + iReSqtkUVgnCWiReSqtkUVg2.k() - d2, iReSqtkUVgnCWiReSqtkUVg2.e_());
        }
        if (bl || hashSet.contains(1)) {
            iReSqtkUVguKSiReSqtkUVg.a(color, iReSqtkUVgnCWiReSqtkUVg2.c() + d2, iReSqtkUVgnCWiReSqtkUVg2.e_() + d2, iReSqtkUVgnCWiReSqtkUVg2.c() + iReSqtkUVgnCWiReSqtkUVg2.k() - d2, iReSqtkUVgnCWiReSqtkUVg2.e_() + d2, iReSqtkUVgnCWiReSqtkUVg2.c() + iReSqtkUVgnCWiReSqtkUVg2.k() - d2, iReSqtkUVgnCWiReSqtkUVg2.e_(), iReSqtkUVgnCWiReSqtkUVg2.c() + d2, iReSqtkUVgnCWiReSqtkUVg2.e_());
        }
    }

    public static iReSqtkUVgFXsiReSqtkUVg a() {
        int n;
        int n2 = iReSqtkUVgeLLiReSqtkUVg.i().m();
        if (n2 == 0) {
            n2 = 1000;
        }
        for (n = 0; n < n2 && iReSqtkUVgeLLiReSqtkUVg.p() / (n + 1) >= 320 && iReSqtkUVgeLLiReSqtkUVg.q() / (n + 1) >= 240; ++n) {
        }
        if (n == 0) {
            n = 2;
        }
        return new iReSqtkUVgFXsiReSqtkUVg(Mouse.getX() / n, iReSqtkUVgeLLiReSqtkUVg.q() / n - Mouse.getY() / n - 1);
    }

    public static void a(double d2, double d3, double d4, double d5, Color color, int n) {
        GL11.glEnable((int)3042);
        GL11.glDisable((int)3553);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glEnable((int)2848);
        GL11.glPushMatrix();
        GL11.glColor4d((double)(color.getRed() / 255), (double)(color.getGreen() / 255), (double)(color.getBlue() / 255), (double)(n / 255));
        GL11.glBegin((int)9);
        GL11.glVertex2d((double)d2, (double)d3);
        GL11.glVertex2d((double)(d2 + d4 / 2.0), (double)(d3 + d5));
        GL11.glVertex2d((double)(d2 + d4), (double)d3);
        GL11.glEnd();
        GL11.glPopMatrix();
        GL11.glDisable((int)2848);
        GL11.glEnable((int)3553);
        GL11.glDisable((int)3042);
    }

    public static void a(double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9) {
        GL11.glEnable((int)3042);
        GL11.glDisable((int)3553);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glEnable((int)2848);
        GL11.glPushMatrix();
        GL11.glColor4d((double)d6, (double)d7, (double)d8, (double)d9);
        GL11.glBegin((int)7);
        GL11.glVertex2d((double)d4, (double)d3);
        GL11.glVertex2d((double)d2, (double)d3);
        GL11.glVertex2d((double)d2, (double)d5);
        GL11.glVertex2d((double)d4, (double)d5);
        GL11.glEnd();
        GL11.glPopMatrix();
        GL11.glDisable((int)2848);
        GL11.glEnable((int)3553);
        GL11.glDisable((int)3042);
    }

    public static void a(double d2, double d3, double d4, double d5, Color color) {
        GL11.glEnable((int)3042);
        GL11.glDisable((int)3553);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glEnable((int)2848);
        GL11.glPushMatrix();
        GL11.glColor4d((double)((float)color.getRed() / 255.0f), (double)((float)color.getGreen() / 255.0f), (double)((float)color.getBlue() / 255.0f), (double)((float)color.getAlpha() / 255.0f));
        GL11.glBegin((int)7);
        GL11.glVertex2d((double)d4, (double)d3);
        GL11.glVertex2d((double)d2, (double)d3);
        GL11.glVertex2d((double)d2, (double)d5);
        GL11.glVertex2d((double)d4, (double)d5);
        GL11.glEnd();
        GL11.glPopMatrix();
        GL11.glDisable((int)2848);
        GL11.glEnable((int)3553);
        GL11.glDisable((int)3042);
    }

    public static void b(double d2, double d3, double d4, double d5) {
    }

    public static void c(double d2, double d3, double d4, double d5) {
        iReSqtkUVgKlViReSqtkUVg iReSqtkUVgKlViReSqtkUVg2 = iReSqtkUVgKlViReSqtkUVg.d();
        iReSqtkUVgKlViReSqtkUVg2.a(7);
        iReSqtkUVgKlViReSqtkUVg2.a(d2, d5, 0.0, 1.0, 0.0);
        iReSqtkUVgKlViReSqtkUVg2.a(d4, d5, 0.0, 0.0, 0.0);
        iReSqtkUVgKlViReSqtkUVg2.a(d4, d3, 0.0, 0.0, 1.0);
        iReSqtkUVgKlViReSqtkUVg2.a(d2, d3, 0.0, 1.0, 1.0);
        iReSqtkUVgKlViReSqtkUVg2.f();
    }

    public static void d(double d2, double d3, double d4, double d5) {
    }

    public static void e(double d2, double d3, double d4, double d5) {
        GL11.glBegin((int)7);
        GL11.glTexCoord2f((float)1.0f, (float)0.0f);
        GL11.glVertex3d((double)d2, (double)d5, (double)0.0);
        GL11.glTexCoord2f((float)0.0f, (float)0.0f);
        GL11.glVertex3d((double)d4, (double)d5, (double)0.0);
        GL11.glTexCoord2f((float)0.0f, (float)1.0f);
        GL11.glVertex3d((double)d4, (double)d3, (double)0.0);
        GL11.glTexCoord2f((float)1.0f, (float)1.0f);
        GL11.glVertex3d((double)d2, (double)d3, (double)0.0);
        GL11.glEnd();
    }

    public static void a(int n) {
        float f = (float)(n >> 24 & 0xFF) / 255.0f;
        float f2 = (float)(n >> 16 & 0xFF) / 255.0f;
        float f3 = (float)(n >> 8 & 0xFF) / 255.0f;
        float f4 = (float)(n & 0xFF) / 255.0f;
        GL11.glColor4f((float)f2, (float)f3, (float)f4, (float)f);
    }

    public static void a(int n, int n2, int n3, int n4) {
        float f = 0.003921569f * (float)n;
        float f2 = 0.003921569f * (float)n2;
        float f3 = 0.003921569f * (float)n3;
        float f4 = 0.003921569f * (float)n4;
        GL11.glColor4f((float)f, (float)f2, (float)f3, (float)f4);
    }

    public static void a(float f, float f2, float f3, float f4, float f5, int n) {
        float f6 = (f4 - f2) / 4.0f;
        float f7 = (f3 - f) / 4.0f;
        iReSqtkUVguKSiReSqtkUVg.a(f - f5, f2, f, f2 + f6, n);
        iReSqtkUVguKSiReSqtkUVg.a(f - f5, f2 - f5, f + f7, f2, n);
        iReSqtkUVguKSiReSqtkUVg.a(f3, f2, f3 + f5, f2 + f6, n);
        iReSqtkUVguKSiReSqtkUVg.a(f3 - f7, f2 - f5, f3 + f5, f2, n);
        iReSqtkUVguKSiReSqtkUVg.a(f - f5, f4 - f6, f, f4, n);
        iReSqtkUVguKSiReSqtkUVg.a(f - f5, f4, f + f7, f4 + f5, n);
        iReSqtkUVguKSiReSqtkUVg.a(f3, f4 - f6, f3 + f5, f4, n);
        iReSqtkUVguKSiReSqtkUVg.a(f3 - f7, f4, f3 + f5, f4 + f5, n);
    }

    public static void a(float f, float f2, float f3, float f4, int n) {
        iReSqtkUVguKSiReSqtkUVg.b();
        iReSqtkUVguKSiReSqtkUVg.a(n);
        iReSqtkUVguKSiReSqtkUVg.a(f, f2, f3, f4);
        iReSqtkUVguKSiReSqtkUVg.c();
    }

    public static void a(double d2, double d3, double d4, double d5, int n) {
        iReSqtkUVguKSiReSqtkUVg.b();
        iReSqtkUVguKSiReSqtkUVg.a(n);
        iReSqtkUVguKSiReSqtkUVg.a((float)d2, (float)d3, (float)d4, (float)d5);
        iReSqtkUVguKSiReSqtkUVg.c();
    }

    public static void a(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        iReSqtkUVguKSiReSqtkUVg.b();
        GL11.glColor4f((float)f5, (float)f6, (float)f7, (float)f8);
        iReSqtkUVguKSiReSqtkUVg.a(f, f2, f3, f4);
        iReSqtkUVguKSiReSqtkUVg.c();
    }

    public static void a(float f, float f2, float f3, float f4) {
        GL11.glBegin((int)7);
        GL11.glVertex2f((float)f, (float)f4);
        GL11.glVertex2f((float)f3, (float)f4);
        GL11.glVertex2f((float)f3, (float)f2);
        GL11.glVertex2f((float)f, (float)f2);
        GL11.glEnd();
    }

    public static void b() {
        GL11.glEnable((int)3042);
        GL11.glDisable((int)3553);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glEnable((int)2848);
    }

    public static void c() {
        GL11.glDisable((int)2848);
        GL11.glEnable((int)3553);
        GL11.glDisable((int)3042);
    }
}

