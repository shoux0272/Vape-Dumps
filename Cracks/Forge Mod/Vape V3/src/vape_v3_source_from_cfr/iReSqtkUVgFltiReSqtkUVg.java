/*
 * Decompiled with CFR 0.150.
 */
public class iReSqtkUVgFltiReSqtkUVg
extends iReSqtkUVgmupiReSqtkUVg {
    private iReSqtkUVgNWJiReSqtkUVg b;

    public iReSqtkUVgFltiReSqtkUVg(iReSqtkUVgNWJiReSqtkUVg iReSqtkUVgNWJiReSqtkUVg2) {
        this.b = iReSqtkUVgNWJiReSqtkUVg2;
    }

    @Override
    public boolean fire() {
        for (iReSqtkUVgJZmiReSqtkUVg iReSqtkUVgJZmiReSqtkUVg2 : iReSqtkUVgFuiiReSqtkUVg.e.d().d()) {
            if (!iReSqtkUVgJZmiReSqtkUVg2.b()) continue;
            iReSqtkUVgJZmiReSqtkUVg2.a(this);
        }
        return this.isCanceled();
    }

    public void a(iReSqtkUVgNWJiReSqtkUVg iReSqtkUVgNWJiReSqtkUVg2) {
        this.b = iReSqtkUVgNWJiReSqtkUVg2;
    }

    public iReSqtkUVgNWJiReSqtkUVg a() {
        return this.b;
    }
}

