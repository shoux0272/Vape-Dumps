/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import a.a;
import manthe.Ak;
import manthe.pc;
import manthe.wa;

class mI
implements pc {
    final Ak b;
    final wa a;

    mI(wa wa2, Ak ak) {
        this.a = wa2;
        this.b = ak;
    }

    @Override
    public void b() {
        a.a.cpy(this.b.l().toString());
    }
}

