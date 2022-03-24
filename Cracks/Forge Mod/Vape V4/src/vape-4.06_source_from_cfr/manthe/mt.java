/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.sI;
import manthe.vK;

class mt
implements vK {
    final sI a;

    mt(sI sI2) {
        this.a = sI2;
    }

    @Override
    public void a(int n6, int n10, int n11) {
        if (n11 == 0) {
            this.a.F();
        } else if (n11 == 1 && sI.a(this.a).e()) {
            sI.a(this.a).a().a(n6, n10, 0);
        }
    }
}

