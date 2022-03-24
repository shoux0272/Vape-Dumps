/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.util.Comparator;
import manthe.pH;
import manthe.r1;

class Aq
implements Comparator<r1> {
    final pH a;

    Aq(pH pH2) {
        this.a = pH2;
    }

    public int a(r1 r12, r1 r13) {
        if (r12.b() == r13.b()) {
            return 0;
        }
        return r12.b() > r13.b() ? -1 : 1;
    }
}

