/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import javassist.bytecode.CodeAttribute$RuntimeCopyException;
import manthe.cv;
import manthe.kl;

public class l9
extends kl {
    private final cv e;
    private static boolean d;

    public l9(cv cv2) {
        this.e = cv2;
    }

    public cv getForgeEvent() {
        return this.e;
    }

    public static void b(boolean bl) {
        d = bl;
    }

    public static boolean e() {
        return d;
    }

    public static boolean f() {
        boolean bl = l9.e();
        return !bl;
    }

    private static CodeAttribute$RuntimeCopyException a(CodeAttribute$RuntimeCopyException codeAttribute$RuntimeCopyException) {
        return codeAttribute$RuntimeCopyException;
    }

    static {
        if (l9.f()) {
            l9.b(true);
        }
    }
}

