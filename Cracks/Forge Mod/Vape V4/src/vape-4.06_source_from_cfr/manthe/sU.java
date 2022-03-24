/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.cD;
import manthe.lG;
import manthe.si;

public class sU
extends si {
    public sU() {
        super("net/minecraftforge/client/event/EntityViewRenderEvent$FogColors", 0);
    }

    @Override
    public void a(Object object) {
        cD cD2 = new cD(object);
        lG lG2 = new lG(cD2, cD2.h(), cD2.g(), cD2.j(), cD2.i(), cD2.m(), cD2.l(), cD2.k());
        lG2.fire();
        cD2.a(lG2.getRed());
        cD2.b(lG2.getGreen());
        cD2.c(lG2.getBlue());
    }
}

