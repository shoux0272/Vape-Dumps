/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.g;
import manthe.pe;
import manthe.wV;

public class wh
extends wV {
    private g I;

    public wh(String string) {
        super(string, 1.0);
        this.I = new g(0.1, this.I(), wh.b.s);
    }

    public wh(String string, double d10) {
        super(string, d10);
        this.I = new g(0.1, this.I(), wh.b.s);
    }

    @Override
    public void a() {
        float f10 = 8.0f * (float)this.H;
        if (this.E) {
            pe.b(this.d() + this.e() / 2.0 - (double)(f10 / 2.0f), this.c() + this.f() / 2.0 - (double)(f10 / 2.0f), (double)f10, 1.0, this.I.q());
        }
        super.a();
    }

    @Override
    public void j() {
        if (this.E && !this.x()) {
            this.E = false;
            this.I.c();
        }
    }

    @Override
    public void i() {
        if (!this.E) {
            this.I.c();
        }
        super.i();
    }
}

