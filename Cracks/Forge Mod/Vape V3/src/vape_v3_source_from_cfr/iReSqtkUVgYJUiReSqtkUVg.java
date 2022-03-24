/*
 * Decompiled with CFR 0.150.
 */
public class iReSqtkUVgYJUiReSqtkUVg
implements Runnable {
    private iReSqtkUVgJZmiReSqtkUVg a;
    private long b;
    private boolean c;
    private boolean d = true;

    public iReSqtkUVgYJUiReSqtkUVg(iReSqtkUVgJZmiReSqtkUVg iReSqtkUVgJZmiReSqtkUVg2, long l, boolean bl) {
        this.a = iReSqtkUVgJZmiReSqtkUVg2;
        this.b = l;
        this.c = bl;
    }

    @Override
    public void run() {
        do {
            try {
                Thread.sleep(this.b);
                if (!this.a.b()) continue;
                this.a.q();
            }
            catch (Exception exception) {
                // empty catch block
            }
        } while (!iReSqtkUVgFuiiReSqtkUVg.e.g() && this.c && this.d);
    }

    public boolean a() {
        return this.d;
    }

    public void a(boolean bl) {
        this.d = bl;
    }
}

