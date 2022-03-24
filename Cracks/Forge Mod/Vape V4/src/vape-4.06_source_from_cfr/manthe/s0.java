/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.d9;
import manthe.kx;
import manthe.si;

public class s0
extends si {
    public s0() {
        super("net/minecraftforge/client/event/RenderWorldLastEvent", 0);
    }

    @Override
    public void a(Object object) {
        d9 d92 = new d9(object);
        new kx(d92.g()).fire();
    }
}

