/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.d1;
import manthe.ex;
import manthe.k_;
import manthe.on;
import manthe.si;
import manthe.y5;

public class sC
extends si {
    public sC() {
        super("net/minecraftforge/event/entity/PlaySoundAtEntityEvent", 0);
    }

    @Override
    public void a(Object object) {
        d1 d12 = new d1(object);
        k_ k_2 = new k_(new ex(d12.g()), d12.h());
        for (y5 y52 : on.p.H().e()) {
            if (!y52.N()) continue;
            y52.a(k_2);
        }
    }
}

