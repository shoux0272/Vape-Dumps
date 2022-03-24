/*
 * Decompiled with CFR 0.150.
 */
public class iReSqtkUVgQgQiReSqtkUVg
extends iReSqtkUVgmupiReSqtkUVg {
    private iReSqtkUVgjSjiReSqtkUVg b;
    private boolean c;

    public iReSqtkUVgQgQiReSqtkUVg(Object object, boolean bl) {
        this.b = new iReSqtkUVgjSjiReSqtkUVg(object);
        this.c = bl;
    }

    public iReSqtkUVgjSjiReSqtkUVg getEntity() {
        return this.b;
    }

    public boolean isNewStateSprinting() {
        return this.c;
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

