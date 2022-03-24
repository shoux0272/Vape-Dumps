/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.D7;
import manthe.dR;
import manthe.ds;
import manthe.pd;
import manthe.rg;

public class rk
extends rg {
    public rk(int n6, int n10) {
        super("", false);
        this.a(new D7(2.0, 10.0, n6, n10, new pd(0, 0, 0, 0)));
        this.c(n10 * 16);
        this.b(n6 * 16);
    }

    @Override
    public void c(boolean bl) {
        super.c(bl);
        dR dR2 = ds.m();
    }
}

