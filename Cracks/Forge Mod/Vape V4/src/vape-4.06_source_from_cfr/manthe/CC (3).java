/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.Aj;

class CC
extends Thread {
    final Aj a;

    CC(Aj aj2) {
        this.a = aj2;
    }

    @Override
    public void run() {
        this.a.a.z().a("Loaded");
        try {
            Thread.sleep(1000L);
        }
        catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
        }
        this.a.a.z().a("Load states");
    }
}

