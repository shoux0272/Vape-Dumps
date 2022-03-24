/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.A5;
import manthe.V;
import manthe.bP;
import manthe.gJ;

public class im
extends gJ {
    private final bP f = this.a("getSizeInventory", true, Integer.TYPE, new Class[0]);
    private final bP e = this.a("getStackInSlot", true, A5.bT, Integer.TYPE);
    private bP a;
    private bP d;

    public im() {
        super(A5.ap);
        if (V.c() == 13) {
            this.a = this.a("getInventoryName", true, String.class, new Class[0]);
            this.d = this.a("hasCustomInventoryName", true, Boolean.TYPE, new Class[0]);
        }
    }

    private int b(Object object) {
        return this.f.o(object, new Object[0]);
    }

    private Object a(Object object, int n6) {
        return this.e.e(object, n6);
    }

    private String a(Object object) {
        return this.a.e(object, new Object[0]).toString();
    }

    private boolean c(Object object) {
        return this.d.h(object, new Object[0]);
    }

    static String b(im im2, Object object) {
        return im2.a(object);
    }

    static int c(im im2, Object object) {
        return im2.b(object);
    }

    static Object a(im im2, Object object, int n6) {
        return im2.a(object, n6);
    }

    static boolean a(im im2, Object object) {
        return im2.c(object);
    }
}

