/*
 * Decompiled with CFR 0.150.
 */
final class iReSqtkUVgbEriReSqtkUVg
extends iReSqtkUVgOkOiReSqtkUVg {
    final /* synthetic */ boolean h;
    final /* synthetic */ iReSqtkUVgeMGiReSqtkUVg p;
    final /* synthetic */ iReSqtkUVgbqSiReSqtkUVg q;

    iReSqtkUVgbEriReSqtkUVg(int n, boolean bl, iReSqtkUVgeMGiReSqtkUVg iReSqtkUVgeMGiReSqtkUVg2, iReSqtkUVgbqSiReSqtkUVg iReSqtkUVgbqSiReSqtkUVg2) {
        this.h = bl;
        this.p = iReSqtkUVgeMGiReSqtkUVg2;
        this.q = iReSqtkUVgbqSiReSqtkUVg2;
        super(n);
    }

    @Override
    public boolean a(char c2, int n) {
        if (n == 28 && !this.E().D().equals("")) {
            String string = this.E().D().replace("_", " ");
            if (this.h) {
                this.p.a(new iReSqtkUVgDyziReSqtkUVg(string, this.q.G().intValue()));
            } else {
                this.p.a(new iReSqtkUVgDyziReSqtkUVg(string, -1));
            }
            this.E().a("");
            return true;
        }
        return super.a(c2, n);
    }
}

