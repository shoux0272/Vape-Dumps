/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.util.Comparator;
import manthe.A5;
import manthe.ds;
import manthe.eJ;
import manthe.ej;
import manthe.ex;
import manthe.me;
import manthe.zO;

class CM
implements Comparator<ex> {
    final zO a;

    private CM(zO zO2) {
        this.a = zO2;
    }

    private double a(ex ex2) {
        eJ eJ2 = ds.k();
        double d10 = eJ2.a(ex2);
        if (this.a.u.u().booleanValue() && ex2.a(A5.cF)) {
            ej ej2 = new ej(ex2.a());
            float f10 = ej2.aD();
            d10 += (double)((Float.isNaN(f10) ? 0.0f : f10) / 10.0f);
            if (ej2.aN() > 4) {
                d10 += (double)ej2.aN();
            }
        }
        return d10;
    }

    public int a(ex ex2, ex ex3) {
        return Double.compare(this.a(ex2), this.a(ex3));
    }

    CM(zO zO2, me me2) {
        this(zO2);
    }
}

