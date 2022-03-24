/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import javassist.bytecode.CodeAttribute$RuntimeCopyException;
import manthe.A5;
import manthe.V;
import manthe.bO;
import manthe.on;
import manthe.th;

public class bn
extends bO {
    private static boolean b;

    public bn() {
        if (!on.p.h()) {
            th.b(A5.u);
            th.b(A5.aH);
            th.b(A5.b4);
            th.b(A5.bS);
            th.b(A5.bd);
            th.b(A5.b6);
            if (V.c() > 13) {
                th.b(A5.bC);
                th.b(A5.b8);
                th.b(A5.ao);
                th.b(A5.aY);
            }
        }
    }

    public static void b(boolean bl) {
        b = bl;
    }

    public static boolean c() {
        return b;
    }

    public static boolean d() {
        boolean bl = bn.c();
        return !bl;
    }

    private static CodeAttribute$RuntimeCopyException a(CodeAttribute$RuntimeCopyException codeAttribute$RuntimeCopyException) {
        return codeAttribute$RuntimeCopyException;
    }

    static {
        if (!bn.d()) {
            bn.b(true);
        }
    }
}

