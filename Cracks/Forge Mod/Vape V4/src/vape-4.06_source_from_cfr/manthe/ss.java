/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.dh;
import manthe.l1;
import manthe.si;

public class ss
extends si {
    public ss() {
        super("net/minecraftforge/client/event/RenderLivingEvent$Post", 0);
    }

    @Override
    public void a(Object object) {
        dh dh2 = new dh(object);
        new l1(dh2).fire();
    }
}

