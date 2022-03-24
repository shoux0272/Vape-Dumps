/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.CQ;
import manthe.Da;
import manthe.ds;
import manthe.e6;
import manthe.eJ;
import manthe.eT;
import manthe.ej;
import manthe.ev;
import manthe.kJ;
import manthe.kT;
import manthe.kt;
import manthe.on;
import manthe.y5;
import manthe.zG;

public class z7
extends y5 {
    private double u;
    private double v;
    private zG x;
    private e6 w;

    public z7() {
        super("KeepSprint", 14828276, CQ.f, "Prevents you from losing sprint when attacking.");
    }

    @Override
    public void a(kJ kJ2) {
        eJ eJ2 = ds.k();
        if (this.x == null) {
            this.x = on.p.H().b(zG.class);
        }
        if (this.x.V()) {
            return;
        }
        if (kJ2.a() == Da.b) {
            this.u = eJ2.k();
            this.v = eJ2.u();
        }
        if (kJ2.a() == Da.a && eJ2.k() == (this.u *= 0.6) && eJ2.u() == (this.v *= 0.6) && !eJ2.E()) {
            eJ2.k(eJ2.k() / 0.6);
            eJ2.d(eJ2.u() / 0.6);
            eJ2.l(true);
        }
    }

    @Override
    public void b(kt kt2) {
        if (this.x == null) {
            this.x = on.p.H().b(zG.class);
        }
        if (this.x.V()) {
            return;
        }
        ev ev2 = ds.k().a(eT.f());
        if (ds.k().C() && ev2.a(ej.aI().f()).e()) {
            ev2.a(ej.aI());
        }
    }

    @Override
    public void a(kT kT2) {
        if (this.x == null) {
            this.x = on.p.H().b(zG.class);
        }
        if (this.x.V()) {
            return;
        }
        if (!kT2.getEntity().equals(ds.k())) {
            return;
        }
        if (kT2.isNewStateSprinting()) {
            return;
        }
        if (this.a(ds.k())) {
            kT2.a(true);
        }
    }

    @Override
    public boolean n() {
        return true;
    }

    private boolean a(eJ eJ2) {
        if (eJ2.e()) {
            return false;
        }
        return !this.x.V() && eJ2.aF() > 0.0f && !eJ2.af() && eJ2.a2().f() > 6 && !eJ2.E();
    }
}

