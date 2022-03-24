/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.util.Locale;
import manthe.AV;
import manthe.pe;
import manthe.ua;
import manthe.wM;
import manthe.wP;
import manthe.wx;
import manthe.xY;

public class wd
extends wx {
    private final int W = 21;
    private int Y = 21;
    private boolean X = false;
    private wP V;

    public wd(wP wP2) {
        this.V = wP2;
        this.P = false;
        this.W().e(false);
        this.W().a(false);
        this.W().c(false);
        this.W().d(false);
    }

    public void m() {
        int n6 = 0;
        this.J();
        for (AV aV : ua.c()) {
            if (n6 >= this.Y) {
                return;
            }
            if (this.V.m().length() > 0 && !aV.r().toLowerCase(Locale.ROOT).contains(this.V.m().toLowerCase(Locale.ROOT)) && !this.V.m().equalsIgnoreCase(aV.l().toString())) continue;
            this.a((wM)new xY(aV), n6 > 0 && (n6 + 1) % 3 == 0 ? "wrap" : "");
            ++n6;
        }
        this.X = true;
    }

    @Override
    public void a(boolean bl) {
        super.a(bl);
        this.n();
    }

    @Override
    public void V() {
        double d10;
        double d11 = this.Q().b() + this.Q().c();
        if (d11 + 1.0 > (d10 = this.c() + this.L()) && !this.X) {
            this.Y += 21;
            double d12 = this.P();
            this.m();
            this.h(d12);
        }
    }

    @Override
    public void C() {
        super.C();
        pe.c(this.d() - 4.0, this.c(), 0.5, this.L() + 2.0, wd.b.y);
    }

    public void n() {
        this.X = false;
        this.Y = 21;
    }

    @Override
    public void K() {
    }

    @Override
    public String ad() {
        return "publicprofilebrowser";
    }

    @Override
    public double g() {
        return 211.0;
    }
}

