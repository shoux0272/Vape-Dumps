/*
 * Decompiled with CFR 0.150.
 */
import java.util.ArrayList;

public class iReSqtkUVgBKdiReSqtkUVg
extends iReSqtkUVgbBTiReSqtkUVg {
    public iReSqtkUVgBKdiReSqtkUVg(Object object) {
        super(object);
    }

    public static int a(int n, iReSqtkUVgyetiReSqtkUVg iReSqtkUVgyetiReSqtkUVg2) {
        if (iReSqtkUVgauSiReSqtkUVg.d() >= 23) {
            iReSqtkUVgnbDiReSqtkUVg iReSqtkUVgnbDiReSqtkUVg2 = iReSqtkUVgnbDiReSqtkUVg.b(n);
            return iReSqtkUVgGuhiReSqtkUVg.a(iReSqtkUVgBKdiReSqtkUVg.a.c().aX, iReSqtkUVgnbDiReSqtkUVg2.a(), iReSqtkUVgyetiReSqtkUVg2.a());
        }
        return iReSqtkUVgGuhiReSqtkUVg.a(iReSqtkUVgBKdiReSqtkUVg.a.c().aX, n, iReSqtkUVgyetiReSqtkUVg2.a());
    }

    public static float a(iReSqtkUVgyetiReSqtkUVg iReSqtkUVgyetiReSqtkUVg2, iReSqtkUVgDSGiReSqtkUVg iReSqtkUVgDSGiReSqtkUVg2) {
        return iReSqtkUVgBKdiReSqtkUVg.a.c().aX.a(iReSqtkUVgyetiReSqtkUVg2.a(), iReSqtkUVgDSGiReSqtkUVg2.a());
    }

    public static int a(iReSqtkUVgyetiReSqtkUVg[] arriReSqtkUVgyetiReSqtkUVg, iReSqtkUVgPpIiReSqtkUVg iReSqtkUVgPpIiReSqtkUVg2) {
        if (iReSqtkUVgauSiReSqtkUVg.d() >= 23) {
            ArrayList<Object> arrayList = new ArrayList<Object>();
            for (iReSqtkUVgyetiReSqtkUVg iReSqtkUVgyetiReSqtkUVg2 : arriReSqtkUVgyetiReSqtkUVg) {
                arrayList.add(iReSqtkUVgyetiReSqtkUVg2.a());
            }
            return iReSqtkUVgGuhiReSqtkUVg.a(iReSqtkUVgBKdiReSqtkUVg.a.c().aX, arrayList, iReSqtkUVgPpIiReSqtkUVg2.a());
        }
        Object[] arrobject = new Object[arriReSqtkUVgyetiReSqtkUVg.length];
        for (int i = 0; i < arriReSqtkUVgyetiReSqtkUVg.length; ++i) {
            arrobject[i] = arriReSqtkUVgyetiReSqtkUVg[i].a();
        }
        return iReSqtkUVgGuhiReSqtkUVg.a(iReSqtkUVgBKdiReSqtkUVg.a.c().aX, arrobject, iReSqtkUVgPpIiReSqtkUVg2.a());
    }
}

