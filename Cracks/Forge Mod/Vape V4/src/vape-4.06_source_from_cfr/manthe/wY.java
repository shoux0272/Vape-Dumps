/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.awt.Color;
import manthe.DU;
import manthe.i;
import manthe.pe;
import manthe.sY;
import manthe.uW;
import manthe.w2;
import manthe.wC;
import manthe.wJ;
import manthe.wL;
import manthe.wM;
import manthe.wT;
import manthe.we;
import manthe.wf;
import manthe.wr;
import manthe.x2;
import manthe.xM;
import manthe.zu;

public class wY
extends we {
    private i Z = new i(0.15, 0.0, 100.0);
    private i V = new i(0.15, 0.0, 1.0);
    private wf X = new wf("Text GUI", "newtextgui", 0.9, 6);
    private wf Y = new wf("Rearview", "newrearview", 0.9, 7);
    private wf ab = new wf("Duel Info", "newduelinfo", 0.9, 7);
    private wf aa = new wf("Target Info", "newtargetinfo", 0.9, 7);
    private wf W = new wf("Radar", "newradar", 0.9, 7);
    private int ac;

    public wY() {
        this.P = false;
        this.g(false);
        this.a(wY.b.k);
        this.W().e(false);
        this.W().b("wrap");
        xM xM2 = new xM(this, "newoverlays", "Overlays", 0.7);
        xM2.n().m();
        xM2.n().c(new sY(this));
        this.X.a(wL.class);
        this.Y.a(wJ.class);
        this.ab.a(wC.class);
        this.aa.a(wr.class);
        this.W.a(w2.class);
        this.a(xM2);
        this.a((wM)new x2(wY.b.y), new Object[0]);
        this.a(this.X, this.Y, this.ab, this.aa, this.W);
        this.a(false);
        this.j(false);
    }

    @Override
    public void V() {
        wT wT2 = zu.b(wT.class);
        if (wT2 == null) {
            return;
        }
        if (this.ac == 1) {
            this.ac = 2;
            this.Z.c();
            this.V.c();
        }
        if (this.ac == 3) {
            this.ac = 4;
            this.Z.c();
            this.V.c();
        }
        if (this.ac == 4 && this.Z.o().doubleValue() == this.Z.p()) {
            this.ac = 0;
            this.a(false);
            return;
        }
        if (this.V.o().doubleValue() != this.V.n()) {
            this.g(true);
            this.a(new DU(wT2.d(), wT2.c(), wT2.e(), wT2.f()));
            this.c(wT2.d());
            this.a(wT2.c() + wT2.f() - 2.0 - this.f() * this.V.o());
            this.M();
        }
        if (this.d() != wT2.d() || this.c() != wT2.c()) {
            this.a(wT2.d(), wT2.c() + wT2.f() - 2.0 - this.f() * this.V.o());
        }
        this.a(wT2.c() + wT2.f() - 2.0 - this.f() * this.V.o());
        pe.a(wT2.d(), wT2.c(), wT2.e(), wT2.f(), new Color(0, 0, 0, this.Z.o().intValue()));
    }

    @Override
    public void Z() {
    }

    @Override
    public String ad() {
        return "Overlays";
    }

    @Override
    public void a(uW uW2) {
        if (!this.x()) {
            this.ac = 3;
        }
    }

    @Override
    public void K() {
    }

    public wf al() {
        return this.X;
    }

    public wf am() {
        return this.Y;
    }

    public wf ak() {
        return this.ab;
    }

    public wf n() {
        return this.W;
    }

    public int m() {
        return this.ac;
    }

    public void a(int n6) {
        this.ac = n6;
    }

    static int a(wY wY2, int n6) {
        wY2.ac = n6;
        return wY2.ac;
    }
}

