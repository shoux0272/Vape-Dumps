/*
 * Decompiled with CFR 0.150.
 */
import java.util.HashSet;

public class iReSqtkUVgKUuiReSqtkUVg {
    private HashSet<iReSqtkUVgTPsiReSqtkUVg> a = new HashSet();

    public iReSqtkUVgKUuiReSqtkUVg() {
        this.a(new iReSqtkUVgTPsiReSqtkUVg(new String[]{"sword", "swords"}, null), iReSqtkUVgSzRiReSqtkUVg.J);
        this.a(new iReSqtkUVgTPsiReSqtkUVg(new String[]{"shovel", "shovels", "spade", "spades"}, null), iReSqtkUVgSzRiReSqtkUVg.bd);
        this.a(new iReSqtkUVgTPsiReSqtkUVg(new String[]{"axe", "axes"}, null), iReSqtkUVgSzRiReSqtkUVg.as);
        this.a(new iReSqtkUVgTPsiReSqtkUVg(new String[]{"pickaxe", "pickaxes"}, null), iReSqtkUVgSzRiReSqtkUVg.bc);
        this.a(new iReSqtkUVgTPsiReSqtkUVg(new String[]{"block", "blocks"}, null), iReSqtkUVgSzRiReSqtkUVg.ax);
        this.a(new iReSqtkUVgTPsiReSqtkUVg(new String[]{"fists", "none", "fist", "hand"}, null), new Class[0]);
        this.a(new iReSqtkUVgTPsiReSqtkUVg(new String[]{"food", "foods"}, null), iReSqtkUVgSzRiReSqtkUVg.I);
    }

    private void a(iReSqtkUVgTPsiReSqtkUVg iReSqtkUVgTPsiReSqtkUVg2, Class ... arrclass) {
        iReSqtkUVgTPsiReSqtkUVg2.a(arrclass);
        this.a.add(iReSqtkUVgTPsiReSqtkUVg2);
    }

    public boolean a(String string, iReSqtkUVgyetiReSqtkUVg iReSqtkUVgyetiReSqtkUVg2) {
        iReSqtkUVgLUhiReSqtkUVg iReSqtkUVgLUhiReSqtkUVg2 = null;
        if (iReSqtkUVgyetiReSqtkUVg2.c()) {
            iReSqtkUVgLUhiReSqtkUVg2 = iReSqtkUVgyetiReSqtkUVg2.e();
        }
        for (iReSqtkUVgTPsiReSqtkUVg iReSqtkUVgTPsiReSqtkUVg2 : this.a) {
            for (String string2 : iReSqtkUVgTPsiReSqtkUVg2.a()) {
                if (!string2.equalsIgnoreCase(string)) continue;
                if (iReSqtkUVgTPsiReSqtkUVg2.b().length == 0) {
                    if (!iReSqtkUVgyetiReSqtkUVg2.b()) continue;
                    return true;
                }
                for (Class class_ : iReSqtkUVgTPsiReSqtkUVg2.b()) {
                    if (iReSqtkUVgLUhiReSqtkUVg2 == null || !iReSqtkUVgLUhiReSqtkUVg2.a(class_)) continue;
                    return true;
                }
            }
        }
        return false;
    }
}

