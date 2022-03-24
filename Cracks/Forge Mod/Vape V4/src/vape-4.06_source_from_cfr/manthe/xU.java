/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.Bo;
import manthe.DU;
import manthe.o7;
import manthe.wM;

public abstract class xU
extends wM {
    private String D;
    protected final double C = 1.0;
    protected boolean z;
    protected Bo A;
    private static String B;

    public xU(String string) {
        this.D = string;
    }

    public double a(double d10, double d11, double d12, double d13, double d14) {
        double d15 = d14 / d11 * 100.0;
        d15 = Math.min(d15, 100.0);
        d15 = Math.max(d15, 0.0);
        double d16 = d13 * d15;
        double d17 = d16 % d12;
        double d18 = d16 - d17;
        return d18 + d10;
    }

    public double m() {
        return o7.b().a - this.A.a;
    }

    public DU a(double d10, double d11, double d12) {
        return new DU(d10 - d12, d11 - d12, d12 * 2.0, d12 * 2.0);
    }

    public String n() {
        return this.D;
    }

    public void c(String string) {
        this.D = string;
    }

    public static void b(String string) {
        B = string;
    }

    public static String l() {
        return B;
    }

    static {
        if (xU.l() == null) {
            xU.b("a0BFMb");
        }
    }
}

