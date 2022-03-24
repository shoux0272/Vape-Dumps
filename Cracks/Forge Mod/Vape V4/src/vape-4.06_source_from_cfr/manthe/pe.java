/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.BufferUtils
 *  org.lwjgl.opengl.GL11
 */
package manthe;

import java.awt.Color;
import java.nio.FloatBuffer;
import manthe.d0;
import manthe.ds;
import manthe.e3;
import manthe.eK;
import manthe.eh;
import manthe.fG;
import manthe.fk;
import manthe.k9;
import manthe.lD;
import manthe.lP;
import manthe.lp;
import manthe.lv;
import manthe.mA;
import manthe.mg;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;

public class pe {
    private static mA a = new mA();
    private static mA h = new mA();
    private static lp b;
    private static mg d;
    private static lv e;
    private static lP g;
    private static lD k;
    private static boolean c;
    private static boolean i;
    private static boolean f;
    private static FloatBuffer j;

    private static void b() {
        c = GL11.glIsEnabled((int)2884);
        i = GL11.glIsEnabled((int)3042);
        f = GL11.glIsEnabled((int)3553);
        if (c) {
            e3.m();
        }
        if (!i) {
            e3.r();
        }
        if (f) {
            e3.j();
        }
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glPushMatrix();
    }

    private static void a() {
        GL11.glPopMatrix();
        if (f) {
            e3.p();
        }
        if (!i) {
            e3.f();
        }
        if (c) {
            e3.t();
        }
    }

    public static void a(Color color) {
        GL11.glColor4f((float)((float)color.getRed() / 255.0f), (float)((float)color.getGreen() / 255.0f), (float)((float)color.getBlue() / 255.0f), (float)((float)color.getAlpha() / 255.0f));
    }

    public static void a(double d10, double d11, double d12, double d13, float f10, Color color) {
        d.c();
        d.a((float)d10, (float)d11, (float)d12, (float)d13);
        d.a(f10);
        d.a(color);
        pe.b();
        a.c();
        a.a((float)d10 - f10, (float)d11 - f10);
        a.a((float)(d10 + d12 + (double)f10), (float)d11 - f10);
        a.a((float)(d10 + d12 + (double)f10), (float)(d11 + d13 + (double)f10));
        a.a((float)d10 - f10, (float)(d11 + d13 + (double)f10));
        a.a();
        GL11.glColor4d((double)1.0, (double)1.0, (double)1.0, (double)1.0);
        pe.a();
        d.d();
    }

    public static void a(double d10, double d11, double d12, double d13, Color color, boolean bl, float f10, float f11) {
        pe.a(d10, d11, d12, d13, color, bl, f10, f11, 8.0f, new Color(0, 0, 0, 102));
    }

    public static void a(double d10, double d11, double d12, double d13, Color color, float f10, float f11, float f12) {
        float f13 = 0.5f;
        float f14 = f12;
        k.c();
        k.a((float)(d10 -= (double)f14 - 0.5) + f10 + f11, (float)(d11 -= (double)f14) + f10 + f11, (float)(d10 + (d12 += (double)(f14 * 1.0f))) - (f10 + f11), (float)(d11 + (d13 += (double)f14 * 1.5)) - (f10 + f11));
        k.a(f10, f12, f11);
        pe.b();
        pe.a(color);
        a.c();
        a.a((float)d10 + f13, (float)d11 + f13);
        a.a((float)(d10 + d12 - (double)f13), (float)d11 + f13);
        a.a((float)(d10 + d12 - (double)f13), (float)(d11 + d13 - (double)f13));
        a.a((float)d10 + f13, (float)(d11 + d13 - (double)f13));
        a.a();
        GL11.glColor4d((double)1.0, (double)1.0, (double)1.0, (double)1.0);
        pe.a();
        k.d();
    }

    public static void a(double d10, double d11, double d12, double d13, Color color, boolean bl, float f10, float f11, float f12, Color color2) {
        if (bl) {
            pe.a(d10, d11 + 0.5, d12, d13 - 0.5, f12, color2);
        }
        float f13 = 0.5f;
        if (f10 == 0.0f) {
            f13 = 0.0f;
        }
        float f14 = f11;
        float f15 = Math.max(0.0f, (f10 += f13 * 2.0f) - f14);
        if (f10 != 0.0f) {
            d10 -= (double)f14 - 0.5;
            d11 -= (double)f14;
            d13 += (double)f14 * 1.5;
            d12 += (double)(f14 * 1.0f);
        }
        b.c();
        b.a(f15);
        b.a((float)d10 + f10, (float)d11 + f10, (float)(d10 + d12) - f10, (float)(d11 + d13) - f10);
        b.b(f14);
        pe.b();
        pe.a(color);
        a.c();
        a.a((float)d10 + f13, (float)d11 + f13);
        a.a((float)(d10 + d12 - (double)f13), (float)d11 + f13);
        a.a((float)(d10 + d12 - (double)f13), (float)(d11 + d13 - (double)f13));
        a.a((float)d10 + f13, (float)(d11 + d13 - (double)f13));
        a.a();
        GL11.glColor4d((double)1.0, (double)1.0, (double)1.0, (double)1.0);
        pe.a();
        b.d();
    }

