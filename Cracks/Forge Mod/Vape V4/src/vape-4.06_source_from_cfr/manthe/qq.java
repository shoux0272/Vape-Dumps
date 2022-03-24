/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.on;
import manthe.pr;
import manthe.r5;
import manthe.vK;

class qq
implements vK {
    final r5 a;

    qq(r5 r52) {
        this.a = r52;
    }

    @Override
    public void a(int n6, int n10, int n11) {
        String string = r5.a(this.a).C().E();
        if (string.isEmpty()) {
            return;
        }
        String[] arrstring = string.split(" ");
        if (string.contains(":")) {
            arrstring = string.split(":");
        }
        string = arrstring[0];
        String string2 = arrstring.length > 1 ? arrstring[1] : arrstring[0];
        r5.a(this.a).C().a("");
        pr pr2 = on.p.b().c(string);
        if (pr2 != null) {
            on.p.b().a(pr2);
        }
        pr2 = new pr(string, string2);
        on.p.b().b(pr2);
    }
}

