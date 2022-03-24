/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.dn;
import manthe.ll;
import manthe.si;

public class sE
extends si {
    public sE() {
        super("net/minecraftforge/client/event/RenderPlayerEvent$SetArmorModel", 0);
    }

    @Override
    public void a(Object object) {
        dn dn2 = new dn(object);
        new ll(dn2, dn2.g()).fire();
    }
}

