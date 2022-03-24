/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

class iReSqtkUVgsvkiReSqtkUVg
implements iReSqtkUVgycViReSqtkUVg {
    final /* synthetic */ AtomicInteger a;
    final /* synthetic */ List b;
    final /* synthetic */ iReSqtkUVgczkiReSqtkUVg c;

    iReSqtkUVgsvkiReSqtkUVg(iReSqtkUVgczkiReSqtkUVg iReSqtkUVgczkiReSqtkUVg2, AtomicInteger atomicInteger, List list) {
        this.c = iReSqtkUVgczkiReSqtkUVg2;
        this.a = atomicInteger;
        this.b = list;
    }

    @Override
    public void a(int n, int n2, int n3) {
        if (this.a.get() + 4 >= this.b.size() - 1) {
            return;
        }
        iReSqtkUVgFWjiReSqtkUVg iReSqtkUVgFWjiReSqtkUVg2 = null;
        for (iReSqtkUVgFWjiReSqtkUVg iReSqtkUVgFWjiReSqtkUVg3 : this.b) {
            if (!iReSqtkUVgFWjiReSqtkUVg3.h()) continue;
            iReSqtkUVgFWjiReSqtkUVg2 = iReSqtkUVgFWjiReSqtkUVg3;
            break;
        }
        if (iReSqtkUVgFWjiReSqtkUVg2 == null) {
            return;
        }
        int n4 = Integer.parseInt(iReSqtkUVgFWjiReSqtkUVg2.D().D());
        this.a.set(n4);
        iReSqtkUVgFWjiReSqtkUVg2.a_(false);
        ((iReSqtkUVgFWjiReSqtkUVg)this.b.get(this.a.get() + 4)).a_(true);
    }
}

