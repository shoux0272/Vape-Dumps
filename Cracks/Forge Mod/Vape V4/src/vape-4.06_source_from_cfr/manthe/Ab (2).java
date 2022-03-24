/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.util.Comparator;
import manthe.cB;
import manthe.fQ;
import manthe.zY;

class Ab
implements Comparator<fQ> {
    final zY a;

    Ab(zY zY2) {
        this.a = zY2;
    }

    public int a(fQ fQ2, fQ fQ3) {
        return Double.compare(cB.c(fQ2.f()), cB.c(fQ3.f()));
    }
}

