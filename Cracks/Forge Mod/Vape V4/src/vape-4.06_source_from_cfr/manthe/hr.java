/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.util.Set;
import manthe.A5;
import manthe.BG;
import manthe.V;
import manthe.bP;
import manthe.cy;
import manthe.gJ;

public class hr
extends gJ {
    private final BG n;
    private final BG j;
    private final BG k;
    private final BG p;
    private final BG o;
    private final BG r;
    private final BG i;
    private final BG l;
    private final BG h;
    private final BG g;
    private final BG d;
    private final BG a;
    private final BG f;
    private final BG t;
    private final BG m;
    private final BG s = V.c() == 13 ? this.a("field_147001_a", false, A5.ca) : this.a(V.c() >= 23 ? "INVENTORY_BACKGROUND" : "inventoryBackground", true, A5.ca);
    private final bP q;
    private final bP e;

    public hr() {
        super(A5.bt);
        this.n = this.b("inventorySlots", true, A5.aS);
        this.j = this.b("field_146993_M", cy.c, Boolean.TYPE);
        this.k = this.b("field_146995_H", cy.c, Boolean.TYPE);
        this.p = this.b("guiLeft", true, Integer.TYPE);
        this.o = this.b("guiTop", true, Integer.TYPE);
        this.r = this.b("xSize", true, Integer.TYPE);
        this.i = this.b("ySize", true, Integer.TYPE);
        this.l = this.b("field_146994_N", cy.c, A5.bT);
        this.h = this.b("field_146998_K", cy.c, A5.aF);
        this.g = this.b("field_146997_J", cy.c, Long.TYPE);
        this.d = this.b("field_146992_L", cy.c, Integer.TYPE);
        this.a = this.b("field_147007_t", cy.c, Boolean.TYPE);
        this.f = this.b("field_146988_G", cy.c, Integer.TYPE);
        this.t = this.b("field_147008_s", cy.c, Set.class);
        this.m = this.b("field_146987_F", cy.c, Integer.TYPE);
        this.q = this.a("getSlotAtPosition", true, A5.aF, Integer.TYPE, Integer.TYPE);
        this.e = V.c() >= 23 ? this.a("handleMouseClick", true, Void.TYPE, A5.aF, Integer.TYPE, Integer.TYPE, A5.cy) : this.a("handleMouseClick", true, Void.TYPE, A5.aF, Integer.TYPE, Integer.TYPE, Integer.TYPE);
    }

    public Object d() {
        return this.s.f(null);
    }

    public Object g(Object object) {
        return this.n.f(object);
    }

    private Object a(Object object, int n6, int n10) {
        return this.q.e(object, n6, n10);
    }

    private void a(Object object, boolean bl) {
        this.j.a(object, bl);
    }

    private void b(Object object, boolean bl) {
        this.k.a(object, bl);
    }

    private int d(Object object) {
        return this.p.c(object);
    }

    private int c(Object object) {
        return this.o.c(object);
    }

    private int b(Object object) {
        return this.r.c(object);
    }

    private int a(Object object) {
        return this.i.c(object);
    }

    private Object e(Object object) {
        return this.l.f(object);
    }

    private void a(Object object, Object object2) {
        this.l.a(object, object2);
    }

    private void a(Object object, Object object2, int n6, int n10, int n11) {
        this.e.p(object, object2, n6, n10, n11);
    }

    private void a(Object object, Object object2, int n6, int n10, Object object3) {
        this.e.p(object, object2, n6, n10, object3);
    }

    private void b(Object object, Object object2) {
        this.h.a(object, object2);
    }

    private void a(Object object, long l) {
        this.g.a(object, l);
    }

    private void b(Object object, int n6) {
        this.d.a(object, n6);
    }

    private void c(Object object, boolean bl) {
        this.a.a(object, bl);
    }

    private void c(Object object, int n6) {
        this.f.a(object, n6);
    }

    private Set f(Object object) {
        return (Set)this.t.f(object);
    }

    private void a(Object object, int n6) {
        this.m.a(object, n6);
    }

    static Object a(hr hr2, Object object, int n6, int n10) {
        return hr2.a(object, n6, n10);
    }

    static void a(hr hr2, Object object, boolean bl) {
        hr2.a(object, bl);
    }

    static void c(hr hr2, Object object, boolean bl) {
        hr2.b(object, bl);
    }

    static int d(hr hr2, Object object) {
        return hr2.d(object);
    }

    static int b(hr hr2, Object object) {
        return hr2.c(object);
    }

    static int e(hr hr2, Object object) {
        return hr2.b(object);
    }

    static int f(hr hr2, Object object) {
        return hr2.a(object);
    }

    static Object c(hr hr2, Object object) {
        return hr2.e(object);
    }

    static void b(hr hr2, Object object, Object object2) {
        hr2.a(object, object2);
    }

    static void a(hr hr2, Object object, Object object2, int n6, int n10, int n11) {
        hr2.a(object, object2, n6, n10, n11);
    }

    static void a(hr hr2, Object object, Object object2, int n6, int n10, Object object3) {
        hr2.a(object, object2, n6, n10, object3);
    }

    static void a(hr hr2, Object object, Object object2) {
        hr2.b(object, object2);
    }

    static void a(hr hr2, Object object, long l) {
        hr2.a(object, l);
    }

    static void c(hr hr2, Object object, int n6) {
        hr2.b(object, n6);
    }

    static void b(hr hr2, Object object, boolean bl) {
        hr2.c(object, bl);
    }

    static void a(hr hr2, Object object, int n6) {
        hr2.c(object, n6);
    }

    static Set a(hr hr2, Object object) {
        return hr2.f(object);
    }

    static void b(hr hr2, Object object, int n6) {
        hr2.a(object, n6);
    }
}

