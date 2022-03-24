/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.Dp;
import manthe.rb;
import manthe.vK;

class bq
implements vK {
    final Dp a;
    final rb b;

    bq(rb rb2, Dp dp2) {
        this.b = rb2;
        this.a = dp2;
    }

    @Override
    public void a(int n6, int n10, int n11) {
        if (n11 == 0) {
            this.a.a(this.b);
        }
    }
}

