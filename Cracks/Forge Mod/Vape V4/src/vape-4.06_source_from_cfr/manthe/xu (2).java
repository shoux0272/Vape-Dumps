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
import manthe.Bo;
import manthe.DE;
import manthe.DU;
import manthe.c2;
import manthe.g;
import manthe.i;
import manthe.mq;
import manthe.o7;
import manthe.pe;
import manthe.uW;
import manthe.xU;
import org.lwjgl.input.Mouse;

public class xu
extends xU {
    private double T = 0.0;
    private double F;
    private double E = 1.0;
    private double K;
    private double J = 0.0;
    protected i U = new i(0.15, 7.0, 8.0);
    private double I = 0.75;
    private boolean M;
    private boolean V;
    private boolean L;
    protected DU S = new DU(0.0, 0.0, 0.0, 0.0);
    private i R = new i(0.0, 0.0, 0.0);
    private g N = new g(0.0, Color.BLACK, Color.BLACK);
    private Color G;
    private DE P;
    protected int Q;
    private int O;
    private Color[] H;

    public xu(String string, DE dE2, Color[] arrcolor) {
        super(string);
        this.G = xu.b.r;
        this.P = dE2;
        this.a(dE2);
        this.H = arrcolor;
        this.F = arrcolor.length;
        this.K = (this.F - this.T) / 100.0;
        this.M();
    }

    @Override
    public void a() {
        double d10;
        this.X();
        mq mq2 = this.e(this.I);
        double d11 = mq2.a(this.n());
        this.J = mq2.b(this.n());
        double d12 = this.c() + 12.5 + d11;
        double d13 = this.e() - 10.0 - (double)this.H.length * 0.5;
        double d14 = 5.0;
        double d15 = d13 / (double)this.H.length;
        double d16 = this.K() - 1.0;
        mq2.a(this.n(), this.d() + 5.0, this.c() + 5.0, this.G);
        if (this.L) {
            d15 = (d13 - 2.0) / (double)this.H.length;
            for (d10 = 1.0; d10 < (double)(this.H.length + 1); d10 += 1.0) {
                if (d10 - 1.0 == (double)this.h(this.R.o())) {
                    pe.c(this.d() + d14 - 1.0, d12, d15 + 1.0, 1.0, this.I());
                    d14 += d15 + 2.5;
                    continue;
                }
                pe.c(this.d() + d14, d12, d15, 1.0, this.f(d10));
                d14 += d15 + 0.5;
            }
        } else {
            for (d10 = 1.0; d10 < (double)(this.H.length + 1); d10 += 1.0) {
                pe.c(this.d() + d14, d12, d15, 1.0, this.f(d10));
                d14 += d15 + 0.5;
            }
        }
        d10 = 0.5;
        if (!this.U()) {
            d10 = this.P != null ? (double)this.Q / d16 : 0.0;
        }
        d13 = this.e() - 10.0 + (double)(this.L ? 2 : 0);
        double d17 = this.d() + 5.0 + d13 * d10;
        this.S = this.a(d17 += (d10 - 0.5) * -1.0 * d15, d12 + 0.5, this.U.n() / 2.0);
        this.Q();
    }

    protected void Q() {
        if (this.U()) {
            pe.a("newcustomtheme", this.d() + (double)this.R.o().floatValue() - 3.5, this.S.b() + this.S.c() / 2.0, this.S.d() - 2.0, this.S.c() - 2.0, Color.WHITE);
            pe.a("toggledot", this.d() + (double)this.R.o().floatValue(), this.S.b() + this.S.c() / 2.0, this.S.d() - 4.0, this.S.c() - 4.0, xu.b.k);
            return;
        }
        pe.a("newtheme", this.d() + (double)this.R.o().floatValue() - 3.5, this.S.b() + this.S.c() / 2.0, this.S.d() - 2.0, this.S.c() - 2.0, this.N.q());
    }

    @Override
    public void k() {
    }

    @Override
    public void j() {
        if (this.M && !this.x()) {
            this.U.c();
            this.M = false;
        }
        this.M();
    }

    @Override
    public void a(uW uW2) {
        DU dU2 = new DU(this.d(), this.S.b(), this.e(), this.S.c());
        if (dU2.b(uW2.a(), uW2.b())) {
            this.f(false);
            this.P.d(false);
            this.A = o7.b();
            this.z = true;
        }
    }

    private void X() {
        if (this.z) {
            if (!Mouse.isButtonDown((int)c2.LEFT_CLICK.ordinal())) {
                this.z = false;
                return;
            }
            double d10 = this.e() - 10.0;
            Bo bo2 = o7.b();
            double d11 = (double)bo2.a - this.d() - 5.0;
            double d12 = this.a(this.T, d10, this.E, this.K, d11);
            d12 = new BigDecimal("" + d12).setScale(3, RoundingMode.HALF_UP).doubleValue();
            if (this.P != null) {
                this.P.b(this.f(d12 + 1.0));
                this.M();
            }
        }
    }

    public void M() {
        if (!this.U()) {
            for (int k = 0; k < this.H.length; ++k) {
                if (!this.P.a(this.H[k])) continue;
                this.Q = k;
                if (this.Q != this.O) {
                    this.T();
                }
                this.O = this.Q;
            }
        }
    }

    public int h(double d10) {
        double d11 = this.e() - 10.0 - (double)this.H.length * 0.5;
        double d12 = 5.0;
        double d13 = d11 / (double)this.H.length;
        for (int k = 1; k < this.H.length + 1; ++k) {
            if (d10 >= d12 && d10 <= d12 + d13 + 0.5) {
                return k - 1;
            }
            d12 += d13 + 0.5;
        }
        return 0;
    }

    @Override
    public void i() {
        if (!this.M) {
            this.U.c();
        }
        this.M = true;
    }

    public void L() {
        this.P.d(false);
        int n6 = Math.round(this.H.length / 2);
        this.P.b(this.H[n6]);
        this.Q = n6;
        this.T();
        this.f(false);
    }

    public void T() {
        double d10 = this.e() - 10.0 - (double)this.H.length * 0.5;
        double d11 = d10 / (double)this.H.length;
        double d12 = this.K() - 1.0;
        double d13 = (double)this.Q / d12;
        d10 = this.e() - 10.0 - (double)(this.L ? 2 : 0);
        double d14 = 5.0 + d10 * d13;
        double d15 = this.R.o();
        this.R = new i(0.15, d15, (d14 += (d13 - 0.5) * -1.0 * d11) + (this.L ? 0.5 : 0.0));
        this.R.g();
        this.N = new g(0.15, this.H[this.O], this.H[this.Q]);
        this.N.g();
    }

    public Color f(double d10) {
        double d11 = (this.K() - this.V()) / (double)this.H.length;
        double d12 = this.V();
        Color color = Color.BLACK;
        boolean bl = false;
        for (int k = 0; k < this.H.length; ++k) {
            double d13 = d12 + (double)k * d11;
            int n6 = k + 1;
            double d14 = d12 + (double)n6 * d11;
            if (!(d10 > d13) || !(d10 <= d14)) continue;
            color = this.H[k];
            bl = true;
            break;
        }
        if (!bl) {
            color = this.H[this.H.length - 1];
        }
        return color;
    }

    public Color[] O() {
        return this.H;
    }

    public DE R() {
        return this.P;
    }

    public boolean U() {
        if (this.V) {
            return true;
        }
        for (Color color : this.H) {
            if (!this.P.a(color)) continue;
            return false;
        }
        this.Q = Math.round(this.H.length / 2);
        this.T();
        this.O = this.Q;
        this.V = true;
        return true;
    }

    public void a(int n6) {
        Color color = this.H[n6];
        this.P.b(color);
    }

    @Override
    public void a(boolean bl) {
        super.a(bl);
        this.V = false;
    }

    public void f(boolean bl) {
        this.V = bl;
    }

    public double N() {
        return this.J;
    }

    @Override
    public double g() {
        return 110.0;
    }

    @Override
    public double h() {
        return 20.0;
    }

    public double K() {
        return this.F;
    }

    public double V() {
        return this.T;
    }

    public double S() {
        return this.E;
    }

    public int W() {
        return this.Q;
    }

    public DU Y() {
        return this.S;
    }

    public i J() {
        return this.R;
    }

    public g P() {
        return this.N;
    }

    public void g(double d10) {
        this.F = d10;
    }

    public void j(double d10) {
        this.T = d10;
    }

    public void i(double d10) {
        this.E = d10;
    }

    public void g(boolean bl) {
        this.L = bl;
    }
}

