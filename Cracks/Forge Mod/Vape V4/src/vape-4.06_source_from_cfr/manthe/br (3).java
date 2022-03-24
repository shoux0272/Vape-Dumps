/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.C4;
import manthe.Ds;
import manthe.v6;
import manthe.z8;

class br
implements C4 {
    final z8 a;

    br(z8 z82) {
        this.a = z82;
    }

    @Override
    public void a(Ds ds2) {
        for (v6 v62 : z8.a(this.a)) {
            v62.a();
        }
        z8.a(this.a).clear();
    }
}

