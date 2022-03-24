/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.R;
import manthe.ds;
import manthe.p1;
import manthe.zr;

class be
implements R {
    final zr a;

    be(zr zr2) {
        this.a = zr2;
    }

    public void a(p1 p12) {
        if (!this.a.N()) {
            return;
        }
        if (zr.b(this.a).v().equals(zr.a(this.a))) {
            ds.k().f(16);
        } else if (zr.c(this.a) != -1.0f) {
            ds.s().b(zr.c(this.a));
        }
    }
}

