/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.pc;
import manthe.qw;
import manthe.xa;

class BS
implements pc {
    final qw b;
    final xa a;

    BS(xa xa2, qw qw2) {
        this.a = xa2;
        this.b = qw2;
    }

    @Override
    public void b() {
        this.b.c(xa.a(this.a).u());
    }
}

