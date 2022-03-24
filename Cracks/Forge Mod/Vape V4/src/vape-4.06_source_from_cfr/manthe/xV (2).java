/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.BQ;
import manthe.k9;
import manthe.on;
import manthe.pT;
import manthe.uN;
import manthe.uW;
import manthe.vu;
import manthe.wT;
import manthe.wV;
import manthe.x1;
import manthe.xg;
import manthe.zu;

public class xV
extends xg {
    private wV D = new wV("newsettings", 0.9);
    private wV C = new wV("newsync", 0.9);
    private wV B = new wV("newsearch", 0.9);
    private x1 F = new x1(this);
    private boolean H = false;
    private int G = 0;
    private long E = 0L;

    public xV(wT wT2) {
        super(wT2);
        this.D.c(new BQ(this));
        this.D.a("Open settings");
        this.B.c(new vu(this));
        this.B.a("Search for modules");
        this.C.c(new uN(this));
        this.C.a("Save your profiles to the cloud");
        this.F.a(new pT(this, wT2));
        this.a(this.F, this.B, this.C, this.D);
    }

    @Override
    public void a() {
        double d10 = this.d() + this.e() - 7.5 - 8.0;
        if (this.H) {
            this.F.a(true);
            this.F.c(this.d());
            this.F.a(this.c() - 2.5);
            this.F.b(this.e() - 17.5 - 16.0);
            this.F.d(this.f());
            this.C.a(false);
        } else {
            this.F.a(false);
            k9.a(xV.b.a, (float)this.d() + 5.0f, (float)this.c() + 5.0f, "vapelogo", 0.3f, false);
            k9.a(b.e(), (float)this.d() + 5.0f + 32.0f, (float)this.c() + 5.0f, "v4", 0.3f, false);
            if (on.p.q() && System.currentTimeMillis() > this.E + 60000L) {
                this.C.a(true);
                this.C.c(d10);
                this.C.a(this.c());
                this.C.d(this.f());
                d10 -= 13.0;
            } else {
                this.C.a(false);
            }
        }
        this.D.d(this.l().ai() ? xV.b.a : null);
        this.D.c(d10);
        this.D.a(this.c());
        this.D.d(this.f());
        d10 -= 13.0;
        this.B.a(zu.T.R.v().equals(zu.T.ad));
        if (this.B.b()) {
            this.B.d(this.H ? xV.b.a : null);
            this.B.c(d10);
            this.B.a(this.c());
            this.B.d(this.f());
        }
    }

    @Override
    public void k() {
    }

    @Override
    public void j() {
    }

    @Override
    public void a(uW uW2) {
    }

    @Override
    public void i() {
    }

    public x1 n() {
        return this.F;
    }

    public void f(boolean bl) {
        this.H = bl;
    }

    static boolean a(xV xV2, boolean bl) {
        xV2.H = bl;
        return xV2.H;
    }

    static x1 a(xV xV2) {
        return xV2.F;
    }

    static long a(xV xV2, long l) {
        xV2.E = l;
        return xV2.E;
    }

    static wV c(xV xV2) {
        return xV2.C;
    }

    static int b(xV xV2) {
        return xV2.G;
    }

    static int a(xV xV2, int n6) {
        xV2.G = n6;
        return xV2.G;
    }
}

