/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.AP;
import manthe.CK;
import manthe.bQ;
import manthe.k9;
import manthe.m2;
import manthe.mF;
import manthe.mq;
import manthe.o7;
import manthe.uW;
import manthe.vZ;
import manthe.wM;
import manthe.wV;
import manthe.ww;
import manthe.wy;
import manthe.wz;
import manthe.xg;
import manthe.y5;
import manthe.zu;

public class xW
extends xg {
    private wy K;
    private ww I = new ww("", 0.75);
    private ww F = new ww("", 0.75);
    private String B;
    private String D;
    private int G = 0;
    private ww C = new ww("Edit");
    private wV E = new wV("newhide", 0.7);
    private wV H = new wV("moduleback");
    private wV J = new wV("", 0.3);

    public xW(wy wy2, String string, String string2) {
        super(wy2);
        this.K = wy2;
        this.B = string;
        this.D = string2;
        this.E.c(new CK(this));
        this.E.a("Edit hidden modules");
        this.H.c(new m2(this));
        this.C.c(new AP(this));
        this.J.c(new bQ(this, wy2));
        this.a(this.C, this.H, this.E, this.J, this.F, this.I);
    }

    @Override
    public void a() {
        mq mq2 = this.e(0.9);
        double d10 = mq2.a(this.D);
        double d11 = this.c() + this.f() / 2.0 - d10 / 2.0;
        double d12 = this.c() + this.f() / 2.0 - 4.0;
        mq2.a(this.D, this.d() + 10.0 + 8.0, d11, xW.b.c);
        if (this.K.ak() != null && !zu.E) {
            this.E.a(false);
            this.C.a(false);
            this.H.d(xW.b.c);
            this.H.a(true);
            this.H.c(this.d() + 5.0);
            this.H.a(this.c());
            this.H.d(this.f());
            this.J.a(false);
            this.I.a(true);
            this.F.a(true);
            this.F.c(this.d() + this.e() - 5.0 - this.F.e());
            this.F.a(this.c());
            this.F.d(this.f());
            this.I.c(this.d() + this.e() - 10.0 - this.F.e() - this.I.e());
            this.I.a(this.c());
            this.I.d(this.f());
        } else {
            this.I.a(false);
            this.F.a(false);
            this.J.a(true);
            k9.a(xW.b.c, (float)this.d() + 5.0f, (float)d12, this.B, 8.0f, 8.0f, false);
            this.H.a(false);
            if (zu.E) {
                this.E.a(false);
                this.C.a(true);
                this.C.b("Done");
                this.C.c(this.d() + this.e() - 10.0 - 16.0 - mq2.b(this.C.O()) / 2.0);
                this.C.a(this.c());
                this.C.d(this.f());
            } else {
                if (((xW)this.F().Y()).n() > 0) {
                    mq2.a("" + this.G, this.d() + this.e() - 15.0 - 16.0, d11, xW.b.r);
                    this.E.b("newhide");
                    this.E.a(true);
                } else {
                    this.E.b("newedit");
                    if (this.l().q().a(o7.b())) {
                        this.E.a(true);
                    } else {
                        this.E.a(false);
                    }
                }
                this.C.a(false);
                this.E.d(zu.E ? xW.b.a : null);
                this.E.c(this.d() + this.e() - 10.0 - 16.0);
                this.E.a(this.c());
                this.E.d(this.f());
            }
            this.J.c(this.d() + this.e() - 7.5 - 8.0);
            this.J.a(this.c());
            this.J.d(this.f());
            this.J.b(this.K.m() ? "downexpand" : "upcollapse");
        }
    }

    @Override
    public void k() {
    }

    @Override
    public void j() {
        if (this.K.ak() != null && zu.E) {
            this.K.a((y5)null);
        }
    }

    @Override
    public void a(uW uW2) {
    }

    @Override
    public void i() {
    }

    public void J() {
        if (zu.E) {
            zu.E = false;
            zu.an();
        }
        if (this.K.ak() != null) {
            this.K.a((y5)null);
        }
        zu.a(this.K.an());
        for (wM wM2 : this.l().w()) {
            if (wM2 instanceof xg) continue;
            if (!(wM2 instanceof wz)) {
                wM2.a(false);
                continue;
            }
            wM2.a(!this.K.m() && ((wz)wM2).S().x());
        }
        this.l().M();
    }

    public void a(y5 y52) {
        if (y52 == null) {
            this.F.b("");
            return;
        }
        this.F.b(y52.H().toUpperCase().substring(0, 3) + " >");
        this.F.b(new vZ(this, y52));
    }

    public void b(y5 y52) {
        if (y52 == null) {
            this.I.b("");
            return;
        }
        this.I.b("< " + y52.H().toUpperCase().substring(0, 3));
        this.I.b(new mF(this, y52));
    }

    public int n() {
        return this.G;
    }

    public void a(int n6) {
        this.G = n6;
    }

    static wy a(xW xW2) {
        return xW2.K;
    }
}

