/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.U;
import manthe.pc;
import manthe.wE;
import manthe.x0;

class Dx
implements pc {
    final wE c;
    final int b;
    final x0 a;

    Dx(x0 x02, wE wE2, int n6) {
        this.a = x02;
        this.c = wE2;
        this.b = n6;
    }

    @Override
    public void b() {
        this.c.a(this.b);
    }

    @Override
    public void a() {
        this.c.m().n().set(this.b, new U(0));
    }
}

