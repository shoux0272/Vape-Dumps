/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.pc;
import manthe.wT;
import manthe.wp;
import manthe.xV;
import manthe.zu;

class BQ
implements pc {
    final xV a;

    BQ(xV xV2) {
        this.a = xV2;
    }

    @Override
    public void b() {
        wp wp2 = zu.b(wp.class);
        wT wT2 = zu.b(wT.class);
        if (wp2 == null || wT2 == null) {
            return;
        }
        wp2.a(!wp2.b());
        if (wp2.b()) {
            wp2.ac();
        }
        wp2.c(wT2.d());
        wp2.a(wT2.c());
        wp2.M();
    }
}

