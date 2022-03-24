/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.Da;
import manthe.kl;
import manthe.on;
import manthe.xR;
import manthe.y5;
import manthe.zu;

public class ke
extends kl {
    private final float d;

    public ke(int n6, float f10) {
        this.a = n6;
        this.d = f10;
    }

    @Override
    public boolean fire() {
        for (y5 y52 : on.p.H().e()) {
            if (y52 instanceof zu && this.a() == Da.b) {
                ((zu)y52).c(this);
            }
            if (!y52.N()) continue;
            if (this.a() == Da.b) {
                y52.b(this);
                continue;
            }
            y52.a(this);
        }
        if (this.a() == Da.b && xR.A != null) {
            xR.A.m();
        }
        return this.d();
    }

    public float getTicks() {
        return this.d;
    }
}

