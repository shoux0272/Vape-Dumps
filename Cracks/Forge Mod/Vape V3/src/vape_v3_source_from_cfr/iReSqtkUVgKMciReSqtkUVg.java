/*
 * Decompiled with CFR 0.150.
 */
class iReSqtkUVgKMciReSqtkUVg
extends Thread {
    final /* synthetic */ iReSqtkUVgPZjiReSqtkUVg a;

    iReSqtkUVgKMciReSqtkUVg(iReSqtkUVgPZjiReSqtkUVg iReSqtkUVgPZjiReSqtkUVg2) {
        this.a = iReSqtkUVgPZjiReSqtkUVg2;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000L);
        }
        catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
        }
        this.a.b.a_("Copy profile UUID");
    }
}

