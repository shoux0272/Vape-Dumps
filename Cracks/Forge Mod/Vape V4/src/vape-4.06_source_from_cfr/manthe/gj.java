/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.rV;
import manthe.rx;
import manthe.vK;
import manthe.ya;

class gj
implements vK {
    final rx b;
    final ya a;
    final rV c;

    gj(rV rV2, rx rx2, ya ya2) {
        this.c = rV2;
        this.b = rx2;
        this.a = ya2;
    }

    @Override
    public void a(int n6, int n10, int n11) {
        if (n11 == 0) {
            this.b.a(this.a);
            this.b.p(true);
            this.b.q(true);
        }
    }
}

