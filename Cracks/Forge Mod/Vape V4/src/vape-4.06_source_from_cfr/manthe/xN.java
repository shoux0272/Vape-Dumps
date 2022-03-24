/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.awt.Color;
import manthe.mq;
import manthe.o1;
import manthe.pc;
import manthe.pe;
import manthe.uW;
import manthe.wM;
import manthe.wh;

public class xN
extends wM {
    private Color z;
    private String A;
    private int D;
    private int E = 5;
    private boolean F;
    private boolean B = true;
    private wh G = new wh("newclose");
    private o1 C;

    public wh m() {
        return this.G;
    }

    public xN(Color color, String string, int n6) {
        this.z = color;
        this.A = string;
        this.D = n6;
        this.a(this.G);
    }

    public xN(Color color, String string) {
        this(color, string, -1);
    }

    @Override
    public void a() {
        mq mq2 = this.e(0.9);
        double d10 = mq2.a(this.A);
        Color color = this.n() ? (this.F ? xN.b.c : xN.b.r) : (this.F ? xN.b.r : xN.b.s);
        pe.a(this.d() + 5.0, this.c() + 1.0, this.e() - 10.0, this.f() - 2.0, xN.b.m);
        if (this.F) {
            pe.a(this.d() + 5.0 + 0.5, this.c() + 1.5, this.e() - 10.0 - 1.0, this.f() - 3.0, xN.b.k);
        }
        if (this.n()) {
            pe.b((double)((float)(this.d() + 10.0)), (double)((float)(this.c() + this.f() / 2.0 - (double)(this.E / 2))), (double)this.E, 0.5, this.z);
        } else {
            pe.a((float)(this.d() + 10.0), (float)(this.c() + this.f() / 2.0 - (double)(this.E / 2)), (float)this.E, 1.0f, 0.5f, xN.b.o);
        }
        mq2.a(this.A, this.d() + 15.0 + 8.0, this.c() + this.f() / 2.0 - d10 / 2.0, color);
        this.G.c(this.d() + this.e() - 10.0 - 8.0);
        this.G.a(this.c());
        this.G.d(this.f());
        if (this.D > 0) {
            double d11 = mq2.b("" + this.D) + 5.0;
            pe.c(this.d() + this.e() - 25.0 - d11, this.c() + 1.0, d11 + 5.0, this.f() - 2.0, xN.b.y);
            mq2.a("" + this.D, this.d() + this.e() - 22.5 - d11, this.c() + this.f() / 2.0 - d10 / 2.0, xN.b.r);
        }
    }

    public xN a(pc pc2) {
        this.G.c(pc2);
        return this;
    }

    public void f(boolean bl) {
        this.B = bl;
    }

    public xN a(o1 o12) {
        this.C = o12;
        return this;
    }

    @Override
    public void k() {
    }

    @Override
    public void j() {
        if (this.F && !this.x()) {
            this.F = false;
        }
    }

    @Override
    public void a(uW uW2) {
        boolean bl = this.B = !this.B;
        if (this.C != null) {
            this.C.F();
        }
    }

    @Override
    public void i() {
        this.F = true;
    }

    public boolean n() {
        return this.C != null ? this.C.G() : this.B;
    }

    @Override
    public double g() {
        return 110.0;
    }

    @Override
    public double h() {
        return 17.5;
    }

    public void b(String string) {
        this.A = string;
    }

    public boolean l() {
        return this.F;
    }
}

