/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.awt.Color;
import manthe.ac;
import manthe.ex;
import manthe.fP;
import manthe.yJ;

class mT {
    private final boolean e;
    private final Color a;
    private final ex g;
    private double f;
    private double b;
    private double c;
    private double d;
    final yJ h;

    mT(yJ yJ2, double d10, double d11, double d12, fP fP2, ex ex2, Color color) {
        this.h = yJ2;
        this.f = -100.0;
        this.b = -100.0;
        this.c = -100.0;
        this.d = -100.0;
        this.g = ex2;
        this.a = color;
        double[] arrd = ac.a(d10 + fP2.f(), d11 + fP2.l(), d12 + fP2.j());
        double[] arrd2 = ac.a(d10 + fP2.h(), d11 + fP2.l(), d12 + fP2.j());
        double[] arrd3 = ac.a(d10 + fP2.h(), d11 + fP2.l(), d12 + fP2.i());
        double[] arrd4 = ac.a(d10 + fP2.f(), d11 + fP2.l(), d12 + fP2.i());
        double[] arrd5 = ac.a(d10 + fP2.f(), d11 + fP2.g(), d12 + fP2.j());
        double[] arrd6 = ac.a(d10 + fP2.h(), d11 + fP2.g(), d12 + fP2.j());
        double[] arrd7 = ac.a(d10 + fP2.h(), d11 + fP2.g(), d12 + fP2.i());
        double[] arrd8 = ac.a(d10 + fP2.f(), d11 + fP2.g(), d12 + fP2.i());
        boolean bl = this.e = arrd != null && arrd[2] >= 0.0 && arrd[2] < 1.0 && arrd2[2] >= 0.0 && arrd2[2] < 1.0 && arrd3[2] >= 0.0 && arrd3[2] < 1.0 && arrd4[2] >= 0.0 && arrd4[2] < 1.0 && arrd5[2] >= 0.0 && arrd5[2] < 1.0 && arrd6[2] >= 0.0 && arrd6[2] < 1.0 && arrd7[2] >= 0.0 && arrd7[2] < 1.0 && arrd8[2] >= 0.0 && arrd8[2] < 1.0;
        if (!this.e) {
            return;
        }
        double d13 = arrd[0];
        double d14 = arrd[1];
        double d15 = arrd8[0];
        double d16 = arrd8[1];
        double[] arrd9 = new double[]{arrd[0], arrd2[0], arrd3[0], arrd4[0], arrd5[0], arrd6[0], arrd7[0], arrd8[0]};
        double[] arrd10 = new double[]{arrd[1], arrd2[1], arrd3[1], arrd4[1], arrd5[1], arrd6[1], arrd7[1], arrd8[1]};
        for (double d17 : arrd9) {
            if (!(d17 < d13)) continue;
            d13 = d17;
        }
        for (double d17 : arrd9) {
            if (!(d17 > d15)) continue;
            d15 = d17;
        }
        for (double d17 : arrd10) {
            if (!(d17 < d14)) continue;
            d14 = d17;
        }
        for (double d17 : arrd10) {
            if (!(d17 > d16)) continue;
            d16 = d17;
        }
        this.f = d13;
        this.b = d14;
        this.c = d15;
        this.d = d16;
    }

    static boolean c(mT mT2) {
        return mT2.e;
    }

    static double b(mT mT2) {
        return mT2.f;
    }

    static double e(mT mT2) {
        return mT2.c;
    }

    static double d(mT mT2) {
        return mT2.d;
    }

    static double a(mT mT2) {
        return mT2.b;
    }

    static ex g(mT mT2) {
        return mT2.g;
    }

    static Color f(mT mT2) {
        return mT2.a;
    }
}

