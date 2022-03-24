/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.rg;
import manthe.rs;
import manthe.sb;

class sf
extends sb {
    final rg T;
    final rs S;

    sf(rs rs2, rg rg2) {
        this.S = rs2;
        this.T = rg2;
    }

    @Override
    public boolean a(char c3, int n6) {
        if (this.y() && n6 == 28) {
            this.T.a().a(0, 0, 0);
            return true;
        }
        return super.a(c3, n6);
    }
}

