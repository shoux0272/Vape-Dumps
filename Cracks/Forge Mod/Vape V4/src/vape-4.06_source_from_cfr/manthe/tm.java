/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.util.Comparator;
import manthe.ds;
import manthe.eJ;
import manthe.ex;
import manthe.pf;
import manthe.vX;
import manthe.ys;

class tm
implements Comparator {
    final ys a;

    private tm(ys ys2) {
        this.a = ys2;
    }

    public int compare(Object object, Object object2) {
        eJ eJ2 = ds.k();
        return Integer.compare(pf.b(eJ2, (ex)object), pf.b(eJ2, (ex)object2));
    }

    tm(ys ys2, vX vX2) {
        this(ys2);
    }
}

