/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import javassist.bytecode.CodeAttribute$RuntimeCopyException;
import manthe.Bp;
import manthe.Cj;
import manthe.ai;
import manthe.qd;

public class D_ {
    private String c;
    private qd a;
    private static int b;

    public qd a() {
        return this.a;
    }

    public qd a(String string) {
        this.a = new ai().a(string);
        if (this.a != null) {
            this.c = string;
        }
        return this.a;
    }

    public Cj b() {
        if (this.c == null) {
            return null;
        }
        return new Bp().a(this.c);
    }

    public static void b(int n6) {
        b = n6;
    }

    public static int d() {
        return b;
    }

    public static int c() {
        int n6 = D_.d();
        if (n6 == 0) {
            return 44;
        }
        return 0;
    }

    private static CodeAttribute$RuntimeCopyException a(CodeAttribute$RuntimeCopyException codeAttribute$RuntimeCopyException) {
        return codeAttribute$RuntimeCopyException;
    }

    static {
        if (D_.c() != 0) {
            D_.b(51);
        }
    }
}

