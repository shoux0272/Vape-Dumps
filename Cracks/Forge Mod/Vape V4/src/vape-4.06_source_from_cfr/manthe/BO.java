/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.so;
import manthe.vK;

class BO
implements vK {
    final so a;

    BO(so so2) {
        this.a = so2;
    }

    @Override
    public void a(int n6, int n10, int n11) {
        if (n11 != 0) {
            return;
        }
        so.a(this.a, !so.b(this.a));
        so.a(this.a).a(so.b(this.a));
    }
}

