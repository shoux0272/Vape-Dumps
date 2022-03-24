/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.Bg;
import manthe.D7;
import manthe.ly;
import manthe.my;
import manthe.pO;
import manthe.pd;
import manthe.qp;
import manthe.rg;
import manthe.rw;

public class rh
extends rg {
    private final rw K;
    private qp J;

    public rh(String string) {
        super(string, true);
        this.a(new D7(0.0, 0.0, 3, 1, new pd(0, 0, 0, 0)));
        this.K = new rw("ex", 0.2f, true);
        this.b(this.K);
        this.z().b(my.c);
        this.z().a(new Bg(this));
        this.a(new pO(this));
        this.a(new ly(this));
    }

    public rw B() {
        return this.K;
    }

    public qp x() {
        return this.J;
    }

    public void a(qp qp2) {
        this.J = qp2;
    }

    static rw b(rh rh2) {
        return rh2.K;
    }

    static qp a(rh rh2) {
        return rh2.J;
    }
}

