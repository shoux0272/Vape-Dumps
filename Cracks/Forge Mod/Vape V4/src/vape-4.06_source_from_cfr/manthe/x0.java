/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.util.ArrayList;
import java.util.List;
import manthe.Dx;
import manthe.uW;
import manthe.wE;
import manthe.wM;
import manthe.wt;

public class x0
extends wM {
    private wE z;
    private List<wt> A = new ArrayList<wt>();

    public x0(wE wE2) {
        this.z = wE2;
        int n6 = 0;
        while (n6 < 9) {
            wt wt2 = new wt(x0.b.u, x0.b.m, 0);
            int n10 = n6++;
            wt2.c(new Dx(this, wE2, n10));
            this.A.add(wt2);
            this.a(wt2);
        }
    }

    @Override
    public void a() {
        double d10 = this.c() + 10.0;
        double d11 = this.d() + 5.0;
        for (int k = 0; k < this.A.size(); ++k) {
            wt wt2 = this.A.get(k);
            wt2.c(d11);
            wt2.a(d10);
            wt2.a(this.z.m().n().get(k).a());
            d11 += wt2.e();
            wt2.f(this.z.ak() == k);
        }
    }

    @Override
    public void k() {
    }

    @Override
    public void j() {
    }

    @Override
    public void a(uW uW2) {
    }

    @Override
    public void i() {
    }

    @Override
    public double g() {
        return 220.0;
    }

    @Override
    public double h() {
        return 40.0;
    }
}

