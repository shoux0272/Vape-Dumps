/*
 * Decompiled with CFR 0.150.
 */
class iReSqtkUVgSIDiReSqtkUVg
implements iReSqtkUVgFeuiReSqtkUVg<iReSqtkUVgpqqiReSqtkUVg> {
    final /* synthetic */ iReSqtkUVgpqqiReSqtkUVg a;

    iReSqtkUVgSIDiReSqtkUVg(iReSqtkUVgpqqiReSqtkUVg iReSqtkUVgpqqiReSqtkUVg2) {
        this.a = iReSqtkUVgpqqiReSqtkUVg2;
    }

    @Override
    public void a(iReSqtkUVgpqqiReSqtkUVg iReSqtkUVgpqqiReSqtkUVg2) {
        if (this.a.F().o().size() > 0) {
            iReSqtkUVgpqqiReSqtkUVg2.H().a_(true);
            iReSqtkUVgpqqiReSqtkUVg2.G().f().r().h();
            double d2 = 0.0;
            for (iReSqtkUVgnCWiReSqtkUVg iReSqtkUVgnCWiReSqtkUVg2 : iReSqtkUVgpqqiReSqtkUVg.b(this.a).o()) {
                if (!iReSqtkUVgnCWiReSqtkUVg2.h()) continue;
                d2 += iReSqtkUVgnCWiReSqtkUVg2.l() + 2.0;
            }
            iReSqtkUVgpqqiReSqtkUVg.b(this.a).d(d2 + 2.0);
        } else {
            iReSqtkUVgpqqiReSqtkUVg2.H().a_(false);
        }
        iReSqtkUVgpqqiReSqtkUVg.c(this.a);
    }
}

