/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.pc;
import manthe.xi;
import manthe.xy;

class cN
implements pc {
    final xy b;
    final xy a;

    cN(xy xy2, xy xy3) {
        this.a = xy2;
        this.b = xy3;
    }

    @Override
    public void b() {
        xi xi2 = new xi(this.b, xy.c(this.a));
        xy.b(this.a).add(xi2);
        if (xy.a(this.a) == null) {
            xy.a(this.a, xi2);
        }
        this.a.M();
    }
}

