/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.Dr;
import manthe.uW;
import manthe.wM;
import manthe.wW;
import manthe.xl;

public class x8
extends wM {
    private wW z = new wW("newpublicprofiles");
    private xl A = new xl("Type name");

    public x8() {
        this.z.c(new Dr(this));
        this.z.a("Browse public profiles");
        this.a(this.A, this.z);
    }

    @Override
    public void a() {
        double d10 = (this.e() - 10.0) / 5.0;
        double d11 = this.e() - d10 - 7.5;
        this.A.c(this.d());
        this.A.a(this.c());
        this.A.b(d11);
        this.A.d(this.f());
        this.z.a(this.c() + 2.5);
        this.z.c(this.d() + d10 * 4.0 + 2.5);
        this.z.b(d10 + 2.5);
        this.z.d(this.f() - 5.0);
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

