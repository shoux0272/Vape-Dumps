/*
 * Decompiled with CFR 0.150.
 */
class iReSqtkUVgomQiReSqtkUVg
extends Thread {
    final /* synthetic */ iReSqtkUVgilmiReSqtkUVg a;
    final /* synthetic */ String b;
    final /* synthetic */ long c;
    final /* synthetic */ String d;
    final /* synthetic */ iReSqtkUVgiSWiReSqtkUVg e;

    iReSqtkUVgomQiReSqtkUVg(iReSqtkUVgiSWiReSqtkUVg iReSqtkUVgiSWiReSqtkUVg2, iReSqtkUVgilmiReSqtkUVg iReSqtkUVgilmiReSqtkUVg2, String string, long l, String string2) {
        this.e = iReSqtkUVgiSWiReSqtkUVg2;
        this.a = iReSqtkUVgilmiReSqtkUVg2;
        this.b = string;
        this.c = l;
        this.d = string2;
    }

    @Override
    public void run() {
        this.a.a(this.b);
        try {
            Thread.sleep(this.c);
        }
        catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
        }
        this.a.a(this.d);
    }
}

