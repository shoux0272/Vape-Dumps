/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import a.a;
import manthe.CQ;
import manthe.cy;
import manthe.gt;
import manthe.ng;
import manthe.on;
import manthe.pb;
import manthe.t;

class mL
extends Thread {
    final boolean a;
    final on b;

    mL(on on2, boolean bl) {
        this.b = on2;
        this.a = bl;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000L);
            if (on.C) {
                this.b.k();
            }
            CQ.a();
            pb.c.clear();
            pb.c = null;
            t.b_.clear();
            on.a(this.b).b();
            if (!on.c(this.b)) {
                this.b.j.g();
                this.b.j.d();
                this.b.j.b();
                this.b.j.b(gt.class.getClassLoader());
                this.b.j.f();
                this.b.j.a(gt.class.getClassLoader());
                this.b.j.c();
                this.b.j.e();
            } else {
                on.d(this.b).b();
            }
            Thread.sleep(1000L);
            on.b(this.b).c();
            ng.b();
            cy.a = null;
            on.p = null;
            a.a.exit(this.a);
        }
        catch (Exception exception) {
            // empty catch block
        }
    }
}

