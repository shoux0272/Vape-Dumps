/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.util.HashMap;
import manthe.cy;
import manthe.ds;
import manthe.oS;
import manthe.on;
import manthe.pj;

public class Ch {
    static HashMap<oS, pj> c = new HashMap();
    private static cy[] b;

    private static void a(oS oS2) {
        pj pj2 = new pj();
        pj2.a(oS2.a, oS2.a());
        c.put(oS2, pj2);
    }

    public static void a(String string, int n6) {
        oS oS2 = new oS(string, n6);
        if (!c.containsKey(oS2)) {
            Ch.a(oS2);
        }
    }

    public static void a(String string, float f10, float f11, int n6) {
        try {
            oS oS2 = new oS(string, n6);
            Ch.a(string, n6);
            int n10 = ds.m().c(string);
            int n11 = ds.m().b(string);
            c.get(oS2).a(f10, f11, n10, n11);
        }
        catch (Exception exception) {
            on.a(exception);
        }
    }

    static {
        Ch.b(new cy[2]);
    }

    public static void b(cy[] arrcy) {
        b = arrcy;
    }

    public static cy[] b() {
        return b;
    }
}

