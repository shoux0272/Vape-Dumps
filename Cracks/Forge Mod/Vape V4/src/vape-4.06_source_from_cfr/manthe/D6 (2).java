/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.D0;
import manthe.ng;
import manthe.yf;

class D6
extends D0 {
    boolean m;
    final yf n;

    D6(yf yf2, Object object, String string) {
        this.n = yf2;
        super(object, string);
    }

    @Override
    public void l() {
        if (this.m) {
            return;
        }
        this.m = true;
        ng.i.a(this.n.b.a());
    }
}

