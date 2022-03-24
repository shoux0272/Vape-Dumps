/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.A5;
import manthe.BG;
import manthe.V;
import manthe.bP;
import manthe.gJ;

public class ik
extends gJ {
    private final BG e;
    private bP d;
    private bP h;
    private bP a;
    private bP f;
    private bP g;

    public ik() {
        super(A5.ax);
        if (V.c() == 13) {
            this.d = this.b("getInstance", false, A5.ax, new Class[0]);
            this.h = this.a("renderItemIntoGUI", true, Void.TYPE, A5.l, A5.ai, A5.bT, Integer.TYPE, Integer.TYPE);
            this.a = this.a("renderItemOverlayIntoGUI", true, Void.TYPE, A5.l, A5.ai, A5.bT, Integer.TYPE, Integer.TYPE);
        } else {
            this.f = this.a("renderItemIntoGUI", true, Void.TYPE, A5.bT, Integer.TYPE, Integer.TYPE);
            this.g = this.a("renderItemOverlays", true, Void.TYPE, A5.l, A5.bT, Integer.TYPE, Integer.TYPE);
        }
        this.e = this.b("zLevel", true, Float.TYPE);
    }

    private Object d() {
        return this.d.e(null, new Object[0]);
    }

    private void b(Object object, Object object2, Object object3, Object object4, int n6, int n10) {
        this.h.p(object, object2, object3, object4, n6, n10);
    }

    private void a(Object object, Object object2, int n6, int n10) {
        this.f.p(object, object2, n6, n10);
    }

    private void a(Object object, Object object2, Object object3, Object object4, int n6, int n10) {
        this.a.p(object, object2, object3, object4, n6, n10);
    }

    private void a(Object object, Object object2, Object object3, int n6, int n10) {
        this.g.p(object, object2, object3, n6, n10);
    }

    private float a(Object object) {
        return this.e.b(object);
    }

    private void a(Object object, float f10) {
        this.e.a(object, f10);
    }

    static Object a(ik ik2) {
        return ik2.d();
    }

    static void a(ik ik2, Object object, Object object2, Object object3, Object object4, int n6, int n10) {
        ik2.b(object, object2, object3, object4, n6, n10);
    }

    static void a(ik ik2, Object object, Object object2, int n6, int n10) {
        ik2.a(object, object2, n6, n10);
    }

    static void b(ik ik2, Object object, Object object2, Object object3, Object object4, int n6, int n10) {
        ik2.a(object, object2, object3, object4, n6, n10);
    }

    static void a(ik ik2, Object object, Object object2, Object object3, int n6, int n10) {
        ik2.a(object, object2, object3, n6, n10);
    }

    static float a(ik ik2, Object object) {
        return ik2.a(object);
    }

    static void a(ik ik2, Object object, float f10) {
        ik2.a(object, f10);
    }
}

