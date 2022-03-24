/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.util.Comparator;
import manthe.ds;
import manthe.eJ;
import manthe.ex;
import manthe.vX;
import manthe.ys;

class vF
implements Comparator {
    final ys a;

    private vF(ys ys2) {
        this.a = ys2;
    }

    public int compare(Object object, Object object2) {
        eJ eJ2 = ds.k();
        return Float.compare(eJ2.a((ex)object), eJ2.a((ex)object2));
    }

    vF(ys ys2, vX vX2) {
        this(ys2);
    }
}

