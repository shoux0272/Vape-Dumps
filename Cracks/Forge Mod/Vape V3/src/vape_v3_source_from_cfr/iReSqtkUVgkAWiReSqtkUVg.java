/*
 * Decompiled with CFR 0.150.
 */
public class iReSqtkUVgkAWiReSqtkUVg
extends iReSqtkUVgJZmiReSqtkUVg {
    public double b;
    public double c;
    public int d;
    private iReSqtkUVgncyiReSqtkUVg e = new iReSqtkUVgncyiReSqtkUVg("Bhop", new iReSqtkUVgeyriReSqtkUVg(this, "Bhop"));
    private iReSqtkUVgncyiReSqtkUVg f = new iReSqtkUVgncyiReSqtkUVg("Hypixel", new iReSqtkUVguTgiReSqtkUVg(this, "Hypixel"));
    private iReSqtkUVgncyiReSqtkUVg g = new iReSqtkUVgncyiReSqtkUVg("Y-Port", new iReSqtkUVggCMiReSqtkUVg(this, "Y-Port"));
    private iReSqtkUVgncyiReSqtkUVg h = new iReSqtkUVgncyiReSqtkUVg("Mineplex", new iReSqtkUVgKtsiReSqtkUVg(this, "Mineplex"));
    private iReSqtkUVgZyLiReSqtkUVg i = iReSqtkUVgZyLiReSqtkUVg.a((Object)this, "Mode", "Speed mode to use.\nBhop - Bypasses Old NCP\nY-Port - Bypasses Old NCP\nHypixel - Bhop that bypasses Watchdog", (iReSqtkUVgzAciReSqtkUVg)this.f, this.f, this.h, this.e, this.g);

    public iReSqtkUVgkAWiReSqtkUVg() {
        super("Speed", 49630, iReSqtkUVgqTOiReSqtkUVg.f, "Increases your movement with various methods.");
        ((iReSqtkUVgJCoiReSqtkUVg)this.i.c()).a(new iReSqtkUVglXOiReSqtkUVg(this));
        this.a(this.i);
    }

    @Override
    public boolean f() {
        return true;
    }

    public void a(int n) {
        this.d = n;
    }

    public double x() {
        double d2 = 0.2873;
        if (iReSqtkUVgeLLiReSqtkUVg.e().a(iReSqtkUVgnNhiReSqtkUVg.d())) {
            int n = iReSqtkUVgeLLiReSqtkUVg.e().b(iReSqtkUVgnNhiReSqtkUVg.d()).d();
            d2 *= 1.0 + 0.2 * (double)(n + 1);
        }
        return d2;
    }

    @Override
    public void g() {
        iReSqtkUVgFuiiReSqtkUVg.e.r().a(this);
        this.b = this.x();
        this.c = 0.0;
        this.d = 2;
    }

    @Override
    public void a(iReSqtkUVgXWziReSqtkUVg iReSqtkUVgXWziReSqtkUVg2) {
        if (!iReSqtkUVgXWziReSqtkUVg2.isPre()) {
            return;
        }
        if (this.i.i() == this.f) {
            ((iReSqtkUVgJZmiReSqtkUVg)this.f.a()).a(iReSqtkUVgXWziReSqtkUVg2);
        } else if (this.i.i() == this.e) {
            ((iReSqtkUVgJZmiReSqtkUVg)this.e.a()).a(iReSqtkUVgXWziReSqtkUVg2);
        } else if (this.i.i() == this.g) {
            ((iReSqtkUVgJZmiReSqtkUVg)this.g.a()).a(iReSqtkUVgXWziReSqtkUVg2);
        } else if (this.i.i() == this.h) {
            ((iReSqtkUVgJZmiReSqtkUVg)this.h.a()).a(iReSqtkUVgXWziReSqtkUVg2);
        }
    }

    @Override
    public void a(iReSqtkUVgTXviReSqtkUVg iReSqtkUVgTXviReSqtkUVg2) {
        this.a(this.i.i().N());
        if (iReSqtkUVgTXviReSqtkUVg2.getStage() == iReSqtkUVgBMviReSqtkUVg.a) {
            iReSqtkUVgtlXiReSqtkUVg iReSqtkUVgtlXiReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.e();
            if (this.i.i() == this.g) {
                ((iReSqtkUVgJZmiReSqtkUVg)this.g.a()).a(iReSqtkUVgTXviReSqtkUVg2);
            }
            double d2 = iReSqtkUVgtlXiReSqtkUVg2.z() - iReSqtkUVgtlXiReSqtkUVg2.ay();
            double d3 = iReSqtkUVgtlXiReSqtkUVg2.B() - iReSqtkUVgtlXiReSqtkUVg2.aA();
            this.c = Math.sqrt(d2 * d2 + d3 * d3);
        }
    }

    public void a(iReSqtkUVgXWziReSqtkUVg iReSqtkUVgXWziReSqtkUVg2, double d2, iReSqtkUVgtlXiReSqtkUVg iReSqtkUVgtlXiReSqtkUVg2) {
        double d3 = iReSqtkUVgtlXiReSqtkUVg2.n().i();
        double d4 = iReSqtkUVgtlXiReSqtkUVg2.n().h();
        float f = iReSqtkUVgtlXiReSqtkUVg2.F();
        if (d3 == 0.0 && d4 == 0.0) {
            iReSqtkUVgXWziReSqtkUVg2.setX(0.0);
            iReSqtkUVgXWziReSqtkUVg2.setZ(0.0);
        } else if (d3 != 0.0) {
            if (d4 != 0.0) {
                if (d4 > 0.0) {
                    f += d3 > 0.0 ? -45.0f : 45.0f;
                    d4 = 0.0;
                } else {
                    f += d3 > 0.0 ? 45.0f : -45.0f;
                    d4 = 0.0;
                }
            }
            d3 = d3 > 0.0 ? 1.0 : -1.0;
        }
        double d5 = Math.cos(Math.toRadians(f + 90.0f));
        double d6 = Math.sin(Math.toRadians(f + 90.0f));
        iReSqtkUVgXWziReSqtkUVg2.setX(d3 * d2 * d5 + d4 * d2 * d6);
        iReSqtkUVgXWziReSqtkUVg2.setZ(d3 * d2 * d6 - d4 * d2 * d5);
    }

    static /* synthetic */ iReSqtkUVgZyLiReSqtkUVg a(iReSqtkUVgkAWiReSqtkUVg iReSqtkUVgkAWiReSqtkUVg2) {
        return iReSqtkUVgkAWiReSqtkUVg2.i;
    }
}

