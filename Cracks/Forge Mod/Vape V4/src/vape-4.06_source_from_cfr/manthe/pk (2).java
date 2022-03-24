/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.on;
import manthe.zf;

class pk
extends Thread {
    final zf a;

    pk(zf zf2) {
        this.a = zf2;
    }

    @Override
    public void run() {
        while (!on.p.x()) {
            try {
                Thread.sleep(1L);
                if (!this.a.N()) continue;
                zf.a(this.a);
            }
            catch (Exception exception) {}
        }
    }
}

