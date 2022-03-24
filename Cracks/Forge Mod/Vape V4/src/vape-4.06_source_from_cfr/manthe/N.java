/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import manthe.V;
import manthe.dx;
import manthe.fG;
import manthe.fk;
import manthe.g9;

public class N {
    private static int a(String string, fk fk2) {
        Object object;
        if (fk2.e()) {
            return -1;
        }
        fG fG2 = fG.a(fk2);
        if (fG2.e()) {
            return -1;
        }
        List list = new ArrayList();
        if (V.c() >= 23) {
            list = (List)g9.f().a();
        }
        fk2.a(fk2, list);
        if (list.size() > 0) {
            object = list.iterator();
            while (object.hasNext()) {
                Object e10 = object.next();
                fG fG3 = new fG(e10);
                if (!fG3.j().equalsIgnoreCase(string)) continue;
                return fG3.m();
            }
        }
        if (((String)(object = fG2.j().toLowerCase())).equalsIgnoreCase(string)) {
            return fG2.m();
        }
        return -1;
    }

    public static int[] a(String string) {
        Object object;
        int[] arrn = new int[]{0, 0};
        Map map = fk.i();
        if (map != null) {
            object = map.keySet();
            Iterator iterator = object.iterator();
            while (iterator.hasNext()) {
                Object k = iterator.next();
                Object v4 = map.get(k);
                dx dx2 = new dx(k);
                fk fk2 = new fk(v4);
                int n6 = N.a(string, fk2);
                if (n6 == -1) continue;
                arrn[0] = dx.a(dx2);
                arrn[1] = n6;
            }
        }
        if ((object = dx.a(string.replace(" ", "_"))) != null) {
            arrn[0] = dx.a((dx)object);
        }
        return arrn;
    }
}

