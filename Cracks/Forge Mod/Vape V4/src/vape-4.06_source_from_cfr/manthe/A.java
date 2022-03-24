/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.rl;
import manthe.so;

class A
extends Thread {
    final rl d;
    final String e;
    final long b;
    final String a;
    final so c;

    A(so so2, rl rl2, String string, long l, String string2) {
        this.c = so2;
        this.d = rl2;
        this.e = string;
        this.b = l;
        this.a = string2;
    }

    @Override
    public void run() {
        this.d.a(this.e);
        try {
            Thread.sleep(this.b);
        }
        catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
        }
        this.d.a(this.a);
    }
}

