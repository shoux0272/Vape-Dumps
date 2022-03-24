/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.bz;
import manthe.pc;
import manthe.we;
import manthe.x3;

class A2
implements pc {
    final we b;
    final x3 a;

    A2(x3 x32, we we2) {
        this.a = x32;
        this.b = we2;
    }

    @Override
    public void b() {
        if (this.b instanceof bz) {
            ((bz)((Object)this.b)).n();
            x3.a(this.a, ((bz)((Object)this.b)).m());
        }
    }
}

