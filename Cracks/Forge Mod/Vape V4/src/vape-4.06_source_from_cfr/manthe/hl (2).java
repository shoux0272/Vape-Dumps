/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import javassist.bytecode.CodeAttribute$RuntimeCopyException;
import manthe.A5;
import manthe.BG;
import manthe.V;
import manthe.gJ;

public class hl
extends gJ {
    private final BG a;
    private BG i;
    private BG f;
    private BG g;
    private BG d;
    private BG j;
    private BG h;
    private static boolean e;

    public hl() {
        super(A5.m);
        if (V.c() < 23) {
            this.i = this.b("action", false, A5.cz);
        }
        if (V.c() == 13) {
            this.f = this.b("x", false, Integer.TYPE);
            this.g = this.b("y", false, Integer.TYPE);
            this.d = this.b("z", false, Integer.TYPE);
            this.a = this.b("face", false, Integer.TYPE);
        } else {
            this.j = this.b("pos", false, A5.ao);
            this.a = this.b("face", false, A5.aY);
        }
    }

    private int e(Object object) {
        return this.f.c(object);
    }

    private int g(Object object) {
        return this.g.c(object);
    }

    private int f(Object object) {
        return this.d.c(object);
    }

    private int c(Object object) {
        return this.a.c(object);
    }

    private Object b(Object object) {
        return this.a.f(object);
    }

    private Object d(Object object) {
        return this.j.f(object);
    }

    private String a(Object object) {
        Object object2 = this.i.f(object);
        return object2 == null ? "" : object2.toString();
    }

    static int e(hl hl2, Object object) {
        return hl2.e(object);
    }

    static int d(hl hl2, Object object) {
        return hl2.g(object);
    }

    static int c(hl hl2, Object object) {
        return hl2.f(object);
    }

    static int a(hl hl2, Object object) {
        return hl2.c(object);
    }

    static Object g(hl hl2, Object object) {
        return hl2.d(object);
    }

    static Object f(hl hl2, Object object) {
        return hl2.b(object);
    }

    static String b(hl hl2, Object object) {
        return hl2.a(object);
    }

    public static void b(boolean bl) {
        e = bl;
    }

    public static boolean d() {
        return e;
    }

    public static boolean e() {
        boolean bl = hl.d();
        return !bl;
    }

    private static CodeAttribute$RuntimeCopyException a(CodeAttribute$RuntimeCopyException codeAttribute$RuntimeCopyException) {
        return codeAttribute$RuntimeCopyException;
    }

    static {
        if (!hl.d()) {
            hl.b(true);
        }
    }
}

