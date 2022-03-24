/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.ds;
import manthe.eJ;
import manthe.fX;
import manthe.ks;
import manthe.y5;
import manthe.yc;
import manthe.zz;

public class yj
extends yc {
    private final zz v = (zz)this.S();

    public yj(y5 y52, String string) {
        super(y52, string);
    }

    @Override
    public void a(ks ks2) {
        if (!ks2.c()) {
            return;
        }
        eJ eJ2 = ds.k();
        if (eJ2.H()) {
            return;
        }
        if ((eJ2.aF() != 0.0f || eJ2.ay() != 0.0f) && eJ2.J()) {
            double d10 = 0.42f;
            if (eJ2.a(fX.k())) {
                d10 += (double)((float)(eJ2.b(fX.k()).h() + 1) * 0.1f);
            }
            ks2.setY(d10);
            eJ2.l(d10);
        }
        this.v.a(ks2, 0.4199999976158142, eJ2);
    }
}

