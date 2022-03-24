/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.util.List;
import manthe.A5;
import manthe.AO;
import manthe.V;
import manthe.Y;
import manthe.dJ;
import manthe.ds;
import manthe.dx;
import manthe.eC;
import manthe.eM;
import manthe.ed;
import manthe.fE;
import manthe.fG;
import manthe.fX;
import manthe.g1;
import manthe.on;
import manthe.pf;
import manthe.zt;

public class tB {
    private eC l;
    private float b = 20.0f;
    private int c;
    private int i = 20;
    private float g = 5.0f;
    private float e;
    private boolean h;
    private boolean k;
    private boolean j;
    private int f;
    private fG a;
    private final AO d = new AO();

    public tB(eC eC2) {
        this.l = eC2;
    }

    public void a() {
        boolean bl;
        ++this.f;
        this.d.d();
        if (this.b > 20.0f) {
            this.b = 20.0f;
        }
        boolean bl2 = on.p.H().b(zt.class).T() && this.a(this.l.l() - this.l.R(), this.l.v());
        boolean bl3 = bl = on.p.H().b(zt.class).S() && this.b();
        if (this.h) {
            this.e += 0.3f;
            if (this.j && this.f <= 11) {
                List<ed> list;
                boolean bl4 = false;
                eM eM2 = ds.y();
                if (eM2.d() && (list = eM2.g()).size() > 0) {
                    for (ed ed2 : list) {
                        if (!ed2.at().f().equalsIgnoreCase("crit") || this.l.e() || !((double)this.l.a(ed2) < 1.1) || !(ed2.l() < this.l.l() + 2.5) || pf.c(this.l, ed2)) continue;
                        bl4 = true;
                        break;
                    }
                }
                float f10 = zt.a(this.a, this.l, this.k, bl4);
                this.b -= f10;
                this.j = false;
            } else if (!bl2 && !bl && this.l.ai()) {
                this.b -= zt.b(this.l, false, 1.0f);
            }
            this.h = false;
            this.k = false;
        }
    }

    public boolean a(double d10, boolean bl) {
        fE fE2;
        float f10;
        int n6;
        float f11 = (float)(this.l.l() - this.l.R());
        if (V.c() > 13) {
            dx dx2;
            int n10 = Y.c(this.l.z());
            int n11 = Y.c(this.l.l() - (double)0.2f);
            n6 = Y.c(this.l.g());
            g1 g12 = g1.a(n10, n11, n6);
            dx dx3 = ds.t().a(g12).f();
            if (dx3.h().equals(dJ.i()) && ((dx2 = ds.t().a(g12.l()).f()).a(A5.n) || dx2.a(A5.bb) || dx2.a(A5.bX))) {
                g12 = g12.l();
                dx3 = ds.t().a(g12).f();
            }
            f11 += this.l.t();
            this.l.a(d10, bl, dx3, g12);
        } else {
            this.l.a(d10, bl);
        }
        if (this.l.v() && f11 > 0.0f && (n6 = Y.e(f11 - 3.0f - (f10 = (fE2 = this.l.b(fX.k())).d() ? (float)(fE2.h() + 1) : 0.0f))) > 0) {
            this.b -= (float)n6;
            return true;
        }
        return false;
    }

    private boolean b() {
        boolean bl = false;
        if (this.b >= 20.0f) {
            this.c = 0;
        }
        if (this.b > 0.0f && this.b < 20.0f) {
            ++this.c;
            if (this.c >= 80 && (!this.l.ai() || ds.k().a(fX.n()))) {
                this.b += 1.0f;
                this.e += 3.0f;
                this.c = 0;
            }
        } else if (this.i <= 0) {
            ++this.c;
            if (this.c >= 80) {
                if (this.b > 1.0f) {
                    this.b -= 1.0f;
                    bl = true;
                }
                this.c = 0;
            }
        } else {
            this.c = 0;
        }
        return bl;
    }

    static float b(tB tB2) {
        return tB2.b;
    }

    static float b(tB tB2, float f10) {
        tB2.b = f10;
        return tB2.b;
    }

    static boolean b(tB tB2, boolean bl) {
        tB2.k = bl;
        return tB2.k;
    }

    static int c(tB tB2, int n6) {
        tB2.f = n6;
        return tB2.f;
    }

    static boolean a(tB tB2, boolean bl) {
        tB2.j = bl;
        return tB2.j;
    }

    static fG a(tB tB2, fG fG2) {
        tB2.a = fG2;
        return tB2.a;
    }

    static eC a(tB tB2, eC eC2) {
        tB2.l = eC2;
        return tB2.l;
    }

    static AO a(tB tB2) {
        return tB2.d;
    }

    static int b(tB tB2, int n6) {
        tB2.i = n6;
        return tB2.i;
    }

    static int a(tB tB2, int n6) {
        tB2.c = n6;
        return tB2.c;
    }

    static float a(tB tB2, float f10) {
        tB2.e = f10;
        return tB2.e;
    }

    static float c(tB tB2, float f10) {
        tB2.g = f10;
        return tB2.g;
    }

    static boolean c(tB tB2, boolean bl) {
        tB2.h = bl;
        return tB2.h;
    }
}

