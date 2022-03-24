/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.dh;
import manthe.lH;
import manthe.si;

public class sR
extends si {
    public sR() {
        super("net/minecraftforge/client/event/RenderLivingEvent$Pre", 0);
    }

    @Override
    public void a(Object object) {
        dh dh2 = new dh(object);
        new lH(dh2).fire();
    }
}

