/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.awt.Color;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import manthe.rf;
import manthe.rg;
import manthe.rm;
import manthe.vK;

class qu
implements vK {
    final List a;
    final rg c;
    final rf b;
    final AtomicInteger f;
    final int d;
    final rm e;

    qu(rm rm2, List list, rg rg2, rf rf2, AtomicInteger atomicInteger, int n6) {
        this.e = rm2;
        this.a = list;
        this.c = rg2;
        this.b = rf2;
        this.f = atomicInteger;
        this.d = n6;
    }

    @Override
    public void a(int n6, int n10, int n11) {
        for (rg rg2 : this.a) {
            if (rg2 == this.c) {
                rg2.z().j(true);
                rg2.e(true);
                continue;
            }
            rg2.z().j(false);
            rg2.z().b(Color.WHITE);
            rg2.e(false);
        }
        this.b.v().get(this.f.get()).a(false);
        this.b.v().get(this.d).a(true);
        this.b.u().b();
        this.f.set(this.d);
    }
}

