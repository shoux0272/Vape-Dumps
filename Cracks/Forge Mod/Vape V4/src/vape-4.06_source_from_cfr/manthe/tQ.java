/*
 * Decompiled with CFR 0.150.
 */
package manthe;

public class tQ {
    private static int[] b;

    public static void b(int[] arrn) {
        b = arrn;
    }

    public static int[] b() {
        return b;
    }

    static {
        if (tQ.b() != null) {
            tQ.b(new int[2]);
        }
    }
}

