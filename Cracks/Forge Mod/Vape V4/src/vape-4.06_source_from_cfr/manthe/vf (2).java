/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.R;
import manthe.p1;
import manthe.rl;
import manthe.rx;

class vf
implements R {
    final rl b;
    final rx a;

    vf(rx rx2, rl rl2) {
        this.a = rx2;
        this.b = rl2;
    }

    public void a(p1 p12) {
        if (rx.c(this.a) != null) {
            this.b.a(rx.c(this.a).l());
        } else {
            this.b.a("N/A");
        }
    }
}

