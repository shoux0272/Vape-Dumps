/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.R;
import manthe.p1;
import manthe.z3;

class cs
implements R {
    final z3 a;

    cs(z3 z32) {
        this.a = z32;
    }

    public void a(p1 p12) {
        if (this.a.am.a() < this.a.W.a()) {
            this.a.am.b(this.a.W.a() + 0.1);
        }
    }
}

