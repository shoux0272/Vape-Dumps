/*
 * Decompiled with CFR 0.150.
 */
public class iReSqtkUVgOWCiReSqtkUVg
extends iReSqtkUVgZYoiReSqtkUVg {
    public iReSqtkUVgOWCiReSqtkUVg(iReSqtkUVgJZmiReSqtkUVg iReSqtkUVgJZmiReSqtkUVg2, String string) {
        super(iReSqtkUVgJZmiReSqtkUVg2, string);
    }

    @Override
    public void a(iReSqtkUVgTXviReSqtkUVg iReSqtkUVgTXviReSqtkUVg2) {
        if (iReSqtkUVgTXviReSqtkUVg2.isPre()) {
            iReSqtkUVgtlXiReSqtkUVg iReSqtkUVgtlXiReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.e();
            if (iReSqtkUVgtlXiReSqtkUVg2.b()) {
                return;
            }
            double d2 = 0.163;
            double d3 = Math.cos(Math.toRadians(iReSqtkUVgtlXiReSqtkUVg2.F() + 90.0f));
            double d4 = Math.sin(Math.toRadians(iReSqtkUVgtlXiReSqtkUVg2.F() + 90.0f));
            double d5 = (double)iReSqtkUVgtlXiReSqtkUVg2.n().i() * d2 * d3 + (double)iReSqtkUVgtlXiReSqtkUVg2.n().h() * d2 * d4;
            double d6 = (double)iReSqtkUVgtlXiReSqtkUVg2.n().i() * d2 * d4 - (double)iReSqtkUVgtlXiReSqtkUVg2.n().h() * d2 * d3;
            if (iReSqtkUVgtlXiReSqtkUVg2.al() && !iReSqtkUVgtlXiReSqtkUVg2.aQ()) {
                if (iReSqtkUVgauSiReSqtkUVg.d() > 13) {
                    iReSqtkUVgtlXiReSqtkUVg2.d().a(iReSqtkUVgGzHiReSqtkUVg.a(iReSqtkUVgtlXiReSqtkUVg2.z() + d5, iReSqtkUVgtlXiReSqtkUVg2.A(), iReSqtkUVgtlXiReSqtkUVg2.B() + d6, false));
                    iReSqtkUVgtlXiReSqtkUVg2.d().a(iReSqtkUVgGzHiReSqtkUVg.a(iReSqtkUVgtlXiReSqtkUVg2.z() - 0.4982374987, iReSqtkUVgtlXiReSqtkUVg2.A() - 0.4982374987, iReSqtkUVgtlXiReSqtkUVg2.B(), false));
                } else {
                    iReSqtkUVgtlXiReSqtkUVg2.d().a(iReSqtkUVgGzHiReSqtkUVg.a(iReSqtkUVgtlXiReSqtkUVg2.z() + d5, iReSqtkUVgtlXiReSqtkUVg2.V().e(), iReSqtkUVgtlXiReSqtkUVg2.A(), iReSqtkUVgtlXiReSqtkUVg2.B() + d6, false));
                    iReSqtkUVgtlXiReSqtkUVg2.d().a(iReSqtkUVgGzHiReSqtkUVg.a(iReSqtkUVgtlXiReSqtkUVg2.z(), iReSqtkUVgtlXiReSqtkUVg2.V().e() - 0.4982374987, iReSqtkUVgtlXiReSqtkUVg2.A() - 0.4982374987, iReSqtkUVgtlXiReSqtkUVg2.B(), false));
                }
            }
        }
    }
}

