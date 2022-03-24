/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.A5;
import manthe.BG;
import manthe.gJ;

public class h0
extends gJ {
    private final BG e = this.b("attachedEntity", true, A5.ba);
    private final BG d = this.b("particleTypes", true, A5.cm);
    private static String[] a;

    public h0() {
        super(A5.V);
    }

    private Object a(Object object) {
        return this.d.f(object);
    }

    private Object b(Object object) {
        return this.e.f(object);
    }

    private void a(Object object, Object object2) {
        this.e.a(object, object2);
    }

    static Object b(h0 h02, Object object) {
        return h02.a(object);
    }

    static Object a(h0 h02, Object object) {
        return h02.b(object);
    }

    static void a(h0 h02, Object object, Object object2) {
        h02.a(object, object2);
    }

    public static void b(String[] arrstring) {
        a = arrstring;
    }

    public static String[] d() {
        return a;
    }

    static {
        if (h0.d() != null) {
            h0.b(new String[2]);
        }
    }
}

