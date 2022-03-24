/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.util.Random;
import manthe.Dy;

public class aA {
    private static final Random a = new Random();

    public static int a(int n6, int n10) {
        int n11 = n10 - n6;
        return n11 <= 0 ? n6 : a.nextInt(n11) + n6 + 1;
    }

    public static int a(Dy dy2) {
        return aA.a(dy2.v()[0].intValue(), dy2.v()[1].intValue());
    }
}

