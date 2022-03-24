/*
 * Decompiled with CFR 0.150.
 */
package manthe;

public class pE {
    private double a;
    private double b;

    public pE(double d10, double d11) {
        this.a = d10;
        this.b = d11;
    }

    public double b() {
        return this.b;
    }

    public double a() {
        return this.a;
    }

    public String toString() {
        return String.format("[%s, %s]", this.a, this.b);
    }
}

