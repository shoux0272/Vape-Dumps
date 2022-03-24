/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.c2;
import manthe.uW;
import manthe.wT;
import manthe.x4;
import manthe.xV;
import manthe.xb;
import manthe.zu;

public class x1
extends x4 {
    private xb O;
    private xV M;
    private int N = 0;

    public x1(xb xb2) {
        super("");
        this.O = xb2;
        this.I.a(false);
    }

    public x1(xV xV2) {
        super("");
        this.M = xV2;
        this.I.a(false);
    }

    @Override
    public void Q() {
    }

    @Override
    public void a() {
        if (!(this.M == null || zu.W != null && zu.W.equals(this))) {
            zu.W = this;
        }
        this.K();
    }

    @Override
    public void j() {
        int n6;
        if (this.b() && this.O != null && (n6 = this.N().length()) != this.N) {
            this.O.n();
            this.N = n6;
        }
    }

    @Override
    public void i() {
    }

    @Override
    public void a(uW uW2) {
        if (this.O != null) {
            super.a(uW2);
            return;
        }
        if (uW2.c().equals((Object)c2.RIGHT_CLICK)) {
            this.c("");
            ((wT)this.M.l()).ar();
        }
        if (zu.W != null && !this.q().b(uW2.a(), uW2.b())) {
            zu.W = null;
            this.M.f(false);
            this.a(false);
        }
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

