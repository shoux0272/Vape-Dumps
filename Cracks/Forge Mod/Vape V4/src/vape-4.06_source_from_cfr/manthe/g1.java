/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.bH;
import manthe.gK;
import manthe.gf;
import manthe.gg;
import manthe.jC;

public class g1
extends gf {
    public g1(Object object) {
        super(object);
    }

    public static g1 a(gK gK2) {
        return new g1(g1.a.M().bN.d(gK2.a()));
    }

    public static g1 a(bH bH2) {
        return g1.a(bH2.d(), bH2.c(), bH2.a());
    }

    public static g1 a(int n6, int n10, int n11) {
        return new g1(g1.a.M().bN.a(n6, n10, n11));
    }

    public static g1 a(double d10, double d11, double d12) {
        return new g1(g1.a.M().bN.a(d10, d11, d12));
    }

    public g1 b(int n6, int n10, int n11) {
        return g1.a(this.h() + n6, this.f() + n10, this.g() + n11);
    }

    public g1 l() {
        return new g1(jC.f(g1.a.M().bN, this.b));
    }

    public g1 k() {
        return new g1(jC.c(g1.a.M().bN, this.b));
    }

    public g1 n() {
        return new g1(jC.e(g1.a.M().bN, this.b));
    }

    public g1 j() {
        return new g1(jC.d(g1.a.M().bN, this.b));
    }

    public g1 i() {
        return new g1(jC.a(g1.a.M().bN, this.b));
    }

    public g1 m() {
        return new g1(jC.b(g1.a.M().bN, this.b));
    }

    public g1 a(gg gg2) {
        return new g1(g1.a.M().bN.a(this.b, gg2.a(), 1));
    }

    @Override
    public String toString() {
        return this.h() + " " + this.f() + " " + this.g();
    }
}

