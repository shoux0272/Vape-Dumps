/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.util.List;
import manthe.U;
import manthe.fG;
import manthe.pc;
import manthe.wA;

class ga
implements pc {
    final List b;
    final int a;
    final wA c;

    ga(wA wA2, List list, int n6) {
        this.c = wA2;
        this.b = list;
        this.a = n6;
    }

    @Override
    public void b() {
        U u6 = U.a((fG)this.b.get(this.a));
        wA.a(this.c).m().n().set(wA.a(this.c).ak(), u6);
    }
}

