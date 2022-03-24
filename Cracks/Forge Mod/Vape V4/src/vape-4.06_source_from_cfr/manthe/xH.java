/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.awt.Color;
import manthe.i;
import manthe.x4;
import manthe.yI;

public abstract class xH
extends x4 {
    private i O = new i(0.15, 0.0, 100.0);
    private double N = 0.0;
    protected boolean M;
    protected boolean P;

    public xH() {
        super("");
    }

    public abstract void R();

    @Override
    public void j() {
        if (!this.x() && this.M) {
            this.M = false;
            this.O.c();
        }
        if (!this.J() && this.P) {
            this.P = false;
            this.Q();
        }
        if (this.J() && !this.P) {
            this.P = true;
            this.R();
        }
    }

    @Override
    public void i() {
        if (!this.M) {
            this.M = true;
            this.O.c();
        }
    }

    @Override
    public double g() {
        return this.l();
    }

    @Override
    public double h() {
        return 6.0;
    }

    @Override
    public double l() {
        return 15.0;
    }

    public boolean S() {
        return this.P;
    }

    public Color T() {
        if (this.J()) {
            return yI.a(xH.b.y, (int)this.O.n());
        }
        return yI.a(xH.b.y, this.O.o().intValue());
    }
}

