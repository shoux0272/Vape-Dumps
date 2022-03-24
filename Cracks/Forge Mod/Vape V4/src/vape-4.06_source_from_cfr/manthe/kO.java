/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.A5;
import manthe.cB;
import manthe.dX;
import manthe.kl;
import manthe.on;
import manthe.y5;
import manthe.zu;

public class kO
extends kl {
    private dX d;

    public kO(Object object) {
        this.d = new dX(object);
    }

    public dX getGuiScreen() {
        return this.d;
    }

    public void setGuiScreen(dX dX2) {
        this.d = dX2;
    }

    public Object getGuiScreenObject() {
        return this.d.a();
    }

    @Override
    public boolean fire() {
        for (y5 object : on.p.H().e()) {
            if (!object.N()) continue;
            object.a(this);
        }
        if (cB.C && on.p.t().a.u().booleanValue()) {
            boolean bl = false;
            if (this.d.a(A5.O) || this.d.a(A5.cn) || this.d.a(A5.B)) {
                for (y5 y52 : on.p.H().e()) {
                    if (!y52.N() || y52.getClass().equals(zu.class)) continue;
                    y52.d(false);
                    bl = true;
                }
            }
            if (bl) {
                on.p.r().a("Sanity Check", "All modules have been disabled!", 5000L);
            }
        }
        return super.fire();
    }
}

