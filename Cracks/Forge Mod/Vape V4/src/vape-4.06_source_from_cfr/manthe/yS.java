/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.util.Comparator;
import manthe.AV;

final class yS
implements Comparator<AV> {
    yS() {
    }

    public int a(AV aV, AV aV2) {
        if (aV.m() == aV2.m()) {
            return 0;
        }
        return aV.m() > aV2.m() ? -1 : 1;
    }
}

