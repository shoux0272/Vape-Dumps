/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.rF;
import manthe.ry;
import manthe.vK;
import manthe.zu;

class qJ
implements vK {
    final rF a;
    final ry b;

    qJ(ry ry2, rF rF2) {
        this.b = ry2;
        this.a = rF2;
    }

    @Override
    public void a(int n6, int n10, int n11) {
        if (n11 != 0) {
            return;
        }
        if (!ry.b(this.b)) {
            this.a.b(this.b);
        } else {
            zu.T.a(this.b);
        }
    }
}

