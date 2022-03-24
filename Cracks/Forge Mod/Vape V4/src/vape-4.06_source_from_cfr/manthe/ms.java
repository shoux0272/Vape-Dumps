/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.ds;
import manthe.zw;

class ms
extends Thread {
    final zw a;

    ms(zw zw2) {
        this.a = zw2;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(100L);
        }
        catch (InterruptedException interruptedException) {
            // empty catch block
        }
        ds.O().a(1.0f);
    }
}

