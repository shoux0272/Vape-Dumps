/*
 * Decompiled with CFR 0.150.
 */
class iReSqtkUVgbRDiReSqtkUVg
extends Thread {
    final /* synthetic */ String a;
    final /* synthetic */ long b;
    final /* synthetic */ iReSqtkUVgYTjiReSqtkUVg c;

    iReSqtkUVgbRDiReSqtkUVg(iReSqtkUVgYTjiReSqtkUVg iReSqtkUVgYTjiReSqtkUVg2, String string, long l) {
        this.c = iReSqtkUVgYTjiReSqtkUVg2;
        this.a = string;
        this.b = l;
    }

    @Override
    public void run() {
        this.c.G().D().a(this.a);
        try {
            Thread.sleep(this.b);
        }
        catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
        }
        this.c.G().D().a(iReSqtkUVgYTjiReSqtkUVg.f(this.c).N());
    }
}

