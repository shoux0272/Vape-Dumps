/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package manthe;

import java.awt.Color;
import manthe.ac;
import manthe.ds;
import manthe.ex;
import manthe.fP;
import manthe.kx;
import manthe.on;
import manthe.y5;
import manthe.yc;
import manthe.z2;
import manthe.zO;
import org.lwjgl.opengl.GL11;

public class yr
extends yc {
    private final z2 v = (z2)this.S();
    private zO w;

    public yr(y5 y52, String string) {
        super(y52, string);
    }

    @Override
    public void a(kx kx2) {
        ds.M().a(1.0);
        GL11.glPushMatrix();
        GL11.glEnable((int)3042);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glLineWidth((float)1.5f);
        GL11.glDisable((int)3553);
        GL11.glEnable((int)2848);
        GL11.glDisable((int)2929);
        GL11.glDepthMask((boolean)false);
        double d10 = this.v.E.m();
        double d11 = this.v.E.n();
        double d12 = this.v.E.j();
        if (this.w == null) {
            this.w = on.p.H().b(zO.class);
        }
        for (Object e10 : ds.t().k()) {
            Color color;
            ex ex2 = new ex(e10);
            if (on.p.t().b(ex2) && this.v.z.u().booleanValue() || (color = this.v.a(e10)) == null) continue;
            double d13 = ex2.T() + (ex2.z() - ex2.T()) * (double)kx2.getTicks();
            double d14 = ex2.R() + (ex2.l() - ex2.R()) * (double)kx2.getTicks();
            double d15 = ex2.X() + (ex2.g() - ex2.X()) * (double)kx2.getTicks();
            float f10 = ex2.r() + (this.v.M.u() != false ? this.w.S() : 0.0f);
            fP fP2 = ex2.s();
            fP fP3 = fP2.d(f10, f10, f10);
            ac.a(d13 - (fP3.f() - fP3.h()) / 2.0, d14 + (fP3.l() - ex2.l()), d15 - (fP3.j() - fP3.i()) / 2.0, fP3.j() - fP3.i(), fP3.g() - fP3.l(), fP3.f() - fP3.h(), 0.1, color, null, d10, d11, d12);
            if (!(this.w.S() > 0.0f) || !this.v.M.u().booleanValue() || !this.v.I.u().booleanValue()) continue;
            fP3 = fP2.d(ex2.r(), ex2.r(), ex2.r());
            Color color2 = new Color(255 - color.getRed(), 255 - color.getGreen(), 255 - color.getBlue(), 70);
            ac.a(d13 - (fP3.f() - fP3.h()) / 2.0, d14 - (fP3.l() - ex2.l()), d15 - (fP3.j() - fP3.i()) / 2.0, fP3.j() - fP3.i(), fP3.g() - fP3.l(), fP3.f() - fP3.h(), 0.1, color2, null, d10, d11, d12);
        }
        GL11.glDepthMask((boolean)true);
        GL11.glEnable((int)2929);
        GL11.glEnable((int)3553);
        GL11.glDisable((int)2848);
        GL11.glDisable((int)3042);
        GL11.glPopMatrix();
        ds.M().b(1.0);
    }
}

