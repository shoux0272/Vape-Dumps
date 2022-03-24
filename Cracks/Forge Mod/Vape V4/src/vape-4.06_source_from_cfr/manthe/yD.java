/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.A5;
import manthe.CQ;
import manthe.DB;
import manthe.DF;
import manthe.ds;
import manthe.eJ;
import manthe.f_;
import manthe.fk;
import manthe.kt;
import manthe.y5;

public class yD
extends y5 {
    private final DB v = DB.a((Object)this, "Fast Bow", false, "Makes you shoot your bow faster.");
    private final DF u = DF.a(this, "Ticks", "#", "", 1.0, 14.0, 40.0, 1.0, "The amount of ticks you have to use an item to consume.");

    public yD() {
        super("FastConsume", -256, CQ.f, "Use/Consume items quicker.");
        this.a(this.u, this.v);
    }

    @Override
    public void b(kt kt2) {
        eJ eJ2 = ds.k();
        if ((double)eJ2.be() == this.u.a() && this.a(eJ2.a_().k())) {
            for (int k = 0; k < 30; ++k) {
                eJ2.bp().a(f_.a(true));
            }
            ds.K().a(eJ2);
        }
    }

    private boolean a(fk fk2) {
        return !fk2.a(A5.bO) && (this.v.u() != false || !fk2.a(A5.cZ));
    }
}

