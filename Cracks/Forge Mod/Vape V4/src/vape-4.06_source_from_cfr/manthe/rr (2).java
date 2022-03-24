/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package manthe;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Iterator;
import manthe.A5;
import manthe.AO;
import manthe.DB;
import manthe.Y;
import manthe.dT;
import manthe.ds;
import manthe.e3;
import manthe.e5;
import manthe.eC;
import manthe.eK;
import manthe.ej;
import manthe.eq;
import manthe.ex;
import manthe.fG;
import manthe.gO;
import manthe.gb;
import manthe.kJ;
import manthe.mq;
import manthe.o7;
import manthe.on;
import manthe.p1;
import manthe.qN;
import manthe.r1;
import manthe.z3;
import manthe.zt;
import manthe.zu;
import org.lwjgl.opengl.GL11;

public class rr
extends r1 {
    public final DB ag = DB.a((Object)this, "Show Hovered", false, "Show information on a hovered entity if not attacking.");
    private Object ai;
    private ej af;
    private final AO ae = new AO();
    private static rr ah;

    public rr() {
        super("Target Info", true);
        this.ah().add((p1)this.ag.c());
        this.c(123.0);
        this.b(21.0);
        this.o(false);
        this.l(false);
        this.f(false);
        ah = this;
    }

    @Override
    public void W() {
        z3 z32;
        super.W();
        gO gO2 = ds.t();
        if (this.ai == null || gO2.d() && !gO2.a().equals(this.ai)) {
            this.af = null;
            this.ai = ds.t().a();
        }
        if (!this.ai() || this.z() || !this.e()) {
            this.af = null;
            return;
        }
        if (ds.k().e() || gO2.e()) {
            this.af = null;
            return;
        }
        if (this.af != null && !ds.t().k().contains(this.af.a())) {
            this.af = null;
        }
        if (this.af != null) {
            double d10 = this.af.z() - this.af.T();
            double d11 = this.af.l() - this.af.R();
            double d12 = this.af.g() - this.af.X();
            double d13 = Math.max(Y.e(d10 * d10 + d11 * d11 + d12 * d12), ds.k().a(this.af));
            if (!ds.t().k().contains(this.af.a()) || d13 > 10.0 || this.ae.a(3000L)) {
                this.af = null;
            }
        }
        if ((z32 = on.p.H().b(z3.class)).S() != null) {
            this.af = z32.S();
            this.ae.d();
        }
    }

    @Override
    public void c() {
        super.c();
        this.c(123.0);
        this.b(20.0);
    }

    @Override
    public void c(boolean bl) {
        ex ex2;
        gb gb2;
        ej ej2;
        super.c(bl);
        this.b(on.p.t().r.K());
        if (this.z() || !this.e()) {
            return;
        }
        if (ds.k().e() || ds.t().e()) {
            this.af = null;
            return;
        }
        if (this.af != null && !ds.t().k().contains(this.af.a())) {
            this.af = null;
        }
        if ((ej2 = this.af) == null && this.ag.u().booleanValue() && (gb2 = ds.I()).d() && gb2.h().d() && (ex2 = gb2.h()).a(A5.cF)) {
            ej2 = new ej(ex2.a());
        }
        if (bl && ej2 == null) {
            return;
        }
        double d10 = this.aj().t();
        double d11 = this.aj().k();
        mq mq2 = on.p.a(1.0);
        mq mq3 = on.p.a(0.7);
        o7.a(d10, d11, d10 + this.q(), d11 + 37.0, bl ? new Color(30, 30, 30, 191) : new Color(30, 30, 30, 240));
        o7.a(d10 + 2.5, d11 + 2.5, d10 + 34.5, d11 + 34.5, 0.5, new Color(60, 60, 60, 127), new Color(180, 180, 180, 127));
        if (ej2 != null) {
            GL11.glPushMatrix();
            GL11.glTranslated((double)(d10 + 3.0 + 16.0), (double)(d11 + 3.0 + 30.0), (double)0.0);
            e3.f();
            o7.a(d10 + 3.0, d11 + 4.0, 31.0, 31.0);
            dT.a(0, 0, 14, -100.0f, 0.0f, ej2);
            GL11.glDisable((int)3089);
            e3.r();
            GL11.glPopMatrix();
        }
        String string = ej2 == null ? "Target Name" : ej2.S();
        mq2.a(string, d10 + 36.5, d11 + 2.5, -1);
        o7.a(d10 + 36.5, d11 + 12.0, d10 + 36.5 + 50.0, d11 + 16.0, 0.5, new Color(60, 60, 60, 127), new Color(180, 180, 180, 127));
        float f10 = 0.0f;
        if (ej2 != null) {
            f10 = ej2.a(A5.cc) ? on.p.H().b(zt.class).b(new eC(ej2.a())) : ej2.aD();
        }
        float f11 = ej2 == null ? 12.0f : f10;
        float f12 = ej2 == null ? 20.0f : ej2.at();
        float f13 = ej2 == null ? 4.0f : ej2.aR();
        float f14 = f11 / Math.max(f12 + f13, 1.0f);
        float f15 = f11 / Math.max(f12, 1.0f);
        Color color = f11 > 0.0f ? o7.a(f15, true) : Color.RED;
        o7.a(d10 + 37.0, d11 + 12.6, d10 + 37.0 + (double)(49.0f * f14), d11 + 15.5, color);
        if (f13 > 0.0f) {
            double d12 = 49.0f * (f13 / (f12 + f13));
            o7.a(d10 + 37.0 + (double)(49.0f * f14), d11 + 12.6, d10 + 37.0 + (double)(49.0f * f14) + d12, d11 + 15.5, -2130728448);
        }
        String string2 = new qN(1).b(f11 + f13);
        string2 = string2.replace(".0", "");
        GL11.glPushMatrix();
        GL11.glTranslated((double)(d10 + 88.0), (double)(d11 + 12.0), (double)0.0);
        if (!zu.ag()) {
            GL11.glScalef((float)0.5f, (float)0.5f, (float)0.5f);
        }
        mq3.a(string2 + " hp", 0.0, 0.0, -1);
        if (!zu.ag()) {
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
        }
        GL11.glPopMatrix();
        if (ej2 == null) {
            int n6 = 0;
            for (int k = 0; k < 5; ++k) {
                o7.a(d10 + 36.5 + (double)n6, d11 + 18.5, d10 + 52.5 + (double)n6, d11 + 34.5, 0.5, new Color(60, 60, 60, 127), new Color(180, 180, 180, 127));
                n6 += 17;
            }
        }
        if (ej2 != null && ej2.a(A5.cc)) {
            int n10;
            eC eC2 = new eC(ej2.a());
            ArrayList<fG> arrayList = new ArrayList<fG>();
            for (n10 = 3; n10 >= 0; --n10) {
                Iterator iterator = eC2.aU().g()[n10];
                if (iterator == null) continue;
                arrayList.add(new fG(iterator));
            }
            if (eC2.a_().d()) {
                arrayList.add(eC2.a_());
            }
            if (arrayList.size() < 1) {
                return;
            }
            n10 = 0;
            for (fG fG2 : arrayList) {
                o7.a(d10 + 36.5 + (double)n10, d11 + 18.5, d10 + 52.5 + (double)n10, d11 + 34.5, 0.5, new Color(60, 60, 60, 127), new Color(180, 180, 180, 127));
                this.a(d10 + 36.5 + (double)n10, d11 + 18.5, fG2);
                n10 += 17;
            }
        }
    }

    public void a(kJ kJ2) {
        if (this.z() || !this.e() || !this.ai()) {
            this.af = null;
            return;
        }
        if (kJ2.getTarget().a(A5.cF) && !kJ2.getTarget().a(A5.a8)) {
            this.af = new ej(kJ2.getTarget().a());
            this.ae.d();
        }
    }

    private void a(double d10, double d11, fG fG2) {
        GL11.glPushMatrix();
        eK eK2 = ds.J();
        float f10 = eK2.g();
        eK2.a(0.0f);
        GL11.glTranslated((double)d10, (double)d11, (double)0.0);
        eK2.a(ds.m(), ds.l(), fG2, 0, 0);
        eK2.b(ds.m(), ds.l(), fG2, 0, 0);
        eK2.a(f10);
        double d12 = 0.0;
        if (fG2.k().a(A5.bO)) {
            int n6 = eq.a(e5.f().l(), fG2);
            int n10 = eq.a(e5.g().l(), fG2);
            int n11 = eq.a(e5.v().l(), fG2);
            int n12 = eq.a(e5.r().l(), fG2);
            if (n6 > 0) {
                rr.a("Sh" + rr.a(n6) + n6, 0.0, d12);
                d12 += 4.5;
            }
            if (n10 > 0) {
                rr.a("Fir" + rr.a(n10) + n10, 0.0, d12);
                d12 += 4.5;
            }
            if (n11 > 0) {
                rr.a("Kb" + rr.a(n11) + n11, 0.0, d12);
                d12 += 4.5;
            }
            if (n12 > 0) {
                rr.a("Unb" + rr.a(n12) + n12, 0.0, d12);
            }
        } else if (fG2.k().a(A5.cN)) {
            int n13 = eq.a(e5.m().l(), fG2);
            int n14 = eq.a(e5.h().l(), fG2);
            int n15 = eq.a(e5.r().l(), fG2);
            if (n13 > 0) {
                rr.a("P" + rr.a(n13) + n13, 0.0, d12);
                d12 += 4.5;
            }
            if (n14 > 0) {
                rr.a("Th" + rr.a(n14) + n14, 0.0, d12);
                d12 += 4.5;
            }
            if (n15 > 0) {
                rr.a("Unb" + rr.a(n15) + n15, 0.0, d12);
            }
        } else if (fG2.k().a(A5.cZ)) {
            int n16 = eq.a(e5.t().l(), fG2);
            int n17 = eq.a(e5.p().l(), fG2);
            int n18 = eq.a(e5.u().l(), fG2);
            if (n16 > 0) {
                rr.a("Pow" + rr.a(n16) + n16, 0.0, d12);
                d12 += 4.5;
            }
            if (n17 > 0) {
                rr.a("Pun" + rr.a(n17) + n17, 0.0, d12);
                d12 += 4.5;
            }
            if (n18 > 0) {
                rr.a("Fir" + rr.a(n18) + n18, 0.0, d12);
            }
        }
        e3.l();
        GL11.glPopMatrix();
    }

    public static void a(String string, double d10, double d11) {
        mq mq2 = on.p.a(1.3);
        GL11.glPushMatrix();
        GL11.glTranslated((double)d10, (double)d11, (double)150.0);
        GL11.glScalef((float)0.5f, (float)0.5f, (float)0.5f);
        mq2.c(string, -1.0, 0.0, -16777216, false);
        mq2.c(string, 1.0, 0.0, -16777216, false);
        mq2.c(string, 0.0, -1.0, -16777216, false);
        mq2.c(string, 0.0, 1.0, -16777216, false);
        mq2.c(string, 0.0, 0.0, -1);
        if (zu.ag()) {
            mq2.c(string, 0.0, 0.0, -1);
        }
        GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
        GL11.glPopMatrix();
    }

    public static String a(int n6) {
        switch (n6) {
            case 1: {
                return "\u00a7f";
            }
            case 2: {
                return "\u00a7a";
            }
            case 3: {
                return "\u00a73";
            }
            case 4: {
                return "\u00a74";
            }
            case 5: {
                return "\u00a76";
            }
        }
        return "\u00a7f";
    }

    private Color a(float[] arrf, Color[] arrcolor, float f10) {
        Color color = Color.RED;
        if (arrf != null && arrcolor != null && arrf.length == arrcolor.length) {
            int[] arrn = this.a(arrf, f10);
            float[] arrf2 = new float[]{arrf[arrn[0]], arrf[arrn[1]]};
            Color[] arrcolor2 = new Color[]{arrcolor[arrn[0]], arrcolor[arrn[1]]};
            float f11 = arrf2[1] - arrf2[0];
            float f12 = f10 - arrf2[0];
            float f13 = f12 / f11;
            color = this.a(arrcolor2[0], arrcolor2[1], (double)(1.0f - f13));
        }
        return color;
    }

    private int[] a(float[] arrf, float f10) {
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

    private Color a(Color color, Color color2, double d10) {
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

    public static rr al() {
        return ah;
    }
}

