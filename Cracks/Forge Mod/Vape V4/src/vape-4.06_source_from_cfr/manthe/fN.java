/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.ex;
import manthe.fB;
import manthe.fn;
import manthe.gS;
import manthe.jW;

public class fN
extends fn {
    public fN(Object object) {
        super(object);
    }

    public static fN a(ex ex2, fB fB2) {
        return new fN(jW.a(fN.a.M().m, ex2.a(), fB2.a()));
    }

    public static fN a(ex ex2) {
        return new fN(jW.b(fN.a.M().m, ex2.a()));
    }

    public fB g() {
        return new fB(jW.a(fN.a.M().m, this.b), null);
    }

    public ex a(gS gS2) {
        return gS2.a(fN.a.M().m.a(this.b));
    }
}

