/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.pc;
import manthe.xi;
import manthe.xy;

class DI
implements pc {
    final xi a;
    final xy b;

    DI(xy xy2, xi xi2) {
        this.b = xy2;
        this.a = xi2;
    }

    @Override
    public void b() {
        if (this.a.equals(xy.a(this.b)) && xy.b(this.b).size() > 0) {
            this.b.a((xi)xy.b(this.b).get(0));
        }
        this.b.b(this.a);
        this.b.M();
    }
}

