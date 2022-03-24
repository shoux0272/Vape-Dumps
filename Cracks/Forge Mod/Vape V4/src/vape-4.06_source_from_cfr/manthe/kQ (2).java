/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import javassist.bytecode.CodeAttribute$RuntimeCopyException;
import manthe.A5;
import manthe.V;
import manthe.bP;
import manthe.gJ;

public class kQ
extends gJ {
    private final bP a = V.c() >= 23 ? this.a("func_191062_e", false, Boolean.TYPE, Integer.TYPE, Integer.TYPE) : this.a("chunkExists", true, Boolean.TYPE, Integer.TYPE, Integer.TYPE);
    private static int d;

    public kQ() {
        super(A5.at);
    }

    public boolean a(Object object, int n6, int n10) {
        return this.a.h(object, n6, n10);
    }

    public static void a(int n6) {
        d = n6;
    }

    public static int f() {
        return d;
    }

    public static int e() {
        int n6 = kQ.f();
        if (n6 == 0) {
            return 66;
        }
        return 0;
    }

    private static CodeAttribute$RuntimeCopyException a(CodeAttribute$RuntimeCopyException codeAttribute$RuntimeCopyException) {
        return codeAttribute$RuntimeCopyException;
    }

    static {
        if (kQ.e() == 0) {
            kQ.a(124);
        }
    }
}

