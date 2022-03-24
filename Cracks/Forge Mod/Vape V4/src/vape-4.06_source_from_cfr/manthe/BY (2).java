/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.rx;
import manthe.vK;

class BY
implements vK {
    final rx a;

    BY(rx rx2) {
        this.a = rx2;
    }

    @Override
    public void a(int n6, int n10, int n11) {
        if (rx.c(this.a) == null) {
            return;
        }
        if (rx.e(this.a)) {
            rx.a(this.a, false);
            rx.b(this.a, null);
        } else {
            rx.a(this.a, false);
            rx.b(this.a, false);
            rx.a(this.a, rx.c(this.a));
            rx.b(this.a, null);
        }
    }
}

