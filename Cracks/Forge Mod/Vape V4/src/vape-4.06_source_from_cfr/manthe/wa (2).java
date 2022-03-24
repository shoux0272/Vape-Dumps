/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.Ak;
import manthe.Ar;
import manthe.mI;
import manthe.mq;
import manthe.pe;
import manthe.qZ;
import manthe.wI;
import manthe.wV;

public class wa
extends wI {
    private Ak D;
    private wV E = new wV("newworld", 0.8);
    private wV G = new wV("newcopy", 0.8);
    private wV F = new wV("newupdateprofile", 0.8);

    public wa(Ak ak) {
        this.D = ak;
        this.E.c(new qZ(this, ak));
        this.E.a("Publish this profile");
        this.G.c(new mI(this, ak));
        this.G.a("Copy this profiles UUID");
        this.F.c(new Ar(this));
        this.F.a("Update (save) this profile");
        this.a(this.E, this.G, this.F);
    }

    @Override
    public void a() {
        mq mq2 = this.e(0.9);
        double d10 = mq2.a(this.D.r());
        double d11 = this.c() + 9.0 - d10 / 2.0;
        double d12 = this.d() + 10.0;
        pe.a(this.d() + 5.0 + 1.0, this.c() + 1.0, this.e() - 10.0 - 2.0, this.f() - 2.0, wa.b.m);
        mq2.a(this.D.r(), d12, d11, wa.b.r);
        double d13 = this.d() + this.e() - 10.0 - 8.0;
        double d14 = this.c() + this.f() / 2.0 - 4.0;
        this.E.d(this.D.k() ? wa.b.g : null);
        this.E.b(8.0);
        this.E.d(8.0);
        this.E.c(d13);
        this.E.a(d14);
        if (this.D.k()) {
            this.G.b(8.0);
            this.G.d(8.0);
            this.G.c(d13 -= 5.0 + this.E.e());
            this.G.a(d14);
            this.F.b(8.0);
            this.F.d(8.0);
            this.F.c(d13 -= 5.0 + this.G.e());
            this.F.a(d14);
        } else {
            this.G.a(false);
            this.F.a(false);
        }
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
        return 18.0;
    }

    public Ak N() {
        return this.D;
    }
}

