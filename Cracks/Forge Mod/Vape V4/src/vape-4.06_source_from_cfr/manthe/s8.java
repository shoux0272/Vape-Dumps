/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.dW;
import manthe.ku;
import manthe.si;

public class s8
extends si {
    public s8() {
        super("net/minecraftforge/client/event/RenderHandEvent", 0);
    }

    @Override
    public void a(Object object) {
        dW dW2 = new dW(object);
        new ku(dW2.g()).fire();
    }
}

