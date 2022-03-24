/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.da;
import manthe.kN;
import manthe.si;

public class sj
extends si {
    public sj() {
        super("net/minecraftforge/event/entity/player/PlayerEvent$NameFormat", 0);
    }

    @Override
    public void a(Object object) {
        da da2 = new da(object);
        kN kN2 = new kN(da2.g(), da2.h());
        kN2.fire();
        da2.a(kN2.getDisplayName());
    }
}

