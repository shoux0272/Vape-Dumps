/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.util.Comparator;
import manthe.eC;
import manthe.eJ;
import manthe.rj;

class m8
implements Comparator<eC> {
    final eJ b;
    final rj a;

    m8(rj rj2, eJ eJ2) {
        this.a = rj2;
        this.b = eJ2;
    }

    public int a(eC eC2, eC eC3) {
        return (int)eC2.a(this.b) - (int)eC3.a(this.b);
    }
}

