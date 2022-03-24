/*
 * Decompiled with CFR 0.150.
 */
import java.util.ArrayList;
import java.util.List;

public class iReSqtkUVgMECiReSqtkUVg
extends iReSqtkUVgbBTiReSqtkUVg {
    public iReSqtkUVgMECiReSqtkUVg(Object object) {
        super(object);
    }

    public List<iReSqtkUVgIHfiReSqtkUVg> d() {
        List list = iReSqtkUVgMECiReSqtkUVg.a.c().G.a(this.b);
        ArrayList<iReSqtkUVgIHfiReSqtkUVg> arrayList = new ArrayList<iReSqtkUVgIHfiReSqtkUVg>();
        for (Object e : list) {
            arrayList.add(new iReSqtkUVgIHfiReSqtkUVg(e));
        }
        return arrayList;
    }

    public int e() {
        return iReSqtkUVgMECiReSqtkUVg.a.c().G.b(this.b);
    }

    public iReSqtkUVgIHfiReSqtkUVg a(int n) {
        return new iReSqtkUVgIHfiReSqtkUVg(iReSqtkUVgFSZiReSqtkUVg.a(iReSqtkUVgMECiReSqtkUVg.a.c().G, this.b, n));
    }
}

