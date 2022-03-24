/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.V;
import manthe.dO;
import manthe.g1;
import manthe.gg;
import manthe.hl;
import manthe.on;

public class dt
extends dO {
    public dt(Object object) {
        super(object);
    }

    public int m() {
        if (V.c() == 13) {
            return hl.e(on.p.M().bg, this.a());
        }
        if (this.o().e()) {
            return 0;
        }
        return this.o().h();
    }

    public int i() {
        if (V.c() == 13) {
            return hl.d(on.p.M().bg, this.a());
        }
        if (this.o().e()) {
            return 0;
        }
        return this.o().f();
    }

    public int k() {
        if (V.c() == 13) {
            return hl.c(on.p.M().bg, this.a());
        }
        if (this.o().e()) {
            return 0;
        }
        return this.o().g();
    }

    public int j() {
        if (V.c() == 13) {
            return hl.a(on.p.M().bg, this.a());
        }
        if (this.l().e()) {
            return -1;
        }
        return this.l().h();
    }

    public g1 o() {
        return new g1(hl.g(on.p.M().bg, this.a()));
    }

    public gg l() {
        return new gg(hl.f(on.p.M().bg, this.a()));
    }

    public String n() {
        if (V.c() >= 23) {
            return "";
        }
        return hl.b(on.p.M().bg, this.a());
    }
}

