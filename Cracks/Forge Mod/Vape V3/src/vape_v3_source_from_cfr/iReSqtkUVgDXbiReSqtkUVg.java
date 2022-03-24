/*
 * Decompiled with CFR 0.150.
 */
public class iReSqtkUVgDXbiReSqtkUVg
extends iReSqtkUVgJZmiReSqtkUVg {
    private iReSqtkUVgoRmiReSqtkUVg b = iReSqtkUVgoRmiReSqtkUVg.a((Object)this, "Limit Items", false, "Limits to whitelisted items only.");
    private iReSqtkUVgeMGiReSqtkUVg c = iReSqtkUVgeMGiReSqtkUVg.a((Object)this, "noslowdown-whitelist", "Whitelisted", iReSqtkUVgeMGiReSqtkUVg.a, new iReSqtkUVgDyziReSqtkUVg("swords"));
    private boolean d;

    public iReSqtkUVgDXbiReSqtkUVg() {
        super("NoSlowdown", 14828276, iReSqtkUVgqTOiReSqtkUVg.f, "Prevents slowing down when\nblocking or using items.");
        this.b.a(new iReSqtkUVgWaoiReSqtkUVg[]{this.c});
        this.a(this.b, this.c);
    }

    @Override
    public boolean f() {
        return true;
    }

    @Override
    public void a(iReSqtkUVgaWmiReSqtkUVg iReSqtkUVgaWmiReSqtkUVg2) {
        iReSqtkUVghnHiReSqtkUVg iReSqtkUVghnHiReSqtkUVg2 = iReSqtkUVgaWmiReSqtkUVg2.getPacket();
        if (iReSqtkUVghnHiReSqtkUVg2.a(iReSqtkUVgSzRiReSqtkUVg.cy)) {
            this.d = true;
        }
        if (iReSqtkUVghnHiReSqtkUVg2.a(iReSqtkUVgSzRiReSqtkUVg.cz)) {
            iReSqtkUVgTfviReSqtkUVg iReSqtkUVgTfviReSqtkUVg2 = new iReSqtkUVgTfviReSqtkUVg(iReSqtkUVghnHiReSqtkUVg2);
            iReSqtkUVgtlXiReSqtkUVg iReSqtkUVgtlXiReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.e();
            if (iReSqtkUVgTfviReSqtkUVg2.e() == iReSqtkUVgtlXiReSqtkUVg2.y()) {
                this.d = true;
            }
        }
    }

    @Override
    public void a(iReSqtkUVgTXviReSqtkUVg iReSqtkUVgTXviReSqtkUVg2) {
        iReSqtkUVgtlXiReSqtkUVg iReSqtkUVgtlXiReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.e();
        if (this.d) {
            if (iReSqtkUVgtlXiReSqtkUVg2.J()) {
                this.d = false;
            }
            return;
        }
        if (iReSqtkUVgtlXiReSqtkUVg2.as()) {
            return;
        }
        if (iReSqtkUVgTXviReSqtkUVg2.getStage() == iReSqtkUVgBMviReSqtkUVg.a) {
            double d2 = iReSqtkUVgtlXiReSqtkUVg2.n().i();
            double d3 = iReSqtkUVgtlXiReSqtkUVg2.n().h();
            float f = iReSqtkUVgtlXiReSqtkUVg2.F();
            if (!(!iReSqtkUVgtlXiReSqtkUVg2.bk() || this.b.i().booleanValue() && !this.c.a(iReSqtkUVgtlXiReSqtkUVg2.bd()) || Math.abs(d3) != (double)0.2f && Math.abs(d2) != (double)0.2f)) {
                if (iReSqtkUVgFuiiReSqtkUVg.e.d().b(iReSqtkUVgUiziReSqtkUVg.class)) {
                    iReSqtkUVgtlXiReSqtkUVg2.f(true);
                }
                if (Math.abs(d3) == (double)0.2f) {
                    if (d3 > 0.0) {
                        iReSqtkUVgtlXiReSqtkUVg2.n().a(1.0f);
                    } else if (d3 < 0.0) {
                        iReSqtkUVgtlXiReSqtkUVg2.n().a(-1.0f);
                    }
                }
                if (Math.abs(d2) == (double)0.2f) {
                    if (d2 > 0.0) {
                        iReSqtkUVgtlXiReSqtkUVg2.n().b(1.0f);
                    } else if (d2 < 0.0) {
                        iReSqtkUVgtlXiReSqtkUVg2.n().b(-1.0f);
                    }
                }
                if (Math.abs(iReSqtkUVgtlXiReSqtkUVg2.n().h()) != 1.0f && d2 > 0.0) {
                    d2 *= (double)1.3f;
                }
                d3 = d2 != 0.0 ? (d3 *= 0.5) : (d3 *= 0.85);
                iReSqtkUVgtlXiReSqtkUVg2.h(d2 * Math.cos(Math.toRadians(f + 90.0f)) + d3 * Math.sin(Math.toRadians(f + 90.0f)));
                iReSqtkUVgtlXiReSqtkUVg2.j(d2 * Math.sin(Math.toRadians(f + 90.0f)) - d3 * Math.cos(Math.toRadians(f + 90.0f)));
            }
        }
    }
}

