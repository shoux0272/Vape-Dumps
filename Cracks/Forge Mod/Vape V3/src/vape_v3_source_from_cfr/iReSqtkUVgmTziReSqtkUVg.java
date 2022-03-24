/*
 * Decompiled with CFR 0.150.
 */
public class iReSqtkUVgmTziReSqtkUVg
extends iReSqtkUVgmupiReSqtkUVg {
    private iReSqtkUVghnHiReSqtkUVg b;

    public iReSqtkUVgmTziReSqtkUVg(Object object) {
        this.b = new iReSqtkUVghnHiReSqtkUVg(object);
    }

    public Object getPacketInstance() {
        return this.b.a();
    }

    public iReSqtkUVghnHiReSqtkUVg getPacket() {
        return this.b;
    }

    public void setPacket(iReSqtkUVghnHiReSqtkUVg iReSqtkUVghnHiReSqtkUVg2) {
        this.b = iReSqtkUVghnHiReSqtkUVg2;
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

