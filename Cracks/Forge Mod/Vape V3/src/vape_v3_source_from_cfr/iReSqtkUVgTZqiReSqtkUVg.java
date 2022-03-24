/*
 * Decompiled with CFR 0.150.
 */
class iReSqtkUVgTZqiReSqtkUVg
extends Thread {
    final /* synthetic */ iReSqtkUVgsLdiReSqtkUVg a;

    iReSqtkUVgTZqiReSqtkUVg(iReSqtkUVgsLdiReSqtkUVg iReSqtkUVgsLdiReSqtkUVg2) {
        this.a = iReSqtkUVgsLdiReSqtkUVg2;
    }

    @Override
    public void run() {
        while (!iReSqtkUVgFuiiReSqtkUVg.e.g()) {
            try {
                boolean bl;
                Thread.sleep(5L);
                if (!this.a.b()) continue;
                boolean bl2 = bl = iReSqtkUVgsLdiReSqtkUVg.a(this.a) && !iReSqtkUVgsLdiReSqtkUVg.b(this.a);
                if (iReSqtkUVgsLdiReSqtkUVg.c(this.a) || bl) {
                    boolean bl3;
                    iReSqtkUVgqzriReSqtkUVg iReSqtkUVgqzriReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.i().d();
                    if (bl && iReSqtkUVgVUTiReSqtkUVg.a() && !iReSqtkUVgqzriReSqtkUVg2.f() && !iReSqtkUVgsLdiReSqtkUVg.d(this.a)) {
                        iReSqtkUVgqzriReSqtkUVg.a(iReSqtkUVgqzriReSqtkUVg2.d(), true);
                        iReSqtkUVgqzriReSqtkUVg.a(iReSqtkUVgqzriReSqtkUVg2.d());
                        iReSqtkUVgsLdiReSqtkUVg.a(this.a, true);
                    }
                    boolean bl4 = bl3 = iReSqtkUVgsLdiReSqtkUVg.e(this.a).i() != false && iReSqtkUVgeLLiReSqtkUVg.f().a(iReSqtkUVgSzRiReSqtkUVg.y);
                    if (!bl3) {
                        continue;
                    }
                } else {
                    iReSqtkUVgsLdiReSqtkUVg.a(this.a, false);
                }
                iReSqtkUVgsLdiReSqtkUVg.f(this.a).a();
            }
            catch (Exception exception) {}
        }
    }
}

