/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.f;

public class i
extends f<Double> {
    private double f;
    private double e;
    private double g;

    public i(double d10, double d11, double d12) {
        super(d10);
        this.f = d11;
        this.e = d12;
        this.g = d12 - d11;
    }

    public Double o() {
        if (this.h() == 0L) {
            return this.e;
        }
        double d10 = this.l();
        if (d10 == 0.0) {
            return this.f;
        }
        if (d10 == 100.0) {
            return this.e;
        }
        return this.f + this.l() * this.g / 100.0;
    }

    public double p() {
        return this.f;
    }

    public double n() {
        return this.e;
    }
}

