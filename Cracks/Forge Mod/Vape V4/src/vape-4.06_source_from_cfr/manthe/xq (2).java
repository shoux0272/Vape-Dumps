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
import manthe.DE;
import manthe.DU;
import manthe.c2;
import manthe.cn;
import manthe.i;
import manthe.mq;
import manthe.n0;
import manthe.o7;
import manthe.pe;
import manthe.q2;
import manthe.sW;
import manthe.sp;
import manthe.uW;
import manthe.wM;
import manthe.ww;
import manthe.xU;
import manthe.xu;
import org.lwjgl.input.Mouse;

public class xq
extends xU {
    private double Q;
    private double M;
    private double P;
    private double R;
    private double W = 0.0;
    private i G = new i(0.0, 0.0, 0.0);
    protected i N = new i(0.15, 7.0, 8.0);
    private double T = 0.75;
    private boolean F;
    private long H;
    private double U = -1.0;
    private DU X = new DU(0.0, 0.0, 0.0, 0.0);
    private Color I;
    private DE J;
    private Double V;
    private sp L;
    private ww S;
    private wM O;
    private final float E;
    private static int[] K;

    public xq(sp sp2, DE dE2, String string, double d10, double d11) {
        super(string);
        this.I = xq.b.r;
        this.V = -1.0;
        this.J = dE2;
        this.L = sp2;
        this.M = d10;
        this.P = d11;
        this.R = (d10 - this.Q) / 100.0;
        if (sp2.equals((Object)sp.RAINBOW)) {
            this.a("Double click for rainbow");
        }
        this.E = (float)(d10 / ((sW)dE2.c()).C());
    }

    public xq(sp sp2, DE dE2) {
        this(sp2, dE2, dE2.H(), ((sW)dE2.c()).C(), 1.0);
        this.a(dE2);
        dE2.a(new q2(this));
        this.Q();
    }

    public xq(xu xu2) {
        this(sp.BLOCK_CHILD, xu2.R());
        this.S = new ww("RESET");
        this.S.c(new cn(this, xu2));
        this.a(new wM[]{this.S});
    }

    @Override
    public void a() {
        double d10;
        this.M();
        if (!this.I().equals(Color.WHITE)) {
            this.o();
        }
        double d11 = 0.0;
        switch (n0.a[this.L.ordinal()]) {
            case 1: 
            case 2: {
                d11 = this.J.x() / this.M;
                break;
            }
            case 3: {
                d11 = this.J.I().a() / this.M;
                break;
            }
            case 4: {
                d11 = this.J.z().a() / this.M;
            }
        }
        if ((d11 *= (double)this.E) != this.V) {
            this.Q();
        }
        mq mq2 = this.e(this.T);
        String string = this.L.equals((Object)sp.RAINBOW) ? this.n() : this.L.a();
        double d12 = mq2.a(string);
        this.W = mq2.b(this.n());
        double d13 = this.c() + 12.5 + d12;
        double d14 = this.e() - 10.0;
        double d15 = this.d() + this.G.o();
        if (this.L.equals((Object)sp.RAINBOW)) {
            mq2.a(this.n(), this.d() + 5.0, this.c() + 5.0, this.I);
        } else {
            mq2.a(this.L.a(), this.d() + 5.0, this.c() + 5.0, this.I);
        }
        if (this.S != null) {
            d10 = mq2.b(this.S.O());
            this.S.c(this.d() + this.e() - 5.0 - d10 - 2.0);
            this.S.a(this.c() + 2.0);
            this.S.d(10.0);
            this.S.b(d10);
            this.S.f(0.8);
        }
        this.X = this.a(d15, d13 + 0.5, this.N.n() / 2.0);
        d10 = 5.0;
        double d16 = this.e() - d10 * 2.0;
        for (double d17 = 0.0; d17 < d16; d17 += 1.0) {
            pe.c(this.d() + d17 + d10, d13, 1.0, 1.0, this.a(d17, d16));
        }
        Color color = this.I().equals(Color.WHITE) ? this.O.I() : this.I();
        double d18 = this.N.o();
        pe.a((float)(this.X.a() + this.X.d() / 2.0 - d18 / 2.0), (float)(this.X.b() + this.X.c() / 2.0 - d18 / 2.0), (float)d18, 1.0f, xq.b.c, 12.0, color);
    }

    @Override
    public void k() {
    }

    @Override
    public void j() {
        if (this.F && !this.x()) {
            this.N.c();
            this.F = false;
        }
    }

    @Override
    public void a(uW uW2) {
        DU dU2;
        if ((this.L.equals((Object)sp.RAINBOW) || this.L.equals((Object)sp.BLOCK_CHILD)) && this.H + 300L > System.currentTimeMillis()) {
            this.J.d(!this.J.J());
        }
        if ((dU2 = new DU(this.d(), this.X.b(), this.e(), this.X.c())).b(uW2.a(), uW2.b())) {
            this.A = o7.b();
            this.z = true;
        }
        this.H = System.currentTimeMillis();
    }

    private void M() {
        if (this.z) {
            if (!Mouse.isButtonDown((int)c2.LEFT_CLICK.ordinal())) {
                this.z = false;
                return;
            }
            double d10 = this.e() - 10.0 - this.X.d();
            double d11 = (double)this.A.a - this.d() + this.m() - 5.0 - this.X.d() / 2.0;
            double d12 = this.a(this.Q, d10, this.P, this.R, d11);
            d12 = new BigDecimal("" + d12).setScale(3, RoundingMode.HALF_UP).doubleValue();
            if (this.J != null) {
                switch (n0.a[this.L.ordinal()]) {
                    case 1: 
                    case 2: {
                        if (this.J.u().a().equals(this.V)) {
                            return;
                        }
                        this.J.u().b(d12);
                        break;
                    }
                    case 3: {
                        if (this.J.I().a().equals(this.V)) {
                            return;
                        }
                        this.J.I().b(d12);
                        break;
                    }
                    case 4: {
                        if (this.J.u().a().equals(this.V)) {
                            return;
                        }
                        this.J.z().b(d12);
                    }
                }
            }
        }
    }

    private void Q() {
        double d10 = this.e() - 10.0;
        double d11 = 0.0;
        switch (n0.a[this.L.ordinal()]) {
            case 1: 
            case 2: {
                d11 = this.J.x() / this.M;
                break;
            }
            case 3: {
                d11 = this.J.I().a() / this.M;
                break;
            }
            case 4: {
                d11 = this.J.z().a() / this.M;
            }
        }
        double d12 = (d10 - this.N.n()) * (d11 *= (double)this.E) + 5.0 + this.N.n() / 2.0;
        double d13 = this.G.o();
        double d14 = 0.05;
        if (this.L == sp.BLOCK_CHILD || this.L == sp.RAINBOW) {
            if (this.J.J() && d11 == 0.0) {
                d14 = 0.0;
            }
        } else if (this.J.J() && this.J.a()) {
            d14 = 1.0;
        }
        this.G = new i(d14, d13, d12);
        this.U = d11;
        this.G.g();
    }

    @Override
    public void i() {
        if (!this.F) {
            this.N.c();
        }
        this.F = true;
    }

    public Color a(double d10, double d11) {
        switch (n0.a[this.L.ordinal()]) {
            case 1: 
            case 2: {
                return new Color(Color.HSBtoRGB((float)(d10 / d11), 1.0f, 1.0f));
            }
            case 3: {
                return new Color(Color.HSBtoRGB(this.J.w(), (float)(d10 / d11), this.J.r()));
            }
            case 4: {
                return new Color(Color.HSBtoRGB(this.J.w(), this.J.v(), (float)(d10 / d11)));
            }
        }
        return new Color(0, 0, 0);
    }

    public double O() {
        return this.W;
    }

    @Override
    public double g() {
        return 110.0;
    }

    @Override
    public double h() {
        return 25.0;
    }

    public double P() {
        return this.M;
    }

    public double K() {
        return this.Q;
    }

    public double N() {
        return this.P;
    }

    public DU J() {
        return this.X;
    }

    public void g(double d10) {
        this.M = d10;
    }

    public void h(double d10) {
        this.Q = d10;
    }

    public void f(double d10) {
        this.P = d10;
    }

    public void a(wM wM2) {
        this.O = wM2;
    }

    static void a(xq xq2) {
        xq2.Q();
    }

    public static void b(int[] arrn) {
        K = arrn;
    }

    public static int[] L() {
        return K;
    }

    static {
        if (xq.L() != null) {
            xq.b(new int[2]);
        }
    }
}

