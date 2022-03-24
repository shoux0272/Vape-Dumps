/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package manthe;

import java.awt.Color;
import java.util.HashMap;
import java.util.Map;
import manthe.A5;
import manthe.CQ;
import manthe.Cp;
import manthe.DB;
import manthe.DE;
import manthe.DF;
import manthe.Y;
import manthe.ac;
import manthe.d0;
import manthe.dR;
import manthe.ds;
import manthe.e3;
import manthe.eC;
import manthe.eJ;
import manthe.ef;
import manthe.ex;
import manthe.k9;
import manthe.kx;
import manthe.o7;
import manthe.on;
import manthe.y5;
import manthe.yI;
import org.lwjgl.opengl.GL11;

public class zd
extends y5 {
    private final DE w = DE.a((Object)this, "Color", new Color(255, 0, 0));
    private final DB y = DB.a((Object)this, "Show Distance", false, "Renders the distance next to the arrow.");
    private final DB u = DB.a((Object)this, "Scale Opacity", false, "Lowers the opacity the farther they are.");
    private final DF v = DF.a((Object)this, "Radius Scale", "#.##", "x", 0.0, 0.5, 1.0, 0.05);
    private final Map<ex, double[]> x = new HashMap<ex, double[]>();

    public zd() {
        super("Arrows", 14223934, CQ.d, "Draws arrows on screen when entities\nare out of your field of view.");
        this.a(this.w, this.v, this.y, this.u);
    }

    public boolean a(ex ex2) {
        if (Cp.e()) {
            return false;
        }
        if (!ex2.a(A5.cc)) {
            return false;
        }
        if (ex2.a(A5.u)) {
            return false;
        }
        eC eC2 = new eC(ex2.a());
        if (on.p.t().b((ex)eC2)) {
            return false;
        }
        if (on.p.t().a((ex)eC2)) {
            return false;
        }
        return !on.p.N().c(eC2.S());
    }

    @Override
    public void a(kx kx2) {
        this.x.clear();
        ef ef2 = ds.r();
        for (Object e10 : ds.t().k()) {
            ex ex2 = new ex(e10);
            if (!this.a(ex2)) continue;
            double d10 = ex2.T() + (ex2.z() - ex2.T()) * (double)kx2.getTicks() - ef2.m();
            double d11 = ex2.R() + (ex2.l() - ex2.R()) * (double)kx2.getTicks() - ef2.n();
            double d12 = ex2.X() + (ex2.g() - ex2.X()) * (double)kx2.getTicks() - ef2.j();
            double[] arrd = ac.a(d10, d11, d12);
            this.x.put(ex2, arrd);
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
        for (ex ex2 : this.x.keySet()) {
            Color color;
            Object object;
            int n6;
            double[] arrd = this.x.get(ex2);
            double d10 = arrd[0];
            double d11 = (double)ds.H() - arrd[1];
            if (arrd[2] < 1.0 && this.a(d10 / (double)d02.f(), d11 / (double)d02.f(), d02)) continue;
            float f12 = this.a(f10, d10 / (double)d02.f(), f11, d11 / (double)d02.f()) + (float)(arrd[2] > 1.0 ? 180 : 0);
            double d12 = (double)f10 * this.v.a();
            double d13 = (double)f11 * this.v.a();
            double d14 = Math.sqrt(1.0 / (1.0 / (d12 * d12) + Math.pow(Math.tan(Math.toRadians(f12)), 2.0) / (d13 * d13)));
            double d15 = Math.tan(Math.toRadians(f12)) * d14;
            float f13 = Y.a(f12 + 90.0f);
            if (f13 < 0.0f) {
                d14 = -d14;
                if (f13 > -180.0f) {
                    d15 = -d15;
                }
            }
            if ((n6 = (int)((double)eJ2.a(ex2) * 1.5)) > 255) {
                n6 = 255;
            }
            if (this.y.u().booleanValue() && n6 < 255) {
                GL11.glPushMatrix();
                object = (int)eJ2.a(ex2) + "m";
                GL11.glTranslated((double)(d14 + (double)((float)d02.g() / 2.0f)), (double)(d15 + (double)((float)d02.h() / 2.0f)), (double)0.0);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.0);
                e3.r();
                color = new Color(255, 255, 255, 255 - (this.u.u() != false ? n6 : 0));
                dR2.d((String)object, (double)((float)(-dR2.c((String)object)) / 2.0f), -dR2.a((String)object), yI.a(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()));
                e3.f();
                GL11.glPopMatrix();
            }
            GL11.glPushMatrix();
            GL11.glTranslated((double)(d14 + (double)((float)d02.g() / 2.0f)), (double)(d15 + (double)((float)d02.h() / 2.0f)), (double)0.0);
            GL11.glRotatef((float)(f12 - 90.0f), (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScaled((double)0.375, (double)0.5, (double)0.0);
            object = this.w.K();
            color = new Color(((Color)object).getRed(), ((Color)object).getGreen(), ((Color)object).getBlue(), 255 - (this.u.u() != false ? n6 : 0));
            k9.a(color, -16.0f, 0.0f, "exo", 1.0f, false);
            GL11.glPopMatrix();
        }
        this.x.clear();
    }

    private boolean a(double d10, double d11, d0 d02) {
        return d10 > 0.0 && d11 > 0.0 && d10 < (double)d02.g() && d11 < (double)d02.h();
    }

    private float a(double d10, double d11, double d12, double d13) {
        return (float)Math.toDegrees(Math.atan2(d13 - d12, d11 - d10));
    }
}

