/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.A5;
import manthe.fE;
import manthe.fG;
import manthe.fh;
import manthe.fk;

public class nH {
    public static boolean a(fG fG2) {
        return nH.a(fG2, false);
    }

    public static boolean a(fG fG2, boolean bl) {
        if (fG2.e() || fG2.k().e()) {
            return false;
        }
        if (bl && fG2.k().a(A5.bU)) {
            return true;
        }
        if (!fG2.k().a(A5.dx)) {
            return false;
        }
        fh fh2 = new fh(fG2.k().a());
        if (fh2.c(fG2) == null) {
            return false;
        }
        if (fh.d(fG2)) {
            for (fE fE2 : fh2.f(fG2)) {
                if (fE2.g() != 6) continue;
                return true;
            }
        }
        return false;
    }

    public static boolean a(fk fk2) {
        return fk2.a(A5.be) || fk2.a(A5.dt);
    }
}

