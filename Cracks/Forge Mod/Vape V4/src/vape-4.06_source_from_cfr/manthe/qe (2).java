/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.util.Comparator;
import manthe.fG;
import manthe.fQ;
import manthe.fW;
import manthe.zY;

class qe
implements Comparator<fQ> {
    final zY a;

    qe(zY zY2) {
        this.a = zY2;
    }

    public int a(fQ fQ2, fQ fQ3) {
        fG fG2 = fQ2.f();
        fG fG3 = fQ3.f();
        fW fW2 = new fW(fG2.k());
        fW fW3 = new fW(fG3.k());
        float f10 = (float)fW2.k() * fW2.l();
        float f11 = (float)fW3.k() * fW3.l();
        return Float.compare(f10, f11);
    }
}

