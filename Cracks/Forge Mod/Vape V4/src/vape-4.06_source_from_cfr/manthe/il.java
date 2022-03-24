/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.A5;
import manthe.BG;
import manthe.bP;
import manthe.gJ;

public class il
extends gJ {
    private final bP a;
    private final bP k = this.a("<init>", false, Void.TYPE, Integer.TYPE, Integer.TYPE, Boolean.TYPE);
    private final bP g;
    private final bP i;
    private final bP f;
    private final bP j;
    private final bP e;
    private final bP h;
    private final BG d;

    public il() {
        super(A5.g);
        this.a = this.a("createBindFramebuffer", true, Void.TYPE, Integer.TYPE, Integer.TYPE);
        this.g = this.a("bindFramebuffer", true, Void.TYPE, Boolean.TYPE);
        this.i = this.a("unbindFramebuffer", true, Void.TYPE, new Class[0]);
        this.f = this.a("bindFramebufferTexture", true, Void.TYPE, new Class[0]);
        this.j = this.a("unbindFramebufferTexture", true, Void.TYPE, new Class[0]);
        this.e = this.a("createFramebuffer", true, Void.TYPE, Integer.TYPE, Integer.TYPE);
        this.h = this.a("deleteFramebuffer", true, Void.TYPE, new Class[0]);
        this.d = this.b("depthBuffer", true, Integer.TYPE);
    }

    private Object a(int n6, int n10, boolean bl) {
        return this.k.a(new Object[]{n6, n10, bl});
    }

    private void b(Object object, int n6, int n10) {
        this.a.p(object, n6, n10);
    }

    private void a(Object object, int n6, int n10) {
        this.e.p(object, n6, n10);
    }

    private void a(Object object, boolean bl) {
        this.g.p(object, bl);
    }

    private void c(Object object) {
        this.i.p(object, new Object[0]);
    }

    private void b(Object object) {
        this.f.p(object, new Object[0]);
    }

    private void d(Object object) {
        this.j.p(object, new Object[0]);
    }

    private int a(Object object) {
        return this.d.c(object);
    }

    private void a(Object object, int n6) {
        this.d.a(object, n6);
    }

    private void e(Object object) {
        this.h.p(object, new Object[0]);
    }

    static Object a(il il2, int n6, int n10, boolean bl) {
        return il2.a(n6, n10, bl);
    }

    static void a(il il2, Object object, int n6, int n10) {
        il2.b(object, n6, n10);
    }

    static void b(il il2, Object object, int n6, int n10) {
        il2.a(object, n6, n10);
    }

    static void a(il il2, Object object, boolean bl) {
        il2.a(object, bl);
    }

    static void a(il il2, Object object) {
        il2.c(object);
    }

    static void b(il il2, Object object) {
        il2.b(object);
    }

    static void e(il il2, Object object) {
        il2.d(object);
    }

    static int c(il il2, Object object) {
        return il2.a(object);
    }

    static void a(il il2, Object object, int n6) {
        il2.a(object, n6);
    }

    static void d(il il2, Object object) {
        il2.e(object);
    }
}

