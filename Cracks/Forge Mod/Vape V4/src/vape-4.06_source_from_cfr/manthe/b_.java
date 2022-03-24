/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.util.Comparator;
import manthe.mq;
import manthe.on;
import manthe.y5;
import manthe.yM;

class b_
implements Comparator<y5> {
    private b_() {
    }

    public int a(y5 y52, y5 y53) {
        mq mq2 = on.p.j();
        return Double.compare(mq2.b(y53.H() + y53.w()), mq2.b(y52.H() + y52.w()));
    }

    b_(yM yM2) {
        this();
    }
}

