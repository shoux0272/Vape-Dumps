/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import a.a;
import manthe.Ak;
import manthe.CG;
import manthe.rQ;
import manthe.sM;
import manthe.vK;

class BR
implements vK {
    final Ak c;
    final rQ a;
    final sM b;

    BR(sM sM2, Ak ak, rQ rQ2) {
        this.b = sM2;
        this.c = ak;
        this.a = rQ2;
    }

    @Override
    public void a(int n6, int n10, int n11) {
        a.a.cpy(this.c.l().toString());
        this.a.b("Copied!");
        new CG(this).start();
    }
}

