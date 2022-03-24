/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.Bo;
import manthe.DU;
import manthe.mq;
import manthe.o7;
import manthe.pe;
import manthe.uW;
import manthe.ua;
import manthe.uh;
import manthe.wM;
import manthe.zu;

public class wq
extends wM {
    private final uh[] B = uh.values();
    protected boolean z;
    private uh C = null;
    private boolean A;

    @Override
    public void a() {
        String string = this.C != null ? this.C.a() : "Sort by";
        mq mq2 = this.e(0.7);
        double d10 = mq2.a(string);
        double d11 = this.c() + this.f() / 2.0 - d10 / 2.0;
        pe.a("newsort", this.d() + 2.5, this.c() + this.f() / 2.0, 5.0, 5.0, this.z ? wq.b.c : wq.b.r);
        mq2.b(string, this.d() + this.e() / 2.0, d11, this.z ? wq.b.c : wq.b.r);
        if (this.A) {
            double d12 = 5.0 + (d10 + 5.0) * (double)this.B.length;
            pe.a(this.d(), this.c() + d10 + 15.0, this.e(), d12 - 1.0, wq.b.u);
            pe.a("dropdownnotch", this.d() + this.e() / 2.0, this.c() + d10 + 15.0, 4.0, 4.0, wq.b.u);
            Bo bo2 = o7.b();
            for (int k = 0; k < this.B.length; ++k) {
                double d13 = d11 + 5.0 + (d10 + 5.0) * (double)(k + 1);
                DU dU2 = new DU(this.d(), d13 - 2.5, this.e(), d10 + 5.0);
                if (dU2.a(bo2)) {
                    pe.c(dU2.a(), dU2.b(), dU2.d(), dU2.c(), wq.b.m);
                }
                mq2.b(this.B[k].a(), this.d() + this.e() / 2.0, d13, wq.b.r);
            }
        }
    }

    @Override
    public void k() {
    }

    @Override
    public void j() {
        if (this.z && !this.x()) {
            this.z = false;
        }
    }

    @Override
    public void a(uW uW2) {
        boolean bl = this.A = !this.A;
        if (this.A) {
            zu.W = this;
        } else {
            mq mq2 = this.e(0.7);
            double d10 = mq2.a("Sort by");
            double d11 = this.c() + this.f() / 2.0 - d10 / 2.0;
            for (int k = 0; k < this.B.length; ++k) {
                double d12 = d11 + 5.0 + (d10 + 5.0) * (double)(k + 1);
                DU dU2 = new DU(this.d(), d12 - 2.5, this.e(), d10 + 5.0);
                if (!dU2.b(uW2.a(), uW2.b())) continue;
                this.C = this.B[k];
                ua.a(this.C);
            }
            zu.W = null;
        }
    }

    @Override
    public void i() {
        this.z = true;
    }

    @Override
    public double g() {
        return 0.0;
    }

    @Override
    public double h() {
        return 20.0;
    }
}

