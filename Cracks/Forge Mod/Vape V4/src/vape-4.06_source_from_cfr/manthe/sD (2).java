/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.util.HashSet;
import manthe.A5;
import manthe.CZ;
import manthe.fG;
import manthe.fk;

public class sD {
    private final HashSet<CZ> a = new HashSet();

    public sD() {
        this.a(new CZ(new String[]{"sword", "swords"}, null), A5.bO);
        this.a(new CZ(new String[]{"shovel", "shovels", "spade", "spades"}, null), A5.ay);
        this.a(new CZ(new String[]{"axe", "axes"}, null), A5.cW);
        this.a(new CZ(new String[]{"pickaxe", "pickaxes"}, null), A5.dW);
        this.a(new CZ(new String[]{"block", "blocks"}, null), A5.av);
        this.a(new CZ(new String[]{"fists", "none", "fist", "hand"}, null), new Class[0]);
        this.a(new CZ(new String[]{"food", "foods"}, null), A5.c0);
    }

    private void a(CZ cZ, Class ... arrclass) {
        cZ.a(arrclass);
        this.a.add(cZ);
    }

    public boolean a(String string, fG fG2) {
        fk fk2 = null;
        if (fG2.d()) {
            fk2 = fG2.k();
        }
        for (CZ cZ : this.a) {
            for (String string2 : cZ.a()) {
                if (!string2.equalsIgnoreCase(string)) continue;
                if (cZ.b().length == 0) {
                    if (!fG2.e()) continue;
                    return true;
                }
                for (Class class_ : cZ.b()) {
                    if (fk2 == null || !fk2.a(class_)) continue;
                    return true;
                }
            }
        }
        return false;
    }
}

