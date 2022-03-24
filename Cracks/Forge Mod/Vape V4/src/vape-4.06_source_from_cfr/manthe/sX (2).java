/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.dZ;
import manthe.lO;
import manthe.si;

public class sX
extends si {
    public sX() {
        super("net/minecraftforge/client/event/RenderPlayerEvent$Pre", 0);
    }

    @Override
    public void a(Object object) {
        dZ dZ2 = new dZ(object);
        lO lO2 = new lO(dZ2);
        if (lO2.fire()) {
            lO2.getForgeEvent().a(true);
        }
    }
}

