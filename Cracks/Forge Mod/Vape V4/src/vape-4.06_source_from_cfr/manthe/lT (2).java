/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.on;
import manthe.rx;
import manthe.vK;
import manthe.yU;
import manthe.ya;
import manthe.yu;

class lT
implements vK {
    final rx a;

    lT(rx rx2) {
        this.a = rx2;
    }

    @Override
    public void a(int n6, int n10, int n11) {
        String string = rx.j(this.a).C().E();
        if (string.isEmpty() || on.p.f().a(string) != null) {
            return;
        }
        rx.j(this.a).C().a("");
        if (string.startsWith("/")) {
            rx.a(this.a, new yU(string));
            rx.b(this.a, false);
        } else if (string.equalsIgnoreCase("fishing rod")) {
            rx.b(this.a, new yu(string));
            rx.b(this.a, true);
        } else {
            rx.b(this.a, new ya(string));
            rx.b(this.a, true);
        }
    }
}

