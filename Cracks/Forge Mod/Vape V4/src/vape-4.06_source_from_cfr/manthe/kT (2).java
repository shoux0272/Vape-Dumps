/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.ex;
import manthe.kl;
import manthe.on;
import manthe.y5;

public class kT
extends kl {
    private final ex e;
    private final boolean d;

    public kT(Object object, boolean bl) {
        this.e = new ex(object);
        this.d = bl;
    }

    public ex getEntity() {
        return this.e;
    }

    public boolean isNewStateSprinting() {
        return this.d;
    }

    @Override
    public boolean fire() {
        for (y5 y52 : on.p.H().e()) {
            if (!y52.N()) continue;
            y52.a(this);
        }
        return this.d();
    }
}

