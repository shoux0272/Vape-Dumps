/*
 * Decompiled with CFR 0.150.
 */
public class iReSqtkUVgLMUiReSqtkUVg {
    private static char[] a = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".toCharArray();
    private static int[] b;
    private static boolean c;

    public static String a(byte[] arrby) {
        int n = arrby.length;
        byte[] arrby2 = new byte[arrby.length * 4];
        int n2 = 0;
        int n3 = -6;
        int n4 = 0;
        for (int i = 0; i < n; ++i) {
            n2 = (n2 << 8) + arrby[i];
            n3 += 8;
            while (n3 >= 0) {
                arrby2[n4++] = (byte)a[n2 >> n3 & 0x3F];
                n3 -= 6;
            }
        }
        if (n3 > -6) {
            arrby2[n4++] = (byte)a[n2 << 8 >> n3 + 8 & 0x3F];
        }
        while (n4 % 4 != 0) {
            arrby2[n4++] = 61;
        }
        arrby2[n4] = 0;
        byte[] arrby3 = new byte[n4];
        System.arraycopy(arrby2, 0, arrby3, 0, n4);
        return new String(arrby3);
    }

    public static byte[] a(String string) {
        char c2;
        int n;
        byte[] arrby = new byte[string.length() + 1];
        int n2 = 0;
        if (!c) {
            b = new int[256];
            for (n = 0; n < 256; ++n) {
                iReSqtkUVgLMUiReSqtkUVg.b[n] = -1;
            }
            for (n = 0; n < 64; ++n) {
                iReSqtkUVgLMUiReSqtkUVg.b[iReSqtkUVgLMUiReSqtkUVg.a[n]] = n;
            }
            c = true;
        }
        n = 0;
        int n3 = -8;
        for (int i = 0; i < string.length() && b[c2 = string.charAt(i)] != -1; ++i) {
            n = (n << 6) + b[c2];
            if ((n3 += 6) < 0) continue;
            arrby[n2++] = (byte)(n >> n3 & 0xFF);
            n3 -= 8;
        }
        arrby[n2] = 0;
        return arrby;
    }
}

