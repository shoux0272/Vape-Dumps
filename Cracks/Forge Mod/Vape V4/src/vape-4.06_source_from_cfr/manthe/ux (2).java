/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.pc;
import manthe.wK;

class ux
implements pc {
    final wK a;

    ux(wK wK2) {
        this.a = wK2;
    }

    @Override
    public void b() {
        if (wK.a(this.a) != null) {
            wK.a(this.a).d();
        }
        this.a.N();
    }
}

