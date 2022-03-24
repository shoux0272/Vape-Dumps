/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.rC;
import manthe.rg;
import manthe.sb;

class sl
extends sb {
    final rg S;
    final rC T;

    sl(rC rC2, int n6, rg rg2) {
        this.T = rC2;
        this.S = rg2;
        super(n6);
    }

    @Override
    public boolean a(char c3, int n6) {
        if (this.y() && n6 == 28) {
            this.S.a().a(0, 0, 0);
            return true;
        }
        return super.a(c3, n6);
    }
}

