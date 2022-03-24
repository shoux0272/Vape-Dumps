/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.A5;
import manthe.BG;
import manthe.V;
import manthe.bP;
import manthe.gJ;

public class iZ
extends gJ {
    private final bP d;
    private BG u;
    private BG i;
    private BG a;
    private BG f;
    private BG n;
    private BG g;
    private BG q;
    private BG m;
    private BG t;
    private BG k;
    private BG e;
    private BG r;
    private BG l;
    private BG p;
    private BG s;
    private BG o;
    private bP j;
    private bP h;

    public iZ() {
        super(A5.dh);
        if (V.c() >= 23) {
            this.o = this.a("REGISTRY", true, A5.bm);
            this.j = this.b("getEnchantmentByID", true, A5.dh, Integer.TYPE);
            this.h = this.b("getEnchantmentID", true, Integer.TYPE, A5.dh);
        } else {
            this.u = this.b("effectId", true, Integer.TYPE);
            this.s = this.b("enchantmentsList", true, "[L" + A5.dh.getName().replace(".", "/") + ";");
        }
        this.d = this.a("getTranslatedName", true, String.class, Integer.TYPE);
    }

    private int a(Object object) {
        return this.u.c(object);
    }

    private int b(Object object) {
        return this.h.o(null, object);
    }

    private Object[] d() {
        return this.s.e(null);
    }

    private String a(Object object, int n6) {
        return (String)this.d.e(object, n6);
    }

    private Object a(int n6) {
        return this.j.e(null, n6);
    }

    private Object e() {
        return this.o.f(null);
    }

    static Object a(iZ iZ2) {
        return iZ2.e();
    }

    static Object[] b(iZ iZ2) {
        return iZ2.d();
    }

    static Object a(iZ iZ2, int n6) {
        return iZ2.a(n6);
    }

    static String a(iZ iZ2, Object object, int n6) {
        return iZ2.a(object, n6);
    }

    static int a(iZ iZ2, Object object) {
        return iZ2.b(object);
    }

    static int b(iZ iZ2, Object object) {
        return iZ2.a(object);
    }
}

