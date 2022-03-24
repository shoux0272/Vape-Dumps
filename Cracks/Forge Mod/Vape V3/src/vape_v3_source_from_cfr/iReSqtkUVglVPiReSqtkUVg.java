/*
 * Decompiled with CFR 0.150.
 */
class iReSqtkUVglVPiReSqtkUVg
implements iReSqtkUVgycViReSqtkUVg {
    final /* synthetic */ iReSqtkUVgAAGiReSqtkUVg a;

    iReSqtkUVglVPiReSqtkUVg(iReSqtkUVgAAGiReSqtkUVg iReSqtkUVgAAGiReSqtkUVg2) {
        this.a = iReSqtkUVgAAGiReSqtkUVg2;
    }

    @Override
    public void a(int n, int n2, int n3) {
        String string = iReSqtkUVgAAGiReSqtkUVg.a(this.a).E().D();
        if (string.isEmpty() || iReSqtkUVgFuiiReSqtkUVg.e.l().a(string) != null) {
            return;
        }
        iReSqtkUVgAAGiReSqtkUVg.a(this.a).E().a("");
        if (string.startsWith("/")) {
            iReSqtkUVgAAGiReSqtkUVg.a(this.a, new iReSqtkUVghnYiReSqtkUVg(string));
        }
        if (string.equalsIgnoreCase("fishing rod")) {
            iReSqtkUVgAAGiReSqtkUVg.b(this.a, new iReSqtkUVglLjiReSqtkUVg(string));
            iReSqtkUVgAAGiReSqtkUVg.a(this.a, true);
        } else {
            iReSqtkUVgAAGiReSqtkUVg.b(this.a, new iReSqtkUVgZsZiReSqtkUVg(string));
            iReSqtkUVgAAGiReSqtkUVg.a(this.a, true);
        }
    }
}

