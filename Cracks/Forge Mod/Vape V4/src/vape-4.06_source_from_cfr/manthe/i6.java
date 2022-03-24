/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.A5;
import manthe.BG;
import manthe.V;
import manthe.bP;
import manthe.cy;
import manthe.gJ;

public class i6
extends gJ {
    private final BG o = this.b("stackSize", true, Integer.TYPE);
    private final BG f = this.b("stackTagCompound", true, A5.au);
    private final bP l = this.a("getItem", true, A5.cg, new Class[0]);
    private final bP e;
    private final bP i;
    private final bP j;
    private final bP m;
    private final bP n;
    private final bP h;
    private final bP g;
    private final bP k;
    private final bP a;
    private final bP d = this.a("getMaxStackSize", true, Integer.TYPE, new Class[0]);

    public i6() {
        super(A5.bT);
        this.e = this.a("<init>", false, Void.TYPE, A5.cg);
        this.j = this.a("getUnlocalizedName", true, String.class, new Class[0]);
        this.m = this.a("getDisplayName", true, String.class, new Class[0]);
        this.n = this.a("getItemDamage", true, Integer.TYPE, new Class[0]);
        this.h = this.a("setItemDamage", true, Void.TYPE, Integer.TYPE);
        this.i = this.a("isItemEqual", true, Boolean.TYPE, A5.bT);
        this.g = this.a("getEnchantmentTagList", true, A5.dv, new Class[0]);
        if (V.c() >= 23) {
            this.a = this.a("func_150997_a", cy.c, Float.TYPE, A5.aA);
            this.k = this.a("getAttributeModifiers", true, A5.bA, A5.cb);
        } else {
            this.a = this.a("func_150997_a", cy.c, Float.TYPE, A5.F);
            this.k = this.a("getAttributeModifiers", true, A5.bA, new Class[0]);
        }
    }

    public boolean b(Object object, Object object2) {
        return this.i.h(object, object2);
    }

    public void d(Object object, Object object2) {
        this.f.a(object, object2);
    }

    public Object h(Object object) {
        return this.f.f(object);
    }

    public void b(Object object, int n6) {
        this.o.a(object, n6);
    }

    public int e(Object object) {
        return this.o.c(object);
    }

    private int i(Object object) {
        return this.d.o(object, new Object[0]);
    }

    public Object j(Object object) {
        return this.l.e(object, new Object[0]);
    }

    public Object f(Object object) {
        return this.e.a(object);
    }

    public String g(Object object) {
        return this.j.e(object, new Object[0]).toString();
    }

    private String b(Object object) {
        return (String)this.m.e(object, new Object[0]);
    }

    private int a(Object object) {
        return this.n.o(object, new Object[0]);
    }

    private void a(Object object, int n6) {
        this.h.p(object, n6);
    }

    private Object d(Object object) {
        return this.g.e(object, new Object[0]);
    }

    private Object c(Object object) {
        return this.k.e(object, new Object[0]);
    }

    private Object c(Object object, Object object2) {
        return this.k.e(object, object2);
    }

    private float a(Object object, Object object2) {
        return this.a.f(object, object2);
    }

    static String c(i6 i62, Object object) {
        return i62.b(object);
    }

    static int e(i6 i62, Object object) {
        return i62.a(object);
    }

    static void a(i6 i62, Object object, int n6) {
        i62.a(object, n6);
    }

    static Object d(i6 i62, Object object) {
        return i62.d(object);
    }

    static Object b(i6 i62, Object object, Object object2) {
        return i62.c(object, object2);
    }

    static Object b(i6 i62, Object object) {
        return i62.c(object);
    }

    static float a(i6 i62, Object object, Object object2) {
        return i62.a(object, object2);
    }

    static int a(i6 i62, Object object) {
        return i62.i(object);
    }
}

