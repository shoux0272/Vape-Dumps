/*
 * Decompiled with CFR 0.150.
 */
import java.awt.Color;

public class iReSqtkUVgDgxiReSqtkUVg
extends iReSqtkUVgFWjiReSqtkUVg
implements iReSqtkUVgnPQiReSqtkUVg {
    private boolean h = true;
    private String p;
    private Color q;
    private iReSqtkUVgmasiReSqtkUVg r;
    private iReSqtkUVgowliReSqtkUVg s;

    public iReSqtkUVgDgxiReSqtkUVg(iReSqtkUVgmasiReSqtkUVg iReSqtkUVgmasiReSqtkUVg2, iReSqtkUVgowliReSqtkUVg iReSqtkUVgowliReSqtkUVg2) {
        super("", true);
        this.r = iReSqtkUVgmasiReSqtkUVg2;
        this.p = iReSqtkUVgowliReSqtkUVg2.d();
        this.q = iReSqtkUVgowliReSqtkUVg2.b();
        this.s = iReSqtkUVgowliReSqtkUVg2;
        this.b(this.q);
        this.a(new iReSqtkUVgLWWiReSqtkUVg(2.0, 10.0, 1, 1, new iReSqtkUVgbXziReSqtkUVg(0, 0, 0, 0)));
        this.d(12.0);
        this.c(iReSqtkUVgmasiReSqtkUVg2.k());
        this.a(new iReSqtkUVgYoXiReSqtkUVg(this));
        iReSqtkUVgFWjiReSqtkUVg iReSqtkUVgFWjiReSqtkUVg2 = new iReSqtkUVgFWjiReSqtkUVg("x", true);
        iReSqtkUVgFWjiReSqtkUVg2.d(12.0);
        iReSqtkUVgFWjiReSqtkUVg2.c(12.0);
        iReSqtkUVgDgxiReSqtkUVg iReSqtkUVgDgxiReSqtkUVg2 = this;
        iReSqtkUVgFWjiReSqtkUVg2.a(new iReSqtkUVgjUriReSqtkUVg(this, iReSqtkUVgDgxiReSqtkUVg2));
        iReSqtkUVgmasiReSqtkUVg2.a((iReSqtkUVgnCWiReSqtkUVg)this);
        iReSqtkUVgmasiReSqtkUVg2.a((iReSqtkUVgnCWiReSqtkUVg)iReSqtkUVgFWjiReSqtkUVg2);
        iReSqtkUVgilmiReSqtkUVg iReSqtkUVgilmiReSqtkUVg2 = new iReSqtkUVgilmiReSqtkUVg("", iReSqtkUVgIqLiReSqtkUVg.a, 1.0);
        iReSqtkUVgilmiReSqtkUVg2.d(2.0);
        iReSqtkUVgmasiReSqtkUVg2.a((iReSqtkUVgnCWiReSqtkUVg)iReSqtkUVgilmiReSqtkUVg2);
    }

    @Override
    public void a(boolean bl) {
        super.a(bl);
        double d2 = this.c() + 15.0;
        double d3 = this.e_() + this.l() / 2.0 - (double)(iReSqtkUVgeLLiReSqtkUVg.h().b(this.p) / 4);
        iReSqtkUVguKSiReSqtkUVg.a(d2 - 1.0, d3 - 1.0, d2 + (double)(iReSqtkUVgeLLiReSqtkUVg.h().a(this.p) / 2), d3 + (double)iReSqtkUVgeLLiReSqtkUVg.h().b(this.p) * 0.5, 0.0, 0.0, 0.0, 0.35);
        iReSqtkUVgeLLiReSqtkUVg.h().a(this.p, d2, d3, -1, 0.5);
        iReSqtkUVguKSiReSqtkUVg.a(this.c(), this.e_(), this.c() + 12.0, this.e_() + 12.0, -16777216);
        if (this.h) {
            iReSqtkUVgMSwiReSqtkUVg.a(iReSqtkUVgFuiiReSqtkUVg.e.r().d.k(), (float)this.c() + 1.0f, (float)this.e_() - 1.0f, "check", 0.38f);
        }
    }

    @Override
    public void b_() {
        boolean bl = this.h = !this.h;
        if (this.h) {
            iReSqtkUVgFuiiReSqtkUVg.e.d().a(iReSqtkUVghUmiReSqtkUVg.class).a(this.s);
        } else {
            iReSqtkUVgFuiiReSqtkUVg.e.d().a(iReSqtkUVghUmiReSqtkUVg.class).b(this.s);
        }
    }

    @Override
    public boolean b() {
        return false;
    }

    @Override
    public void b(boolean bl) {
    }

    public iReSqtkUVgmasiReSqtkUVg F() {
        return this.r;
    }

    public iReSqtkUVgowliReSqtkUVg G() {
        return this.s;
    }
}

