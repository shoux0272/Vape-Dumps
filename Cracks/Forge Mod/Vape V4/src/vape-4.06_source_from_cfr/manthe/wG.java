/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.awt.Color;
import manthe.i;
import manthe.k9;
import manthe.mq;
import manthe.pe;
import manthe.vd;
import manthe.wI;
import manthe.we;
import manthe.yI;
import manthe.zu;

public class wG
extends wI {
    private String J;
    private String L;
    private double K;
    private boolean H;
    private boolean D;
    private i I = new i(0.15, 0.0, 3.0);
    private float F = 4.0f;
    private Color G;
    private we E;

    public wG(String string, String string2, double d10) {
        this.G = wG.b.o;
        this.J = string;
        this.L = string2;
        this.K = d10;
        this.E = zu.f(string);
        this.c(new vd(this, string));
        this.O();
    }

    public wG(String string, String string2) {
        this(string, string2, 0.9);
    }

    public wG(String string, String string2, Class class_) {
        this(string, string2);
        this.E = zu.b(class_);
        this.O();
    }

    private void O() {
        if (this.E != null) {
            if (this.E.b()) {
                this.I.m();
                this.H = true;
            } else if (this.I.k()) {
                this.I.e();
                this.H = false;
            }
        }
    }

    private void a(we we2) {
        if (we2 != null) {
            if (we2.b()) {
                if (!this.I.k()) {
                    this.I.g();
                    this.H = true;
                }
            } else if (this.I.k()) {
                this.I.b();
                this.H = false;
            }
        }
    }

    @Override
    public void a() {
        float f10 = 6.88f;
        mq mq2 = this.e(this.K);
        double d10 = mq2.a(this.J);
        double d11 = this.c() + this.f() / 2.0 - d10 / 2.0;
        double d12 = this.c() + this.f() / 2.0 - (double)(f10 / 2.0f);
        double d13 = this.c() + this.f() / 2.0 - (double)(this.F / 2.0f);
        Color color = wG.b.k;
        Color color2 = wG.b.r;
        if (this.D) {
            color = wG.b.m;
            color2 = wG.b.c;
        }
        if (this.H) {
            color = wG.b.m;
            color2 = b.e();
            if (this.D) {
                color2 = yI.a(color2, 30.0);
            }
        }
        pe.c(this.d(), this.c(), this.e(), this.f(), color);
        k9.a(this.G, (float)this.d() + (float)this.e() - 5.0f - 5.0f + this.I.o().floatValue(), (float)d13, "expandarrow", this.F, this.F, false);
        if (this.L != null) {
            mq2.a(this.J, this.d() + 10.0 + (double)f10, d11, color2);
            k9.a(color2, (float)this.d() + 5.0f, (float)d12, this.L, f10, f10, false);
        } else {
            mq2.a(this.J, this.d() + 5.0, d11, color2);
        }
    }

    @Override
    public void k() {
    }

    @Override
    public void j() {
        if (this.D && !this.x()) {
            this.D = false;
        }
        this.a(this.E);
    }

    @Override
    public void i() {
        this.D = true;
    }

    @Override
    public double g() {
        return 110.0;
    }

    @Override
    public double h() {
        return 20.0;
    }

    public boolean P() {
        return this.H;
    }

    public i N() {
        return this.I;
    }

    static boolean a(wG wG2, boolean bl) {
        wG2.H = bl;
        return wG2.H;
    }

    static boolean a(wG wG2) {
        return wG2.H;
    }

    static i b(wG wG2) {
        return wG2.I;
    }
}

