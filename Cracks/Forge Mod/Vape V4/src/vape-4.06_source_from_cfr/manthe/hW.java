/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.A5;
import manthe.BG;
import manthe.gJ;

public class hW
extends gJ {
    private final BG a;
    private final BG d;

    public hW() {
        super(A5.dw);
        this.a = this.a("START", false, this.c);
        this.d = this.a("END", false, this.c);
    }

    private Object d() {
        return this.a.f(null);
    }

    private Object e() {
        return this.d.f(null);
    }

    static Object b(hW hW2) {
        return hW2.d();
    }

    static Object a(hW hW2) {
        return hW2.e();
    }
}

