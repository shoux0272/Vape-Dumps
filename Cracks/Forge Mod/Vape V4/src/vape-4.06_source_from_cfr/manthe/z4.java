/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.CQ;
import manthe.DF;
import manthe.ds;
import manthe.eJ;
import manthe.f_;
import manthe.kt;
import manthe.y5;

public class z4
extends y5 {
    private final DF u = DF.a(this, "Health", "#.#", "", 0.5, 8.0, 10.0, 0.5, "Minimum health to regen at\nMay not bypass Anti-Cheats");

    public z4() {
        super("Regen", 8919359, CQ.f, "Regenerates health quicker.");
    }

    @Override
    public boolean n() {
        return true;
    }

    @Override
    public void b(kt kt2) {
        eJ eJ2 = ds.k();
        if ((double)eJ2.aD() < this.u.a() * 2.0 && eJ2.a2().f() > 16 && !eJ2.bd() && eJ2.J() && eJ2.v() && !ds.s().l().h() && !eJ2.H() && eJ2.ad() % 5 == 1 && !eJ2.j()) {
            f_ f_2 = f_.a(false);
            for (int k = 0; k < 40; ++k) {
                eJ2.bp().a(f_2);
            }
        }
    }
}

