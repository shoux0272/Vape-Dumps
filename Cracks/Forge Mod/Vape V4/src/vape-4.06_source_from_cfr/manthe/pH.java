/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.util.List;
import manthe.Aq;
import manthe.ds;
import manthe.r1;
import manthe.r_;
import manthe.vK;
import manthe.zu;

class pH
implements vK {
    final zu b;
    final r_ a;

    pH(r_ r_2, zu zu2) {
        this.a = r_2;
        this.b = zu2;
    }

    @Override
    public void a(int n6, int n10, int n11) {
        if (n11 == 0) {
            List<r1> list = this.b.Y();
            list.sort(new Aq(this));
            double d10 = 2.0;
            double d11 = 24.0;
            double d12 = 0.0;
            for (r1 r12 : list) {
                if (r12.ad() || !r12.e()) continue;
                if (d10 + r12.q() > (double)ds.p().g()) {
                    d10 = 2.0;
                    d11 += d12 + 2.0;
                    d12 = 0.0;
                }
                if (r12.b() > d12) {
                    d12 = r12.b();
                }
                r12.a(d10);
                r12.d(d11);
                d10 += r12.q() + 2.0;
            }
        }
    }
}

