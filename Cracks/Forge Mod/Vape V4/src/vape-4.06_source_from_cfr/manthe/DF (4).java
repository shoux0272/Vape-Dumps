/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.Ds;
import manthe.sV;

public class DF
extends Ds<Double, sV> {
    private double l = 0.01;

    public DF(Object object, String string, sV sV2) {
        super(object, string, sV2);
    }

    public static DF a(Object object, String string, String string2, String string3, String string4, double d10, double d11, double d12) {
        sV sV2 = new sV(d12, d10, 0.01, string3, string4, string2);
        sV2.c(100.0);
        sV2.b(7.0);
        sV2.f(d11);
        DF dF2 = new DF(object, string, sV2);
        dF2.a(d11);
        sV2.a(dF2);
        return dF2;
    }

    public static DF a(Object object, String string, String string2, String string3, double d10, double d11, double d12, double d13, String string4) {
        sV sV2 = new sV(d12, d10, d13, string2, " " + string3, string);
        sV2.c(100.0);
        sV2.b(7.0);
        sV2.f(d11);
        DF dF2 = new DF(object, string, sV2);
        dF2.a(d11);
        dF2.l = d13;
        sV2.a(dF2);
        sV2.b(string4);
        return dF2;
    }

    public static DF a(Object object, String string, String string2, String string3, double d10, double d11, double d12, double d13) {
        sV sV2 = new sV(d12, d10, d13, string2, " " + string3, string);
        sV2.c(100.0);
        sV2.b(7.0);
        sV2.f(d11);
        DF dF2 = new DF(object, string, sV2);
        dF2.a(d11);
        dF2.l = d13;
        sV2.a(dF2);
        return dF2;
    }

    public static DF a(Object object, String string, String string2, String string3, double d10, double d11, double d12, String string4) {
        sV sV2 = new sV(d12, d10, 0.01, string2, " " + string3, string);
        sV2.c(100.0);
        sV2.b(7.0);
        sV2.f(d11);
        DF dF2 = new DF(object, string, sV2);
        dF2.a(d11);
        sV2.a(dF2);
        sV2.b(string4);
        return dF2;
    }

    public static DF a(Object object, String string, String string2, String string3, double d10, double d11, double d12) {
        sV sV2 = new sV(d12, d10, 0.01, string2, " " + string3, string);
        sV2.c(100.0);
        sV2.b(7.0);
        sV2.f(d11);
        DF dF2 = new DF(object, string, sV2);
        sV2.a(dF2);
        dF2.a(d11);
        return dF2;
    }

    public double r() {
        return this.l;
    }

    public Double a() {
        return ((sV)this.c()).B();
    }

    @Override
    public void b(Double d10) {
        if (this.b() == null) {
            this.a(d10);
        }
        if (d10 > ((sV)this.c()).C()) {
            this.b(((sV)this.c()).C());
        } else if (d10 < ((sV)this.c()).D()) {
            this.b(((sV)this.c()).D());
        }
        ((sV)this.c()).f(d10);
        this.d();
    }

    @Override
    public void a(String string) {
        this.b(Double.parseDouble(string));
    }

    @Override
    public void a(Double d10) {
        ((sV)this.c()).g(d10);
        this.d();
    }
}

