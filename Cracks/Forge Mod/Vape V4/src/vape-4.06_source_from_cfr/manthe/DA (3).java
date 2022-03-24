/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.Ak;
import manthe.on;
import manthe.so;
import manthe.vK;
import manthe.zu;

class DA
implements vK {
    final Ak a;
    final so b;

    DA(so so2, Ak ak) {
        this.b = so2;
        this.a = ak;
    }

    @Override
    public void a(int n6, int n10, int n11) {
        if (n11 != 0) {
            return;
        }
        if (on.p.l().d().size() == 1) {
            return;
        }
        on.p.l().a(this.a);
        zu.a(null);
    }
}

