/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import manthe.rg;
import manthe.rm;
import manthe.vK;

class Ce
implements vK {
    final List a;
    final AtomicInteger c;
    final rm b;

    Ce(rm rm2, List list, AtomicInteger atomicInteger) {
        this.b = rm2;
        this.a = list;
        this.c = atomicInteger;
    }

    @Override
    public void a(int n6, int n10, int n11) {
        if (((rg)this.a.get(0)).e()) {
            return;
        }
        rg rg2 = null;
        for (int k = this.a.size() - 1; k > 0; --k) {
            rg rg3 = (rg)this.a.get(k);
            if (!rg3.e()) continue;
            rg2 = rg3;
            break;
        }
        rg rg4 = null;
        for (rg rg5 : this.a) {
            if (!rg5.e()) continue;
            int n12 = this.a.indexOf(rg5);
            rg4 = (rg)this.a.get(n12 - 1);
            break;
        }
        if (rg2 == null || rg4 == null) {
            return;
        }
        int n13 = Integer.parseInt(rg4.z().E());
        this.c.set(n13 - 1);
        rg2.a(false);
        rg4.a(true);
    }
}