    public static void a(double d10, double d11, double d12, double d13, Color color) {
        pe.a(d10, d11, d12, d13, color, false, 2.0f, 1.0f);
    }

    public static void c(double d10, double d11, double d12, double d13, Color color) {
        pe.a((float)d10, (float)d11, (float)d12, (float)d13, color);
    }

    public static void a(float f10, float f11, float f12, float f13, Color color) {
        pe.b();
        pe.a(color);
        a.c();
        a.a(f10, f11);
        a.a(f10 + f12, f11);
        a.a(f10 + f12, f11 + f13);
        a.a(f10, f11 + f13);
        a.a();
        GL11.glColor4d((double)1.0, (double)1.0, (double)1.0, (double)1.0);
        pe.a();
    }

    public static void a(double d10, double d11, double d12, double d13, double d14, Color color, Color color2) {
        if (color.equals(color2)) {
            d14 = 0.0;
            pe.c(d10, d11, d12 - d14, d13 - d14, color);
            return;
        }
        pe.c(d10 -= d14, d11, (d12 += d14) - d14, (d13 += d14) - d14, color);
        pe.b();
        h.c();
        pe.a(color2);
        h.a((float)(d10 - d14), (float)(d11 - d14));
        h.a((float)(d10 + d12), (float)(d11 - d14));
        h.a((float)(d10 + d12), (float)d11);
        h.a((float)(d10 - d14), (float)d11);
        h.a((float)(d10 - d14), (float)(d11 + d13 - d14));
        h.a((float)(d10 + d12), (float)(d11 + d13 - d14));
        h.a((float)(d10 + d12), (float)(d11 + d13));
        h.a((float)(d10 - d14), (float)(d11 + d13));
        h.a((float)(d10 - d14), (float)d11);
        h.a((float)d10, (float)d11);
        h.a((float)d10, (float)(d11 + d13 - d14));
        h.a((float)(d10 - d14), (float)(d11 + d13 - d14));
        h.a((float)(d10 + d12 - d14), (float)d11);
        h.a((float)(d10 + d12), (float)d11);
        h.a((float)(d10 + d12), (float)(d11 + d13 - d14));
        h.a((float)(d10 + d12 - d14), (float)(d11 + d13 - d14));
        h.a();
        GL11.glColor4d((double)1.0, (double)1.0, (double)1.0, (double)1.0);
        pe.a();
    }

    public static void a(String string, double d10, double d11, double d12, double d13, Color color) {
        pe.a(string, (float)d10, (float)d11, (float)d12, (float)d13, color);
    }

    public static void a(String string, float f10, float f11, float f12, float f13, Color color) {
        k9.a(color, f10 - f12 / 2.0f, f11 - f13 / 2.0f, string, f12, f13, false);
    }

    public static void a(fG fG2, double d10, double d11, double d12, boolean bl) {
        GL11.glPushMatrix();
        boolean bl2 = GL11.glIsEnabled((int)2929);
        boolean bl3 = GL11.glIsEnabled((int)3042);
        if (bl2 != bl) {
            if (bl) {
                e3.g();
            } else {
                e3.u();
            }
        }
        if (!bl3) {
            e3.r();
        }
        eK eK2 = ds.J();
        float f10 = eK2.g();
        eK2.a(150.0f);
        eh.h();
        eh.g();
        double d13 = 1.0 / d10;
        GL11.glScaled((double)d10, (double)d10, (double)d10);
        eK2.a(ds.m(), ds.l(), fG2, (int)(d11 * d13), (int)(d12 * d13));
        GL11.glScaled((double)d13, (double)d13, (double)d13);
        eh.h();
        eK2.a(f10);
        if (bl2 != bl) {
            if (bl) {
                e3.g();
            } else {
                e3.u();
            }
        }
        if (!bl3) {
            e3.f();
        }
        GL11.glPopMatrix();
    }

    public static void a(fG fG2, double d10, double d11, double d12) {
        pe.a(fG2, d10, d11, d12, false);
    }

    public static void a(int n6, double d10, double d11, double d12) {
        if (n6 < 1) {
            return;
        }
        pe.a(fG.a(fk.a(n6)), d10, d11, d12);
    }

    public static void b(double d10, double d11, double d12, double d13, Color color) {
        pe.a((float)d10, (float)d11, (float)d12, (float)d13, color, 0.0, null);
    }

    public static void a(float f10, float f11, float f12, float f13, Color color, double d10, Color color2) {
        f10 -= f13 / 2.0f;
        f11 -= f13 / 2.0f;
        float f14 = f12 += f13;
        float f15 = f12;
        if (color2 != null) {
            pe.a(color2);
            double d11 = (double)(f10 + f14 / 2.0f) - d10 / 2.0;
            pe.a(d11, (double)f11, d10, (double)f12, color2);
        }
        e.c();
        pe.b();
        e.b(f12 / 2.0f);
        e.a(f13);
        e.a(f10 + f14 / 2.0f, f11 + f15 / 2.0f);
        pe.a(color);
        a.c();
        a.a(f10, f11);
        a.a(f10 + f14, f11);
        a.a(f10 + f14, f11 + f15);
        a.a(f10, f11 + f15);
        a.a();
        GL11.glColor4d((double)1.0, (double)1.0, (double)1.0, (double)1.0);
        pe.a();
        e.d();
    }

