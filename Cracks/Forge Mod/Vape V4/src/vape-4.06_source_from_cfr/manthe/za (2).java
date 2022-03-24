/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.CQ;
import manthe.kS;
import manthe.k_;
import manthe.ka;
import manthe.on;
import manthe.r1;
import manthe.rU;
import manthe.wC;
import manthe.y5;
import manthe.zu;

public class za
extends y5 {
    public za() {
        super("DuelInfo", 0, 0, CQ.b, null);
    }

    @Override
    public void k() {
        this.z();
    }

    public rU S() {
        for (r1 r12 : on.p.F().d()) {
            if (!(r12 instanceof rU)) continue;
            return (rU)r12;
        }
        return null;
    }

    @Override
    public void a(kS kS2) {
        rU rU2 = this.S();
        if (rU2 == null) {
            return;
        }
        rU2.a(kS2);
        if (zu.b(wC.class) != null) {
            zu.b(wC.class).a(kS2);
        }
    }

    @Override
    public void a(k_ k_2) {
        rU rU2 = this.S();
        if (rU2 == null) {
            return;
        }
        rU2.a(k_2);
        if (zu.b(wC.class) != null) {
            zu.b(wC.class).a(k_2);
        }
    }

    @Override
    public void a(ka ka2) {
        rU rU2 = this.S();
        if (rU2 == null) {
            return;
        }
        rU2.a(ka2);
        if (zu.b(wC.class) != null) {
            zu.b(wC.class).a(ka2);
        }
    }
}

