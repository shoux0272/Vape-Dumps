/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.kl;
import manthe.on;
import manthe.y5;

public class ku
extends kl {
    private final float d;

    public ku(float f10) {
        this.d = f10;
    }

    @Override
    public boolean fire() {
        for (y5 y52 : on.p.H().e()) {
            if (!y52.N()) continue;
            y52.a(this);
        }
        return this.d();
    }

    public float getTicks() {
        return this.d;
    }
}

