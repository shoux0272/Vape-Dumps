/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.pc;
import manthe.wQ;
import manthe.wR;

class uC
implements pc {
    final wQ a;
    final wR b;

    uC(wR wR2, wQ wQ2) {
        this.b = wR2;
        this.a = wQ2;
    }

    @Override
    public void b() {
        this.a.f(false);
    }
}

