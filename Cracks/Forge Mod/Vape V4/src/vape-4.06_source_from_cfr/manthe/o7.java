/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Mouse
 *  org.lwjgl.opengl.GL11
 */
package manthe;

import java.awt.Color;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.Arrays;
import java.util.HashSet;
import manthe.Bo;
import manthe.d0;
import manthe.ds;
import manthe.eb;
import manthe.p1;
import manthe.pe;
import manthe.qL;
import manthe.zu;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;

public final class o7 {
    private static IntBuffer f;
    private static FloatBuffer c;
    private static FloatBuffer d;
    private static final float[] e;
    private static final Color[] b;
    private static final Color[] a;

    private o7() {
    }

    public static void a(Color color) {
        GL11.glColor4f((float)((float)color.getRed() / 255.0f), (float)((float)color.getGreen() / 255.0f), (float)((float)color.getBlue() / 255.0f), (float)((float)color.getAlpha() / 255.0f));
    }

    public static boolean a(double d10, double d11, double d12, double d13) {
        boolean bl = GL11.glIsEnabled((int)3089);
        if (!bl) {
            GL11.glEnable((int)3089);
        }
        d0 d02 = ds.p();
        int n6 = ds.H();
        int n10 = d02.f();
        if (zu.T.aa.u().booleanValue()) {
            n10 = 2;
        }
        int n11 = (int)(d12 * (double)n10);
        int n12 = (int)(d13 * (double)n10);
        double d14 = d10 * (double)n10;
        int n13 = (int)d14;
        double d15 = d11 * (double)n10;
        int n14 = (int)((double)n6 - d15 - (double)n12);
        GL11.glScissor((int)n13, (int)n14, (int)n11, (int)n12);
        return bl;
    }

    public static void a(Color color, double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17) {
        o7.a(color);
        GL11.glBegin((int)7);
        GL11.glVertex2d((double)d10, (double)d11);
        GL11.glVertex2d((double)d12, (double)d13);
        GL11.glVertex2d((double)d14, (double)d15);
        GL11.glVertex2d((double)d16, (double)d17);
        GL11.glEnd();
        GL11.glColor4d((double)1.0, (double)1.0, (double)1.0, (double)1.0);
    }

    public static void a(Color color, Color color2, double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17) {
        GL11.glDisable((int)3553);
        GL11.glEnable((int)3042);
        GL11.glDisable((int)3008);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glShadeModel((int)7425);
        o7.a(color2);
        GL11.glBegin((int)7);
        GL11.glVertex2d((double)d10, (double)d11);
        GL11.glVertex2d((double)d12, (double)d13);
        o7.a(color);
        GL11.glVertex2d((double)d14, (double)d15);
        GL11.glVertex2d((double)d16, (double)d17);
        GL11.glEnd();
        GL11.glColor4d((double)1.0, (double)1.0, (double)1.0, (double)1.0);
        GL11.glShadeModel((int)7424);
        GL11.glDisable((int)3042);
        GL11.glEnable((int)3008);
        GL11.glEnable((int)3553);
    }

    public static void a(Color color, p1 p12) {
        o7.a(color, p12.t(), p12.k() + p12.b(), p12.t() + p12.q(), p12.k() + p12.b(), p12.t() + p12.q(), p12.k(), p12.t(), p12.k());
    }

    public static void a(Color color, double d10, double d11, p1 p12, Integer ... arrinteger) {
        HashSet<Integer> hashSet = new HashSet<Integer>(Arrays.asList(arrinteger));
        double d12 = p12.q();
        double d13 = p12.b();
        double d14 = p12.t();
        double d15 = p12.k();
        p12.c(d12 - d11 * 2.0);
        p12.b(d13 - d11 * 2.0);
        p12.a(d14 + d11);
        p12.d(d15 + d11);
        boolean bl = hashSet.contains(4);
        if (bl || hashSet.contains(0)) {
            o7.a(color, p12.t(), p12.k() + p12.b(), p12.t() + d10, p12.k() + p12.b(), p12.t() + d10, p12.k(), p12.t(), p12.k());
        }
        if (bl || hashSet.contains(3)) {
            o7.a(color, p12.t() + d10, p12.k() + p12.b(), p12.t() + p12.q() - d10, p12.k() + p12.b(), p12.t() + p12.q() - d10, p12.k() + p12.b() - d10, p12.t() + d10, p12.k() + p12.b() - d10);
        }
        if (bl || hashSet.contains(2)) {
            o7.a(color, p12.t() + p12.q() - d10, p12.k() + p12.b(), p12.t() + p12.q(), p12.k() + p12.b(), p12.t() + p12.q(), p12.k(), p12.t() + p12.q() - d10, p12.k());
        }
        if (bl || hashSet.contains(1)) {
            o7.a(color, p12.t() + d10, p12.k() + d10, p12.t() + p12.q() - d10, p12.k() + d10, p12.t() + p12.q() - d10, p12.k(), p12.t() + d10, p12.k());
        }
        p12.b(d13);
        p12.c(d12);
        p12.a(d14);
        p12.d(d15);
    }

