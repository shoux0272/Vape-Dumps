/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.dZ;
import manthe.lS;
import manthe.si;

public class sm
extends si {
    public sm() {
        super("net/minecraftforge/client/event/RenderPlayerEvent$Post", 0);
    }

    @Override
    public void a(Object object) {
        dZ dZ2 = new dZ(object);
        new lS(dZ2).fire();
    }
}

