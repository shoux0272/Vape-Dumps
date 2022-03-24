/*
 * Decompiled with CFR 0.150.
 */
public class iReSqtkUVgeAuiReSqtkUVg {
    public double a;
    public double b;
    public double c;

    public iReSqtkUVgeAuiReSqtkUVg() {
        this.a = 0.0;
        this.b = 0.0;
        this.c = 0.0;
    }

    public iReSqtkUVgeAuiReSqtkUVg(iReSqtkUVgUjriReSqtkUVg iReSqtkUVgUjriReSqtkUVg2) {
        this.a = iReSqtkUVgUjriReSqtkUVg2.d();
        this.b = iReSqtkUVgUjriReSqtkUVg2.e();
        this.c = iReSqtkUVgUjriReSqtkUVg2.f();
    }

    public iReSqtkUVgeAuiReSqtkUVg(double d2, double d3, double d4) {
        this.a = d2;
        this.b = d3;
        this.c = d4;
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

    public void a(float f) {
        float f2 = (float)Math.cos(f);
        float f3 = (float)Math.sin(f);
        double d2 = this.a;
        double d3 = this.b * (double)f2 + this.c * (double)f3;
        double d4 = this.c * (double)f2 - this.b * (double)f3;
        this.a = d2;
        this.b = d3;
        this.c = d4;
    }

    public void b(float f) {
        float f2 = (float)Math.cos(f);
        float f3 = (float)Math.sin(f);
        double d2 = this.a * (double)f2 + this.c * (double)f3;
        double d3 = this.b;
        double d4 = this.c * (double)f2 - this.a * (double)f3;
        this.a = d2;
        this.b = d3;
        this.c = d4;
    }
}

