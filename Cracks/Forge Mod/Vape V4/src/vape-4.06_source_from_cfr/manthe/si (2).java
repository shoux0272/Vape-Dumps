/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import a.a;
import a.c;
import javassist.bytecode.CodeAttribute$RuntimeCopyException;
import manthe.oz;
import manthe.qE;

public abstract class si
implements oz {
    private final Class c;
    private qE a;
    private static boolean b;

    public si(String string, int n6) {
        this.c = a.a.gc(string);
        a.c.reg(this.c, n6);
    }

    public si(Class class_, int n6) {
        this.c = class_;
        a.c.reg(this.c, n6);
    }

    @Override
    public abstract void a(Object var1);

    @Override
    public Class a() {
        return this.c;
    }

    public qE d() {
        return this.a;
    }

    public void a(qE qE2) {
        this.a = qE2;
    }

    public static void b(boolean bl) {
        b = bl;
    }

    public static boolean e() {
        return b;
    }

    public static boolean c() {
        boolean bl = si.e();
        return !bl;
    }

    private static CodeAttribute$RuntimeCopyException a(CodeAttribute$RuntimeCopyException codeAttribute$RuntimeCopyException) {
        return codeAttribute$RuntimeCopyException;
    }

    static {
        if (!si.e()) {
            si.b(true);
        }
    }
}

