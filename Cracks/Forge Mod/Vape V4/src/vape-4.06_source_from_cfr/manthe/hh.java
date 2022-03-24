/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import javassist.bytecode.CodeAttribute$RuntimeCopyException;
import manthe.A5;
import manthe.BG;
import manthe.gJ;

public class hh
extends gJ {
    private final BG a = this.b("phase", false, A5.dw);
    private static boolean d;

    public hh() {
        super(A5.ce);
    }

    private Object a(Object object) {
        return this.a.f(object);
    }

    static Object a(hh hh2, Object object) {
        return hh2.a(object);
    }

    public static void b(boolean bl) {
        d = bl;
    }

    public static boolean f() {
        return d;
    }

    public static boolean e() {
        boolean bl = hh.f();
        return !bl;
    }

    private static CodeAttribute$RuntimeCopyException a(CodeAttribute$RuntimeCopyException codeAttribute$RuntimeCopyException) {
        return codeAttribute$RuntimeCopyException;
    }

    static {
        if (hh.f()) {
            hh.b(true);
        }
    }
}

