/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.util.ArrayList;
import java.util.List;
import manthe.oa;
import manthe.pe;
import manthe.qz;
import manthe.uW;
import manthe.vW;
import manthe.w0;
import manthe.w2;
import manthe.wC;
import manthe.wJ;
import manthe.wL;
import manthe.wM;
import manthe.wV;
import manthe.wb;
import manthe.wr;
import manthe.yI;
import manthe.zu;

public class xL
extends wM {
    private wV z = new wV("newfavorites", 0.8);
    private wV A;
    private List<oa> B = new ArrayList<oa>();

    public xL() {
        this.a(xL.b.k);
        this.A = new wb(this, "newoverlays", 0.6);
        this.A.c(new vW(this));
        this.A.a("Open overlays menu");
        this.z.c(new qz(this));
        this.z.a("Favorites");
        this.a(this.z, this.A);
        this.B.add(new oa("newtextgui", zu.b(wL.class), 5));
        this.B.add(new oa("newrearview", zu.b(wJ.class), 6));
        this.B.add(new oa("newduelinfo", zu.b(wC.class), 6));
        this.B.add(new oa("newtargetinfo", zu.b(wr.class), 7));
        this.B.add(new oa("newradar", zu.b(w2.class), 7));
    }

    @Override
    public void a() {
        pe.c(this.d(), this.c(), this.e(), this.f(), this.I());
        this.z.c(this.d() + 5.0);
        this.z.a(this.c());
        this.z.d(this.f());
        this.z.d(zu.b(w0.class).b() ? (this.z.x() ? xL.b.h : xL.b.w) : null);
        this.A.c(this.d() + this.e() - 7.5 - 8.0);
        this.A.a(this.c());
        this.A.d(this.f());
        boolean bl = false;
        double d10 = this.c() + this.f() / 2.0;
        double d11 = (float)(this.d() + this.e() - 17.5 - 8.0);
        for (oa oa2 : this.B) {
            if (!oa2.b.b()) continue;
            pe.a(oa2.c, d11, d10, (double)oa2.a, (double)oa2.a, xL.b.o);
            bl = true;
            d11 -= (double)(5.0f + (float)oa2.a);
        }
        this.A.d(bl ? (this.A.x() ? yI.a(b.e(), 10.0) : b.e()) : null);
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
        return 110.0;
    }

    @Override
    public double h() {
        return 20.0;
    }
}

