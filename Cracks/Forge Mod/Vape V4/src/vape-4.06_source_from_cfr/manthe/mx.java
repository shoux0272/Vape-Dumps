/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.R;
import manthe.p1;
import manthe.rg;
import manthe.rx;

class mx
implements R {
    final rg a;
    final rx b;

    mx(rx rx2, rg rg2) {
        this.b = rx2;
        this.a = rg2;
    }

    public void a(p1 p12) {
        if (rx.e(this.b)) {
            this.a.z().a("Update");
        } else {
            this.a.z().a("Add");
        }
    }
}

