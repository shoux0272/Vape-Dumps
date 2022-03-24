/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.dV;
import manthe.kl;
import manthe.on;
import manthe.y5;

public class kU
extends kl {
    private final dV e;
    private final Object d;

    public kU(dV dV2) {
        this.e = dV2;
        this.d = dV2.g();
    }

    @Override
    public boolean fire() {
        for (y5 y52 : on.p.H().e()) {
            if (!y52.N()) continue;
            y52.a(this);
        }
        return this.d();
    }

    public Object getOverlayType() {
        return this.d;
    }

    public dV getEvent() {
        return this.e;
    }
}

