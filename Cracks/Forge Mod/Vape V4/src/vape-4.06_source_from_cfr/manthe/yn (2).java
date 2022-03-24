/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.DY;
import manthe.pc;
import manthe.xm;

class yn
implements pc {
    final DY a;
    final xm b;

    yn(xm xm2, DY dY2) {
        this.b = xm2;
        this.a = dY2;
    }

    @Override
    public void b() {
        this.a.r().b().a((Boolean)(this.a.r().b().u() == false ? 1 : 0));
    }
}

