/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.gQ;
import manthe.kl;
import manthe.on;
import manthe.y5;

public class kK
extends kl {
    private gQ d;

    public kK(gQ gQ2) {
        this.d = gQ2;
    }

    @Override
    public boolean fire() {
        for (y5 y52 : on.p.H().e()) {
            if (!y52.N()) continue;
            y52.a(this);
        }
        return this.d();
    }

    public gQ getMessage() {
        return this.d;
    }

    public void setMessage(gQ gQ2) {
        this.d = gQ2;
    }
}

