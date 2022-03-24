/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.ab;
import manthe.bz;
import manthe.on;
import manthe.tX;
import manthe.wK;
import manthe.wM;
import manthe.we;
import manthe.x2;
import manthe.xA;
import manthe.xQ;
import manthe.xg;
import manthe.xk;
import manthe.xt;
import manthe.xz;

public class wX
extends we
implements bz {
    private boolean V = false;
    private xA X;
    private wK Y;
    private wK ac;
    private wK W;
    private wK Z;
    private x2 aa;
    private xQ ab;

    public wX() {
        this.aa = new x2(wX.b.y);
        this.X = new xA(on.p.N().e);
        this.Y = new wK(on.p.N().c);
        this.ac = new wK(on.p.N().d);
        this.W = new wK(on.p.N().g);
        this.Z = new wK(on.p.N().b);
        this.X.a(wX.b.u);
        this.Y.a(wX.b.u);
        this.ac.a(wX.b.u);
        this.W.a(wX.b.u);
        this.Z.a(wX.b.u);
        this.X.a(false);
        this.Y.a(false);
        this.ac.a(false);
        this.W.a(false);
        this.Z.a(false);
        this.aa.a(false);
        this.a(wX.b.k);
        this.c(300.0);
        this.a(100.0);
        this.a(false);
        this.W().e(false);
        this.W().b("wrap");
        this.ab = new xk(this, this, "newfriends", "Friends");
        this.a(this.ab);
        this.ak();
    }

    public void ak() {
        this.J();
        this.Y.a(this.X);
        this.W.a(this.Z);
        this.a(this.Y, this.X, this.ac, this.W, this.Z, this.aa);
        this.a((wM)new xz("Username / Alias"), new Object[0]);
        for (ab ab2 : on.p.N().e()) {
            this.a((wM)new xt(ab2).a(new tX(this, ab2)), new Object[0]);
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
    public void M() {
        boolean bl = this.ab.J();
        if (this.V) {
            bl = false;
        }
        this.X.a(bl);
        this.Y.a(bl);
        this.ac.a(bl);
        this.W.a(bl);
        this.Z.a(bl);
        this.aa.a(bl);
        super.M();
    }

    @Override
    public void n() {
        for (wM wM2 : this.w()) {
            if (wM2 instanceof xg) continue;
            wM2.a(this.V);
        }
        if (!this.V) {
            this.ab.f(false);
        }
        this.M();
        this.V = !this.V;
    }

    @Override
    public boolean m() {
        return this.V;
    }

    @Override
    public String ad() {
        return "Friends";
    }
}

