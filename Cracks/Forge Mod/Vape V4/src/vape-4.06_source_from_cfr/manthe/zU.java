/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.CQ;
import manthe.ab;
import manthe.gV;
import manthe.kK;
import manthe.kN;
import manthe.on;
import manthe.y5;

public class zU
extends y5 {
    public zU() {
        super("Friends", 0, 0, CQ.b, null);
    }

    @Override
    public void k() {
        this.z();
    }

    @Override
    public void a(kN kN2) {
        if (!on.p.N().b.u().booleanValue()) {
            return;
        }
        ab ab2 = on.p.N().a(kN2.getUserName(), false);
        if (on.p.N().b.u().booleanValue()) {
            if (ab2 != null && ab2.c()) {
                kN2.setDisplayName(ab2.e());
            }
        } else {
            kN2.setDisplayName(kN2.getDisplayName());
        }
    }

    @Override
    public void a(kK kK2) {
        if (!on.p.N().b.u().booleanValue()) {
            return;
        }
        for (ab ab2 : on.p.N().e()) {
            if (!ab2.c() || !kK2.getMessage().g().toLowerCase().contains(ab2.a().toLowerCase())) continue;
            String string = kK2.getMessage().f();
            int n6 = string.toLowerCase().indexOf(ab2.a().toLowerCase());
            while (n6 >= 0) {
                String string2 = string.substring(n6, n6 + ab2.a().toLowerCase().length());
                string = string.replaceAll(string2, ab2.b());
                n6 = string.toLowerCase().indexOf(ab2.a());
            }
            kK2.setMessage(gV.b(string));
        }
    }
}

