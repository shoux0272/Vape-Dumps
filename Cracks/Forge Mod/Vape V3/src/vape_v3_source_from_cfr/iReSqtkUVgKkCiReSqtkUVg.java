/*
 * Decompiled with CFR 0.150.
 */
public class iReSqtkUVgKkCiReSqtkUVg
extends iReSqtkUVgJZmiReSqtkUVg {
    private iReSqtkUVgoRmiReSqtkUVg b = iReSqtkUVgoRmiReSqtkUVg.a((Object)this, "Speed Check", false, "Ignore falling when Speed is enabled.");
    private iReSqtkUVgkzHiReSqtkUVg c = iReSqtkUVgkzHiReSqtkUVg.a((Object)this, "Fall Dist", "#.#", "m", 0.1, 2.0, 5.0, "The amount of blocks to fall before attempting to lag back.");
    private iReSqtkUVgPzKiReSqtkUVg d = new iReSqtkUVgPzKiReSqtkUVg();
    private boolean e;

    public iReSqtkUVgKkCiReSqtkUVg() {
        super("AntiFall", 16028225, iReSqtkUVgqTOiReSqtkUVg.f, "Helps you with your Parkinson's\nPrevents you from falling into the void.");
        this.a(this.b, this.c);
    }

    @Override
    public boolean f() {
        return true;
    }

    @Override
    public void a(iReSqtkUVgTXviReSqtkUVg iReSqtkUVgTXviReSqtkUVg2) {
        iReSqtkUVgtlXiReSqtkUVg iReSqtkUVgtlXiReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.e();
        iReSqtkUVggvziReSqtkUVg iReSqtkUVggvziReSqtkUVg2 = iReSqtkUVgtlXiReSqtkUVg2.ag();
        if (iReSqtkUVgtlXiReSqtkUVg2.b() || iReSqtkUVggvziReSqtkUVg2.b() || iReSqtkUVgtlXiReSqtkUVg2.K() || iReSqtkUVgtlXiReSqtkUVg2.bg().d() || iReSqtkUVgtlXiReSqtkUVg2.bg().e() || iReSqtkUVgFuiiReSqtkUVg.e.d().b(iReSqtkUVgHyViReSqtkUVg.class) || this.b.i().booleanValue() && iReSqtkUVgFuiiReSqtkUVg.e.d().b(iReSqtkUVgkAWiReSqtkUVg.class)) {
            return;
        }
        if (iReSqtkUVgTXviReSqtkUVg2.getStage() == iReSqtkUVgBMviReSqtkUVg.a) {
            iReSqtkUVgGrkiReSqtkUVg iReSqtkUVgGrkiReSqtkUVg2;
            if (!this.e && this.x()) {
                return;
            }
            if (this.e && this.d.a(250L) || iReSqtkUVgtlXiReSqtkUVg2.am()) {
                this.e = false;
                this.d.b();
                return;
            }
            double d2 = this.c.i();
            if ((double)iReSqtkUVgtlXiReSqtkUVg2.ah() >= d2 && !iReSqtkUVgFuiiReSqtkUVg.e.d().a(iReSqtkUVgHyViReSqtkUVg.class).b() && ((iReSqtkUVgGrkiReSqtkUVg2 = iReSqtkUVggvziReSqtkUVg2.a(iReSqtkUVgtlXiReSqtkUVg2.z(), iReSqtkUVgtlXiReSqtkUVg2.A() - 1.0, iReSqtkUVgtlXiReSqtkUVg2.B())).b() || iReSqtkUVgGrkiReSqtkUVg2.e().a(iReSqtkUVgREtiReSqtkUVg.e().e().a().getClass()))) {
                if (!this.e) {
                    this.e = true;
                    this.d.b();
                } else {
                    iReSqtkUVgtlXiReSqtkUVg2.n().b(0.0f);
                    iReSqtkUVgtlXiReSqtkUVg2.n().a(0.0f);
                    iReSqtkUVgtlXiReSqtkUVg2.h(0.0);
                    iReSqtkUVgtlXiReSqtkUVg2.j(0.0);
                    iReSqtkUVgtlXiReSqtkUVg2.i(0.61765834912346);
                }
            }
        }
    }

    @Override
    public void a(iReSqtkUVgaWmiReSqtkUVg iReSqtkUVgaWmiReSqtkUVg2) {
        iReSqtkUVgtlXiReSqtkUVg iReSqtkUVgtlXiReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.e();
        if (iReSqtkUVgaWmiReSqtkUVg2.getPacket().b() || iReSqtkUVgtlXiReSqtkUVg2.b() || iReSqtkUVgtlXiReSqtkUVg2.ag().b()) {
            return;
        }
        if (iReSqtkUVgaWmiReSqtkUVg2.getPacket().a(iReSqtkUVgSzRiReSqtkUVg.cC)) {
            iReSqtkUVgtlXiReSqtkUVg2.k(0.0f);
            iReSqtkUVgtlXiReSqtkUVg2.h(0.0);
            iReSqtkUVgtlXiReSqtkUVg2.j(0.0);
            this.e = false;
            this.d.b();
        }
    }

    private boolean x() {
        iReSqtkUVgtlXiReSqtkUVg iReSqtkUVgtlXiReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.e();
        iReSqtkUVggvziReSqtkUVg iReSqtkUVggvziReSqtkUVg2 = iReSqtkUVgtlXiReSqtkUVg2.ag();
        for (double d2 = iReSqtkUVgtlXiReSqtkUVg2.A() - 1.0; d2 > 0.0; d2 -= 1.0) {
            iReSqtkUVgGrkiReSqtkUVg iReSqtkUVgGrkiReSqtkUVg2 = iReSqtkUVggvziReSqtkUVg2.a(iReSqtkUVgtlXiReSqtkUVg2.z(), d2, iReSqtkUVgtlXiReSqtkUVg2.B());
            if (iReSqtkUVgGrkiReSqtkUVg2.b() || iReSqtkUVgGrkiReSqtkUVg2.e().a(iReSqtkUVgREtiReSqtkUVg.e().e().a().getClass())) continue;
            return true;
        }
        return false;
    }
}

