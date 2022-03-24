/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.R;
import manthe.U;
import manthe.fG;
import manthe.fk;
import manthe.on;
import manthe.p1;
import manthe.rl;

class pG
implements R {
    final rl b;
    final U a;

    pG(U u6, rl rl2) {
        this.a = u6;
        this.b = rl2;
    }

    public void a(p1 p12) {
        U.c(this.a).e(true);
        this.b.d(U.c(this.a));
        fk fk2 = this.a.g();
        if (fk2.e()) {
            this.b.a("Empty");
            return;
        }
        fG fG2 = fG.a(fk2);
        fG2.a(U.d(this.a));
        String string = fG2.j();
        double d10 = on.p.a(0.75).b(string);
        if (d10 > 65.0 && string.contains(" ")) {
            StringBuilder stringBuilder = new StringBuilder(string);
            int n6 = string.lastIndexOf(" ");
            stringBuilder.setCharAt(n6, '\n');
            string = stringBuilder.toString();
        }
        U.c(this.a).a(fG2);
        this.b.a(string);
    }
}

