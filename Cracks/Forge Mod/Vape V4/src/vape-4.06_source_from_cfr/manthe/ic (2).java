/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.util.UUID;
import manthe.A5;
import manthe.bP;
import manthe.gJ;

public class ic
extends gJ {
    private final bP d = this.a("getModifier", true, A5.ar, UUID.class);
    private final bP f = this.a("applyModifier", true, Void.TYPE, A5.ar);
    private final bP e = this.a("getAttributeValue", true, Double.TYPE, new Class[0]);
    private static String[] a;

    public ic() {
        super(A5.H);
    }

    private Object a(Object object, UUID uUID) {
        return this.d.e(object, uUID);
    }

    private void a(Object object, Object object2) {
        this.f.p(object, object2);
    }

    private double a(Object object) {
        return this.e.m(object, new Object[0]);
    }

    static Object a(ic ic2, Object object, UUID uUID) {
        return ic2.a(object, uUID);
    }

    static void a(ic ic2, Object object, Object object2) {
        ic2.a(object, object2);
    }

    static double a(ic ic2, Object object) {
        return ic2.a(object);
    }

    public static void b(String[] arrstring) {
        a = arrstring;
    }

    public static String[] d() {
        return a;
    }

    static {
        if (ic.d() != null) {
            ic.b(new String[1]);
        }
    }
}

