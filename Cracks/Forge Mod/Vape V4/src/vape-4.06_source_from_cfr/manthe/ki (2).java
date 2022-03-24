/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.Ak;
import manthe.kl;
import manthe.on;
import manthe.pf;
import manthe.y5;
import manthe.ya;
import manthe.z5;

public class ki
extends kl {
    private final int e;
    private final boolean d;

    public ki(int n6, boolean bl) {
        this.e = n6;
        this.d = bl;
    }

    @Override
    public boolean fire() {
        int n6 = -100 + this.getButton();
        if (!this.getButtonState()) {
            return this.d();
        }
        if (!on.p.h()) {
            pf.a();
        }
        if (on.p.t().y.u().booleanValue() && this.getButton() == 2) {
            on.p.N().f();
        }
        for (Ak yt2 : on.p.l().d()) {
            if (!yt2.a(n6)) continue;
            return this.d();
        }
        for (y5 y52 : on.p.H().e()) {
            if (!y52.c().isEmpty()) {
                y52.a(n6);
            }
            if (!y52.N()) continue;
            y52.a(this);
        }
        if (this.getButtonState()) {
            ya ya2 = on.p.f().b(n6);
            if (ya2 == null) {
                return this.d();
            }
            on.p.H().b(z5.class).a(ya2);
        }
        return this.d();
    }

    public boolean getButtonState() {
        return this.d;
    }

    public int getButton() {
        return this.e;
    }
}

