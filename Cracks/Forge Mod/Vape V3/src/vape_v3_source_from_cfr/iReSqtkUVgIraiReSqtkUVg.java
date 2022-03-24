/*
 * Decompiled with CFR 0.150.
 */
class iReSqtkUVgIraiReSqtkUVg
extends Thread {
    final /* synthetic */ iReSqtkUVgsLdiReSqtkUVg a;

    iReSqtkUVgIraiReSqtkUVg(iReSqtkUVgsLdiReSqtkUVg iReSqtkUVgsLdiReSqtkUVg2) {
        this.a = iReSqtkUVgsLdiReSqtkUVg2;
    }

    @Override
    public void run() {
        while (!iReSqtkUVgFuiiReSqtkUVg.e.g()) {
            try {
                Thread.sleep(5L);
                if (!this.a.b() || !iReSqtkUVgsLdiReSqtkUVg.g(this.a).i().booleanValue()) continue;
                iReSqtkUVgsLdiReSqtkUVg.h(this.a).a();
            }
            catch (Exception exception) {}
        }
    }
}

