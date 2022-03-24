/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.pc;
import manthe.wy;
import manthe.wz;
import manthe.y5;

class uS
implements pc {
    final wy b;
    final wz a;

    uS(wz wz2, wy wy2) {
        this.a = wz2;
        this.b = wy2;
    }

    @Override
    public void b() {
        wz.a(this.a, !wz.d(this.a));
        if (wz.d(this.a)) {
            this.b.a(this.a.S());
            this.a.Q();
        } else {
            this.b.a((y5)null);
            this.a.N();
        }
        this.b.M();
    }

    @Override
    public void a() {
        this.b();
    }
}

