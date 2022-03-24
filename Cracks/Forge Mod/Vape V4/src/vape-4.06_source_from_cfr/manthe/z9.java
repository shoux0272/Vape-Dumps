/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.CQ;
import manthe.DB;
import manthe.ds;
import manthe.eJ;
import manthe.ks;
import manthe.y5;

public class z9
extends y5 {
    private final DB u = DB.a((Object)this, "Direction Check", true, "Checks if you're walking forwards and it'll allow you to walk off the edge");
    private boolean v;

    public z9() {
        super("SafeWalk", -9176515, CQ.f, "Helps you from falling off the edge.");
        this.r().add(this.u);
    }

    @Override
    public boolean n() {
        return true;
    }

    @Override
    public void a(ks ks2) {
        eJ eJ2 = ds.k();
        if (ks2.c()) {
            this.v = eJ2.bg().g();
            boolean bl = true;
            if (this.u.u().booleanValue() && !eJ2.af() && eJ2.aF() > 0.0f && eJ2.ay() == 0.0f) {
                bl = false;
            }
            if (bl) {
                eJ2.bg().e(true);
            }
        } else {
            eJ2.bg().e(this.v);
        }
    }
}

