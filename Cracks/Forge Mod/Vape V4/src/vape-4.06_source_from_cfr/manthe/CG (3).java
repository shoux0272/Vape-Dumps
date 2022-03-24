/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.BR;

class CG
extends Thread {
    final BR a;

    CG(BR bR) {
        this.a = bR;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000L);
        }
        catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
        }
        this.a.a.b("Copy profile UUID");
    }
}

