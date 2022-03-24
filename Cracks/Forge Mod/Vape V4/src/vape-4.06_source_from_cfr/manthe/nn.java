/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.uh;

class nn {
    static final int[] a = new int[uh.values().length];

    static {
        try {
            nn.a[uh.DOWNLOADS.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            nn.a[uh.LAST_UPDATED.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

