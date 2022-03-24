/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.V;
import manthe.cy;
import manthe.dJ;
import manthe.dL;
import manthe.ds;
import manthe.ex;
import manthe.fP;
import manthe.g1;
import manthe.gS;
import manthe.hO;

public class dx
extends cy {
    public dx(Object object) {
        super(object);
    }

    public static int a(dx dx2) {
        return dx.a.M().a.b(dx2.a());
    }

    public static dx a(String string) {
        Object object = dx.a.M().a.a(string);
        if (object == null) {
            return null;
        }
        return new dx(object);
    }

    public int g() {
        return hO.c(dx.a.M().a, this.b);
    }

    public dJ h() {
        if (V.c() >= 23) {
            return new dJ(hO.a(dx.a.M().a, this.b, null));
        }
        return new dJ(hO.a(dx.a.M().a, this.b));
    }

    public void a(gS gS2, int n6, int n10, int n11, ex ex2) {
        hO.a(dx.a.M().a, this.b, gS2.a(), n6, n10, n11, ex2.a());
    }

    public void a(gS gS2, ex ex2) {
        hO.b(dx.a.M().a, this.b, gS2.a(), ex2.a());
    }

    public void a(gS gS2, g1 g12, ex ex2) {
        if (V.c() >= 23) {
            return;
        }
        hO.a(dx.a.M().a, this.b, gS2.a(), g12.a(), ex2.a());
    }

    public fP a(gS gS2, int n6, int n10, int n11) {
        if (V.c() >= 23) {
            return null;
        }
        return new fP(hO.b(dx.a.M().a, this.b, gS2.a(), n6, n10, n11));
    }

    public Boolean a(dL dL2, boolean bl) {
        return dx.a.M().a.a(this.b, (Object)dL2, bl);
    }

    public boolean a(int n6, boolean bl) {
        return hO.a(dx.a.M().a, this.b, n6, bl);
    }

    public int a(int n6, int n10, int n11) {
        if (V.c() == 13) {
            return hO.a(dx.a.M().a, this.b, ds.t().a(), n6, n10, n11);
        }
        if (V.c() == 15) {
            return hO.a(dx.a.M().a, this.b, ds.t().a(), g1.a(n6, n10, n11).a());
        }
        if (V.c() == 23) {
            return hO.b(dx.a.M().a, this.b, ds.t().a(g1.a(n6, n10, n11)).a());
        }
        return 0;
    }

    public float f() {
        return hO.b(dx.a.M().a, this.b);
    }

    public boolean a(dL dL2) {
        if (V.c() >= 23) {
            return dx.a.M().a.a(this.b, dL2.a());
        }
        return dx.a.M().a.e(this.b);
    }

    public boolean b(dL dL2) {
        if (V.c() >= 23) {
            return dx.a.M().a.b(this.b, dL2.a());
        }
        return dx.a.M().a.a(this.b);
    }
}

