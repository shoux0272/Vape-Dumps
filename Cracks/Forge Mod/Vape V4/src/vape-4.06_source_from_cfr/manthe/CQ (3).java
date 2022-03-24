/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.util.ArrayList;
import java.util.List;
import manthe.BI;

public class CQ
implements BI {
    public static CQ b = new CQ("None", -2914273);
    public static CQ c = new CQ("Combat", "Combat advantage modules", -2745594);
    public static CQ a = new CQ("Utility", -14970556);
    public static CQ d = new CQ("Render", "All kinds of visual goodies", -7926107);
    public static CQ f = new CQ("Blatant", "Modules which are typically used for blatant cheaters", -2419323);
    public static CQ e = new CQ("World", -12170992);
    public static CQ h = new CQ("Minigames", -666558);
    public static CQ g = new CQ("Favorite", 0);
    private static List<CQ> i = new ArrayList<CQ>();
    private final String l;
    private final String k;
    private final int j;

    private CQ(String string, String string2, int n6) {
        this.l = string;
        this.k = string2;
        this.j = n6;
    }

    private CQ(String string, int n6) {
        this(string, "", n6);
    }

    public static List<CQ> b() {
        return i;
    }

    public static void a() {
        i.clear();
        i = null;
        b = null;
        c = null;
        a = null;
        d = null;
        f = null;
        e = null;
        g = null;
    }

    @Override
    public String H() {
        return this.l;
    }

    public String toString() {
        return this.l;
    }

    public int c() {
        return this.j;
    }

    public String d() {
        return this.k;
    }

    static {
        i.add(g);
        i.add(c);
        i.add(f);
        i.add(d);
        i.add(a);
        i.add(e);
        i.add(h);
        i.add(b);
    }
}

