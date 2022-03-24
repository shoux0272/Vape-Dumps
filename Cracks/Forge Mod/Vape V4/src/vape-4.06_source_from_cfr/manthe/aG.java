/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.pc;
import manthe.w9;
import manthe.ya;

class aG
implements pc {
    final ya a;
    final w9 b;

    aG(w9 w92, ya ya2) {
        this.b = w92;
        this.a = ya2;
    }

    @Override
    public void b() {
        if (w9.b(this.b) != null) {
            this.a.a(w9.b(this.b).r());
        }
        w9.f(this.b).J();
    }
}

