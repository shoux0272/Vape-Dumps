/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.bC;
import manthe.bL;
import manthe.p1;
import manthe.pd;
import manthe.yG;

public class D7
implements bL {
    public static final int i = 5000;
    private final int f;
    private final double b;
    private final double g;
    private final pd d;
    private int e;
    private boolean h = true;
    private boolean c = true;
    private yG a;
    private static int j;

    public D7(double d10, double d11, int n6, int n10, pd pd2) {
        this.g = d10;
        this.b = d11;
        this.f = n6;
        this.e = n10;
        this.d = pd2;
    }

    public int i() {
        return this.e;
    }

    public void a(int n6) {
        this.e = n6;
    }

    public int e() {
        if (this.f == 5000) {
            double d10 = this.a.w().size();
            double d11 = this.i();
            return (int)Math.ceil(d10 / d11);
        }
        return this.f;
    }

    @Override
    public double c() {
        return this.b;
    }

    @Override
    public double a() {
        return this.g;
    }

    public pd f() {
        return this.d;
    }

    @Override
    public void a(yG yG2) {
        this.a = yG2;
    }

    public void h() {
        this.h = false;
    }

    public void g() {
        this.c = false;
    }

    @Override
    public void b() {
        if (this.e() * this.i() < this.a.w().size()) {
            throw new bC("Not enough cells to render all children!");
        }
        p1[][] arrp1 = new p1[this.i()][this.e()];
        p1[][] arrp12 = new p1[this.e()][this.i()];
        int n6 = 0;
        int n10 = 0;
        for (p1 p12 : this.a.w()) {
            int n11 = 0;
            if (n6 != 0 && (n11 = n6 % this.i()) == 0) {
                ++n10;
            }
            arrp1[n11][n10] = p12;
            arrp12[n10][n11] = p12;
            ++n6;
        }
        if (n6 > 0) {
            p1[] arrp13;
            Object object = new double[this.i()];
            for (int k = 0; k < arrp1.length; ++k) {
                p1[] arrp14;
                arrp13 = arrp14 = arrp1[k];
                int n12 = arrp13.length;
                for (int i10 = 0; i10 < n12; ++i10) {
                    p1 p13 = arrp13[i10];
                    if (p13 == null || !(p13.q() > object[k])) continue;
                    object[k] = p13.q();
                }
            }
            double[] arrd = new double[this.e()];
            for (int k = 0; k < arrp12.length; ++k) {
                for (p1 p14 : arrp13 = arrp12[k]) {
                    if (p14 == null || !(p14.q() > arrd[k])) continue;
                    arrd[k] = p14.b();
                }
            }
            double d10 = 0.0;
            for (Object object2 : object) {
                d10 += object2;
            }
            double d11 = 0.0;
            for (double d12 : arrd) {
                d11 += d12;
            }
            int n13 = this.e() - 1;
            int n14 = this.i() - 1;
            double d13 = (double)(this.d.c + this.d.e) + d10 + (double)n14 * this.g;
            double d14 = (double)(this.d.d + this.d.a) + d11 + (double)n13 * this.b;
            if (this.c) {
                this.a.m().d(d14);
            }
            if (this.h) {
                this.a.m().c(d13);
            }
            double d15 = this.a.t() + (double)this.d.c;
            double d16 = this.a.k() + (double)this.d.d;
            for (int k = 0; k < this.e(); ++k) {
                for (int i11 = 0; i11 < this.i(); ++i11) {
                    p1 p15 = arrp12[k][i11];
                    if (p15 == null) continue;
                    p15.a(d15);
                    p15.d(d16);
                    d15 += object[i11];
                    d15 += this.a();
                }
                d15 = this.a.t() + (double)this.d.c;
                d16 += arrd[k];
                d16 += this.c();
            }
        }
    }

    public static void b(int n6) {
        j = n6;
    }

    public static int j() {
        return j;
    }

    public static int d() {
        int n6 = D7.j();
        if (n6 == 0) {
            return 94;
        }
        return 0;
    }

    private static bC a(bC bC2) {
        return bC2;
    }

    static {
        if (D7.d() != 0) {
            D7.b(62);
        }
    }
}

