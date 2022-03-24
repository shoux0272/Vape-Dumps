/*
 * Decompiled with CFR 0.150.
 */
import java.util.ArrayList;
import java.util.List;

public class iReSqtkUVgSijiReSqtkUVg
extends iReSqtkUVgbBTiReSqtkUVg {
    public iReSqtkUVgSijiReSqtkUVg(Object object) {
        super(object);
    }

    public static boolean a(iReSqtkUVgyetiReSqtkUVg iReSqtkUVgyetiReSqtkUVg2) {
        if (iReSqtkUVgauSiReSqtkUVg.d() >= 23) {
            return iReSqtkUVgyetiReSqtkUVg2.e().c() && iReSqtkUVgyetiReSqtkUVg2.e().a(iReSqtkUVgSzRiReSqtkUVg.cS);
        }
        return (iReSqtkUVgyetiReSqtkUVg2.g() & 0x4000) != 0;
    }

    public List b(iReSqtkUVgyetiReSqtkUVg iReSqtkUVgyetiReSqtkUVg2) {
        return iReSqtkUVgSKOiReSqtkUVg.a(iReSqtkUVgSijiReSqtkUVg.a.c().E, this.b, iReSqtkUVgyetiReSqtkUVg2.a());
    }

    public List<iReSqtkUVgQoLiReSqtkUVg> c(iReSqtkUVgyetiReSqtkUVg iReSqtkUVgyetiReSqtkUVg2) {
        ArrayList<iReSqtkUVgQoLiReSqtkUVg> arrayList = new ArrayList<iReSqtkUVgQoLiReSqtkUVg>();
        List list = iReSqtkUVgSKOiReSqtkUVg.a(iReSqtkUVgSijiReSqtkUVg.a.c().E, this.b, iReSqtkUVgyetiReSqtkUVg2.a());
        for (Object e : list) {
            arrayList.add(new iReSqtkUVgQoLiReSqtkUVg(e));
        }
        return arrayList;
    }

    public List<iReSqtkUVgQoLiReSqtkUVg> a(int n) {
        ArrayList<iReSqtkUVgQoLiReSqtkUVg> arrayList = new ArrayList<iReSqtkUVgQoLiReSqtkUVg>();
        List list = iReSqtkUVgSKOiReSqtkUVg.a(iReSqtkUVgSijiReSqtkUVg.a.c().E, this.b, n);
        for (Object e : list) {
            arrayList.add(new iReSqtkUVgQoLiReSqtkUVg(e));
        }
        return arrayList;
    }

    public String d(iReSqtkUVgyetiReSqtkUVg iReSqtkUVgyetiReSqtkUVg2) {
        return iReSqtkUVgSKOiReSqtkUVg.b(iReSqtkUVgSijiReSqtkUVg.a.c().E, this.b, iReSqtkUVgyetiReSqtkUVg2.a());
    }
}

