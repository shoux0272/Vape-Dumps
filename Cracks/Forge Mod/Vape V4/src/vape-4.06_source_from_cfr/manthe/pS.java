/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.CQ;
import manthe.Ds;
import manthe.on;
import manthe.r_;
import manthe.vK;
import manthe.y5;
import manthe.zE;

class pS
implements vK {
    final r_ a;

    pS(r_ r_2) {
        this.a = r_2;
    }

    @Override
    public void a(int n6, int n10, int n11) {
        for (y5 bI2 : on.p.H().e()) {
            if ((bI2.Q() != CQ.b || bI2 instanceof zE) && bI2.N()) {
                bI2.d(false);
            }
            bI2.c().clear();
            if (bI2.P() != 0) {
                bI2.c().add(bI2.P());
            }
            if (bI2.l() != null && bI2.l().Y() != null) {
                bI2.l().Y().g(bI2.v());
            }
            for (Ds ds2 : bI2.r()) {
                if (ds2.b() == null) continue;
                ds2.q();
            }
        }
        for (Ds ds3 : on.p.o().a()) {
            if (ds3.b() == null) continue;
            ds3.q();
        }
    }
}

