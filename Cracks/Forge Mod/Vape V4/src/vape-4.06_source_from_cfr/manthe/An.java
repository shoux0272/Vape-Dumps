/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.ds;
import manthe.eJ;
import manthe.oC;

public class An {
    public static float a(oC oC2, double d10) {
        eJ eJ2 = ds.k();
        double d11 = 0.05f;
        double d12 = oC2.a() - eJ2.z();
        double d13 = oC2.d() - eJ2.g();
        double d14 = Math.sqrt(d12 * d12 + d13 * d13);
        double d15 = oC2.b() - (eJ2.l() + (double)eJ2.am());
        double d16 = 2.0 * d15 * (d10 * d10);
        double d17 = d11 * (d14 * d14);
        double d18 = Math.sqrt(d10 * d10 * d10 * d10 - d11 * (d17 + d16));
        double d19 = d10 * d10 + d18;
        double d20 = d10 * d10 - d18;
        double d21 = Math.atan2(d19, d11 * d14);
        double d22 = Math.atan2(d20, d11 * d14);
        return (float)(-Math.toDegrees(Math.min(d21, d22)));
    }
}

