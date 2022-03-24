/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.util.Comparator;
import manthe.cB;
import manthe.fG;
import manthe.zP;

class p9
implements Comparator<fG> {
    final zP a;

    p9(zP zP2) {
        this.a = zP2;
    }

    public int a(fG fG2, fG fG3) {
        return Double.compare(cB.b(fG2), cB.b(fG3));
    }
}

