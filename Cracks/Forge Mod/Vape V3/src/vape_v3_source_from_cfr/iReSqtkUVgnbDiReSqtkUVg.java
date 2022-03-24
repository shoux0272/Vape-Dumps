/*
 * Decompiled with CFR 0.150.
 */
import java.util.ArrayList;

public class iReSqtkUVgnbDiReSqtkUVg
extends iReSqtkUVgbBTiReSqtkUVg {
    public iReSqtkUVgnbDiReSqtkUVg(Object object) {
        super(object);
    }

    public static iReSqtkUVgnbDiReSqtkUVg d() {
        return iReSqtkUVgnbDiReSqtkUVg.b(0);
    }

    public static iReSqtkUVgnbDiReSqtkUVg e() {
        return iReSqtkUVgnbDiReSqtkUVg.b(34);
    }

    public static iReSqtkUVgnbDiReSqtkUVg f() {
        return iReSqtkUVgnbDiReSqtkUVg.b(16);
    }

    public static iReSqtkUVgnbDiReSqtkUVg g() {
        return iReSqtkUVgnbDiReSqtkUVg.b(20);
    }

    public static iReSqtkUVgnbDiReSqtkUVg h() {
        return iReSqtkUVgnbDiReSqtkUVg.b(32);
    }

    public static iReSqtkUVgnbDiReSqtkUVg i() {
        return iReSqtkUVgnbDiReSqtkUVg.b(2);
    }

    public static iReSqtkUVgnbDiReSqtkUVg j() {
        return iReSqtkUVgnbDiReSqtkUVg.b(48);
    }

    public static iReSqtkUVgnbDiReSqtkUVg k() {
        return iReSqtkUVgnbDiReSqtkUVg.b(50);
    }

    public static iReSqtkUVgnbDiReSqtkUVg l() {
        return iReSqtkUVgnbDiReSqtkUVg.b(49);
    }

    public static iReSqtkUVgnbDiReSqtkUVg m() {
        return iReSqtkUVgnbDiReSqtkUVg.b(35);
    }

    public static iReSqtkUVgnbDiReSqtkUVg n() {
        return iReSqtkUVgnbDiReSqtkUVg.b(51);
    }

    public static iReSqtkUVgnbDiReSqtkUVg o() {
        return iReSqtkUVgnbDiReSqtkUVg.b(7);
    }

    public static iReSqtkUVgnbDiReSqtkUVg p() {
        return iReSqtkUVgnbDiReSqtkUVg.b(19);
    }

    public String a(int n) {
        return iReSqtkUVgaKUiReSqtkUVg.a(iReSqtkUVgnbDiReSqtkUVg.a.c().aY, this.b, n);
    }

    public static iReSqtkUVgnbDiReSqtkUVg[] q() {
        if (iReSqtkUVgauSiReSqtkUVg.d() >= 23) {
            Iterable iterable = (Iterable)iReSqtkUVgaKUiReSqtkUVg.a(iReSqtkUVgnbDiReSqtkUVg.a.c().aY);
            ArrayList<iReSqtkUVgnbDiReSqtkUVg> arrayList = new ArrayList<iReSqtkUVgnbDiReSqtkUVg>();
            for (Object t : iterable) {
                iReSqtkUVgnbDiReSqtkUVg iReSqtkUVgnbDiReSqtkUVg2 = new iReSqtkUVgnbDiReSqtkUVg(t);
                arrayList.add(iReSqtkUVgnbDiReSqtkUVg2);
            }
            return arrayList.toArray(new iReSqtkUVgnbDiReSqtkUVg[arrayList.size()]);
        }
        Object[] arrobject = iReSqtkUVgaKUiReSqtkUVg.b(iReSqtkUVgnbDiReSqtkUVg.a.c().aY);
        iReSqtkUVgnbDiReSqtkUVg[] arriReSqtkUVgnbDiReSqtkUVg = new iReSqtkUVgnbDiReSqtkUVg[arrobject.length];
        for (int i = 0; i < arrobject.length; ++i) {
            arriReSqtkUVgnbDiReSqtkUVg[i] = new iReSqtkUVgnbDiReSqtkUVg(arrobject[i]);
        }
        return arriReSqtkUVgnbDiReSqtkUVg;
    }

    public static iReSqtkUVgnbDiReSqtkUVg b(int n) {
        if (iReSqtkUVgauSiReSqtkUVg.d() >= 23) {
            return new iReSqtkUVgnbDiReSqtkUVg(iReSqtkUVgaKUiReSqtkUVg.a(iReSqtkUVgnbDiReSqtkUVg.a.c().aY, n));
        }
        for (iReSqtkUVgnbDiReSqtkUVg iReSqtkUVgnbDiReSqtkUVg2 : iReSqtkUVgnbDiReSqtkUVg.q()) {
            if (iReSqtkUVgnbDiReSqtkUVg2 == null || iReSqtkUVgnbDiReSqtkUVg2.b() || iReSqtkUVgnbDiReSqtkUVg2.r() != n) continue;
            return iReSqtkUVgnbDiReSqtkUVg2;
        }
        return null;
    }

    private int r() {
        return iReSqtkUVgaKUiReSqtkUVg.a(iReSqtkUVgnbDiReSqtkUVg.a.c().aY, this.b);
    }
}

