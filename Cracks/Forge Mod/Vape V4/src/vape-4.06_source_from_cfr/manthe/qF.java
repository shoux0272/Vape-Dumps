/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.dG;
import manthe.on;
import manthe.qE;
import manthe.si;
import manthe.y5;
import manthe.zu;

public class qF
extends qE {
    private final zu c = on.p.H().b(zu.class);

    public qF(si si2) {
        super(si2);
    }

    @Override
    public void a(Object object) {
        dG dG2 = new dG(object);
        if (dG2.f()) {
            return;
        }
        if (dG2.g()) {
            this.c.W();
            for (y5 y52 : on.p.H().f()) {
                y52.t();
            }
            on.p.r().c();
        }
    }
}

