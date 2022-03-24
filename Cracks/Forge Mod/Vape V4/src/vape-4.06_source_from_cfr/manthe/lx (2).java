/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.kZ;
import manthe.ki;
import manthe.kl;

public class lx
extends kl {
    private final int e;
    private final boolean d;

    public lx(int n6, boolean bl) {
        this.e = n6;
        this.d = bl;
    }

    @Override
    public boolean fire() {
        kl kl2 = this.e >= 0 ? new kZ(this.e, this.d) : new ki(this.e + 100, this.d);
        return ((kl)kl2).fire();
    }
}

