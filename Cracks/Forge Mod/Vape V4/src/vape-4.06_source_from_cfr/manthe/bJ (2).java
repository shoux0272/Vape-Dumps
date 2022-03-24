/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import manthe.rg;
import manthe.rm;
import manthe.vK;

class bJ
implements vK {
    final AtomicInteger a;
    final List b;
    final rm c;

    bJ(rm rm2, AtomicInteger atomicInteger, List list) {
        this.c = rm2;
        this.a = atomicInteger;
        this.b = list;
    }

    @Override
    public void a(int n6, int n10, int n11) {
        if (this.a.get() + 4 >= this.b.size() - 1) {
            return;
        }
        rg rg2 = null;
        for (rg rg3 : this.b) {
            if (!rg3.e()) continue;
            rg2 = rg3;
            break;
        }
        if (rg2 == null) {
            return;
        }
        int n12 = Integer.parseInt(rg2.z().E());
        this.a.set(n12);
        rg2.a(false);
        ((rg)this.b.get(this.a.get() + 4)).a(true);
    }
}

