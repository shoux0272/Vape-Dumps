/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import javassist.bytecode.CodeAttribute$RuntimeCopyException;
import manthe.on;

public class cy {
    public static on a = on.p;
    public static boolean c;
    protected final Object b;
    private static boolean d;

    public cy(Object object) {
        if (object instanceof cy) {
            cy cy2 = (cy)object;
            this.b = cy2.a();
            return;
        }
        this.b = object;
    }

    public Object a() {
        return this.b;
    }

    public boolean equals(Object object) {
        if (object == null || this.b == null) {
            return false;
        }
        if (object instanceof cy) {
            cy cy2 = (cy)object;
            return this.b.equals(cy2.b);
        }
        return super.equals(object);
    }

    public boolean e() {
        return this.b == null;
    }

    public boolean d() {
        return !this.e();
    }

    public boolean a(Class class_) {
        return this.d() && class_ != null && class_.isInstance(this.b);
    }

    public String toString() {
        if (this.b == null) {
            return "Null instance";
        }
        return this.b.toString();
    }

    static {
        cy.b(false);
        c = a.h();
    }

    public static void b(boolean bl) {
        d = bl;
    }

    public static boolean b() {
        return d;
    }

    public static boolean c() {
        boolean bl = cy.b();
        return !bl;
    }

    private static CodeAttribute$RuntimeCopyException a(CodeAttribute$RuntimeCopyException codeAttribute$RuntimeCopyException) {
        return codeAttribute$RuntimeCopyException;
    }
}

