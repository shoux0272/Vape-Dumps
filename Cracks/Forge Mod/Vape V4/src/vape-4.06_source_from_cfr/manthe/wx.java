/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.DU;
import manthe.pe;
import manthe.we;

public abstract class wx
extends we {
    @Override
    public void b(double d10) {
        super.b(d10 - 10.0);
    }

    @Override
    public void c(double d10) {
        super.c(d10 + 5.0);
    }

    @Override
    public void f(boolean bl) {
        pe.a(this.d() - 5.0, this.c(), this.e() + 10.0, bl ? this.K + 2.0 : this.f() + 2.0, this.I());
    }

    @Override
    public DU q() {
        if (this.H) {
            return new DU(this.d() - 5.0, this.c(), this.e() + 10.0, this.L());
        }
        return new DU(this.d() - 5.0, this.c(), this.e() + 10.0, this.f());
    }

    @Override
    public void Z() {
        this.F = new DU(this.F.a() + 5.0, this.F.b(), this.F.d(), this.F.c());
        super.Z();
    }
}

