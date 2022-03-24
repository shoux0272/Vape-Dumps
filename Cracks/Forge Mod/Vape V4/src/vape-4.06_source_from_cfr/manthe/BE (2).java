/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.util.Comparator;
import manthe.cB;
import manthe.fG;
import manthe.zP;

class BE
implements Comparator<fG> {
    final zP a;

    BE(zP zP2) {
        this.a = zP2;
    }

    public int a(fG fG2, fG fG3) {
        return Double.compare(cB.c(fG2), cB.c(fG3));
    }
}

