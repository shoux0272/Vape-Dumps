/*
 * Decompiled with CFR 0.150.
 */
class iReSqtkUVgnFxiReSqtkUVg
extends Thread {
    final /* synthetic */ iReSqtkUVgMQLiReSqtkUVg a;

    iReSqtkUVgnFxiReSqtkUVg(iReSqtkUVgMQLiReSqtkUVg iReSqtkUVgMQLiReSqtkUVg2) {
        this.a = iReSqtkUVgMQLiReSqtkUVg2;
    }

    @Override
    public void run() {
        while (!iReSqtkUVgFuiiReSqtkUVg.e.g()) {
            try {
                Thread.sleep(50L);
                if (!this.a.b()) continue;
                iReSqtkUVgMQLiReSqtkUVg.a(this.a);
            }
            catch (Exception exception) {}
        }
    }
}

