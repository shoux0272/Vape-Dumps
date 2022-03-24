/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.on;
import manthe.r2;
import manthe.vK;

class pI
implements vK {
    final r2 a;

    pI(r2 r22) {
        this.a = r22;
    }

    @Override
    public void a(int n6, int n10, int n11) {
        if (System.currentTimeMillis() < r2.a(this.a)) {
            return;
        }
        on.p.K();
        r2.a(this.a, System.currentTimeMillis() + 60000L);
    }
}

