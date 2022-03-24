/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.DY;
import manthe.pc;
import manthe.xm;

class ae
implements pc {
    final DY a;
    final xm b;

    ae(xm xm2, DY dY2) {
        this.b = xm2;
        this.a = dY2;
    }

    @Override
    public void b() {
        this.a.r().i().a((Boolean)(this.a.r().i().u() == false ? 1 : 0));
    }
}

