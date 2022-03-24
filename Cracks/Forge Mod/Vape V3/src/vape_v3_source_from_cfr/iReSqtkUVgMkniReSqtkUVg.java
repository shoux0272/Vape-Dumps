/*
 * Decompiled with CFR 0.150.
 */
final class iReSqtkUVgMkniReSqtkUVg
extends iReSqtkUVgOkOiReSqtkUVg {
    final /* synthetic */ iReSqtkUVgwDGiReSqtkUVg h;

    iReSqtkUVgMkniReSqtkUVg(int n, iReSqtkUVgwDGiReSqtkUVg iReSqtkUVgwDGiReSqtkUVg2) {
        this.h = iReSqtkUVgwDGiReSqtkUVg2;
        super(n);
    }

    @Override
    public boolean a(char c2, int n) {
        if (n == 28 && !this.E().D().equals("")) {
            String string = this.E().D().replace("_", " ");
            this.h.b(string);
            this.E().a("");
            return true;
        }
        return super.a(c2, n);
    }
}

