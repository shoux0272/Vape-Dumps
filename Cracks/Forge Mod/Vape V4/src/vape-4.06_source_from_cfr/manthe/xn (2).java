/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.mq;
import manthe.pe;
import manthe.wM;
import manthe.xZ;

public class xn
extends xZ {
    private wM D;
    private boolean C = false;

    public xn(wM wM2, String string) {
        super(string, 0.75);
        this.D = wM2;
    }

    @Override
    public void a() {
        String[] arrstring;
        if (!this.C) {
            this.D.A();
            return;
        }
        mq mq2 = this.e(this.z);
        double d10 = mq2.a(this.A);
        double d11 = this.c() + d10 / 2.0;
        double d12 = 0.0;
        double d13 = 0.0;
        for (String string : arrstring = this.A.split("\n")) {
            double d14 = mq2.b(string);
            if (d14 > d13) {
                d13 = d14;
            }
            d12 += mq2.a(string) + 3.0;
        }
        pe.a(this.d() + 10.0, this.c(), d13 + 10.0, d12 + 2.5, xn.b.u);
        for (String string : arrstring) {
            mq2.a(string, this.d() + 15.0, d11, xn.b.r);
            d11 += mq2.a(string) + 3.0;
        }
        this.C = false;
    }

    public wM m() {
        return this.D;
    }

    public void f(boolean bl) {
        this.C = bl;
    }
}