    public static void a(Color color, double d10, p1 p12, Integer ... arrinteger) {
        HashSet<Integer> hashSet = new HashSet<Integer>(Arrays.asList(arrinteger));
        boolean bl = hashSet.contains(4);
        if (bl || hashSet.contains(0)) {
            o7.a(color, p12.t(), p12.k() + p12.b(), p12.t() + d10, p12.k() + p12.b(), p12.t() + d10, p12.k(), p12.t(), p12.k());
        }
        if (bl || hashSet.contains(3)) {
            o7.a(color, p12.t() + d10, p12.k() + p12.b(), p12.t() + p12.q() - d10, p12.k() + p12.b(), p12.t() + p12.q() - d10, p12.k() + p12.b() - d10, p12.t() + d10, p12.k() + p12.b() - d10);
        }
        if (bl || hashSet.contains(2)) {
            o7.a(color, p12.t() + p12.q() - d10, p12.k() + p12.b(), p12.t() + p12.q(), p12.k() + p12.b(), p12.t() + p12.q(), p12.k(), p12.t() + p12.q() - d10, p12.k());
        }
        if (bl || hashSet.contains(1)) {
            o7.a(color, p12.t() + d10, p12.k() + d10, p12.t() + p12.q() - d10, p12.k() + d10, p12.t() + p12.q() - d10, p12.k(), p12.t() + d10, p12.k());
        }
    }

    public static Bo b() {
        int n6;
        int n10 = ds.s().x();
        if (n10 == 0) {
            n10 = 1000;
        }
        for (n6 = 0; n6 < n10 && ds.F() / (n6 + 1) >= 320 && ds.H() / (n6 + 1) >= 240; ++n6) {
        }
        if (n6 == 0) {
            n6 = 2;
        }
        return new Bo(Mouse.getX() / n6, ds.H() / n6 - Mouse.getY() / n6 - 1);
    }

    public static void a(double d10, double d11, double d12, double d13, Color color, int n6) {
        GL11.glEnable((int)3042);
        GL11.glDisable((int)3553);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glEnable((int)2848);
        GL11.glPushMatrix();
        GL11.glColor4d((double)(color.getRed() / 255), (double)(color.getGreen() / 255), (double)(color.getBlue() / 255), (double)(n6 / 255));
        GL11.glBegin((int)9);
        GL11.glVertex2d((double)d10, (double)d11);
        GL11.glVertex2d((double)(d10 + d12 / 2.0), (double)(d11 + d13));
        GL11.glVertex2d((double)(d10 + d12), (double)d11);
        GL11.glEnd();
        GL11.glPopMatrix();
        GL11.glDisable((int)2848);
        GL11.glEnable((int)3553);
        GL11.glDisable((int)3042);
    }

    public static void a(double d10, double d11, double d12, double d13, double d14, Color color, Color color2) {
        pe.a(d10, d11, d12 - d10, d13 - d11, d14, color, color2);
    }

    public static void b(double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17) {
        GL11.glEnable((int)3042);
        GL11.glDisable((int)3553);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glEnable((int)2848);
        GL11.glPushMatrix();
        GL11.glColor4d((double)d14, (double)d15, (double)d16, (double)d17);
        GL11.glBegin((int)7);
        GL11.glVertex2d((double)d12, (double)d11);
        GL11.glVertex2d((double)d10, (double)d11);
        GL11.glVertex2d((double)d10, (double)d13);
        GL11.glVertex2d((double)d12, (double)d13);
        GL11.glEnd();
        GL11.glPopMatrix();
        GL11.glDisable((int)2848);
        GL11.glEnable((int)3553);
        GL11.glDisable((int)3042);
    }

    public static void a(double d10, double d11, double d12, double d13, Color color) {
        boolean bl = GL11.glIsEnabled((int)3042);
        GL11.glEnable((int)3042);
        GL11.glDisable((int)3553);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glEnable((int)2848);
        GL11.glPushMatrix();
        GL11.glColor4d((double)((float)color.getRed() / 255.0f), (double)((float)color.getGreen() / 255.0f), (double)((float)color.getBlue() / 255.0f), (double)((float)color.getAlpha() / 255.0f));
        GL11.glBegin((int)7);
        GL11.glVertex2d((double)d12, (double)d11);
        GL11.glVertex2d((double)d10, (double)d11);
        GL11.glVertex2d((double)d10, (double)d13);
        GL11.glVertex2d((double)d12, (double)d13);
        GL11.glEnd();
        GL11.glPopMatrix();
        GL11.glDisable((int)2848);
        GL11.glEnable((int)3553);
        if (!bl) {
            GL11.glDisable((int)3042);
        }
    }

