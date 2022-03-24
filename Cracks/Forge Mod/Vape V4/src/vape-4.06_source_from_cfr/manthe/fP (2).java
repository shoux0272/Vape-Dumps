/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.V;
import manthe.cy;
import manthe.gK;
import manthe.gb;
import manthe.jj;

public class fP
extends cy {
    public fP(Object object) {
        super(object);
    }

    public static fP a(double d10, double d11, double d12, double d13, double d14, double d15) {
        return new fP(fP.a.M().bZ.a(d10, d11, d12, d13, d14, d15));
    }

    public fP e(double d10, double d11, double d12) {
        return new fP(fP.a.M().bZ.a(this.b, d10, d11, d12));
    }

    public fP d(double d10, double d11, double d12) {
        return new fP(fP.a.M().bZ.c(this.b, d10, d11, d12));
    }

    public gb a(gK gK2, gK gK3) {
        return new gb(fP.a.M().bZ.a(this.b, gK2.a(), gK3.a()));
    }

    public boolean a(gK gK2) {
        return fP.a.M().bZ.a(this.b, gK2.a());
    }

    public fP b(double d10, double d11, double d12) {
        return new fP(fP.a.M().bZ.b(this.b, d10, d11, d12));
    }

    public double f() {
        return fP.a.M().bZ.d(this.b);
    }

    public double l() {
        return fP.a.M().bZ.g(this.b);
    }

    public double j() {
        return fP.a.M().bZ.f(this.b);
    }

    public double h() {
        return fP.a.M().bZ.e(this.b);
    }

    public double g() {
        return fP.a.M().bZ.c(this.b);
    }

    public double i() {
        return fP.a.M().bZ.a(this.b);
    }

    public fP k() {
        return new fP(jj.a(fP.a.M().bZ, this.b));
    }

    public fP c(double d10, double d11, double d12) {
        if (V.c() > 13) {
            return this.b(d10, d11, d12);
        }
        return new fP(jj.b(fP.a.M().bZ, this.b, d10, d11, d12));
    }

    public double b(fP fP2, double d10) {
        return jj.c(fP.a.M().bZ, this.b, fP2.a(), d10);
    }

    public double c(fP fP2, double d10) {
        return jj.a(fP.a.M().bZ, this.b, fP2.a(), d10);
    }

    public double a(fP fP2, double d10) {
        return jj.b(fP.a.M().bZ, this.b, fP2.a(), d10);
    }

    public void b(fP fP2) {
        jj.a(fP.a.M().bZ, this.b, fP2.a());
    }

    public fP a(double d10, double d11, double d12) {
        return new fP(jj.a(fP.a.M().bZ, this.b, d10, d11, d12));
    }

    public boolean a(fP fP2) {
        return jj.b(fP.a.M().bZ, this.b, fP2.a());
    }
}

