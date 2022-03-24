/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.ab;
import manthe.on;
import manthe.wX;
import manthe.x4;
import manthe.zu;

public class xz
extends x4 {
    public xz(String string) {
        super(string);
        this.e(false);
        this.G = xz.b.i;
    }

    @Override
    public void Q() {
        if (!this.L()) {
            this.c("");
            return;
        }
        String[] arrstring = this.N().split(" ");
        String string = arrstring[0];
        String string2 = arrstring.length > 1 ? arrstring[1] : arrstring[0];
        on.p.N().b(new ab(string, string2));
        zu.b(wX.class).ak();
        this.c("");
    }

    @Override
    public double l() {
        return this.e() - 35.0;
    }

    @Override
    public double g() {
        return 110.0;
    }

    @Override
    public double h() {
        return 20.0;
    }
}

