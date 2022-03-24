/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.util.Comparator;
import manthe.u_;

public class yw
implements Comparator<u_> {
    int a;

    public yw(int n6) {
        this.a = n6;
    }

    public int a(u_ u_2, u_ u_3) {
        int n6 = this.a;
        int n10 = u_2.a();
        int n11 = u_3.a();
        int n12 = n10 > n6 ? n10 - n6 : n6 - n10;
        int n13 = n11 > n6 ? n11 - n6 : n6 - n11;
        return n12 < n13 ? -1 : 0;
    }
}

