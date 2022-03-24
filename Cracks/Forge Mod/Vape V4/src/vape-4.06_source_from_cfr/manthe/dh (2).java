/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.cv;
import manthe.ew;
import manthe.ex;
import manthe.gP;

public class dh
extends cv {
    public dh(Object object) {
        super(object);
    }

    public ex g() {
        return new ex(gP.c(dh.a.M().b9, this.b));
    }

    public ew j() {
        return new ew(gP.a(dh.a.M().b9, this.b));
    }

    public double k() {
        return gP.e(dh.a.M().b9, this.b);
    }

    public double h() {
        return gP.d(dh.a.M().b9, this.b);
    }

    public double i() {
        return gP.b(dh.a.M().b9, this.b);
    }
}

