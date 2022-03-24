/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.pc;
import manthe.w9;
import manthe.wF;

class Q
implements pc {
    final wF b;
    final w9 a;

    Q(w9 w92, wF wF2) {
        this.a = w92;
        this.b = wF2;
    }

    @Override
    public void b() {
        if (w9.f(this.a) == null) {
            this.b.a((w9)null);
            return;
        }
        w9.f(this.a).J();
    }
}

