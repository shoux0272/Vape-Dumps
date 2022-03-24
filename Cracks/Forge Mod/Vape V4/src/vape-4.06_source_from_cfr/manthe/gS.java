/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.util.List;
import manthe.V;
import manthe.cy;
import manthe.dL;
import manthe.dx;
import manthe.ex;
import manthe.fP;
import manthe.g1;
import manthe.gK;
import manthe.gZ;
import manthe.gb;
import manthe.gi;
import manthe.gn;
import manthe.kI;

public class gS
extends cy {
    public gS(Object object) {
        super(object);
    }

    public boolean c(g1 g12) {
        return gS.a.M().s.e(this.b, g12.a());
    }

    public List k() {
        return gS.a.M().s.b(this.b);
    }

    public List j() {
        return gS.a.M().s.c(this.b);
    }

    public List h() {
        return gS.a.M().s.d(this.b);
    }

    public List a(ex ex2, fP fP2) {
        return gS.a.M().s.a(this.b, ex2.a(), fP2.a());
    }

    public dx a(double d10, double d11, double d12) {
        if (V.c() == 13) {
            return new dx(gS.a.M().s.c(this.b, (int)d10, (int)d11, (int)d12));
        }
        g1 g12 = g1.a(d10, d11, d12);
        dL dL2 = new dL(gS.a.M().s.a(this.b, g12.a()));
        return dL2.f();
    }

    public dx b(int n6, int n10, int n11) {
        if (V.c() == 13) {
            return new dx(gS.a.M().s.c(this.b, n6, n10, n11));
        }
        g1 g12 = g1.a(n6, n10, n11);
        dL dL2 = new dL(gS.a.M().s.a(this.b, g12.a()));
        return dL2.f();
    }

    public List b(ex ex2, fP fP2) {
        return gS.a.M().s.c(this.b, ex2.a(), fP2.a());
    }

    public boolean a(fP fP2) {
        return kI.b(gS.a.M().s, this.b, fP2.a());
    }

    public dL a(g1 g12) {
        return new dL(gS.a.M().s.a(this.b, g12.a()));
    }

    public boolean b(fP fP2) {
        return kI.a(gS.a.M().s, this.b, fP2.a());
    }

    public void a(ex ex2) {
        kI.c(gS.a.M().s, this.b, ex2.a());
    }

    public gZ g() {
        return new gZ(kI.a(gS.a.M().s, this.b));
    }

    public gb a(gK gK2, gK gK3, boolean bl, boolean bl2, boolean bl3) {
        return new gb(gS.a.M().s.a(this.b, gK2.a(), gK3.a(), bl, bl2, bl3));
    }

    public boolean b(int n6, int n10, int n11, int n12, int n13, int n14) {
        if (V.c() == 13) {
            return kI.a(gS.a.M().s, this.b, n6, n10, n11, n12, n13, n14);
        }
        return kI.a(gS.a.M().s, this.b, g1.a(n6, n10, n11), g1.a(n12, n13, n14));
    }

    public gn a(int n6, int n10) {
        return new gn(kI.a(gS.a.M().s, this.b, n6, n10));
    }

    public gn b(g1 g12) {
        return new gn(gS.a.M().s.c(this.b, g12.a()));
    }

    public gn b(int n6, int n10) {
        return new gn(gS.a.M().s.b(this.b, n6, n10));
    }

    public gi f() {
        return new gi(gS.a.M().s.e(this.b));
    }

    public int c(int n6, int n10, int n11) {
        return kI.a(gS.a.M().s, this.b, n6, n10, n11);
    }

    public boolean a(int n6, int n10, int n11) {
        return kI.b(gS.a.M().s, this.b, n6, n10, n11);
    }

    public ex a(int n6) {
        return new ex(kI.a(gS.a.M().s, this.b, n6));
    }

    public boolean i() {
        return kI.b(gS.a.M().s, this.b);
    }

    public void a(int n6, int n10, int n11, int n12, int n13, int n14) {
        kI.b(gS.a.M().s, this.b, n6, n10, n11, n12, n13, n14);
    }
}

