/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.bz;
import manthe.n1;
import manthe.on;
import manthe.pr;
import manthe.wK;
import manthe.wM;
import manthe.we;
import manthe.x2;
import manthe.x9;
import manthe.xA;
import manthe.x_;
import manthe.xg;
import manthe.xo;

public class wm
extends we
implements bz {
    private boolean X = true;
    private xA W;
    private wK Y;
    private wK Z;
    private wK ab;
    private wK V;
    private x2 aa;

    public wm() {
        this.aa = new x2(wm.b.y);
        this.a(wm.b.k);
        this.c(300.0);
        this.a(100.0);
        this.a(false);
        this.W().e(false);
        this.W().b("wrap");
        this.a(new xo(this, this, "newfriends", "Enemies"));
        this.W = new xA(on.p.b().e);
        this.Y = new wK(on.p.N().c);
        this.Z = new wK(on.p.b().f);
        this.ab = new wK(on.p.N().g);
        this.V = new wK(on.p.N().b);
        this.W.a(wm.b.u);
        this.Y.a(wm.b.u);
        this.Z.a(wm.b.u);
        this.ab.a(wm.b.u);
        this.V.a(wm.b.u);
        this.W.a(false);
        this.Y.a(false);
        this.Z.a(false);
        this.ab.a(false);
        this.V.a(false);
        this.aa.a(false);
    }

    public void ak() {
        this.J();
        this.a(this.W, this.Y, this.Z, this.ab, this.V, this.aa);
        this.a((wM)new x9("Username / Alias"), new Object[0]);
        for (pr pr2 : on.p.b().e()) {
            this.a((wM)new x_(pr2).a(new n1(this, pr2)), new Object[0]);
        }
        this.M();
    }

    @Override
    public void V() {
    }

    @Override
    public void K() {
    }

    @Override
    public void n() {
        this.X = !this.X;
        for (wM wM2 : this.w()) {
            if (wM2 instanceof xg) continue;
            wM2.a(this.X);
        }
        this.M();
    }

    @Override
    public boolean m() {
        return this.X;
    }

    @Override
    public String ad() {
        return "Enemies";
    }

    static xA d(wm wm2) {
        return wm2.W;
    }

    static wK a(wm wm2) {
        return wm2.Y;
    }

    static wK f(wm wm2) {
        return wm2.Z;
    }

    static wK b(wm wm2) {
        return wm2.ab;
    }

    static wK c(wm wm2) {
        return wm2.V;
    }

    static x2 e(wm wm2) {
        return wm2.aa;
    }
}

