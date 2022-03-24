/*
 * Decompiled with CFR 0.150.
 */
public class iReSqtkUVgjbYiReSqtkUVg {
    public static float a(iReSqtkUVgeAuiReSqtkUVg iReSqtkUVgeAuiReSqtkUVg2, double d2) {
        iReSqtkUVgtlXiReSqtkUVg iReSqtkUVgtlXiReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.e();
        double d3 = 0.05f;
        double d4 = iReSqtkUVgeAuiReSqtkUVg2.a() - iReSqtkUVgtlXiReSqtkUVg2.z();
        double d5 = iReSqtkUVgeAuiReSqtkUVg2.c() - iReSqtkUVgtlXiReSqtkUVg2.B();
        double d6 = Math.sqrt(d4 * d4 + d5 * d5);
        double d7 = iReSqtkUVgeAuiReSqtkUVg2.b() - (iReSqtkUVgtlXiReSqtkUVg2.A() + (double)iReSqtkUVgtlXiReSqtkUVg2.aa());
        double d8 = 2.0 * d7 * (d2 * d2);
        double d9 = d3 * (d6 * d6);
        double d10 = Math.sqrt(d2 * d2 * d2 * d2 - d3 * (d9 + d8));
        double d11 = d2 * d2 + d10;
        double d12 = d2 * d2 - d10;
        double d13 = Math.atan2(d11, d3 * d6);
        double d14 = Math.atan2(d12, d3 * d6);
        return (float)(-Math.toDegrees(Math.min(d13, d14)));
    }
}

