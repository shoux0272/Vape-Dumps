/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import javassist.bytecode.CodeAttribute$RuntimeCopyException;
import manthe.c2;

public class uW {
    private int c;
    private int e;
    private c2 d;
    private static boolean b;

    public uW(int n6, int n10, c2 c22) {
        this.c = n6;
        this.e = n10;
        this.d = c22;
    }

    public int b() {
        return this.e;
    }

    public int a() {
        return this.c;
    }

    public c2 c() {
        return this.d;
    }

    public String toString() {
        return String.format("[%s, %s]: %s", new Object[]{this.a(), this.b(), this.c()});
    }

    public static void b(boolean bl) {
        b = bl;
    }

    public static boolean e() {
        return b;
    }

    public static boolean d() {
        boolean bl = uW.e();
        return !bl;
    }

    private static CodeAttribute$RuntimeCopyException a(CodeAttribute$RuntimeCopyException codeAttribute$RuntimeCopyException) {
        return codeAttribute$RuntimeCopyException;
    }

    static {
        if (uW.e()) {
            uW.b(true);
        }
    }
}

