/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.fO;
import manthe.fS;
import manthe.fn;
import manthe.yi;

class Ck {
    private fn a;
    private boolean c;
    private fO b;

    private Ck(fn fn2, boolean bl, fO fO2) {
        this.a = fn2;
        this.c = bl;
        this.b = fO2;
    }

    public fn b() {
        return this.a;
    }

    public boolean a() {
        return this.c;
    }

    public void a(fS fS2) {
        if (this.a()) {
            fS2.a(this.a);
        } else {
            this.a.a(this.b.k());
        }
    }

    Ck(fn fn2, boolean bl, fO fO2, yi yi2) {
        this(fn2, bl, fO2);
    }
}

