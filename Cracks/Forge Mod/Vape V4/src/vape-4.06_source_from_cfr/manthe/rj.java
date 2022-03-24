/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package manthe;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import manthe.A5;
import manthe.DB;
import manthe.DE;
import manthe.DF;
import manthe.DX;
import manthe.L;
import manthe.Y;
import manthe.ds;
import manthe.eC;
import manthe.eJ;
import manthe.ex;
import manthe.gO;
import manthe.m8;
import manthe.mq;
import manthe.o7;
import manthe.on;
import manthe.p1;
import manthe.pb;
import manthe.r1;
import org.lwjgl.opengl.GL11;

public class rj
extends r1 {
    public final pb ak = new pb("2D Radar");
    public final pb ah = new pb("Text Radar");
    public final DX aj = DX.a((Object)this, "Mode", this.ak, this.ak, this.ah);
    public final DF at = DF.a((Object)this, "Radar Size", "#.#", "", 25.0, 110.0, 500.0, "The size of the radar.");
    public final DF aw = DF.a(this, "Dot Size", "#.#", "", 0.5, 3.0, 10.0, 0.1, "The size of the radar.");
    public final DF av = DF.a(this, "Radar Scale", "#.##", "", 0.1, 0.5, 5.0, 0.01, "The size of the radar.");
    public final DF aA = DF.a(this, "Max Distance", "#", "m", 0.0, 0.0, 100.0, 5.0, "Maximum distance to show.\nUse 0 to ignore distance requirement.");
    public final DF ai = DF.a(this, "Max Shown", "#", "", 0.0, 25.0, 50.0, 1.0, "Maximum players to show at once.\nUse 0 to show all players.");
    public final pb aC = new pb("Team");
    public final pb ag = new pb("Custom");
    public final pb am = new pb("Relationship");
    public final DX aB = DX.a((Object)this, "ColorMode1", "Color Mode", "", this.aC, this.aC, this.ag, this.am);
    public final pb as = new pb("Circles");
    public final pb ae = new pb("Squares");
    public final DX an = DX.a((Object)this, "DotStyle1", "Dot Style", "", this.as, this.as, this.ae);
    public final pb ax = new pb("Square");
    public final pb ay = new pb("Circle");
    public final DX au = DX.a((Object)this, "Radar Style", this.ax, this.ax, this.ay);
    public final DE az = DE.a((Object)this, "Custom Color", Color.WHITE);
    public final DE ar = DE.a((Object)this, "Friendly Color", Color.GREEN);
    public final DE ap = DE.a((Object)this, "Enemy Color", Color.RED);
    public final DB af = DB.a((Object)this, "Show Cross", true, "Render a center cross on the radar.");
    public final DB al = DB.a((Object)this, "Show Background", true, "Render a background behind the radar.");
    public final DB aq = DB.a((Object)this, "Clamp Radar", true, "Clamps dots to the given size and shape.");
    private static rj ao;

    public rj() {
        super("Radar", true);
        this.f(false);
        this.m(true);
        this.aj.a(this.ak, this.at, this.av, this.aB, this.au, this.an, this.aw, this.af, this.aq);
        this.aj.a(this.ah, this.aA, this.ai);
        this.aB.a(this.ag, this.az);
        this.aB.a(this.am, this.ar, this.ap);
        this.ah().add((p1)this.aj.c());
        this.ah().add((p1)this.aB.c());
        this.ah().add((p1)this.az.c());
        this.ah().add((p1)this.ar.c());
        this.ah().add((p1)this.ap.c());
        this.ah().add((p1)this.au.c());
        this.ah().add((p1)this.an.c());
        this.ah().add((p1)this.aw.c());
        this.ah().add((p1)this.at.c());
        this.ah().add((p1)this.av.c());
        this.ah().add((p1)this.al.c());
        this.ah().add((p1)this.aA.c());
        this.ah().add((p1)this.ai.c());
        this.ah().add((p1)this.af.c());
        this.ah().add((p1)this.aq.c());
        this.c(130.0);
        this.b(20.0);
        this.n(true);
        this.l(false);
        ao = this;
    }

    @Override
    public void c() {
        super.c();
        if (this.aj.v() == this.ak) {
            this.c(130.0);
        } else {
            this.c(100.0);
        }
        this.b(20.0);
    }

    @Override
    public void c(boolean bl) {
        super.c(bl);
        if (this.z() || !this.e()) {
            return;
        }
        mq mq2 = on.p.a(1.0);
        this.b(on.p.t().r.K());
        double d10 = this.aj().t();
        double d11 = this.aj().k() + (double)(bl ? -20 : 0);
        eJ eJ2 = ds.k();
        gO gO2 = ds.t();
        if (gO2.e() || eJ2.e()) {
            return;
        }
        List list = gO2.j();
        if (this.aj.v() == this.ak) {
            boolean bl2;
            boolean bl3 = GL11.glIsEnabled((int)3042);
            double d12 = this.at.a();
            double d13 = d12 / 2.0;
            double d14 = this.av.a();
            double d15 = this.aw.a();
            boolean bl4 = bl2 = this.au.v() == this.ax;
            if (this.al.u().booleanValue()) {
                if (bl2) {
                    o7.a(d10, d11, d10 + d12, d11 + d12, 2.0, new Color(-2145509859, true), new Color(-1308622848, true));
                } else {
                    o7.a(d10, d11, 0.0, d12, 0.0, 0.0, 0.0, 0.5);
                }
            }
            if (this.af.u().booleanValue()) {
                o7.a(d10 + d12 / 2.0 - 0.5, d11 + 0.5, d10 + d12 / 2.0 + 0.5, d11 + d12 - 0.5, new Color(-1077360440, true));
                o7.a(d10 + 0.5, d11 + d12 / 2.0 - 0.5, d10 + d12 - 0.5, d11 + d12 / 2.0 + 0.5, new Color(-1077360440, true));
            }
            for (Object e10 : list) {
                double d16;
                double d17;
                if (e10 == eJ2.a()) continue;
                eC eC2 = new eC(e10);
                double d18 = eJ2.T() + (eJ2.z() - eJ2.T()) * (double)ds.O().g();
                double d19 = eJ2.X() + (eJ2.g() - eJ2.X()) * (double)ds.O().g();
                double d20 = eC2.T() + (eC2.z() - eC2.T()) * (double)ds.O().g();
                double d21 = eC2.X() + (eC2.g() - eC2.X()) * (double)ds.O().g();
                double d22 = d20 - d18;
                double d23 = d21 - d19;
                double d24 = d10 + d13;
                double d25 = d11 + d13;
                float f10 = (float)Math.cos((double)eJ2.U() * (Math.PI / 180));
                float f11 = (float)Math.sin((double)eJ2.U() * (Math.PI / 180));
                double d26 = -(d22 * (double)f10 + d23 * (double)f11) * d14;
                double d27 = -(d23 * (double)f10 - d22 * (double)f11) * d14;
                if (bl2) {
                    d17 = d24 + (this.aq.u() == false ? d26 : Y.a(d26, -d13 + d15 / 2.0, d13 - d15 / 2.0));
                    d16 = d25 + (this.aq.u() == false ? d27 : Y.a(d27, -d13 + d15 / 2.0, d13 - d15 / 2.0));
                } else {
                    if (this.aq.u().booleanValue() && Math.sqrt(d26 * d26 + d27 * d27) > d13) {
                        float f12 = (float)Math.atan2(d27, d26);
                        d26 = (float)((d13 - 0.5) * Math.cos(f12));
                        d27 = (float)((d13 - 0.5) * Math.sin(f12));
                    }
                    d17 = d24 + d26;
                    d16 = d25 + d27;
                }
                Color color = Color.WHITE;
                if (this.aB.v() == this.ag) {
                    color = this.az.K();
                } else if (this.aB.v() == this.aC) {
                    L l = on.p.t().b(eC2);
                    if (l != null) {
                        color = l;
                    }
                } else if (this.aB.v() == this.am) {
                    Color color2 = color = on.p.t().a((ex)eC2) ? this.ar.K() : this.ap.K();
                }
                if (on.p.N().c(eC2.S()) && on.p.N().c.u().booleanValue()) {
                    color = on.p.N().e.K();
                }
                if (on.p.b().a(eC2.S()) && on.p.b().c.u().booleanValue()) {
                    color = on.p.b().e.K();
                }
                if (this.an.v() == this.ae) {
                    o7.a(d17 - d15 / 2.0, d16 - d15 / 2.0, d17 + d15 / 2.0, d16 + d15 / 2.0, 0.5, color, new Color(-16777216, true));
                    continue;
                }
                double d28 = d15 / 2.0;
                o7.a(d17 - d28 / 2.0, d16 - d28 / 2.0, 0.0, d28, (double)((float)color.getRed() / 255.0f), (double)((float)color.getGreen() / 255.0f), (double)((float)color.getBlue() / 255.0f), (double)((float)color.getAlpha() / 255.0f));
            }
            if (bl3 && !GL11.glIsEnabled((int)3042)) {
                GL11.glEnable((int)3042);
            }
        } else {
            List<eC> list2 = new ArrayList<eC>();
            ArrayList arrayList = new ArrayList();
            int n6 = this.aA.a().intValue();
            for (Object e11 : list) {
                if (!A5.cc.isAssignableFrom(e11.getClass()) || e11 == eJ2.a() || arrayList.contains(e11)) continue;
                eC eC3 = new eC(e11);
                if (n6 != 0 && !(eJ2.a(eC3) <= (float)n6) || on.p.t().b((ex)eC3)) continue;
                list2.add(eC3);
                arrayList.add(e11);
            }
            if (list2.isEmpty()) {
                return;
            }
            list2.sort(new m8(this, eJ2));
            int n10 = this.ai.a().intValue();
            int n11 = 0;
            if (this.ai.a() != 0.0 && list2.size() > n10) {
                n11 = list2.size() - n10;
                list2 = list2.subList(0, n10);
            }
            int n12 = 0;
            for (eC eC4 : list2) {
                int n13 = (int)eJ2.a(eC4);
                String string = n13 > 100 ? "a" : (n13 > 50 ? "e" : "c");
                String string2 = String.format("\u00a7%s%dm", string, n13);
                if (this.al.u().booleanValue()) {
                    o7.a(d10, d11 + (double)n12, d10 + this.q(), d11 + (double)n12 + 10.0, new Color(20, 20, 20, 180));
                    o7.a(d10, d11 + (double)n12 + 9.5, d10 + this.q(), d11 + (double)n12 + 10.0, new Color(25, 25, 25, 65));
                }
                int n14 = on.p.N().a(eC4) ? on.p.N().e.s() : (on.p.b().a(eC4) ? on.p.b().e.s() : -1);
                mq2.a(eC4.S(), d10 + 1.0, d11 + 2.0 + (double)n12, n14);
                mq2.a(string2, d10 + this.q() - mq2.b(string2) - 1.0, d11 + 2.0 + (double)n12, -1);
                n12 += 10;
            }
            if (n11 > 0) {
                if (this.al.u().booleanValue()) {
                    o7.a(d10, d11 + (double)n12, d10 + this.q(), d11 + (double)n12 + 10.0, new Color(20, 20, 20, 180));
                    o7.a(d10, d11 + (double)n12 + 9.5, d10 + this.q(), d11 + (double)n12 + 10.0, new Color(25, 25, 25, 65));
                }
                mq2.a(n11 + " more...", d10 + 1.0, d11 + 2.0 + (double)n12, -1);
            }
        }
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

    public static rj al() {
        return ao;
    }
}

