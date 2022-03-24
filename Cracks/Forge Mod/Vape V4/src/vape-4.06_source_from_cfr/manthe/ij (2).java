/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import javassist.bytecode.CodeAttribute$RuntimeCopyException;
import manthe.A5;
import manthe.BG;
import manthe.bP;
import manthe.gJ;

public class ij
extends gJ {
    private final bP e = this.a("<init>", false, Void.TYPE, new Class[0]);
    private final BG a = this.b("isCreativeMode", true, Boolean.TYPE);
    private final BG k = this.b("disableDamage", true, Boolean.TYPE);
    private final BG h = this.b("allowFlying", true, Boolean.TYPE);
    private final BG j = this.b("allowEdit", true, Boolean.TYPE);
    private final BG d = this.b("isFlying", true, Boolean.TYPE);
    private final bP m;
    private final bP i;
    private final bP f;
    private final bP g = this.a("getWalkSpeed", true, Float.TYPE, new Class[0]);
    private static boolean l;

    public ij() {
        super(A5.c6);
        this.f = this.a("setPlayerWalkSpeed", true, Void.TYPE, Float.TYPE);
        this.i = this.a("getFlySpeed", true, Float.TYPE, new Class[0]);
        this.m = this.a("setFlySpeed", true, Void.TYPE, Float.TYPE);
    }

    private Object f() {
        return this.e.a(new Object[0]);
    }

    private boolean g(Object object) {
        return this.a.d(object);
    }

    private boolean b(Object object) {
        return this.k.d(object);
    }

    private boolean e(Object object) {
        return this.h.d(object);
    }

    private void b(Object object, boolean bl) {
        this.h.a(object, bl);
    }

    private boolean d(Object object) {
        return this.j.d(object);
    }

    private boolean f(Object object) {
        return this.d.d(object);
    }

    private void a(Object object, boolean bl) {
        this.d.a(object, bl);
    }

    private float c(Object object) {
        return this.g.f(object, new Object[0]);
    }

    private void a(Object object, float f10) {
        this.f.p(object, Float.valueOf(f10));
    }

    private float a(Object object) {
        return this.i.f(object, new Object[0]);
    }

    private void b(Object object, float f10) {
        this.m.p(object, Float.valueOf(f10));
    }

    static Object a(ij ij2) {
        return ij2.f();
    }

    static boolean g(ij ij2, Object object) {
        return ij2.g(object);
    }

    static boolean e(ij ij2, Object object) {
        return ij2.b(object);
    }

    static boolean c(ij ij2, Object object) {
        return ij2.e(object);
    }

    static void b(ij ij2, Object object, boolean bl) {
        ij2.b(object, bl);
    }

    static boolean f(ij ij2, Object object) {
        return ij2.d(object);
    }

    static boolean b(ij ij2, Object object) {
        return ij2.f(object);
    }

    static void a(ij ij2, Object object, boolean bl) {
        ij2.a(object, bl);
    }

    static float d(ij ij2, Object object) {
        return ij2.c(object);
    }

    static void a(ij ij2, Object object, float f10) {
        ij2.a(object, f10);
    }

    static float a(ij ij2, Object object) {
        return ij2.a(object);
    }

    static void b(ij ij2, Object object, float f10) {
        ij2.b(object, f10);
    }

    public static void b(boolean bl) {
        l = bl;
    }

    public static boolean d() {
        return l;
    }

    public static boolean e() {
        boolean bl = ij.d();
        return !bl;
    }

    private static CodeAttribute$RuntimeCopyException a(CodeAttribute$RuntimeCopyException codeAttribute$RuntimeCopyException) {
        return codeAttribute$RuntimeCopyException;
    }

    static {
        if (ij.e()) {
            ij.b(true);
        }
    }
}

