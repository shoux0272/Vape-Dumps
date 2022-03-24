/*
 * Decompiled with CFR 0.150.
 */
public class iReSqtkUVgkqhiReSqtkUVg
extends iReSqtkUVgncDiReSqtkUVg {
    private iReSqtkUVgULCiReSqtkUVg b;

    public iReSqtkUVgkqhiReSqtkUVg(iReSqtkUVgULCiReSqtkUVg iReSqtkUVgULCiReSqtkUVg2) {
        super(iReSqtkUVgULCiReSqtkUVg2);
        this.b = iReSqtkUVgULCiReSqtkUVg2;
    }

    @Override
    public boolean fire() {
        for (iReSqtkUVgJZmiReSqtkUVg iReSqtkUVgJZmiReSqtkUVg2 : iReSqtkUVgFuiiReSqtkUVg.e.d().e()) {
            iReSqtkUVgJZmiReSqtkUVg2.a(this);
        }
        return this.isCanceled();
    }

    public iReSqtkUVgDfKiReSqtkUVg a() {
        return this.b.h();
    }

    public iReSqtkUVghfWiReSqtkUVg b() {
        return this.b.d();
    }

    public float c() {
        return this.b.e();
    }
}

