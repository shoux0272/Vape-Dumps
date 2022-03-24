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
import manthe.DF;
import manthe.DU;
import manthe.c2;
import manthe.i;
import manthe.mq;
import manthe.o7;
import manthe.pe;
import manthe.sV;
import manthe.uW;
import manthe.vw;
import manthe.xO;
import manthe.xU;
import org.lwjgl.input.Mouse;

public class xx
extends xU {
    private double F;
    private double E;
    private double K;
    private double J;
    private String O = "";
    private double L = 0.75;
    private int I = 1;
    private boolean S;
    private DU M = new DU(0.0, 0.0, 0.0, 0.0);
    private i P = new i(0.0, 0.0, 0.0);
    protected i N = new i(0.15, 7.0, 8.0);
    private Color Q;
    private xO H;
    private DF G;
    private Double R;

    public xx(String string, double d10, double d11, double d12) {
        super(string);
        this.Q = xx.b.r;
        this.R = -1.0;
        this.F = d10;
        this.E = d11;
        this.K = d12;
        this.J = (double)((int)(d11 * 100.0) - (int)(d10 * 100.0)) / 10000.0;
        this.H = new xO(this);
        this.a(this.H);
        if (d12 <= 0.01) {
            this.I = 10;
        }
    }

    public xx(DF dF2) {
        this(dF2.H(), ((sV)dF2.c()).D(), ((sV)dF2.c()).C(), dF2.r());
        this.O = ((sV)dF2.c()).F();
        this.G = dF2;
        this.a(dF2);
        dF2.a(new vw(this));
        this.K();
    }

    @Override
    public void a() {
        this.N();
        this.o();
        mq mq2 = this.e(this.L);
        double d10 = mq2.a(this.n());
        double d11 = this.N.o();
        double d12 = this.c() + 12.5 + d10;
        double d13 = this.d() + this.P.o();
        mq2.a(this.n(), this.d() + 5.0, this.c() + 5.0, this.Q);
        this.H.c(this.d() + this.e() - 5.0 - this.H.e());
        this.H.a(this.c() + 5.0);
        this.M = this.a(d13, d12 + 0.5, this.N.n() / 2.0);
        double d14 = this.M.a() - this.d() - 5.0;
        double d15 = this.d() + this.e() - this.M.a() - 5.0;
        if (d14 > 0.0) {
            pe.a(this.d() + 5.0, d12 + 0.5, d14 - 1.5, 0.5, b.e(), false, 0.5f, 1.0f);
        }
        if (d15 > 0.0) {
            pe.a(this.M.a() + 9.5, d12 + 0.5, d15 - 9.5, 0.5, xx.b.y, false, 0.5f, 1.0f);
        }
        pe.a((float)(d13 - d11 / 2.0), (float)(d12 + 0.5 - d11 / 2.0), (float)d11, 1.0f, b.e(), 0.0, this.I());
    }

    @Override
    public void k() {
    }

    @Override
    public void j() {
        if (this.S && !this.x()) {
            this.N.c();
            this.S = false;
        }
    }

    @Override
    public void a(uW uW2) {
        DU dU2 = new DU(this.d(), this.M.b(), this.e(), this.M.c());
        if (dU2.b(uW2.a(), uW2.b())) {
            this.A = o7.b();
            this.z = true;
        }
    }

    private void N() {
        if (this.z) {
            if (!Mouse.isButtonDown((int)c2.LEFT_CLICK.ordinal())) {
                this.z = false;
                return;
            }
            double d10 = this.e() - 10.0 - this.M.d();
            double d11 = (double)this.A.a - this.d() + this.m() - 5.0 - this.M.d() / 2.0;
            double d12 = this.a(this.F, d10, this.K, this.J, d11);
            double d13 = d11 / d10 * 100.0;
            if (d13 >= 100.0 && this.I == 10) {
                d12 = this.E;
            }
            d12 = new BigDecimal("" + d12).setScale(this.I, RoundingMode.HALF_UP).doubleValue();
            if (this.G != null) {
                if (this.G.a().equals(this.R)) {
                    return;
                }
                this.G.b(d12);
            }
        }
    }

    private void K() {
        double d10;
        double d11 = this.e() - 10.0;
        double d12 = d10 = this.G != null ? (this.G.a() - this.F) / (this.E - this.F) : 0.0;
        if (d10 > 1.0) {
            d10 = 1.0;
        } else if (d10 < 0.0) {
            d10 = 0.0;
        }
        double d13 = (d11 - this.N.n()) * d10 + 5.0 + this.N.n() / 2.0;
        double d14 = this.P.o();
        this.P = new i(0.05, d14, d13);
        this.P.g();
    }

    @Override
    public void i() {
        if (!this.S) {
            this.N.c();
        }
        this.S = true;
    }

    @Override
    public double g() {
        return 110.0;
    }

    @Override
    public double h() {
        return 25.0;
    }

    public double M() {
        return this.E;
    }

    public double J() {
        return this.F;
    }

    public double L() {
        return this.K;
    }

    public DF O() {
        return this.G;
    }

    public String P() {
        return this.O;
    }

    public void g(double d10) {
        this.E = d10;
    }

    public void f(double d10) {
        this.F = d10;
    }

    public void h(double d10) {
        this.K = d10;
    }

    static void a(xx xx2) {
        xx2.K();
    }
}

