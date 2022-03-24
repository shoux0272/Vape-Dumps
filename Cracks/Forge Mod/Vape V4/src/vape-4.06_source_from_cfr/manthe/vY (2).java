/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.awt.Color;
import manthe.R;
import manthe.p1;
import manthe.s7;
import manthe.y5;

class vY
implements R {
    final y5 b;
    final s7 a;

    vY(s7 s72, y5 y52) {
        this.a = s72;
        this.b = y52;
    }

    public void a(p1 p12) {
        if (this.b.L()) {
            this.a.H.d(Color.WHITE);
        } else {
            this.a.H.d(Color.GRAY);
        }
    }
}

