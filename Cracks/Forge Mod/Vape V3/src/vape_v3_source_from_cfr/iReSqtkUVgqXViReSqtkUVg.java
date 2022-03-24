/*
 * Decompiled with CFR 0.150.
 */
public class iReSqtkUVgqXViReSqtkUVg {
    private boolean a;
    private double b;
    private iReSqtkUVggvziReSqtkUVg c;
    private final int d;
    private int e;
    private int f;

    public iReSqtkUVgqXViReSqtkUVg(int n) {
        this.d = n;
    }

    public boolean a() {
        return this.a;
    }

    public void b() {
        this.a = false;
        this.b = -999.0;
        this.c = iReSqtkUVgeLLiReSqtkUVg.g();
        this.f = 0;
        this.e = 0;
    }

    public void c() {
        this.a = true;
        this.e = this.d;
    }

    public void a(iReSqtkUVgVnKiReSqtkUVg iReSqtkUVgVnKiReSqtkUVg2) {
        boolean bl;
        boolean bl2;
        double d2 = iReSqtkUVgVnKiReSqtkUVg2.aF();
        iReSqtkUVggvziReSqtkUVg iReSqtkUVggvziReSqtkUVg2 = iReSqtkUVgVnKiReSqtkUVg2.ag();
        if (iReSqtkUVggvziReSqtkUVg2.b() || this.c != null && this.c.c() && !iReSqtkUVggvziReSqtkUVg2.equals(this.c)) {
            this.b();
            return;
        }
        if (this.a) {
            if (this.e > 0) {
                --this.e;
            } else {
                bl2 = iReSqtkUVgrseiReSqtkUVg.f(iReSqtkUVgVnKiReSqtkUVg2);
                if (bl2) {
                    ++this.f;
                    if (this.f >= 5) {
                        this.b();
                        return;
                    }
                    if (!iReSqtkUVgrseiReSqtkUVg.d(iReSqtkUVgVnKiReSqtkUVg2) && !iReSqtkUVgrseiReSqtkUVg.e(iReSqtkUVgVnKiReSqtkUVg2)) {
                        this.b();
                        return;
                    }
                    this.c();
                } else {
                    this.f = 0;
                    if (iReSqtkUVgrseiReSqtkUVg.a((iReSqtkUVgjSjiReSqtkUVg)iReSqtkUVgVnKiReSqtkUVg2, 10) == 0) {
                        this.b();
                        return;
                    }
                }
            }
        }
        bl2 = d2 < this.b || iReSqtkUVgVnKiReSqtkUVg2.ai() == 20;
        iReSqtkUVgVjsiReSqtkUVg iReSqtkUVgVjsiReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.l();
        boolean bl3 = bl = iReSqtkUVgVjsiReSqtkUVg2.c() && iReSqtkUVgVjsiReSqtkUVg2.d().c() && iReSqtkUVgVnKiReSqtkUVg2.aP();
        if (bl2 || bl) {
            this.c();
        }
        this.c = iReSqtkUVggvziReSqtkUVg2;
        this.b = d2;
    }
}

