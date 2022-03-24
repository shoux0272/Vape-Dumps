/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.awt.Color;
import manthe.R;
import manthe.p1;
import manthe.rU;
import manthe.rf;

class yk
implements R {
    final rf b;
    final rU a;

    yk(rU rU2, rf rf2) {
        this.a = rU2;
        this.b = rf2;
    }

    public void a(p1 p12) {
        if (rU.a(this.a).H() == rU.a(this.a).Z()) {
            this.b.b(p1.a);
            return;
        }
        if (rU.a(this.a).H() > rU.a(this.a).Z()) {
            this.b.b(new Color(100, 0, 0, 125));
        } else {
            this.b.b(new Color(0, 100, 0, 125));
        }
    }
}

