/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.util.Collections;
import manthe.ok;
import manthe.uU;

class ui
extends Thread {
    final ok a;

    private ui(ok ok2) {
        this.a = ok2;
    }

    @Override
    public void run() {
        ok.b(this.a).a(Collections.emptyList());
        this.a.a("Unbound");
        ok.a(this.a).interrupt();
        if (ok.c(this.a) != null) {
            try {
                Thread.sleep(1000L);
            }
            catch (InterruptedException interruptedException) {
                return;
            }
        }
        this.a.b();
    }

    ui(ok ok2, uU uU2) {
        this(ok2);
    }
}

