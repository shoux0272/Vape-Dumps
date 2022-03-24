/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.awt.Color;
import javassist.bytecode.CodeAttribute$RuntimeCopyException;
import manthe.DE;
import manthe.DX;
import manthe.mq;
import manthe.on;
import manthe.pb;
import manthe.uW;
import manthe.wM;
import manthe.x5;
import manthe.xn;
import manthe.xu;

public class xd
extends wM {
    private xu C;
    private DE B;
    private Color[] z;
    private DX A;
    private pb E;
    private static int D;

    public xd(DE dE2) {
        this.B = dE2;
        this.a(dE2);
        Color[] arrcolor = new Color[]{new Color(189, 0, 1), new Color(253, 63, 63), new Color(215, 162, 50), new Color(254, 254, 62), new Color(0, 191, 4), new Color(64, 253, 62), new Color(65, 255, 254), new Color(0, 190, 189), new Color(1, 1, 187), new Color(61, 64, 255), new Color(254, 63, 255), new Color(190, 0, 190), new Color(255, 255, 255), new Color(190, 190, 190), new Color(63, 63, 63), new Color(17, 17, 17)};
        this.z = arrcolor;
        this.C = new x5(this, "Team color", dE2, arrcolor);
        this.C.a(this.I());
        this.C.g(true);
        this.C.a((xn)null);
        this.a(this.C);
        this.A = on.p.t().d;
    }

    @Override
    public void a() {
        this.o();
        this.C.c(this.d());
        this.C.a(this.c());
        mq mq2 = this.e(0.7);
        String string = this.A.v().H().substring(2);
        mq2.a(string, this.d() + this.e() - 5.0 - mq2.b(string), this.c() + 5.0, xd.b.r);
    }

    @Override
    public void k() {
    }

    private void n() {
        if (this.E == null) {
            this.E = this.A.v();
            return;
        }
        pb pb2 = this.A.v();
        if (!this.E.equals(pb2)) {
            this.C.a(this.A.w());
        }
    }

    @Override
    public void j() {
        this.A.b(true);
        this.C.R().b(true);
        this.B.b(true);
        this.n();
        if (this.A.w() != this.C.W()) {
            this.A.a(this.C.W());
        }
        this.E = this.A.v();
        this.B.b(false);
        this.C.R().b(false);
        this.A.b(false);
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
        return 25.0;
    }

    public static void b(int n6) {
        D = n6;
    }

    public static int l() {
        return D;
    }

    public static int m() {
        int n6 = xd.l();
        if (n6 == 0) {
            return 122;
        }
        return 0;
    }

    private static CodeAttribute$RuntimeCopyException a(CodeAttribute$RuntimeCopyException codeAttribute$RuntimeCopyException) {
        return codeAttribute$RuntimeCopyException;
    }

    static {
        if (xd.l() == 0) {
            xd.b(103);
        }
    }
}

