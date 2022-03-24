/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.on;
import manthe.tR;
import manthe.wp;
import manthe.zu;

class ul
implements tR {
    final zu a;
    final wp b;

    ul(wp wp2, zu zu2) {
        this.b = wp2;
        this.a = zu2;
    }

    @Override
    public void a() {
        if (this.a.aj.v().equals(this.a.ao)) {
            this.a.aj.a(this.a.K);
            on.p.l().d(on.p.l().a());
            this.a.aj.a(this.a.ao);
        }
    }
}

