/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.ab;
import manthe.on;
import manthe.rq;
import manthe.vK;

class qT
implements vK {
    final rq a;

    qT(rq rq2) {
        this.a = rq2;
    }

    @Override
    public void a(int n6, int n10, int n11) {
        String string = rq.b(this.a).C().E();
        if (string.isEmpty()) {
            return;
        }
        String[] arrstring = string.split(" ");
        if (string.contains(":")) {
            arrstring = string.split(":");
        }
        string = arrstring[0];
        String string2 = arrstring.length > 1 ? arrstring[1] : arrstring[0];
        rq.b(this.a).C().a("");
        ab ab2 = on.p.N().a(string);
        if (ab2 != null) {
            on.p.N().a(ab2);
        }
        ab2 = new ab(string, string2);
        on.p.N().b(ab2);
    }
}

