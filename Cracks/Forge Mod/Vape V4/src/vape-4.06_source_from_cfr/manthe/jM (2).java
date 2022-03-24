/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import javassist.bytecode.CodeAttribute$RuntimeCopyException;
import manthe.A5;
import manthe.bP;
import manthe.gJ;

public class jM
extends gJ {
    private final bP a = this.a("tagCount", true, Integer.TYPE, new Class[0]);
    private final bP e = this.a("getCompoundTagAt", true, A5.au, Integer.TYPE);
    private static boolean d;

    public jM() {
        super(A5.dv);
    }

    private int a(Object object) {
        return this.a.o(object, new Object[0]);
    }

    private Object a(Object object, int n6) {
        return this.e.e(object, n6);
    }

    static int a(jM jM2, Object object) {
        return jM2.a(object);
    }

    static Object a(jM jM2, Object object, int n6) {
        return jM2.a(object, n6);
    }

    public static void b(boolean bl) {
        d = bl;
    }

    public static boolean f() {
        return d;
    }

    public static boolean e() {
        boolean bl = jM.f();
        return !bl;
    }

    private static CodeAttribute$RuntimeCopyException a(CodeAttribute$RuntimeCopyException codeAttribute$RuntimeCopyException) {
        return codeAttribute$RuntimeCopyException;
    }

    static {
        if (!jM.f()) {
            jM.b(true);
        }
    }
}

