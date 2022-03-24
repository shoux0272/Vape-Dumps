/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.DU;
import manthe.s7;
import manthe.yG;

class D {
    private final s7 c;
    private final yG d;
    private final DU a;
    private final double b;

    D(s7 s72) {
        this.c = s72;
        this.d = s72.s();
        this.a = s72.K();
        this.b = s72.H();
    }

    public s7 c() {
        return this.c;
    }

    yG b() {
        return this.d;
    }

    DU a() {
        return this.a;
    }

    static double a(D d10) {
        return d10.b;
    }
}

