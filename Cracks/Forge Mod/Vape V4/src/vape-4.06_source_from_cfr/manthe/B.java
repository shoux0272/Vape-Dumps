/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.ds;
import manthe.on;
import manthe.yq;

class B
extends Thread {
    final yq a;

    B(yq yq2) {
        this.a = yq2;
    }

    @Override
    public void run() {
        while (!on.p.x()) {
            try {
                Thread.sleep(1L);
                if (yq.a(this.a) == null || ds.k().e()) continue;
                yq.a(this.a).b();
                if (!yq.a(this.a).e()) continue;
                yq.a(this.a, null);
            }
            catch (Exception exception) {}
        }
        yq.u = null;
    }
}

