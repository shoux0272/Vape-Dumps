/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package manthe;

import java.awt.Color;
import manthe.A5;
import manthe.CQ;
import manthe.DB;
import manthe.DF;
import manthe.Dp;
import manthe.ac;
import manthe.cB;
import manthe.ds;
import manthe.eJ;
import manthe.ef;
import manthe.ex;
import manthe.fv;
import manthe.kx;
import manthe.pf;
import manthe.y5;
import org.lwjgl.opengl.GL11;

public class zF
extends y5 {
    private final ef v;
    private final Color x = new Color(20, 20, 20, 128);
    private final DF w = DF.a((Object)this, "Scale", "#.#", "", 0.1, 1.0, 1.5, 0.1);
    private final DB y = DB.a(this, "Show distance", true);
    private final Dp u = Dp.a((Object)this, "Spawner names-whitelist", "Spawners", Dp.q, "Zombie", "Skeleton", "Creeper", "Spider");

    public zF() {
        super("SpawnerFinder", 9976573, CQ.d);
        this.v = ds.r();
        this.a(this.w, this.y, this.u);
    }

    @Override
    public void a(kx kx2) {
        boolean bl = GL11.glIsEnabled((int)3042);
        ds.M().a(1.0);
        GL11.glPushMatrix();
        if (!bl) {
            GL11.glEnable((int)3042);
        }
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glLineWidth((float)1.5f);
        GL11.glDisable((int)3553);
        GL11.glEnable((int)2848);
        GL11.glDisable((int)2929);
        GL11.glDepthMask((boolean)false);
        double d10 = this.v.m();
        double d11 = this.v.n();
        double d12 = this.v.j();
        eJ eJ2 = ds.k();
        for (Object e10 : ds.t().h()) {
            fv fv2;
            String string;
            if (!A5.br.isInstance(e10) || !this.u.d(string = (fv2 = new fv(e10)).j().f())) continue;
            String string2 = "";
            if (this.y.u().booleanValue()) {
                String string3 = cB.v + "a[" + cB.v + "f" + (int)eJ2.a((double)fv2.f(), (double)fv2.g(), (double)fv2.h()) + cB.v + "a]" + cB.v + "r";
                string2 = string2 + string3 + " ";
            }
            string2 = string2 + string + " spawner";
            ac.a(string2, (double)fv2.f() - d10 + 0.5, (double)fv2.g() - d11 - 1.0, (double)fv2.h() - d12 + 0.5, this.w.a(), pf.b((ex)eJ2, (double)fv2.f(), (double)fv2.g(), fv2.h()), -1, this.x, 1.4);
        }
        GL11.glDepthMask((boolean)true);
        GL11.glEnable((int)2929);
        GL11.glEnable((int)3553);
        GL11.glDisable((int)2848);
        if (!bl) {
            GL11.glDisable((int)3042);
        }
        GL11.glPopMatrix();
        ds.M().b(1.0);
    }
}

