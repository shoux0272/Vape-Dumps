/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.Bz;
import manthe.ri;
import manthe.vK;
import manthe.zu;

class c5
implements vK {
    final zu a;
    final ri b;

    c5(ri ri2, zu zu2) {
        this.b = ri2;
        this.a = zu2;
    }

    @Override
    public void a(int n6, int n10, int n11) {
        if (n11 != 0) {
            return;
        }
        ri.a(this.b, !ri.a(this.b));
        if (ri.a(this.b)) {
            this.b.f(false);
            Bz bz2 = this.a.ak();
            bz2.a(this.b);
            this.a.a(this.b);
        } else {
            this.b.f(true);
            Bz bz3 = this.a.ak();
            bz3.a(null);
        }
    }
}

