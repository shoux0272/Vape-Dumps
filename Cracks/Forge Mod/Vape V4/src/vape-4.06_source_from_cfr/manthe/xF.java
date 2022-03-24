/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.mr;
import manthe.uW;
import manthe.v3;
import manthe.wE;
import manthe.wM;
import manthe.wl;
import manthe.xf;

public class xF
extends wM {
    private xf z = new xf("Search Item Name");
    private wl A;

    public xF(wE wE2) {
        this.A = new wl("Save & Exit", xF.b.i);
        this.z.a(new mr(this, wE2));
        this.A.c(new v3(this, wE2));
        this.a(this.z, this.A);
    }

    @Override
    public void a() {
        double d10 = 27.5;
        this.z.c(this.d());
        this.z.a(this.c() + 20.0 - 5.0 - 2.5);
        this.z.b(d10 * 6.0 + 5.0);
        this.A.b(d10 * 2.0);
        this.A.d(15.0);
        this.A.c(this.d() + this.z.e() + d10);
        this.A.a(this.c() + 20.0 - 5.0);
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
        return 220.0;
    }

    @Override
    public double h() {
        return 40.0;
    }

    static xf a(xF xF2) {
        return xF2.z;
    }
}

