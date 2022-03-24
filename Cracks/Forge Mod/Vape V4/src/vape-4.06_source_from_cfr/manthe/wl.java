/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.awt.Color;
import manthe.g;
import manthe.mq;
import manthe.pe;
import manthe.ww;

public class wl
extends ww {
    private g G;

    public wl(String string, double d10, Color color) {
        super(string, d10);
        this.G = new g(0.15, this.I(), color);
    }

    public wl(String string, Color color) {
        super(string);
        this.G = new g(0.15, this.I(), color);
    }

    @Override
    public void a() {
        pe.a(this.d(), this.c(), this.e(), this.f(), wl.b.y);
        pe.a(this.d() + 0.5, this.c() + 0.5, this.e() - 1.0, this.f() - 1.0, this.D ? this.G.q() : this.I());
        mq mq2 = this.e(this.E);
        double d10 = mq2.a(this.F);
        double d11 = this.c() + this.f() / 2.0 - d10 / 2.0;
        mq2.b(this.F.toUpperCase(), this.d() + this.e() / 2.0, d11, this.D ? wl.b.c : wl.b.r);
    }

    @Override
    public double g() {
        return 0.0;
    }

    @Override
    public double h() {
        return 0.0;
    }

    @Override
    public void f(boolean bl) {
        if (this.D != bl) {
            this.G.c();
        }
        super.f(bl);
    }
}

