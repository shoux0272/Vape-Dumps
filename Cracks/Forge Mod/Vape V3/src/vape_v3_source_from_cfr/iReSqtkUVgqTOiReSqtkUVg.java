/*
 * Decompiled with CFR 0.150.
 */
import java.util.ArrayList;
import java.util.List;

public class iReSqtkUVgqTOiReSqtkUVg
implements iReSqtkUVgqXEiReSqtkUVg {
    public static iReSqtkUVgqTOiReSqtkUVg a = new iReSqtkUVgqTOiReSqtkUVg("Other", -14385007);
    public static iReSqtkUVgqTOiReSqtkUVg b = new iReSqtkUVgqTOiReSqtkUVg("None", -2914273);
    public static iReSqtkUVgqTOiReSqtkUVg c = new iReSqtkUVgqTOiReSqtkUVg("Combat", -2745594);
    public static iReSqtkUVgqTOiReSqtkUVg d = new iReSqtkUVgqTOiReSqtkUVg("Utility", -14970556);
    public static iReSqtkUVgqTOiReSqtkUVg e = new iReSqtkUVgqTOiReSqtkUVg("Render", "All kinds of visual goodies", -7926107);
    public static iReSqtkUVgqTOiReSqtkUVg f = new iReSqtkUVgqTOiReSqtkUVg("Blatant", "Modules which are typically used for blatant cheaters", -2419323);
    public static iReSqtkUVgqTOiReSqtkUVg g = new iReSqtkUVgqTOiReSqtkUVg("World", -12170992);
    private static List<iReSqtkUVgqTOiReSqtkUVg> h = new ArrayList<iReSqtkUVgqTOiReSqtkUVg>();
    private String i;
    private String j;
    private int k;

    private iReSqtkUVgqTOiReSqtkUVg(String string, String string2, int n) {
        this.i = string;
        this.j = string2;
        this.k = n;
    }

    private iReSqtkUVgqTOiReSqtkUVg(String string, int n) {
        this(string, "", n);
    }

    public static List<iReSqtkUVgqTOiReSqtkUVg> a() {
        return h;
    }

    public static void b() {
        h.clear();
        h = null;
        a = null;
        b = null;
        c = null;
        d = null;
        e = null;
        f = null;
        g = null;
    }

    @Override
    public String N() {
        return this.i;
    }

    public String toString() {
        return this.i;
    }

    public int c() {
        return this.k;
    }

    public String d() {
        return this.j;
    }

    static {
        h.add(f);
        h.add(c);
        h.add(b);
        h.add(a);
        h.add(e);
        h.add(d);
        h.add(g);
    }
}