    public static void e(double d10, double d11, double d12, double d13) {
    }

    public static void d(double d10, double d11, double d12, double d13) {
        eb eb2 = eb.f();
        eb2.a(7);
        eb2.a(d10, d13, 0.0, 1.0, 0.0);
        eb2.a(d12, d13, 0.0, 0.0, 0.0);
        eb2.a(d12, d11, 0.0, 0.0, 1.0);
        eb2.a(d10, d11, 0.0, 1.0, 1.0);
        eb2.j();
    }

    public static void a(int n6, int n10, int n11, int n12, int n13, int n14) {
        float f10 = 0.00390625f;
        float f11 = 0.00390625f;
        GL11.glBegin((int)7);
        o7.a((double)n6, (double)(n10 + n14), 0.0, (double)((float)n11 * f10), (float)(n12 + n14) * f11);
        o7.a((double)(n6 + n13), (double)(n10 + n14), 0.0, (double)((float)(n11 + n13) * f10), (float)(n12 + n14) * f11);
        o7.a((double)(n6 + n13), (double)n10, 0.0, (double)((float)(n11 + n13) * f10), (float)(n12 + 0) * f11);
        o7.a((double)n6, (double)n10, 0.0, (double)((float)n11 * f10), (float)(n12 + 0) * f11);
        GL11.glEnd();
    }

    public static void a(double d10, double d11, double d12, double d13, double d14) {
        GL11.glTexCoord2d((double)d13, (double)d14);
        GL11.glVertex3d((double)d10, (double)d11, (double)5.0);
    }

    public static void c(double d10, double d11, double d12, double d13) {
    }

    public static void b(double d10, double d11, double d12, double d13) {
        GL11.glBegin((int)7);
        GL11.glTexCoord2f((float)1.0f, (float)0.0f);
        GL11.glVertex3d((double)d10, (double)d13, (double)0.0);
        GL11.glTexCoord2f((float)0.0f, (float)0.0f);
        GL11.glVertex3d((double)d12, (double)d13, (double)0.0);
        GL11.glTexCoord2f((float)0.0f, (float)1.0f);
        GL11.glVertex3d((double)d12, (double)d11, (double)0.0);
        GL11.glTexCoord2f((float)1.0f, (float)1.0f);
        GL11.glVertex3d((double)d10, (double)d11, (double)0.0);
        GL11.glEnd();
    }

    public static void a(int n6) {
        float f10 = (float)(n6 >> 24 & 0xFF) / 255.0f;
        float f11 = (float)(n6 >> 16 & 0xFF) / 255.0f;
        float f12 = (float)(n6 >> 8 & 0xFF) / 255.0f;
        float f13 = (float)(n6 & 0xFF) / 255.0f;
        GL11.glColor4f((float)f11, (float)f12, (float)f13, (float)f10);
    }

    public static void a(int n6, int n10, int n11, int n12) {
        float f10 = 0.003921569f * (float)n6;
        float f11 = 0.003921569f * (float)n10;
        float f12 = 0.003921569f * (float)n11;
        float f13 = 0.003921569f * (float)n12;
        GL11.glColor4f((float)f10, (float)f11, (float)f12, (float)f13);
    }

    public static void a(float f10, float f11, float f12, float f13, float f14, int n6) {
        float f15 = (f13 - f11) / 4.0f;
        float f16 = (f12 - f10) / 4.0f;
        o7.a(f10 - f14, f11, f10, f11 + f15, n6);
        o7.a(f10 - f14, f11 - f14, f10 + f16, f11, n6);
        o7.a(f12, f11, f12 + f14, f11 + f15, n6);
        o7.a(f12 - f16, f11 - f14, f12 + f14, f11, n6);
        o7.a(f10 - f14, f13 - f15, f10, f13, n6);
        o7.a(f10 - f14, f13, f10 + f16, f13 + f14, n6);
        o7.a(f12, f13 - f15, f12 + f14, f13, n6);
        o7.a(f12 - f16, f13, f12 + f14, f13 + f14, n6);
    }

    public static void a(float f10, float f11, float f12, float f13, int n6) {
        o7.a();
        o7.a(n6);
        o7.a(f10, f11, f12, f13);
        o7.c();
    }

    public static void a(double d10, double d11, double d12, double d13, int n6) {
        o7.a();
        o7.a(n6);
        o7.a((float)d10, (float)d11, (float)d12, (float)d13);
        o7.c();
    }

