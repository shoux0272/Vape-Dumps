/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.util.List;
import manthe.R;
import manthe.p1;
import manthe.rg;
import manthe.rm;

class kw
implements R {
    final List a;
    final rg d;
    final rg c;
    final rm b;

    kw(rm rm2, List list, rg rg2, rg rg3) {
        this.b = rm2;
        this.a = list;
        this.d = rg2;
        this.c = rg3;
    }

    public void a(p1 p12) {
        rg rg2 = null;
        for (rg rg3 : this.a) {
            if (!rg3.z().i()) continue;
            rg2 = rg3;
            break;
        }
        if (rg2 == null) {
            return;
        }
        String string = rg2.z().E();
        int n6 = this.a.size();
        String string2 = (String)string + "/" + n6;
        this.d.b(string2);
        this.d.z().b(string2);
        this.c.b(string2);
        this.c.z().b(string2);
    }
}

