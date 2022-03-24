/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Keyboard
 */
package manthe;

import manthe.Ak;
import manthe.ok;
import manthe.on;
import manthe.so;
import manthe.vK;
import org.lwjgl.input.Keyboard;

class pF
implements vK {
    final ok b;
    final Ak c;
    final so a;

    pF(so so2, ok ok2, Ak ak) {
        this.a = so2;
        this.b = ok2;
        this.c = ak;
    }

    @Override
    public void a(int n6, int n10, int n11) {
        if (n11 == 1) {
            if (!this.b.c()) {
                on.a("loaded modules");
                this.c.x();
                so.a(this.a, so.c(this.a).z(), "Loaded enabled", this.c.r(), 1000L);
            }
        } else if (n11 == 0) {
            if (Keyboard.isKeyDown((int)42)) {
                this.b.run();
            } else {
                on.a("Changed profile");
                on.p.l().d(this.c);
            }
        }
    }
}

