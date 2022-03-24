/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.Ak;
import manthe.bz;
import manthe.pe;
import manthe.uW;
import manthe.wD;
import manthe.wM;
import manthe.wU;
import manthe.we;
import manthe.x3;
import manthe.x8;
import manthe.xg;
import manthe.yI;

public class wv
extends we
implements bz {
    private boolean W;
    private wU V;

    public wv() {
        this.a(wv.b.k);
        this.c(300.0);
        this.a(100.0);
        this.W = true;
        this.a(false);
        this.W().e(false);
        this.W().b("wrap");
        this.a(new x3(this, "newprofiles", "Profiles", 0.7));
        this.a(new wM[]{new x8()});
    }

    @Override
    public void E() {
        if (this.V != null) {
            if (this.V.x()) {
                this.V.E();
            }
            return;
        }
        super.E();
    }

    @Override
    public void b(uW uW2) {
        if (this.V != null) {
            this.V.b(uW2);
            return;
        }
        super.b(uW2);
    }

    @Override
    public void C() {
        super.C();
        if (this.V != null) {
            double d10 = this.V.c() + this.V.f() - (this.c() + this.L());
            if (d10 > 0.0) {
                this.f(this.P() - d10);
            }
            pe.a(this.d(), this.c(), this.e(), Math.min(this.f(), this.L()), yI.a(this.I(), 100));
            this.V.C();
        }
    }

    public void a(Ak ak) {
        this.a(new wM[]{new wU(this, ak)});
        wD.V.b(ak);
    }

    public void b(Ak ak) {
        for (wM wM2 : this.w()) {
            if (!(wM2 instanceof wU) || !((wU)wM2).N().l().equals(ak.l())) continue;
            this.a(wM2);
        }
        wD.V.a(ak);
    }

    @Override
    public void V() {
    }

    @Override
    public void K() {
    }

    @Override
    public void n() {
        this.W = !this.W;
        this.al();
    }

    private void al() {
        for (wM wM2 : this.w()) {
            if (wM2 instanceof xg) continue;
            wM2.a(this.W);
        }
        this.M();
    }

    @Override
    public boolean m() {
        return this.W;
    }

    public wU ak() {
        return this.V;
    }

    public void a(wU wU2) {
        this.V = wU2;
    }

    @Override
    public String ad() {
        return "Profiles";
    }
}

