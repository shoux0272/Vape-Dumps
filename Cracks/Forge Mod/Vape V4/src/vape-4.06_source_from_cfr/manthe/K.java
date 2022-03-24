/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.I;
import manthe.ds;
import manthe.ex;
import manthe.pf;

public class K
extends I {
    private final double g;
    private final double h;
    private final double i;

    public K(double d10, double d11, double d12) {
        this.g = d10;
        this.h = d11;
        this.i = d12;
    }

    @Override
    public boolean f() {
        double d10 = pf.a((ex)ds.k(), this.g, this.i);
        if (d10 > (double)this.b) {
            this.c = pf.b(ds.k(), this.g, this.i) ? (this.c -= this.a()) : (this.c += this.a());
            return false;
        }
        return true;
    }

    @Override
    public boolean d() {
        double d10 = pf.a((ex)ds.k(), this.g, this.h, this.i);
        if (d10 > (double)this.b || d10 < (double)(-this.b)) {
            this.f = pf.c(ds.k(), this.g, this.h, this.i) ? (this.f += this.a()) : (this.f -= this.a());
            return false;
        }
        return true;
    }
}

