/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import javassist.bytecode.CodeAttribute$RuntimeCopyException;
import manthe.V;
import manthe.ds;
import manthe.eJ;
import manthe.ft;
import manthe.km;
import manthe.y5;
import manthe.yc;

public class yA
extends yc {
    private static boolean v;

    public yA(y5 y52, String string) {
        super(y52, string);
    }

    @Override
    public void a(km km2) {
        if (km2.c()) {
            eJ eJ2 = ds.k();
            if (eJ2.e()) {
                return;
            }
            double d10 = 0.163;
            double d11 = Math.cos(Math.toRadians(eJ2.U() + 90.0f));
            double d12 = Math.sin(Math.toRadians(eJ2.U() + 90.0f));
            double d13 = (double)eJ2.bg().j() * d10 * d11 + (double)eJ2.bg().h() * d10 * d12;
            double d14 = (double)eJ2.bg().j() * d10 * d12 - (double)eJ2.bg().h() * d10 * d11;
            if (eJ2.E() && !eJ2.aQ()) {
                if (V.c() > 13) {
                    eJ2.bp().a(ft.a(eJ2.z() + d13, eJ2.l(), eJ2.g() + d14, false));
                    eJ2.bp().a(ft.a(eJ2.z(), eJ2.l() - 0.4982374987, eJ2.g(), false));
                } else {
                    eJ2.bp().a(ft.a(eJ2.z() + d13, eJ2.s().l(), eJ2.l(), eJ2.g() + d14, false));
                    eJ2.bp().a(ft.a(eJ2.z(), eJ2.s().l() - 0.4982374987, eJ2.l() - 0.4982374987, eJ2.g(), false));
                }
            }
        }
    }

    public static void e(boolean bl) {
        v = bl;
    }

    public static boolean U() {
        return v;
    }

    public static boolean T() {
        boolean bl = yA.U();
        return !bl;
    }

    private static CodeAttribute$RuntimeCopyException a(CodeAttribute$RuntimeCopyException codeAttribute$RuntimeCopyException) {
        return codeAttribute$RuntimeCopyException;
    }

    static {
        if (!yA.U()) {
            yA.e(true);
        }
    }
}

