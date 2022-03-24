/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.ab;
import manthe.uW;
import manthe.xN;

public class xt
extends xN {
    private ab H;

    public xt(ab ab2) {
        super(xt.b.i, ab2.a());
        this.H = ab2;
    }

    @Override
    public boolean n() {
        return this.H.c();
    }

    @Override
    public void a(uW uW2) {
        this.H.a(!this.H.c());
    }

    public ab J() {
        return this.H;
    }

    @Override
    public void a() {
        String string = this.H.a();
        if (!this.H.b().equals(this.H.a()) && !this.l()) {
            string = "*" + this.H.e();
        }
        this.b(string);
        super.a();
    }
}

