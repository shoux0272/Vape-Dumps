/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import javassist.bytecode.CodeAttribute$RuntimeCopyException;
import manthe.A5;
import manthe.bP;
import manthe.gJ;

public class ko
extends gJ {
    private final bP a = this.a("isOpen", false, Boolean.TYPE, new Class[0]);
    private static boolean d;

    public ko() {
        super(A5.f);
    }

    private boolean a(Object object) {
        return this.a.h(object, new Object[0]);
    }

    static boolean a(ko ko2, Object object) {
        return ko2.a(object);
    }

    public static void b(boolean bl) {
        d = bl;
    }

    public static boolean f() {
        return d;
    }

    public static boolean e() {
        boolean bl = ko.f();
        return !bl;
    }

    private static CodeAttribute$RuntimeCopyException a(CodeAttribute$RuntimeCopyException codeAttribute$RuntimeCopyException) {
        return codeAttribute$RuntimeCopyException;
    }

    static {
        if (ko.f()) {
            ko.b(true);
        }
    }
}

