/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.A5;
import manthe.Da;
import manthe.V;
import manthe.dU;
import manthe.ds;
import manthe.dw;
import manthe.kt;
import manthe.si;

public class sJ
extends si {
    public sJ() {
        super(A5.cV, V.c() == 13 ? 3 : 0);
    }

    @Override
    public void a(Object object) {
        dw dw2 = new dw(object);
        if (!dw2.h().equals(ds.k())) {
            return;
        }
        kt kt2 = dw2.g().equals(dU.g()) ? new kt(dw2.h(), Da.b) : new kt(dw2.h(), Da.a);
        kt2.fire();
    }
}

