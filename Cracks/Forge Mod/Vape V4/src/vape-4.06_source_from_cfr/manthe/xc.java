/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Mouse
 */
package manthe;

import java.awt.Color;
import java.math.BigDecimal;
import java.math.RoundingMode;
import manthe.BF;
import manthe.Bo;
import manthe.DC;
import manthe.DU;
import manthe.Dy;
import manthe.c2;
import manthe.i;
import manthe.k9;
import manthe.mq;
import manthe.o7;
import manthe.pe;
import manthe.sk;
import manthe.uW;
import manthe.xS;
import manthe.xU;
import org.lwjgl.input.Mouse;

public class xc
extends xU {
    private double U;
    private double P;
    private double S;
    private double L;
    private double O;
    private double Y;
    private double Q;
    private int X;
    private int K;
    private double N = 0.75;
    private Dy M;
    private xS W;
    private xS H;
    private i G = new i(0.0, 0.0, 0.0);
    private i T = new i(0.0, 0.0, 0.0);
    private i F = new i(0.15, 8.0, 9.0);
    private i I = new i(0.15, 8.0, 9.0);
    private double E = -1.0;
    private double R = -1.0;
    private DU V = new DU(0.0, 0.0, 0.0, 0.0);
    private DU Z = new DU(0.0, 0.0, 0.0, 0.0);
    private Color J;

    public xc(String string, double d10, double d11, double d12, double d13, double d14) {
        super(string);
        this.J = xc.b.r;
        this.U = d10;
        this.P = d11;
        this.O = d12;
        this.Y = (d11 - d10) / 100.0;
        this.Q = (double)(string.split("\n").length - 1) * this.s().a(string) + 5.0;
        if (d13 == 1.0 && d14 == 1.0) {
            this.J();
        } else {
            this.S = d13;
            this.L = d14;
        }
        this.W = new xS(this, DC.MINIMUM);
        this.H = new xS(this, DC.MAXIMUM);
        this.a(this.W, this.H);
    }

    public xc(String string, double d10, double d11, double d12) {
        this(string, d10, d11, d12, 1.0, 1.0);
    }

    public xc(Dy dy2) {
        this(dy2.H(), ((sk)dy2.c()).E(), ((sk)dy2.c()).W(), ((sk)dy2.c()).X(), dy2.s(), dy2.w());
        this.M = dy2;
        this.a(dy2);
        dy2.a(new BF(this));
        this.Q();
    }

    private void J() {
        double d10;
        double d11 = (this.P + this.U) / 2.0;
        this.S = d11 - this.U;
        this.L = d11 + this.U;
        double d12 = this.S % this.O;
        if (d12 != 0.0) {
            this.S -= d12;
        }
        if ((d10 = this.L % this.O) != 0.0) {
            this.L -= d10;
        }
    }

    @Override
    public void a() {
        double d10;
        this.L();
        this.o();
        mq mq2 = this.e(this.N);
        double d11 = mq2.a(this.n());
        double d12 = this.c() + 12.5 + (double)((float)d11);
        double d13 = this.c() + 5.0;
        double d14 = this.c() + 5.0;
        for (String string : this.n().split("\n")) {
            mq2.a(string, this.d() + 5.0, d14, this.J);
            d14 += mq2.a(string) + 3.0;
        }
        double d15 = (double)(this.n().split("\n").length - 1) * (mq2.a(this.n()) + 3.0);
        this.H.c(this.d() + this.e() - 5.0 - this.H.e());
        this.H.a(d13 += d15);
        k9.a(xc.b.t, (float)(this.d() + this.e() - 10.0 - this.H.e() - 8.0), (float)d13, "newrangeindicator", 0.1f, false);
        this.W.c(this.d() + this.e() - 15.0 - this.W.e() - this.H.e() - 8.0);
        this.W.a(d13);
        this.V = this.a(this.d() + this.G.o(), (d12 += d15) + 0.5, this.F.o() / 2.0);
        this.Z = this.a(this.d() + this.T.o(), d12 + 0.5, this.I.o() / 2.0);
        this.V.c(this.V.d() / 2.0);
        this.Z.c(this.Z.d() / 2.0);
        this.Z.a(this.Z.a() + this.Z.d());
        double d16 = this.V.a() - this.d() - 5.0;
        double d17 = this.Z.a() - this.V.a();
        double d18 = this.d() + this.e() - this.Z.a() - 5.0;
        if (d16 > 0.0) {
            pe.a(this.d() + 5.0, d12 + 0.5, d16 - 1.5, 0.5, xc.b.y, false, 0.5f, 1.0f);
        }
        if (d17 > 0.0) {
            d10 = (this.F.o() - this.F.p()) / 2.0;
            pe.a(this.V.a() + 6.0 + d10, d12 + 0.5, d17 - 1.5 - 6.0 - d10, 0.5, b.e(), false, 0.5f, 1.0f);
        }
        if (d18 > 0.0) {
            d10 = (this.I.o() - this.I.p()) / 2.0;
            pe.a(this.Z.a() + 6.0 + d10, d12 + 0.5, d18 - 6.0 - d10, 0.5, xc.b.y, false, 0.5f, 1.0f);
        }
        pe.a("rangemin", this.V.a() + this.V.d(), d12 + 0.5, (double)this.F.o(), this.F.o(), b.e());
        pe.a("rangemax", this.Z.a() + this.Z.d(), d12 + 0.5, (double)this.I.o(), this.I.o(), b.e());
    }

    @Override
    public void k() {
    }

    @Override
    public void j() {
        switch (this.K) {
            case 1: {
                Bo bo2 = o7.b();
                if (this.V.a(bo2)) break;
                this.K = 0;
                this.F.c();
                break;
            }
            case 2: {
                Bo bo3 = o7.b();
                if (this.Z.a(bo3)) break;
                this.K = 0;
                this.I.c();
            }
        }
    }

    @Override
    public void a(uW uW2) {
        double d10 = this.Z.a() - this.V.a();
        double d11 = this.V.a() - this.d() + d10 / 2.0;
        DU dU2 = new DU(this.d(), this.V.b(), d11, this.V.c());
        DU dU3 = new DU(this.Z.a() - d10 / 2.0, this.Z.b(), this.e() - d11, this.Z.c());
        if (dU2.b(uW2.a(), uW2.b())) {
            this.X = 1;
        } else if (dU3.b(uW2.a(), uW2.b())) {
            this.X = 2;
        }
        if (this.X != 0) {
            this.A = o7.b();
        }
    }

    private void Q() {
        float f10 = (float)this.F.n();
        double d10 = this.e() - 10.0;
        double d11 = (this.M.s() - this.U) / (this.P - this.U);
        double d12 = 1.0 - (this.M.w() - this.U) / (this.P - this.U);
        if (d11 > 1.0) {
            d11 = 1.0;
        } else if (d11 < 0.0) {
            d11 = 0.0;
        }
        if (d12 > 1.0) {
            d12 = 1.0;
        } else if (d12 < 0.0) {
            d12 = 0.0;
        }
        double d13 = 1.0 - (d11 + d12);
        double d14 = d11 * (d10 - (double)f10 - 5.0) + 5.0 + (double)(f10 / 2.0f);
        double d15 = d14 + 5.0 + d13 * (d10 - (double)f10 - 5.0);
        double d16 = this.G.o();
        double d17 = this.T.o();
        this.G = new i(0.05, d16, d14);
        this.G.g();
        this.T = new i(0.05, d17, d15);
        this.T.g();
    }

    private void L() {
        if (this.X != 0) {
            if (!Mouse.isButtonDown((int)c2.LEFT_CLICK.ordinal())) {
                this.X = 0;
                return;
            }
            double d10 = this.e() - 15.0 - this.V.d() - this.Z.d();
            double d11 = (double)this.A.a - this.d() + this.m() - 5.0;
            if (this.X == 2) {
                d11 -= 12.0;
            }
            double d12 = this.a(this.U, d10, this.O, this.Y, d11);
            d12 = new BigDecimal("" + d12).setScale(1, RoundingMode.HALF_UP).doubleValue();
            if (this.X == 1) {
                if (d12 == this.E) {
                    return;
                }
                ((sk)this.M.c()).h(d12);
            } else {
                if (d12 == this.R) {
                    return;
                }
                ((sk)this.M.c()).f(d12);
            }
            this.E = this.M.s();
            this.R = this.M.w();
        }
    }

    @Override
    public void i() {
        Bo bo2 = o7.b();
        if (this.V.a(bo2) && this.K != 1) {
            if (this.K == 2) {
                this.I.c();
            }
            this.K = 1;
            this.F.c();
        } else if (this.Z.a(bo2) && this.K != 2) {
            if (this.K == 1) {
                this.F.c();
            }
            this.K = 2;
            this.I.c();
        }
    }

    @Override
    public double g() {
        return 110.0;
    }

    @Override
    public double h() {
        return 20.0 + this.Q;
    }

    public double O() {
        return this.O;
    }

    public double M() {
        return this.U;
    }

    public double P() {
        return this.P;
    }

    public double N() {
        return this.L;
    }

    public double R() {
        return this.S;
    }

    public Dy K() {
        return this.M;
    }

    public void g(double d10) {
        this.O = d10;
    }

    public void f(double d10) {
        this.U = d10;
    }

    public void i(double d10) {
        this.P = d10;
    }

    public void j(double d10) {
        this.L = d10;
    }

    public void h(double d10) {
        this.S = d10;
    }

    static void a(xc xc2) {
        xc2.Q();
    }
}

