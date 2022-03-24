/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.Ak;
import manthe.on;
import manthe.rl;
import manthe.sg;
import manthe.vK;

class DS
implements vK {
    final Ak b;
    final rl a;
    final sg c;

    DS(sg sg2, Ak ak, rl rl2) {
        this.c = sg2;
        this.b = ak;
        this.a = rl2;
    }

    @Override
    public void a(int n6, int n10, int n11) {
        if (on.p.l().b() >= 10) {
            return;
        }
        if (!this.b.o()) {
            on.p.t().s.a().a(0, 0, 0);
            try {
                Thread.sleep(200L);
            }
            catch (InterruptedException interruptedException) {
                interruptedException.printStackTrace();
            }
        }
        if (!this.b.o()) {
            this.a.a("Must sync");
            return;
        }
        this.b.b(true);
        on.p.p();
        on.p.l().a(this.b);
        on.p.l().b(this.b);
    }
}

