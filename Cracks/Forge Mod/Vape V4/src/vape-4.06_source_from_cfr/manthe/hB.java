/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import javassist.bytecode.CodeAttribute$RuntimeCopyException;
import manthe.A5;
import manthe.BG;
import manthe.gJ;

public class hB
extends gJ {
    private final BG l;
    private final BG e;
    private final BG d = this.b("rotateAngleX", true, Float.TYPE);
    private final BG m = this.b("rotateAngleY", true, Float.TYPE);
    private final BG j = this.b("rotateAngleZ", true, Float.TYPE);
    private final BG f = this.b("offsetX", true, Float.TYPE);
    private final BG g = this.b("offsetY", true, Float.TYPE);
    private final BG k = this.b("offsetZ", true, Float.TYPE);
    private final BG n = this.b("rotationPointX", true, Float.TYPE);
    private final BG h = this.b("rotationPointY", true, Float.TYPE);
    private final BG i = this.b("rotationPointZ", true, Float.TYPE);
    private static int a;

    public hB() {
        super(A5.dZ);
        this.l = this.b("showModel", true, Boolean.TYPE);
        this.e = this.b("isHidden", true, Boolean.TYPE);
    }

    private float g(Object object) {
        return this.d.b(object);
    }

    private float i(Object object) {
        return this.m.b(object);
    }

    private float c(Object object) {
        return this.j.b(object);
    }

    private float e(Object object) {
        return this.f.b(object);
    }

    private float a(Object object) {
        return this.g.b(object);
    }

    private float f(Object object) {
        return this.k.b(object);
    }

    private float b(Object object) {
        return this.n.b(object);
    }

    private float d(Object object) {
        return this.h.b(object);
    }

    private float h(Object object) {
        return this.i.b(object);
    }

    private void a(Object object, boolean bl) {
        this.l.a(object, bl);
    }

    private void b(Object object, boolean bl) {
        this.e.a(object, bl);
    }

    static float d(hB hB2, Object object) {
        return hB2.g(object);
    }

    static float f(hB hB2, Object object) {
        return hB2.i(object);
    }

    static float a(hB hB2, Object object) {
        return hB2.c(object);
    }

    static float c(hB hB2, Object object) {
        return hB2.e(object);
    }

    static float g(hB hB2, Object object) {
        return hB2.a(object);
    }

    static float b(hB hB2, Object object) {
        return hB2.f(object);
    }

    static float i(hB hB2, Object object) {
        return hB2.b(object);
    }

    static float h(hB hB2, Object object) {
        return hB2.d(object);
    }

    static float e(hB hB2, Object object) {
        return hB2.h(object);
    }

    static void b(hB hB2, Object object, boolean bl) {
        hB2.a(object, bl);
    }

    static void a(hB hB2, Object object, boolean bl) {
        hB2.b(object, bl);
    }

    public static void a(int n6) {
        a = n6;
    }

    public static int f() {
        return a;
    }

    public static int e() {
        int n6 = hB.f();
        if (n6 == 0) {
            return 18;
        }
        return 0;
    }

    private static CodeAttribute$RuntimeCopyException a(CodeAttribute$RuntimeCopyException codeAttribute$RuntimeCopyException) {
        return codeAttribute$RuntimeCopyException;
    }

    static {
        if (hB.f() != 0) {
            hB.a(83);
        }
    }
}

