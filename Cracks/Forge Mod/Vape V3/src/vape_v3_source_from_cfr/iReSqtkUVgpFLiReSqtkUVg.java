/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  sun.misc.FloatingDecimal
 */
import sun.misc.FloatingDecimal;

public final class iReSqtkUVgpFLiReSqtkUVg
extends Number
implements Comparable<iReSqtkUVgpFLiReSqtkUVg> {
    public static final double a = Double.POSITIVE_INFINITY;
    public static final double b = Double.NEGATIVE_INFINITY;
    public static final double c = Double.NaN;
    public static final double d = Double.MAX_VALUE;
    public static final double e = Double.MIN_NORMAL;
    public static final double f = Double.MIN_VALUE;
    public static final int g = 1023;
    public static final int h = -1022;
    public static final int i = 64;
    public static final int j = 8;
    private final double k;
    private static final long l = -9172774392245257468L;

    public static String a(double d2) {
        return FloatingDecimal.toJavaFormatString((double)d2);
    }

    public static String b(double d2) {
        if (!iReSqtkUVgpFLiReSqtkUVg.f(d2)) {
            return iReSqtkUVgpFLiReSqtkUVg.a(d2);
        }
        StringBuilder stringBuilder = new StringBuilder(24);
        if (Math.copySign(1.0, d2) == -1.0) {
            stringBuilder.append("-");
        }
        stringBuilder.append("0x");
        d2 = Math.abs(d2);
        if (d2 == 0.0) {
            stringBuilder.append("0.0p0");
        } else {
            boolean bl = d2 < Double.MIN_NORMAL;
            long l = iReSqtkUVgpFLiReSqtkUVg.h(d2) & 0xFFFFFFFFFFFFFL | 0x1000000000000000L;
            stringBuilder.append(bl ? "0." : "1.");
            String string = Long.toHexString(l).substring(3, 16);
            stringBuilder.append(string.equals("0000000000000") ? "0" : string.replaceFirst("0{1,12}$", ""));
            stringBuilder.append('p');
            stringBuilder.append(bl ? -1022 : Math.getExponent(d2));
        }
        return stringBuilder.toString();
    }

    public static iReSqtkUVgpFLiReSqtkUVg a(String string) {
        return new iReSqtkUVgpFLiReSqtkUVg(iReSqtkUVgpFLiReSqtkUVg.b(string));
    }

    public static iReSqtkUVgpFLiReSqtkUVg c(double d2) {
        return new iReSqtkUVgpFLiReSqtkUVg(d2);
    }

    public static double b(String string) {
        return FloatingDecimal.parseDouble((String)string);
    }

    public static boolean d(double d2) {
        return d2 != d2;
    }

    public static boolean e(double d2) {
        return d2 == Double.POSITIVE_INFINITY || d2 == Double.NEGATIVE_INFINITY;
    }

    public static boolean f(double d2) {
        return Math.abs(d2) <= Double.MAX_VALUE;
    }

    public iReSqtkUVgpFLiReSqtkUVg(double d2) {
        this.k = d2;
    }

    public iReSqtkUVgpFLiReSqtkUVg(String string) {
        this.k = iReSqtkUVgpFLiReSqtkUVg.b(string);
    }

    public boolean a() {
        return iReSqtkUVgpFLiReSqtkUVg.d(this.k);
    }

    public boolean b() {
        return iReSqtkUVgpFLiReSqtkUVg.e(this.k);
    }

    public String toString() {
        return iReSqtkUVgpFLiReSqtkUVg.a(this.k);
    }

    @Override
    public byte byteValue() {
        return (byte)this.k;
    }

    @Override
    public short shortValue() {
        return (short)this.k;
    }

    @Override
    public int intValue() {
        return (int)this.k;
    }

    @Override
    public long longValue() {
        return (long)this.k;
    }

    @Override
    public float floatValue() {
        return (float)this.k;
    }

    @Override
    public double doubleValue() {
        return this.k;
    }

    public int hashCode() {
        return iReSqtkUVgpFLiReSqtkUVg.g(this.k);
    }

    public static int g(double d2) {
        long l = iReSqtkUVgpFLiReSqtkUVg.h(d2);
        return (int)(l ^ l >>> 32);
    }

    public boolean equals(Object object) {
        return object instanceof iReSqtkUVgpFLiReSqtkUVg && iReSqtkUVgpFLiReSqtkUVg.h(((iReSqtkUVgpFLiReSqtkUVg)object).k) == iReSqtkUVgpFLiReSqtkUVg.h(this.k);
    }

    public static long h(double d2) {
        long l = Double.doubleToRawLongBits(d2);
        if ((l & 0x7FF0000000000000L) == 0x7FF0000000000000L && (l & 0xFFFFFFFFFFFFFL) != 0L) {
            l = 9221120237041090560L;
        }
        return l;
    }

    public int a(iReSqtkUVgpFLiReSqtkUVg iReSqtkUVgpFLiReSqtkUVg2) {
        return iReSqtkUVgpFLiReSqtkUVg.a(this.k, iReSqtkUVgpFLiReSqtkUVg2.k);
    }

    public static int a(double d2, double d3) {
        long l;
        if (d2 < d3) {
            return -1;
        }
        if (d2 > d3) {
            return 1;
        }
        long l2 = iReSqtkUVgpFLiReSqtkUVg.h(d2);
        return l2 == (l = iReSqtkUVgpFLiReSqtkUVg.h(d3)) ? 0 : (l2 < l ? -1 : 1);
    }

    public static double b(double d2, double d3) {
        return d2 + d3;
    }

    public static double c(double d2, double d3) {
        return Math.max(d2, d3);
    }

    public static double d(double d2, double d3) {
        return Math.min(d2, d3);
    }

    @Override
    public /* synthetic */ int compareTo(Object object) {
        return this.a((iReSqtkUVgpFLiReSqtkUVg)object);
    }
}

