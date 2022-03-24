/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.util.Comparator;
import manthe.cB;
import manthe.fG;
import manthe.zP;

class vj
implements Comparator<fG> {
    final zP a;

    vj(zP zP2) {
        this.a = zP2;
    }

    public int a(fG fG2, fG fG3) {
        return Double.compare(cB.c(fG2), cB.c(fG3));
    }
}

