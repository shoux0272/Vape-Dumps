/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.A5;
import manthe.Da;
import manthe.eC;
import manthe.kl;
import manthe.on;
import manthe.y5;

public class kt
extends kl {
    private final eC d;

    public kt(eC eC2, int n6) {
        this.d = eC2;
        this.a = n6;
    }

    @Override
    public boolean fire() {
        if (!this.getPlayer().a(A5.u)) {
            return false;
        }
        for (y5 y52 : on.p.H().e()) {
            if (!y52.N()) continue;
            if (this.a() == Da.b) {
                y52.b(this);
                continue;
            }
            y52.a(this);
        }
        return this.d();
    }

    public eC getPlayer() {
        return this.d;
    }
}

