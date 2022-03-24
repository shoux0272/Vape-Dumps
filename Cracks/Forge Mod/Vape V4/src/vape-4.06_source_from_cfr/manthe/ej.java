/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.util.Collection;
import manthe.V;
import manthe.e6;
import manthe.eY;
import manthe.ev;
import manthe.ex;
import manthe.fE;
import manthe.fG;
import manthe.fX;
import manthe.gK;
import manthe.gM;
import manthe.gS;
import manthe.gb;
import manthe.it;

public class ej
extends ex {
    private static int[] f;

    public ej(Object object) {
        super(object);
    }

    public static e6 aI() {
        return new e6(it.a(ej.a.M().aL));
    }

    public static ej b(gS gS2) {
        return new ej(it.p(ej.a.M().aL, gS2.a()));
    }

    public float az() {
        return it.m(ej.a.M().aL, this.b);
    }

    public void aC() {
        it.s(ej.a.M().aL, this.b);
    }

    public float aD() {
        return it.t(ej.a.M().aL, this.b);
    }

    public float aR() {
        return ej.a.M().aL.x(this.b);
    }

    public int aK() {
        return it.e(ej.a.M().aL, this.b);
    }

    public int aN() {
        return it.k(ej.a.M().aL, this.b);
    }

    public void e(int n6) {
        it.b(ej.a.M().aL, this.b, n6);
    }

    public gK m(float f10) {
        return new gK(ej.a.M().aL.d(this.b, f10));
    }

    public gK o(float f10) {
        return new gK(ej.a.M().aL.g(this.b, f10));
    }

    public boolean c(ex ex2) {
        return ej.a.M().aL.f(this.b, ex2.a());
    }

    public gb a(double d10, float f10) {
        return new gb(ej.a.M().aL.a(this.b, d10, f10));
    }

    public boolean a(fX fX2) {
        return it.a(ej.a.M().aL, this.b, fX2.a());
    }

    public fE b(fX fX2) {
        return new fE(it.b(ej.a.M().aL, this.b, fX2.a()));
    }

    public void aE() {
    }

    public float ay() {
        return it.c(ej.a.M().aL, this.b);
    }

    public void k(float f10) {
        it.f(ej.a.M().aL, this.b, f10);
    }

    public float aF() {
        return it.r(ej.a.M().aL, this.b);
    }

    public void n(float f10) {
        it.d(ej.a.M().aL, this.b, f10);
    }

    public fG aG() {
        return new fG(it.l(ej.a.M().aL, this.b));
    }

    public void aO() {
        if (V.c() >= 23) {
            it.e(ej.a.M().aL, this.b, gM.f().a());
            return;
        }
        it.i(ej.a.M().aL, this.b);
    }

    public ev a(eY eY2) {
        return new ev(it.d(ej.a.M().aL, this.b, eY2.a()));
    }

    public Object aw() {
        return it.h(ej.a.M().aL, this.b);
    }

    public float aP() {
        return it.b(ej.a.M().aL, this.b);
    }

    public void r(float f10) {
        it.c(ej.a.M().aL, this.b, f10);
    }

    public float av() {
        return ej.a.M().aL.s(this.b);
    }

    public float ax() {
        return ej.a.M().aL.b(this.b);
    }

    public void a(fE fE2) {
        it.f(ej.a.M().aL, this.b, fE2.a());
    }

    public void f(int n6) {
        if (V.c() >= 23) {
            it.c(ej.a.M().aL, this.b, fX.a(n6).a());
            return;
        }
        it.a(ej.a.M().aL, this.b, n6);
    }

    public boolean aM() {
        return it.n(ej.a.M().aL, this.b);
    }

    public boolean aQ() {
        return it.o(ej.a.M().aL, this.b);
    }

    public float at() {
        return it.j(ej.a.M().aL, this.b);
    }

    public float aA() {
        return it.q(ej.a.M().aL, this.b);
    }

    public void l(float f10) {
        it.e(ej.a.M().aL, this.b, f10);
    }

    public float aL() {
        return it.d(ej.a.M().aL, this.b);
    }

    public void p(float f10) {
        it.a(ej.a.M().aL, this.b, f10);
    }

    public float au() {
        return it.a(ej.a.M().aL, this.b);
    }

    public void q(float f10) {
        it.b(ej.a.M().aL, this.b, f10);
    }

    public float aH() {
        return it.g(ej.a.M().aL, this.b);
    }

    public Collection aJ() {
        return (Collection)it.f(ej.a.M().aL, this.b);
    }

    public static void a(int[] arrn) {
        f = arrn;
    }

    public static int[] aB() {
        return f;
    }

    static {
        if (ej.aB() == null) {
            ej.a(new int[4]);
        }
    }
}

