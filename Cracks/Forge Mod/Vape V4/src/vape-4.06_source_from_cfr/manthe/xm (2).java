/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.DB;
import manthe.DY;
import manthe.ae;
import manthe.o4;
import manthe.uW;
import manthe.vO;
import manthe.wM;
import manthe.wW;
import manthe.yn;

public class xm
extends wM {
    private DY D;
    private wW z = new wW("newplayers");
    private wW C = new wW("newmobs");
    private wW B = new wW("newpeaceful");
    private wW A = new wW("newneutral");

    public xm(DY dY2) {
        this.D = dY2;
        this.z.c(new vO(this, dY2));
        this.z.i(true);
        this.z.a("Target players");
        this.C.c(new ae(this, dY2));
        this.C.i(true);
        this.C.a("Target mobs");
        this.B.c(new yn(this, dY2));
        this.B.i(true);
        this.B.a("Target peaceful");
        this.A.c(new o4(this, dY2));
        this.A.i(true);
        this.A.a("Target neutral");
        this.a(this.z, this.C, this.B, this.A);
    }

    @Override
    public void a() {
        double d10 = (this.e() - 10.0 - 6.0) / 4.0;
        double d11 = this.d() + 5.0;
        this.a(this.z, this.D.r().e(), d10, d11);
        this.a(this.C, this.D.r().i(), d10, d11 += d10 + 2.0);
        this.a(this.B, this.D.r().b(), d10, d11 += d10 + 2.0);
        this.a(this.A, this.D.r().h(), d10, d11 += d10 + 2.0);
    }

    private void a(wW wW2, DB dB2, double d10, double d11) {
        wW2.c(d11);
        wW2.a(this.c() + 2.5);
        wW2.b(d10);
        wW2.d(this.f() - 5.0);
        wW2.h(dB2.u());
        wW2.d(dB2.u() != false || wW2.x() ? b.c() : null);
        if (!wW2.Q().j() && !wW2.Q().d() && dB2.u().booleanValue()) {
            wW2.Q().c();
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

    @Override
    public double g() {
        return 110.0;
    }

    @Override
    public double h() {
        return 20.0;
    }
}

