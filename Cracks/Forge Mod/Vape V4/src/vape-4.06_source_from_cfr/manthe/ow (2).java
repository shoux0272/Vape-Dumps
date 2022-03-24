/*
 * Decompiled with CFR 0.150.
 */
package manthe;

public class ow {
    private static String[] b;

    public static void b(String[] arrstring) {
        b = arrstring;
    }

    public static String[] b() {
        return b;
    }

    static {
        if (ow.b() != null) {
            ow.b(new String[4]);
        }
    }
}

