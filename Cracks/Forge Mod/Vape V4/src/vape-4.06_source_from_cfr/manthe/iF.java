/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.A5;
import manthe.BG;
import manthe.V;
import manthe.cy;
import manthe.gJ;

public class iF
extends gJ {
    private final BG d = V.c() == 13 ? this.a("CLOTH", cy.c, A5.h) : this.a("LEATHER", cy.c, A5.h);
    private final BG f = this.a("CHAIN", cy.c, A5.h);
    private final BG a = this.a("IRON", cy.c, A5.h);
    private final BG g = this.a("GOLD", cy.c, A5.h);
    private final BG e = this.a("DIAMOND", cy.c, A5.h);

    public iF() {
        super(A5.h);
    }

    private Object e() {
        return this.d.f(null);
    }

    private Object f() {
        return this.f.f(null);
    }

    private Object h() {
        return this.a.f(null);
    }

    private Object g() {
        return this.g.f(null);
    }

    private Object d() {
        return this.e.f(null);
    }

    static Object c(iF iF2) {
        return iF2.e();
    }

    static Object a(iF iF2) {
        return iF2.f();
    }

    static Object e(iF iF2) {
        return iF2.h();
    }

    static Object b(iF iF2) {
        return iF2.g();
    }

    static Object d(iF iF2) {
        return iF2.d();
    }
}

