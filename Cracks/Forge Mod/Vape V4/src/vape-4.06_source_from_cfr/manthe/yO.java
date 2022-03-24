/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.oC;

public class yO {
    public static final double a = 2.6;

    public static double a(oC oC2, double d10, oC oC3, double d11, double d12, double d13, double d14, double d15, double d16) {
        return yO.a(oC2.a(), oC2.b() + d10, oC2.d(), oC3.a(), oC3.b(), oC3.d(), d11, d12, d13, d14, d15, d16);
    }

    public static double a(double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17, double d18, double d19, double d20, double d21) {
        double d22 = Math.sqrt(d13 * d13 + d14 * d14 + d15 * d15);
        if (d22 == 0.0) {
            d22 = 1.0;
        }
        double d23 = d16 - d10;
        double d24 = d17 - d11;
        double d25 = d18 - d12;
        double d26 = Math.sqrt(d23 * d23 + d24 * d24 + d25 * d25);
        double d27 = d26 * d13 / d22;
        double d28 = d26 * d14 / d22;
        double d29 = d26 * d15 / d22;
        double d30 = 0.0;
        d30 += Math.max(Math.abs(d23 - d27) - (d19 / 2.0 + d21), 0.0);
        d30 += Math.max(Math.abs(d25 - d29) - (d19 / 2.0 + d21), 0.0);
        if ((d30 += Math.max(Math.abs(d24 - d28) - (d20 / 2.0 + d21), 0.0)) > 1.0) {
            d30 = Math.sqrt(d30);
        }
        return d30;
    }
}

