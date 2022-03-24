/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.g;
import manthe.pe;
import manthe.wI;

public class wk
extends wI {
    private g E;
    protected boolean D;

    public wk() {
        this.E = new g(0.15, wk.b.y, wk.b.s);
    }

    @Override
    public void a() {
        pe.a(this.d() + 5.0, this.c() + 2.5, this.e() - 10.0, this.f() - 5.0, this.E.q());
        pe.a(this.d() + 5.0 + 0.5, this.c() + 2.5 + 0.5, this.e() - 10.0 - 1.0, this.f() - 1.0 - 5.0, wk.b.k);
        pe.a("newadd", this.d() + this.e() / 2.0, this.c() + this.f() / 2.0, 6.0, 6.0, wk.b.i);
    }

    @Override
    public void k() {
    }

    @Override
    public void j() {
        if (this.D && !this.x()) {
            this.D = false;
            this.E.c();
        }
    }

    @Override
    public void i() {
        if (!this.D) {
            this.E.c();
        }
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
}

