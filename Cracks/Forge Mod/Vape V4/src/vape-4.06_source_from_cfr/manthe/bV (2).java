/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.util.Comparator;
import manthe.AV;
import manthe.uX;

class bV
implements Comparator<AV> {
    final uX a;

    bV(uX uX2) {
        this.a = uX2;
    }

    public int a(AV aV, AV aV2) {
        if (aV.m() == aV2.m()) {
            return 0;
        }
        return aV.m() > aV2.m() ? -1 : 1;
    }
}

