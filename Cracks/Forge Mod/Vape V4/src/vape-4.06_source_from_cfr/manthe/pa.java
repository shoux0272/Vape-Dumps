/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.cB;
import manthe.ds;
import manthe.eJ;
import manthe.ft;

public class pa {
    private void a() {
        eJ eJ2 = ds.k();
        if (!eJ2.v() || !eJ2.J()) {
            return;
        }
        for (int k = 0; k < 60; ++k) {
            double d10 = 0.13029834580989086 + 7.045809890852092E-4 * Math.random();
            ft ft2 = cB.h ? ft.a(eJ2.z(), eJ2.l() + d10, eJ2.g(), false) : ft.a(eJ2.z(), eJ2.s().l() + d10, eJ2.l() + d10, eJ2.g(), false);
            double d11 = 0.07029834580989085 + 7.045809890852092E-4 * Math.random();
            ft ft3 = cB.h ? ft.a(eJ2.z(), eJ2.l() + d10, eJ2.g(), false) : ft.a(eJ2.z(), eJ2.s().l() + d11, eJ2.l() + d11, eJ2.g(), false);
            eJ2.bp().a(ft2);
            eJ2.bp().a(ft3);
        }
        eJ2.bp().a(cB.h ? ft.a(eJ2.z(), eJ2.l(), eJ2.g(), true) : ft.a(eJ2.z(), eJ2.s().l(), eJ2.l(), eJ2.g(), true));
    }
}

