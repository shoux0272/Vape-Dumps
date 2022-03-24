/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.util.ArrayList;
import java.util.List;
import manthe.BH;
import manthe.U;
import manthe.pe;
import manthe.wA;
import manthe.wM;
import manthe.we;
import manthe.x0;
import manthe.xF;
import manthe.xI;
import manthe.xT;
import manthe.xi;
import manthe.zu;

public class wE
extends we {
    private xi ac;
    private List<U> W;
    private int Y;
    private String V = "";
    private xT aa = new xT(this);
    private xF X = new xF(this);
    private wA Z = new wA(this);
    private x0 ab = new x0(this);

    public wE() {
        this.c(200.0);
        this.a(200.0);
        this.W().e(false);
        this.W().a(false);
        this.W().c(false);
        this.W().d(false);
        this.a(new xI(this, this, null, "New AutoHotbar").a(new BH(this)));
        zu.T().add(this.Z);
        this.a(new wM[]{this.aa});
        this.a((wM)this.X, "wrap");
        this.a((wM)this.ab, new Object[0]);
        this.a(false);
        this.m(true);
        this.j(false);
    }

    public void b(String string) {
        this.V = string;
        this.Z.m();
    }

    @Override
    public void V() {
        this.aa.c(this.d());
        this.aa.a(this.c() + this.Y().f());
        this.X.c(this.d() + this.aa.e());
        this.X.a(this.c() + this.Y().f());
        this.ab.c(this.d() + this.aa.e());
        this.ab.a(this.c() + this.Y().f() + 200.0 - this.X.f());
    }

    @Override
    public void C() {
        super.C();
        this.Z.a(this.d() + this.aa.e(), this.c() + this.Y().f() + this.X.f());
        this.Z.b(220.0);
        this.Z.d(200.0 - this.X.f() * 2.0);
        this.Z.g(200.0 - this.X.f() * 2.0);
        pe.c(this.d(), this.Y().c() + this.Y().f(), this.e(), 0.5, wE.b.y);
    }

    @Override
    public void a(boolean bl) {
        super.a(bl);
        this.Z.a(bl);
    }

    @Override
    public String ad() {
        return "hotbarshell";
    }

    @Override
    public void ac() {
        super.ac();
        this.Z.ac();
    }

    @Override
    public void K() {
    }

    public xi m() {
        return this.ac;
    }

    public int ak() {
        return this.Y;
    }

    public String n() {
        return this.V;
    }

    public void a(xi xi2) {
        this.ac = xi2;
        this.W = new ArrayList<U>(xi2.n());
    }

    public void a(int n6) {
        this.Y = n6;
    }

    static List b(wE wE2) {
        return wE2.W;
    }

    static xi a(wE wE2) {
        return wE2.ac;
    }
}

