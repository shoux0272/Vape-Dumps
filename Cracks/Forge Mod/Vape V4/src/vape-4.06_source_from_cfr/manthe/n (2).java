/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.re;
import manthe.sV;
import manthe.sb;
import manthe.vK;
import manthe.zP;

class n
implements vK {
    final sb c;
    final zP d;
    final sV a;
    final re b;

    n(re re2, sb sb2, zP zP2, sV sV2) {
        this.b = re2;
        this.c = sb2;
        this.d = zP2;
        this.a = sV2;
    }

    @Override
    public void a(int n6, int n10, int n11) {
        String string = this.c.C().E();
        if (this.d.X().c(string) || this.d.U().c(string)) {
            re.a(this.b).d();
            re.b(this.b).a("This item already exists.");
            return;
        }
        this.c.C().a("");
        this.d.X().b(string, this.a.B().intValue());
    }
}

