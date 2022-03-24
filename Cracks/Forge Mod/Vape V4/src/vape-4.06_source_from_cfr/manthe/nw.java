/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.util.Comparator;
import manthe.cB;
import manthe.fQ;
import manthe.zY;

class nw
implements Comparator<fQ> {
    final zY a;

    nw(zY zY2) {
        this.a = zY2;
    }

    public int a(fQ fQ2, fQ fQ3) {
        return Double.compare(cB.b(fQ2.f()), cB.b(fQ3.f()));
    }
}

