/*
 * Decompiled with CFR 0.150.
 */
class iReSqtkUVgdcAiReSqtkUVg
implements iReSqtkUVgycViReSqtkUVg {
    final /* synthetic */ iReSqtkUVgBVLiReSqtkUVg a;

    iReSqtkUVgdcAiReSqtkUVg(iReSqtkUVgBVLiReSqtkUVg iReSqtkUVgBVLiReSqtkUVg2) {
        this.a = iReSqtkUVgBVLiReSqtkUVg2;
    }

    @Override
    public void a(int n, int n2, int n3) {
        String string = iReSqtkUVgBVLiReSqtkUVg.a(this.a).E().D();
        if (string.isEmpty()) {
            return;
        }
        String[] arrstring = string.split(" ");
        if (string.contains(":")) {
            arrstring = string.split(":");
        }
        string = arrstring[0];
        String string2 = arrstring.length > 1 ? arrstring[1] : arrstring[0];
        iReSqtkUVgBVLiReSqtkUVg.a(this.a).E().a("");
        iReSqtkUVgMWviReSqtkUVg iReSqtkUVgMWviReSqtkUVg2 = iReSqtkUVgFuiiReSqtkUVg.e.j().a(string);
        if (iReSqtkUVgMWviReSqtkUVg2 != null) {
            iReSqtkUVgFuiiReSqtkUVg.e.j().b(iReSqtkUVgMWviReSqtkUVg2);
        }
        iReSqtkUVgMWviReSqtkUVg2 = new iReSqtkUVgMWviReSqtkUVg(string, string2);
        iReSqtkUVgFuiiReSqtkUVg.e.j().a(iReSqtkUVgMWviReSqtkUVg2);
    }
}

