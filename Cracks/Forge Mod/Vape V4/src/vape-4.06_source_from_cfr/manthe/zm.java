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
import java.util.List;
import manthe.A5;
import manthe.CQ;
import manthe.DB;
import manthe.ca;
import manthe.ds;
import manthe.eE;
import manthe.eJ;
import manthe.eX;
import manthe.ef;
import manthe.ex;
import manthe.fP;
import manthe.gK;
import manthe.gO;
import manthe.gb;
import manthe.kx;
import manthe.o7;
import manthe.qB;
import manthe.qR;
import manthe.qs;
import manthe.y5;
import org.lwjgl.opengl.GL11;

public class zm
extends y5 {
    private final qR y = new qR();
    private final qB C = new qB();
    private final qs z = new qs(Collections.singleton(A5.af), new Color(173, 12, 255));
    private final qs w = new qs(Collections.singleton(A5.cS), new Color(255, 238, 154));
    private final qs E = new qs(Collections.singleton(A5.cA), new Color(255, 255, 255));
    private final ef B;
    private final DB u = DB.a(this, "Show Arrows", true);
    private final DB v = DB.a(this, "Show Pearls", true);
    private final DB D = DB.a(this, "Show Potions", false);
    private final DB x = DB.a(this, "Show Eggs", false);
    private final DB A = DB.a(this, "Show Snowballs", false);

    public zm() {
        super("Projectiles", -16535661, CQ.d, "Shows projectile trajectories while in air");
        this.B = ds.r();
        this.a(this.u, this.v, this.D, this.x, this.A);
    }

    @Override
    public void a(kx kx2) {
        gO gO2 = ds.t();
        for (Object e10 : gO2.l()) {
            ex ex2 = new ex(e10);
            if (!ex2.a(A5.bn)) continue;
            eE eE2 = new eE(ex2.a());
            eX eX2 = new eX(ex2.a());
            ca ca2 = this.a(eE2);
            if (ca2 == null) continue;
            this.a(eX2, ca2);
        }
    }

    private List<ca> S() {
        ArrayList<ca> arrayList = new ArrayList<ca>();
        if (this.u.u().booleanValue()) {
            arrayList.add(this.y);
        }
        if (this.D.u().booleanValue()) {
            arrayList.add(this.C);
        }
        if (this.v.u().booleanValue()) {
            arrayList.add(this.z);
        }
        if (this.x.u().booleanValue()) {
            arrayList.add(this.w);
        }
        if (this.A.u().booleanValue()) {
            arrayList.add(this.E);
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

    private void a(double d10, double d11, double d12) {
        GL11.glVertex3d((double)(d10 - this.B.m()), (double)(d11 - this.B.n()), (double)(d12 - this.B.j()));
    }

    private void a(eX eX2, ca ca2) {
        if (!eX2.a(A5.bn)) {
            return;
        }
        eJ eJ2 = ds.k();
        gO gO2 = ds.t();
        Color color = ca2.a(eX2.a());
        if (color == null) {
            color = new Color(255, 255, 255);
        }
        GL11.glPushMatrix();
        GL11.glLineWidth((float)1.5f);
        o7.a(color);
        GL11.glEnable((int)2848);
        GL11.glEnable((int)3042);
        GL11.glDisable((int)3553);
        GL11.glDisable((int)2929);
        GL11.glBegin((int)3);
        double d10 = eX2.z();
        double d11 = eX2.l();
        double d12 = eX2.g();
        double d13 = eX2.k();
        double d14 = eX2.D();
        double d15 = eX2.u();
        this.a(d10, d11, d12);
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
            List list = gO2.a(eJ2, fP2.e(d13, d14, d15).d(1.0, 1.0, 1.0));
            double d16 = 0.0;
            for (Object e10 : list) {
                double d17;
                gb gb3;
                ex ex2 = new ex(e10);
                if (!ex2.a(A5.cF) || ex2.a(A5.cI) || !ex2.V() || ex2.equals(eJ2) || !(gb3 = (fP2 = ex2.s().d(0.3, 0.3, 0.3)).a(gK3, gK2)).d() || !((d17 = gK3.a(gb3.k())) < d16) && d16 != 0.0) continue;
                d16 = d17;
                gb3.a(ex2);
                gb2 = gb3;
            }
            d10 += d13;
            d11 += d14;
            d12 += d15;
            if (gb2.d()) {
                d10 = gb2.k().g();
                d11 = gb2.k().h();
                d12 = gb2.k().f();
                break;
            }
            if (d11 < -128.0) break;
            d14 *= eX2.H() ? 0.8 : 0.99;
            this.a(d10 + (d13 *= eX2.H() ? 0.8 : 0.99), d11 + (d14 -= 0.05), d12 + (d15 *= eX2.H() ? 0.8 : 0.99));
        }
        GL11.glEnd();
        GL11.glDisable((int)2848);
        GL11.glDisable((int)3042);
        GL11.glEnable((int)3553);
        GL11.glEnable((int)2929);
        GL11.glPopMatrix();
    }
}

