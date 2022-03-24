/*
 * Decompiled with CFR 0.150.
 */
import a.a;

class iReSqtkUVgwOFiReSqtkUVg
extends iReSqtkUVgilmiReSqtkUVg {
    final /* synthetic */ iReSqtkUVgcvhiReSqtkUVg h;

    iReSqtkUVgwOFiReSqtkUVg(iReSqtkUVgcvhiReSqtkUVg iReSqtkUVgcvhiReSqtkUVg2, String string, int n, double d2) {
        this.h = iReSqtkUVgcvhiReSqtkUVg2;
        super(string, n, d2);
    }

    @Override
    public String D() {
        boolean bl = a.a.ib();
        if (this.h instanceof iReSqtkUVgYTjiReSqtkUVg) {
            iReSqtkUVgYTjiReSqtkUVg iReSqtkUVgYTjiReSqtkUVg2 = (iReSqtkUVgYTjiReSqtkUVg)this.h;
            if (iReSqtkUVgYTjiReSqtkUVg2.D() != null && iReSqtkUVgYTjiReSqtkUVg2.D().f() && !bl) {
                return "Requires blatant mode";
            }
            if (iReSqtkUVgYTjiReSqtkUVg2.D() != null && iReSqtkUVgYTjiReSqtkUVg2.D().r() && iReSqtkUVgYTjiReSqtkUVg2.D().I().isEmpty()) {
                return "Must be bound";
            }
        }
        if (this.h.B() && !bl) {
            return "Requires blatant mode";
        }
        return super.D();
    }
}

