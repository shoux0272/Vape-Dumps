/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.on;
import manthe.qw;
import manthe.wR;
import manthe.x4;
import manthe.yI;

public class xK
extends x4 {
    private boolean M = false;

    public xK(String string) {
        super(string);
        this.e(false);
    }

    @Override
    public void i() {
        if (this.M) {
            this.K.c();
            this.M = false;
        }
        super.i();
    }

    @Override
    public double g() {
        return 110.0;
    }

    @Override
    public double h() {
        return 20.0;
    }

    @Override
    public void Q() {
        if (!this.L()) {
            this.c("");
            return;
        }
        qw qw2 = new qw(this.N(), yI.b().getRGB());
        on.p.d().a(qw2);
        ((wR)this.F()).ak();
        this.c("");
    }

    @Override
    public double n() {
        return 110.0;
    }
}

