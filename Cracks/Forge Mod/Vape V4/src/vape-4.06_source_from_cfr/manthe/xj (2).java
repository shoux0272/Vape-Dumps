/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.awt.Color;
import manthe.DE;
import manthe.cB;
import manthe.wp;
import manthe.xd;

class xj
extends xd {
    final cB G;
    final wp F;

    xj(wp wp2, DE dE2, cB cB2) {
        this.F = wp2;
        this.G = cB2;
        super(dE2);
    }

    @Override
    public boolean b() {
        return this.G.t.u();
    }

    @Override
    public Color I() {
        return xj.b.u;
    }
}

