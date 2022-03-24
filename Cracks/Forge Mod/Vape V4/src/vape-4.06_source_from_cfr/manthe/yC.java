/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.util.List;
import manthe.V;
import manthe.ds;
import manthe.eJ;
import manthe.fP;
import manthe.fX;
import manthe.ks;
import manthe.y5;
import manthe.yc;
import manthe.zz;

public class yC
extends yc {
    private final zz v = (zz)this.S();

    public yC(y5 y52, String string) {
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
        if (eJ2.aF() == 0.0f && eJ2.ay() == 0.0f) {
            this.v.z = this.v.S();
        }
        if (this.v.x == 1 && eJ2.J() && (eJ2.aF() != 0.0f || eJ2.ay() != 0.0f)) {
            this.v.z = 0.25 + this.v.S() - 0.01;
        }
        if (this.v.x == 2 && (eJ2.aF() != 0.0f || eJ2.ay() != 0.0f) && eJ2.v()) {
            double d10 = 0.42f;
            if (eJ2.a(fX.k())) {
                d10 += (double)((float)(eJ2.b(fX.k()).h() + 1) * 0.1f);
            }
            ks2.setY(d10);
            eJ2.l(d10);
            this.v.z *= 2.149;
        } else if (this.v.x == 3) {
            double d11 = 0.66 * (this.v.C - this.v.S());
            this.v.z = this.v.C - d11;
        } else {
            fP fP2 = null;
            fP2 = V.c() == 13 ? eJ2.s().k().b(0.0, eJ2.D(), 0.0) : eJ2.s().b(0.0, eJ2.D(), 0.0);
            List list = ds.t().b(eJ2, fP2);
            if ((list.size() > 0 || eJ2.J()) && this.v.x > 0) {
                this.v.x = 1.35 * this.v.S() - 0.01 > this.v.z ? 0 : (eJ2.aF() != 0.0f || eJ2.ay() != 0.0f ? 1 : 0);
            }
            this.v.z = this.v.C - this.v.C / 159.0;
        }
        if (this.v.x > 0) {
            this.v.z = Math.max(this.v.z, this.v.S());
            this.v.a(ks2, this.v.z, eJ2);
        }
        if (eJ2.aF() != 0.0f || eJ2.ay() != 0.0f) {
            ++this.v.x;
        }
    }
}

