/*
 * Decompiled with CFR 0.150.
 */
import java.util.Comparator;

class iReSqtkUVgDNPiReSqtkUVg
implements Comparator<iReSqtkUVgVnKiReSqtkUVg> {
    final /* synthetic */ iReSqtkUVgtlXiReSqtkUVg a;
    final /* synthetic */ iReSqtkUVgnzBiReSqtkUVg b;

    iReSqtkUVgDNPiReSqtkUVg(iReSqtkUVgnzBiReSqtkUVg iReSqtkUVgnzBiReSqtkUVg2, iReSqtkUVgtlXiReSqtkUVg iReSqtkUVgtlXiReSqtkUVg2) {
        this.b = iReSqtkUVgnzBiReSqtkUVg2;
        this.a = iReSqtkUVgtlXiReSqtkUVg2;
    }

    public int a(iReSqtkUVgVnKiReSqtkUVg iReSqtkUVgVnKiReSqtkUVg2, iReSqtkUVgVnKiReSqtkUVg iReSqtkUVgVnKiReSqtkUVg3) {
        double d2;
        double d3 = iReSqtkUVgVnKiReSqtkUVg2.a(this.a);
        if (d3 == (d2 = (double)iReSqtkUVgVnKiReSqtkUVg3.a(this.a))) {
            return 0;
        }
        return d3 > d2 ? 1 : -1;
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((iReSqtkUVgVnKiReSqtkUVg)object, (iReSqtkUVgVnKiReSqtkUVg)object2);
    }
}

