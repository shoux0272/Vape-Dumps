/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.DB;
import manthe.on;
import manthe.wK;
import manthe.wp;

class wZ
extends wK {
    final wp S;

    wZ(wp wp2, DB dB2) {
        this.S = wp2;
        super(dB2);
    }

    @Override
    public void N() {
        if (on.C) {
            return;
        }
        on.p.S();
        super.N();
    }

    @Override
    public void j() {
        if (on.C != this.T()) {
            super.N();
        }
        super.j();
    }
}

