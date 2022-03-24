/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;

class iReSqtkUVgksUiReSqtkUVg {
    private List<double[]> b = new ArrayList<double[]>();
    private int c;
    final /* synthetic */ iReSqtkUVgXVRiReSqtkUVg a;

    private iReSqtkUVgksUiReSqtkUVg(iReSqtkUVgXVRiReSqtkUVg iReSqtkUVgXVRiReSqtkUVg2, double d2, double d3) {
        this.a = iReSqtkUVgXVRiReSqtkUVg2;
        this.b.add(new double[]{d2, d3});
    }

    private iReSqtkUVgksUiReSqtkUVg a(double d2, double d3, int n) {
        if (n - this.c > 5) {
            this.b.clear();
        }
        this.c = n;
        this.b.add(new double[]{d2, d3});
        if (this.b.size() > 6) {
            ArrayList arrayList = new ArrayList(Lists.reverse(this.b));
            this.b.clear();
            for (int i = 0; i < 6 && i < arrayList.size(); ++i) {
                this.b.add((double[])arrayList.get(i));
            }
            this.b = Lists.reverse(this.b);
        }
        return this;
    }

    private double[] a() {
        int n = this.b.size();
        double d2 = 0.0;
        double d3 = 0.0;
        for (double[] arrd : this.b) {
            d2 += arrd[0];
            d3 += arrd[1];
        }
        return new double[]{d2 / (double)n, d3 / (double)n};
    }

    static /* synthetic */ iReSqtkUVgksUiReSqtkUVg a(iReSqtkUVgksUiReSqtkUVg iReSqtkUVgksUiReSqtkUVg2, double d2, double d3, int n) {
        return iReSqtkUVgksUiReSqtkUVg2.a(d2, d3, n);
    }

    /* synthetic */ iReSqtkUVgksUiReSqtkUVg(iReSqtkUVgXVRiReSqtkUVg iReSqtkUVgXVRiReSqtkUVg2, double d2, double d3, iReSqtkUVgcIUiReSqtkUVg iReSqtkUVgcIUiReSqtkUVg2) {
        this(iReSqtkUVgXVRiReSqtkUVg2, d2, d3);
    }

    static /* synthetic */ double[] a(iReSqtkUVgksUiReSqtkUVg iReSqtkUVgksUiReSqtkUVg2) {
        return iReSqtkUVgksUiReSqtkUVg2.a();
    }
}

