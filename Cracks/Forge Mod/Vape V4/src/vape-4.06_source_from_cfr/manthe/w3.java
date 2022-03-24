/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.awt.Color;
import java.util.List;
import manthe.DP;
import manthe.bM;
import manthe.k9;
import manthe.mq;
import manthe.o1;
import manthe.pe;
import manthe.w7;
import manthe.ws;
import manthe.zu;

public class w3
extends w7 {
    private String I;
    private boolean G;
    private DP J;
    private ws H;

    public w3(DP dP2) {
        this.J = dP2;
        this.a(dP2);
        this.c(new bM(this));
        boolean bl = this.G = dP2.H().contains("blacklist") || dP2.H().contains("blocked");
        this.I = dP2.H().contains("whitelist") ? "Whitelist" : (dP2.H().contains("blacklist") ? "Blacklist" : (dP2.H().contains("allowed") ? "Allowed items" : (dP2.H().contains("blocked") ? "Blocked items" : dP2.H().substring(0, 1).toUpperCase() + dP2.H().substring(1).replaceAll("-", " "))));
        this.H = new ws(this);
        zu.T().add(this.H);
    }

    @Override
    public void a() {
        this.o();
        this.H.n();
        mq mq2 = this.e(0.9);
        mq mq3 = this.e(0.75);
        Color color = w3.b.k;
        Color color2 = this.P() ? w3.b.c : (this.O() ? w3.b.c : w3.b.r);
        Color color3 = w3.b.s;
        float f10 = (float)(this.c() + this.f() / 2.0) - 3.0f;
        double d10 = mq2.a(this.J.H());
        double d11 = this.c() + this.f() / 2.0 - d10 / 2.0 - 2.5;
        double d12 = d11 + 7.5;
        pe.a(this.d() + 5.0, this.c() + 2.5, this.e() - 10.0, this.f() - 5.0, this.O() ? b.e() : this.N().q());
        pe.a(this.d() + 5.0 + 0.5, this.c() + 2.5 + 0.5, this.e() - 10.0 - 1.0, this.f() - 5.0 - 1.0, color);
        mq2.a(this.I, this.d() + 15.0 + 8.0, d11, color2);
        mq2.a("" + this.T(), this.d() + this.e() - 10.0 - mq2.b("10"), d11, color2);
        mq3.a(this.a(mq3, this.e() - 35.0), this.d() + 15.0 + 8.0, d12, color3);
        if (this.G) {
            k9.a(color2, (float)this.d() + 10.0f + 0.5f, f10, "newblockedlist", 6.0f, 6.0f, false);
            k9.a(w3.b.j, (float)this.d() + 10.0f - 0.5f, f10, "newblocked", 6.0f, 6.0f, false);
        } else {
            k9.a(color2, (float)this.d() + 10.0f + 0.5f, f10, "newallowedlist", 6.0f, 6.0f, false);
            k9.a(w3.b.i, (float)this.d() + 10.0f + 0.5f, f10, "newallowed", 6.0f, 6.0f, false);
        }
    }

    private String a(mq mq2, double d10) {
        StringBuilder stringBuilder = new StringBuilder();
        for (Object e10 : (List)this.J.n()) {
            if (e10 instanceof o1 && !((o1)e10).G()) continue;
            if (stringBuilder.toString().length() < 1) {
                stringBuilder.append(e10.toString());
                continue;
            }
            String string = ", " + e10.toString();
            StringBuilder stringBuilder2 = new StringBuilder();
            if (mq2.b(stringBuilder2.append(stringBuilder.toString()).append(string).toString()) < d10) {
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

    private int T() {
        return ((List)this.J.n()).size();
    }

    public String R() {
        return this.I;
    }

    public DP Q() {
        return this.J;
    }

    public boolean S() {
        return this.G;
    }

    static ws a(w3 w32) {
        return w32.H;
    }
}

