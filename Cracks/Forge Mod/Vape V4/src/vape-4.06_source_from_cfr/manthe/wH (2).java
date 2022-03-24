/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.awt.Color;
import manthe.DB;
import manthe.wK;
import manthe.wp;
import manthe.zu;

class wH
extends wK {
    final zu T;
    final wp S;

    wH(wp wp2, DB dB2, zu zu2) {
        this.S = wp2;
        this.T = zu2;
        super(dB2);
    }

    @Override
    public boolean b() {
        return this.T.F.u();
    }

    @Override
    public Color I() {
        return wH.b.u;
    }
}

