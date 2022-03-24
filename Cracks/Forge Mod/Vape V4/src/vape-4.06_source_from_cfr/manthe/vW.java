/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.pc;
import manthe.wT;
import manthe.wY;
import manthe.xL;
import manthe.zu;

class vW
implements pc {
    final xL a;

    vW(xL xL2) {
        this.a = xL2;
    }

    @Override
    public void b() {
        wY wY2 = zu.b(wY.class);
        wT wT2 = zu.b(wT.class);
        if (wY2 == null || wT2 == null) {
            return;
        }
        wY2.a(!wY2.b());
        if (wY2.b()) {
            wY2.ac();
            wY2.a(1);
        }
        wY2.M();
    }
}

