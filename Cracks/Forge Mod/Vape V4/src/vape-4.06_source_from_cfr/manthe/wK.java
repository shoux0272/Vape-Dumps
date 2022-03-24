/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.awt.Color;
import manthe.DB;
import manthe.DR;
import manthe.g;
import manthe.h;
import manthe.i;
import manthe.k9;
import manthe.mq;
import manthe.qD;
import manthe.ux;
import manthe.wI;
import manthe.yI;

public class wK
extends wI {
    protected String I;
    protected double E;
    private boolean H;
    private float O = 6.0f;
    private float D = 6.0f;
    private float R = 4.0f;
    private float K = 1.0f;
    private g P;
    private h Q;
    private i G;
    protected Color L;
    protected Color M;
    private Color N;
    private boolean J;
    private DB F;

    public wK(String string, double d10) {
        this.P = new g(0.15, wK.b.t, wK.b.o);
        this.Q = new h(0.15, wK.b.o);
        this.G = new i(0.15, 0.0, this.O - this.K);
        this.L = wK.b.r;
        this.M = wK.b.s;
        this.N = wK.b.u;
        this.J = false;
        this.I = string;
        this.E = d10;
        this.c(new ux(this));
    }

    public wK(String string) {
        this(string, 0.9);
    }

    public wK(DB dB2) {
        this(((qD)dB2.c()).z().E());
        this.F = dB2;
        this.a(dB2);
    }

    @Override
    public void a() {
        Color color;
        this.o();
        double d10 = this.d() + this.e() - 10.0 - (double)this.O;
        if (this.g() != this.e()) {
            d10 = this.d() + this.e() - (double)(this.O * 2.0f);
        }
        double d11 = this.c() + this.f() / 2.0 - (double)(this.D / 2.0f);
        Color color2 = color = this.Q.l() > 0.0 ? this.Q.q() : this.P.q();
        if (this.H && this.J && this.Q.l() > 0.0) {
            color = yI.a(color, 30.0);
        }
        this.R();
        if (this.F != null && this.F.w()) {
            k9.a(color, (float)d10 - 10.0f, (float)d11, "newblatant", this.O, this.D, false);
        }
        k9.a(color, (float)d10, (float)d11, "togglebg", this.O, this.D, false);
        k9.a(this.N, (float)d10 + this.K + (float)this.G.o().doubleValue(), (float)d11 + this.K, "toggledot", this.R, this.R, false);
        if (this.D() != null && this.D() instanceof DR && ((DR)this.D()).t().size() > 0 && ((DR)this.D()).s() && this.F() != null) {
            k9.a(wK.b.u, (float)(this.d() + this.e() / 8.0), (float)(this.c() + this.f() - 2.0), "dropdownnotch", 7.0f, 3.0f, false);
        }
    }

    protected void R() {
        mq mq2 = this.e(this.E);
        double d10 = mq2.a(this.I);
        double d11 = this.c() + this.f() / 2.0 - d10 / 2.0;
        mq2.a(this.I, this.d() + 5.0, d11, this.F != null && this.F.w() ? this.M : this.L);
    }

    @Override
    public void k() {
    }

    @Override
    public void j() {
        if (this.H && !this.x()) {
            this.P.c();
            this.H = false;
        }
        this.S();
    }

    @Override
    public void i() {
        if (this.F != null && this.F.w()) {
            return;
        }
        if (!this.H) {
            this.P.c();
        }
        this.H = true;
    }

    protected void S() {
        if (this.F != null && !this.F.u().equals(this.T()) && !this.P()) {
            this.N();
        }
    }

    @Override
    public double g() {
        return 110.0;
    }

    public void N() {
        if (this.F != null && this.F.w()) {
            return;
        }
        if (this.F != null) {
            if (this.F.u().equals(this.T())) {
                this.F.a((Boolean)(this.F.u() == false ? 1 : 0));
            }
            if (this.F.t().size() > 0 && this.F() != null) {
                this.F().M();
            }
        }
        this.Q.c();
        this.G.c();
    }

    public void f(boolean bl) {
        if (this.F != null) {
            this.F.a((Boolean)bl);
            if (this.F.t().size() > 0 && this.F() != null) {
                this.F().M();
            }
        }
        if (bl) {
            this.Q.g();
            this.G.g();
        } else {
            this.Q.b();
            this.G.b();
        }
    }

    public boolean T() {
        return this.G.k();
    }

    public boolean P() {
        return !this.G.o().equals(this.G.p()) && !this.G.o().equals(this.G.n());
    }

    public i U() {
        return this.G;
    }

    @Override
    public double h() {
        return 15.0;
    }

    public String Q() {
        return this.I;
    }

    public DB O() {
        return this.F;
    }

    public void g(boolean bl) {
        this.J = bl;
    }

    static DB a(wK wK2) {
        return wK2.F;
    }
}

