/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package manthe;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import manthe.A5;
import manthe.CQ;
import manthe.Cp;
import manthe.DB;
import manthe.DE;
import manthe.DF;
import manthe.DX;
import manthe.Y;
import manthe.ac;
import manthe.c0;
import manthe.ca;
import manthe.d0;
import manthe.dR;
import manthe.ds;
import manthe.e2;
import manthe.e3;
import manthe.eE;
import manthe.eJ;
import manthe.eR;
import manthe.eX;
import manthe.ef;
import manthe.ex;
import manthe.fG;
import manthe.fP;
import manthe.fk;
import manthe.gK;
import manthe.gO;
import manthe.gb;
import manthe.k9;
import manthe.kx;
import manthe.o7;
import manthe.pb;
import manthe.qB;
import manthe.qR;
import manthe.qs;
import manthe.y5;
import manthe.yI;
import org.lwjgl.opengl.GL11;

public class zB
extends y5 {
    private final qR K = new qR();
    private final qB J = new qB();
    private final qs B = new qs(Collections.singleton(A5.af), new Color(173, 12, 255));
    private final qs P = new qs(Collections.singleton(A5.cS), new Color(255, 238, 154));
    private final qs O = new qs(Collections.singleton(A5.cA), new Color(255, 255, 255));
    private final pb u = new pb("Always");
    private final pb L = new pb("Threat");
    private final pb E = new pb("Hit Only");
    private final DX S = DX.a((Object)this, "Alert Type", this.L, this.u, this.L, this.E);
    private final DE R = DE.a((Object)this, "Color", new Color(255, 0, 0));
    private final DB C = DB.a((Object)this, "Show Distance", false, "Renders the distance next to the arrow.");
    private final DF A = DF.a((Object)this, "Radius Scale", "#.##", "x", 0.0, 0.15, 1.0, 0.05);
    private final DB T = DB.a(this, "Show Arrows", true);
    private final DB H = DB.a(this, "Show Pearls", false);
    private final DB x = DB.a(this, "Show Potions", false);
    private final DB F = DB.a(this, "Show Eggs", true);
    private final DB z = DB.a(this, "Show Snowballs", true);
    private final DB G = DB.a(this, "Show Fireballs", true);
    private e2 N;
    private final Map<ex, double[]> I = new HashMap<ex, double[]>();
    private fG Q;
    private fG y;
    private fG v;
    private fG w;
    private fG D;
    private fG M;

    public zB() {
        super("Indicators", 16746028, CQ.d, "Draws arrows on screen when projectiles\nare nearby/hitting you.");
        this.a(this.S, this.R, this.T, this.H, this.x, this.F, this.z, this.G, this.A, this.C);
    }

    public boolean c(ex ex2) {
        eE eE2;
        ca ca2;
        if (Cp.e()) {
            return false;
        }
        if (ex2.a(A5.ad) && this.G.u().booleanValue()) {
            double d10 = this.a(new eR(ex2.a()));
            if (this.S.v() == this.E) {
                return d10 == 0.0;
            }
            return d10 != -1.0;
        }
        if (ex2.a(A5.bn) && (ca2 = this.a(eE2 = new eE(ex2.a()))) != null) {
            double d11 = this.a(eE2, ca2);
            if (this.S.v() == this.E) {
                return d11 == 0.0;
            }
            return d11 != -1.0;
        }
        return false;
    }

    @Override
    public void a(kx kx2) {
        if (this.N == null) {
            this.N = e2.b(ds.t(), c0.a(UUID.randomUUID(), "nig"));
        }
        this.I.clear();
        ef ef2 = ds.r();
        for (Object e10 : ds.t().k()) {
            ex ex2 = new ex(e10);
            if (!this.c(ex2)) continue;
            double d10 = ex2.T() + (ex2.z() - ex2.T()) * (double)kx2.getTicks() - ef2.m();
            double d11 = ex2.R() + (ex2.l() - ex2.R()) * (double)kx2.getTicks() - ef2.n();
            double d12 = ex2.X() + (ex2.g() - ex2.X()) * (double)kx2.getTicks() - ef2.j();
            double[] arrd = ac.a(d10, d11, d12);
            this.I.put(ex2, arrd);
        }
    }

    @Override
    public void t() {
        eJ eJ2 = ds.k();
        if (eJ2.e() || eJ2.i().e()) {
            return;
        }
        d0 d02 = d0.a(new ds(), ds.F(), ds.H());
        float f10 = (float)d02.g() / 2.0f;
        float f11 = (float)d02.h() / 2.0f;
        o7.a(Color.WHITE, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0);
        dR dR2 = ds.m();
        for (ex ex2 : this.I.keySet()) {
            Color color;
            Object object;
            Object object2;
            boolean bl = this.S.v() == this.E;
            double d10 = 0.0;
            double d11 = 0.0;
            if (!bl) {
                if (ex2.a(A5.bn)) {
                    object2 = new eE(ex2.a());
                    ca ca2 = this.a((eX)object2);
                    if (ca2 != null) {
                        d10 = this.a((eX)object2, ca2);
                        bl = d10 == 0.0;
                        d11 = 5.0;
                    }
                } else if (ex2.a(A5.ad)) {
                    d10 = this.a(new eR(ex2.a()));
                    bl = d10 < 3.0;
                    d11 = 12.0;
                }
            }
            if (this.S.v() == this.L && d10 > d11) continue;
            object2 = this.I.get(ex2);
            Object object3 = object2[0];
            double d12 = (double)ds.H() - object2[1];
            if (object2[2] < 1.0 && this.a((double)(object3 / (double)d02.f()), d12 / (double)d02.f(), d02)) continue;
            float f12 = this.a(f10, (double)(object3 / (double)d02.f()), f11, d12 / (double)d02.f()) + (float)(object2[2] > 1.0 ? 180 : 0);
            double d13 = (double)f10 * this.A.a();
            double d14 = (double)f11 * this.A.a();
            double d15 = Math.sqrt(1.0 / (1.0 / (d13 * d13) + Math.pow(Math.tan(Math.toRadians(f12)), 2.0) / (d14 * d14)));
            double d16 = Math.tan(Math.toRadians(f12)) * d15;
            float f13 = Y.a(f12 + 90.0f);
            if (f13 < 0.0f) {
                d15 = -d15;
                if (f13 > -180.0f) {
                    d16 = -d16;
                }
            }
            int n6 = 0;
            if (!bl && this.S.v() == this.L) {
                n6 = (int)(eJ2.a(ex2) * 2.0f);
            }
            if (n6 > 200) {
                n6 = 200;
            }
            fG fG2 = this.a(ex2);
            GL11.glPushMatrix();
            GL11.glTranslated((double)(d15 + (double)((float)d02.g() / 2.0f)), (double)(d16 + (double)((float)d02.h() / 2.0f)), (double)0.0);
            if (bl) {
                GL11.glScaled((double)1.5, (double)1.5, (double)1.0);
            }
            GL11.glPushMatrix();
            GL11.glRotatef((float)(f12 - 90.0f), (float)0.0f, (float)0.0f, (float)1.0f);
            ds.J().a(ds.m(), ds.l(), fG2, -8, -20);
            GL11.glPopMatrix();
            if (this.C.u().booleanValue() && n6 < 200) {
                GL11.glPushMatrix();
                object = (bl ? "\u00a7l" : "") + (int)eJ2.a(ex2) + "m";
                GL11.glScaled((double)0.5, (double)0.5, (double)0.0);
                e3.r();
                color = bl ? new Color(255, 0, 0) : new Color(255, 255, 255, 255 - n6);
                dR2.d((String)object, (double)((float)(-dR2.c((String)object)) / 2.0f), -dR2.a((String)object), yI.a(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()));
                e3.f();
                GL11.glPopMatrix();
            }
            GL11.glRotatef((float)(f12 - 90.0f), (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScaled((double)0.375, (double)0.5, (double)0.0);
            object = this.b(ex2);
            color = new Color(((Color)object).getRed(), ((Color)object).getGreen(), ((Color)object).getBlue(), 255 - n6);
            k9.a(color, -16.0f, 0.0f, "exo", 1.0f, false);
            GL11.glPopMatrix();
        }
        this.I.clear();
    }

    public fG a(ex ex2) {
        if (this.Q == null) {
            this.Q = fG.a(fk.a(262));
            this.y = fG.a(fk.a(368));
            this.v = fG.a(fk.a(438));
            this.w = fG.a(fk.a(344));
            this.D = fG.a(fk.a(332));
            this.M = fG.a(fk.a(385));
        }
        if (ex2.a(A5.c9)) {
            return this.Q;
        }
        if (ex2.a(A5.af)) {
            return this.y;
        }
        if (ex2.a(A5.aX)) {
            return this.v;
        }
        if (ex2.a(A5.cS)) {
            return this.w;
        }
        if (ex2.a(A5.cA)) {
            return this.D;
        }
        return this.M;
    }

    private Color b(ex ex2) {
        if (ex2.a(A5.bn)) {
            eE eE2 = new eE(ex2.a());
            Color color = this.a(eE2).a(eE2.a());
            if (color == null) {
                color = new Color(255, 255, 255);
            }
            return color;
        }
        if (ex2.a(A5.dG)) {
            return new Color(255, 109, 0);
        }
        return this.R.K();
    }

    private List<ca> S() {
        ArrayList<ca> arrayList = new ArrayList<ca>();
        if (this.T.u().booleanValue()) {
            arrayList.add(this.K);
        }
        if (this.x.u().booleanValue()) {
            arrayList.add(this.J);
        }
        if (this.H.u().booleanValue()) {
            arrayList.add(this.B);
        }
        if (this.F.u().booleanValue()) {
            arrayList.add(this.P);
        }
        if (this.z.u().booleanValue()) {
            arrayList.add(this.O);
        }
        return arrayList;
    }

    private ca a(eX eX2) {
        if (eX2.v()) {
            return null;
        }
        if (eX2.z() == eX2.T() && eX2.g() == eX2.X()) {
            return null;
        }
        for (ca ca2 : this.S()) {
            if (!ca2.a(eX2)) continue;
            return ca2;
        }
        return null;
    }

    private double a(eR eR2) {
        if (!eR2.a(A5.ad)) {
            return -1.0;
        }
        eJ eJ2 = ds.k();
        gO gO2 = ds.t();
        double d10 = eR2.z();
        double d11 = eR2.l();
        double d12 = eR2.g();
        double d13 = eR2.k();
        double d14 = eR2.D();
        double d15 = eR2.u();
        double d16 = 1000.0;
        for (int k = 0; k < 100; ++k) {
            gK gK2;
            float f10 = eR2.n();
            float f11 = eR2.A();
            fP fP2 = fP.a(d10 - (double)f10, d11, d12 - (double)f10, d10 + (double)f10, d11 + (double)f11, d12 + (double)f10);
            gK gK3 = gK.b(d10, d11, d12);
            gb gb2 = gO2.a(gK3, gK2 = gK.b(d10 + d13, d11 + d14, d12 + d15), false, true, false);
            if (gb2.d()) {
                gK2 = gK.b(gb2.k().g(), gb2.k().h(), gb2.k().f());
            }
            List list = gO2.a(this.N, fP2.e(d13, d14, d15).d(1.0, 1.0, 1.0));
            double d17 = 0.0;
            for (Object e10 : list) {
                double d18;
                gb gb3;
                ex ex2 = new ex(e10);
                if (!ex2.a(A5.cF) || ex2.a(A5.cI) || !ex2.V() || !ex2.equals(eJ2) || !(gb3 = (fP2 = ex2.s().d(0.3, 0.3, 0.3)).a(gK3, gK2)).d() || !((d18 = gK3.a(gb3.k())) < d17) && d17 != 0.0) continue;
                d17 = d18;
                gb3.a(ex2);
                gb2 = gb3;
            }
            double d19 = eJ2.a(d10 += d13, d11 += d14, d12 += d15);
            if (d19 < d16) {
                d16 = d19;
            }
            if (!gb2.d()) continue;
            d10 = gb2.k().g();
            d11 = gb2.k().h();
            d12 = gb2.k().f();
            if (!gb2.h().d()) break;
            return gb2.h().a(A5.u) ? 0.0 : eJ2.a(d10, d11, d12);
        }
        return d16;
    }

    private double a(eX eX2, ca ca2) {
        if (!eX2.a(A5.bn)) {
            return -1.0;
        }
        eJ eJ2 = ds.k();
        gO gO2 = ds.t();
        double d10 = eX2.z();
        double d11 = eX2.l();
        double d12 = eX2.g();
        double d13 = eX2.k();
        double d14 = eX2.D();
        double d15 = eX2.u();
        double d16 = 1000.0;
        while (true) {
            gK gK2;
            float f10 = ca2.b();
            float f11 = ca2.a();
            fP fP2 = fP.a(d10 - (double)f10, d11, d12 - (double)f10, d10 + (double)f10, d11 + (double)f11, d12 + (double)f10);
            gK gK3 = gK.b(d10, d11, d12);
            gb gb2 = gO2.a(gK3, gK2 = gK.b(d10 + d13, d11 + d14, d12 + d15), false, eX2.a(A5.c9), false);
            if (gb2.d()) {
                gK2 = gK.b(gb2.k().g(), gb2.k().h(), gb2.k().f());
            }
            List list = gO2.a(this.N, fP2.e(d13, d14, d15).d(1.0, 1.0, 1.0));
            double d17 = 0.0;
            for (Object e10 : list) {
                double d18;
                gb gb3;
                ex ex2 = new ex(e10);
                if (!ex2.a(A5.cF) || ex2.a(A5.cI) || !ex2.V() || !ex2.equals(eJ2) || !(gb3 = (fP2 = ex2.s().d(0.3, 0.3, 0.3)).a(gK3, gK2)).d() || !((d18 = gK3.a(gb3.k())) < d17) && d17 != 0.0) continue;
                d17 = d18;
                gb3.a(ex2);
                gb2 = gb3;
            }
            double d19 = eJ2.a(d10 += d13, d11 += d14, d12 += d15);
            if (d19 < d16) {
                d16 = d19;
            }
            if (gb2.d()) {
                d10 = gb2.k().g();
                d11 = gb2.k().h();
                d12 = gb2.k().f();
                if (!gb2.h().d()) break;
                return gb2.h().a(A5.u) ? 0.0 : eJ2.a(d10, d11, d12);
            }
            if (d11 < -128.0) break;
            d13 *= eX2.H() ? 0.8 : 0.99;
            d14 *= eX2.H() ? 0.8 : 0.99;
            d15 *= eX2.H() ? 0.8 : 0.99;
            d14 -= 0.05;
        }
        return d16;
    }

    private boolean a(double d10, double d11, d0 d02) {
        return d10 > 0.0 && d11 > 0.0 && d10 < (double)d02.g() && d11 < (double)d02.h();
    }

    private float a(double d10, double d11, double d12, double d13) {
        return (float)Math.toDegrees(Math.atan2(d13 - d12, d11 - d10));
    }
}

