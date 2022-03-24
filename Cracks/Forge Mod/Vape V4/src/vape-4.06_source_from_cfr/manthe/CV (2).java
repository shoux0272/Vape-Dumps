/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.pc;
import manthe.we;
import manthe.xM;
import manthe.zu;

class CV
implements pc {
    final we b;
    final xM a;

    CV(xM xM2, we we2) {
        this.a = xM2;
        this.b = we2;
    }

    @Override
    public void b() {
        if (xM.a(this.a) != null) {
            xM.a(this.a).b();
        }
        zu.a(this.b.getClass());
    }
}

