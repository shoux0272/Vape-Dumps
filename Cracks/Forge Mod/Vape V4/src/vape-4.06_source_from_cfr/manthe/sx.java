/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Keyboard
 */
package manthe;

import manthe.A5;
import manthe.V;
import manthe.kZ;
import manthe.si;
import org.lwjgl.input.Keyboard;

public class sx
extends si {
    public sx() {
        super(A5.cM, V.c() == 13 ? 3 : 0);
    }

    @Override
    public void a(Object object) {
        if (Keyboard.isRepeatEvent()) {
            return;
        }
        kZ kZ2 = new kZ(Keyboard.getEventKey(), Keyboard.getEventKeyState());
        kZ2.fire();
    }
}

