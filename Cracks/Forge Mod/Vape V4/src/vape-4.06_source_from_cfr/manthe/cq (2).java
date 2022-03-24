/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.on;
import manthe.z5;

class cq
extends Thread {
    final z5 a;

    cq(z5 z52) {
        this.a = z52;
    }

    @Override
    public void run() {
        while (!on.p.x()) {
            try {
                Thread.sleep(5L);
                if (!this.a.N()) continue;
                this.a.W();
            }
            catch (Exception exception) {}
        }
    }
}

