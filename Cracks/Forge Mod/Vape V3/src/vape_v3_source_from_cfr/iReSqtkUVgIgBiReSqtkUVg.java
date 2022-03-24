/*
 * Decompiled with CFR 0.150.
 */
class iReSqtkUVgIgBiReSqtkUVg
extends Thread {
    final /* synthetic */ iReSqtkUVgCmliReSqtkUVg a;

    iReSqtkUVgIgBiReSqtkUVg(iReSqtkUVgCmliReSqtkUVg iReSqtkUVgCmliReSqtkUVg2) {
        this.a = iReSqtkUVgCmliReSqtkUVg2;
    }

    @Override
    public void run() {
        while (!iReSqtkUVgFuiiReSqtkUVg.e.g()) {
            try {
                Thread.sleep(1L);
                if (!this.a.b()) continue;
                iReSqtkUVgCmliReSqtkUVg.a(this.a);
            }
            catch (Exception exception) {}
        }
    }
}

