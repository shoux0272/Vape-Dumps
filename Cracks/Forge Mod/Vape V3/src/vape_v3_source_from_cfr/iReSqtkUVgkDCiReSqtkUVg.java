/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;

class iReSqtkUVgkDCiReSqtkUVg
implements iReSqtkUVgycViReSqtkUVg {
    final /* synthetic */ iReSqtkUVgypOiReSqtkUVg a;
    final /* synthetic */ iReSqtkUVgYAniReSqtkUVg b;

    iReSqtkUVgkDCiReSqtkUVg(iReSqtkUVgYAniReSqtkUVg iReSqtkUVgYAniReSqtkUVg2, iReSqtkUVgypOiReSqtkUVg iReSqtkUVgypOiReSqtkUVg2) {
        this.b = iReSqtkUVgYAniReSqtkUVg2;
        this.a = iReSqtkUVgypOiReSqtkUVg2;
    }

    @Override
    public void a(int n, int n2, int n3) {
        if (n3 == 0) {
            List<iReSqtkUVgCMeiReSqtkUVg> list = this.a.E();
            list.sort(new iReSqtkUVgxBEiReSqtkUVg(this));
            double d2 = 2.0;
            double d3 = 20.0;
            double d4 = 0.0;
            for (iReSqtkUVgCMeiReSqtkUVg iReSqtkUVgCMeiReSqtkUVg2 : list) {
                if (iReSqtkUVgCMeiReSqtkUVg2.O() || !iReSqtkUVgCMeiReSqtkUVg2.h()) continue;
                if (d2 + iReSqtkUVgCMeiReSqtkUVg2.k() > (double)iReSqtkUVgeLLiReSqtkUVg.o().e()) {
                    d2 = 2.0;
                    d3 += d4 + 2.0;
                    d4 = 0.0;
                }
                if (iReSqtkUVgCMeiReSqtkUVg2.l() > d4) {
                    d4 = iReSqtkUVgCMeiReSqtkUVg2.l();
                }
                iReSqtkUVgCMeiReSqtkUVg2.a_(d2);
                iReSqtkUVgCMeiReSqtkUVg2.b(d3);
                d2 += iReSqtkUVgCMeiReSqtkUVg2.k() + 2.0;
            }
        }
    }
}

