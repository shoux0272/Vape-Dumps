/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import javassist.bytecode.CodeAttribute$RuntimeCopyException;
import manthe.B;
import manthe.CQ;
import manthe.I;
import manthe.ds;
import manthe.ke;
import manthe.y5;

public class yq
extends y5 {
    public static yq u;
    private I v;
    private static boolean w;

    public yq() {
        super("AM", 0, CQ.b);
        u = this;
        new B(this).start();
        this.d(true);
    }

    @Override
    public void b(ke ke2) {
        if (this.v != null && ds.k().d()) {
            this.v.a(ke2);
        }
    }

    public boolean V() {
        return this.v != null && !this.v.e();
    }

    public I S() {
        return this.v;
    }

    public void a(I i10) {
        this.d(true);
        this.v = i10;
    }

    static I a(yq yq2) {
        return yq2.v;
    }

    static I a(yq yq2, I i10) {
        yq2.v = i10;
        return yq2.v;
    }

    public static void e(boolean bl) {
        w = bl;
    }

    public static boolean T() {
        return w;
    }

    public static boolean U() {
        boolean bl = yq.T();
        return !bl;
    }

    private static CodeAttribute$RuntimeCopyException a(CodeAttribute$RuntimeCopyException codeAttribute$RuntimeCopyException) {
        return codeAttribute$RuntimeCopyException;
    }

    static {
        if (yq.T()) {
            yq.e(true);
        }
    }
}

