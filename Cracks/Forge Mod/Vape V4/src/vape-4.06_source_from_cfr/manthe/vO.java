/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.DY;
import manthe.pc;
import manthe.xm;

class vO
implements pc {
    final DY b;
    final xm a;

    vO(xm xm2, DY dY2) {
        this.a = xm2;
        this.b = dY2;
    }

    @Override
    public void b() {
        this.b.r().e().a((Boolean)(this.b.r().e().u() == false ? 1 : 0));
    }
}

