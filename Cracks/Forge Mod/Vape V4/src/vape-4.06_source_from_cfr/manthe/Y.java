/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;
import manthe.gf;

public class Y {
    private static final int[] a;
    private static final float[] b;

    public static final float f(float f10) {
        return b[(int)(f10 * 10430.378f) & 0xFFFF];
    }

    public static final float d(float f10) {
        return b[(int)(f10 * 10430.378f + 16384.0f) & 0xFFFF];
    }

    public static final float g(float f10) {
        return (float)Math.sqrt(f10);
    }

    public static final float e(double d10) {
        return (float)Math.sqrt(d10);
    }

    public static int b(float f10) {
        int n6 = (int)f10;
        return f10 < (float)n6 ? n6 - 1 : n6;
    }

    public static int b(double d10) {
        return (int)(d10 + 1024.0) - 1024;
    }

    public static int c(double d10) {
        int n6 = (int)d10;
        return d10 < (double)n6 ? n6 - 1 : n6;
    }

    public static long g(double d10) {
        long l = (long)d10;
        return d10 < (double)l ? l - 1L : l;
    }

    public static int f(double d10) {
        return (int)(d10 >= 0.0 ? d10 : -d10 + 1.0);
    }

    public static float c(float f10) {
        return f10 >= 0.0f ? f10 : -f10;
    }

    public static int b(int n6) {
        return n6 >= 0 ? n6 : -n6;
    }

    public static int e(float f10) {
        int n6 = (int)f10;
        return f10 > (float)n6 ? n6 + 1 : n6;
    }

    public static int d(double d10) {
        int n6 = (int)d10;
        return d10 > (double)n6 ? n6 + 1 : n6;
    }

    public static int b(int n6, int n10, int n11) {
        return n6 < n10 ? n10 : (n6 > n11 ? n11 : n6);
    }

    public static float a(float f10, float f11, float f12) {
        return f10 < f11 ? f11 : (f10 > f12 ? f12 : f10);
    }

    public static double a(double d10, double d11, double d12) {
        return d10 < d11 ? d11 : (d10 > d12 ? d12 : d10);
    }

    public static double b(double d10, double d11, double d12) {
        return d12 < 0.0 ? d10 : (d12 > 1.0 ? d11 : d10 + (d11 - d10) * d12);
    }

    public static double c(double d10, double d11) {
        if (d10 < 0.0) {
            d10 = -d10;
        }
        if (d11 < 0.0) {
            d11 = -d11;
        }
        return d10 > d11 ? d10 : d11;
    }

    public static int b(int n6, int n10) {
        return n6 < 0 ? -((-n6 - 1) / n10) - 1 : n6 / n10;
    }

    public static boolean a(String string) {
        return string == null || string.length() == 0;
    }

    public static int b(Random random, int n6, int n10) {
        return n6 >= n10 ? n6 : random.nextInt(n10 - n6 + 1) + n6;
    }

    public static float a(Random random, float f10, float f11) {
        return f10 >= f11 ? f10 : random.nextFloat() * (f11 - f10) + f10;
    }

    public static double b(Random random, double d10, double d11) {
        return d10 >= d11 ? d10 : random.nextDouble() * (d11 - d10) + d10;
    }

    public static double a(long[] arrl) {
        long l = 0L;
        long[] arrl2 = arrl;
        int n6 = arrl.length;
        for (int k = 0; k < n6; ++k) {
            long l6 = arrl2[k];
            l += l6;
        }
        return (double)l / (double)arrl.length;
    }

    public static float a(float f10) {
        if ((f10 %= 360.0f) >= 180.0f) {
            f10 -= 360.0f;
        }
        if (f10 < -180.0f) {
            f10 += 360.0f;
        }
        return f10;
    }

    public static double a(double d10) {
        if ((d10 %= 360.0) >= 180.0) {
            d10 -= 360.0;
        }
        if (d10 < -180.0) {
            d10 += 360.0;
        }
        return d10;
    }

