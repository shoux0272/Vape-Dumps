/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.ds;
import manthe.eJ;

public class oA {
    public static void b(float f10, float f11) {
        eJ eJ2 = ds.k();
        float f12 = eJ2.K();
        float f13 = eJ2.U();
        eJ2.i((float)((double)eJ2.U() + (double)f10 * 0.15));
        eJ2.d((float)((double)eJ2.K() - (double)f11 * 0.15));
        if (eJ2.K() < -90.0f) {
            eJ2.d(-90.0f);
        }
        if (eJ2.K() > 90.0f) {
            eJ2.d(90.0f);
        }
        eJ2.e(eJ2.aa() + eJ2.K() - f12);
        eJ2.f(eJ2.ag() + eJ2.U() - f13);
    }

    public static void a(float f10, float f11) {
        eJ eJ2 = ds.k();
        float f12 = eJ2.K();
        float f13 = eJ2.U();
        eJ2.i(f10);
        eJ2.d(f11);
        if (eJ2.K() < -90.0f) {
            eJ2.d(-90.0f);
        }
        if (eJ2.K() > 90.0f) {
            eJ2.d(90.0f);
        }
        eJ2.e(eJ2.aa() + eJ2.K() - f12);
        eJ2.f(eJ2.ag() + eJ2.U() - f13);
    }

    public static void c(float f10, float f11) {
        eJ eJ2 = ds.k();
        float f12 = eJ2.K();
        float f13 = eJ2.U();
        eJ2.i((float)((double)eJ2.U() + (double)f10 * 0.15));
        eJ2.d((float)((double)eJ2.K() - (double)f11 * 0.15));
        if (eJ2.K() < -90.0f) {
            eJ2.d(-90.0f);
        }
        if (eJ2.K() > 90.0f) {
            eJ2.d(90.0f);
        }
        eJ2.e(eJ2.aa() + eJ2.K() - f12);
        eJ2.f(eJ2.ag() + eJ2.U() - f13);
    }
}