    public static void a(float f10, float f11, float f12, float f13, float f14, Color color) {
        float f15 = f12 += f14;
        float f16 = f12;
        g.c();
        g.b(f12 / 2.0f, f13);
        g.a(f14);
        g.a((f10 -= f14 / 2.0f) + f15 / 2.0f, (f11 -= f14 / 2.0f) + f16 / 2.0f);
        pe.b();
        pe.a(color);
        a.c();
        a.a(f10, f11);
        a.a(f10 + f15, f11);
        a.a(f10 + f15, f11 + f16);
        a.a(f10, f11 + f16);
        a.a();
        GL11.glColor4d((double)1.0, (double)1.0, (double)1.0, (double)1.0);
        pe.a();
        g.d();
    }

    public static void b(double d10, double d11, double d12, float f10, Color color) {
        boolean bl = GL11.glIsEnabled((int)3042);
        boolean bl2 = GL11.glIsEnabled((int)3553);
        if (!bl) {
            e3.r();
        }
        if (bl2) {
            e3.j();
        }
        GL11.glColor4d((double)((double)color.getRed() / 255.0), (double)((double)color.getGreen() / 255.0), (double)((double)color.getBlue() / 255.0), (double)((double)color.getAlpha() / 255.0));
        GL11.glLineWidth((float)f10);
        GL11.glBegin((int)3);
        GL11.glVertex2d((double)d10, (double)d11);
        GL11.glVertex2d((double)(d10 + d12), (double)d11);
        GL11.glEnd();
        if (bl2) {
            e3.p();
        }
        if (!bl) {
            e3.f();
        }
    }

    public static void a(double d10, double d11, double d12, float f10, Color color) {
        boolean bl = GL11.glIsEnabled((int)3042);
        boolean bl2 = GL11.glIsEnabled((int)3553);
        if (!bl) {
            e3.r();
        }
        if (bl2) {
            e3.j();
        }
        GL11.glColor4d((double)((double)color.getRed() / 255.0), (double)((double)color.getGreen() / 255.0), (double)((double)color.getBlue() / 255.0), (double)((double)color.getAlpha() / 255.0));
        GL11.glLineWidth((float)f10);
        GL11.glBegin((int)3);
        GL11.glVertex2f((float)((float)d10), (float)((float)d11));
        GL11.glVertex2f((float)((float)d10), (float)((float)(d11 + d12)));
        GL11.glEnd();
        if (bl2) {
            e3.p();
        }
        if (!bl) {
            e3.f();
        }
    }

    public static void d() {
        d0 d02 = d0.a(new ds(), ds.F(), ds.H());
        GL11.glPushMatrix();
        GL11.glGetFloat((int)2983, (FloatBuffer)j);
        GL11.glMatrixMode((int)5889);
        GL11.glLoadIdentity();
        GL11.glOrtho((double)0.0, (double)d02.g(), (double)d02.h(), (double)0.0, (double)1000.0, (double)3000.0);
        GL11.glMatrixMode((int)5888);
        GL11.glLoadIdentity();
        GL11.glPushMatrix();
        GL11.glTranslatef((float)0.0f, (float)0.0f, (float)-2000.0f);
    }

    public static void c() {
        GL11.glPopMatrix();
        GL11.glMatrixMode((int)5889);
        GL11.glLoadIdentity();
        GL11.glLoadMatrix((FloatBuffer)j);
        GL11.glMatrixMode((int)5888);
        GL11.glLoadIdentity();
        GL11.glPopMatrix();
    }

    public static void a(double d10, double d11, double d12, double d13, double d14, double d15, Color color) {
        GL11.glEnable((int)3042);
        GL11.glDisable((int)3553);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glEnable((int)2881);
        GL11.glPushMatrix();
        GL11.glColor4d((double)((double)color.getRed() / 255.0), (double)((double)color.getGreen() / 255.0), (double)((double)color.getBlue() / 255.0), (double)((double)color.getAlpha() / 255.0));
        GL11.glBegin((int)6);
        GL11.glVertex2d((double)d12, (double)d13);
        GL11.glVertex2d((double)d10, (double)d11);
        GL11.glVertex2d((double)d14, (double)d15);
        GL11.glEnd();
        GL11.glPopMatrix();
        GL11.glDisable((int)2881);
        GL11.glEnable((int)3553);
        GL11.glDisable((int)3042);
    }

    static {
        a.a(8, 7, 2);
        h.a(40, 7, 2);
        b = new lp();
        d = new mg();
        e = new lv();
        g = new lP();
        k = new lD();
        j = BufferUtils.createFloatBuffer((int)16);
    }
}

