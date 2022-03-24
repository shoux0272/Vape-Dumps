/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import manthe.BI;
import manthe.DX;
import manthe.rg;

public class pb
implements BI {
    public static HashMap<DX, List<pb>> c = new HashMap();
    private final String d;
    private final rg b;
    private DX f;
    private boolean a;
    private static String e;

    public pb(String string, double d10) {
        this.d = string;
        this.b = new rg(string, false);
        this.b.z().e(d10);
    }

    public pb(String string) {
        this(string, 1.0);
    }

    public static pb a(DX dX2, String string) {
        List<pb> list = c.get(dX2);
        for (pb pb2 : list) {
            if (!pb2.d().equalsIgnoreCase(string)) continue;
            return pb2;
        }
        return null;
    }

    @Override
    public String H() {
        return this.d;
    }

    public String d() {
        return this.d.replace("\u00a7", "");
    }

    public DX e() {
        return this.f;
    }

    public void a(DX dX2) {
        this.f = dX2;
        if (!c.containsKey(dX2)) {
            c.put(dX2, new ArrayList());
        }
        c.get(dX2).add(this);
    }

    public String toString() {
        return this.d.replace("\u00a7", "");
    }

    public boolean c() {
        return this.a;
    }

    public void a(boolean bl) {
        this.a = bl;
    }

    public rg a() {
        return this.b;
    }

    static {
        pb.b("nCG2Bc");
    }

    public static void b(String string) {
        e = string;
    }

    public static String b() {
        return e;
    }
}

