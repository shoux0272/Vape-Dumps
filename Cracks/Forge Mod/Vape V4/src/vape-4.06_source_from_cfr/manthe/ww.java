/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.mq;
import manthe.wI;

public class ww
extends wI {
    protected String F;
    protected double E;
    protected boolean D;

    public ww(String string, double d10) {
        this.F = string;
        this.E = d10;
    }

    public ww(String string) {
        this(string, 0.9);
    }

    @Override
    public void a() {
        mq mq2 = this.e(this.E);
        double d10 = mq2.a(this.F);
        double d11 = this.c() + this.f() / 2.0 - d10 / 2.0;
        mq2.a(this.F.toUpperCase(), this.d(), d11, this.D ? ww.b.c : ww.b.r);
    }

    @Override
    public void k() {
    }

    @Override
    public void j() {
        if (this.D && !this.x()) {
            this.f(false);
        }
        if (this.e() < 0.0) {
            this.b(this.N());
        }
    }

    @Override
    public void i() {
        this.f(true);
    }

    @Override
    public double g() {
        return 0.0;
    }

    @Override
    public double h() {
        return 0.0;
    }

    public double N() {
        mq mq2 = this.e(this.E);
        return mq2.b(this.F);
    }

    public String O() {
        return this.F;
    }

    public void f(boolean bl) {
        this.D = bl;
    }

    public void b(String string) {
        this.F = string;
        this.b(this.N());
    }

    public void f(double d10) {
        this.E = d10;
    }
}

