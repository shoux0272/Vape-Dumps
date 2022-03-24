/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.awt.Color;
import manthe.DB;
import manthe.cB;
import manthe.wK;
import manthe.wp;

class wO
extends wK {
    final cB S;
    final wp T;

    wO(wp wp2, DB dB2, cB cB2) {
        this.T = wp2;
        this.S = cB2;
        super(dB2);
    }

    @Override
    public boolean b() {
        return this.S.t.u();
    }

    @Override
    public Color I() {
        return wO.b.u;
    }
}

