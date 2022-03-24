/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.V;
import manthe.bH;
import manthe.cy;
import manthe.eC;
import manthe.eJ;
import manthe.ex;
import manthe.fD;
import manthe.fG;
import manthe.fM;
import manthe.fS;
import manthe.g1;
import manthe.gK;
import manthe.gM;
import manthe.gO;
import manthe.gS;
import manthe.gg;
import manthe.hm;

public class dp
extends cy {
    public dp(Object object) {
        super(object);
    }

    public float j() {
        return dp.a.M().bA.a(this.b);
    }

    public boolean i() {
        return false;
    }

    public fG a(int n6, int n10, int n11, int n12, eC eC2) {
        if (V.c() >= 23) {
            return new fG(dp.a.M().bA.a(this.b, n6, n10, n11, fM.e[n12].a(), eC2.a()));
        }
        return new fG(dp.a.M().bA.a(this.b, n6, n10, n11, n12, eC2.a()));
    }

    public boolean a(eC eC2, gS gS2, fG fG2) {
        if (V.c() >= 23) {
            fD fD2 = new fD(dp.a.M().bA.b(this.b, eC2.a(), gS2.a(), gM.f().a()));
            return fD2.equals(fD.f());
        }
        return dp.a.M().bA.a(this.b, eC2.a(), gS2.a(), fG2.a());
    }

    public void a(eC eC2) {
        dp.a.M().bA.a(this.b, eC2.a());
    }

    public boolean a(eJ eJ2, gO gO2, fG fG2, bH bH2, gg gg2, gK gK2) {
        if (V.c() > 13) {
            if (V.c() >= 23) {
                Boolean bl = dp.a.M().bA.b(this.b, eJ2.a(), gO2.a(), g1.a(bH2).a(), gg2.a(), gK2.a(), gM.f().a());
                fD fD2 = new fD(bl);
                return fD2.equals(fD.f());
            }
            return dp.a.M().bA.a(this.b, eJ2.a(), gO2.a(), fG2.a(), g1.a(bH2).a(), gg2.a(), gK2.a());
        }
        return dp.a.M().bA.a(this.b, eJ2.a(), gO2.a(), fG2.a(), bH2.d(), bH2.c(), bH2.a(), gg2.h(), gK2.a());
    }

    public void a(eC eC2, ex ex2) {
        hm.a(dp.a.M().bA, this.b, eC2.a(), ex2.a());
    }

    public void f() {
        hm.a(dp.a.M().bA, this.b);
    }

    public void h() {
        dp.a.M().bA.c(this.b);
    }

    public fS k() {
        return new fS(hm.c(dp.a.M().bA, this.b));
    }

    public boolean g() {
        return hm.b(dp.a.M().bA, this.b);
    }
}

