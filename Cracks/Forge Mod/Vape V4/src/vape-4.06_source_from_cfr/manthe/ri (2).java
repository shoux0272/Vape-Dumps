/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.awt.Color;
import manthe.Bz;
import manthe.c5;
import manthe.k9;
import manthe.on;
import manthe.r1;
import manthe.rG;
import manthe.rg;
import manthe.zu;

public class ri
extends r1 {
    private final rg af;
    private boolean ae;

    public ri(String string, int n6, int n10) {
        super(string, false);
        this.n(true);
        if (k9.b(string)) {
            this.af = new rG(string, n6, n10, 0.8f);
        } else {
            this.af = new rg(string, true);
            this.af.c(n6);
            this.af.b(n10);
        }
        this.af.b(new Color(45, 45, 45));
        this.af.j(false);
        zu zu2 = on.p.H().b(zu.class);
        this.af.a(new c5(this, zu2));
    }

    public rg al() {
        return this.af;
    }

    @Override
    public void c(boolean bl) {
        super.c(bl);
        this.Z().a(false);
        this.a(this.af.t());
        this.d(this.af.k() + this.af.b() + 2.0);
        if (this.z()) {
            this.b(0.0);
        }
    }

    @Override
    public void b(int n6, int n10, int n11) {
        if (this.g() || this.af.g()) {
            return;
        }
        this.f(true);
        this.ae = false;
        Bz bz2 = on.p.H().b(zu.class).ak();
        bz2.a(null);
    }

    static boolean a(ri ri2, boolean bl) {
        ri2.ae = bl;
        return ri2.ae;
    }

    static boolean a(ri ri2) {
        return ri2.ae;
    }
}

