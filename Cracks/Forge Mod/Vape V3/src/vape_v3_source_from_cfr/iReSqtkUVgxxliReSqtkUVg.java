/*
 * Decompiled with CFR 0.150.
 */
public class iReSqtkUVgxxliReSqtkUVg {
    private double a;
    private double b;
    private double c;
    private double d;

    public iReSqtkUVgxxliReSqtkUVg(double d2, double d3, double d4, double d5) {
        this.a = d2;
        this.b = d3;
        this.c = d4;
        this.d = d5;
    }

    public boolean a(iReSqtkUVgFXsiReSqtkUVg iReSqtkUVgFXsiReSqtkUVg2) {
        return this.a(iReSqtkUVgFXsiReSqtkUVg2.a, iReSqtkUVgFXsiReSqtkUVg2.b);
    }

    public boolean a(double d2, double d3) {
        return d2 >= this.a() && d2 <= this.a() + this.c() && d3 >= this.b() && d3 <= this.b() + this.d();
    }

    public double a() {
        return this.a;
    }

    public void a(double d2) {
        this.a = d2;
    }

    public double b() {
        return this.b;
    }

    public void b(double d2) {
        this.b = d2;
    }

    public double c() {
        return this.c;
    }

    public void c(double d2) {
        this.c = d2;
    }

    public double d() {
        return this.d;
    }

    public void d(double d2) {
        this.d = d2;
    }

    public iReSqtkUVgxxliReSqtkUVg b(double d2, double d3) {
        return new iReSqtkUVgxxliReSqtkUVg(d2 + this.a(), d3 + this.b(), this.c(), this.d());
    }
}

