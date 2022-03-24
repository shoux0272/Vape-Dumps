/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.Ak;
import manthe.on;
import manthe.x4;

public class xl
extends x4 {
    public xl(String string) {
        super(string);
        this.e(false);
    }

    @Override
    public double g() {
        return 0.0;
    }

    @Override
    public double h() {
        return 0.0;
    }

    @Override
    public void Q() {
        if (!this.L()) {
            this.c("");
            return;
        }
        Ak ak = on.p.l().a(this.N());
        if (ak != null) {
            return;
        }
        ak = new Ak(this.N(), "4.06");
        ak.B();
        on.p.l().b(ak);
        this.c("");
    }

    @Override
    public double n() {
        return this.e() + 2.5;
    }
}

