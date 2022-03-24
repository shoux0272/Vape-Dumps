/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.util.List;
import manthe.CQ;
import manthe.V;
import manthe.ds;
import manthe.eJ;
import manthe.ei;
import manthe.fP;
import manthe.gh;
import manthe.kt;
import manthe.y5;

public class AQ
extends y5 {
    private boolean v;
    private boolean u;

    public AQ() {
        super("Parkour", -7719233, CQ.e, "Jumps for you at the edge of blocks.");
    }

    @Override
    public void b(kt kt2) {
        boolean bl;
        ei ei2 = ds.s().l();
        eJ eJ2 = ds.k();
        if (this.u) {
            if (!this.v) {
                ei.a(ei2.i(), false);
            }
            this.u = false;
            this.v = false;
            return;
        }
        if (ei2.f()) {
            return;
        }
        gh gh2 = eJ2.bg();
        boolean bl2 = bl = gh2.j() > 0.0f;
        if (bl && eJ2.v()) {
            fP fP2;
            if (V.c() >= 15) {
                fP2 = eJ2.s();
            } else {
                fP fP3 = eJ2.s();
                fP2 = fP3.k();
            }
            double d10 = 0.0;
            double d11 = eJ2.U();
            double d12 = 90.0;
            double d13 = Math.cos(Math.toRadians(d11 + d12)) * d10;
            double d14 = Math.sin(Math.toRadians(d11 + d12)) * d10;
            fP fP4 = fP2.c(d13, -0.1, d14);
            List list = ds.t().b(eJ2, fP4);
            d10 = 1.0;
            d13 = Math.cos(Math.toRadians(d11 + d12)) * d10;
            d14 = Math.sin(Math.toRadians(d11 + d12)) * d10;
            fP4 = fP2.c(d13, -2.0, d14);
            List list2 = ds.t().b(eJ2, fP4);
            int n6 = list.size();
            if (n6 == 0 && list2.size() == 0) {
                this.v = ei2.h();
                ei.a(ei2.i(), true);
                ei.a(ei2.i());
                this.u = true;
            }
        }
    }
}

