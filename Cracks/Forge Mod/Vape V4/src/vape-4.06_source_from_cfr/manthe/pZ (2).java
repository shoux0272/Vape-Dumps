/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.pc;
import manthe.wp;

class pZ
implements pc {
    final wp a;

    pZ(wp wp2) {
        this.a = wp2;
    }

    @Override
    public void b() {
        wp.c(this.a);
    }
}

