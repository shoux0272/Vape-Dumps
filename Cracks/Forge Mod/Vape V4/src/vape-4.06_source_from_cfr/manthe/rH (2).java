/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package manthe;

import manthe.BI;
import manthe.Bo;
import manthe.D7;
import manthe.DU;
import manthe.Du;
import manthe.Y;
import manthe.d0;
import manthe.ds;
import manthe.my;
import manthe.o7;
import manthe.on;
import manthe.p;
import manthe.pX;
import manthe.pd;
import manthe.r1;
import org.lwjgl.opengl.GL11;

public class rH
extends r1
implements p,
BI {
    private final DU af;
    private double ag;
    private double ae;

    public rH(String string, double d10, double d11) {
        super(string, true);
        this.aj().a(new D7(0.0, 0.0, 5000, 1, new pd(0, 0, 0, 0)));
        this.g(false);
        this.aj().g(false);
        this.c(d10);
        this.b(d11);
        this.Z().c(0.0);
        this.Z().b(0.0);
        this.f(false);
        this.m(true);
        this.af = new Du(this, 0.0, 0.0, 0.0, 0.0);
        this.a(null, new pX(this));
    }

    @Override
    public void c(boolean bl) {
        if (!bl) {
            GL11.glPushMatrix();
            GL11.glEnable((int)3042);
            GL11.glDisable((int)3553);
            GL11.glBlendFunc((int)770, (int)771);
            Bo bo2 = o7.b();
            DU dU2 = this.af;
            boolean bl2 = dU2.a(bo2) || this.x();
            int n6 = bl2 ? on.p.t().r.s() : -1275068416;
            o7.a(this.t() - 1.0, this.k() - 1.0, this.t(), this.k() + this.b() + 1.0, n6);
            o7.a(this.t() + this.q(), this.k() - 1.0, this.t() + this.q() + 1.0, this.k() + this.b() + 1.0, n6);
            o7.a(this.t(), this.k() - 1.0, this.t() + this.q(), this.k(), n6);
            o7.a(this.t(), this.k() + this.b(), this.t() + this.q(), this.k() + this.b() + 1.0, n6);
            o7.b(this.t(), this.k(), this.t() + this.q(), this.k() + this.b(), 0.7, 0.7, 0.7, 0.15);
            GL11.glEnable((int)3553);
            double d10 = this.t() + this.q() / 2.0 - this.r().b(this.H()) / 2.0;
            double d11 = this.k() + this.b() / 2.0 - this.r().a(this.H()) / 2.0;
            this.r().a(this.H(), d10, d11, bl2 ? on.p.t().r.s() : -1258291201);
            GL11.glDisable((int)3042);
            GL11.glPopMatrix();
        }
    }

    @Override
    public void a(double d10) {
        if (this.a(d10, this.k())) {
            super.a(Y.a(d10, 1.0, (double)ds.p().g() - this.q() - 1.0));
        }
    }

    @Override
    public void d(double d10) {
        if (this.a(this.t(), d10)) {
            super.d(Y.a(d10, 1.0, (double)ds.p().h() - this.b() - 1.0));
        }
    }

    @Override
    public boolean ai() {
        return this.e();
    }

    private boolean a(double d10, double d11) {
        boolean bl = true;
        for (r1 r12 : on.p.F().d()) {
            rH rH2;
            if (!(r12 instanceof rH) || r12.equals(this) || !(rH2 = (rH)r12).e()) continue;
            double d12 = rH2.al().a();
            double d13 = d12 + rH2.al().d();
            double d14 = rH2.al().b();
            double d15 = d14 + rH2.al().c();
            if (d10 > d13 || d10 + this.q() < d12 || d11 > d15 || d11 + this.b() < d14) continue;
            bl = false;
        }
        return bl;
    }

    public int am() {
        d0 d02 = ds.p();
        double d10 = this.t() + this.q() / 2.0;
        double d11 = this.k() + this.b() / 2.0;
        double d12 = (double)d02.g() * 0.3;
        double d13 = (double)d02.g() * 0.6;
        double d14 = (double)d02.h() * 0.3;
        double d15 = (double)d02.h() * 0.6;
        int n6 = d10 < d12 ? (d11 < d14 ? my.g : (d11 > d15 ? my.f : my.c)) : (d10 > d13 ? (d11 < d14 ? my.a : (d11 > d15 ? my.h : my.e)) : (d11 < d14 ? my.b : (d11 > d15 ? my.d : my.i)));
        return n6;
    }

    public double an() {
        return this.ag;
    }

    public double ao() {
        return this.ae;
    }

    private DU al() {
        return this.af;
    }
}

