/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.dS;
import manthe.kn;
import manthe.si;

public class sA
extends si {
    public sA() {
        super("net/minecraftforge/event/entity/living/LivingEvent$LivingUpdateEvent", 0);
    }

    @Override
    public void a(Object object) {
        dS dS2 = new dS(object);
        new kn(dS2.h()).fire();
    }
}

