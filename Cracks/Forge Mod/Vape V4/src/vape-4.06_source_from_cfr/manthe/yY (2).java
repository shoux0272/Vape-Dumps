/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.A5;
import manthe.CQ;
import manthe.DB;
import manthe.ds;
import manthe.eJ;
import manthe.f5;
import manthe.fk;
import manthe.kJ;
import manthe.y5;

public class yY
extends y5 {
    private final DB v = DB.a((Object)this, "Players only", true, "Only swap when attacking players.");
    private final DB u = DB.a((Object)this, "Hand only", false, "Only swap when holding nothing.");

    public yY() {
        super("AutoSword", 6485058, CQ.f, "Automatically equips your sword when attacking entities.");
        this.a(this.v, this.u);
    }

    @Override
    public boolean n() {
        return true;
    }

    @Override
    public void a(kJ kJ2) {
        if ((!this.v.u().booleanValue() || kJ2.getTarget().a(A5.L)) && !kJ2.c() && ds.x().e()) {
            eJ eJ2 = ds.k();
            if (!this.u.u().booleanValue() || eJ2.a_().e() || eJ2.a_().k().e()) {
                for (int k = 36; k < 45; ++k) {
                    fk fk2;
                    if (!eJ2.aY().a(k).h() || !(fk2 = eJ2.aY().a(k).f().k()).a(A5.bO) || eJ2.aU().i() == k - 36) continue;
                    eJ2.aU().a(k - 36);
                    eJ2.bp().a(f5.a(k - 36));
                    ds.K().h();
                    break;
                }
            }
        }
    }
}

