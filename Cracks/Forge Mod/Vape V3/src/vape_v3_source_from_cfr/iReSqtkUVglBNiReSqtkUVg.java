/*
 * Decompiled with CFR 0.150.
 */
public class iReSqtkUVglBNiReSqtkUVg
extends iReSqtkUVgmupiReSqtkUVg {
    private iReSqtkUVgDfKiReSqtkUVg b;

    public iReSqtkUVglBNiReSqtkUVg(iReSqtkUVgDfKiReSqtkUVg iReSqtkUVgDfKiReSqtkUVg2, int n) {
        this.b = iReSqtkUVgDfKiReSqtkUVg2;
        this.a = n;
    }

    @Override
    public boolean fire() {
        for (iReSqtkUVgJZmiReSqtkUVg iReSqtkUVgJZmiReSqtkUVg2 : iReSqtkUVgFuiiReSqtkUVg.e.d().d()) {
            if (!iReSqtkUVgJZmiReSqtkUVg2.b()) continue;
            if (this.getStage() == iReSqtkUVgBMviReSqtkUVg.a) {
                iReSqtkUVgJZmiReSqtkUVg2.a(this);
                continue;
            }
            iReSqtkUVgJZmiReSqtkUVg2.b(this);
        }
        return this.isCanceled();
    }

    public iReSqtkUVgDfKiReSqtkUVg a() {
        return this.b;
    }
}

