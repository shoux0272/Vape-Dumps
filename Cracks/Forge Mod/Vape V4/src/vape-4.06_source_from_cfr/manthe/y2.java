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
import manthe.km;
import manthe.ks;
import manthe.y5;
import manthe.yc;
import manthe.zz;

public class y2
extends yc {
    private final zz v = (zz)this.S();
    private static int[] w;

    public y2(y5 y52, String string) {
        super(y52, string);
    }

    @Override
    public void a(km km2) {
        if (this.v.x == 3) {
            eJ eJ2 = ds.k();
            double d10 = 0.42f;
            if (eJ2.a(fX.k())) {
                d10 = (float)(eJ2.b(fX.k()).h() + 1) * 0.1f;
            }
            km.setY(km.getY() + d10);
        }
    }

    @Override
    public void a(ks ks2) {
        eJ eJ2;
        if (!ks2.c()) {
            return;
        }
        if (this.v.x < 1) {
            ++this.v.x;
            this.v.C = 0.0;
        }
        if ((eJ2 = ds.k()).H()) {
            return;
        }
        if (eJ2.v() || eJ2.J() || this.v.x == 3) {
            if (!eJ2.E() && eJ2.aF() != 0.0f || eJ2.ay() != 0.0f) {
                if (this.v.x == 2) {
                    this.v.z *= 2.149;
                    this.v.x = 3;
                } else if (this.v.x == 3) {
                    this.v.x = 2;
                    double d10 = 0.66 * (this.v.C - this.v.S());
                    this.v.z = this.v.C - d10;
                } else {
                    fP fP2 = null;
                    fP2 = V.c() == 13 ? eJ2.s().k().b(0.0, eJ2.D(), 0.0) : eJ2.s().b(0.0, eJ2.D(), 0.0);
                    List list = ds.t().b(eJ2, fP2);
                    if ((list.size() > 0 || eJ2.J()) && this.v.x > 0) {
                        this.v.x = 1;
                    }
                }
            }
            this.v.z = Math.max(this.v.z, this.v.S());
            this.v.a(ks2, this.v.z, eJ2);
        }
    }

    public static void b(int[] arrn) {
        w = arrn;
    }

    public static int[] T() {
        return w;
    }

    static {
        if (y2.T() == null) {
            y2.b(new int[1]);
        }
    }
}

