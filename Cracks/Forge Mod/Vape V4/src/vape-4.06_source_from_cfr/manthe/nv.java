/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.DO;
import manthe.on;
import manthe.w9;
import manthe.wF;
import manthe.xw;
import manthe.ya;
import manthe.zu;

class nv
implements DO {
    final wF b;
    final xw a;

    nv(xw xw2, wF wF2) {
        this.a = xw2;
        this.b = wF2;
    }

    @Override
    public void a(char c3, int n6) {
        if (xw.a(this.a) && n6 != 28) {
            this.a.Q();
            if (xw.c(this.a) != null) {
                ya ya2 = new ya(xw.c(this.a));
                if (on.p.f().a(xw.c(this.a)) != null) {
                    this.a.c("");
                    zu.W = null;
                    return;
                }
                ya2.d(n6);
                ya2.c(n6);
                zu.W = null;
                xw.a(this.a, new w9(this.b, ya2));
                xw.b(this.a).O();
                this.a.a(xw.b(this.a));
            }
            this.a.c("");
        }
    }
}

