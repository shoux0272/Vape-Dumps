/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.awt.Color;
import manthe.R;
import manthe.my;
import manthe.p1;
import manthe.r1;
import manthe.s3;
import manthe.yI;
import manthe.zu;

class af
implements R {
    final zu c;
    final r1 b;
    final s3 a;

    af(s3 s32, zu zu2, r1 r12) {
        this.a = s32;
        this.c = zu2;
        this.b = r12;
    }

    public void a(p1 p12) {
        if (this.c.Z()) {
            this.a.W().z().b(my.c);
            this.a.a(true);
        } else {
            this.a.W().z().b(my.i);
            this.a.a(this.a.Y().G());
            if (!this.a.e()) {
                this.b.a(false);
            }
        }
        if (!this.a.W().G()) {
            this.a.W().z().b(Color.WHITE);
        } else {
            this.a.W().z().b(yI.a(this.a.W().f(), 45, 240));
        }
    }
}

