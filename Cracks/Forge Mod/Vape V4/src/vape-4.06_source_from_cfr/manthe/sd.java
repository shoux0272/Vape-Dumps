/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.cv;
import manthe.lZ;
import manthe.si;

public class sd
extends si {
    public sd() {
        super("net/minecraftforge/client/event/MouseEvent", 0);
    }

    @Override
    public void a(Object object) {
        new lZ(new cv(object)).fire();
    }
}

