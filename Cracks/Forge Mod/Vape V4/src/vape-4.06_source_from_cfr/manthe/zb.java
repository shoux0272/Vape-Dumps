/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.A5;
import manthe.CQ;
import manthe.ds;
import manthe.eJ;
import manthe.ky;
import manthe.y5;
import manthe.yI;

public class zb
extends y5 {
    private boolean u;

    public zb() {
        super("PotionSaver", -256, CQ.f, "Saves your potion effect(s) duration when standing still");
    }

    @Override
    public boolean n() {
        return true;
    }

    @Override
    public void a(ky ky2) {
        eJ eJ2 = ds.k();
        if (eJ2.d() && !eJ2.aJ().isEmpty() && !this.a(eJ2) && (eJ2.v() || eJ2.J())) {
            if (ky2.getPacket().a(A5.bN)) {
                this.u = true;
                ky2.a(true);
            }
        } else {
            this.u = false;
        }
    }

    private boolean a(eJ eJ2) {
        return eJ2.k() != 0.0 || eJ2.u() != 0.0;
    }

    @Override
    public int y() {
        return this.u ? -256 : yI.a(160);
    }
}

