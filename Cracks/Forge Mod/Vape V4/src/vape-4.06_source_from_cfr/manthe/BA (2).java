/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.util.Comparator;
import manthe.cB;
import manthe.fQ;
import manthe.zY;

class BA
implements Comparator<fQ> {
    final zY a;

    BA(zY zY2) {
        this.a = zY2;
    }

    public int a(fQ fQ2, fQ fQ3) {
        return Double.compare(cB.a(fQ2.f()), cB.a(fQ3.f()));
    }
}

