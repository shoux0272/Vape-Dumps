/*
 * Decompiled with CFR 0.150.
 */
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class iReSqtkUVgKexiReSqtkUVg {
    private static float[] a = new float[65536];
    private static final int[] b;

    public static final float a(float f) {
        return a[(int)(f * 10430.378f) & 0xFFFF];
    }

    public static final float b(float f) {
        return a[(int)(f * 10430.378f + 16384.0f) & 0xFFFF];
    }

    public static final float c(float f) {
        return (float)Math.sqrt(f);
    }

    public static final float a(double d2) {
        return (float)Math.sqrt(d2);
    }

    public static int d(float f) {
        int n = (int)f;
        return f < (float)n ? n - 1 : n;
    }

    public static int b(double d2) {
        return (int)(d2 + 1024.0) - 1024;
    }

    public static int c(double d2) {
        int n = (int)d2;
        return d2 < (double)n ? n - 1 : n;
    }

    public static long d(double d2) {
        long l = (long)d2;
        return d2 < (double)l ? l - 1L : l;
    }

    public static int e(double d2) {
        return (int)(d2 >= 0.0 ? d2 : -d2 + 1.0);
    }

    public static float e(float f) {
        return f >= 0.0f ? f : -f;
    }

    public static int a(int n) {
        return n >= 0 ? n : -n;
    }

    public static int f(float f) {
        int n = (int)f;
        return f > (float)n ? n + 1 : n;
    }

    public static int f(double d2) {
        int n = (int)d2;
        return d2 > (double)n ? n + 1 : n;
    }

    public static int a(int n, int n2, int n3) {
        return n < n2 ? n2 : (n > n3 ? n3 : n);
    }

    public static float a(float f, float f2, float f3) {
        return f < f2 ? f2 : (f > f3 ? f3 : f);
    }

    public static double a(double d2, double d3, double d4) {
        return d2 < d3 ? d3 : (d2 > d4 ? d4 : d2);
    }

    public static double b(double d2, double d3, double d4) {
        return d4 < 0.0 ? d2 : (d4 > 1.0 ? d3 : d2 + (d3 - d2) * d4);
    }

    public static double a(double d2, double d3) {
        if (d2 < 0.0) {
            d2 = -d2;
        }
        if (d3 < 0.0) {
            d3 = -d3;
        }
        return d2 > d3 ? d2 : d3;
    }

    public static int a(int n, int n2) {
        return n < 0 ? -((-n - 1) / n2) - 1 : n / n2;
    }

    public static boolean a(String string) {
        return string == null || string.length() == 0;
    }

    public static int a(Random random, int n, int n2) {
        return n >= n2 ? n : random.nextInt(n2 - n + 1) + n;
    }

    public static float a(Random random, float f, float f2) {
        return f >= f2 ? f : random.nextFloat() * (f2 - f) + f;
    }

    public static double a(Random random, double d2, double d3) {
        return d2 >= d3 ? d2 : random.nextDouble() * (d3 - d2) + d2;
    }

    public static double a(long[] arrl) {
        long l = 0L;
        long[] arrl2 = arrl;
        int n = arrl.length;
        for (int i = 0; i < n; ++i) {
            long l2 = arrl2[i];
            l += l2;
        }
        return (double)l / (double)arrl.length;
    }

    public static float g(float f) {
        if ((f %= 360.0f) >= 180.0f) {
            f -= 360.0f;
        }
        if (f < -180.0f) {
            f += 360.0f;
        }
        return f;
    }

    public static double g(double d2) {
        if ((d2 %= 360.0) >= 180.0) {
            d2 -= 360.0;
        }
        if (d2 < -180.0) {
            d2 += 360.0;
        }
        return d2;
    }

    public static int a(String string, int n) {
        int n2 = n;
        try {
            n2 = Integer.parseInt(string);
        }
        catch (Throwable throwable) {
            // empty catch block
        }
        return n2;
    }

    public static int a(String string, int n, int n2) {
        int n3 = n;
        try {
            n3 = Integer.parseInt(string);
        }
        catch (Throwable throwable) {
            // empty catch block
        }
        if (n3 < n2) {
            n3 = n2;
        }
        return n3;
    }

    public static double a(String string, double d2) {
        double d3 = d2;
        try {
            d3 = Double.parseDouble(string);
        }
        catch (Throwable throwable) {
            // empty catch block
        }
        return d3;
    }

    public static double a(String string, double d2, double d3) {
        double d4 = d2;
        try {
            d4 = Double.parseDouble(string);
        }
        catch (Throwable throwable) {
            // empty catch block
        }
        if (d4 < d3) {
            d4 = d3;
        }
        return d4;
    }

    public static int b(int n) {
        int n2 = n - 1;
        n2 |= n2 >> 1;
        n2 |= n2 >> 2;
        n2 |= n2 >> 4;
        n2 |= n2 >> 8;
        n2 |= n2 >> 16;
        return n2 + 1;
    }

    private static boolean d(int n) {
        return n != 0 && (n & n - 1) == 0;
    }

    private static int e(int n) {
        n = iReSqtkUVgKexiReSqtkUVg.d(n) ? n : iReSqtkUVgKexiReSqtkUVg.b(n);
        return b[(int)((long)n * 125613361L >> 27) & 0x1F];
    }

    public static int c(int n) {
        return iReSqtkUVgKexiReSqtkUVg.e(n) - (iReSqtkUVgKexiReSqtkUVg.d(n) ? 0 : 1);
    }

    public static int b(int n, int n2) {
        int n3;
        if (n2 == 0) {
            return 0;
        }
        if (n < 0) {
            n2 *= -1;
        }
        return (n3 = n % n2) == 0 ? n : n + n2 - n3;
    }

    public static double b(double d2, double d3) {
        double d4 = d2;
        d4 = d4 > 0.0 ? (d4 += Math.abs(d3)) : (d4 -= Math.abs(d3));
        return d4;
    }

    public static int c(int n, int n2) {
        int n3 = n;
        n3 = n3 > 0 ? (n3 += Math.abs(n2)) : (n3 -= Math.abs(n2));
        return n3;
    }

    public static double c(double d2, double d3) {
        double d4 = d2;
        if (d4 > 0.0) {
            if (d4 < d3) {
                d4 += d3;
            }
        } else if (d4 > -d3) {
            d4 -= d3;
        }
        return d4;
    }

    public static int b(Random random, int n, int n2) {
        return random.nextInt(n2 - n) + n;
    }

    public static double b(Random random, double d2, double d3) {
        return d2 + (d3 - d2) * random.nextDouble();
    }

    public static double d(double d2, double d3) {
        double d4 = 1.0 / d3;
        return (double)Math.round(d2 * d4) / d4;
    }

    public static double a(double d2, int n) {
        if (n < 0) {
            return d2;
        }
        BigDecimal bigDecimal = new BigDecimal(d2);
        bigDecimal = bigDecimal.setScale(n, RoundingMode.HALF_UP);
        return bigDecimal.doubleValue();
    }

    static {
        for (int i = 0; i < 65536; ++i) {
            iReSqtkUVgKexiReSqtkUVg.a[i] = (float)Math.sin((double)i * Math.PI * 2.0 / 65536.0);
        }
        b = new int[]{0, 1, 28, 2, 29, 14, 24, 3, 30, 22, 20, 15, 25, 17, 4, 8, 31, 27, 13, 23, 21, 19, 16, 7, 26, 12, 18, 6, 11, 5, 10, 9};
    }
}

