/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.A5;
import manthe.cB;
import manthe.ds;
import manthe.ei;
import manthe.on;
import manthe.z1;

class oG
extends Thread {
    final z1 a;

    oG(z1 z12) {
        this.a = z12;
    }

    @Override
    public void run() {
        while (!on.p.x()) {
            try {
                boolean bl;
                Thread.sleep(5L);
                if (!this.a.N() || z1.a(this.a)) continue;
                boolean bl2 = bl = z1.f(this.a) && !z1.l(this.a);
                if (bl) {
                    boolean bl3;
                    ei ei2 = ds.s().m();
                    if (cB.f() && !ei2.h() && !z1.c(this.a)) {
                        ei.a(ei2.i(), true);
                        z1.a(this.a, true);
                    }
                    boolean bl4 = bl3 = z1.j(this.a).u() != false && ds.x().a(A5.bt);
                    if (!bl3) {
                        continue;
                    }
                } else {
                    z1.a(this.a, false);
                }
                z1.b(this.a).e();
            }
            catch (Exception exception) {}
        }
    }
}

