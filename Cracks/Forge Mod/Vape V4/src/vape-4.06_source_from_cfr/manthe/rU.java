/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.awt.Color;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import manthe.A5;
import manthe.D7;
import manthe.bx;
import manthe.ds;
import manthe.eC;
import manthe.eF;
import manthe.eJ;
import manthe.fG;
import manthe.gO;
import manthe.gS;
import manthe.kS;
import manthe.k_;
import manthe.ka;
import manthe.my;
import manthe.nH;
import manthe.p1;
import manthe.pd;
import manthe.r1;
import manthe.rQ;
import manthe.rf;
import manthe.rl;
import manthe.sh;
import manthe.yk;

public class rU
extends r1 {
    private final rl ak;
    private final sh ap;
    private final sh aj;
    double ae;
    double al;
    double an;
    private gS ah;
    private int am;
    private int ag;
    private int aq;
    private int ao;
    private int af;
    private eC ai;

    public rU() {
        super("Duel Info", true);
        this.aj().a(new D7(0.0, 2.0, 5000, 1, new pd(2, 2, 2, 2)));
        this.c(130.0);
        double d10 = this.q() - 0.0;
        rf rf2 = new rf(true);
        rf2.a(new D7(0.0, 0.0, 5000, 2, new pd(0, 0, 0, 0)));
        rf2.b(a);
        rf2.j(false);
        rf2.b(15.0);
        rQ rQ2 = new rQ("di_target", 0.45f, 0.0f, 0.0f);
        rQ2.b("Current target");
        rQ2.e(true);
        rQ2.b(15.0);
        rQ2.c(15.0);
        rf2.b(rQ2);
        this.ak = new rl("Archyb0t", my.i, 1.0);
        this.ak.b(15.0);
        this.ak.c(d10 - rQ2.q());
        this.ak.j(false);
        rf2.b(this.ak);
        this.d(rf2);
        rf rf3 = new rf(true);
        rf3.a(new D7(0.0, 0.0, 5000, 2, new pd(0, 0, 0, 0)));
        rf3.b(a);
        rf3.j(false);
        rf3.b(15.0);
        rQ rQ3 = new rQ("di_pot", 0.45f, 0.0f, 0.0f);
        rQ3.b("Difference of potions used");
        rQ3.e(true);
        rQ3.b(15.0);
        rQ3.c(15.0);
        rf3.b(rQ3);
        rf rf4 = new rf(false);
        rf4.a(new D7(0.0, 0.0, 5000, 1, new pd(0, 2, 0, 2)));
        this.ap = new sh();
        rf4.b(this.ap);
        this.ap.c(d10 - rQ3.q() - 4.0);
        this.ap.b(15.0);
        this.ap.j(false);
        this.ap.f(true);
        this.ap.a(new yk(this, rf3));
        rf3.b(rf4);
        this.d(rf3);
        rf rf5 = new rf(true);
        rf5.a(new D7(0.0, 0.0, 5000, 2, new pd(0, 0, 0, 0)));
        rf5.b(a);
        rf5.j(false);
        rf5.b(15.0);
        rQ rQ4 = new rQ("di_hit", 0.45f, 0.0f, 0.0f);
        rQ4.b("Difference of hits landed");
        rQ4.e(true);
        rQ4.b(15.0);
        rQ4.c(15.0);
        rf5.b(rQ4);
        rf4 = new rf(false);
        rf4.a(new D7(0.0, 0.0, 5000, 1, new pd(0, 2, 0, 2)));
        this.aj = new sh();
        rf4.b(this.aj);
        this.aj.c(d10 - rQ4.q() - 4.0);
        this.aj.b(15.0);
        this.aj.j(false);
        this.aj.a(new bx(this, rf5));
        rf5.b(rf4);
        this.d(rf5);
        this.am();
        this.c(135.0);
        this.b(21.0);
        this.o(false);
    }

    @Override
    public void c(double d10) {
        super.c(d10);
        for (p1 p12 : this.aj().v()) {
            p12.c(d10 - 0.0);
        }
    }

    private boolean an() {
        gO gO2 = ds.t();
        if (this.ah == null) {
            this.ah = gO2;
            return true;
        }
        boolean bl = gO2.d() && !gO2.a().equals(this.ah.a());
        this.ah = gO2;
        return bl;
    }

    private void am() {
        this.ak.a("Searching...");
        this.ai = null;
        this.am = 0;
        this.ag = 0;
        this.af = 0;
        this.aq = 0;
        this.ao = 0;
        this.ap.b(0, 0);
        this.ap.b((Color)null);
        this.aj.b(0, 0);
        this.aj.b((Color)null);
    }

    private void ao() {
        this.ap.b(this.am, this.ag);
        this.aj.b(this.aq, this.ao);
    }

    private void al() {
        if (ds.t().e()) {
            return;
        }
        if (ds.k().e()) {
            return;
        }
        this.ak.a("Searching...");
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList(ds.t().j());
        ArrayList<eC> arrayList = new ArrayList<eC>();
        for (Object e10 : copyOnWriteArrayList) {
            eC eC2;
            if (!A5.cc.isInstance(e10) || (eC2 = new eC(e10)).ae() || eC2.a().equals(ds.k().a()) || eC2.j() || eC2.q() == -420) continue;
            arrayList.add(eC2);
        }
        if (arrayList.size() > 1) {
            this.ak.a("More than one target");
        } else if (arrayList.size() == 1) {
            this.ai = (eC)arrayList.get(0);
            this.ak.a(this.ai.S());
            this.ao();
        }
    }

    public void a(k_ k_2) {
        if (this.ai == null || this.ai.e()) {
            return;
        }
        if (!k_2.getName().equals("game.player.hurt")) {
            return;
        }
        if (ds.k().a(this.ai) > 6.0f) {
            return;
        }
        if (k_2.getEntity().a().equals(ds.k().a())) {
            ++this.ao;
        }
        if (k_2.getEntity().a().equals(this.ai.a())) {
            ++this.aq;
        }
        this.ao();
    }

    public void a(kS kS2) {
        if (!kS2.getEntity().a(A5.aX)) {
            return;
        }
        if (this.ai == null || this.ai.e()) {
            return;
        }
        if (ds.k().e()) {
            return;
        }
        eF eF2 = new eF(kS2.getEntity());
        if (eF2.at().e()) {
            return;
        }
        boolean bl = nH.a(eF2.at());
        if (!bl) {
            return;
        }
        if (this.af > 0) {
            ++this.am;
            --this.af;
        } else {
            ++this.ag;
        }
        this.ao();
    }

    public void a(ka ka2) {
        if (this.ai == null || this.ai.e()) {
            return;
        }
        fG fG2 = ka2.getItemStack();
        if (fG2.d() && A5.dx.isInstance(fG2.k().a()) && nH.a(fG2)) {
            ++this.af;
        }
    }

    @Override
    public void c() {
        super.c();
        this.b(20.0);
    }

    @Override
    public void W() {
        try {
            eJ eJ2 = ds.k();
            if (!this.ai() || this.z()) {
                this.am();
                return;
            }
            if (ds.k().e()) {
                return;
            }
            boolean bl = Math.abs(eJ2.z() - this.ae) > 120.0 || Math.abs(eJ2.l() - this.al) > 120.0 || Math.abs(eJ2.g() - this.an) > 120.0;
            this.ae = eJ2.z();
            this.al = eJ2.l();
            this.an = eJ2.g();
            if (this.an() || bl) {
                this.am();
                return;
            }
            if (ds.t().e()) {
                return;
            }
            if (this.ai == null || this.ai.e()) {
                this.al();
            } else {
                if (eJ2.j() || this.ai.j()) {
                    this.am();
                    return;
                }
                boolean bl2 = false;
                for (Object e10 : ds.t().j()) {
                    if (this.ai.a().equals(e10)) {
                        bl2 = true;
                        break;
                    }
                    eC eC2 = new eC(e10);
                    if (this.ai.a().equals(eC2.a()) || !this.ai.S().equalsIgnoreCase(eC2.S())) continue;
                    this.ai = eC2;
                }
                if (!bl2) {
                    this.ai = null;
                    this.al();
                }
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    static sh a(rU rU2) {
        return rU2.ap;
    }

    static sh b(rU rU2) {
        return rU2.aj;
    }
}

