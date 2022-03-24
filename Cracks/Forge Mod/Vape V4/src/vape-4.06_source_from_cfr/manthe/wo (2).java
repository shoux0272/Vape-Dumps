/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.awt.Color;
import manthe.DY;
import manthe.k9;
import manthe.mq;
import manthe.pe;
import manthe.w7;
import manthe.wB;
import manthe.yV;
import manthe.zu;

public class wo
extends w7 {
    private DY G;
    private wB H;

    public wo(DY dY2) {
        this.G = dY2;
        this.c(new yV(this));
        this.H = new wB(this);
        zu.T().add(this.H);
    }

    @Override
    public void a() {
        this.o();
        this.H.n();
        mq mq2 = this.e(0.9);
        mq mq3 = this.e(0.75);
        Color color = wo.b.k;
        Color color2 = this.P() ? wo.b.c : (this.O() ? wo.b.c : wo.b.r);
        double d10 = mq2.a("Targets");
        double d11 = this.c() + this.f() / 2.0 - d10 / 2.0 - 2.5 - 2.0;
        double d12 = d11 + 7.5 + 1.0;
        pe.a(this.d() + 5.0, this.c() + 2.5, this.e() - 10.0, this.f() - 5.0, this.O() ? b.e() : this.N().q());
        pe.a(this.d() + 5.0 + 0.5, this.c() + 2.5 + 0.5, this.e() - 10.0 - 1.0, this.f() - 5.0 - 1.0, color);
        double d13 = this.d() + 10.0 - 2.0;
        float f10 = 6.0f;
        mq2.a("Target:", d13, d11 + 1.0, color2);
        d13 += 2.5 + mq2.b("Target:");
        if (this.G.r().e().u().booleanValue()) {
            k9.a(color2, (float)d13, (float)d11, "newplayers", f10, f10, false);
            d13 += (double)(2.5f + f10);
        }
        if (this.G.r().i().u().booleanValue()) {
            k9.a(color2, (float)d13, (float)d11, "newmobs", f10, f10, false);
            d13 += (double)(2.5f + f10);
        }
        if (this.G.r().b().u().booleanValue()) {
            k9.a(color2, (float)d13, (float)d11, "newpeaceful", f10, f10, false);
            d13 += (double)(2.5f + f10);
        }
        if (this.G.r().h().u().booleanValue()) {
            k9.a(color2, (float)d13, (float)d11, "newneutral", f10, f10, false);
        }
        StringBuilder stringBuilder = new StringBuilder();
        if (this.G.r().d().u().booleanValue()) {
            stringBuilder.append("invisible, ");
        }
        if (this.G.r().g().u().booleanValue()) {
            stringBuilder.append("naked, ");
        }
        if (this.G.r().a().u().booleanValue()) {
            stringBuilder.append("behind walls, ");
        }
        String string = stringBuilder.length() < 1 ? "none" : stringBuilder.substring(0, stringBuilder.length() - 2);
        mq3.a("Ignore " + string, this.d() + 10.0 - 2.0, d12, wo.b.r);
    }

    public DY Q() {
        return this.G;
    }
}

