/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.on;
import manthe.p1;
import manthe.r1;
import manthe.rH;
import manthe.tJ;

class pX
implements tJ {
    final rH a;

    pX(rH rH2) {
        this.a = rH2;
    }

    public void a(p1 p12, int n6, int n10, int n11) {
        if (n11 == 0) {
            boolean bl = false;
            for (r1 r12 : on.p.F().d()) {
                if (!r12.x()) continue;
                bl = true;
            }
            if (!bl) {
                this.a.d(true);
                on.p.F().d().remove(this.a);
                on.p.F().d().add(0, this.a);
            }
        }
    }
}

