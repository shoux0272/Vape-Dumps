/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.D7;
import manthe.DP;
import manthe.pd;
import manthe.qp;
import manthe.r6;
import manthe.rf;
import manthe.s4;
import manthe.sV;
import manthe.sb;

public class r0
extends rf {
    sV K;
    sb J;
    r6 I;

    public r0(DP dP2, String string, String string2, int n6, boolean bl) {
        super(true);
        this.b(string);
        this.j(false);
        this.b(qp.c);
        this.a(new D7(0.0, 1.0, 5000, 1, new pd(0, 0, 0, 0)));
        this.c(120.0);
        this.a(true);
        this.K = new sV(10.0, 1.0, "", " stacks", "Allowed Stacks");
        this.K.f(n6);
        this.K.c(this.q());
        this.K.b(8.0);
        if (bl) {
            this.b(this.K);
        }
        this.J = new s4(this, 64, bl, dP2);
        this.J.a(string2);
        this.J.c(this.q());
        this.J.b(12.0);
        this.J.a(true);
        this.b(this.J);
        this.I = new r6(true);
        dP2.a(this.I);
        this.I.b(qp.a);
        this.I.c(this.q());
        this.I.b(60.0);
        this.b(this.I);
        this.a(this.m(), null);
    }

    @Override
    public void c(double d10) {
        super.c(d10);
    }

    @Override
    public void b(double d10) {
        super.b(d10);
    }
}

