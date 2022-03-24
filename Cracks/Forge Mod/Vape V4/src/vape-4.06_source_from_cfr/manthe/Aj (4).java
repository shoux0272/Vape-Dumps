/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.Ak;
import manthe.CC;
import manthe.rg;
import manthe.so;
import manthe.vK;

class Aj
implements vK {
    final Ak b;
    final rg a;
    final so c;

    Aj(so so2, Ak ak, rg rg2) {
        this.c = so2;
        this.b = ak;
        this.a = rg2;
    }

    @Override
    public void a(int n6, int n10, int n11) {
        if (n11 != 0) {
            return;
        }
        this.b.x();
        new CC(this).start();
    }
}

