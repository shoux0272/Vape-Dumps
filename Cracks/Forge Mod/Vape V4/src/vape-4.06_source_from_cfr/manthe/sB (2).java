/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.d4;
import manthe.ln;
import manthe.si;

public class sB
extends si {
    public sB() {
        super("net/minecraftforge/client/event/RenderLivingEvent$Specials$Pre", 0);
    }

    @Override
    public void a(Object object) {
        d4 d42 = new d4(object);
        new ln(d42).fire();
    }
}

