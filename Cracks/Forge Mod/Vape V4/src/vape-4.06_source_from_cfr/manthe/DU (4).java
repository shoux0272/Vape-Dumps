/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.Bo;

public class DU {
    private double d;
    private double b;
    private double c;
    private double a;

    public DU(double d10, double d11, double d12, double d13) {
        this.d = d10;
        this.b = d11;
        this.c = d12;
        this.a = d13;
    }

    public boolean a(Bo bo2) {
        return this.b(bo2.a, bo2.b);
    }

    public boolean b(double d10, double d11) {
        return d10 >= this.a() && d10 <= this.a() + this.d() && d11 >= this.b() && d11 <= this.b() + this.c();
    }

    public boolean a(DU dU2) {
        return this.b(dU2) > 0.0;
    }

    public double b(DU dU2) {
        double d10 = Math.max(0.0, Math.min(this.a() + this.d(), dU2.a() + dU2.d()) - Math.max(this.a(), dU2.a()));
        double d11 = Math.max(0.0, Math.min(this.b() + this.c(), dU2.b() + dU2.c()) - Math.max(this.b(), dU2.b()));
        return d10 * d11;
    }

    public double a() {
        return this.d;
    }

    public void a(double d10) {
        this.d = d10;
    }

    public double b() {
        return this.b;
    }

    public void b(double d10) {
        this.b = d10;
    }

    public double d() {
        return this.c;
    }

    public void c(double d10) {
        this.c = d10;
    }

    public double c() {
        return this.a;
    }

    public void d(double d10) {
        this.a = d10;
    }

    public DU a(double d10, double d11) {
        return new DU(d10 + this.a(), d11 + this.b(), this.d(), this.c());
    }

    public String toString() {
        return String.format("[%s, %s, %s, %s]", this.a(), this.b(), this.d(), this.c());
    }
}

