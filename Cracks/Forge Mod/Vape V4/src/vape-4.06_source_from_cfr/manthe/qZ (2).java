/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.Ak;
import manthe.on;
import manthe.pc;
import manthe.wa;

class qZ
implements pc {
    final Ak a;
    final wa b;

    qZ(wa wa2, Ak ak) {
        this.b = wa2;
        this.a = ak;
    }

    @Override
    public void b() {
        if (!this.a.k() && !this.a.o()) {
            return;
        }
        this.a.b(!this.a.k());
        on.p.p();
        on.p.l().a(this.a);
        on.p.l().b(this.a);
    }
}

