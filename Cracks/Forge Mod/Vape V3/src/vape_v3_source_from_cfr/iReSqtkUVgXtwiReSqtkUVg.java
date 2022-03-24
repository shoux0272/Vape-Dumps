/*
 * Decompiled with CFR 0.150.
 */
public class iReSqtkUVgXtwiReSqtkUVg
extends iReSqtkUVgJZmiReSqtkUVg {
    private iReSqtkUVgzAciReSqtkUVg b = new iReSqtkUVgzAciReSqtkUVg("Normal");
    private iReSqtkUVgzAciReSqtkUVg c = new iReSqtkUVgzAciReSqtkUVg("Hypixel");
    private iReSqtkUVgZyLiReSqtkUVg d = iReSqtkUVgZyLiReSqtkUVg.a((Object)this, "Mode", "NoFall method to prevent you from taking fall damage.\nNormal - Works on vanilla/some anti-cheats (Does not Bypass Hypixel)\nHypixel - Bypasses Watchdog, may work on other anti-cheats", this.b, this.b, this.c);

    public iReSqtkUVgXtwiReSqtkUVg() {
        super("NoFall", 8919359, iReSqtkUVgqTOiReSqtkUVg.f, "Prevents taking fall damage.\nThis may not bypass AntiCheats.\n(Bypasses Hypixel)");
        ((iReSqtkUVgJCoiReSqtkUVg)this.d.c()).a(new iReSqtkUVgbZriReSqtkUVg(this));
        this.a(this.d);
    }

    @Override
    public boolean f() {
        return true;
    }

    @Override
    public void a(iReSqtkUVgTXviReSqtkUVg iReSqtkUVgTXviReSqtkUVg2) {
        boolean bl;
        iReSqtkUVgtlXiReSqtkUVg iReSqtkUVgtlXiReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.e();
        this.a(this.d.i().N());
        if (iReSqtkUVgtlXiReSqtkUVg2.b() || iReSqtkUVgtlXiReSqtkUVg2.ag().b() || iReSqtkUVgtlXiReSqtkUVg2.K() || iReSqtkUVgtlXiReSqtkUVg2.bg().d() || iReSqtkUVgtlXiReSqtkUVg2.bg().e() || iReSqtkUVgFuiiReSqtkUVg.e.d().b(iReSqtkUVgHyViReSqtkUVg.class)) {
            return;
        }
        boolean bl2 = bl = (double)iReSqtkUVgtlXiReSqtkUVg2.ah() > 2.224 && iReSqtkUVgtlXiReSqtkUVg2.D() < 0.0;
        if (this.d.i() == this.b) {
            if (iReSqtkUVgTXviReSqtkUVg2.getStage() == iReSqtkUVgBMviReSqtkUVg.a) {
                if (bl) {
                    iReSqtkUVgTXviReSqtkUVg2.setOnGround(true);
                    iReSqtkUVgtlXiReSqtkUVg2.g(10);
                    if (iReSqtkUVgeLLiReSqtkUVg.i().k().e()) {
                        iReSqtkUVgqzriReSqtkUVg.a(iReSqtkUVgeLLiReSqtkUVg.i().k().d(), false);
                        iReSqtkUVgqzriReSqtkUVg.a(iReSqtkUVgeLLiReSqtkUVg.i().k().d());
                    }
                }
            } else if (bl) {
                iReSqtkUVgtlXiReSqtkUVg2.g(false);
            }
        }
        if (this.d.i() == this.c && iReSqtkUVgTXviReSqtkUVg2.getStage() == iReSqtkUVgBMviReSqtkUVg.a && (double)iReSqtkUVgtlXiReSqtkUVg2.ah() > 2.224 && iReSqtkUVgtlXiReSqtkUVg2.D() < 0.0) {
            iReSqtkUVgtlXiReSqtkUVg2.d().a(iReSqtkUVgvBUiReSqtkUVg.a(true));
        }
    }

    static /* synthetic */ iReSqtkUVgZyLiReSqtkUVg a(iReSqtkUVgXtwiReSqtkUVg iReSqtkUVgXtwiReSqtkUVg2) {
        return iReSqtkUVgXtwiReSqtkUVg2.d;
    }
}

