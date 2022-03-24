/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.R;
import manthe.p1;
import manthe.rx;
import manthe.sk;
import manthe.yU;

class BW
implements R {
    final rx a;

    BW(rx rx2) {
        this.a = rx2;
    }

    public void a(p1 p12) {
        if (rx.b(this.a) && rx.c(this.a) != null) {
            rx.b(this.a, false);
            rx.i(this.a).v().clear();
            rx.i(this.a).a(!(rx.c(this.a) instanceof yU));
            rx.i(this.a).b((p1)rx.c(this.a).m().c());
            rx.i(this.a).b((p1)rx.c(this.a).q().c());
            rx.i(this.a).b((p1)rx.c(this.a).k().c());
            for (p1 p13 : rx.i(this.a).v()) {
                p13.c(rx.i(this.a).q());
                if (p13 instanceof sk) {
                    p13.b(6.0);
                    continue;
                }
                p13.b(10.0);
            }
        }
    }
}

