/*
 * Decompiled with CFR 0.150.
 */
public class iReSqtkUVgkwciReSqtkUVg
extends iReSqtkUVgJZmiReSqtkUVg {
    private iReSqtkUVgoRmiReSqtkUVg b = iReSqtkUVgoRmiReSqtkUVg.a((Object)this, "Players only", true, "Only swap when attacking players.");
    private iReSqtkUVgoRmiReSqtkUVg c = iReSqtkUVgoRmiReSqtkUVg.a((Object)this, "Hand only", false, "Only swap when holding nothing.");

    public iReSqtkUVgkwciReSqtkUVg() {
        super("AutoSword", 6485058, iReSqtkUVgqTOiReSqtkUVg.f, "Automatically equips your sword when attacking entities.");
        this.a(this.b, this.c);
    }

    @Override
    public boolean f() {
        return true;
    }

    @Override
    public void a(iReSqtkUVgHbMiReSqtkUVg iReSqtkUVgHbMiReSqtkUVg2) {
        if ((!this.b.i().booleanValue() || iReSqtkUVgHbMiReSqtkUVg2.getTarget().a(iReSqtkUVgSzRiReSqtkUVg.B)) && !iReSqtkUVgHbMiReSqtkUVg2.isPre() && iReSqtkUVgeLLiReSqtkUVg.f().b()) {
            iReSqtkUVgtlXiReSqtkUVg iReSqtkUVgtlXiReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.e();
            if (!this.c.i().booleanValue() || iReSqtkUVgtlXiReSqtkUVg2.bd().b() || iReSqtkUVgtlXiReSqtkUVg2.bd().e().b()) {
                for (int i = 36; i < 45; ++i) {
                    iReSqtkUVgLUhiReSqtkUVg iReSqtkUVgLUhiReSqtkUVg2;
                    if (!iReSqtkUVgtlXiReSqtkUVg2.ba().a(i).f() || !(iReSqtkUVgLUhiReSqtkUVg2 = iReSqtkUVgtlXiReSqtkUVg2.ba().a(i).d().e()).a(iReSqtkUVgSzRiReSqtkUVg.J) || iReSqtkUVgtlXiReSqtkUVg2.aZ().d() == i - 36) continue;
                    iReSqtkUVgtlXiReSqtkUVg2.aZ().a(i - 36);
                    iReSqtkUVgtlXiReSqtkUVg2.d().a(iReSqtkUVgJmViReSqtkUVg.a(i - 36));
                    iReSqtkUVgeLLiReSqtkUVg.k().g();
                    break;
                }
            }
        }
    }
}

