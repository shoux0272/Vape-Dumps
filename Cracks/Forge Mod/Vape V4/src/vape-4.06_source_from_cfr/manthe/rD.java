/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.awt.Color;
import manthe.Cj;
import manthe.D7;
import manthe.mm;
import manthe.ng;
import manthe.pd;
import manthe.pm;
import manthe.pn;
import manthe.qv;
import manthe.r6;
import manthe.rf;
import manthe.rg;
import manthe.tg;
import manthe.vC;

public class rD
extends rf {
    private static boolean J;
    private final r6 L;
    private final rg M;
    private final rg K;
    private final Cj I;

    public rD(r6 r62, Cj cj2, int n6) {
        super(false);
        this.I = cj2;
        this.L = r62;
        this.b(e);
        this.a(e);
        this.c(n6);
        this.b(20.0);
        this.a(new D7(2.0, 1.0, 1, 2, new pd(0, 0, 0, 0)));
        this.M = new rg(cj2.c(), true);
        this.M.b(18.0);
        this.M.c(this.q() * 0.8);
        this.M.e(1.0);
        this.M.c(new Color(100, 100, 100, 30));
        this.b(this.M);
        this.K = new rg("x", true);
        this.K.b(18.0);
        this.K.c(this.q() * 0.2 - 1.0);
        this.K.e(1.0);
        this.K.c(new Color(100, 100, 100, 30));
        this.b(this.K);
        this.K.a(new pn(this));
        this.K.a(new tg(this));
        this.M.a(new vC(this));
        this.M.a(new mm(this));
    }

    private void x() {
        if (J) {
            return;
        }
        if (ng.i.ai.u().booleanValue()) {
            new qv(this).start();
            return;
        }
        new pm(this).start();
    }

    public Cj a() {
        return this.I;
    }

    static rg a(rD rD2) {
        return rD2.K;
    }

    static r6 b(rD rD2) {
        return rD2.L;
    }

    static rg c(rD rD2) {
        return rD2.M;
    }

    static void d(rD rD2) {
        rD2.x();
    }

    static boolean d(boolean bl) {
        J = bl;
        return J;
    }

    static Cj e(rD rD2) {
        return rD2.I;
    }
}

