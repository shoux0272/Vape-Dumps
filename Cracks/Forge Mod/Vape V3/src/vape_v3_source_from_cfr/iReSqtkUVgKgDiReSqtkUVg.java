/*
 * Decompiled with CFR 0.150.
 */
public class iReSqtkUVgKgDiReSqtkUVg
extends iReSqtkUVgJZmiReSqtkUVg {
    private iReSqtkUVgkzHiReSqtkUVg b = iReSqtkUVgkzHiReSqtkUVg.a((Object)this, "Delay", "#", "", 0.0, 1.0, 4.0, 1.0);
    private iReSqtkUVgzAciReSqtkUVg c = new iReSqtkUVgzAciReSqtkUVg("All");
    private iReSqtkUVgzAciReSqtkUVg d = new iReSqtkUVgzAciReSqtkUVg("Blocks");
    private iReSqtkUVgzAciReSqtkUVg e = new iReSqtkUVgzAciReSqtkUVg("Projectiles");
    private iReSqtkUVgZyLiReSqtkUVg f = iReSqtkUVgZyLiReSqtkUVg.a((Object)this, "Held Item", "What kind of items should FastPlace function with?\nAll - All items/blocks\nBlocks - All blocks\nProjectiles - Snowballs & Eggs", this.c, this.c, this.d, this.e);

    public iReSqtkUVgKgDiReSqtkUVg() {
        super("FastPlace", -16384224, iReSqtkUVgqTOiReSqtkUVg.g, "Changes the block place delay.");
        this.a(this.f, this.b);
    }

    @Override
    public void a(iReSqtkUVgYAGiReSqtkUVg iReSqtkUVgYAGiReSqtkUVg2) {
        if (iReSqtkUVgYAGiReSqtkUVg2.getStage() != iReSqtkUVgBMviReSqtkUVg.a) {
            return;
        }
        if (iReSqtkUVgeLLiReSqtkUVg.e().b()) {
            return;
        }
        iReSqtkUVgyetiReSqtkUVg iReSqtkUVgyetiReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.e().bd();
        if (this.f.i() == this.d && iReSqtkUVgyetiReSqtkUVg2.c() && iReSqtkUVgyetiReSqtkUVg2.e().c() && !iReSqtkUVgyetiReSqtkUVg2.e().a(iReSqtkUVgSzRiReSqtkUVg.ax)) {
            return;
        }
        if (this.f.i() == this.e && iReSqtkUVgyetiReSqtkUVg2.c() && iReSqtkUVgyetiReSqtkUVg2.e().c() && !iReSqtkUVgpjfiReSqtkUVg.a(iReSqtkUVgyetiReSqtkUVg2.e())) {
            return;
        }
        if ((double)iReSqtkUVgeLLiReSqtkUVg.x() > this.b.i()) {
            iReSqtkUVgeLLiReSqtkUVg.c(this.b.i().intValue());
        }
    }
}

