/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import javassist.bytecode.CodeAttribute$RuntimeCopyException;
import manthe.A5;
import manthe.bO;
import manthe.td;
import manthe.th;

public class bi
extends bO {
    private static int b;

    public bi() {
        th.b(A5.ba);
        th.b(A5.bT);
        th.b(A5.cC);
        th.b(A5.cF);
        this.a.add(new td());
    }

    public static void b(int n6) {
        b = n6;
    }

    public static int c() {
        return b;
    }

    public static int d() {
        int n6 = bi.c();
        if (n6 == 0) {
            return 54;
        }
        return 0;
    }

    private static CodeAttribute$RuntimeCopyException a(CodeAttribute$RuntimeCopyException codeAttribute$RuntimeCopyException) {
        return codeAttribute$RuntimeCopyException;
    }

    static {
        if (bi.c() != 0) {
            bi.b(4);
        }
    }
}

