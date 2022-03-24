/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.util.Comparator;
import manthe.ds;
import manthe.eJ;
import manthe.ex;
import manthe.pA;
import manthe.pf;
import manthe.zS;

class vH
implements Comparator {
    final zS a;

    private vH(zS zS2) {
        this.a = zS2;
    }

    public int compare(Object object, Object object2) {
        eJ eJ2 = ds.k();
        return Integer.compare(pf.b(eJ2, (ex)object), pf.b(eJ2, (ex)object2));
    }

    vH(zS zS2, pA pA2) {
        this(zS2);
    }
}

