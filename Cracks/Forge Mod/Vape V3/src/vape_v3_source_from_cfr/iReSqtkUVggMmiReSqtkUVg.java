/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

class iReSqtkUVggMmiReSqtkUVg
implements iReSqtkUVgycViReSqtkUVg {
    final /* synthetic */ List a;
    final /* synthetic */ AtomicInteger b;
    final /* synthetic */ iReSqtkUVgczkiReSqtkUVg c;

    iReSqtkUVggMmiReSqtkUVg(iReSqtkUVgczkiReSqtkUVg iReSqtkUVgczkiReSqtkUVg2, List list, AtomicInteger atomicInteger) {
        this.c = iReSqtkUVgczkiReSqtkUVg2;
        this.a = list;
        this.b = atomicInteger;
    }

    @Override
    public void a(int n, int n2, int n3) {
        if (((iReSqtkUVgFWjiReSqtkUVg)this.a.get(0)).h()) {
            return;
        }
        iReSqtkUVgFWjiReSqtkUVg iReSqtkUVgFWjiReSqtkUVg2 = null;
        for (int i = this.a.size() - 1; i > 0; --i) {
            iReSqtkUVgFWjiReSqtkUVg iReSqtkUVgFWjiReSqtkUVg3 = (iReSqtkUVgFWjiReSqtkUVg)this.a.get(i);
            if (!iReSqtkUVgFWjiReSqtkUVg3.h()) continue;
            iReSqtkUVgFWjiReSqtkUVg2 = iReSqtkUVgFWjiReSqtkUVg3;
            break;
        }
        iReSqtkUVgFWjiReSqtkUVg iReSqtkUVgFWjiReSqtkUVg4 = null;
        for (iReSqtkUVgFWjiReSqtkUVg iReSqtkUVgFWjiReSqtkUVg5 : this.a) {
            if (!iReSqtkUVgFWjiReSqtkUVg5.h()) continue;
            int n4 = this.a.indexOf(iReSqtkUVgFWjiReSqtkUVg5);
            iReSqtkUVgFWjiReSqtkUVg4 = (iReSqtkUVgFWjiReSqtkUVg)this.a.get(n4 - 1);
            break;
        }
        if (iReSqtkUVgFWjiReSqtkUVg2 == null || iReSqtkUVgFWjiReSqtkUVg4 == null) {
            return;
        }
        int n5 = Integer.parseInt(iReSqtkUVgFWjiReSqtkUVg4.D().D());
        this.b.set(n5 - 1);
        iReSqtkUVgFWjiReSqtkUVg2.a_(false);
        iReSqtkUVgFWjiReSqtkUVg4.a_(true);
    }
}

