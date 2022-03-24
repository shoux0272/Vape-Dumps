/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.awt.Color;
import manthe.bu;
import manthe.ct;
import manthe.k9;
import manthe.mq;
import manthe.on;
import manthe.pe;
import manthe.qw;
import manthe.w7;
import manthe.wR;
import manthe.zu;

public class wQ
extends w7 {
    private String I;
    private wR H;
    bu G = on.p.d();

    public wQ() {
        this.c(new ct(this));
        this.I = "Search blocks";
        this.H = new wR(this);
        zu.T().add(this.H);
    }

    @Override
    public void a() {
        this.o();
        this.H.n();
        mq mq2 = this.e(0.9);
        mq mq3 = this.e(0.75);
        Color color = wQ.b.k;
        Color color2 = this.P() ? wQ.b.c : (this.O() ? wQ.b.c : wQ.b.r);
        Color color3 = wQ.b.s;
        float f10 = (float)(this.c() + this.f() / 2.0) - 3.0f;
        double d10 = mq2.a(this.I);
        double d11 = this.c() + this.f() / 2.0 - d10 / 2.0 - 2.5;
        double d12 = d11 + 7.5;
        pe.a(this.d() + 5.0, this.c() + 2.5, this.e() - 10.0, this.f() - 5.0, this.O() ? b.e() : this.N().q());
        pe.a(this.d() + 5.0 + 0.5, this.c() + 2.5 + 0.5, this.e() - 10.0 - 1.0, this.f() - 5.0 - 1.0, color);
        mq2.a(this.I, this.d() + 15.0 + 8.0, d11, color2);
        mq2.a("" + this.Q(), this.d() + this.e() - 10.0 - mq2.b("10"), d11, color2);
        mq3.a(this.a(mq3, this.e() - 35.0), this.d() + 15.0 + 8.0, d12, color3);
        k9.a(color2, (float)this.d() + 10.0f + 0.5f, f10, "newallowedlist", 6.0f, 6.0f, false);
        k9.a(wQ.b.i, (float)this.d() + 10.0f + 0.5f, f10, "newallowed", 6.0f, 6.0f, false);
    }

    private String a(mq mq2, double d10) {
        StringBuilder stringBuilder = new StringBuilder();
        for (qw qw2 : this.G.c()) {
            if (!qw2.a()) continue;
            if (stringBuilder.toString().length() < 1) {
                stringBuilder.append(qw2.i());
                continue;
            }
            String string = ", " + qw2.i();
            StringBuilder stringBuilder2 = new StringBuilder();
            if (mq2.b(stringBuilder2.append((Object)stringBuilder).append(string).toString()) < d10) {
                stringBuilder.append(string);
                continue;
            }
            stringBuilder.append("...");
            break;
        }
        if (stringBuilder.length() < 1) {
            stringBuilder.append("None");
        }
        return stringBuilder.toString();
    }

    private int Q() {
        int n6 = 0;
        for (qw qw2 : this.G.c()) {
            if (!qw2.a()) continue;
            ++n6;
        }
        return n6;
    }

    public String R() {
        return this.I;
    }

    static wR a(wQ wQ2) {
        return wQ2.H;
    }
}

