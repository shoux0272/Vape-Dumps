/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.B8;
import manthe.BW;
import manthe.BY;
import manthe.D7;
import manthe.bI;
import manthe.lT;
import manthe.m3;
import manthe.mp;
import manthe.mx;
import manthe.my;
import manthe.nB;
import manthe.on;
import manthe.p1;
import manthe.pd;
import manthe.qo;
import manthe.r1;
import manthe.r6;
import manthe.rV;
import manthe.rf;
import manthe.rg;
import manthe.rl;
import manthe.sb;
import manthe.sz;
import manthe.vf;
import manthe.ya;
import manthe.z;

public class rx
extends r1 {
    private static final double ar = 20.0;
    private rf ap;
    private sb aq;
    private rg ah;
    private rf al;
    private rf an;
    private rf ak;
    private rf ao;
    private r6 ai;
    private ya af = null;
    private ya ag = null;
    private boolean aj = false;
    private boolean am = false;
    private static int[] ae;

    public rx() {
        super("Macros", false);
        this.aj().a(new D7(0.0, 0.0, 4, 1, new pd(0, 0, 0, 0)));
        rf rf2 = new rf(false);
        rf2.a(new D7(0.0, 3.0, 5000, 1, new pd(0, 2, 2, 2)));
        rf2.c(125.0);
        this.d(rf2);
        this.b(rf2);
        this.a(rf2);
        this.c(rf2);
        this.c(100.0);
        this.b(20.0);
    }

    private void b(rf rf2) {
        this.al = new rf(false);
        this.al.a(new D7(0.0, 2.0, 5000, 1, new pd(0, 0, 0, 0)));
        this.al.b(70.0);
        this.ap = new rf(false);
        this.ap.a(new D7(0.0, 0.0, 1, 2, new pd(0, 0, 0, 0)));
        this.ah = new rg("Add", false);
        this.ah.b(12.0);
        this.ah.c(20.0);
        this.ah.a(new lT(this));
        this.aq = new sz(this, 16);
        this.aq.b(12.0);
        this.aq.c(79.0);
        this.aq.a("<item name>");
        this.ap.b(this.aq);
        this.ap.b(this.ah);
        this.ai = new r6(false);
        this.ai.b(130.0);
        this.al.b(this.ap);
        this.al.b(this.ai);
        this.al.a(new bI(this));
        rf2.b(this.al);
    }

    private void a(rf rf2) {
        this.ao = new rf(false);
        this.ao.a(new D7(0.0, 0.0, 5000, 1, new pd(0, 0, 0, 0)));
        this.ao.b(70.0);
        rl rl2 = new rl("Press a key", my.i, 1.0);
        rl2.c(50.0);
        rl2.b(10.0);
        this.ao.b(rl2);
        this.ao.a(new mp(this));
        rf2.b(this.ao);
    }

    private void c(rf rf2) {
        this.an = new rf(false);
        this.an.a(new D7(0.0, 2.0, 5000, 1, new pd(0, 0, 0, 0)));
        this.an.b(70.0);
        this.ak = new rf(false);
        this.ak.a(new D7(0.0, 2.0, 5000, 1, new pd(0, 0, 0, 0)));
        this.ak.b(70.0);
        this.ak.a(new BW(this));
        rl rl2 = new rl("<macro name>", my.i, 0.9);
        rl2.c(50.0);
        rl2.b(10.0);
        rl2.a(new vf(this, rl2));
        rg rg2 = new rg("Add", false);
        rg2.c(50.0);
        rg2.b(10.0);
        rg2.a(new BY(this));
        rg2.a(new mx(this, rg2));
        rg rg3 = new rg("Cancel", false);
        rg3.c(50.0);
        rg3.b(10.0);
        rg3.a(new z(this));
        rg rg4 = new rg("Delete Macro", false);
        rg4.c(50.0);
        rg4.b(10.0);
        rg4.a(new B8(this));
        rg4.a(new nB(this, rg4));
        this.an.b(rl2);
        this.an.b(this.ak);
        this.an.b(rg2);
        this.an.b(rg3);
        this.an.b(rg4);
        this.an.a(new qo(this));
        rf2.b(this.an);
    }

    @Override
    public void c(double d10) {
        super.c(d10 + 3.0);
        this.a(this.aj(), new m3(this, d10));
        this.aq.c(d10 - 2.0 - 20.0);
        this.ah.c(20.0);
    }

    public void c(ya ya2) {
        rf rf2 = new rf(false);
        rf2.c(this.q() - 8.0);
        rf2.a(new D7(1.0, 1.0, 2, 2, new pd(0, 0, 0, 0)));
        new rV(rf2, this, ya2);
        this.ai.d(rf2);
    }

    public void b(ya ya2) {
        rf rf2 = this.ai.A();
        rf2.a((p1)ya2.p());
    }

    @Override
    public boolean a(char c3, int n6) {
        if (this.ag != null) {
            this.ag.d(n6);
            on.p.f().a(this.ag);
            this.ag = null;
            return true;
        }
        return super.a(c3, n6);
    }

    @Override
    public boolean a(int n6, int n10, int n11) {
        if (this.ag != null) {
            this.ag.d(-100 + n11);
            on.p.f().a(this.ag);
            this.ag = null;
            return true;
        }
        return super.a(n6, n10, n11);
    }

    public void p(boolean bl) {
        this.aj = bl;
    }

    public void q(boolean bl) {
        this.am = bl;
    }

    public void a(ya ya2) {
        this.af = ya2;
    }

    static sb j(rx rx2) {
        return rx2.aq;
    }

    static ya a(rx rx2, ya ya2) {
        rx2.ag = ya2;
        return rx2.ag;
    }

    static boolean b(rx rx2, boolean bl) {
        rx2.am = bl;
        return rx2.am;
    }

    static ya b(rx rx2, ya ya2) {
        rx2.af = ya2;
        return rx2.af;
    }

    static rg h(rx rx2) {
        return rx2.ah;
    }

    static ya c(rx rx2) {
        return rx2.af;
    }

    static ya f(rx rx2) {
        return rx2.ag;
    }

    static rf g(rx rx2) {
        return rx2.al;
    }

    static rf d(rx rx2) {
        return rx2.ao;
    }

    static boolean b(rx rx2) {
        return rx2.am;
    }

    static rf i(rx rx2) {
        return rx2.ak;
    }

    static boolean e(rx rx2) {
        return rx2.aj;
    }

    static boolean a(rx rx2, boolean bl) {
        rx2.aj = bl;
        return rx2.aj;
    }

    static rf a(rx rx2) {
        return rx2.an;
    }

    public static void b(int[] arrn) {
        ae = arrn;
    }

    public static int[] al() {
        return ae;
    }

    static {
        if (rx.al() == null) {
            rx.b(new int[2]);
        }
    }
}

