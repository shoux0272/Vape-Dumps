/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import javassist.bytecode.CodeAttribute$RuntimeCopyException;
import manthe.A5;
import manthe.BG;
import manthe.V;
import manthe.gJ;

public class iO
extends gJ {
    private final BG d = V.c() >= 23 ? this.a("SEARCH", true, A5.dy) : this.a("tabAllSearch", true, A5.dy);
    private static boolean a;

    public iO() {
        super(A5.dy);
    }

    public Object e() {
        return this.d.f(null);
    }

    public static void b(boolean bl) {
        a = bl;
    }

    public static boolean d() {
        return a;
    }

    public static boolean f() {
        boolean bl = iO.d();
        return !bl;
    }

    private static CodeAttribute$RuntimeCopyException a(CodeAttribute$RuntimeCopyException codeAttribute$RuntimeCopyException) {
        return codeAttribute$RuntimeCopyException;
    }

    static {
        if (iO.f()) {
            iO.b(true);
        }
    }
}

