/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.util.Comparator;
import manthe.mq;
import manthe.xE;
import manthe.y5;

class vc
implements Comparator<y5> {
    final mq b;
    final xE a;

    vc(xE xE2, mq mq2) {
        this.a = xE2;
        this.b = mq2;
    }

    public int a(y5 y52, y5 y53) {
        return Double.compare(this.b.b(y53.H() + y53.w()), this.b.b(y52.H() + y52.w()));
    }
}

