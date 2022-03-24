/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.AO;
import manthe.on;

public class yN
implements Runnable {
    private final AO b = new AO();
    private boolean a;
    private boolean c;

    @Override
    public void run() {
        while (!this.b.a(3000L)) {
            try {
                Thread.sleep(50L);
            }
            catch (InterruptedException interruptedException) {
                interruptedException.printStackTrace();
            }
            if (!this.a) continue;
            this.b.d();
            this.a = false;
        }
        this.c = true;
        on.p.K();
    }

    public void a(boolean bl) {
        this.a = bl;
    }

    public boolean a() {
        return this.c;
    }
}

