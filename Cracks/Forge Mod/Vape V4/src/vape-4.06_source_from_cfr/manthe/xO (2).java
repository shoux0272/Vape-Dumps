/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.mq;
import manthe.pe;
import manthe.xH;
import manthe.xx;
import manthe.zu;

public class xO
extends xH {
    private xx Q;

    public xO(xx xx2) {
        this.Q = xx2;
        this.I.a(false);
    }

    @Override
    public void a() {
        String string;
        mq mq2 = this.e(0.75);
        String string2 = this.S() ? this.N() : (string = this.M ? "" + this.Q.O().a() : this.Q.O().a() + " " + this.Q.P());
        if (!this.S() && !this.M && this.Q.P().length() <= 1) {
            string = "" + this.Q.O().a();
        }
        mq2.a(string, this.d() + (this.l() - mq2.b(string)), this.c(), xO.b.r);
        if (this.J()) {
            this.J = string.length();
            this.a(mq2, this.d() + this.l(), this.c());
        }
        pe.c(this.d(), this.c() + mq2.a(string) + 2.0, this.e(), 1.0, this.T());
    }

    @Override
    public void Q() {
        try {
            double d10 = Double.parseDouble(this.N());
            this.Q.O().a(d10);
        }
        catch (Exception exception) {
            // empty catch block
        }
        zu.W = null;
    }

    @Override
    public void R() {
        this.c(this.Q.O().a().toString());
    }
}

