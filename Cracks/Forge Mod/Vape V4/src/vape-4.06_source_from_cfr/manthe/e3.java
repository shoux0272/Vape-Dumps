/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package manthe;

import a.a;
import java.util.ArrayList;
import manthe.V;
import manthe.cy;
import manthe.eQ;
import manthe.ek;
import manthe.hP;
import org.lwjgl.opengl.GL11;

public class e3
extends cy {
    public e3(Object object) {
        super(object);
    }

    private static boolean o() {
        return V.c() == 13 || a.a.iv();
    }

    public static void b(int n6) {
        if (V.c() == 13) {
            GL11.glBindTexture((int)3553, (int)n6);
            return;
        }
        int n10 = hP.c(e3.a.M().b7);
        ek ek2 = e3.h().get(n10);
        if (n6 != ek2.f()) {
            ek2.a(n6);
            GL11.glBindTexture((int)3553, (int)n6);
        }
    }

    public static void i() {
        if (e3.o()) {
            GL11.glDisable((int)3008);
            return;
        }
        hP.m(e3.a.M().b7);
    }

    public static void n() {
        if (e3.o()) {
            GL11.glEnable((int)2896);
            return;
        }
        hP.b(e3.a.M().b7);
    }

    public static void l() {
        if (e3.o()) {
            GL11.glDisable((int)2896);
            return;
        }
        hP.j(e3.a.M().b7);
    }

    public static void a(boolean bl) {
        if (e3.o()) {
            GL11.glDepthMask((boolean)bl);
            return;
        }
        hP.a(e3.a.M().b7, bl);
    }

    public static void g() {
        if (e3.o()) {
            GL11.glEnable((int)2929);
            return;
        }
        hP.e(e3.a.M().b7);
    }

    public static void u() {
        if (e3.o()) {
            GL11.glDisable((int)2929);
            return;
        }
        hP.f(e3.a.M().b7);
    }

    public static void r() {
        if (V.c() == 13) {
            GL11.glEnable((int)3042);
            return;
        }
        e3.s().f().a(true);
    }

    public static void f() {
        if (V.c() == 13) {
            GL11.glDisable((int)3042);
            return;
        }
        e3.s().f().a(false);
    }

    public static void a(int n6, int n10, int n11, int n12) {
        if (e3.o()) {
            GL11.glBlendFunc((int)n6, (int)n10);
            return;
        }
        hP.a(e3.a.M().b7, n6, n10, n11, n12);
    }

    public static void p() {
        if (e3.o()) {
            GL11.glEnable((int)3553);
            return;
        }
        hP.h(e3.a.M().b7);
    }

    public static void j() {
        if (e3.o()) {
            GL11.glDisable((int)3553);
            return;
        }
        hP.g(e3.a.M().b7);
    }

    public static void a(float f10, float f11, float f12, float f13) {
        if (e3.o()) {
            GL11.glColor4f((float)f10, (float)f11, (float)f12, (float)f13);
            return;
        }
        hP.a(e3.a.M().b7, f10, f11, f12, f13);
    }

    public static void k() {
        if (e3.o()) {
            GL11.glEnable((int)3008);
            return;
        }
        hP.a(e3.a.M().b7);
    }

    public static void a(int n6) {
        if (e3.o()) {
            return;
        }
        hP.a(e3.a.M().b7, n6);
    }

    public static int q() {
        return GL11.glGetInteger((int)32873);
    }

    public static void t() {
        if (e3.o()) {
            GL11.glEnable((int)2884);
            return;
        }
        hP.l(e3.a.M().b7);
    }

    public static void m() {
        if (e3.o()) {
            GL11.glDisable((int)2884);
            return;
        }
        hP.i(e3.a.M().b7);
    }

    public static ArrayList<ek> h() {
        ArrayList<ek> arrayList = new ArrayList<ek>();
        for (Object object : hP.k(e3.a.M().b7)) {
            arrayList.add(new ek(object));
        }
        return arrayList;
    }

    public static eQ s() {
        return new eQ(hP.d(e3.a.M().b7));
    }
}

