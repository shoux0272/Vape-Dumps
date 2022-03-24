/*
 * Decompiled with CFR 0.150.
 */
public class iReSqtkUVgHbMiReSqtkUVg
extends iReSqtkUVgmupiReSqtkUVg {
    private iReSqtkUVgjSjiReSqtkUVg b;

    public iReSqtkUVgHbMiReSqtkUVg(Object object, int n) {
        this.b = new iReSqtkUVgjSjiReSqtkUVg(object);
        this.a = n;
    }

    public iReSqtkUVgjSjiReSqtkUVg getTarget() {
        return this.b;
    }

    @Override
    public boolean fire() {
        for (iReSqtkUVgJZmiReSqtkUVg iReSqtkUVgJZmiReSqtkUVg2 : iReSqtkUVgFuiiReSqtkUVg.e.d().d()) {
            if (!iReSqtkUVgJZmiReSqtkUVg2.b()) continue;
            iReSqtkUVgJZmiReSqtkUVg2.a(this);
        }
        return this.isCanceled();
    }
}

