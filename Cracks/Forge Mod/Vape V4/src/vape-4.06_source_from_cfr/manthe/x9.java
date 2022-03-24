/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.on;
import manthe.pr;
import manthe.wm;
import manthe.x4;
import manthe.zu;

public class x9
extends x4 {
    public x9(String string) {
        super(string);
        this.e(false);
        this.G = x9.b.j;
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
        on.p.b().b(new pr(string, string2));
        zu.b(wm.class).ak();
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

