/*
 * Decompiled with CFR 0.150.
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class iReSqtkUVgzAciReSqtkUVg
implements iReSqtkUVgqXEiReSqtkUVg {
    public static HashMap<iReSqtkUVgZyLiReSqtkUVg, List<iReSqtkUVgzAciReSqtkUVg>> a = new HashMap();
    private iReSqtkUVgZyLiReSqtkUVg b;
    private String c;

    public iReSqtkUVgzAciReSqtkUVg(String string) {
        this.c = string;
    }

    public static iReSqtkUVgzAciReSqtkUVg a(iReSqtkUVgZyLiReSqtkUVg iReSqtkUVgZyLiReSqtkUVg2, String string) {
        List<iReSqtkUVgzAciReSqtkUVg> list = a.get(iReSqtkUVgZyLiReSqtkUVg2);
        for (iReSqtkUVgzAciReSqtkUVg iReSqtkUVgzAciReSqtkUVg2 : list) {
            if (!iReSqtkUVgzAciReSqtkUVg2.N().equalsIgnoreCase(string)) continue;
            return iReSqtkUVgzAciReSqtkUVg2;
        }
        return null;
    }

    @Override
    public String N() {
        return this.c;
    }

    public iReSqtkUVgZyLiReSqtkUVg b() {
        return this.b;
    }

    public void a(iReSqtkUVgZyLiReSqtkUVg iReSqtkUVgZyLiReSqtkUVg2) {
        this.b = iReSqtkUVgZyLiReSqtkUVg2;
        if (!a.containsKey(iReSqtkUVgZyLiReSqtkUVg2)) {
            a.put(iReSqtkUVgZyLiReSqtkUVg2, new ArrayList());
        }
        a.get(iReSqtkUVgZyLiReSqtkUVg2).add(this);
    }

    public String toString() {
        return this.c;
    }
}

