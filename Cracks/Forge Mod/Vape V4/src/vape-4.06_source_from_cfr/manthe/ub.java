/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.util.Comparator;
import manthe.A5;
import manthe.aN;
import manthe.ds;
import manthe.eC;
import manthe.eJ;
import manthe.ex;
import manthe.fG;
import manthe.uq;
import manthe.z3;

class ub
implements Comparator {
    final z3 a;

    private ub(z3 z32) {
        this.a = z32;
    }

    private double a(ex ex2) {
        double d10 = 0.0;
        for (Object object : new eC(ex2.a()).aU().g()) {
            fG fG2 = new fG(object);
            d10 += aN.a(fG2);
        }
        return d10;
    }

    public int compare(Object object, Object object2) {
        ex ex2 = (ex)object;
        ex ex3 = (ex)object2;
        if (ex2.a(A5.cc) && ex3.a(A5.cc)) {
            return Double.compare(this.a(ex2), this.a(ex3));
        }
        eJ eJ2 = ds.k();
        return Float.compare(eJ2.a(ex2), eJ2.a(ex3));
    }

    ub(z3 z32, uq uq2) {
        this(z32);
    }
}

