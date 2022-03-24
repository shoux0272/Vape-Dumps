/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.awt.Color;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import manthe.R;
import manthe.p1;
import manthe.rg;
import manthe.rm;

class Cl
implements R {
    final rg b;
    final AtomicInteger d;
    final List c;
    final rm a;

    Cl(rm rm2, rg rg2, AtomicInteger atomicInteger, List list) {
        this.a = rm2;
        this.b = rg2;
        this.d = atomicInteger;
        this.c = list;
    }

    public void a(p1 p12) {
        this.b.z().j(this.d.get() + 4 < this.c.size() - 1);
        this.b.e(this.b.z().i());
        if (!this.b.z().i()) {
            this.b.z().b(Color.WHITE);
        }
    }
}

