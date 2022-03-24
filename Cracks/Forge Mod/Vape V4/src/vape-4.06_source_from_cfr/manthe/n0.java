/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.sp;

class n0 {
    static final int[] a = new int[sp.values().length];

    static {
        try {
            n0.a[sp.BLOCK_CHILD.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            n0.a[sp.RAINBOW.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            n0.a[sp.SATURATION.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            n0.a[sp.VIBRANCE.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

