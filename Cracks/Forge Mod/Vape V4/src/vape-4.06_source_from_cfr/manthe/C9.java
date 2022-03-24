/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.re;
import manthe.sb;
import manthe.vK;
import manthe.zP;

class C9
implements vK {
    final sb b;
    final zP a;
    final re c;

    C9(re re2, sb sb2, zP zP2) {
        this.c = re2;
        this.b = sb2;
        this.a = zP2;
    }

    @Override
    public void a(int n6, int n10, int n11) {
        String string = this.b.C().E();
        if (this.a.X().c(string) || this.a.U().c(string)) {
            re.a(this.c).d();
            re.b(this.c).a("This item already exists.");
            return;
        }
        this.b.C().a("");
        this.a.U().b(string, -1);
    }
}

