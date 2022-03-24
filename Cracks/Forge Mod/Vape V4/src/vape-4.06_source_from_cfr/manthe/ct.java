/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.pc;
import manthe.wQ;

class ct
implements pc {
    final wQ a;

    ct(wQ wQ2) {
        this.a = wQ2;
    }

    @Override
    public void b() {
        this.a.f(!this.a.O());
        if (this.a.O()) {
            wQ.a(this.a).ak();
        }
    }
}

