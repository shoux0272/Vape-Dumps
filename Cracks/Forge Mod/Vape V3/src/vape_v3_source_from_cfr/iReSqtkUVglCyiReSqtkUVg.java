/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

public class iReSqtkUVglCyiReSqtkUVg
extends iReSqtkUVgJZmiReSqtkUVg {
    private iReSqtkUVgPzKiReSqtkUVg b = new iReSqtkUVgPzKiReSqtkUVg();
    private iReSqtkUVgPzKiReSqtkUVg c = new iReSqtkUVgPzKiReSqtkUVg();
    private iReSqtkUVgqzriReSqtkUVg[] d;
    private iReSqtkUVgqzriReSqtkUVg e;
    private Random f = new Random();
    private iReSqtkUVgkzHiReSqtkUVg g = iReSqtkUVgkzHiReSqtkUVg.a((Object)this, "Frequency", "##", "", 1.0, 30.0, 200.0, "How often you will move");

    public iReSqtkUVglCyiReSqtkUVg() {
        super("Anti-AFK", 9782004, iReSqtkUVgqTOiReSqtkUVg.a);
        iReSqtkUVgmCeiReSqtkUVg iReSqtkUVgmCeiReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.i();
        this.d = new iReSqtkUVgqzriReSqtkUVg[]{iReSqtkUVgmCeiReSqtkUVg2.g(), iReSqtkUVgmCeiReSqtkUVg2.h(), iReSqtkUVgmCeiReSqtkUVg2.i(), iReSqtkUVgmCeiReSqtkUVg2.j()};
        this.a(this.g);
    }

    @Override
    public void a(iReSqtkUVglBNiReSqtkUVg iReSqtkUVglBNiReSqtkUVg2) {
        if (iReSqtkUVgeLLiReSqtkUVg.f().a(iReSqtkUVgSzRiReSqtkUVg.bm)) {
            return;
        }
        if (this.e == null) {
            if (iReSqtkUVgeLLiReSqtkUVg.e().o() != 0.0f || iReSqtkUVgeLLiReSqtkUVg.e().aI() != 0.0f) {
                return;
            }
            if (this.b.a(this.g.i().longValue() * 1000L + (long)this.f.nextInt(4000))) {
                this.e = this.d[this.f.nextInt(this.d.length)];
                iReSqtkUVgqzriReSqtkUVg.a(this.e.d(), true);
                iReSqtkUVgqzriReSqtkUVg.a(this.e.d());
                this.c.b();
            }
        } else if (this.c.a(this.f.nextInt(50))) {
            iReSqtkUVgqzriReSqtkUVg.a(this.e.d(), false);
            this.e = null;
            this.b.b();
        }
    }
}

