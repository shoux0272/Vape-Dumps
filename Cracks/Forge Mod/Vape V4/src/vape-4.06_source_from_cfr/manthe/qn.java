/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.bz;
import manthe.pc;
import manthe.we;
import manthe.xh;

class qn
implements pc {
    final we a;
    final xh b;

    qn(xh xh2, we we2) {
        this.b = xh2;
        this.a = we2;
    }

    @Override
    public void b() {
        if (this.a instanceof bz) {
            ((bz)((Object)this.a)).n();
        }
    }
}

