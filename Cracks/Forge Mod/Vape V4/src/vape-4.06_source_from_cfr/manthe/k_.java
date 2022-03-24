/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.ex;
import manthe.kl;
import manthe.on;
import manthe.y5;

public class k_
extends kl {
    private final ex e;
    private final String d;

    public k_(ex ex2, String string) {
        this.e = ex2;
        this.d = string;
    }

    @Override
    public boolean fire() {
        for (y5 y52 : on.p.H().e()) {
            if (!y52.N()) continue;
            y52.a(this);
        }
        return super.fire();
    }

    public ex getEntity() {
        return this.e;
    }

    public String getName() {
        return this.d;
    }
}

