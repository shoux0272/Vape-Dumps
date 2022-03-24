/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.CQ;
import manthe.kJ;
import manthe.on;
import manthe.r1;
import manthe.rr;
import manthe.y5;

public class zc
extends y5 {
    public zc() {
        super("TargetInfo", 0, 0, CQ.b, null);
    }

    @Override
    public void k() {
        this.z();
    }

    public rr S() {
        for (r1 r12 : on.p.F().d()) {
            if (!(r12 instanceof rr)) continue;
            return (rr)r12;
        }
        return null;
    }

    @Override
    public void a(kJ kJ2) {
        rr rr2 = this.S();
        if (rr2 == null) {
            return;
        }
        rr2.a(kJ2);
    }
}

