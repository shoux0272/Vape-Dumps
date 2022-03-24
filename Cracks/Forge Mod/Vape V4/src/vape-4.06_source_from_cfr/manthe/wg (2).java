/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.util.Comparator;
import manthe.ds;
import manthe.eJ;
import manthe.ex;
import manthe.pf;
import manthe.uq;
import manthe.z3;

class wg
implements Comparator {
    final z3 a;

    private wg(z3 z32) {
        this.a = z32;
    }

    public int compare(Object object, Object object2) {
        eJ eJ2 = ds.k();
        return Integer.compare(pf.b(eJ2, (ex)object), pf.b(eJ2, (ex)object2));
    }

    wg(z3 z32, uq uq2) {
        this(z32);
    }
}

