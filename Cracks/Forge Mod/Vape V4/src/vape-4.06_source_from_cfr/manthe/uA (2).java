/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.rM;
import manthe.rR;
import manthe.vK;

class uA
implements vK {
    final rM a;
    final rR b;

    uA(rR rR2, rM rM2) {
        this.b = rR2;
        this.a = rM2;
    }

    @Override
    public void a(int n6, int n10, int n11) {
        if (n11 != 0) {
            return;
        }
        rR.d(this.b).a(this.a.C());
        rR.e(this.b).a().set(rR.a(this.b), this.a.x());
        rR.a(this.b, rR.a(this.b));
    }
}

