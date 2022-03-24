/*
 * Decompiled with CFR 0.150.
 */
package manthe;

public class Bx {
    private static final char[] b = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".toCharArray();
    private static int[] a;
    private static boolean c;

    public static String a(byte[] arrby) {
        int n6 = arrby.length;
        byte[] arrby2 = new byte[arrby.length * 4];
        int n10 = 0;
        int n11 = -6;
        int n12 = 0;
        for (int k = 0; k < n6; ++k) {
            n10 = (n10 << 8) + arrby[k];
            n11 += 8;
            while (n11 >= 0) {
                arrby2[n12++] = (byte)b[n10 >> n11 & 0x3F];
                n11 -= 6;
            }
        }
        if (n11 > -6) {
            arrby2[n12++] = (byte)b[n10 << 8 >> n11 + 8 & 0x3F];
        }
        while (n12 % 4 != 0) {
            arrby2[n12++] = 61;
        }
        arrby2[n12] = 0;
        byte[] arrby3 = new byte[n12];
        System.arraycopy(arrby2, 0, arrby3, 0, n12);
        return new String(arrby3);
    }

    public static byte[] a(String string) {
        char c3;
        int n6;
        byte[] arrby = new byte[string.length() + 1];
        int n10 = 0;
        if (!c) {
            a = new int[256];
            for (n6 = 0; n6 < 256; ++n6) {
                Bx.a[n6] = -1;
            }
            for (n6 = 0; n6 < 64; ++n6) {
                Bx.a[Bx.b[n6]] = n6;
            }
            c = true;
        }
        n6 = 0;
        int n11 = -8;
        for (int k = 0; k < string.length() && a[c3 = string.charAt(k)] != -1; ++k) {
            n6 = (n6 << 6) + a[c3];
            if ((n11 += 6) < 0) continue;
            arrby[n10++] = (byte)(n6 >> n11 & 0xFF);
            n11 -= 8;
        }
        arrby[n10] = 0;
        return arrby;
    }
}

