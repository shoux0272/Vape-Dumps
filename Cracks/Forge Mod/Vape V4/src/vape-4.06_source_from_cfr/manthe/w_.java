/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.awt.Color;
import manthe.DB;
import manthe.cB;
import manthe.wK;
import manthe.wp;

class w_
extends wK {
    final cB S;
    final wp T;

    w_(wp wp2, DB dB2, cB cB2) {
        this.T = wp2;
        this.S = cB2;
        super(dB2);
    }

    @Override
    public boolean b() {
        return this.S.k.u();
    }

    @Override
    public Color I() {
        return w_.b.u;
    }
}

