/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Keyboard
 */
package manthe;

import manthe.s7;
import manthe.vK;
import manthe.y5;
import org.lwjgl.input.Keyboard;

class bD
implements vK {
    final y5 c;
    final vK b;
    final s7 a;

    bD(s7 s72, y5 y52, vK vK2) {
        this.a = s72;
        this.c = y52;
        this.b = vK2;
    }

    @Override
    public void a(int n6, int n10, int n11) {
        if (this.c.p() && n11 == 0) {
            if (this.c.c().isEmpty()) {
                s7.a(this.a, "Must be bound", 1500L);
            } else {
                s7.a(this.a, "Must use bind", 1500L);
            }
        }
        if (Keyboard.isKeyDown((int)42)) {
            s7.c(this.a).run();
        } else if (this.a.Y().G()) {
            this.b.a(n6, n10, n11);
        }
    }
}

