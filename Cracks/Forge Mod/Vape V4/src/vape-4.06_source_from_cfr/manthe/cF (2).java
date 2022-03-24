/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.util.Comparator;
import java.util.List;
import manthe.fE;
import manthe.fG;
import manthe.fQ;
import manthe.fh;
import manthe.zY;

class cF
implements Comparator<fQ> {
    final zY a;

    cF(zY zY2) {
        this.a = zY2;
    }

    public int a(fQ fQ2, fQ fQ3) {
        fG fG2 = fQ2.f();
        fG fG3 = fQ3.f();
        List<fE> list = new fh(fG2.k()).f(fG2);
        List<fE> list2 = new fh(fG3.k()).f(fG3);
        int n6 = 0;
        for (fE fE2 : list) {
            int n10 = fE2.g();
            for (fE fE3 : list2) {
                int n11 = fE3.g();
                if (n10 != n11) continue;
                n6 += Integer.compare(fE2.h(), fE3.h());
            }
        }
        return n6;
    }
}

