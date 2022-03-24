/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.pc;
import manthe.xC;

class uH
implements pc {
    final xC a;

    uH(xC xC2) {
        this.a = xC2;
    }

    @Override
    public void b() {
        xC.a(this.a, !xC.a(this.a));
        this.a.F().M();
    }
}

