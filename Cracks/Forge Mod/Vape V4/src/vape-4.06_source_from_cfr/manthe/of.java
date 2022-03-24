/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.Ak;
import manthe.rg;
import manthe.so;
import manthe.sv;
import manthe.vK;

class of
implements vK {
    final Ak a;
    final rg b;
    final so c;

    of(so so2, Ak ak, rg rg2) {
        this.c = so2;
        this.a = ak;
        this.b = rg2;
    }

    @Override
    public void a(int n6, int n10, int n11) {
        if (n11 != 0) {
            return;
        }
        this.a.q();
        new sv(this).start();
    }
}