    public static int a(String string, int n6) {
        int n10 = n6;
        try {
            n10 = Integer.parseInt(string);
        }
        catch (Throwable throwable) {
            // empty catch block
        }
        return n10;
    }

    public static int a(String string, int n6, int n10) {
        int n11 = n6;
        try {
            n11 = Integer.parseInt(string);
        }
        catch (Throwable throwable) {
            // empty catch block
        }
        if (n11 < n10) {
            n11 = n10;
        }
        return n11;
    }

    public static double a(String string, double d10) {
        double d11 = d10;
        try {
            d11 = Double.parseDouble(string);
        }
        catch (Throwable throwable) {
            // empty catch block
        }
        return d11;
    }

    public static double a(String string, double d10, double d11) {
        double d12 = d10;
        try {
            d12 = Double.parseDouble(string);
        }
        catch (Throwable throwable) {
            // empty catch block
        }
        if (d12 < d11) {
            d12 = d11;
        }
        return d12;
    }

    public static int a(int n6) {
        int n10 = n6 - 1;
        n10 |= n10 >> 1;
        n10 |= n10 >> 2;
        n10 |= n10 >> 4;
        n10 |= n10 >> 8;
        n10 |= n10 >> 16;
        return n10 + 1;
    }

    private static boolean c(int n6) {
        return n6 != 0 && (n6 & n6 - 1) == 0;
    }

    private static int e(int n6) {
        n6 = Y.c(n6) ? n6 : Y.a(n6);
        return a[(int)((long)n6 * 125613361L >> 27) & 0x1F];
    }

    public static int d(int n6) {
        return Y.e(n6) - (Y.c(n6) ? 0 : 1);
    }

    public static int a(int n6, int n10) {
        int n11;
        if (n10 == 0) {
            return 0;
        }
        if (n6 < 0) {
            n10 *= -1;
        }
        return (n11 = n6 % n10) == 0 ? n6 : n6 + n10 - n11;
    }

    public static double d(double d10, double d11) {
        double d12 = d10;
        d12 = d12 > 0.0 ? (d12 += Math.abs(d11)) : (d12 -= Math.abs(d11));
        return d12;
    }

    public static int c(int n6, int n10) {
        int n11 = n6;
        n11 = n11 > 0 ? (n11 += Math.abs(n10)) : (n11 -= Math.abs(n10));
        return n11;
    }

    public static double b(double d10, double d11) {
        double d12 = d10;
        if (d12 > 0.0) {
            if (d12 < d11) {
                d12 += d11;
            }
        } else if (d12 > -d11) {
            d12 -= d11;
        }
        return d12;
    }

    public static long a(gf gf2) {
        return Y.a(gf2.h(), gf2.f(), gf2.g());
    }

    public static long a(int n6, int n10, int n11) {
        long l = (long)(n6 * 3129871) ^ (long)n11 * 116129781L ^ (long)n10;
        l = l * l * 42317861L + l * 11L;
        return l;
    }

    public static int a(Random random, int n6, int n10) {
        return random.nextInt(n10 - n6) + n6;
    }

    public static double a(Random random, double d10, double d11) {
        return d10 + (d11 - d10) * random.nextDouble();
    }

    public static double a(double d10, double d11) {
        double d12 = 1.0 / d11;
        return (double)Math.round(d10 * d12) / d12;
    }

    public static double a(double d10, int n6) {
        if (n6 < 0) {
            return d10;
        }
        BigDecimal bigDecimal = new BigDecimal(d10);
        bigDecimal = bigDecimal.setScale(n6, RoundingMode.HALF_UP);
        return bigDecimal.doubleValue();
    }

    static {
        b = new float[65536];
        for (int k = 0; k < 65536; ++k) {
            Y.b[k] = (float)Math.sin((double)k * Math.PI * 2.0 / 65536.0);
        }
        a = new int[]{0, 1, 28, 2, 29, 14, 24, 3, 30, 22, 20, 15, 25, 17, 4, 8, 31, 27, 13, 23, 21, 19, 16, 7, 26, 12, 18, 6, 11, 5, 10, 9};
    }
}

