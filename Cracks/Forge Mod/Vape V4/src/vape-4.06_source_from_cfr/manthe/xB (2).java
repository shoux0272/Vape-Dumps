/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.mq;
import manthe.uW;
import manthe.w4;
import manthe.wM;
import manthe.yt;

public class xB
extends wM {
    private String z;
    private w4 A;

    public xB(String string, yt yt2) {
        this.z = string;
        this.A = new w4(yt2);
        this.a(this.A);
    }

    @Override
    public void a() {
        mq mq2 = this.e(0.9);
        double d10 = mq2.a(this.z);
        mq2.a(this.z, this.d() + 5.0, this.c() + this.f() / 2.0 - d10 / 2.0, xB.b.r);
        this.A.c(this.d() + this.e() - 5.0 - this.A.e());
        this.A.a(this.c() + 5.0);
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

