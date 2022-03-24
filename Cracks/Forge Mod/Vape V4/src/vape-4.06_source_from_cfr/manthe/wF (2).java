/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.bz;
import manthe.pe;
import manthe.uW;
import manthe.w9;
import manthe.wM;
import manthe.we;
import manthe.x3;
import manthe.xg;
import manthe.xw;
import manthe.yI;
import manthe.ya;

public class wF
extends we
implements bz {
    public static wF V;
    private boolean X;
    private w9 W;

    public wF() {
        this.a(wF.b.k);
        this.c(300.0);
        this.a(100.0);
        this.X = true;
        this.a(false);
        this.W().e(false);
        this.W().b("wrap");
        this.a(new x3(this, "newmacros", "Macros"));
        this.a(new wM[]{new xw(this)});
        V = this;
    }

    public void b(ya ya2) {
        this.a(new wM[]{new w9(this, ya2)});
    }

    public void a(ya ya2) {
        for (wM wM2 : this.w()) {
            if (!(wM2 instanceof w9) || !((w9)wM2).N().l().equals(ya2.l())) continue;
            this.a(wM2);
        }
    }

    @Override
    public void E() {
        if (this.W != null) {
            if (this.W.x()) {
                this.W.E();
            }
            return;
        }
        super.E();
    }

    @Override
    public void b(uW uW2) {
        if (this.W != null) {
            this.W.b(uW2);
            return;
        }
        super.b(uW2);
    }

    @Override
    public void C() {
        super.C();
        if (this.W != null) {
            double d10 = this.W.c() + this.W.f() - (this.c() + this.L());
            if (d10 > 0.0) {
                this.f(this.P() - d10);
            }
            pe.c(this.d(), this.c(), this.e(), Math.min(this.f(), this.L()), yI.a(this.I(), 100));
            this.W.C();
        }
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
        this.al();
    }

    private void al() {
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

    public w9 ak() {
        return this.W;
    }

    public void a(w9 w92) {
        this.W = w92;
    }

    @Override
    public String ad() {
        return "Macros";
    }
}

