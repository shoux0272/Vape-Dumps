/*
 * Decompiled with CFR 0.150.
 */
class iReSqtkUVgENRiReSqtkUVg
implements iReSqtkUVgFeuiReSqtkUVg {
    final /* synthetic */ iReSqtkUVgFWjiReSqtkUVg a;
    final /* synthetic */ iReSqtkUVgYAniReSqtkUVg b;

    iReSqtkUVgENRiReSqtkUVg(iReSqtkUVgYAniReSqtkUVg iReSqtkUVgYAniReSqtkUVg2, iReSqtkUVgFWjiReSqtkUVg iReSqtkUVgFWjiReSqtkUVg2) {
        this.b = iReSqtkUVgYAniReSqtkUVg2;
        this.a = iReSqtkUVgFWjiReSqtkUVg2;
    }

    public void a(iReSqtkUVgnCWiReSqtkUVg iReSqtkUVgnCWiReSqtkUVg2) {
        long l = iReSqtkUVgYAniReSqtkUVg.a(this.b) - System.currentTimeMillis();
        if (l > 0L) {
            if (l >= 57000L) {
                this.a.D().a("Saved!");
            } else {
                this.a.D().a("Wait " + l / 1000L + " second" + (l >= 1000L && l < 2000L ? "" : "s"));
            }
        } else {
            this.a.D().a("Sync Settings");
        }
    }
}

