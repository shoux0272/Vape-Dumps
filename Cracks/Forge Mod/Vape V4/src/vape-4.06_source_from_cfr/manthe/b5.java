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
import manthe.fG;
import manthe.me;
import manthe.zO;

class b5
implements Comparator<ex> {
    final zO a;

    private b5(zO zO2) {
        this.a = zO2;
    }

    private double a(ex ex2) {
        double d10 = 0.0;
        for (Object object : new eC(ex2.a()).aU().g()) {
            fG fG2 = new fG(object);
            d10 += aN.a(fG2);
        }
        ej ej2 = new ej(ex2.a());
        float f10 = ej2.aD();
        d10 += (double)((Float.isNaN(f10) ? 0.0f : f10) / 10.0f);
        if (ej2.aN() > 4) {
            d10 += (double)ej2.aN();
        }
        return d10;
    }

    public int a(ex ex2, ex ex3) {
        if (ex2.a(A5.cc) && ex3.a(A5.cc)) {
            return Double.compare(this.a(ex2), this.a(ex3));
        }
        eJ eJ2 = ds.k();
        return Float.compare(eJ2.a(ex2), eJ2.a(ex3));
    }

    b5(zO zO2, me me2) {
        this(zO2);
    }
}

