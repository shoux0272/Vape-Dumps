/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import a.a;
import javassist.bytecode.CodeAttribute$RuntimeCopyException;

public class V {
    public static int c = 0;
    private static int b;

    public static int c() {
        if (c != 0) {
            return c;
        }
        c = a.gmv();
        return c;
    }

    static {
        V.b(0);
    }

    public static void b(int n6) {
        b = n6;
    }

    public static int b() {
        return b;
    }

    public static int d() {
        int n6 = V.b();
        if (n6 == 0) {
            return 104;
        }
        return 0;
    }

    private static CodeAttribute$RuntimeCopyException a(CodeAttribute$RuntimeCopyException codeAttribute$RuntimeCopyException) {
        return codeAttribute$RuntimeCopyException;
    }
}

