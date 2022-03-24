/*
 * Decompiled with CFR 0.150.
 */
public class iReSqtkUVglTuiReSqtkUVg
extends iReSqtkUVgmupiReSqtkUVg {
    private iReSqtkUVgTeniReSqtkUVg b;
    private Object c;

    public iReSqtkUVglTuiReSqtkUVg(iReSqtkUVgTeniReSqtkUVg iReSqtkUVgTeniReSqtkUVg2) {
        this.b = iReSqtkUVgTeniReSqtkUVg2;
        this.c = iReSqtkUVgTeniReSqtkUVg2.d();
    }

    @Override
    public boolean fire() {
        for (iReSqtkUVgJZmiReSqtkUVg iReSqtkUVgJZmiReSqtkUVg2 : iReSqtkUVgFuiiReSqtkUVg.e.d().d()) {
            if (!iReSqtkUVgJZmiReSqtkUVg2.b()) continue;
            iReSqtkUVgJZmiReSqtkUVg2.a(this);
        }
        return this.isCanceled();
    }

    public Object a() {
        return this.c;
    }

    public iReSqtkUVgTeniReSqtkUVg b() {
        return this.b;
    }
}

