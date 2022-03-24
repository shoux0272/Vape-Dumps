/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.util.Comparator;
import manthe.cB;
import manthe.fG;
import manthe.zP;

class AW
implements Comparator<fG> {
    final zP a;

    AW(zP zP2) {
        this.a = zP2;
    }

    public int a(fG fG2, fG fG3) {
        return Double.compare(cB.a(fG2), cB.a(fG3));
    }
}

