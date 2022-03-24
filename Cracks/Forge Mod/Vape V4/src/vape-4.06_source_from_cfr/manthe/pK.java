/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.on;
import manthe.y5;

public class pK
implements Runnable {
    private final y5 a;
    private final long b;
    private final boolean c;
    private boolean d = true;

    public pK(y5 y52, long l, boolean bl) {
        this.a = y52;
        this.b = l;
        this.c = bl;
    }

    @Override
    public void run() {
        do {
            try {
                Thread.sleep(this.b);
                if (!this.a.N()) continue;
                this.a.q();
            }
            catch (Exception exception) {
                // empty catch block
            }
        } while (!on.p.x() && this.c && this.d);
    }

    public boolean a() {
        return this.d;
    }

    public void a(boolean bl) {
        this.d = bl;
    }
}

