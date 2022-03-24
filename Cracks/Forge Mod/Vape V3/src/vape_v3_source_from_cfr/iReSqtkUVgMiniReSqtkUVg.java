/*
 * Decompiled with CFR 0.150.
 */
public class iReSqtkUVgMiniReSqtkUVg
extends iReSqtkUVgFWjiReSqtkUVg
implements iReSqtkUVgnPQiReSqtkUVg {
    private iReSqtkUVgMWviReSqtkUVg h;
    private boolean p = true;

    public iReSqtkUVgMiniReSqtkUVg(iReSqtkUVgmasiReSqtkUVg iReSqtkUVgmasiReSqtkUVg2, iReSqtkUVgMWviReSqtkUVg iReSqtkUVgMWviReSqtkUVg2) {
        super("", true);
        this.h = iReSqtkUVgMWviReSqtkUVg2;
        this.a(new iReSqtkUVgLWWiReSqtkUVg(2.0, 10.0, 1, 1, new iReSqtkUVgbXziReSqtkUVg(0, 0, 0, 0)));
        this.d(12.0);
        this.c(iReSqtkUVgmasiReSqtkUVg2.k());
        this.a(new iReSqtkUVgetaiReSqtkUVg(this));
        iReSqtkUVgFWjiReSqtkUVg iReSqtkUVgFWjiReSqtkUVg2 = new iReSqtkUVgFWjiReSqtkUVg("x", true);
        iReSqtkUVgFWjiReSqtkUVg2.d(12.0);
        iReSqtkUVgFWjiReSqtkUVg2.c(12.0);
        iReSqtkUVgFWjiReSqtkUVg2.a(new iReSqtkUVgziYiReSqtkUVg(this, iReSqtkUVgMWviReSqtkUVg2));
        iReSqtkUVgmasiReSqtkUVg2.a((iReSqtkUVgnCWiReSqtkUVg)this);
        iReSqtkUVgmasiReSqtkUVg2.a((iReSqtkUVgnCWiReSqtkUVg)iReSqtkUVgFWjiReSqtkUVg2);
        iReSqtkUVgilmiReSqtkUVg iReSqtkUVgilmiReSqtkUVg2 = new iReSqtkUVgilmiReSqtkUVg("", iReSqtkUVgIqLiReSqtkUVg.a, 1.0);
        iReSqtkUVgilmiReSqtkUVg2.d(2.0);
        iReSqtkUVgmasiReSqtkUVg2.a((iReSqtkUVgnCWiReSqtkUVg)iReSqtkUVgilmiReSqtkUVg2);
    }

    @Override
    public void a(boolean bl) {
        super.a(bl);
        String string = this.h.a();
        if (!this.h.b().equals(this.h.a()) && !this.t()) {
            string = "*" + this.h.c();
        }
        iReSqtkUVgeLLiReSqtkUVg.h().a(string, this.c() + 14.0, this.e_() + 2.0, -1);
        iReSqtkUVguKSiReSqtkUVg.a(this.c(), this.e_(), this.c() + 12.0, this.e_() + 12.0, -16777216);
        if (this.p) {
            iReSqtkUVgMSwiReSqtkUVg.a(iReSqtkUVgFuiiReSqtkUVg.e.r().d.k(), (float)this.c() + 1.0f, (float)this.e_() - 1.0f, "check", 0.38f);
        }
    }

    @Override
    public void b_() {
        this.p = !this.p;
        this.h.a(this.p);
    }

    @Override
    public boolean b() {
        return this.p;
    }

    @Override
    public void b(boolean bl) {
    }

    public String F() {
        return this.h.a();
    }
}

