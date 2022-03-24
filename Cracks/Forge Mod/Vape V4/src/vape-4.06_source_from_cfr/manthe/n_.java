/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.pc;
import manthe.xA;

class n_
implements pc {
    final xA a;

    n_(xA xA2) {
        this.a = xA2;
    }

    @Override
    public void b() {
        xA.a(this.a, !xA.a(this.a));
        this.a.F().M();
    }
}

