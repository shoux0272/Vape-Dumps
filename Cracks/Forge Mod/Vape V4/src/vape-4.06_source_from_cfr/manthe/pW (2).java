/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.pc;
import manthe.wp;

class pW
implements pc {
    final wp a;

    pW(wp wp2) {
        this.a = wp2;
    }

    @Override
    public void b() {
        wp.a(this.a);
    }
}

