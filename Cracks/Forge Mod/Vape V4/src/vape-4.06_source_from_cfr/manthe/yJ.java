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
import manthe.ab;
import manthe.cy;
import manthe.d0;
import manthe.ds;
import manthe.e3;
import manthe.eC;
import manthe.ej;
import manthe.ex;
import manthe.fP;
import manthe.g_;
import manthe.kA;
import manthe.mT;
import manthe.mq;
import manthe.o7;
import manthe.on;
import manthe.y5;
import manthe.yc;
import manthe.z2;
import manthe.zt;
import org.lwjgl.opengl.GL11;

public class yJ
extends yc {
    private final z2 w = (z2)this.S();
    private final List<mT> x = new ArrayList<mT>();
    private static cy[] v;

    public yJ(y5 y52, String string) {
        super(y52, string);
    }

    @Override
    public void a(kA kA2) {
        if (ds.t().e()) {
            return;
        }
        ex ex2 = kA2.getEntity();
        double d10 = kA2.getX();
        double d11 = kA2.getY();
        double d12 = kA2.getZ();
        Color color = this.w.a(ex2.a());
        if (color == null) {
            return;
        }
        float f10 = ex2.r();
        fP fP2 = ex2.s().d(f10, f10, f10);
        fP fP3 = fP.a(fP2.f() - ex2.z(), fP2.l() - ex2.l(), fP2.j() - ex2.g(), fP2.h() - ex2.z(), fP2.g() - ex2.l(), fP2.i() - ex2.g());
        mT mT2 = new mT(this, d10, d11, d12, fP3, ex2, color);
        if (mT.c(mT2)) {
            this.x.add(mT2);
            if (this.w.C.u().booleanValue()) {
                kA2.a(true);
            }
        }
    }

    @Override
    public void t() {
        mq mq2 = on.p.a(0.9, true);
        GL11.glPushMatrix();
        d0 d02 = d0.a(new ds(), ds.F(), ds.H());
        int n6 = d02.f();
        float f10 = (float)(n6 == 5 ? 0.4 : (n6 == 4 ? 0.5 : (n6 == 3 ? 0.66666 : (n6 == 2 ? 1.0 : (n6 == 1 ? 2.0 : (n6 == 0 ? 0.5 : 1.0))))));
        GL11.glScalef((float)f10, (float)f10, (float)f10);
        float f11 = g_.f();
        boolean bl = GL11.glIsEnabled((int)3042);
        for (mT mT2 : this.x) {
            boolean bl2;
            float f12 = ds.H();
            double d10 = mT.b(mT2) / (double)d02.f() / (double)f10 / (double)f11;
            double d11 = mT.e(mT2) / (double)d02.f() / (double)f10 / (double)f11;
            double d12 = ((double)f12 - mT.d(mT2) / (double)f11) / (double)d02.f() / (double)f10;
            double d13 = ((double)f12 - mT.a(mT2) / (double)f11) / (double)d02.f() / (double)f10;
            e3.j();
            GL11.glLineWidth((float)1.0f);
            e3.r();
            String string = mT.g(mT2).S();
            boolean bl3 = on.p.N().c(string);
            boolean bl4 = on.p.b().a(string);
            boolean bl5 = bl2 = bl4 || bl3;
            if (this.w.F.u().booleanValue() && (!this.w.T.u().booleanValue() || bl2)) {
                GL11.glColor4d((double)0.0, (double)0.0, (double)0.0, (double)0.4);
                GL11.glBegin((int)2);
                GL11.glVertex2d((double)d10, (double)d12);
                GL11.glVertex2d((double)d11, (double)d12);
                GL11.glVertex2d((double)d11, (double)d13);
                GL11.glVertex2d((double)d10, (double)d13);
                GL11.glEnd();
                GL11.glBegin((int)2);
                GL11.glVertex2d((double)(d10 + 1.0), (double)(d12 + 1.0));
                GL11.glVertex2d((double)(d11 - 1.0), (double)(d12 + 1.0));
                GL11.glVertex2d((double)(d11 - 1.0), (double)(d13 - 1.0));
                GL11.glVertex2d((double)(d10 + 1.0), (double)(d13 - 1.0));
                GL11.glEnd();
                e3.f();
                o7.a(mT.f(mT2));
                GL11.glBegin((int)2);
                GL11.glVertex2d((double)(d10 + 0.5), (double)(d12 + 0.5));
                GL11.glVertex2d((double)(d11 - 0.5), (double)(d12 + 0.5));
                GL11.glVertex2d((double)(d11 - 0.5), (double)(d13 - 0.5));
                GL11.glVertex2d((double)(d10 + 0.5), (double)(d13 - 0.5));
                GL11.glEnd();
            }
            if (mT.g(mT2).a(A5.cF)) {
                float f13;
                ej ej2 = new ej(mT.g(mT2).a());
                float f14 = f13 = ej2.a(A5.cc) ? on.p.H().b(zt.class).b(new eC(ej2.a())) : ej2.aD();
                if (this.w.P.u().booleanValue() && f13 >= 0.0f && ej2.at() >= 0.0f) {
                    double d14 = Math.min(1.0f, f13 / ej2.at());
                    e3.r();
                    GL11.glColor4d((double)0.0, (double)0.0, (double)0.0, (double)0.4);
                    GL11.glBegin((int)7);
                    GL11.glVertex2d((double)(d10 - 2.0), (double)(d13 - 0.5));
                    GL11.glVertex2d((double)(d10 - 2.0), (double)(d12 + 0.5));
                    GL11.glVertex2d((double)(d10 - 4.0), (double)(d12 + 0.5));
                    GL11.glVertex2d((double)(d10 - 4.0), (double)(d13 - 0.5));
                    GL11.glEnd();
                    double d15 = d13 - d12 - 1.0;
                    double d16 = d12 + d15 * d14;
                    if (d14 >= 0.9) {
                        GL11.glColor4d((double)0.0, (double)1.0, (double)0.0, (double)1.0);
                    } else if (d14 >= 0.75) {
                        GL11.glColor4d((double)0.9, (double)1.0, (double)0.0, (double)1.0);
                    } else if (d14 >= 0.5) {
                        GL11.glColor4d((double)1.0, (double)1.0, (double)0.0, (double)1.0);
                    } else if (d14 >= 0.25) {
                        GL11.glColor4d((double)1.0, (double)0.5, (double)0.0, (double)1.0);
                    } else if (d14 >= 0.0) {
                        GL11.glColor4d((double)1.0, (double)0.0, (double)0.0, (double)1.0);
                    }
                    GL11.glBegin((int)7);
                    GL11.glVertex2d((double)(d10 - 2.5), (double)d16);
                    GL11.glVertex2d((double)(d10 - 2.5), (double)(d12 + 1.0));
                    GL11.glVertex2d((double)(d10 - 3.5), (double)(d12 + 1.0));
                    GL11.glVertex2d((double)(d10 - 3.5), (double)d16);
                    GL11.glEnd();
                }
                if (this.w.C.u().booleanValue()) {
                    Object object;
                    String string2;
                    String string3 = string2 = this.w.N.u() == false || bl2 ? ej2.S() : ej2.h().f();
                    if (this.w.N.u().booleanValue()) {
                        string2 = string2.replaceAll("[^\u00a7^\\x00-\\x7F]", "");
                    }
                    if (bl3 && (object = on.p.N().b(ej2.S())) != null) {
                        string2 = ((ab)object).b();
                    }
                    if (this.w.y.u().booleanValue()) {
                        object = bl2 ? mT.f(mT2) : new Color(0, 0, 0, 95);
                        e3.j();
                        o7.a(d11 + (d10 - d11) / 2.0 - mq2.b(string2, false) / 2.0 - 1.5, d12 - 10.0, d11 + (d10 - d11) / 2.0 + mq2.b(string2, false) / 2.0 + 1.5, d12 - 1.0, 0.5, (Color)object, new Color(0, 0, 0, 102));
                        e3.p();
                    }
                    mq2.b(string2, d11 + (d10 - d11) / 2.0 - mq2.b(string2, false) / 2.0, d12 - 8.0, bl2 ? -1 : mT.f(mT2).getRGB(), false);
                    GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
                }
            }
            GL11.glDisable((int)2848);
            e3.p();
        }
        if (bl) {
            e3.r();
        } else {
            e3.f();
        }
        GL11.glPopMatrix();
        this.x.clear();
    }

    public static void a(cy[] arrcy) {
        v = arrcy;
    }

    public static cy[] T() {
        return v;
    }

    static {
        if (yJ.T() == null) {
            yJ.a(new cy[5]);
        }
    }
}

