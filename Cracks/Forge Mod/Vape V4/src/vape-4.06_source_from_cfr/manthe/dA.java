/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.V;
import manthe.dL;
import manthe.dj;
import manthe.dr;
import manthe.dx;
import manthe.g1;
import manthe.gS;
import manthe.gg;
import manthe.hZ;

public class dA
extends dx {
    public dA(Object object) {
        super(object);
    }

    public boolean b(gS gS2, int n6, int n10, int n11) {
        if (V.c() == 13) {
            return true;
        }
        g1 g12 = g1.a(n6, n10, n11);
        dL dL2 = gS2.a(g12);
        dL dL3 = new dL(dA.a.M().a.a(this.b, dL2.a(), gS2.a(), g12.a()));
        Object object = dL3.a(dA.i());
        if (object != null) {
            return object.toString().equals("foot");
        }
        return true;
    }

    public gg c(gS gS2, int n6, int n10, int n11) {
        g1 g12 = g1.a(n6, n10, n11);
        dL dL2 = gS2.a(g12);
        dL dL3 = new dL(dA.a.M().a.a(this.b, dL2.a(), gS2.a(), g12.a()));
        Object object = dL3.a(dj.i());
        return new gg(object);
    }

    public static dr i() {
        return new dr(hZ.a(dA.a.M().bL));
    }
}

