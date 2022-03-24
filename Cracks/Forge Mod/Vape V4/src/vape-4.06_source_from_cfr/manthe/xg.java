/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.bz;
import manthe.c2;
import manthe.uW;
import manthe.wM;
import manthe.we;

public abstract class xg
extends wM {
    private we z;
    private static String A;

    public xg(we we2) {
        this.z = we2;
    }

    public we l() {
        return this.z;
    }

    @Override
    public double g() {
        return 110.0;
    }

    @Override
    public double h() {
        return 20.0;
    }

    @Override
    public void b(uW uW2) {
        if (uW2.c().equals((Object)c2.RIGHT_CLICK) && this.z instanceof bz) {
            ((bz)((Object)this.z)).n();
            return;
        }
        super.b(uW2);
    }

    public static void b(String string) {
        A = string;
    }

    public static String m() {
        return A;
    }

    static {
        if (xg.m() != null) {
            xg.b("AnaCTc");
        }
    }
}

