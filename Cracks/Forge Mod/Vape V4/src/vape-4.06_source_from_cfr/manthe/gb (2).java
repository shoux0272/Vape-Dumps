/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.V;
import manthe.cy;
import manthe.ds;
import manthe.dx;
import manthe.ex;
import manthe.g1;
import manthe.g4;
import manthe.gK;
import manthe.gg;
import manthe.j0;

public class gb
extends cy {
    public gb(Object object) {
        super(object);
    }

    public static gb a(ex ex2, gK gK2) {
        return new gb(gb.a.M().cu.b(ex2.a(), gK2.a()));
    }

    public static gb a(g4 g42, gK gK2, gg gg2, g1 g12) {
        return new gb(gb.a.M().cu.a(g42.a(), gK2.a(), gg2.a(), g12.a()));
    }

    public ex h() {
        return new ex(gb.a.M().cu.e(this.b));
    }

    public void a(ex ex2) {
        gb.a.M().cu.a(this.b, ex2.a());
    }

    public gK k() {
        return new gK(gb.a.M().cu.a(this.b));
    }

    public g4 g() {
        return new g4(j0.a(gb.a.M().cu, this.b));
    }

    public int l() {
        if (V.c() == 13) {
            return gb.a.M().cu.c(this.b);
        }
        g1 g12 = new g1(gb.a.M().cu.d(this.b));
        return g12.h();
    }

    public int m() {
        if (V.c() == 13) {
            return gb.a.M().cu.f(this.b);
        }
        g1 g12 = new g1(gb.a.M().cu.d(this.b));
        return g12.f();
    }

    public int j() {
        if (V.c() == 13) {
            return gb.a.M().cu.h(this.b);
        }
        g1 g12 = new g1(gb.a.M().cu.d(this.b));
        return g12.g();
    }

    public dx i() {
        return ds.t().b(this.l(), this.m(), this.j());
    }

    public int f() {
        if (V.c() == 13) {
            return gb.a.M().cu.g(this.b);
        }
        return new gg(gb.a.M().cu.b(this.b)).h();
    }
}

