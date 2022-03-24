/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Keyboard
 */
package manthe;

import manthe.C8;
import manthe.R;
import manthe.p1;
import manthe.rV;
import manthe.rl;
import manthe.ya;
import org.lwjgl.input.Keyboard;

class us
implements R {
    final ya a;
    final rl b;
    final rV c;

    us(rV rV2, ya ya2, rl rl2) {
        this.c = rV2;
        this.a = ya2;
        this.b = rl2;
    }

    public void a(p1 p12) {
        if (this.a.n() < 0) {
            this.b.a("  Bound to: " + C8.a(this.a.n()));
        } else {
            this.b.a("  Bound to: " + Keyboard.getKeyName((int)this.a.n()));
        }
    }
}

