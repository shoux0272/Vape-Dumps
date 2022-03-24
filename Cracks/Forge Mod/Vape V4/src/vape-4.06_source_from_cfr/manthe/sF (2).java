/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.dN;
import manthe.lK;
import manthe.si;

public class sF
extends si {
    public sF() {
        super("net/minecraftforge/client/event/RenderPlayerEvent$Specials$Pre", 0);
    }

    @Override
    public void a(Object object) {
        dN dN2 = new dN(object);
        new lK(dN2, dN2.h(), dN2.k()).fire();
    }
}

