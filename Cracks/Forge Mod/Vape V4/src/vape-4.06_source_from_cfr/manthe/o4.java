/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.DY;
import manthe.pc;
import manthe.xm;

class o4
implements pc {
    final DY a;
    final xm b;

    o4(xm xm2, DY dY2) {
        this.b = xm2;
        this.a = dY2;
    }

    @Override
    public void b() {
        this.a.r().h().a((Boolean)(this.a.r().h().u() == false ? 1 : 0));
    }
}

