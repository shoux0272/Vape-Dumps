/*
 * Decompiled with CFR 0.150.
 */
class iReSqtkUVgqBbiReSqtkUVg
implements iReSqtkUVgycViReSqtkUVg {
    final /* synthetic */ iReSqtkUVgCMeiReSqtkUVg a;
    final /* synthetic */ iReSqtkUVgypOiReSqtkUVg b;
    final /* synthetic */ iReSqtkUVgeAoiReSqtkUVg c;

    iReSqtkUVgqBbiReSqtkUVg(iReSqtkUVgeAoiReSqtkUVg iReSqtkUVgeAoiReSqtkUVg2, iReSqtkUVgCMeiReSqtkUVg iReSqtkUVgCMeiReSqtkUVg2, iReSqtkUVgypOiReSqtkUVg iReSqtkUVgypOiReSqtkUVg2) {
        this.c = iReSqtkUVgeAoiReSqtkUVg2;
        this.a = iReSqtkUVgCMeiReSqtkUVg2;
        this.b = iReSqtkUVgypOiReSqtkUVg2;
    }

    @Override
    public void a(int n, int n2, int n3) {
        if (n3 == 0) {
            if (this.a.h()) {
                this.a.a_(false);
            } else {
                if (this.a.c() < -100.0 || this.a.e_() < -100.0) {
                    this.a.a_(50.0);
                    this.a.b(50.0);
                }
                this.a.a_(true);
                if (this.b.G()) {
                    this.a.a_(this.c.h());
                }
                iReSqtkUVgFuiiReSqtkUVg.e.m().d().remove(this.a);
                iReSqtkUVgFuiiReSqtkUVg.e.m().d().add(0, this.a);
            }
        }
    }
}

