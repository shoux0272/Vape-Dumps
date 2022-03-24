/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.R;
import manthe.on;
import manthe.p1;
import manthe.rz;
import manthe.zu;

class Ae
implements R {
    final zu a;

    Ae(zu zu2) {
        this.a = zu2;
    }

    public void a(p1 p12) {
        if (((rz)this.a.aj.c()).g()) {
            if (!zu.a(this.a)) {
                on.p.l().d(on.p.l().a());
                zu.a(this.a, true);
            }
        } else if (zu.a(this.a)) {
            zu.a(this.a, false);
        }
    }
}

