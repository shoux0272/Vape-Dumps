/*
 * Decompiled with CFR 0.150.
 */
public class iReSqtkUVgLWWiReSqtkUVg
implements iReSqtkUVgeoviReSqtkUVg {
    public static final int a = 5000;
    private final int b;
    private final int c;
    private final double d;
    private final double e;
    private final iReSqtkUVgbXziReSqtkUVg f;
    private boolean g = true;
    private boolean h = true;
    private iReSqtkUVgRjOiReSqtkUVg i;

    public iReSqtkUVgLWWiReSqtkUVg(double d2, double d3, int n, int n2, iReSqtkUVgbXziReSqtkUVg iReSqtkUVgbXziReSqtkUVg2) {
        this.e = d2;
        this.d = d3;
        this.c = n;
        this.b = n2;
        this.f = iReSqtkUVgbXziReSqtkUVg2;
    }

    public int a() {
        return this.b;
    }

    public int b() {
        if (this.c == 5000) {
            double d2 = this.i.p().size();
            double d3 = this.a();
            return (int)Math.ceil(d2 / d3);
        }
        return this.c;
    }

    public double c() {
        return this.d;
    }

    public double d() {
        return this.e;
    }

    public iReSqtkUVgbXziReSqtkUVg e() {
        return this.f;
    }

    @Override
    public void a(iReSqtkUVgRjOiReSqtkUVg iReSqtkUVgRjOiReSqtkUVg2) {
        this.i = iReSqtkUVgRjOiReSqtkUVg2;
    }

    public void f() {
        this.g = false;
    }

    public void g() {
        this.h = false;
    }

    @Override
    public void h() {
        if (this.b() * this.a() < this.i.p().size()) {
            throw new iReSqtkUVgXQgiReSqtkUVg("Not enough cells to render all children!");
        }
        iReSqtkUVgnCWiReSqtkUVg[][] arriReSqtkUVgnCWiReSqtkUVg = new iReSqtkUVgnCWiReSqtkUVg[this.a()][this.b()];
        iReSqtkUVgnCWiReSqtkUVg[][] arriReSqtkUVgnCWiReSqtkUVg2 = new iReSqtkUVgnCWiReSqtkUVg[this.b()][this.a()];
        int n = 0;
        int n2 = 0;
        for (iReSqtkUVgnCWiReSqtkUVg iReSqtkUVgnCWiReSqtkUVg2 : this.i.p()) {
            int n3 = 0;
            if (n != 0 && (n3 = n % this.a()) == 0) {
                ++n2;
            }
            arriReSqtkUVgnCWiReSqtkUVg[n3][n2] = iReSqtkUVgnCWiReSqtkUVg2;
            arriReSqtkUVgnCWiReSqtkUVg2[n2][n3] = iReSqtkUVgnCWiReSqtkUVg2;
            ++n;
        }
        if (n > 0) {
            iReSqtkUVgnCWiReSqtkUVg[] arriReSqtkUVgnCWiReSqtkUVg3;
            Object object = new double[this.a()];
            for (int i = 0; i < arriReSqtkUVgnCWiReSqtkUVg.length; ++i) {
                iReSqtkUVgnCWiReSqtkUVg[] arriReSqtkUVgnCWiReSqtkUVg4;
                arriReSqtkUVgnCWiReSqtkUVg3 = arriReSqtkUVgnCWiReSqtkUVg4 = arriReSqtkUVgnCWiReSqtkUVg[i];
                int n4 = arriReSqtkUVgnCWiReSqtkUVg3.length;
                for (int k = 0; k < n4; ++k) {
                    iReSqtkUVgnCWiReSqtkUVg iReSqtkUVgnCWiReSqtkUVg3 = arriReSqtkUVgnCWiReSqtkUVg3[k];
                    if (iReSqtkUVgnCWiReSqtkUVg3 == null || !(iReSqtkUVgnCWiReSqtkUVg3.k() > object[i])) continue;
                    object[i] = iReSqtkUVgnCWiReSqtkUVg3.k();
                }
            }
            double[] arrd = new double[this.b()];
            for (int i = 0; i < arriReSqtkUVgnCWiReSqtkUVg2.length; ++i) {
                for (iReSqtkUVgnCWiReSqtkUVg iReSqtkUVgnCWiReSqtkUVg4 : arriReSqtkUVgnCWiReSqtkUVg3 = arriReSqtkUVgnCWiReSqtkUVg2[i]) {
                    if (iReSqtkUVgnCWiReSqtkUVg4 == null || !(iReSqtkUVgnCWiReSqtkUVg4.k() > arrd[i])) continue;
                    arrd[i] = iReSqtkUVgnCWiReSqtkUVg4.l();
                }
            }
            double d2 = 0.0;
            for (Object object2 : object) {
                d2 += object2;
            }
            double d3 = 0.0;
            for (double d4 : arrd) {
                d3 += d4;
            }
            int n5 = this.b() - 1;
            int n6 = this.a() - 1;
            double d5 = (double)(this.f.b + this.f.d) + d2 + (double)n6 * this.e;
            double d6 = (double)(this.f.a + this.f.c) + d3 + (double)n5 * this.d;
            if (this.h) {
                this.i.e().d(d6);
            }
            if (this.g) {
                this.i.e().c(d5);
            }
            double d7 = this.i.c() + (double)this.f.b;
            double d8 = this.i.e_() + (double)this.f.a;
            for (int i = 0; i < this.b(); ++i) {
                for (int k = 0; k < this.a(); ++k) {
                    iReSqtkUVgnCWiReSqtkUVg iReSqtkUVgnCWiReSqtkUVg5 = arriReSqtkUVgnCWiReSqtkUVg2[i][k];
                    if (iReSqtkUVgnCWiReSqtkUVg5 == null) continue;
                    iReSqtkUVgnCWiReSqtkUVg5.a_(d7);
                    iReSqtkUVgnCWiReSqtkUVg5.b(d8);
                    d7 += object[k];
                    d7 += this.d();
                }
                d7 = this.i.c() + (double)this.f.b;
                d8 += arrd[i];
                d8 += this.c();
            }
        }
    }
}

