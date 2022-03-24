/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.util.HashMap;
import manthe.aJ;
import manthe.bt;
import manthe.fG;
import manthe.fk;
import manthe.on;

public class E {
    static HashMap<aJ, bt> c = new HashMap();
    private static String[] b;

    private static void a(fG fG2, aJ aJ2) {
        bt bt2 = new bt();
        bt.a(bt2, fG2);
        c.put(aJ2, bt2);
    }

    public static void a(int n6, int n10) {
        aJ aJ2 = new aJ(n6, n10);
        if (!c.containsKey(aJ2)) {
            fk fk2 = fk.a(n6);
            if (fk2.e()) {
                return;
            }
            fG fG2 = fG.a(fk2);
            fG2.a(n10);
            E.a(fG2, aJ2);
        }
    }

    public static void a(fG fG2, float f10, float f11, int n6, int n10, float f12) {
        try {
            fk fk2 = fG2.k();
            aJ aJ2 = new aJ(fk2.h(), fG2.m());
            E.a(fk2.h(), fG2.m());
            c.get(aJ2).a(f10, f11, n6, n10, f12);
        }
        catch (Exception exception) {
            on.a(exception);
        }
    }

    public static void a(int n6, int n10, float f10, float f11, int n11, int n12) {
        aJ aJ2 = new aJ(n6, n10);
        if (!c.containsKey(aJ2)) {
            fG fG2 = fG.a(fk.a(n6));
            fG2.a(n10);
            E.a(fG2, f10, f11, n11, n12, 1.0f);
        } else {
            c.get(aJ2).a(f10, f11, n11, n12, 1.0f);
        }
    }

    public static void a(int n6, float f10, float f11, int n10, int n11) {
        E.a(n6, 0, f10, f11, n10, n11);
    }

    static {
        E.b(new String[4]);
    }

    public static void b(String[] arrstring) {
        b = arrstring;
    }

    public static String[] b() {
        return b;
    }
}

