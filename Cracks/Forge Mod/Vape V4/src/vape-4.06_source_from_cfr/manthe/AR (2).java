/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.util.Comparator;
import manthe.eC;
import manthe.eJ;
import manthe.xs;

class AR
implements Comparator<eC> {
    final eJ b;
    final xs a;

    AR(xs xs2, eJ eJ2) {
        this.a = xs2;
        this.b = eJ2;
    }

    public int a(eC eC2, eC eC3) {
        return (int)eC2.a(this.b) - (int)eC3.a(this.b);
    }
}

