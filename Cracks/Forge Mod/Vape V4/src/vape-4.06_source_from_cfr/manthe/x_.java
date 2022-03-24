/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.pr;
import manthe.uW;
import manthe.xN;

public class x_
extends xN {
    private pr H;

    public x_(pr pr2) {
        super(x_.b.j, pr2.b());
        this.H = pr2;
    }

    @Override
    public boolean n() {
        return !this.H.e();
    }

    @Override
    public void a(uW uW2) {
        this.H.a(!this.H.e());
    }

    @Override
    public void a() {
        String string = this.H.b();
        if (!this.H.c().equals(this.H.b()) && !this.l()) {
            string = "*" + this.H.a();
        }
        this.b(string);
        super.a();
    }

    public pr J() {
        return this.H;
    }
}

