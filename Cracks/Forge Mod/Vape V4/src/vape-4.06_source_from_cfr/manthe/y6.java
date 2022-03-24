/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.A5;
import manthe.CQ;
import manthe.kF;
import manthe.ky;
import manthe.y5;

public class y6
extends y5 {
    public y6() {
        super("Anti-FML", 8919359, CQ.f, "Some servers prevent Forge from connecting\nthis will bypass that.\nYou must reconnect to the server inorder for this to work.");
    }

    @Override
    public boolean n() {
        return true;
    }

    @Override
    public void a(kF kF2) {
    }

    @Override
    public void a(ky ky2) {
        if (ky2.getPacket().a().getClass().getName().toLowerCase().contains(A5.dY)) {
            ky2.a(true);
        }
    }
}

