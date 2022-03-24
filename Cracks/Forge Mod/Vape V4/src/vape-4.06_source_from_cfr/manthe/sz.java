/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.rx;
import manthe.sb;

class sz
extends sb {
    final rx S;

    sz(rx rx2, int n6) {
        this.S = rx2;
        super(n6);
    }

    @Override
    public boolean a(char c3, int n6) {
        if (this.y() && n6 == 28) {
            rx.h(this.S).a().a(0, 0, 0);
            return true;
        }
        return super.a(c3, n6);
    }
}

