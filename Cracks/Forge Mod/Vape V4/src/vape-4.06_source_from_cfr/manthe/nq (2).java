/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.o7;
import manthe.on;
import manthe.pc;
import manthe.wz;
import manthe.y5;
import manthe.zu;

class nq
implements pc {
    final y5 a;
    final wz b;

    nq(wz wz2, y5 y52) {
        this.b = wz2;
        this.a = y52;
    }

    @Override
    public void b() {
        if (zu.E) {
            if (!wz.f(this.b) && wz.a(this.b).a(o7.b())) {
                this.a.l().Y().g(!this.a.l().Y().G());
                if (this.a.N() && !this.a.x()) {
                    this.a.d(false);
                }
                if (wz.d(this.b)) {
                    wz.a(this.b, false);
                }
                zu.an();
            }
            return;
        }
        if (this.a.p()) {
            if (!this.a.f()) {
                this.b.b("must be bound");
                wz.b(this.b).f(true);
                return;
            }
            this.b.b("use via bind");
            wz.b(this.b).f(true);
            return;
        }
        if (this.a.n() && !on.C) {
            wz.c(this.b).a(true);
            this.b.b("                                                          ");
            this.b.b(1);
            return;
        }
        this.a.a(!this.a.N(), true);
    }

    @Override
    public void a() {
        wz.e(this.b).J();
    }
}

