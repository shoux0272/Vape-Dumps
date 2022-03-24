/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.ds;
import manthe.dt;
import manthe.fG;
import manthe.ka;
import manthe.on;
import manthe.si;
import manthe.y5;

public class s2
extends si {
    public s2() {
        super("net/minecraftforge/event/entity/player/PlayerInteractEvent", 0);
    }

    @Override
    public void a(Object object) {
        dt dt2 = new dt(object);
        if (dt2.m() == 0 && dt2.i() == 0 && dt2.k() == 0 && dt2.j() == -1 && dt2.n().equals("RIGHT_CLICK_AIR")) {
            fG fG2 = ds.k().aG();
            ka ka2 = new ka(fG2);
            for (y5 y52 : on.p.H().e()) {
                if (!y52.N()) continue;
                y52.a(ka2);
            }
        }
    }
}

