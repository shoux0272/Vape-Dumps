/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.ex;
import manthe.kl;
import manthe.on;
import manthe.y5;

public class kJ
extends kl {
    private final ex d;

    public kJ(Object object, int n6) {
        this.d = new ex(object);
        this.a = n6;
    }

    public ex getTarget() {
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

