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
import manthe.CQ;
import manthe.DB;
import manthe.DE;
import manthe.L;
import manthe.Y;
import manthe.dC;
import manthe.dJ;
import manthe.ds;
import manthe.dx;
import manthe.eJ;
import manthe.ef;
import manthe.ex;
import manthe.fP;
import manthe.fk;
import manthe.gK;
import manthe.gO;
import manthe.gb;
import manthe.kx;
import manthe.o7;
import manthe.y5;
import org.lwjgl.opengl.GL11;

public class zT
extends y5 {
    private final ef w;
    private final DB v = DB.a((Object)this, "Ghost Bow Charge", false, "Draws a ghost trajectory of a fully charged\nshot when not pulling back bow");
    private final DE x = DE.a((Object)this, "Trajectory Color", 128.0);
    private final DE u = DE.a((Object)this, "Target Color", 64.0);

    public zT() {
        super("Trajectories", -16535661, CQ.d, "Shows a path of where your projectile will land\nTarget Color will only be used on the cross if there is an entity intersecting it");
        this.a(this.x, this.u, this.v);
        this.w = ds.r();
    }

    public List a(fP fP2) {
        ArrayList arrayList = new ArrayList();
        int n6 = Y.c((fP2.f() - 2.0) / 16.0);
        int n10 = Y.c((fP2.h() + 2.0) / 16.0);
        int n11 = Y.c((fP2.j() - 2.0) / 16.0);
        int n12 = Y.c((fP2.i() + 2.0) / 16.0);
        gO gO2 = ds.t();
        for (int k = n6; k <= n10; ++k) {
            for (int i10 = n11; i10 <= n12; ++i10) {
                if (!gO2.f().a(k, i10)) continue;
                gO2.a(k, i10).a(ds.k(), fP2, arrayList, null);
            }
        }
        return arrayList;
    }

    @Override
    public void a(kx kx2) {
        boolean bl = false;
        eJ eJ2 = ds.k();
        if (eJ2.a_().d()) {
            fk fk2 = eJ2.a_().k();
            if (!(fk2.a(A5.cZ) || fk2.a(A5.be) || fk2.a(A5.an) || fk2.a(A5.dt))) {
                return;
            }
            if (fk2.a(A5.cZ)) {
                bl = true;
            }
        } else {
            return;
        }
        double d10 = this.w.m() - (double)(Y.d(eJ2.U() / 180.0f * (float)Math.PI) * 0.16f);
        double d11 = this.w.n() + (double)eJ2.am() - (double)0.1f;
        double d12 = this.w.j() - (double)(Y.f(eJ2.U() / 180.0f * (float)Math.PI) * 0.16f);
        double d13 = (double)(-Y.f(eJ2.U() / 180.0f * (float)Math.PI) * Y.d(eJ2.K() / 180.0f * (float)Math.PI)) * (bl ? 1.0 : 0.4);
        double d14 = (double)(-Y.f(eJ2.K() / 180.0f * (float)Math.PI)) * (bl ? 1.0 : 0.4);
        double d15 = (double)(Y.d(eJ2.U() / 180.0f * (float)Math.PI) * Y.d(eJ2.K() / 180.0f * (float)Math.PI)) * (bl ? 1.0 : 0.4);
        boolean bl2 = false;
        int n6 = 40;
        if (!this.v.u().booleanValue() && eJ2.bb() <= 0 && bl) {
            return;
        }
        if (eJ2.bb() > 0 && bl) {
            n6 = eJ2.bb();
            bl2 = true;
        }
        int n10 = 72000 - n6;
        float f10 = (float)n10 / 20.0f;
        if ((double)(f10 = (f10 * f10 + f10 * 2.0f) / 3.0f) < 0.1) {
            return;
        }
        if (f10 > 1.0f) {
            f10 = 1.0f;
        }
        L l = this.x.K();
        Color color = new Color(((Color)l).getRed(), ((Color)l).getGreen(), ((Color)l).getBlue(), bl2 || !bl ? 255 : 100);
        o7.a(color);
        GL11.glPushMatrix();
        ds.M().a(0.0);
        boolean bl3 = GL11.glIsEnabled((int)2929);
        boolean bl4 = GL11.glIsEnabled((int)3553);
        boolean bl5 = GL11.glIsEnabled((int)3042);
        if (bl3) {
            GL11.glDisable((int)2929);
        }
        if (bl4) {
            GL11.glDisable((int)3553);
        }
        GL11.glEnable((int)2848);
        GL11.glBlendFunc((int)770, (int)771);
        if (!bl5) {
            GL11.glEnable((int)3042);
        }
        float f11 = Y.e(d13 * d13 + d14 * d14 + d15 * d15);
        d13 /= (double)f11;
        d14 /= (double)f11;
        d15 /= (double)f11;
        d13 *= (double)(bl ? f10 * 2.0f : 1.0f) * 1.5;
        d14 *= (double)(bl ? f10 * 2.0f : 1.0f) * 1.5;
        d15 *= (double)(bl ? f10 * 2.0f : 1.0f) * 1.5;
        GL11.glLineWidth((float)1.5f);
        GL11.glBegin((int)3);
        boolean bl6 = false;
        boolean bl7 = false;
        gb gb2 = new gb(null);
        float f12 = (float)(bl ? 0.3 : 0.25);
        for (int k = 0; k <= 100 && !bl6; ++k) {
            gK gK2 = gK.b(d10, d11, d12);
            gK gK3 = gK.b(d10 + d13, d11 + d14, d12 + d15);
            gb gb3 = ds.t().a(gK2, gK3, false, true, false);
            gK2 = gK.b(d10, d11, d12);
            gK3 = gK.b(d10 + d13, d11 + d14, d12 + d15);
            if (gb3.d()) {
                bl6 = true;
                gb2 = gb3;
            }
            fP fP2 = fP.a(d10 - (double)f12, d11 - (double)f12, d12 - (double)f12, d10 + (double)f12, d11 + (double)f12, d12 + (double)f12);
            List list = this.a(fP2.e(d13, d14, d15).d(1.0, 1.0, 1.0));
            for (int i10 = 0; i10 < list.size(); ++i10) {
                ex ex2 = new ex(list.get(i10));
                if (!ex2.V() || ex2 == eJ2) continue;
                float f13 = 0.3f;
                fP fP3 = ex2.s().d(0.3f, 0.3f, 0.3f);
                gb gb4 = fP3.a(gK2, gK3);
                if (!gb4.d()) continue;
                bl6 = true;
                bl7 = true;
                gb2 = gb4;
            }
            if (bl7) {
                o7.a(this.u.K());
            }
            float f14 = 0.99f;
            d14 *= (double)f14;
            GL11.glVertex3d((double)((d10 += (d13 *= (double)f14)) - this.w.m()), (double)((d11 += (d14 -= bl ? 0.05 : 0.03)) - this.w.n()), (double)((d12 += (d15 *= (double)f14)) - this.w.j()));
        }
        GL11.glEnd();
        GL11.glDisable((int)2929);
        GL11.glDisable((int)3042);
        GL11.glTranslated((double)(d10 - this.w.m()), (double)(d11 - this.w.n()), (double)(d12 - this.w.j()));
        if (gb2.d()) {
            switch (gb2.f()) {
                case 2: {
                    GL11.glRotatef((float)90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                    break;
                }
                case 3: {
                    GL11.glRotatef((float)90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                    break;
                }
                case 4: {
                    GL11.glRotatef((float)90.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                    break;
                }
                case 5: {
                    GL11.glRotatef((float)90.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                    break;
                }
            }
            if (bl7) {
                o7.a(this.u.K());
            }
        }
        this.S();
        GL11.glDisable((int)2848);
        if (bl3) {
            GL11.glEnable((int)2929);
        }
        if (bl4) {
            GL11.glEnable((int)3553);
        }
        if (!bl5) {
            GL11.glDisable((int)3042);
        }
        ds.M().b(0.0);
        GL11.glPopMatrix();
    }

    public boolean a(fP fP2, dJ dJ2) {
        int n6 = Y.c(fP2.f());
        int n10 = Y.c(fP2.h() + 1.0);
        int n11 = Y.c(fP2.l());
        int n12 = Y.c(fP2.g() + 1.0);
        int n13 = Y.c(fP2.j());
        int n14 = Y.c(fP2.i() + 1.0);
        if (!ds.t().b(n6, n11, n13, n10, n12, n14)) {
            return false;
        }
        boolean bl = false;
        gK.b(0.0, 0.0, 0.0);
        for (int k = n6; k < n10; ++k) {
            for (int i10 = n11; i10 < n12; ++i10) {
                for (int i11 = n13; i11 < n14; ++i11) {
                    double d10;
                    dx dx2 = ds.t().b(k, i10, i11);
                    if (!dx2.d() || dx2.h() != dJ2 || !((double)n12 >= (d10 = (double)((float)(i10 + 1) - dC.a(ds.t().c(k, i10, i11)))))) continue;
                    bl = true;
                }
            }
        }
        return bl;
    }

    public void S() {
        GL11.glBegin((int)1);
        GL11.glVertex3d((double)-0.25, (double)0.0, (double)0.0);
        GL11.glVertex3d((double)0.0, (double)0.0, (double)0.0);
        GL11.glVertex3d((double)0.0, (double)0.0, (double)-0.25);
        GL11.glVertex3d((double)0.0, (double)0.0, (double)0.0);
        GL11.glVertex3d((double)0.25, (double)0.0, (double)0.0);
        GL11.glVertex3d((double)0.0, (double)0.0, (double)0.0);
        GL11.glVertex3d((double)0.0, (double)0.0, (double)0.25);
        GL11.glVertex3d((double)0.0, (double)0.0, (double)0.0);
        GL11.glEnd();
    }
}

