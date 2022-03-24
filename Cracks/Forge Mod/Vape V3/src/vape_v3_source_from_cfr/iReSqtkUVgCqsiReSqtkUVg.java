/*
 * Decompiled with CFR 0.150.
 */
public class iReSqtkUVgCqsiReSqtkUVg
extends iReSqtkUVgJZmiReSqtkUVg {
    private boolean b;

    public iReSqtkUVgCqsiReSqtkUVg() {
        super("PotionSaver", -256, iReSqtkUVgqTOiReSqtkUVg.f, "Saves your potion effect(s) duration when standing still");
    }

    @Override
    public boolean f() {
        return true;
    }

    @Override
    public void a(iReSqtkUVgmTziReSqtkUVg iReSqtkUVgmTziReSqtkUVg2) {
        iReSqtkUVgtlXiReSqtkUVg iReSqtkUVgtlXiReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.e();
        if (iReSqtkUVgtlXiReSqtkUVg2.c() && !iReSqtkUVgtlXiReSqtkUVg2.aW().isEmpty() && !this.a(iReSqtkUVgtlXiReSqtkUVg2) && (iReSqtkUVgtlXiReSqtkUVg2.J() || iReSqtkUVgtlXiReSqtkUVg2.am())) {
            if (iReSqtkUVgmTziReSqtkUVg2.getPacket().a(iReSqtkUVgSzRiReSqtkUVg.cn)) {
                this.b = true;
                iReSqtkUVgmTziReSqtkUVg2.setCanceled(true);
            }
        } else {
            this.b = false;
        }
    }

    private boolean a(iReSqtkUVgtlXiReSqtkUVg iReSqtkUVgtlXiReSqtkUVg2) {
        return iReSqtkUVgtlXiReSqtkUVg2.C() != 0.0 || iReSqtkUVgtlXiReSqtkUVg2.E() != 0.0;
    }

    @Override
    public int d() {
        return this.b ? -256 : iReSqtkUVgLHHiReSqtkUVg.a(160);
    }
}

