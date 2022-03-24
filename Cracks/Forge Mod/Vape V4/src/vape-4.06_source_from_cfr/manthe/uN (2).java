/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.on;
import manthe.pc;
import manthe.xV;

class uN
implements pc {
    final xV a;

    uN(xV xV2) {
        this.a = xV2;
    }

    @Override
    public void b() {
        on.p.K();
        xV.a(this.a, System.currentTimeMillis());
        xV.c(this.a).a(false);
    }
}

