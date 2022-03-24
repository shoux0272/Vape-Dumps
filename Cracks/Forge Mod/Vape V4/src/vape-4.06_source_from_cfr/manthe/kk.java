/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import javassist.bytecode.CodeAttribute$RuntimeCopyException;
import manthe.A5;
import manthe.BG;
import manthe.gJ;

public class kk
extends gJ {
    private final BG a = this.a("configRenderResMul", false, Float.TYPE);
    private static int d;

    public kk() {
        super(A5.dR);
    }

    private float e() {
        return this.a.b(null);
    }

    static float a(kk kk2) {
        return kk2.e();
    }

    public static void a(int n6) {
        d = n6;
    }

    public static int d() {
        return d;
    }

    public static int f() {
        int n6 = kk.d();
        if (n6 == 0) {
            return 18;
        }
        return 0;
    }

    private static CodeAttribute$RuntimeCopyException a(CodeAttribute$RuntimeCopyException codeAttribute$RuntimeCopyException) {
        return codeAttribute$RuntimeCopyException;
    }

    static {
        if (kk.d() != 0) {
            kk.a(56);
        }
    }
}

