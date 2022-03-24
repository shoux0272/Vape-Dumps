/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.awt.Color;
import java.util.List;
import manthe.R;
import manthe.p1;
import manthe.rg;
import manthe.rm;

class qX
implements R {
    final rg b;
    final List a;
    final rm c;

    qX(rm rm2, rg rg2, List list) {
        this.c = rm2;
        this.b = rg2;
        this.a = list;
    }

    public void a(p1 p12) {
        this.b.z().j(!((rg)this.a.get(0)).e());
        this.b.e(this.b.z().i());
        if (!this.b.z().i()) {
            this.b.z().b(Color.WHITE);
        }
    }
}

