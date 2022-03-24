/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.kl;

public class kH
extends kl {
    private static boolean d = false;

    @Override
    public boolean fire() {
        return d;
    }

    public static void setCancel(boolean bl) {
        d = bl;
    }
}

