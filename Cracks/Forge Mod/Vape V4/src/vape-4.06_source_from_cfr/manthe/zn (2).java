/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.CQ;
import manthe.DB;
import manthe.ds;
import manthe.ei;
import manthe.fX;
import manthe.kn;
import manthe.on;
import manthe.y5;
import manthe.zG;

public class zn
extends y5 {
    private final DB u = DB.a((Object)this, "Cancel Invis", false, "Does not sprint when you are invisible.\nUseful to prevent sprint particles.");
    private zG v;

    public zn() {
        super("Sprint", -16711796, CQ.c, "Sets your sprinting to true.");
        this.a(this.u);
    }

    @Override
    public void a(kn kn2) {
        if (this.v == null) {
            this.v = on.p.H().b(zG.class);
        }
        if (!ds.x().e()) {
            return;
        }
        if (this.u.u().booleanValue() && ds.k().a(fX.a(14)) && !ds.k().a8().i()) {
            return;
        }
        ei.a(ds.s().o().i(), !this.v.V() && !ds.s().o().g() && !ds.k().C() && !ds.k().E());
    }

    @Override
    public void J() {
        ei.a(ds.s().o().i(), false);
    }
}

