/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.V;
import manthe.cv;
import manthe.dL;
import manthe.dx;
import manthe.e7;
import manthe.ex;
import manthe.gB;

public class cp
extends cv {
    public cp(Object object) {
        super(object);
    }

    public e7 h() {
        return new e7(gB.c(cp.a.M().aa, this.b));
    }

    public ex g() {
        return new ex(gB.a(cp.a.M().aa, this.b));
    }

    public dx j() {
        if (V.c() >= 23) {
            return new dL(gB.b(cp.a.M().aa, this.b)).f();
        }
        return new dx(gB.b(cp.a.M().aa, this.b));
    }

    public double i() {
        return gB.d(cp.a.M().aa, this.b);
    }
}

