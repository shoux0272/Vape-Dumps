/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.Q;
import manthe.aG;
import manthe.kz;
import manthe.mq;
import manthe.n4;
import manthe.nN;
import manthe.nS;
import manthe.oM;
import manthe.pe;
import manthe.uW;
import manthe.w4;
import manthe.wF;
import manthe.wI;
import manthe.wK;
import manthe.wV;
import manthe.wW;
import manthe.wl;
import manthe.xc;
import manthe.ya;

public class w9
extends wI {
    private wF G;
    private ya J;
    private ya D;
    private boolean K;
    private wK L;
    private xc I;
    private xc H;
    private wl M;
    private wl F;
    private wW N;
    private wV O;
    private w4 E;

    public w9(wF wF2, ya ya2) {
        this.M = new wl("Update", 0.7, w9.b.i);
        this.F = new wl("Cancel", 0.7, w9.b.i);
        this.N = new wW("newtrash", 0.8, w9.b.j);
        this.O = new wV("settingdots");
        this.G = wF2;
        this.J = ya2;
        this.E = new w4(ya2);
        w9 w92 = this;
        this.O.c(new nN(this, wF2, w92, ya2));
        this.I = new xc(ya2.m());
        this.H = new xc(ya2.k());
        this.L = new wK(ya2.q());
        this.L.c(new kz(this, wF2));
        this.N.c(new n4(this, ya2, wF2));
        this.F.c(new aG(this, ya2));
        this.M.c(new Q(this, wF2));
        this.L.a(false);
        this.L.c(true);
        this.L.a(w9.b.m);
        this.I.a(false);
        this.I.c(true);
        this.I.a(w9.b.m);
        this.H.a(false);
        this.H.c(true);
        this.H.a(w9.b.m);
        this.F.a(false);
        this.F.a(w9.b.m);
        this.M.a(false);
        this.M.a(w9.b.m);
        this.N.a(false);
        this.N.a(w9.b.m);
        this.a(this.O, this.E, this.L, this.I, this.H, this.F, this.M, this.N);
    }

    @Override
    public void a(uW uW2) {
        if (this.G.ak() != null && this.G.ak().equals(this) && !this.q().b(uW2.a(), uW2.b())) {
            if (this.O == null) {
                this.G.a((w9)null);
                return;
            }
            this.O.J();
            return;
        }
        super.a(uW2);
    }

    @Override
    public void a() {
        double d10;
        mq mq2 = this.e(0.9);
        double d11 = mq2.a(this.J.l());
        double d12 = this.c() + 9.0 - d11 / 2.0;
        double d13 = this.c() + 9.0;
        double d14 = this.d() + 10.0;
        if (this.K) {
            pe.a(this.d() + 5.0 - 0.5, this.c() + 0.5, this.e() - 10.0 + 1.0, this.f() - 1.0, w9.b.y);
        }
        pe.a(this.d() + 5.0, this.c() + 1.0, this.e() - 10.0, this.f() - 2.0, w9.b.m);
        if (this.K) {
            d10 = this.d() + 5.0;
            double d15 = this.c() + 20.0;
            double d16 = this.e() - 10.0;
            this.I.c(d10);
            this.I.a(d15);
            this.I.b(d16);
            this.L.c(d10);
            this.L.a(d15 += this.I.f());
            this.L.b(d16);
            d15 += this.L.f();
            if (this.L.O().u().booleanValue()) {
                this.H.a(true);
                this.H.c(d10);
                this.H.a(d15);
                this.H.b(d16);
                d15 += this.H.f();
            } else {
                this.H.a(false);
                d15 += 5.0;
            }
            double d17 = (this.e() - 25.0) / 5.0;
            double d18 = this.d() + 10.0;
            if (this.N != null) {
                this.N.c(d18);
                this.N.a(d15);
                this.N.d(18.0);
                this.N.b(d17);
            }
            this.F.c(d18 += d17 + 2.5);
            this.F.a(d15);
            this.F.d(18.0);
            this.F.b(d17 * 2.0);
            this.M.c(d18 += d17 * 2.0 + 2.5);
            this.M.a(d15);
            this.M.d(18.0);
            this.M.b(d17 * 2.0);
        }
        d10 = this.d() + this.e() - 15.0;
        mq2.a(this.J.l(), d14, d12, w9.b.r);
        if (this.O != null) {
            this.O.d(this.K ? w9.b.a : null);
            this.O.c(d10);
            this.O.a(this.c());
            this.O.d(18.0);
            d10 -= 5.0;
        }
        if (!this.K) {
            this.E.c(d10 -= this.E.e());
            this.E.a(this.c() + 4.0);
            pe.a("newclock", d10 -= 9.0, d13, 8.0, 8.0, w9.b.t);
        }
    }

    public void O() {
        this.O.J();
        this.N = null;
        this.O = null;
        this.F = new wl("Cancel", 0.7, w9.b.j);
        this.M = new wl("Add", 0.7, w9.b.i);
        this.F.a(w9.b.m);
        this.M.a(w9.b.m);
        this.F.c(new oM(this));
        this.M.c(new nS(this));
        this.a(this.F, this.M);
    }

    @Override
    public void k() {
    }

    @Override
    public void j() {
    }

    @Override
    public void i() {
    }

    @Override
    public double g() {
        return 110.0;
    }

    @Override
    public double h() {
        return this.K ? (this.L.O().u().booleanValue() ? 120.0 : 90.0) : 18.0;
    }

    public ya N() {
        return this.J;
    }

    static boolean a(w9 w92, boolean bl) {
        w92.K = bl;
        return w92.K;
    }

    static boolean i(w9 w92) {
        return w92.K;
    }

    static ya a(w9 w92, ya ya2) {
        w92.D = ya2;
        return w92.D;
    }

    static wK k(w9 w92) {
        return w92.L;
    }

    static xc e(w9 w92) {
        return w92.I;
    }

    static xc d(w9 w92) {
        return w92.H;
    }

    static wl h(w9 w92) {
        return w92.F;
    }

    static wl a(w9 w92) {
        return w92.M;
    }

    static wW c(w9 w92) {
        return w92.N;
    }

    static w4 g(w9 w92) {
        return w92.E;
    }

    static ya b(w9 w92) {
        return w92.D;
    }

    static wV f(w9 w92) {
        return w92.O;
    }

    static wF l(w9 w92) {
        return w92.G;
    }

    static ya b(w9 w92, ya ya2) {
        w92.J = ya2;
        return w92.J;
    }

    static ya j(w9 w92) {
        return w92.J;
    }
}

