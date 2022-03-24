/*
 * Decompiled with CFR 0.150.
 */
public class iReSqtkUVgIuaiReSqtkUVg {
    public static void a(float f, float f2) {
        iReSqtkUVgtlXiReSqtkUVg iReSqtkUVgtlXiReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.e();
        float f3 = iReSqtkUVgtlXiReSqtkUVg2.G();
        float f4 = iReSqtkUVgtlXiReSqtkUVg2.F();
        iReSqtkUVgtlXiReSqtkUVg2.f(f);
        iReSqtkUVgtlXiReSqtkUVg2.g(f2);
        if (iReSqtkUVgtlXiReSqtkUVg2.G() < -90.0f) {
            iReSqtkUVgtlXiReSqtkUVg2.g(-90.0f);
        }
        if (iReSqtkUVgtlXiReSqtkUVg2.G() > 90.0f) {
            iReSqtkUVgtlXiReSqtkUVg2.g(90.0f);
        }
        iReSqtkUVgtlXiReSqtkUVg2.i(iReSqtkUVgtlXiReSqtkUVg2.I() + iReSqtkUVgtlXiReSqtkUVg2.G() - f3);
        iReSqtkUVgtlXiReSqtkUVg2.h(iReSqtkUVgtlXiReSqtkUVg2.H() + iReSqtkUVgtlXiReSqtkUVg2.F() - f4);
    }

    public static void b(float f, float f2) {
        iReSqtkUVgtlXiReSqtkUVg iReSqtkUVgtlXiReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.e();
        float f3 = iReSqtkUVgtlXiReSqtkUVg2.G();
        float f4 = iReSqtkUVgtlXiReSqtkUVg2.F();
        iReSqtkUVgtlXiReSqtkUVg2.f((float)((double)iReSqtkUVgtlXiReSqtkUVg2.F() + (double)f * 0.15));
        iReSqtkUVgtlXiReSqtkUVg2.g((float)((double)iReSqtkUVgtlXiReSqtkUVg2.G() - (double)f2 * 0.15));
        if (iReSqtkUVgtlXiReSqtkUVg2.G() < -90.0f) {
            iReSqtkUVgtlXiReSqtkUVg2.g(-90.0f);
        }
        if (iReSqtkUVgtlXiReSqtkUVg2.G() > 90.0f) {
            iReSqtkUVgtlXiReSqtkUVg2.g(90.0f);
        }
        iReSqtkUVgtlXiReSqtkUVg2.i(iReSqtkUVgtlXiReSqtkUVg2.I() + iReSqtkUVgtlXiReSqtkUVg2.G() - f3);
        iReSqtkUVgtlXiReSqtkUVg2.h(iReSqtkUVgtlXiReSqtkUVg2.H() + iReSqtkUVgtlXiReSqtkUVg2.F() - f4);
    }
}

