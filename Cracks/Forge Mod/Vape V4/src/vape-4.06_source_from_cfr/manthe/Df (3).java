/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.AV;
import manthe.ns;
import manthe.pc;
import manthe.xY;

class Df
implements pc {
    final AV a;
    final xY b;

    Df(xY xY2, AV aV) {
        this.b = xY2;
        this.a = aV;
    }

    @Override
    public void b() {
        ns.a(this.a.l().toString());
    }
}

