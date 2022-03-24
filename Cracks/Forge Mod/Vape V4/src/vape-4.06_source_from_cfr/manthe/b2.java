/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.on;
import manthe.z1;

class b2
extends Thread {
    final z1 a;

    b2(z1 z12) {
        this.a = z12;
    }

    @Override
    public void run() {
        while (!on.p.x()) {
            try {
                Thread.sleep(5L);
                if (!this.a.N() || !z1.h(this.a).u().booleanValue()) continue;
                z1.k(this.a).e();
            }
            catch (Exception exception) {}
        }
    }
}

