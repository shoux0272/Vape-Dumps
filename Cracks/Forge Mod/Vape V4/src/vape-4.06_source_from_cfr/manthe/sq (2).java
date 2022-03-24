/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.dI;
import manthe.dX;
import manthe.lw;
import manthe.si;

public class sq
extends si {
    public sq() {
        super("net/minecraftforge/client/event/GuiOpenEvent", 0);
    }

    @Override
    public void a(Object object) {
        dI dI2 = new dI(object);
        lw lw2 = new lw(dI2, dI2.g());
        lw2.fire();
        dX dX2 = lw2.getGui();
        dI2.a(dX2);
    }
}

