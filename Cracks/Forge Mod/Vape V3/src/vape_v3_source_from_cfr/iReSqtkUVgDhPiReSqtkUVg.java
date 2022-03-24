/*
 * Decompiled with CFR 0.150.
 */
public class iReSqtkUVgDhPiReSqtkUVg
extends iReSqtkUVgncDiReSqtkUVg {
    private iReSqtkUVgjSjiReSqtkUVg b;

    public iReSqtkUVgDhPiReSqtkUVg(iReSqtkUVgfipiReSqtkUVg iReSqtkUVgfipiReSqtkUVg2, iReSqtkUVgjSjiReSqtkUVg iReSqtkUVgjSjiReSqtkUVg2) {
        super(iReSqtkUVgfipiReSqtkUVg2);
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

