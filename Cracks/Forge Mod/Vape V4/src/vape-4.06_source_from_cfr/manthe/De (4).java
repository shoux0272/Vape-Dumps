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
import manthe.fE;
import manthe.fX;
import manthe.uq;
import manthe.z3;

class De
implements Comparator {
    final z3 a;

    private De(z3 z32) {
        this.a = z32;
    }

    private float a(ex ex2) {
        float f10 = 0.0f;
        eC eC2 = new eC(ex2.a());
        if (eC2.aG().d()) {
            fE fE2;
            f10 += aN.b(eC2.aG());
            if (eC2.a(fX.o()) && (fE2 = eC2.b(fX.o())).f() > 0) {
                f10 = (float)((double)f10 * (1.375 * (double)fE2.h()));
            }
        }
        return f10;
    }

    public int compare(Object object, Object object2) {
        ex ex2 = (ex)object;
        ex ex3 = (ex)object2;
        if (ex2.a(A5.cc) && ex3.a(A5.cc)) {
            return Float.compare(this.a((ex)object), this.a((ex)object2));
        }
        eJ eJ2 = ds.k();
        return Float.compare(eJ2.a(ex2), eJ2.a(ex3));
    }

    De(z3 z32, uq uq2) {
        this(z32);
    }
}

