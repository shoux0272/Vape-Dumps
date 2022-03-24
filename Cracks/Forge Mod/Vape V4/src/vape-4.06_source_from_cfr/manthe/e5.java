/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.util.ArrayList;
import manthe.V;
import manthe.cy;
import manthe.iZ;

public class e5
extends cy {
    public e5(Object object) {
        super(object);
    }

    public static e5 m() {
        return e5.a(0);
    }

    public static e5 r() {
        return e5.a(34);
    }

    public static e5 f() {
        return e5.a(16);
    }

    public static e5 g() {
        return e5.a(20);
    }

    public static e5 s() {
        return e5.a(32);
    }

    public static e5 i() {
        return e5.a(2);
    }

    public static e5 t() {
        return e5.a(48);
    }

    public static e5 u() {
        return e5.a(50);
    }

    public static e5 p() {
        return e5.a(49);
    }

    public static e5 q() {
        return e5.a(35);
    }

    public static e5 o() {
        return e5.a(51);
    }

    public static e5 h() {
        return e5.a(7);
    }

    public static e5 v() {
        return e5.a(19);
    }

    public static e5 j() {
        return e5.a(1);
    }

    public static e5 n() {
        return e5.a(3);
    }

    public static e5[] k() {
        if (V.c() >= 23) {
            Iterable iterable = (Iterable)iZ.a(e5.a.M().bE);
            ArrayList<e5> arrayList = new ArrayList<e5>();
            for (Object t2 : iterable) {
                e5 e52 = new e5(t2);
                arrayList.add(e52);
            }
            return arrayList.toArray(new e5[arrayList.size()]);
        }
        Object[] arrobject = iZ.b(e5.a.M().bE);
        e5[] arre5 = new e5[arrobject.length];
        for (int k = 0; k < arrobject.length; ++k) {
            arre5[k] = new e5(arrobject[k]);
        }
        return arre5;
    }

    public static e5 a(int n6) {
        if (V.c() >= 23) {
            return new e5(iZ.a(e5.a.M().bE, n6));
        }
        for (e5 e52 : e5.k()) {
            if (e52 == null || e52.e() || e52.l() != n6) continue;
            return e52;
        }
        return null;
    }

    public String b(int n6) {
        return iZ.a(e5.a.M().bE, this.b, n6);
    }

    public int l() {
        if (V.c() >= 23) {
            return iZ.a(e5.a.M().bE, this.b);
        }
        return iZ.b(e5.a.M().bE, this.b);
    }
}

