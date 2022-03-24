/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.ds;
import manthe.fG;
import manthe.ka;
import manthe.kl;
import manthe.on;
import manthe.y5;

public class lB
extends kl {
    @Override
    public boolean fire() {
        fG fG2 = ds.k().aG();
        ka ka2 = new ka(fG2);
        for (y5 y52 : on.p.H().e()) {
            if (!y52.N()) continue;
            y52.a(ka2);
        }
        return super.fire();
    }
}

