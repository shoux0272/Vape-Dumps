/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.util.function.Consumer;
import manthe.p1;
import manthe.rq;

class Cx
implements Consumer<p1> {
    final double b;
    final rq a;

    Cx(rq rq2, double d10) {
        this.a = rq2;
        this.b = d10;
    }

    public void a(p1 p12) {
        p12.c(this.b);
    }
}

