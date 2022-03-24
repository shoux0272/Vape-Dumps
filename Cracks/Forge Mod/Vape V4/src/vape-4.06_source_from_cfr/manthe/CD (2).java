/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.Cp;
import manthe.ds;
import manthe.eJ;

public class CD
extends Cp {
    private boolean p = false;

    public CD() {
        super(true);
    }

    @Override
    public void f() {
        eJ eJ2 = ds.k();
        this.a(eJ2);
        this.m = eJ2.U() + 180.0f;
        this.c = this.p ? 0.0f : -eJ2.K();
        super.f();
    }

    public void d(boolean bl) {
        this.p = bl;
    }
}

