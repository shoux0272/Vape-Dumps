/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.util.function.Consumer;
import manthe.p1;
import manthe.r5;

class cc
implements Consumer<p1> {
    final double b;
    final r5 a;

    cc(r5 r52, double d10) {
        this.a = r52;
        this.b = d10;
    }

    public void a(p1 p12) {
        p12.c(this.b);
    }
}

