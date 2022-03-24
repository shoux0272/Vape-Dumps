/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.on;
import manthe.qw;
import manthe.rW;
import manthe.vK;
import manthe.zE;

class r
implements vK {
    final rW a;
    final qw c;
    final rW b;

    r(rW rW2, rW rW3, qw qw2) {
        this.b = rW2;
        this.a = rW3;
        this.c = qw2;
    }

    @Override
    public void a(int n6, int n10, int n11) {
        if (n11 == 0) {
            on.p.d().b(this.a.H());
            on.p.H().b(zE.class).b(this.c);
        }
    }
}

