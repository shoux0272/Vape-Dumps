/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.rd;
import manthe.rl;

class q3
extends Thread {
    final rl c;
    final String a;
    final long b;
    final String d;
    final rd e;

    q3(rd rd2, rl rl2, String string, long l, String string2) {
        this.e = rd2;
        this.c = rl2;
        this.a = string;
        this.b = l;
        this.d = string2;
    }

    @Override
    public void run() {
        this.c.a(this.a);
        try {
            Thread.sleep(this.b);
        }
        catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
        }
        this.c.a(this.d);
    }
}

