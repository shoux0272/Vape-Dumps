/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.ex;
import manthe.kl;
import manthe.on;
import manthe.y5;

public class kn
extends kl {
    private final ex d;

    public kn(ex ex2) {
        this.d = ex2;
    }

    @Override
    public boolean fire() {
        for (y5 y52 : on.p.H().e()) {
            if (!y52.N()) continue;
            y52.a(this);
        }
        return this.d();
    }

    public ex getEntity() {
        return this.d;
    }
}

