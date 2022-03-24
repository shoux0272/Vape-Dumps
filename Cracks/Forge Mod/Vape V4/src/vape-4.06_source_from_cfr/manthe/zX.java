/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package manthe;

import java.awt.Color;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import manthe.A5;
import manthe.AO;
import manthe.CQ;
import manthe.ac;
import manthe.cy;
import manthe.ds;
import manthe.ef;
import manthe.ex;
import manthe.f8;
import manthe.fP;
import manthe.fn;
import manthe.g1;
import manthe.gf;
import manthe.kF;
import manthe.kx;
import manthe.y5;
import org.lwjgl.opengl.GL11;

public class zX
extends y5 {
    private final List<Object> w;
    private final AO u = new AO();
    private final ef v;

    public zX() {
        super("PropHunt", 0, 15962879, CQ.h, "Renders where all the hidden props are.");
        this.w = new CopyOnWriteArrayList<Object>();
        this.v = ds.r();
    }

    @Override
    public void a(kF kF2) {
        f8 f82;
        g1 g12;
        fn fn2 = kF2.getPacket();
        if (fn2.a(A5.bI) && (g12 = (f82 = new f8(fn2.a())).g()).h() >= -30000000 && g12.g() >= -30000000 && g12.h() < 30000000 && g12.g() < 30000000 && g12.f() >= 0 && g12.f() < 256 && !this.w.contains(g12.a()) && this.w.size() < 1024) {
            this.w.add(g12.a());
        }
    }

    @Override
    public void a(kx kx2) {
        double d10;
        double d11;
        double d12;
        cy cy2;
        if (this.u.a(2000L)) {
            this.u.d();
            this.w.clear();
        }
        ds.M().a(1.0);
        GL11.glPushMatrix();
        GL11.glEnable((int)3042);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glLineWidth((float)1.5f);
        GL11.glDisable((int)3553);
        GL11.glEnable((int)2848);
        GL11.glDisable((int)2929);
        GL11.glDepthMask((boolean)false);
        double d13 = this.v.m();
        double d14 = this.v.n();
        double d15 = this.v.j();
        for (Object object : ds.t().k()) {
            cy2 = new ex(object);
            if (!cy2.a(A5.b5)) continue;
            d12 = ((ex)cy2).T() + (((ex)cy2).z() - ((ex)cy2).T()) * (double)kx2.getTicks();
            d11 = ((ex)cy2).R() + (((ex)cy2).l() - ((ex)cy2).R()) * (double)kx2.getTicks();
            d10 = ((ex)cy2).X() + (((ex)cy2).g() - ((ex)cy2).X()) * (double)kx2.getTicks();
            float f10 = ((ex)cy2).r();
            fP fP2 = ((ex)cy2).s();
            fP fP3 = fP2.d(f10, f10, f10);
            Color color = new Color(0x23FFFFFF, true);
            ac.a(d12 - (fP3.f() - fP3.h()) / 2.0, d11 + (fP3.l() - ((ex)cy2).l()), d10 - (fP3.j() - fP3.i()) / 2.0, fP3.j() - fP3.i(), fP3.g() - fP3.l(), fP3.f() - fP3.h(), 0.1, Color.WHITE, color, d13, d14, d15);
        }
        for (Object object : this.w) {
            cy2 = new g1(object);
            d12 = ((gf)cy2).h();
            d11 = ((gf)cy2).f();
            d10 = ((gf)cy2).g();
            Color color = new Color(603914752, true);
            ac.a(d12, d11, d10, 1.0, 1.0, 1.0, 0.1, Color.RED, color, d13, d14, d15);
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

