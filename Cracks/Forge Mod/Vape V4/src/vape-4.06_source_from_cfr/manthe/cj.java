/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.DC;

class cj {
    static final int[] a = new int[DC.values().length];

    static {
        try {
            cj.a[DC.MINIMUM.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            cj.a[DC.MAXIMUM.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

