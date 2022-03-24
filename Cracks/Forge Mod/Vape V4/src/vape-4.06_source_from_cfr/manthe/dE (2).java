/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.util.Set;
import manthe.dX;
import manthe.fG;
import manthe.fI;
import manthe.fM;
import manthe.fQ;
import manthe.gz;
import manthe.hr;

public class dE
extends dX {
    public dE(Object object) {
        super(object);
    }

    public static gz q() {
        return new gz(dE.a.M().bz.d());
    }

    public fI l() {
        return new fI(dE.a.M().bz.g(this.b));
    }

    public fQ a(int n6, int n10) {
        return new fQ(hr.a(dE.a.M().bz, this.b, n6, n10));
    }

    public void c(boolean bl) {
        hr.a(dE.a.M().bz, this.b, bl);
    }

    public void d(boolean bl) {
        hr.c(dE.a.M().bz, this.b, bl);
    }

    public int m() {
        return hr.d(dE.a.M().bz, this.b);
    }

    public int p() {
        return hr.b(dE.a.M().bz, this.b);
    }

    public int n() {
        return hr.e(dE.a.M().bz, this.b);
    }

    public int j() {
        return hr.f(dE.a.M().bz, this.b);
    }

    public fG k() {
        return new fG(hr.c(dE.a.M().bz, this.b));
    }

    public void a(fG fG2) {
        hr.b(dE.a.M().bz, this.b, fG2.a());
    }

    public void a(fQ fQ2, int n6, int n10, int n11) {
        hr.a(dE.a.M().bz, this.b, fQ2.a(), n6, n10, n11);
    }

    public void a(fQ fQ2, int n6, int n10, fM fM2) {
        hr.a(dE.a.M().bz, this.b, fQ2.a(), n6, n10, fM2.a());
    }

    public void a(fQ fQ2) {
        hr.a(dE.a.M().bz, this.b, fQ2.a());
    }

    public void a(long l) {
        hr.a(dE.a.M().bz, this.b, l);
    }

    public void c(int n6) {
        hr.c(dE.a.M().bz, this.b, n6);
    }

    public void a(boolean bl) {
        hr.b(dE.a.M().bz, this.b, bl);
    }

    public void a(int n6) {
        hr.a(dE.a.M().bz, this.b, n6);
    }

    public Set o() {
        return hr.a(dE.a.M().bz, this.b);
    }

    public void b(int n6) {
        hr.b(dE.a.M().bz, this.b, n6);
    }
}

