/*
 * Decompiled with CFR 0.150.
 */
import java.awt.Color;

public class iReSqtkUVgucxiReSqtkUVg
extends iReSqtkUVgJZmiReSqtkUVg {
    private iReSqtkUVgzAciReSqtkUVg b = new iReSqtkUVgzAciReSqtkUVg("Packet");
    private iReSqtkUVgzAciReSqtkUVg c = new iReSqtkUVgzAciReSqtkUVg("Hypixel");
    private iReSqtkUVgZyLiReSqtkUVg d = iReSqtkUVgZyLiReSqtkUVg.a((Object)this, "Mode", "Criticals bypass method\nPacket - May not bypass anti-cheats, watchdog detected.\nHypixel - Watchdog bypassing Criticals mode.\nHypixel mode does not work separate from Killaura.", this.b, this.b, this.c);

    public iReSqtkUVgucxiReSqtkUVg() {
        super("Criticals", new Color(193, 183, 92).getRGB(), iReSqtkUVgqTOiReSqtkUVg.f, "Forces critical hit every attack\nMay not bypass anti-cheats");
        this.a(this.d);
        ((iReSqtkUVgJCoiReSqtkUVg)this.d.c()).a(new iReSqtkUVgcAciReSqtkUVg(this));
    }

    public boolean x() {
        return this.d.i() == this.c && this.b() && iReSqtkUVgauSiReSqtkUVg.d() > 13;
    }

    @Override
    public boolean f() {
        return true;
    }

    @Override
    public void a(iReSqtkUVgHbMiReSqtkUVg iReSqtkUVgHbMiReSqtkUVg2) {
        if (this.d.i() == this.b && iReSqtkUVgHbMiReSqtkUVg2.getStage() == iReSqtkUVgBMviReSqtkUVg.a) {
            iReSqtkUVgFuiiReSqtkUVg iReSqtkUVgFuiiReSqtkUVg2 = iReSqtkUVgFuiiReSqtkUVg.e;
            iReSqtkUVgtlXiReSqtkUVg iReSqtkUVgtlXiReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.e();
            if (iReSqtkUVgtlXiReSqtkUVg2.am()) {
                if (iReSqtkUVgFuiiReSqtkUVg2.d().b(iReSqtkUVgkAWiReSqtkUVg.class) || iReSqtkUVgFuiiReSqtkUVg2.d().b(iReSqtkUVgHyViReSqtkUVg.class) || iReSqtkUVgFuiiReSqtkUVg2.d().b(iReSqtkUVgoUdiReSqtkUVg.class)) {
                    return;
                }
                if (!iReSqtkUVgHbMiReSqtkUVg2.getTarget().b() && iReSqtkUVgHbMiReSqtkUVg2.getTarget().a(iReSqtkUVgSzRiReSqtkUVg.n)) {
                    iReSqtkUVgVnKiReSqtkUVg iReSqtkUVgVnKiReSqtkUVg2 = new iReSqtkUVgVnKiReSqtkUVg(iReSqtkUVgHbMiReSqtkUVg2.getTarget().a());
                    if (iReSqtkUVgVnKiReSqtkUVg2.a(iReSqtkUVgSzRiReSqtkUVg.B) && iReSqtkUVgFuiiReSqtkUVg2.j().a(iReSqtkUVgVnKiReSqtkUVg2)) {
                        return;
                    }
                    this.a(iReSqtkUVgtlXiReSqtkUVg2);
                }
            }
        }
    }

    private void a(iReSqtkUVgtlXiReSqtkUVg iReSqtkUVgtlXiReSqtkUVg2) {
        for (double d2 : new double[]{0.0654223451234, 5.78128675E-4}) {
            if (iReSqtkUVgauSiReSqtkUVg.d() > 13) {
                iReSqtkUVgtlXiReSqtkUVg2.d().a(iReSqtkUVgGzHiReSqtkUVg.a(iReSqtkUVgtlXiReSqtkUVg2.z(), iReSqtkUVgtlXiReSqtkUVg2.A() + d2, iReSqtkUVgtlXiReSqtkUVg2.B(), false));
                continue;
            }
            iReSqtkUVgtlXiReSqtkUVg2.d().a(iReSqtkUVgGzHiReSqtkUVg.a(iReSqtkUVgtlXiReSqtkUVg2.z(), iReSqtkUVgtlXiReSqtkUVg2.V().e() + d2, iReSqtkUVgtlXiReSqtkUVg2.A() + d2, iReSqtkUVgtlXiReSqtkUVg2.B(), false));
        }
    }

    static /* synthetic */ iReSqtkUVgZyLiReSqtkUVg a(iReSqtkUVgucxiReSqtkUVg iReSqtkUVgucxiReSqtkUVg2) {
        return iReSqtkUVgucxiReSqtkUVg2.d;
    }
}

