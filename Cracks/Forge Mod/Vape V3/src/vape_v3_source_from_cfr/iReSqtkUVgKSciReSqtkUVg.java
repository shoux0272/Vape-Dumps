/*
 * Decompiled with CFR 0.150.
 */
class iReSqtkUVgKSciReSqtkUVg
implements iReSqtkUVgycViReSqtkUVg {
    final /* synthetic */ iReSqtkUVgOkOiReSqtkUVg a;
    final /* synthetic */ iReSqtkUVggAtiReSqtkUVg b;
    final /* synthetic */ iReSqtkUVgOtjiReSqtkUVg c;

    iReSqtkUVgKSciReSqtkUVg(iReSqtkUVgOtjiReSqtkUVg iReSqtkUVgOtjiReSqtkUVg2, iReSqtkUVgOkOiReSqtkUVg iReSqtkUVgOkOiReSqtkUVg2, iReSqtkUVggAtiReSqtkUVg iReSqtkUVggAtiReSqtkUVg2) {
        this.c = iReSqtkUVgOtjiReSqtkUVg2;
        this.a = iReSqtkUVgOkOiReSqtkUVg2;
        this.b = iReSqtkUVggAtiReSqtkUVg2;
    }

    @Override
    public void a(int n, int n2, int n3) {
        String string = this.a.E().D();
        if (this.b.x().b(string) || this.b.y().b(string)) {
            iReSqtkUVgOtjiReSqtkUVg.a(this.c).b();
            iReSqtkUVgOtjiReSqtkUVg.b(this.c).a("This item already exists.");
            return;
        }
        this.a.E().a("");
        this.b.y().a(string, -1);
    }
}

