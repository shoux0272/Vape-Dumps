/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.Da;
import manthe.dU;
import manthe.dl;
import manthe.ke;
import manthe.qE;
import manthe.si;

public class q0
extends qE {
    public q0(si si2) {
        super(si2);
    }

    @Override
    public void a(Object object) {
        dl dl2 = new dl(object);
        ke ke2 = dl2.g().equals(dU.g()) ? new ke(Da.b, dl2.h()) : new ke(Da.a, dl2.h());
        ke2.fire();
    }
}

