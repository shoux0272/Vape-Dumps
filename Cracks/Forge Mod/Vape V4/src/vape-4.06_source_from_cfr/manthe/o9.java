/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.util.ArrayList;
import java.util.List;
import manthe.du;
import manthe.pA;
import manthe.zS;

class o9 {
    private List<double[]> a;
    private int b;
    final zS c;

    private o9(zS zS2, double d10, double d11) {
        this.c = zS2;
        this.a = new ArrayList<double[]>();
        this.a.add(new double[]{d10, d11});
    }

    private o9 a(double d10, double d11, int n6) {
        if (n6 - this.b > 5) {
            this.a.clear();
        }
        this.b = n6;
        this.a.add(new double[]{d10, d11});
        if (this.a.size() > 6) {
            ArrayList arrayList = new ArrayList(du.a(this.a));
            this.a.clear();
            for (int k = 0; k < 6 && k < arrayList.size(); ++k) {
                this.a.add((double[])arrayList.get(k));
            }
            this.a = du.a(this.a);
        }
        return this;
    }

    private double[] a() {
        int n6 = this.a.size();
        double d10 = 0.0;
        double d11 = 0.0;
        for (double[] arrd : this.a) {
            d10 += arrd[0];
            d11 += arrd[1];
        }
        return new double[]{d10 / (double)n6, d11 / (double)n6};
    }

    static o9 a(o9 o92, double d10, double d11, int n6) {
        return o92.a(d10, d11, n6);
    }

    o9(zS zS2, double d10, double d11, pA pA2) {
        this(zS2, d10, d11);
    }

    static double[] a(o9 o92) {
        return o92.a();
    }
}

