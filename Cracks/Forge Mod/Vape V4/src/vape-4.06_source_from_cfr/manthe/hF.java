/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import javassist.bytecode.CodeAttribute$RuntimeCopyException;
import manthe.A5;
import manthe.bP;
import manthe.gJ;

public class hF
extends gJ {
    private final bP a = this.a("getGameProfile", true, A5.al, new Class[0]);
    private final bP d = this.a("getResponseTime", true, Integer.TYPE, new Class[0]);
    private static boolean e;

    public hF() {
        super(A5.T);
    }

    private Object a(Object object) {
        return this.a.e(object, new Object[0]);
    }

    private int b(Object object) {
        return this.d.o(object, new Object[0]);
    }

    static Object a(hF hF2, Object object) {
        return hF2.a(object);
    }

    static int b(hF hF2, Object object) {
        return hF2.b(object);
    }

    public static void b(boolean bl) {
        e = bl;
    }

    public static boolean d() {
        return e;
    }

    public static boolean e() {
        boolean bl = hF.d();
        return !bl;
    }

    private static CodeAttribute$RuntimeCopyException a(CodeAttribute$RuntimeCopyException codeAttribute$RuntimeCopyException) {
        return codeAttribute$RuntimeCopyException;
    }

    static {
        if (!hF.e()) {
            hF.b(true);
        }
    }
}

