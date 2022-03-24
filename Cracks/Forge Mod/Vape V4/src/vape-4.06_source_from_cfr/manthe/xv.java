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
import manthe.ej;
import manthe.ex;
import manthe.fE;
import manthe.fX;
import manthe.me;
import manthe.zO;

class xv
implements Comparator<ex> {
    final zO a;

    private xv(zO zO2) {
        this.a = zO2;
    }

    private float a(ex ex2) {
        float f10 = 0.0f;
        eC eC2 = new eC(ex2.a());
        if (this.a.u.u().booleanValue()) {
            float f11 = new ej(ex2.a()).aD();
            f10 += (Float.isNaN(f11) ? 0.0f : f11) / 5.0f;
        }
        if (eC2.aG().d()) {
            fE fE2;
            f10 += aN.b(eC2.aG());
            if (eC2.a(fX.o()) && (fE2 = eC2.b(fX.o())).f() > 0) {
                f10 = (float)((double)f10 * (1.375 * (double)fE2.h()));
            }
        }
        return f10;
    }

    public int a(ex ex2, ex ex3) {
        if (ex2.a(A5.cc) && ex3.a(A5.cc)) {
            return Float.compare(this.a(ex2), this.a(ex3));
        }
        eJ eJ2 = ds.k();
        return Float.compare(eJ2.a(ex2), eJ2.a(ex3));
    }

    xv(zO zO2, me me2) {
        this(zO2);
    }
}

