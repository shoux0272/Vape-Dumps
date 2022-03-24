/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.CQ;
import manthe.ds;
import manthe.ki;
import manthe.on;
import manthe.r1;
import manthe.rO;
import manthe.y5;

public class z_
extends y5 {
    public z_() {
        super("CPSMod", 0, 0, CQ.b, null);
    }

    @Override
    public void k() {
    }

    public rO S() {
        for (r1 r12 : on.p.F().d()) {
            if (!(r12 instanceof rO)) continue;
            return (rO)r12;
        }
        return null;
    }

    @Override
    public void a(ki ki2) {
        rO rO2 = this.S();
        if (rO2 == null) {
            return;
        }
        int n6 = ds.s().m().i();
        if (ki2.getButtonState() && ki2.getButton() == n6 + 100) {
            rO2.a(System.currentTimeMillis());
        }
    }
}

