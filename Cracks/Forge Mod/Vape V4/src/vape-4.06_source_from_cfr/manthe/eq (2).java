/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.util.ArrayList;
import manthe.V;
import manthe.cy;
import manthe.e5;
import manthe.ec;
import manthe.ee;
import manthe.ex;
import manthe.ey;
import manthe.fG;
import manthe.fp;
import manthe.in;

public class eq
extends cy {
    public eq(Object object) {
        super(object);
    }

    public static int a(int n6, fG fG2) {
        if (V.c() >= 23) {
            e5 e52 = e5.a(n6);
            return in.b(eq.a.M().bU, e52.a(), fG2.a());
        }
        return in.a(eq.a.M().bU, n6, fG2.a());
    }

    public static int a(ex ex2) {
        return in.a(eq.a.M().bU, ex2.a());
    }

    public static float a(fG fG2, ey ey2) {
        return in.a(eq.a.M().bU, fG2.a(), ey2.a());
    }

    public static int a(fG[] arrfG, fp fp2) {
        if (V.c() >= 23) {
            ArrayList<Object> arrayList = new ArrayList<Object>();
            for (fG fG2 : arrfG) {
                arrayList.add(fG2.a());
            }
            return in.a(eq.a.M().bU, arrayList, fp2.a());
        }
        Object[] arrobject = new Object[arrfG.length];
        for (int k = 0; k < arrfG.length; ++k) {
            arrobject[k] = arrfG[k].a();
        }
        return in.a(eq.a.M().bU, arrobject, fp2.a());
    }

    public static float b(fG fG2, ey ey2) {
        return in.a(eq.a.M().bU, fG2.a(), ey2.a());
    }

    public static ee f() {
        return new ee(in.a(eq.a.M().bU));
    }

    public static void a(ec ec2, fG[] arrfG) {
        if (V.c() >= 23) {
            ArrayList<Object> arrayList = new ArrayList<Object>();
            for (fG fG2 : arrfG) {
                arrayList.add(fG2.a());
            }
            in.a(eq.a.M().bU, ec2.a(), arrayList);
            return;
        }
        Object[] arrobject = new Object[arrfG.length];
        for (int k = 0; k < arrfG.length; ++k) {
            arrobject[k] = arrfG[k].a();
        }
        in.a(eq.a.M().bU, ec2.a(), arrobject);
    }
}

