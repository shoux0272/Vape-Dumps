/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.D0;
import manthe.ng;
import manthe.yf;

class DT
extends D0 {
    boolean n;
    final yf m;

    DT(yf yf2, Object object, String string) {
        this.m = yf2;
        super(object, string);
    }

    @Override
    public void l() {
        if (this.n) {
            return;
        }
        this.n = true;
        if (!this.m.d.a().equals("")) {
            ng.j.ag.z().a(this.m.d.a());
        }
    }
}

