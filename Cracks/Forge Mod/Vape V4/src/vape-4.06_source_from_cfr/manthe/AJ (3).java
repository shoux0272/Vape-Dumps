/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.DR;
import manthe.Ds;
import manthe.R;
import manthe.p1;

public class AJ
implements R {
    private static String b;

    public void a(p1 p12) {
        if (p12.p() != null && p12.p() instanceof DR) {
            DR dR2 = (DR)p12.p();
            for (Ds ds2 : dR2.t()) {
                Ds ds3 = ds2;
                Object c3 = ds3.c();
                if (c3 == null) continue;
                if (!p12.e()) {
                    c3.a(false);
                    continue;
                }
                ds3.c().a(dR2.b(ds3));
            }
        }
    }

    public static void b(String string) {
        b = string;
    }

    public static String b() {
        return b;
    }

    static {
        if (AJ.b() == null) {
            AJ.b("k4L8Lc");
        }
    }
}

