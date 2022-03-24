/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.util.Comparator;
import manthe.eJ;
import manthe.ex;
import manthe.zR;

class BC
implements Comparator<ex> {
    final eJ b;
    final zR a;

    BC(zR zR2, eJ eJ2) {
        this.a = zR2;
        this.b = eJ2;
    }

    public int a(ex ex2, ex ex3) {
        return Double.compare(this.b.a(ex3), this.b.a(ex2));
    }
}

