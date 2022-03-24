/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.dg;
import manthe.lz;
import manthe.si;

public class su
extends si {
    public su() {
        super("net/minecraftforge/client/event/EntityViewRenderEvent$FogDensity", 0);
    }

    @Override
    public void a(Object object) {
        dg dg2 = new dg(object);
        lz lz2 = new lz(dg2, dg2.h(), dg2.g(), dg2.j(), dg2.i(), dg2.k());
        lz2.fire();
        dg2.a(lz2.getDensity());
    }
}

