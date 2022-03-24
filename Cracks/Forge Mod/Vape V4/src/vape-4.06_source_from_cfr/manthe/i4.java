/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.A5;
import manthe.bP;
import manthe.gJ;

public class i4
extends gJ {
    private final bP e = this.a("getTexture", true, A5.ck, A5.ca);
    public bP d = this.a("bindTexture", true, Void.TYPE, A5.ca);
    private static String[] a;

    public i4() {
        super(A5.ai);
    }

    private Object a(Object object, Object object2) {
        return this.e.e(object, object2);
    }

    private void b(Object object, Object object2) {
        this.d.p(object, object2);
    }

    static Object a(i4 i42, Object object, Object object2) {
        return i42.a(object, object2);
    }

    static void b(i4 i42, Object object, Object object2) {
        i42.b(object, object2);
    }

    public static void b(String[] arrstring) {
        a = arrstring;
    }

    public static String[] d() {
        return a;
    }

    static {
        if (i4.d() != null) {
            i4.b(new String[4]);
        }
    }
}

