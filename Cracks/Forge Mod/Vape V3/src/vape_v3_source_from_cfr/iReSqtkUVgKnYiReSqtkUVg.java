/*
 * Decompiled with CFR 0.150.
 */
public class iReSqtkUVgKnYiReSqtkUVg
extends iReSqtkUVgYJSiReSqtkUVg {
    private final iReSqtkUVgkgTiReSqtkUVg b;
    private final iReSqtkUVgkgTiReSqtkUVg c;
    private final iReSqtkUVgkgTiReSqtkUVg d = this.a("jump", true, Boolean.TYPE);
    private final iReSqtkUVgkgTiReSqtkUVg e = this.a("sneak", true, Boolean.TYPE);
    private iReSqtkUVgkgTiReSqtkUVg f;
    private iReSqtkUVgkgTiReSqtkUVg g;
    private iReSqtkUVgkgTiReSqtkUVg h;
    private iReSqtkUVgkgTiReSqtkUVg i;

    public iReSqtkUVgKnYiReSqtkUVg() {
        super("net/minecraft/util/MovementInput");
        this.b = this.a("moveStrafe", true, Float.TYPE);
        if (iReSqtkUVgauSiReSqtkUVg.d() >= 23) {
            this.f = this.a("forwardKeyDown", true, Boolean.TYPE);
            this.g = this.a("backKeyDown", true, Boolean.TYPE);
            this.h = this.a("leftKeyDown", true, Boolean.TYPE);
            this.i = this.a("rightKeyDown", true, Boolean.TYPE);
            this.c = this.a("field_192832_b", false, Float.TYPE);
        } else {
            this.c = this.a("moveForward", true, Float.TYPE);
        }
    }

    private boolean a(Object object) {
        return this.f.a(object);
    }

    private void a(Object object, boolean bl) {
        this.f.a(object, bl);
    }

    private boolean b(Object object) {
        return this.g.a(object);
    }

    private void b(Object object, boolean bl) {
        this.g.a(object, bl);
    }

    private boolean c(Object object) {
        return this.h.a(object);
    }

    private void c(Object object, boolean bl) {
        this.h.a(object, bl);
    }

    private boolean d(Object object) {
        return this.f.a(object);
    }

    private void d(Object object, boolean bl) {
        this.i.a(object, bl);
    }

    private boolean e(Object object) {
        return this.d.a(object);
    }

    private boolean f(Object object) {
        return this.e.a(object);
    }

    private void e(Object object, boolean bl) {
        this.d.a(object, bl);
    }

    private void f(Object object, boolean bl) {
        this.e.a(object, bl);
    }

    private float g(Object object) {
        return this.b.f(object);
    }

    private float h(Object object) {
        return this.c.f(object);
    }

    private void a(Object object, float f) {
        this.b.a(object, f);
    }

    private void b(Object object, float f) {
        this.c.a(object, f);
    }

    static /* synthetic */ boolean a(iReSqtkUVgKnYiReSqtkUVg iReSqtkUVgKnYiReSqtkUVg2, Object object) {
        return iReSqtkUVgKnYiReSqtkUVg2.a(object);
    }

    static /* synthetic */ void a(iReSqtkUVgKnYiReSqtkUVg iReSqtkUVgKnYiReSqtkUVg2, Object object, boolean bl) {
        iReSqtkUVgKnYiReSqtkUVg2.a(object, bl);
    }

    static /* synthetic */ boolean b(iReSqtkUVgKnYiReSqtkUVg iReSqtkUVgKnYiReSqtkUVg2, Object object) {
        return iReSqtkUVgKnYiReSqtkUVg2.b(object);
    }

    static /* synthetic */ void b(iReSqtkUVgKnYiReSqtkUVg iReSqtkUVgKnYiReSqtkUVg2, Object object, boolean bl) {
        iReSqtkUVgKnYiReSqtkUVg2.b(object, bl);
    }

    static /* synthetic */ boolean c(iReSqtkUVgKnYiReSqtkUVg iReSqtkUVgKnYiReSqtkUVg2, Object object) {
        return iReSqtkUVgKnYiReSqtkUVg2.c(object);
    }

    static /* synthetic */ void c(iReSqtkUVgKnYiReSqtkUVg iReSqtkUVgKnYiReSqtkUVg2, Object object, boolean bl) {
        iReSqtkUVgKnYiReSqtkUVg2.c(object, bl);
    }

    static /* synthetic */ boolean d(iReSqtkUVgKnYiReSqtkUVg iReSqtkUVgKnYiReSqtkUVg2, Object object) {
        return iReSqtkUVgKnYiReSqtkUVg2.d(object);
    }

    static /* synthetic */ void d(iReSqtkUVgKnYiReSqtkUVg iReSqtkUVgKnYiReSqtkUVg2, Object object, boolean bl) {
        iReSqtkUVgKnYiReSqtkUVg2.d(object, bl);
    }

    static /* synthetic */ float e(iReSqtkUVgKnYiReSqtkUVg iReSqtkUVgKnYiReSqtkUVg2, Object object) {
        return iReSqtkUVgKnYiReSqtkUVg2.g(object);
    }

    static /* synthetic */ float f(iReSqtkUVgKnYiReSqtkUVg iReSqtkUVgKnYiReSqtkUVg2, Object object) {
        return iReSqtkUVgKnYiReSqtkUVg2.h(object);
    }

    static /* synthetic */ void a(iReSqtkUVgKnYiReSqtkUVg iReSqtkUVgKnYiReSqtkUVg2, Object object, float f) {
        iReSqtkUVgKnYiReSqtkUVg2.a(object, f);
    }

    static /* synthetic */ void b(iReSqtkUVgKnYiReSqtkUVg iReSqtkUVgKnYiReSqtkUVg2, Object object, float f) {
        iReSqtkUVgKnYiReSqtkUVg2.b(object, f);
    }

    static /* synthetic */ boolean g(iReSqtkUVgKnYiReSqtkUVg iReSqtkUVgKnYiReSqtkUVg2, Object object) {
        return iReSqtkUVgKnYiReSqtkUVg2.e(object);
    }

    static /* synthetic */ boolean h(iReSqtkUVgKnYiReSqtkUVg iReSqtkUVgKnYiReSqtkUVg2, Object object) {
        return iReSqtkUVgKnYiReSqtkUVg2.f(object);
    }

    static /* synthetic */ void e(iReSqtkUVgKnYiReSqtkUVg iReSqtkUVgKnYiReSqtkUVg2, Object object, boolean bl) {
        iReSqtkUVgKnYiReSqtkUVg2.e(object, bl);
    }

    static /* synthetic */ void f(iReSqtkUVgKnYiReSqtkUVg iReSqtkUVgKnYiReSqtkUVg2, Object object, boolean bl) {
        iReSqtkUVgKnYiReSqtkUVg2.f(object, bl);
    }
}

