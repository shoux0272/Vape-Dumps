/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package manthe;

import java.awt.Color;
import manthe.A5;
import manthe.d6;
import manthe.dY;
import manthe.ds;
import manthe.eC;
import manthe.ef;
import manthe.el;
import manthe.ex;
import manthe.ez;
import manthe.kq;
import manthe.kx;
import manthe.o7;
import manthe.on;
import manthe.y5;
import manthe.yc;
import manthe.z2;
import org.lwjgl.opengl.GL11;

public class yL
extends yc {
    private final z2 v = (z2)this.S();

    public yL(y5 y52, String string) {
        super(y52, string);
    }

    @Override
    public void a(kq kq2) {
        eC eC2 = kq2.getEntityPlayer();
        float f10 = 57.29578f;
        ef ef2 = ds.r();
        GL11.glPushMatrix();
        GL11.glDisable((int)2929);
        ds.M().a(0.0);
        double d10 = ef2.m();
        double d11 = ef2.n();
        double d12 = ef2.j();
        Color color = this.v.a(eC2.a());
        if (color != null) {
            el el2;
            d6 d62;
            if (on.p.t().b((ex)eC2) && this.v.z.u().booleanValue()) {
                return;
            }
            if (on.p.t().a((ex)eC2)) {
                color = Color.BLUE;
            }
            float f11 = ds.O().g();
            double d13 = eC2.T() + (eC2.z() - eC2.T()) * (double)f11 - d10;
            double d14 = eC2.R() + (eC2.l() - eC2.R()) * (double)f11 - d11;
            double d15 = eC2.X() + (eC2.g() - eC2.X()) * (double)f11 - d12;
            boolean bl = GL11.glIsEnabled((int)3042);
            GL11.glPushMatrix();
            GL11.glBlendFunc((int)770, (int)771);
            if (!bl) {
                GL11.glEnable((int)3042);
            }
            GL11.glBlendFunc((int)770, (int)771);
            o7.a(color);
            GL11.glDisable((int)2896);
            GL11.glEnable((int)2848);
            GL11.glDisable((int)3553);
            GL11.glTranslated((double)d13, (double)d14, (double)d15);
            ez ez2 = this.v.E.a(eC2);
            if (ez2.a(A5.p) && (d62 = (el2 = new el(ez2.a())).g()).d() && d62.a(A5.bz)) {
                float f12 = ds.k().a(eC2);
                float f13 = 4.0f * ((100.0f - Math.min(f12, 100.0f)) / 100.0f);
                GL11.glLineWidth((float)f13);
                dY dY2 = new dY(d62.a());
                boolean bl2 = eC2.af();
                float f14 = bl2 ? 0.6f : 0.75f;
                GL11.glRotatef((float)eC2.aH(), (float)0.0f, (float)-999.0f, (float)0.0f);
                double d16 = bl2 ? -0.2 : 0.0;
                GL11.glTranslated((double)-0.15, (double)f14, (double)d16);
                float f15 = dY2.i().m() * f10;
                float f16 = dY2.i().g() * f10;
                float f17 = dY2.i().j() * f10;
                GL11.glRotatef((float)f15, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)(-f16), (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)(-f17), (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glBegin((int)1);
                GL11.glVertex3d((double)0.0, (double)0.0, (double)0.0);
                GL11.glVertex3d((double)0.0, (double)(-f14), (double)0.0);
                GL11.glEnd();
                GL11.glRotatef((float)f17, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glRotatef((float)f16, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)(-f15), (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glTranslated((double)0.3, (double)0.0, (double)0.0);
                f15 = dY2.h().m() * f10;
                f16 = dY2.h().g() * f10;
                f17 = dY2.h().j() * f10;
                GL11.glRotatef((float)f15, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)(-f16), (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)(-f17), (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glBegin((int)1);
                GL11.glVertex3d((double)0.0, (double)0.0, (double)0.0);
                GL11.glVertex3d((double)0.0, (double)(-f14), (double)0.0);
                GL11.glEnd();
                GL11.glRotatef((float)f17, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glRotatef((float)f16, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)(-f15), (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glTranslated((double)-0.15, (double)0.0, (double)0.0);
                GL11.glBegin((int)1);
                GL11.glVertex3d((double)0.15, (double)0.0, (double)0.0);
                GL11.glVertex3d((double)-0.15, (double)0.0, (double)0.0);
                GL11.glEnd();
                if (eC2.af()) {
                    GL11.glRotatef((float)20.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                }
                GL11.glBegin((int)1);
                GL11.glVertex3d((double)0.0, (double)0.0, (double)0.0);
                GL11.glVertex3d((double)0.0, (double)0.65, (double)0.0);
                GL11.glEnd();
                GL11.glTranslated((double)0.0, (double)0.65, (double)0.0);
                GL11.glBegin((int)1);
                GL11.glVertex3d((double)0.35, (double)0.0, (double)0.0);
                GL11.glVertex3d((double)-0.35, (double)0.0, (double)0.0);
                GL11.glEnd();
                GL11.glTranslated((double)-0.35, (double)0.0, (double)0.0);
                f15 = dY2.k().m() * f10;
                f16 = dY2.k().g() * f10;
                f17 = dY2.k().j() * f10;
                GL11.glRotatef((float)f15, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)(-f16), (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)(-f17), (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glBegin((int)1);
                GL11.glVertex3d((double)0.0, (double)0.0, (double)0.0);
                GL11.glVertex3d((double)0.0, (double)-0.6, (double)0.0);
                GL11.glEnd();
                GL11.glRotatef((float)f17, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glRotatef((float)f16, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)(-f15), (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glTranslated((double)0.7, (double)0.0, (double)0.0);
                f15 = dY2.j().m() * f10;
                f16 = dY2.j().g() * f10;
                f17 = dY2.j().j() * f10;
                GL11.glRotatef((float)f15, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)(-f16), (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)(-f17), (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glBegin((int)1);
                GL11.glVertex3d((double)0.0, (double)0.0, (double)0.0);
                GL11.glVertex3d((double)0.0, (double)-0.6, (double)0.0);
                GL11.glEnd();
                GL11.glRotatef((float)f17, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glRotatef((float)f16, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)(-f15), (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glTranslated((double)-0.35, (double)0.0, (double)0.0);
                GL11.glRotatef((float)(-eC2.aH()), (float)0.0f, (float)-999.0f, (float)0.0f);
                double d17 = 0.4;
                GL11.glRotated((double)eC2.U(), (double)0.0, (double)-999.0, (double)0.0);
                GL11.glRotated((double)eC2.K(), (double)999.0, (double)0.0, (double)0.0);
                GL11.glBegin((int)1);
                GL11.glVertex3d((double)0.0, (double)0.0, (double)0.0);
                GL11.glVertex3d((double)0.0, (double)d17, (double)0.0);
                GL11.glEnd();
                GL11.glBegin((int)1);
                GL11.glVertex3d((double)0.0, (double)d17, (double)0.0);
                GL11.glVertex3d((double)0.0, (double)d17, (double)0.25);
                GL11.glEnd();
                GL11.glRotated((double)eC2.K(), (double)999.0, (double)0.0, (double)0.0);
                GL11.glRotated((double)(-eC2.U()), (double)0.0, (double)999.0, (double)0.0);
            }
            if (!bl) {
                GL11.glDisable((int)3042);
            }
            GL11.glEnable((int)3553);
            GL11.glDisable((int)2848);
            GL11.glEnable((int)2896);
            GL11.glPopMatrix();
        }
        GL11.glColor3d((double)1.0, (double)1.0, (double)1.0);
        ds.M().b(0.0);
        GL11.glEnable((int)2929);
        GL11.glPopMatrix();
    }

    @Override
    public void a(kx kx2) {
    }
}

