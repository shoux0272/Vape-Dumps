/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.awt.Color;
import java.util.List;
import manthe.Bh;
import manthe.CQ;
import manthe.DE;
import manthe.Ds;
import manthe.H;
import manthe.aU;
import manthe.cB;
import manthe.cL;
import manthe.ds;
import manthe.ng;
import manthe.on;
import manthe.pW;
import manthe.pZ;
import manthe.ul;
import manthe.w5;
import manthe.wH;
import manthe.wK;
import manthe.wM;
import manthe.wN;
import manthe.wO;
import manthe.wS;
import manthe.wT;
import manthe.wZ;
import manthe.w_;
import manthe.we;
import manthe.wi;
import manthe.wn;
import manthe.wu;
import manthe.x2;
import manthe.xB;
import manthe.xC;
import manthe.xM;
import manthe.xZ;
import manthe.xj;
import manthe.xx;
import manthe.y5;
import manthe.yf;
import manthe.zE;
import manthe.zu;

public class wp
extends we {
    private xC V;

    public wp() {
        this.a(wp.b.k);
        this.W().e(false);
        this.W().b("wrap");
        this.a(new xM(this, "newsettings", "Settings").a(new H(this)));
        cB cB2 = on.p.t();
        yf yf2 = on.p.D();
        zu zu2 = zu.T;
        this.a((wM)new x2(wp.b.y), new Object[0]);
        this.a((wM)new xZ("MODULE SETTINGS"), new Object[0]);
        this.a((wM)new wK(cB2.u), new Object[0]);
        this.a((wM)new wK(cB2.t), new Object[0]);
        this.a((wM)new wS(this, cB2.K, cB2), new Object[0]);
        this.a((wM)new wO(this, cB2.O, cB2), new Object[0]);
        this.a((wM)new xj(this, DE.a((Object)this, "Team Color", new Color(0, 190, 189)), cB2), new Object[0]);
        this.a((wM)new wK(cB2.y), new Object[0]);
        this.a((wM)new wK(cB2.z), new Object[0]);
        this.a((wM)new wK(cB2.a), new Object[0]);
        this.a((wM)new wK(cB2.f), new Object[0]);
        this.a((wM)new wZ(this, cB2.x), new Object[0]);
        this.a((wM)new wn(this, cB2.n), new Object[0]);
        this.a((wM)new wi(this, cB2.N), new Object[0]);
        this.a((wM)new wK(cB2.k), new Object[0]);
        this.a((wM)new wN(this, cB2.i, cB2), new Object[0]);
        this.a((wM)new w_(this, cB2.A, cB2), new Object[0]);
        this.a((wM)new x2(wp.b.y), new Object[0]);
        this.a((wM)new xZ("GENERAL SETTINGS"), new Object[0]);
        this.a(new w5(zu2.aj).a(new ul(this, zu2)), new Object[0]);
        this.V = new xC(cB2.r);
        this.a((wM)this.V, new Object[0]);
        this.a((wM)new wK(yf2.a), new Object[0]);
        this.a((wM)new wK(zu2.G), new Object[0]);
        this.a((wM)new wK(zu2.aa), new Object[0]);
        this.a((wM)new wK(zu2.y), new Object[0]);
        this.a((wM)new wK(zu2.w), new Object[0]);
        this.a((wM)new wK(zu2.v), new Object[0]);
        this.a((wM)new wK(zu2.an), new Object[0]);
        this.a((wM)new wK(zu2.F), new Object[0]);
        this.a((wM)new wH(this, zu2.M, zu2), new Object[0]);
        this.a((wM)new xx(zu2.X), new Object[0]);
        this.a(new xB("Rebind GUI", zu2).a("Change the bind of the GUI"), new Object[0]);
        this.a(new w5(zu.T.R), new Object[0]);
        this.a(new wu("Reset current profile", new pW(this)).a("This will set your current profile to\nthe default settings of Vape"), new Object[0]);
        this.a(new wu("Reset GUI positions", new aU(this)).a("This will reset your GUI back to the default"), new Object[0]);
        this.a(new wu("Sort GUI", new pZ(this)).a("Sorts GUI by size"), new Object[0]);
        this.a(new wu("Uninject", new cL(this)).a("Uninjects Vape from your game(Self destruct)\nNote that Vape V4 is not designed to protect against screenshares\nDisinjecting will likely not protect against one"), new Object[0]);
        this.a(false);
        this.j(false);
    }

    private void n() {
        int n6 = 10;
        for (we we2 : zu.T()) {
            if (we2 instanceof wT) {
                we2.a(10.0, 20.0);
                continue;
            }
            if (!we2.ab() || we2.af()) continue;
            we2.a(zu.b(wT.class).e() + 10.0, n6 += 22);
        }
        ng.f.al();
        ng.f.p(true);
        for (we we2 : zu.T()) {
            if (we2.af() || !we2.ab()) continue;
            we2.a(we2 instanceof wT);
        }
    }

    private void m() {
        for (y5 bI2 : on.p.H().e()) {
            if ((bI2.Q() != CQ.b || bI2 instanceof zE) && bI2.N()) {
                bI2.d(false);
            }
            bI2.c().clear();
            if (bI2.P() != 0) {
                bI2.c().add(bI2.P());
            }
            if (bI2.l() != null && bI2.l().Y() != null) {
                bI2.l().Y().g(bI2.v());
            }
            for (Ds ds2 : bI2.r()) {
                if (ds2.b() == null) continue;
                ds2.q();
            }
        }
        for (Ds ds3 : on.p.o().a()) {
            if (ds3.b() == null) continue;
            ds3.q();
        }
        this.V.l();
    }

    private void ak() {
        List<we> list = zu.T();
        list.sort(new Bh(this));
        double d10 = 32.0;
        double d11 = 32.0;
        double d12 = 0.0;
        for (we we2 : list) {
            double d13;
            if (!we2.b() || we2.af() || !we2.ab() || we2 instanceof wT) continue;
            if (d10 + we2.e() > (double)ds.p().g()) {
                d10 = 30.0;
                d11 += d12 + 4.0;
                d12 = 0.0;
            }
            double d14 = d13 = we2.f() > we2.L() ? we2.L() : we2.f();
            if (d13 > d12) {
                d12 = d13;
            }
            we2.a(d10, d11);
            d10 += we2.e() + 2.0;
        }
    }

    @Override
    public void V() {
    }

    @Override
    public void K() {
    }

    @Override
    public String ad() {
        return "Settings";
    }

    static void a(wp wp2) {
        wp2.m();
    }

    static void b(wp wp2) {
        wp2.n();
    }

    static void c(wp wp2) {
        wp2.ak();
    }
}

