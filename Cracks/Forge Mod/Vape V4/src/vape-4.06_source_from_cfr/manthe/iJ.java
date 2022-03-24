/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import javassist.bytecode.CodeAttribute$RuntimeCopyException;
import manthe.A5;
import manthe.BG;
import manthe.V;
import manthe.bP;
import manthe.gJ;

public class iJ
extends gJ {
    private BG d;
    private bP e;
    private static int a;

    public iJ() {
        super(A5.aX);
        if (V.c() >= 23) {
            this.e = this.a("getPotion", true, A5.bT, new Class[0]);
        } else {
            this.d = this.b("potionDamage", true, A5.bT);
        }
    }

    private Object a(Object object) {
        if (V.c() >= 23) {
            return this.e.e(object, new Object[0]);
        }
        return this.d.f(object);
    }

    static Object a(iJ iJ2, Object object) {
        return iJ2.a(object);
    }

    public static void a(int n6) {
        a = n6;
    }

    public static int f() {
        return a;
    }

    public static int e() {
        int n6 = iJ.f();
        if (n6 == 0) {
            return 125;
        }
        return 0;
    }

    private static CodeAttribute$RuntimeCopyException a(CodeAttribute$RuntimeCopyException codeAttribute$RuntimeCopyException) {
        return codeAttribute$RuntimeCopyException;
    }

    static {
        if (iJ.e() == 0) {
            iJ.a(42);
        }
    }
}

