/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.awt.Color;

class AX {
    private static final double c = 95.047;
    private static final double f = 100.0;
    private static final double d = 108.883;
    private static final double g = 0.008856;
    private static final double e = 903.3;
    private static final int a = 10;
    private static final int b = 1;
    private static final ThreadLocal<double[]> h = new ThreadLocal();

    private AX() {
    }

    public static int c(int n6, int n10) {
        int n11 = 255;
        int n12 = 255;
        int n13 = AX.b(n12, n11);
        Color color = new Color(n6);
        Color color2 = new Color(n10);
        int n14 = AX.a(color.getRed(), n12, color2.getRed(), n11, n13);
        int n15 = AX.a(color.getGreen(), n12, color2.getGreen(), n11, n13);
        int n16 = AX.a(color.getBlue(), n12, color2.getBlue(), n11, n13);
        return new Color(n14, n15, n16).getRGB();
    }

    private static int b(int n6, int n10) {
        return 255 - (255 - n10) * (255 - n6) / 255;
    }

    private static int a(int n6, int n10, int n11, int n12, int n13) {
        if (n13 == 0) {
            return 0;
        }
        return (255 * n6 * n10 + n11 * n12 * (255 - n10)) / (n13 * 255);
    }

    public static void a(int n6, float[] arrf) {
        Color color = new Color(n6);
        AX.a(color.getRed(), color.getGreen(), color.getBlue(), arrf);
    }

    public static void a(int n6, int n10, int n11, float[] arrf) {
        float f10;
        float f11;
        float f12 = (float)n6 / 255.0f;
        float f13 = (float)n10 / 255.0f;
        float f14 = (float)n11 / 255.0f;
        float f15 = Math.max(f12, Math.max(f13, f14));
        float f16 = Math.min(f12, Math.min(f13, f14));
        float f17 = f15 - f16;
        float f18 = (f15 + f16) / 2.0f;
        if (f15 == f16) {
            f11 = 0.0f;
            f10 = 0.0f;
        } else {
            f10 = f15 == f12 ? (f13 - f14) / f17 % 6.0f : (f15 == f13 ? (f14 - f12) / f17 + 2.0f : (f12 - f13) / f17 + 4.0f);
            f11 = f17 / (1.0f - Math.abs(2.0f * f18 - 1.0f));
        }
        f10 = f10 * 60.0f % 360.0f;
        if (f10 < 0.0f) {
            f10 += 360.0f;
        }
        arrf[0] = AX.a(f10, 0.0f, 360.0f);
        arrf[1] = AX.a(f11, 0.0f, 1.0f);
        arrf[2] = AX.a(f18, 0.0f, 1.0f);
    }

    public static double a(int n6) {
        double[] arrd = AX.a();
        AX.b(n6, arrd);
        return arrd[1] / 100.0;
    }

    public static double a(int n6, int n10) {
        n6 = AX.c(n6, n10);
        double d10 = AX.a(n6) + 0.05;
        double d11 = AX.a(n10) + 0.05;
        return Math.max(d10, d11) / Math.min(d10, d11);
    }

    public static void a(int n6, double[] arrd) {
        Color color = new Color(n6);
        AX.a(color.getRed(), color.getGreen(), color.getBlue(), arrd);
    }

    public static void a(int n6, int n10, int n11, double[] arrd) {
        AX.b(n6, n10, n11, arrd);
        AX.a(arrd[0], arrd[1], arrd[2], arrd);
    }

    public static void b(int n6, double[] arrd) {
        Color color = new Color(n6);
        AX.b(color.getRed(), color.getGreen(), color.getBlue(), arrd);
    }

    public static void b(int n6, int n10, int n11, double[] arrd) {
        if (arrd.length != 3) {
            throw new IllegalArgumentException("outXyz must have a length of 3.");
        }
        double d10 = (double)n6 / 255.0;
        d10 = d10 < 0.04045 ? d10 / 12.92 : Math.pow((d10 + 0.055) / 1.055, 2.4);
        double d11 = (double)n10 / 255.0;
        d11 = d11 < 0.04045 ? d11 / 12.92 : Math.pow((d11 + 0.055) / 1.055, 2.4);
        double d12 = (double)n11 / 255.0;
        d12 = d12 < 0.04045 ? d12 / 12.92 : Math.pow((d12 + 0.055) / 1.055, 2.4);
        arrd[0] = 100.0 * (d10 * 0.4124 + d11 * 0.3576 + d12 * 0.1805);
        arrd[1] = 100.0 * (d10 * 0.2126 + d11 * 0.7152 + d12 * 0.0722);
        arrd[2] = 100.0 * (d10 * 0.0193 + d11 * 0.1192 + d12 * 0.9505);
    }

    public static void a(double d10, double d11, double d12, double[] arrd) {
        if (arrd.length != 3) {
            throw new IllegalArgumentException("outLab must have a length of 3.");
        }
        d10 = AX.a(d10 / 95.047);
        d11 = AX.a(d11 / 100.0);
        d12 = AX.a(d12 / 108.883);
        arrd[0] = Math.max(0.0, 116.0 * d11 - 16.0);
        arrd[1] = 500.0 * (d10 - d11);
        arrd[2] = 200.0 * (d11 - d12);
    }

