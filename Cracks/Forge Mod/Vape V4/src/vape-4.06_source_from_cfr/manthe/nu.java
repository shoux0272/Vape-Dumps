/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.pc;
import manthe.w4;

class nu
implements pc {
    final w4 a;

    nu(w4 w42) {
        this.a = w42;
    }

    @Override
    public void b() {
        if (w4.a(this.a).c()) {
            return;
        }
        w4.a(this.a).run();
    }
}

