/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.of;

class sv
extends Thread {
    final of a;

    sv(of of2) {
        this.a = of2;
    }

    @Override
    public void run() {
        this.a.b.z().a("Saved");
        try {
            Thread.sleep(1000L);
        }
        catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
        }
        this.a.b.z().a("Save states");
    }
}

