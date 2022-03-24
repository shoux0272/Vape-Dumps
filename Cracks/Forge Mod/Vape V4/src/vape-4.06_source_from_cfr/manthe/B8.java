/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.on;
import manthe.rx;
import manthe.vK;

class B8
implements vK {
    final rx a;

    B8(rx rx2) {
        this.a = rx2;
    }

    @Override
    public void a(int n6, int n10, int n11) {
        if (rx.c(this.a) == null) {
            return;
        }
        on.p.f().b(rx.c(this.a));
        rx.a(this.a, false);
        rx.b(this.a, null);
    }
}

