/*
 * Decompiled with CFR 0.150.
 */
class iReSqtkUVggAziReSqtkUVg
extends Thread {
    final /* synthetic */ iReSqtkUVgPEJiReSqtkUVg a;

    iReSqtkUVggAziReSqtkUVg(iReSqtkUVgPEJiReSqtkUVg iReSqtkUVgPEJiReSqtkUVg2) {
        this.a = iReSqtkUVgPEJiReSqtkUVg2;
    }

    @Override
    public void run() {
        while (!iReSqtkUVgFuiiReSqtkUVg.e.g()) {
            try {
                Thread.sleep(5L);
                if (!this.a.b()) continue;
                this.a.x();
            }
            catch (Exception exception) {}
        }
    }
}

