/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.util.function.Consumer;
import manthe.p1;
import manthe.rx;

class m3
implements Consumer<p1> {
    final double a;
    final rx b;

    m3(rx rx2, double d10) {
        this.b = rx2;
        this.a = d10;
    }

    public void a(p1 p12) {
        if (p12.equals(this.b.aj())) {
            return;
        }
        p12.c(this.a - 2.0);
    }
}

