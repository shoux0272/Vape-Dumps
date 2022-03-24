/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.util.Comparator;
import manthe.pf;

class qk
implements Comparator {
    private final int a;

    public qk(int n6) {
        this.a = n6;
    }

    public int compare(Object object, Object object2) {
        int n6 = (Integer)object;
        int n10 = (Integer)object2;
        int n11 = this.a % 9;
        int n12 = (this.a - n11) / 9;
        int n13 = n6 % 9;
        int n14 = (n6 - n13) / 9;
        double d10 = pf.a(n13, n14, n11, n12);
        int n15 = n10 % 9;
        int n16 = (n10 - n15) / 9;
        double d11 = pf.a(n15, n16, n11, n12) + 1.0;
        return Double.compare(d10, d11);
    }
}

