/*
 * Decompiled with CFR 0.150.
 */
public class iReSqtkUVgHyViReSqtkUVg
extends iReSqtkUVgJZmiReSqtkUVg {
    private iReSqtkUVgzAciReSqtkUVg b = new iReSqtkUVgzAciReSqtkUVg("Hypixel");
    private iReSqtkUVgzAciReSqtkUVg c = new iReSqtkUVgzAciReSqtkUVg("Normal");
    private iReSqtkUVgkzHiReSqtkUVg d = iReSqtkUVgkzHiReSqtkUVg.a(this, "Speed", "#.#", "", 0.1, 0.5, 5.0, 0.1, "Speed for Normal fly mode.");
    private iReSqtkUVgkzHiReSqtkUVg e = iReSqtkUVgkzHiReSqtkUVg.a(this, "Vertical Speed", "#.#", "", 0.1, 0.2, 5.0, 0.1, "Speed for Normal vertical fly mode.");
    private iReSqtkUVgkzHiReSqtkUVg f = iReSqtkUVgkzHiReSqtkUVg.a(this, "Hy-Boost", "#.##", "x", 1.0, 1.25, 1.5, 0.01, "The boost value for Hypixel fly");
    private iReSqtkUVgZyLiReSqtkUVg g = iReSqtkUVgZyLiReSqtkUVg.a((Object)this, "Mode", this.c, this.c, this.b);
    private iReSqtkUVgoRmiReSqtkUVg h = iReSqtkUVgoRmiReSqtkUVg.a((Object)this, "Boost", false, "Increases Hypixel fly speed\nYou will not be able to fly\ninfinitely with this enabled.");
    private iReSqtkUVgPzKiReSqtkUVg i = new iReSqtkUVgPzKiReSqtkUVg();
    private int j;
    private int k;
    private double l;

    public iReSqtkUVgHyViReSqtkUVg() {
        super("Fly", 49630, iReSqtkUVgqTOiReSqtkUVg.f, "Makes you go zoom.");
        this.h.a(new iReSqtkUVgWaoiReSqtkUVg[]{this.f});
        this.a(this.g, this.d, this.e, this.h, this.f);
        this.l = this.a(6969.0, -6969.0) / 2.0E15;
    }

    @Override
    public boolean f() {
        return true;
    }

    @Override
    public void g() {
        iReSqtkUVgFuiiReSqtkUVg.e.r().a(this);
        iReSqtkUVgeLLiReSqtkUVg.z().a(1.0f);
        this.j = -1;
        if (this.h.i().booleanValue() && this.i.a(5000L)) {
            this.k = 30;
        }
    }

    @Override
    public void h() {
        iReSqtkUVgeLLiReSqtkUVg.z().a(1.0f);
    }

    @Override
    public void a(iReSqtkUVgTXviReSqtkUVg iReSqtkUVgTXviReSqtkUVg2) {
        if (iReSqtkUVgTXviReSqtkUVg2.isPre() && this.g.i() == this.b) {
            iReSqtkUVgtlXiReSqtkUVg iReSqtkUVgtlXiReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.e();
            iReSqtkUVgTXviReSqtkUVg2.setOnGround(false);
            iReSqtkUVgtlXiReSqtkUVg2.g(false);
        }
    }

    @Override
    public void a(iReSqtkUVgXWziReSqtkUVg iReSqtkUVgXWziReSqtkUVg2) {
        if (!iReSqtkUVgXWziReSqtkUVg2.isPre()) {
            return;
        }
        this.a(this.g.i().N());
        iReSqtkUVgtlXiReSqtkUVg iReSqtkUVgtlXiReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.e();
        iReSqtkUVgzkCiReSqtkUVg iReSqtkUVgzkCiReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.z();
        if (this.g.i() == this.b) {
            iReSqtkUVgXWziReSqtkUVg2.setY(0.0);
            iReSqtkUVgtlXiReSqtkUVg2.i(0.0);
            this.a(iReSqtkUVgXWziReSqtkUVg2, this.x());
            if (this.h.i().booleanValue()) {
                --this.k;
                if (this.i.a(7000L)) {
                    this.i.b();
                }
                float f = this.f.i().floatValue();
                if (this.k > 0 && f > 1.0f && !this.i.a(7000L)) {
                    iReSqtkUVgzkCiReSqtkUVg2.a(1.0f + f);
                    if (this.k < 10) {
                        float f2 = this.k / 10;
                        if ((double)f2 > 0.5) {
                            f2 = 1.0f;
                        }
                        iReSqtkUVgzkCiReSqtkUVg2.a(1.0f + f * f2);
                    }
                } else {
                    iReSqtkUVgzkCiReSqtkUVg2.a(1.0f);
                }
            }
            ++this.j;
            if (this.j == 1) {
                iReSqtkUVgtlXiReSqtkUVg2.a(iReSqtkUVgtlXiReSqtkUVg2.z(), iReSqtkUVgtlXiReSqtkUVg2.V().e() + 9.6918752349782E-13 + this.l, iReSqtkUVgtlXiReSqtkUVg2.B(), iReSqtkUVgtlXiReSqtkUVg2.F(), iReSqtkUVgtlXiReSqtkUVg2.G());
            }
            if (this.j == 2) {
                iReSqtkUVgtlXiReSqtkUVg2.a(iReSqtkUVgtlXiReSqtkUVg2.z(), iReSqtkUVgtlXiReSqtkUVg2.V().e() - (9.6918752349782E-13 + this.l), iReSqtkUVgtlXiReSqtkUVg2.B(), iReSqtkUVgtlXiReSqtkUVg2.F(), iReSqtkUVgtlXiReSqtkUVg2.G());
                this.j = 0;
            }
        } else if (this.g.i() == this.c) {
            double d2 = iReSqtkUVgeLLiReSqtkUVg.i().k().f() ? this.e.i() : (iReSqtkUVgeLLiReSqtkUVg.i().l().f() ? -this.e.i().doubleValue() : 0.0);
            iReSqtkUVgXWziReSqtkUVg2.setY(d2);
            iReSqtkUVgtlXiReSqtkUVg2.i(d2);
            iReSqtkUVgtlXiReSqtkUVg2.a(iReSqtkUVgtlXiReSqtkUVg2.z(), iReSqtkUVgtlXiReSqtkUVg2.V().e(), iReSqtkUVgtlXiReSqtkUVg2.B(), iReSqtkUVgtlXiReSqtkUVg2.F(), iReSqtkUVgtlXiReSqtkUVg2.G());
            this.a(iReSqtkUVgXWziReSqtkUVg2, Math.max(this.d.i(), this.x()));
        }
    }

    public double x() {
        double d2 = 0.2873;
        if (iReSqtkUVgeLLiReSqtkUVg.e().a(iReSqtkUVgnNhiReSqtkUVg.d())) {
            int n = iReSqtkUVgeLLiReSqtkUVg.e().b(iReSqtkUVgnNhiReSqtkUVg.d()).d();
            d2 *= 1.0 + 0.2 * (double)(n + 1);
        }
        return d2;
    }

    private void a(iReSqtkUVgXWziReSqtkUVg iReSqtkUVgXWziReSqtkUVg2, double d2) {
        iReSqtkUVgtlXiReSqtkUVg iReSqtkUVgtlXiReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.e();
        double d3 = iReSqtkUVgtlXiReSqtkUVg2.n().i();
        double d4 = iReSqtkUVgtlXiReSqtkUVg2.n().h();
        float f = iReSqtkUVgtlXiReSqtkUVg2.F();
        if (d3 == 0.0 && d4 == 0.0) {
            iReSqtkUVgXWziReSqtkUVg2.setX(0.0).setZ(0.0);
        } else {
            if (d3 != 0.0) {
                if (d4 > 0.0) {
                    f += (float)(d3 > 0.0 ? -45 : 45);
                } else if (d4 < 0.0) {
                    f += (float)(d3 > 0.0 ? 45 : -45);
                }
                d4 = 0.0;
                if (d3 > 0.0) {
                    d3 = 1.0;
                } else if (d3 < 0.0) {
                    d3 = -1.0;
                }
            }
            iReSqtkUVgXWziReSqtkUVg2.setX(d3 * d2 * Math.cos(Math.toRadians(f + 90.0f)) + d4 * d2 * Math.sin(Math.toRadians(f + 90.0f)));
            iReSqtkUVgXWziReSqtkUVg2.setZ(d3 * d2 * Math.sin(Math.toRadians(f + 90.0f)) - d4 * d2 * Math.cos(Math.toRadians(f + 90.0f)));
        }
    }

    private double a(double d2, double d3) {
        return Math.random() * (d2 - d3) + d3;
    }
}

