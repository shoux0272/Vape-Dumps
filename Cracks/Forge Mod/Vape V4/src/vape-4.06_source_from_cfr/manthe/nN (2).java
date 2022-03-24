/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.pc;
import manthe.w9;
import manthe.wF;
import manthe.ya;

class nN
implements pc {
    final wF c;
    final w9 b;
    final ya a;
    final w9 d;

    nN(w9 w92, wF wF2, w9 w93, ya ya2) {
        this.d = w92;
        this.c = wF2;
        this.b = w93;
        this.a = ya2;
    }

    @Override
    public void b() {
        w9.a(this.d, !w9.i(this.d));
        if (w9.i(this.d)) {
            this.c.a(this.b);
            w9.a(this.d, new ya(this.a.l()).a(this.a.r()));
            w9.k(this.d).a(true);
            w9.e(this.d).a(true);
            w9.d(this.d).a(true);
            w9.h(this.d).a(true);
            w9.a(this.d).a(true);
            w9.c(this.d).a(true);
            w9.g(this.d).a(false);
        } else {
            this.c.a((w9)null);
            w9.k(this.d).a(false);
            w9.e(this.d).a(false);
            w9.d(this.d).a(false);
            w9.h(this.d).a(false);
            w9.a(this.d).a(false);
            w9.c(this.d).a(false);
            w9.g(this.d).a(true);
        }
        this.c.M();
    }
}

