/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.util.Comparator;
import manthe.ej;
import manthe.ex;
import manthe.uq;
import manthe.z3;

class BZ
implements Comparator<ex> {
    final z3 a;

    private BZ(z3 z32) {
        this.a = z32;
    }

    private float a(ex ex2) {
        ej ej2 = new ej(ex2.a());
        return ej2.aD();
    }

    public int a(ex ex2, ex ex3) {
        return Float.compare(this.a(ex2), this.a(ex3));
    }

    BZ(z3 z32, uq uq2) {
        this(z32);
    }
}

