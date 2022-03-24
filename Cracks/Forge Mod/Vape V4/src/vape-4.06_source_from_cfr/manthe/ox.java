/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.util.Comparator;
import manthe.AV;

final class ox
implements Comparator<AV> {
    ox() {
    }

    public int a(AV aV, AV aV2) {
        if (aV.t() == aV2.t()) {
            return 0;
        }
        return aV.t() > aV2.t() ? -1 : 1;
    }
}

