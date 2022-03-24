/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.k9;
import manthe.mq;
import manthe.uW;
import manthe.wC;
import manthe.wM;

public class xr
extends wM {
    private wC z;

    public xr(wC wC2) {
        this.z = wC2;
    }

    @Override
    public void a() {
        this.l();
    }

    @Override
    public void k() {
        this.l();
    }

    private void l() {
        mq mq2 = this.e(0.9);
        double d10 = mq2.a("Aim");
        double d11 = this.c() + this.f() / 2.0 - d10 / 2.0;
        double d12 = this.c() + this.f() / 2.0 - 3.0;
        k9.a(xr.b.r, (float)this.d() + 5.0f, (float)d12, "newaim", 6.0f, 6.0f, false);
        mq2.a(this.z.ao(), this.d() + 8.0 + 10.0, d11, xr.b.r);
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

