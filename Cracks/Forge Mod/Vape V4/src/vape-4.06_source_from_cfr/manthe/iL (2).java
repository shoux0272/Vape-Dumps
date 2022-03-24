/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import javassist.bytecode.CodeAttribute$RuntimeCopyException;
import manthe.A5;
import manthe.BG;
import manthe.V;
import manthe.gJ;

public class iL
extends gJ {
    private final BG e;
    private final BG a;
    private static int d;

    public iL() {
        super(A5.a0);
        if (V.c() >= 23) {
            this.e = this.a("WOODEN_SWORD", true, A5.cg);
            this.a = this.a("POTIONITEM", true, A5.dx);
        } else {
            this.e = this.a("wooden_sword", true, A5.cg);
            this.a = this.a("potionitem", true, A5.dx);
        }
    }

    private Object d() {
        return this.e.f(null);
    }

    private Object f() {
        return this.a.f(null);
    }

    static Object b(iL iL2) {
        return iL2.d();
    }

    static Object a(iL iL2) {
        return iL2.f();
    }

    public static void a(int n6) {
        d = n6;
    }

    public static int g() {
        return d;
    }

    public static int e() {
        int n6 = iL.g();
        if (n6 == 0) {
            return 87;
        }
        return 0;
    }

    private static CodeAttribute$RuntimeCopyException a(CodeAttribute$RuntimeCopyException codeAttribute$RuntimeCopyException) {
        return codeAttribute$RuntimeCopyException;
    }

    static {
        if (iL.g() != 0) {
            iL.a(48);
        }
    }
}

