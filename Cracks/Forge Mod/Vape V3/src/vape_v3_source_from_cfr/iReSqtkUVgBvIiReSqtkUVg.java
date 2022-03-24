/*
 * Decompiled with CFR 0.150.
 */
public class iReSqtkUVgBvIiReSqtkUVg
extends iReSqtkUVgmupiReSqtkUVg {
    private iReSqtkUVgjSjiReSqtkUVg b;
    private static float c;

    public iReSqtkUVgBvIiReSqtkUVg(int n, Object object) {
        this.b = new iReSqtkUVgjSjiReSqtkUVg(object);
        this.a = n;
        if (n == iReSqtkUVgBMviReSqtkUVg.a) {
            c = this.b.ak();
        }
    }

    @Override
    public boolean fire() {
        for (iReSqtkUVgJZmiReSqtkUVg iReSqtkUVgJZmiReSqtkUVg2 : iReSqtkUVgFuiiReSqtkUVg.e.d().d()) {
            if (!iReSqtkUVgJZmiReSqtkUVg2.b()) continue;
            iReSqtkUVgJZmiReSqtkUVg2.a(this);
        }
        return this.isCanceled();
    }

    public double a() {
        return this.b.ak();
    }

    public void a(double d2) {
        this.b.l((float)d2);
    }

    public double b() {
        return c;
    }

    static /* synthetic */ float c() {
        return c;
    }
}

