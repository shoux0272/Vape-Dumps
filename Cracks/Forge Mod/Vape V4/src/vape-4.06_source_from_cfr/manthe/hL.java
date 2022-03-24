/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import javassist.bytecode.CodeAttribute$RuntimeCopyException;
import manthe.A5;
import manthe.V;
import manthe.bP;
import manthe.gJ;

public class hL
extends gJ {
    private final bP a = V.c() == 13 ? this.b("func_147046_a", false, Void.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Float.TYPE, Float.TYPE, A5.cF) : this.b("drawEntityOnScreen", true, Void.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Float.TYPE, Float.TYPE, A5.cF);
    private static int d;

    public hL() {
        super(A5.ag);
    }

    public void a(int n6, int n10, int n11, float f10, float f11, Object object) {
        this.a.p(null, n6, n10, n11, Float.valueOf(f10), Float.valueOf(f11), object);
    }

    public static void a(int n6) {
        d = n6;
    }

    public static int f() {
        return d;
    }

    public static int e() {
        int n6 = hL.f();
        if (n6 == 0) {
            return 43;
        }
        return 0;
    }

    private static CodeAttribute$RuntimeCopyException a(CodeAttribute$RuntimeCopyException codeAttribute$RuntimeCopyException) {
        return codeAttribute$RuntimeCopyException;
    }

    static {
        if (hL.f() != 0) {
            hL.a(116);
        }
    }
}

