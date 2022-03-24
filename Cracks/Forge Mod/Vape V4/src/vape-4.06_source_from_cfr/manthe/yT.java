/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.A5;
import manthe.A7;
import manthe.AO;
import manthe.CQ;
import manthe.DB;
import manthe.DF;
import manthe.Da;
import manthe.ds;
import manthe.dx;
import manthe.eD;
import manthe.eJ;
import manthe.gS;
import manthe.kF;
import manthe.km;
import manthe.on;
import manthe.y5;
import manthe.zM;
import manthe.zz;

public class yT
extends y5 {
    private final DB w = DB.a((Object)this, "Speed Check", false, "Ignore falling when Speed is enabled.");
    private final DF v = DF.a((Object)this, "Fall Dist", "#.#", "m", 0.1, 2.0, 5.0, "The amount of blocks to fall before attempting to lag back.");
    private final AO u = new AO();
    private boolean x;

    public yT() {
        super("AntiFall", 16028225, CQ.f, "Helps you with your Parkinson's\nPrevents you from falling into the void.");
        this.a(this.w, this.v);
    }

    @Override
    public boolean n() {
        return true;
    }

    @Override
    public void a(km km2) {
        eJ eJ2 = ds.k();
        gS gS2 = eJ2.i();
        if (eJ2.e() || gS2.e() || eJ2.j() || eJ2.o() || eJ2.a8().g() || eJ2.a8().h() || on.p.H().a(A7.class) || on.p.H().a(zM.class) || this.w.u().booleanValue() && on.p.H().a(zz.class)) {
            return;
        }
        if (km2.a() == Da.b) {
            dx dx2;
            if (!this.x && this.S()) {
                return;
            }
            if (this.x && this.u.a(250L) || eJ2.J()) {
                this.x = false;
                this.u.d();
                return;
            }
            double d10 = this.v.a();
            if ((double)eJ2.t() >= d10 && !on.p.H().b(zM.class).N() && ((dx2 = gS2.a(eJ2.z(), eJ2.l() - 1.0, eJ2.g())).e() || dx2.h().a(eD.h().h().a().getClass()))) {
                if (!this.x) {
                    this.x = true;
                    this.u.d();
                } else {
                    eJ2.bg().b(0.0f);
                    eJ2.bg().a(0.0f);
                    eJ2.k(0.0);
                    eJ2.d(0.0);
                    eJ2.c(eJ2.z(), eJ2.l() + (double)eJ2.t(), eJ2.g());
                    eJ2.j(0.0f);
                }
            }
        }
    }

    @Override
    public void a(kF kF2) {
        eJ eJ2 = ds.k();
        if (kF2.getPacket().e() || eJ2.e() || eJ2.i().e()) {
            return;
        }
        if (kF2.getPacket().a(A5.U)) {
            eJ2.j(0.0f);
            eJ2.k(0.0);
            eJ2.d(0.0);
            this.x = false;
            this.u.d();
        }
    }

    private boolean S() {
        eJ eJ2 = ds.k();
        gS gS2 = eJ2.i();
        for (double d10 = eJ2.l() - 1.0; d10 > 0.0; d10 -= 1.0) {
            dx dx2 = gS2.a(eJ2.z(), d10, eJ2.g());
            if (dx2.e() || dx2.h().a(eD.h().h().a().getClass())) continue;
            return true;
        }
        return false;
    }
}

