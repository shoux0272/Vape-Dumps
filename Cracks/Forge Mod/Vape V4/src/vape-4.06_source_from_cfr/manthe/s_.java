/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.A5;
import manthe.Da;
import manthe.V;
import manthe.dU;
import manthe.dz;
import manthe.kf;
import manthe.si;

public class s_
extends si {
    public s_() {
        super(A5.b0, V.c() == 13 ? 3 : 0);
    }

    @Override
    public void a(Object object) {
        dz dz2 = new dz(object);
        kf kf2 = dz2.g().equals(dU.g()) ? new kf(Da.b) : new kf(Da.a);
        kf2.fire();
    }
}

