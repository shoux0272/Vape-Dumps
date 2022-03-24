/*
 * Decompiled with CFR 0.150.
 */
import java.awt.Color;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

class iReSqtkUVgVFbiReSqtkUVg
implements iReSqtkUVgFeuiReSqtkUVg {
    final /* synthetic */ iReSqtkUVgFWjiReSqtkUVg a;
    final /* synthetic */ AtomicInteger b;
    final /* synthetic */ List c;
    final /* synthetic */ iReSqtkUVgczkiReSqtkUVg d;

    iReSqtkUVgVFbiReSqtkUVg(iReSqtkUVgczkiReSqtkUVg iReSqtkUVgczkiReSqtkUVg2, iReSqtkUVgFWjiReSqtkUVg iReSqtkUVgFWjiReSqtkUVg2, AtomicInteger atomicInteger, List list) {
        this.d = iReSqtkUVgczkiReSqtkUVg2;
        this.a = iReSqtkUVgFWjiReSqtkUVg2;
        this.b = atomicInteger;
        this.c = list;
    }

    public void a(iReSqtkUVgnCWiReSqtkUVg iReSqtkUVgnCWiReSqtkUVg2) {
        this.a.D().c(this.b.get() + 4 < this.c.size() - 1);
        this.a.f(this.a.D().y());
        if (!this.a.D().y()) {
            this.a.D().a(Color.WHITE);
        }
    }
}

