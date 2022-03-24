/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import javassist.bytecode.CodeAttribute$RuntimeCopyException;
import manthe.ds;
import manthe.kl;

public class la
extends kl {
    static float d = 0.0f;
    static float f = 0.0f;
    private static int e;

    @Override
    public boolean fire() {
        float f10 = ds.O().g();
        f += 1.0f;
        if (f10 != d && f >= 10.0f) {
            f = 0.0f;
        }
        if (f > 0.0f) {
            this.a(true);
        }
        d = f10;
        return super.fire();
    }

    static {
        la.b(27);
    }

    public static void b(int n6) {
        e = n6;
    }

    public static int f() {
        return e;
    }

    public static int e() {
        int n6 = la.f();
        if (n6 == 0) {
            return 83;
        }
        return 0;
    }

    private static CodeAttribute$RuntimeCopyException a(CodeAttribute$RuntimeCopyException codeAttribute$RuntimeCopyException) {
        return codeAttribute$RuntimeCopyException;
    }
}

