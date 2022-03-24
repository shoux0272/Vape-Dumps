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
import manthe.DE;
import manthe.Ds;
import manthe.V;
import manthe.ac;
import manthe.ds;
import manthe.ef;
import manthe.f6;
import manthe.fT;
import manthe.fY;
import manthe.kx;
import manthe.tV;
import manthe.tW;
import manthe.y5;
import org.lwjgl.opengl.GL11;

public class zy
extends y5 {
    private final ef u;
    private final DB H = DB.a((Object)this, "Outline open", true, "Outlines open chests by contrasting color");
    private final DB E = DB.a(this, "Render Chests", true);
    private final DB w = DB.a(this, "Render Trapped Chests", true);
    private final DB K = DB.a(this, "Render Enderchests", false);
    private final DB C = DB.a(this, "Render Hopper", false);
    private final DB G = DB.a(this, "Render Furnace", false);
    private final DB v = DB.a(this, "Render Dispenser", false);
    private final DB B = DB.a(this, "Render Dropper", false);
    private final DB D = DB.a(this, "Render Shulker", false);
    private final DE J = DE.a((Object)this, "Chest Color", new Color(1, 255, 146, 100));
    private final DE y = DE.a((Object)this, "Chest Color", new Color(255, 0, 0, 100));
    private final DE F = DE.a((Object)this, "Ender Chest Color", new Color(126, 21, 156, 100));
    private final DE A = DE.a((Object)this, "Hopper Color", new Color(-7697782));
    private final DE I = DE.a((Object)this, "Furnace Color", new Color(-10855846));
    private final DE x = DE.a((Object)this, "Dispenser Color", new Color(1, 20, 200, 100));
    private final DE L = DE.a((Object)this, "Dropper Color", new Color(70, 200, 200, 100));
    private final DE z = DE.a((Object)this, "Shulker Color", new Color(255, 255, 255, 100));

    public zy() {
        super("StorageESP", 3465010, CQ.d);
        this.E.a(new Ds[]{this.J});
        this.w.a(new Ds[]{this.y});
        this.K.a(new Ds[]{this.F});
        this.C.a(new Ds[]{this.A});
        this.G.a(new Ds[]{this.I});
        this.v.a(new Ds[]{this.x});
        this.B.a(new Ds[]{this.L});
        this.D.a(new Ds[]{this.z});
        this.a(this.H, this.E, this.J, this.w, this.y, this.K, this.F, this.C, this.A, this.G, this.I, this.v, this.x, this.B, this.L, this.D, this.z);
        this.u = ds.r();
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
        double d10 = this.u.m();
        double d11 = this.u.n();
        double d12 = this.u.j();
        for (Object e10 : ds.t().h()) {
            Object object;
            Color color = null;
            fT fT2 = null;
            if ((this.E.u().booleanValue() || this.w.u().booleanValue()) && A5.N.isInstance(e10)) {
                object = new f6(e10);
                int n6 = ((f6)object).l();
                if (this.E.u().booleanValue() && n6 == 0) {
                    color = this.J.K();
                    fT2 = object;
                }
                if (this.w.u().booleanValue() && n6 == 1) {
                    color = this.y.K();
                    fT2 = object;
                }
            } else if (this.K.u().booleanValue() && A5.dN.isInstance(e10)) {
                color = this.F.K();
                fT2 = new fY(e10);
            } else if (this.C.u().booleanValue() && A5.du.isInstance(e10)) {
                color = this.A.K();
            } else if (this.G.u().booleanValue() && A5.d2.isInstance(e10)) {
                color = this.I.K();
            } else if (this.B.u().booleanValue() && A5.aK.equals(e10.getClass())) {
                color = this.L.K();
            } else if (this.v.u().booleanValue() && A5.cE.equals(e10.getClass())) {
                color = this.x.K();
            } else if (V.c() >= 23 && this.D.u().booleanValue() && A5.bZ.isInstance(e10)) {
                color = this.z.K();
            }
            if (color == null) continue;
            if (fT2 == null) {
                fT2 = new fT(e10);
            }
            color = new Color(((Color)color).getRed(), ((Color)color).getGreen(), ((Color)color).getBlue(), 100);
            if (fT2 instanceof f6) {
                f6 f62 = (f6)fT2;
                object = this.H.u().booleanValue() ? new tW(fT2.f(), fT2.g(), fT2.h(), -1, color, f62.j()) : new tV(fT2.f(), fT2.g(), fT2.h(), -1, color);
            } else if (fT2 instanceof fY) {
                fT fT3 = fT2;
                object = new tW(fT2.f(), fT2.g(), fT2.h(), -1, color, ((fY)fT3).k());
            } else {
                object = new tV(fT2.f(), fT2.g(), fT2.h(), -1, color);
            }
            ac.a(d10, d11, d12, (tV)object);
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

