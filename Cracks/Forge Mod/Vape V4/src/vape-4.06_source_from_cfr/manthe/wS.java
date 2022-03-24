/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.awt.Color;
import manthe.DB;
import manthe.cB;
import manthe.wK;
import manthe.wp;

class wS
extends wK {
    final cB T;
    final wp S;

    wS(wp wp2, DB dB2, cB cB2) {
        this.S = wp2;
        this.T = cB2;
        super(dB2);
    }

    @Override
    public boolean b() {
        return this.T.t.u();
    }

    @Override
    public Color I() {
        return wS.b.u;
    }
}

