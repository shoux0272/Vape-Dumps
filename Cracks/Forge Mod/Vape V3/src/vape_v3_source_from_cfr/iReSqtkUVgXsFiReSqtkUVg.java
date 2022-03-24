/*
 * Decompiled with CFR 0.150.
 */
public class iReSqtkUVgXsFiReSqtkUVg
extends iReSqtkUVgmupiReSqtkUVg {
    private iReSqtkUVgjSjiReSqtkUVg b;

    public iReSqtkUVgXsFiReSqtkUVg(iReSqtkUVgjSjiReSqtkUVg iReSqtkUVgjSjiReSqtkUVg2) {
        this.b = iReSqtkUVgjSjiReSqtkUVg2;
    }

    @Override
    public boolean fire() {
        for (iReSqtkUVgJZmiReSqtkUVg iReSqtkUVgJZmiReSqtkUVg2 : iReSqtkUVgFuiiReSqtkUVg.e.d().d()) {
            if (!iReSqtkUVgJZmiReSqtkUVg2.b()) continue;
            iReSqtkUVgJZmiReSqtkUVg2.a(this);
        }
        return this.isCanceled();
    }

    public iReSqtkUVgjSjiReSqtkUVg a() {
        return this.b;
    }
}

