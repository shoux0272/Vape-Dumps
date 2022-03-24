/*
 * Decompiled with CFR 0.150.
 */
public class iReSqtkUVgUjriReSqtkUVg
extends iReSqtkUVgbBTiReSqtkUVg {
    public iReSqtkUVgUjriReSqtkUVg(Object object) {
        super(object);
    }

    public static iReSqtkUVgUjriReSqtkUVg a(double d2, double d3, double d4) {
        return new iReSqtkUVgUjriReSqtkUVg(iReSqtkUVgUjriReSqtkUVg.a.c().t.a(d2, d3, d4));
    }

    public iReSqtkUVgUjriReSqtkUVg a(double d2) {
        return iReSqtkUVgUjriReSqtkUVg.a(this.d() * d2, this.e() * d2, this.f() * d2);
    }

    public iReSqtkUVgUjriReSqtkUVg a(iReSqtkUVgUjriReSqtkUVg iReSqtkUVgUjriReSqtkUVg2) {
        return this.b(iReSqtkUVgUjriReSqtkUVg2.d(), iReSqtkUVgUjriReSqtkUVg2.e(), iReSqtkUVgUjriReSqtkUVg2.f());
    }

    public iReSqtkUVgUjriReSqtkUVg b(double d2, double d3, double d4) {
        return new iReSqtkUVgUjriReSqtkUVg(iReSqtkUVgUjriReSqtkUVg.a.c().t.a(this.b, d2, d3, d4));
    }

    public double d() {
        return iReSqtkUVgUjriReSqtkUVg.a.c().t.a(this.b);
    }

    public double e() {
        return iReSqtkUVgUjriReSqtkUVg.a.c().t.b(this.b);
    }

    public double f() {
        return iReSqtkUVgUjriReSqtkUVg.a.c().t.c(this.b);
    }

    public double b(iReSqtkUVgUjriReSqtkUVg iReSqtkUVgUjriReSqtkUVg2) {
        return iReSqtkUVgUjriReSqtkUVg.a.c().t.b(this.b, iReSqtkUVgUjriReSqtkUVg2.a());
    }

    public double c(iReSqtkUVgUjriReSqtkUVg iReSqtkUVgUjriReSqtkUVg2) {
        return iReSqtkUVgUjriReSqtkUVg.a.c().t.a(this.b, iReSqtkUVgUjriReSqtkUVg2.a());
    }

    @Override
    public String toString() {
        return "[" + this.d() + "," + this.e() + "," + this.f() + "]";
    }

    public iReSqtkUVgeAuiReSqtkUVg g() {
        return new iReSqtkUVgeAuiReSqtkUVg(this.d(), this.e(), this.f());
    }
}

