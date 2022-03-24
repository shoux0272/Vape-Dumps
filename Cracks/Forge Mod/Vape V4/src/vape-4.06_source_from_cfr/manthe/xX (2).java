/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package manthe;

import a.d;
import java.awt.Color;
import manthe.A5;
import manthe.AO;
import manthe.Y;
import manthe.cy;
import manthe.dT;
import manthe.ds;
import manthe.e3;
import manthe.eC;
import manthe.ej;
import manthe.fG;
import manthe.gO;
import manthe.gb;
import manthe.mq;
import manthe.o7;
import manthe.on;
import manthe.pe;
import manthe.qN;
import manthe.rr;
import manthe.uW;
import manthe.wM;
import manthe.z3;
import manthe.zf;
import manthe.zt;
import org.lwjgl.opengl.GL11;

public class xX
extends wM {
    private final Color C = new Color(-2130728448);
    private Object z;
    private ej A;
    private final AO B = new AO();

    public xX() {
        this.a(xX.b.m);
    }

    @Override
    public void a() {
        this.l();
    }

    @Override
    public void k() {
        this.l();
    }

    private void a(ej ej2, String string, float f10, float f11, float f12) {
        double d10;
        double d11;
        double d12;
        double d13;
        double d14;
        double d15 = this.d();
        double d16 = this.c();
        double d17 = 31.0;
        mq mq2 = on.p.a(0.9);
        pe.a(this.d(), this.c(), this.e(), this.f(), this.I());
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        GL11.glPushMatrix();
        GL11.glTranslated((double)(d15 + 3.0 + 16.0), (double)(d16 + 3.0 + 30.0), (double)0.0);
        e3.f();
        o7.a(d15 + 3.0, d16 + 4.0, d17, d17);
        e3.f();
        e3.g();
        if (ej2 != null) {
            dT.a(0, 0, 14, -50.0f, 20.0f, ej2);
        }
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glDisable((int)3089);
        e3.r();
        GL11.glPopMatrix();
        double d18 = d15 + d17 + 5.0;
        o7.a(d18, d16 + 5.0, this.e() - d17 - 5.0 - 2.0, mq2.a(string) + 3.0);
        mq2.c(string, d18, d16 + 5.0, xX.b.r);
        GL11.glDisable((int)3089);
        double d19 = d16 + 10.0 + mq2.a(string);
        double d20 = this.e() - (d18 - this.d()) - 5.0;
        pe.a(d18, d19, d20, 1.5, xX.b.y, false, 1.0f, 1.0f);
        float f13 = f10 / Math.max(f11, 1.0f);
        float f14 = (f10 + f12) / Math.max(f11, 1.0f);
        if (ej2 == null) {
            f14 = 1.0f;
        }
        Color color = f10 > 0.0f ? o7.a(f14, true) : Color.RED;
        pe.a(d18, d19, d20 * (double)f13, 1.5, color, false, 1.0f, 1.0f);
        String string2 = new qN(1).b(f10 + f12);
        string2 = string2.replace(".0", "") + " hp";
        if (f12 > 0.0f) {
            f12 = Math.min(10.0f, f12);
            d14 = Math.max(d18, d18 + d20 * (double)f13 - 2.0);
            d13 = d18 + d20;
            d12 = d18 + d20 * (double)f13;
            d11 = 10.0f * (f12 / 2.0f);
            d10 = d13 - (d12 - 2.0 + d11);
            if (d10 < 0.0) {
                d14 -= Math.abs(d10);
            }
            pe.a(d14 - 0.5, d19, d11 + 1.0, 1.5, new Color(80, 80, 80, 100), true, 1.0f, 1.0f, 8.0f, new Color(50, 50, 50, 200));
            pe.a(d14, d19, d11, 1.5, this.C, true, 1.0f, 1.0f);
        }
        d14 = mq2.a(string2);
        d13 = this.d() + this.e() - 5.0 - mq2.b(string2) - 1.0;
        d12 = d13 - 20.0;
        d11 = d16 + 5.0 + d14 + 4.0;
        o7.a(new Color(this.I().getRed(), this.I().getGreen(), this.I().getBlue(), 0), this.I(), d13, d11, d13, this.c(), d12, this.c(), d12, d11);
        d10 = this.d() + this.e() - d13;
        pe.c(d13, this.c(), d10 - 2.0, 5.0 + d14 + 4.0, this.I());
        mq2.a(string2, this.d() + this.e() - 5.0 - mq2.b(string2), d16 + 5.0, xX.b.s);
        Object[] arrobject = null;
        fG fG2 = null;
        if (ej2 != null && ej2.a(A5.cc)) {
            eC eC2 = new eC(ej2.a());
            arrobject = eC2.aU().g();
            fG2 = eC2.a_();
        }
        int n6 = 0;
        fG[] arrfG = new fG[5];
        double d21 = 0.0;
        double d22 = (this.e() - (d18 - this.d()) - 5.0 - 5.0) / 5.0;
        pe.a(d18 + d21, d16 + 22.0, d22, d22, xX.b.k);
        if (fG2 != null && fG2.d()) {
            arrfG[n6++] = fG2;
        }
        d21 += d22 + 1.0;
        for (int k = 3; k >= 0; --k) {
            Object object;
            if (arrobject != null && (object = arrobject[k]) != null) {
                arrfG[n6] = new fG(object);
            }
            ++n6;
            pe.a(d18 + d21, d16 + 22.0, d22, d22, xX.b.k);
            d21 += d22 + 1.0;
        }
        d21 = 0.0;
        for (fG fG3 : arrfG) {
            if (fG3 != null) {
                pe.a(fG3, 0.7, d18 + d21 + 1.0, d16 + 23.0, true);
            }
            d21 += d22 + 1.0;
        }
    }

    private void l() {
        Object object;
        Object object2;
        ej ej2;
        if (ds.k().e() || ds.t().e()) {
            this.A = null;
            return;
        }
        if (this.A != null && !ds.t().k().contains(this.A.a())) {
            this.A = null;
        }
        if ((ej2 = this.A) == null && rr.al().ag.u().booleanValue() && ((cy)(object2 = ds.I())).d() && ((gb)object2).h().d() && ((cy)(object = ((gb)object2).h())).a(A5.cF)) {
            ej2 = new ej(((cy)object).a());
        }
        if ((object2 = ds.x().a()) != null && object2.equals(d.getGuiObject())) {
            ej2 = null;
        } else if (ej2 == null) {
            return;
        }
        object = "Target name";
        float f10 = 14.0f;
        float f11 = 20.0f;
        float f12 = 2.0f;
        if (ej2 != null) {
            object = ej2.S();
            f10 = ej2.a(A5.cc) ? on.p.H().b(zt.class).b(new eC(ej2.a())) : ej2.aD();
            f11 = ej2.at();
            f12 = ej2.aR();
        }
        this.a(ej2, (String)object, f10, f11, f12);
    }

    @Override
    public void j() {
        zf zf2;
        z3 z32;
        gO gO2 = ds.t();
        if (this.z == null || gO2.d() && !gO2.a().equals(this.z)) {
            this.A = null;
            this.z = ds.t().a();
        }
        if (ds.k().e() || gO2.e()) {
            this.A = null;
            return;
        }
        if (this.A != null && !ds.t().k().contains(this.A.a())) {
            this.A = null;
        }
        if (this.A != null) {
            double d10 = this.A.z() - this.A.T();
            double d11 = this.A.l() - this.A.R();
            double d12 = this.A.g() - this.A.X();
            double d13 = Math.max(Y.e(d10 * d10 + d11 * d11 + d12 * d12), ds.k().a(this.A));
            if (!ds.t().k().contains(this.A.a()) || d13 > 10.0 || this.B.a(3000L)) {
                this.A = null;
            }
        }
        if ((z32 = on.p.H().b(z3.class)).S() != null) {
            this.A = z32.S();
            this.B.d();
        }
        if (this.A == null && (zf2 = on.p.H().b(zf.class)).S() != null) {
            this.A = zf2.S();
            this.B.d();
        }
    }

    @Override
    public void a(uW uW2) {
    }

    @Override
    public void i() {
    }

    @Override
    public double g() {
        return 110.0;
    }

    @Override
    public double h() {
        return 40.0;
    }
}

