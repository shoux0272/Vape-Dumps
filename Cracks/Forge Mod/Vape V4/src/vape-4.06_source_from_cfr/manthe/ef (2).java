/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.cy;
import manthe.ds;
import manthe.ej;
import manthe.ex;
import manthe.ez;
import manthe.iV;

public class ef
extends cy {
    private static double g;
    private static double f;
    private static double e;

    public ef(Object object) {
        super(object);
    }

    public static void l() {
        ej ej2 = ds.B();
        float f10 = ds.O().g();
        g = ej2.T() + (ej2.z() - ej2.T()) * (double)f10;
        f = ej2.R() + (ej2.l() - ej2.R()) * (double)f10;
        e = ej2.X() + (ej2.g() - ej2.X()) * (double)f10;
    }

    public static ef k() {
        return new ef(iV.a(ef.a.M().aQ));
    }

    public double m() {
        return g;
    }

    public double n() {
        return f;
    }

    public double j() {
        return e;
    }

    public float g() {
        return iV.b(ef.a.M().aQ, this.b);
    }

    public float i() {
        return iV.d(ef.a.M().aQ, this.b);
    }

    public double h() {
        return iV.c(ef.a.M().aQ, this.b);
    }

    public double o() {
        return iV.e(ef.a.M().aQ, this.b);
    }

    public double f() {
        return iV.a(ef.a.M().aQ, this.b);
    }

    public ez a(ex ex2) {
        return new ez(iV.a(ef.a.M().aQ, this.b, ex2.a()));
    }
}

