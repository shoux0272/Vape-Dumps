/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.rg;
import manthe.rm;
import manthe.sb;

class sH
extends sb {
    final rg S;
    final rm T;

    sH(rm rm2, int n6, rg rg2) {
        this.T = rm2;
        this.S = rg2;
        super(n6);
    }

    @Override
    public boolean a(char c3, int n6) {
        if (n6 == 28) {
            this.S.a().a(0, 0, 0);
            return true;
        }
        return super.a(c3, n6);
    }
}

