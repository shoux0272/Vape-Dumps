/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import javassist.bytecode.CodeAttribute$RuntimeCopyException;
import manthe.mq;
import manthe.on;
import manthe.pJ;
import manthe.u9;
import manthe.uV;

public class qY
implements u9 {
    private String a;
    private boolean e;
    private pJ d;
    private uV b = new uV();
    private static int c;

    public qY(String string) {
        this(string, pJ.INFO, false);
    }

    public qY(String string, boolean bl) {
        this(string, pJ.INFO, bl);
    }

    public qY(String string, pJ pJ2) {
        this(string, pJ2, false);
    }

    public qY(String string, pJ pJ2, boolean bl) {
        this.a = string == null ? "null" : string;
        this.d = pJ2;
        this.e = bl;
    }

    @Override
    public double a() {
        String[] arrstring;
        mq mq2 = on.p.j();
        double d10 = 0.0;
        for (String string : arrstring = this.a.split("\n")) {
            d10 += mq2.a(string) + 3.0;
        }
        return (d10 + 4.0) * 0.9;
    }

    @Override
    public double b() {
        String[] arrstring;
        mq mq2 = on.p.j();
        double d10 = 0.0;
        for (String string : arrstring = this.a.split("\n")) {
            double d11 = mq2.b(string);
            if (!(d11 > d10)) continue;
            d10 = d11;
        }
        return (d10 + 2.0) * 0.9;
    }

    @Override
    public void a(double d10, double d11) {
        mq mq2 = on.p.a(0.9);
        String[] arrstring = this.a.split("\n");
        double d12 = d11;
        for (String string : arrstring) {
            if (this.e) {
                mq2.a(string, d10, d12, this.b.r);
            } else {
                mq2.c(string, d10, d12, this.b.r);
            }
            d12 += mq2.a(string) + 3.0;
        }
    }

    public static void b(int n6) {
        c = n6;
    }

    public static int d() {
        return c;
    }

    public static int c() {
        int n6 = qY.d();
        if (n6 == 0) {
            return 99;
        }
        return 0;
    }

    private static CodeAttribute$RuntimeCopyException a(CodeAttribute$RuntimeCopyException codeAttribute$RuntimeCopyException) {
        return codeAttribute$RuntimeCopyException;
    }

    static {
        if (qY.d() != 0) {
            qY.b(4);
        }
    }
}

