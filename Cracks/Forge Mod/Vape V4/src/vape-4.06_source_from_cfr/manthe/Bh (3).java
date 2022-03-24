/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.util.Comparator;
import manthe.we;
import manthe.wp;

class Bh
implements Comparator<we> {
    final wp a;

    Bh(wp wp2) {
        this.a = wp2;
    }

    public int a(we we2, we we3) {
        if (we2.f() == we3.f()) {
            return 0;
        }
        return we2.f() > we3.f() ? -1 : 1;
    }
}

