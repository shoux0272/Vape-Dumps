/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.awt.Color;
import manthe.DE;
import manthe.pe;
import manthe.xd;
import manthe.xu;

class x5
extends xu {
    final xd W;

    x5(xd xd2, String string, DE dE2, Color[] arrcolor) {
        this.W = xd2;
        super(string, dE2, arrcolor);
    }

    @Override
    protected void Q() {
        pe.a("teamdot", this.d() + (double)this.J().o().floatValue(), this.S.b() + this.S.c() / 2.0, this.S.d(), this.S.c(), this.P().q());
    }

    @Override
    public boolean U() {
        return false;
    }
}

