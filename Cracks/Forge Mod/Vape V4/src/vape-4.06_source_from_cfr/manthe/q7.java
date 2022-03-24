/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.util.Comparator;
import manthe.AV;
import manthe.rm;

class q7
implements Comparator<AV> {
    final rm a;

    q7(rm rm2) {
        this.a = rm2;
    }

    public int a(AV aV, AV aV2) {
        if (aV.m() == aV2.m()) {
            return 0;
        }
        return aV.m() > aV2.m() ? -1 : 1;
    }
}

