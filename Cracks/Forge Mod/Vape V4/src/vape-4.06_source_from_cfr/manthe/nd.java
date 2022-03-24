/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.util.Comparator;
import manthe.ds;
import manthe.eJ;
import manthe.ex;
import manthe.pA;
import manthe.zS;

class nd
implements Comparator {
    final zS a;

    private nd(zS zS2) {
        this.a = zS2;
    }

    public int compare(Object object, Object object2) {
        eJ eJ2 = ds.k();
        return Float.compare(eJ2.a((ex)object), eJ2.a((ex)object2));
    }

    nd(zS zS2, pA pA2) {
        this(zS2);
    }
}

