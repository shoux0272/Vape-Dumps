/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.awt.Color;
import manthe.mq;
import manthe.pe;
import manthe.uW;
import manthe.xU;

public class xe
extends xU {
    private int E;
    private int F;

    public xe(String string) {
        super(string);
    }

    @Override
    public void a() {
        this.J();
    }

    @Override
    public void k() {
        this.J();
    }

    private void J() {
        mq mq2 = this.e(0.85);
        int n6 = this.E - this.F;
        int n10 = Math.abs(n6);
        boolean bl = n6 < 0;
        boolean bl2 = n6 > 0;
        String string = (bl2 ? "+" : (bl ? "-" : "")) + n10;
        double d10 = mq2.b(string) + 5.0;
        if (d10 < 10.0) {
            d10 = 10.0;
        }
        pe.a(this.d() + 5.0, this.c() + 5.0, d10, 10.0, xe.b.y);
        double d11 = this.c() + 5.0 + 2.0;
        mq2.b(string, this.d() + 5.0 + d10 / 2.0, d11, bl2 ? xe.b.i : (bl ? xe.b.j : xe.b.r));
        mq2.a(this.n(), this.d() + 10.0 + d10, d11, xe.b.r);
        String string2 = this.E > 9 ? "" + this.E : "0" + this.E;
        String string3 = this.F > 9 ? "" + this.F : "0" + this.F;
        double d12 = mq2.b(string2);
        double d13 = mq2.b(string2);
        double d14 = mq2.b("/");
        double d15 = this.d() + this.e() - 5.0 - d13;
        mq2.a(string3, d15, d11, xe.b.s);
        mq2.a("/", d15 - 5.0 - d14, d11, xe.b.s);
        mq2.a(string2, d15 - 10.0 - d14 - d12, d11, xe.b.r);
        double d16 = this.c() + 22.5;
        double d17 = 6.0;
        pe.c(this.d() + 5.0, d16 - 0.5, this.e() - 10.0, 1.0, xe.b.y);
        int n11 = this.E + this.F;
        if (n11 == 0) {
            pe.a("greenglowsquare", this.d() + this.e() / 2.0, d16, 20.0, 20.0, Color.WHITE);
            return;
        }
        double d18 = (double)n10 / (double)n11;
        double d19 = this.e() / 2.0 - 5.0 - d17;
        double d20 = this.E >= this.F ? this.d() + 5.0 + d19 - d19 * d18 : this.d() + 5.0 + d19 + d17 * 2.0 + d19 * d18;
        if (this.E >= this.F) {
            pe.c(d20, d16 - 0.5, this.d() + this.e() / 2.0 - d20, 1.0, xe.b.i);
        } else {
            pe.c(this.d() + this.e() / 2.0, d16 - 0.5, d20 - this.d() - this.e() / 2.0, 1.0, xe.b.j);
        }
        pe.a(this.E >= this.F ? "greenglowsquare" : "redglowsquare", this.d() + this.e() / 2.0, d16, 20.0, 20.0, Color.WHITE);
        pe.a(this.E >= this.F ? "greenglowsquare" : "redglowsquare", d20, d16, 20.0, 20.0, Color.WHITE);
    }

    public void b(int n6) {
        this.F = n6;
    }

    public void a(int n6) {
        this.E = n6;
    }

    @Override
    public void j() {
    }

    @Override
    public void a(uW uW2) {
    }

    @Override
    public void i() {
    }

    @Override
    public double g() {
        return 20.0;
    }

    @Override
    public double h() {
        return 30.0;
    }
}

