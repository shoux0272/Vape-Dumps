/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.mq;
import manthe.uW;
import manthe.wM;

public class xZ
extends wM {
    protected String A;
    protected double z;
    private static String[] B;

    public xZ(String string, double d10) {
        this.A = string;
        this.z = d10;
    }

    public xZ(String string) {
        this(string, 0.75);
    }

    @Override
    public void a() {
        mq mq2 = this.e(this.z);
        double d10 = mq2.a(this.A);
        double d11 = this.c() + this.f() / 2.0 - d10 / 2.0;
        mq2.a(this.A, this.d() + 5.0, d11, xZ.b.s);
    }

    @Override
    public void k() {
    }

    @Override
    public void j() {
    }

    @Override
    public void a(uW uW2) {
    }

    @Override
    public void i() {
    }

    @Override
    public double g() {
        return 110.0;
    }

    @Override
    public double h() {
        return 15.0;
    }

    public static void b(String[] arrstring) {
        B = arrstring;
    }

    public static String[] l() {
        return B;
    }

    static {
        if (xZ.l() != null) {
            xZ.b(new String[1]);
        }
    }
}