    public static void b(double d10, double d11, double d12, double[] arrd) {
        double d13 = (d10 + 16.0) / 116.0;
        double d14 = d11 / 500.0 + d13;
        double d15 = d13 - d12 / 200.0;
        double d16 = Math.pow(d14, 3.0);
        double d17 = d16 > 0.008856 ? d16 : (116.0 * d14 - 16.0) / 903.3;
        double d18 = d10 > 7.9996247999999985 ? Math.pow(d13, 3.0) : d10 / 903.3;
        d16 = Math.pow(d15, 3.0);
        double d19 = d16 > 0.008856 ? d16 : (116.0 * d15 - 16.0) / 903.3;
        arrd[0] = d17 * 95.047;
        arrd[1] = d18 * 100.0;
        arrd[2] = d19 * 108.883;
    }

    public static int a(double d10, double d11, double d12) {
        double d13 = (d10 * 3.2406 + d11 * -1.5372 + d12 * -0.4986) / 100.0;
        double d14 = (d10 * -0.9689 + d11 * 1.8758 + d12 * 0.0415) / 100.0;
        double d15 = (d10 * 0.0557 + d11 * -0.204 + d12 * 1.057) / 100.0;
        d13 = d13 > 0.0031308 ? 1.055 * Math.pow(d13, 0.4166666666666667) - 0.055 : 12.92 * d13;
        d14 = d14 > 0.0031308 ? 1.055 * Math.pow(d14, 0.4166666666666667) - 0.055 : 12.92 * d14;
        d15 = d15 > 0.0031308 ? 1.055 * Math.pow(d15, 0.4166666666666667) - 0.055 : 12.92 * d15;
        return new Color(AX.a((int)Math.round(d13 * 255.0), 0, 255), AX.a((int)Math.round(d14 * 255.0), 0, 255), AX.a((int)Math.round(d15 * 255.0), 0, 255)).getRGB();
    }

    public static int b(double d10, double d11, double d12) {
        double[] arrd = AX.a();
        AX.b(d10, d11, d12, arrd);
        return AX.a(arrd[0], arrd[1], arrd[2]);
    }

    private static int a(int n6, int n10, int n11) {
        return n6 < n10 ? n10 : (n6 > n11 ? n11 : n6);
    }

    private static float a(float f10, float f11, float f12) {
        return f10 < f11 ? f11 : (f10 > f12 ? f12 : f10);
    }

    private static double a(double d10) {
        return d10 > 0.008856 ? Math.pow(d10, 0.3333333333333333) : (903.3 * d10 + 16.0) / 116.0;
    }

    public static double[] a() {
        double[] arrd = h.get();
        if (arrd == null) {
            arrd = new double[3];
            h.set(arrd);
        }
        return arrd;
    }

    public static int a(float[] arrf) {
        float f10 = arrf[0];
        float f11 = arrf[1];
        float f12 = arrf[2];
        float f13 = (1.0f - Math.abs(2.0f * f12 - 1.0f)) * f11;
        float f14 = f12 - 0.5f * f13;
        float f15 = f13 * (1.0f - Math.abs(f10 / 60.0f % 2.0f - 1.0f));
        int n6 = (int)f10 / 60;
        int n10 = 0;
        int n11 = 0;
        int n12 = 0;
        switch (n6) {
            case 0: {
                n10 = Math.round(255.0f * (f13 + f14));
                n11 = Math.round(255.0f * (f15 + f14));
                n12 = Math.round(255.0f * f14);
                break;
            }
            case 1: {
                n10 = Math.round(255.0f * (f15 + f14));
                n11 = Math.round(255.0f * (f13 + f14));
                n12 = Math.round(255.0f * f14);
                break;
            }
            case 2: {
                n10 = Math.round(255.0f * f14);
                n11 = Math.round(255.0f * (f13 + f14));
                n12 = Math.round(255.0f * (f15 + f14));
                break;
            }
            case 3: {
                n10 = Math.round(255.0f * f14);
                n11 = Math.round(255.0f * (f15 + f14));
                n12 = Math.round(255.0f * (f13 + f14));
                break;
            }
            case 4: {
                n10 = Math.round(255.0f * (f15 + f14));
                n11 = Math.round(255.0f * f14);
                n12 = Math.round(255.0f * (f13 + f14));
                break;
            }
            case 5: 
            case 6: {
                n10 = Math.round(255.0f * (f13 + f14));
                n11 = Math.round(255.0f * f14);
                n12 = Math.round(255.0f * (f15 + f14));
            }
        }
        n10 = AX.a(n10, 0, 255);
        n11 = AX.a(n11, 0, 255);
        n12 = AX.a(n12, 0, 255);
        return new Color(n10, n11, n12).getRGB();
    }
}

