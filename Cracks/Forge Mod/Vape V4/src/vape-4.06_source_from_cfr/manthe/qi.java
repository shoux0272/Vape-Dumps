/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.on;
import manthe.pc;
import manthe.wy;
import manthe.wz;
import manthe.y5;

class qi
implements pc {
    final y5 b;
    final wy a;
    final wz c;

    qi(wz wz2, y5 y52, wy wy2) {
        this.c = wz2;
        this.b = y52;
        this.a = wy2;
    }

    @Override
    public void b() {
        on.p.A().c(this.b);
        this.a.M();
    }
}

