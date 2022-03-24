/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.Bo;
import manthe.o7;
import manthe.pc;
import manthe.wz;
import manthe.zu;

class Dc
implements pc {
    final wz b;
    final wz a;

    Dc(wz wz2, wz wz3) {
        this.a = wz2;
        this.b = wz3;
    }

    @Override
    public void b() {
        Bo bo2 = o7.b();
        wz.a(this.a, bo2.b);
        wz.b(this.a, this.a.c());
        wz.b(this.a, true);
        zu.W = this.b;
    }
}

