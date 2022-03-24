/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.pc;
import manthe.w3;

class bM
implements pc {
    final w3 a;

    bM(w3 w32) {
        this.a = w32;
    }

    @Override
    public void b() {
        this.a.f(!this.a.O());
        if (this.a.O()) {
            w3.a(this.a).ak();
        }
    }
}

