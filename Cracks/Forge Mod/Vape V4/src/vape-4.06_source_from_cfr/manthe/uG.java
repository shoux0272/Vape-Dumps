/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.pc;
import manthe.xQ;

class uG
implements pc {
    final xQ a;

    uG(xQ xQ2) {
        this.a = xQ2;
    }

    @Override
    public void b() {
        xQ.a(this.a, !xQ.a(this.a));
        this.a.K();
    }
}

