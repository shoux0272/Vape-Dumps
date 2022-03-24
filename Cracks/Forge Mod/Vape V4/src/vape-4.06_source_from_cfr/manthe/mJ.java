/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.s7;

class mJ
extends Thread {
    final String c;
    final long a;
    final s7 b;

    mJ(s7 s72, String string, long l) {
        this.b = s72;
        this.c = string;
        this.a = l;
    }

    @Override
    public void run() {
        this.b.W().z().a(this.c);
        try {
            Thread.sleep(this.a);
        }
        catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
        }
        this.b.W().z().a(s7.g(this.b).H());
    }
}

