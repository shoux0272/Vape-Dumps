/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.dM;
import manthe.lf;
import manthe.si;

public class sL
extends si {
    public sL() {
        super("net/minecraftforge/client/event/EntityViewRenderEvent$RenderFogEvent", 0);
    }

    @Override
    public void a(Object object) {
        dM dM2 = new dM(object);
        new lf(dM2, dM2.h(), dM2.g(), dM2.j(), dM2.i(), dM2.k(), dM2.l()).fire();
    }
}