    public static void a(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17) {
        o7.a();
        GL11.glColor4f((float)f14, (float)f15, (float)f16, (float)f17);
        o7.a(f10, f11, f12, f13);
        o7.c();
    }

    public static void a(float f10, float f11, float f12, float f13) {
        GL11.glBegin((int)7);
        GL11.glVertex2f((float)f10, (float)f13);
        GL11.glVertex2f((float)f12, (float)f13);
        GL11.glVertex2f((float)f12, (float)f11);
        GL11.glVertex2f((float)f10, (float)f11);
        GL11.glEnd();
    }

    public static void a() {
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

    public static void a(double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17) {
        double d18;
        o7.a();
        double d19 = d13 / 2.0;
        d10 += d19;
        d11 += d19;
        boolean bl = GL11.glIsEnabled((int)2884);
        if (bl) {
            GL11.glDisable((int)2884);
        }
        double d20 = Math.PI * 2;
        GL11.glColor4d((double)d14, (double)d15, (double)d16, (double)d17);
        GL11.glBegin((int)6);
        for (d18 = Math.PI; d18 <= d20; d18 += 0.001) {
            GL11.glVertex2d((double)(d10 + Math.sin(d18) * d19), (double)(d11 + Math.cos(d18) * d19));
        }
        GL11.glEnd();
        GL11.glBegin((int)6);
        for (d18 = 0.0; d18 <= d20 / 2.0; d18 += 0.001) {
            GL11.glVertex2d((double)(d10 + Math.sin(d18) * d19), (double)(d11 + Math.cos(d18) * d19));
        }
        GL11.glEnd();
        GL11.glColor4d((double)d14, (double)d15, (double)d16, (double)0.8);
        GL11.glBegin((int)2);
        for (d18 = Math.PI; d18 < d20 * 1.5; d18 += 0.1) {
            GL11.glVertex2d((double)(d10 + Math.sin(d18) * d19), (double)(d11 + Math.cos(d18) * d19));
        }
        GL11.glEnd();
        if (bl) {
            GL11.glEnable((int)2884);
        }
        o7.c();
    }

    public static Color a(float f10) {
        return o7.a(f10, false);
    }

    public static Color a(float f10, boolean bl) {
        return o7.a(e, bl ? a : b, f10);
    }

    public static Color a(float[] arrf, Color[] arrcolor, float f10) {
        Color color = Color.RED;
        if (arrf != null && arrcolor != null && arrf.length == arrcolor.length) {
            int[] arrn = o7.a(arrf, f10);
            float[] arrf2 = new float[]{arrf[arrn[0]], arrf[arrn[1]]};
            Color[] arrcolor2 = new Color[]{arrcolor[arrn[0]], arrcolor[arrn[1]]};
            float f11 = arrf2[1] - arrf2[0];
            float f12 = f10 - arrf2[0];
            float f13 = f12 / f11;
            color = o7.a(arrcolor2[0], arrcolor2[1], (double)(1.0f - f13));
        }
        return color;
    }

    private static int[] a(float[] arrf, float f10) {
        int n6;
        int[] arrn = new int[2];
        for (n6 = 0; n6 < arrf.length && arrf[n6] <= f10; ++n6) {
        }
        if (n6 >= arrf.length) {
            n6 = arrf.length - 1;
        }
        arrn[0] = n6 - 1;
        arrn[1] = n6;
        return arrn;
    }

    private static Color a(Color color, Color color2, double d10) {
        Color color3;
        float f10 = (float)d10;
        float f11 = 1.0f - f10;
        float[] arrf = new float[3];
        float[] arrf2 = new float[3];
        color.getColorComponents(arrf);
        color2.getColorComponents(arrf2);
        float f12 = arrf[0] * f10 + arrf2[0] * f11;
        float f13 = arrf[1] * f10 + arrf2[1] * f11;
        float f14 = arrf[2] * f10 + arrf2[2] * f11;
        if (f12 < 0.0f) {
            f12 = 0.0f;
        } else if (f12 > 255.0f) {
            f12 = 255.0f;
        }
        if (f13 < 0.0f) {
            f13 = 0.0f;
        } else if (f13 > 255.0f) {
            f13 = 255.0f;
        }
        if (f14 < 0.0f) {
            f14 = 0.0f;
        } else if (f14 > 255.0f) {
            f14 = 255.0f;
        }
        try {
            color3 = new Color(f12, f13, f14);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            return Color.RED;
        }
        return color3;
    }

    static {
        e = new float[]{0.0f, 0.5f, 1.0f};
        b = new Color[]{Color.RED, Color.YELLOW, Color.GREEN};
        a = new Color[]{Color.RED, Color.YELLOW, qL.b.i};
    }
}

