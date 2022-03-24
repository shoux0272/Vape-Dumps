/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.util.List;
import java.util.Map;
import manthe.A5;
import manthe.BG;
import manthe.V;
import manthe.bP;
import manthe.gJ;

public class iE
extends gJ {
    private final bP a;
    private final bP k;
    private final bP g;
    private final bP l;
    private final bP f;
    private final BG e;
    private final BG d = this.b("maxDamage", true, Integer.TYPE);
    private bP h;
    private bP j;
    private BG i;

    public iE() {
        super(A5.cg);
        this.a = this.a("getUnlocalizedNameInefficiently", true, String.class, A5.bT);
        this.k = this.a("getItemStackDisplayName", true, String.class, A5.bT);
        this.g = this.b("getIdFromItem", true, Integer.TYPE, A5.cg);
        this.l = this.b("getItemById", true, A5.cg, Integer.TYPE);
        if (V.c() == 13) {
            this.h = this.a("getIconString", true, String.class, new Class[0]);
        } else {
            this.j = this.b("getByNameOrId", true, A5.cg, String.class);
        }
        if (V.c() >= 23) {
            this.e = this.a("REGISTRY", true, A5.bm);
            this.f = this.a("getSubItems", true, Void.TYPE, A5.dy, A5.E);
        } else {
            this.e = this.a("itemRegistry", true, A5.bm);
            this.f = this.a("getSubItems", true, Void.TYPE, A5.cg, A5.dy, List.class);
        }
        if (V.c() >= 15) {
            this.i = this.a("BLOCK_TO_ITEM", true, Map.class);
        }
    }

    private Object a(String string) {
        return this.j.e(null, string);
    }

    private String b(Object object, Object object2) {
        return this.a.e(object, object2).toString();
    }

    private String a(Object object) {
        return this.h.e(object, new Object[0]).toString();
    }

    private String a(Object object, Object object2) {
        return this.k.e(object, object2).toString();
    }

    private int b(Object object) {
        return this.g.o(null, object);
    }

    private Object a(int n6) {
        return this.l.e(null, n6);
    }

    private Object d() {
        return this.e.f(null);
    }

    private void a(Object object, Object object2, Object object3, List list) {
        if (V.c() >= 23) {
            this.f.p(object, object3, list);
        } else {
            this.f.p(object, object2, object3, list);
        }
    }

    private Map e() {
        return (Map)this.i.f(null);
    }

    private int c(Object object) {
        return this.d.c(object);
    }

    static Object a(iE iE2, String string) {
        return iE2.a(string);
    }

    static int c(iE iE2, Object object) {
        return iE2.b(object);
    }

    static Object a(iE iE2, int n6) {
        return iE2.a(n6);
    }

    static Object b(iE iE2) {
        return iE2.d();
    }

    static String b(iE iE2, Object object) {
        return iE2.a(object);
    }

    static String a(iE iE2, Object object, Object object2) {
        return iE2.b(object, object2);
    }

    static String b(iE iE2, Object object, Object object2) {
        return iE2.a(object, object2);
    }

    static void a(iE iE2, Object object, Object object2, Object object3, List list) {
        iE2.a(object, object2, object3, list);
    }

    static Map a(iE iE2) {
        return iE2.e();
    }

    static int a(iE iE2, Object object) {
        return iE2.c(object);
    }
}

