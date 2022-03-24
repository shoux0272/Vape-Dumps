/*
 * Decompiled with CFR 0.150.
 */
import java.awt.Color;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

class iReSqtkUVgJOaiReSqtkUVg
implements iReSqtkUVgycViReSqtkUVg {
    final /* synthetic */ List a;
    final /* synthetic */ iReSqtkUVgFWjiReSqtkUVg b;
    final /* synthetic */ iReSqtkUVgwgUiReSqtkUVg c;
    final /* synthetic */ AtomicInteger d;
    final /* synthetic */ int e;
    final /* synthetic */ iReSqtkUVgczkiReSqtkUVg f;

    iReSqtkUVgJOaiReSqtkUVg(iReSqtkUVgczkiReSqtkUVg iReSqtkUVgczkiReSqtkUVg2, List list, iReSqtkUVgFWjiReSqtkUVg iReSqtkUVgFWjiReSqtkUVg2, iReSqtkUVgwgUiReSqtkUVg iReSqtkUVgwgUiReSqtkUVg2, AtomicInteger atomicInteger, int n) {
        this.f = iReSqtkUVgczkiReSqtkUVg2;
        this.a = list;
        this.b = iReSqtkUVgFWjiReSqtkUVg2;
        this.c = iReSqtkUVgwgUiReSqtkUVg2;
        this.d = atomicInteger;
        this.e = n;
    }

    @Override
    public void a(int n, int n2, int n3) {
        for (iReSqtkUVgFWjiReSqtkUVg iReSqtkUVgFWjiReSqtkUVg2 : this.a) {
            if (iReSqtkUVgFWjiReSqtkUVg2 == this.b) {
                iReSqtkUVgFWjiReSqtkUVg2.D().c(true);
                iReSqtkUVgFWjiReSqtkUVg2.f(true);
                continue;
            }
            iReSqtkUVgFWjiReSqtkUVg2.D().c(false);
            iReSqtkUVgFWjiReSqtkUVg2.D().a(Color.WHITE);
            iReSqtkUVgFWjiReSqtkUVg2.f(false);
        }
        this.c.o().get(this.d.get()).a_(false);
        this.c.o().get(this.e).a_(true);
        this.c.r().h();
        this.d.set(this.e);
    }
}

