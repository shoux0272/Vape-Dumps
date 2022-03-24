/*
 * Decompiled with CFR 0.150.
 */
package manthe;

public enum c2 {
    LEFT_CLICK,
    RIGHT_CLICK,
    MIDDLE_CLICK,
    UNKNOWN;


    public static c2 a(int n6) {
        for (c2 c22 : c2.values()) {
            if (c22.ordinal() != n6) continue;
            return c22;
        }
        return UNKNOWN;
    }
}

