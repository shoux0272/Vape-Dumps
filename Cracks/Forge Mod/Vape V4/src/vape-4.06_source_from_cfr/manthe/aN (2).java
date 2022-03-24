/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.util.Iterator;
import manthe.A5;
import manthe.V;
import manthe.cy;
import manthe.e5;
import manthe.eq;
import manthe.f4;
import manthe.fG;
import manthe.fV;
import manthe.fb;
import manthe.fk;
import manthe.gz;

public class aN {
    public static fk a(String string) {
        Iterator iterator = fk.j().f().iterator();
        String string2 = "";
        while (iterator.hasNext()) {
            cy cy2;
            Object object;
            if (V.c() == 13) {
                string2 = (String)iterator.next();
                object = fk.j().a(string2);
            } else {
                cy2 = new gz(iterator.next());
                string2 = cy2.f();
                object = fk.j().a(cy2.a());
            }
            string2 = string2.replace("minecraft:", "");
            string2 = string2.toLowerCase();
            if (!A5.cg.isInstance(object)) continue;
            cy2 = new fk(object);
            if (!string2.equalsIgnoreCase(string)) continue;
            return cy2;
        }
        return null;
    }

    public static double a(fG fG2) {
        if (fG2.d() && fG2.k().a(A5.cN)) {
            fV fV2 = new fV(fG2.k());
            int n6 = fV2.m();
            return (double)n6 + (double)((100 - n6 * 4) * eq.a(0, fG2) * 4) * 0.0075;
        }
        return 0.0;
    }

    public static float b(fG fG2) {
        float f10;
        if (fG2 == null || !fG2.k().a(A5.bO) && !fG2.k().a(A5.aP)) {
            return 0.0f;
        }
        if (fG2.k().a(A5.bO)) {
            fb fb2 = new fb(fG2.k().a());
            f10 = fb2.l();
        } else {
            f4 f42 = new f4(fG2.k().a());
            f10 = f42.k();
        }
        return (float)eq.a(e5.f().l(), fG2) * 1.25f + f10 + (float)eq.a(e5.g().l(), fG2) * 0.01f;
    }
}

