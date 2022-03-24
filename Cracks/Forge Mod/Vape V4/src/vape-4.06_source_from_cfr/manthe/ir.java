/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.A5;
import manthe.BG;
import manthe.V;
import manthe.gJ;

public class ir
extends gJ {
    private final BG e;
    private final BG a;
    private final BG d;

    public ir() {
        super(A5.cL);
        if (V.c() >= 23) {
            this.e = this.a("LADDER", true, A5.F);
            this.a = this.a("STONE", true, A5.F);
            this.d = this.a("AIR", true, A5.F);
        } else {
            this.e = this.a("ladder", true, A5.F);
            this.a = this.a("stone", true, A5.F);
            this.d = this.a("air", true, A5.F);
        }
    }

    private Object f() {
        return this.e.f(null);
    }

    private Object e() {
        return this.a.f(null);
    }

    private Object d() {
        return this.d.f(null);
    }

    static Object a(ir ir2) {
        return ir2.e();
    }

    static Object b(ir ir2) {
        return ir2.d();
    }

    static Object c(ir ir2) {
        return ir2.f();
    }
}

