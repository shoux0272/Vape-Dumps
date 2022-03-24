/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.pe;
import manthe.wD;
import manthe.wM;
import manthe.wd;
import manthe.we;
import manthe.x6;
import manthe.x7;
import manthe.zu;

public class wP
extends we {
    private x6 W = new x6(this);
    private wD Y = new wD();
    private wd X = new wd(this);
    private String V = "";

    public wP() {
        this.c(200.0);
        this.a(200.0);
        this.W().e(false);
        this.W().a(false);
        this.W().c(false);
        this.W().d(false);
        this.a(new x7(this, this, "newprofiles", "Profiles", 0.7));
        zu.T().add(this.Y);
        zu.T().add(this.X);
        this.a((wM)this.W, new Object[0]);
        this.a(false);
        this.j(false);
        this.m(true);
    }

    @Override
    public void V() {
    }

    @Override
    public void C() {
        super.C();
        this.Y.d(200.0);
        this.Y.g(200.0);
        this.Y.a(this.d(), this.c() + this.Y().f());
        this.W.c(this.d() + this.Y.e());
        this.W.a(this.c() + this.Y().f());
        this.W.b(220.0);
        this.X.d(200.0 - this.W.f());
        this.X.g(200.0 - this.W.f());
        this.X.a(this.d() + this.Y.e() - 1.0, this.c() + this.Y().f() + this.W.f());
        pe.c(this.d(), this.Y().c() + this.Y().f(), this.e(), 0.5, wP.b.y);
        pe.c(this.d() + this.Y.e(), this.Y().c() + this.Y().f() + 0.5, 0.5, this.f() - this.Y().f(), wP.b.y);
    }

    @Override
    public void K() {
    }

    @Override
    public void a(boolean bl) {
        super.a(bl);
        this.X.a(bl);
        this.Y.a(bl);
        this.X.m();
    }

    @Override
    public void ac() {
        super.ac();
        this.Y.ac();
        this.X.ac();
    }

    public void b(String string) {
        this.V = string;
        this.X.n();
        this.X.h(0.0);
        this.X.m();
    }

    public String m() {
        return this.V;
    }

    @Override
    public String ad() {
        return "publicprofileshell";
    }

    @Override
    public double g() {
        return 330.0;
    }

    @Override
    public double f() {
        return this.Y().f() + 200.0;
    }
}

