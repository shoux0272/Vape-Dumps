/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.V;
import manthe.eC;
import manthe.er;
import manthe.fS;
import manthe.gh;
import manthe.he;

public class eJ
extends eC {
    public eJ(Object object) {
        super(object);
    }

    public gh bg() {
        return new gh(eJ.a.M().aJ.b(this.b));
    }

    public fS bp() {
        if (V.c() <= 13) {
            return new er(this.b).bp();
        }
        return new fS(he.g(eJ.a.M().aJ, this.b));
    }

    @Override
    public float aF() {
        if (V.c() >= 23) {
            return eJ.a.M().aJ.c(this.b);
        }
        return super.aF();
    }

    @Override
    public void n(float f10) {
        if (V.c() >= 23) {
            eJ.a.M().aJ.c(this.b, f10);
            return;
        }
        super.n(f10);
    }

    public double bo() {
        if (V.c() <= 13) {
            return new er(this.a()).bv();
        }
        return he.a(eJ.a.M().aJ, this.b);
    }

    public void s(double d10) {
        if (V.c() <= 13) {
            new er(this.a()).y(d10);
            return;
        }
        he.a(eJ.a.M().aJ, this.b, d10);
    }

    public double bj() {
        if (V.c() <= 13) {
            return new er(this.a()).bx();
        }
        return he.i(eJ.a.M().aJ, this.b);
    }

    public void u(double d10) {
        if (V.c() <= 13) {
            new er(this.a()).x(d10);
            return;
        }
        he.b(eJ.a.M().aJ, this.b, d10);
    }

    public double bk() {
        if (V.c() <= 13) {
            return new er(this.a()).by();
        }
        return he.c(eJ.a.M().aJ, this.b);
    }

    public void t(double d10) {
        if (V.c() <= 13) {
            new er(this.a()).v(d10);
            return;
        }
        he.c(eJ.a.M().aJ, this.b, d10);
    }

    public float bi() {
        if (V.c() <= 13) {
            return new er(this.a()).bs();
        }
        return he.b(eJ.a.M().aJ, this.b);
    }

    public void u(float f10) {
        if (V.c() <= 13) {
            new er(this.a()).w(f10);
            return;
        }
        he.a(eJ.a.M().aJ, this.b, f10);
    }

    public float bl() {
        if (V.c() <= 13) {
            return new er(this.a()).bw();
        }
        return he.f(eJ.a.M().aJ, this.b);
    }

    public void t(float f10) {
        if (V.c() <= 13) {
            new er(this.a()).v(f10);
            return;
        }
        he.b(eJ.a.M().aJ, this.b, f10);
    }

    public boolean bn() {
        return he.e(eJ.a.M().aJ, this.b);
    }

    public void k(boolean bl) {
        he.b(eJ.a.M().aJ, this.b, bl);
    }

    public boolean bm() {
        return he.d(eJ.a.M().aJ, this.b);
    }

    public void j(boolean bl) {
        he.a(eJ.a.M().aJ, this.b, bl);
    }

    public int bh() {
        if (V.c() <= 13) {
            return new er(this.a()).bt();
        }
        return he.h(eJ.a.M().aJ, this.b);
    }

    public void g(int n6) {
        if (V.c() <= 13) {
            new er(this.a()).h(n6);
            return;
        }
        he.a(eJ.a.M().aJ, this.b, n6);
    }

    public void l(boolean bl) {
        he.c(eJ.a.M().aJ, this.b, bl);
    }

    public void a(String string) {
        if (V.c() <= 13) {
            new er(this.a()).a(string);
            return;
        }
        he.a(eJ.a.M().aJ, this.b, string);
    }
}

