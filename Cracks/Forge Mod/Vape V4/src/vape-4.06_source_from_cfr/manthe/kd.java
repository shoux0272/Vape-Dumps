/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.Da;
import manthe.ex;
import manthe.kl;
import manthe.on;
import manthe.y5;

public class kd
extends kl {
    private static float e;
    private final ex d;

    public kd(int n6, Object object) {
        this.d = new ex(object);
        this.a = n6;
        if (n6 == Da.b) {
            e = this.d.x();
        }
    }

    @Override
    public boolean fire() {
        for (y5 y52 : on.p.H().e()) {
            if (!y52.N()) continue;
            y52.a(this);
        }
        return this.d();
    }

    public double getStepHeight() {
        return this.d.x();
    }

    public void setStepHeight(double d10) {
        this.d.c((float)d10);
    }

    public double getRealHeight() {
        return e;
    }

    static float access$000() {
        return e;
    }
}

