/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.util.Comparator;
import manthe.ds;
import manthe.eJ;
import manthe.ex;
import manthe.uq;
import manthe.z3;

class np
implements Comparator {
    final z3 a;

    private np(z3 z32) {
        this.a = z32;
    }

    public int compare(Object object, Object object2) {
        eJ eJ2 = ds.k();
        return Float.compare(eJ2.a((ex)object), eJ2.a((ex)object2));
    }

    np(z3 z32, uq uq2) {
        this(z32);
    }
}

