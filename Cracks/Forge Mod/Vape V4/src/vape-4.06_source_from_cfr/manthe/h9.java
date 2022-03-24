/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import javassist.bytecode.CodeAttribute$RuntimeCopyException;
import manthe.A5;
import manthe.BG;
import manthe.gJ;

public class h9
extends gJ {
    private final BG a = this.b("username", false, String.class);
    private final BG e = this.b("displayname", false, String.class);
    private static boolean d;

    public h9() {
        super(A5.d4);
    }

    public String a(Object object) {
        return this.a.f(object).toString();
    }

    public String b(Object object) {
        return this.a.f(object).toString();
    }

    public void a(Object object, String string) {
        this.e.a(object, string);
    }

    public static void b(boolean bl) {
        d = bl;
    }

    public static boolean f() {
        return d;
    }

    public static boolean e() {
        boolean bl = h9.f();
        return !bl;
    }

    private static CodeAttribute$RuntimeCopyException a(CodeAttribute$RuntimeCopyException codeAttribute$RuntimeCopyException) {
        return codeAttribute$RuntimeCopyException;
    }

    static {
        if (!h9.e()) {
            h9.b(true);
        }
    }
}

