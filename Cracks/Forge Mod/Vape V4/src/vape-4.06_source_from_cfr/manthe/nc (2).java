/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.util.Comparator;
import manthe.eJ;
import manthe.ej;
import manthe.z0;

class nc
implements Comparator<ej> {
    final eJ a;
    final z0 b;

    nc(z0 z02, eJ eJ2) {
        this.b = z02;
        this.a = eJ2;
    }

    public int a(ej ej2, ej ej3) {
        double d10;
        double d11 = ej2.a(this.a);
        if (d11 == (d10 = (double)ej3.a(this.a))) {
            return 0;
        }
        return d11 > d10 ? 1 : -1;
    }
}

