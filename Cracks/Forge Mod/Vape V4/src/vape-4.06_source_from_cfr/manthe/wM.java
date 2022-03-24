/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javassist.bytecode.CodeAttribute$RuntimeCopyException;
import manthe.Bo;
import manthe.DO;
import manthe.DR;
import manthe.DU;
import manthe.Ds;
import manthe.bv;
import manthe.mq;
import manthe.o7;
import manthe.on;
import manthe.pe;
import manthe.qL;
import manthe.qp;
import manthe.uW;
import manthe.wc;
import manthe.x4;
import manthe.xZ;
import manthe.xg;
import manthe.xn;
import manthe.zu;

public abstract class wM
implements qL {
    private double u;
    private double m;
    private double x;
    private double d;
    private boolean q;
    private boolean y;
    private wc n;
    private boolean w = true;
    private long j;
    private long r;
    private long s;
    private xn g;
    private List<bv> l = new ArrayList<bv>();
    private List<DO> e = new ArrayList<DO>();
    private List<wM> f = new ArrayList<wM>();
    public final float i = 5.0f;
    public final float h = 8.0f;
    public final double o = 0.15;
    private Ds t;
    private Color p;
    private boolean k = true;
    private static boolean v;

    public void z() {
        this.j();
        for (wM wM2 : this.w()) {
            wM2.z();
        }
    }

    public void C() {
        if (!(this.j == 0L || this.s != this.j || this.x() && this.b())) {
            this.A();
        }
        if (this.g != null) {
            this.g.f(true);
        }
        this.s = this.j;
        this.a();
        for (wM wM2 : this.w()) {
            if (!wM2.b()) continue;
            wM2.C();
        }
    }

    public void A() {
        this.j = 0L;
        this.r = 0L;
        this.g.a(false);
        zu.ah = null;
    }

    public void B() {
        this.k();
        for (wM wM2 : this.w()) {
            if (!wM2.b()) continue;
            wM2.B();
        }
    }

    public void E() {
        if (zu.W == null || zu.W instanceof x4 || zu.W.equals(this)) {
            this.i();
        }
        boolean bl = true;
        for (wM wM2 : this.w()) {
            if (!wM2.b() || !wM2.x() || zu.W != null && !(zu.W instanceof x4) && !zu.W.equals(wM2) || this instanceof wc && ((wc)this).Y() != null && ((wc)this).Y().x() && !(wM2 instanceof xg)) continue;
            wM2.E();
            if (wM2.t() == null || !bl) continue;
            bl = false;
        }
        if (bl && this.g != null) {
            this.p();
        }
    }

    public void b(uW uW2) {
        for (wM wM2 : this.w()) {
            if (!wM2.b() || !wM2.x() || this instanceof wc && ((wc)this).Y() != null && ((wc)this).Y().x() && !(wM2 instanceof xg)) continue;
            wM2.b(uW2);
            if (wM2 instanceof xg) continue;
            return;
        }
        this.a(uW2);
    }

    private void p() {
        if (this.r == 0L) {
            this.r = System.currentTimeMillis();
        }
        this.j += System.currentTimeMillis() - this.r;
        if (this.j >= 2000L) {
            Bo bo2 = o7.b();
            this.g.c(bo2.a);
            this.g.a(bo2.b);
            this.g.a(true);
            zu.ah = this.g;
        }
    }

    public void v() {
        pe.a((float)this.d(), (float)this.c(), 1.0f, (float)this.f(), Color.MAGENTA);
        pe.a((float)this.d(), (float)this.c(), (float)this.e(), 1.0f, Color.MAGENTA);
        pe.a((float)this.d() + (float)this.e(), (float)this.c(), 1.0f, (float)this.f(), Color.MAGENTA);
        pe.a((float)this.d(), (float)this.c() + (float)this.f(), (float)this.e(), 1.0f, Color.MAGENTA);
    }

    public void o() {
        if (!this.y()) {
            return;
        }
        pe.c(this.d(), this.c(), this.e(), this.f(), this.I());
    }

    public boolean x() {
        Bo bo2 = o7.b();
        return this.q().a(bo2);
    }

    public void a(wM ... arrwM) {
        Collections.addAll(this.w(), arrwM);
    }

    public mq s() {
        return on.p.j();
    }

    public mq e(double d10) {
        return on.p.a(d10);
    }

    public DU q() {
        return new DU(this.d(), this.c(), this.e(), this.f());
    }

    public xZ t() {
        return this.g;
    }

    public void a(DO dO2) {
        this.e.add(dO2);
    }

    public void b(bv bv2) {
        this.l.add(bv2);
    }

    public void b(DO dO2) {
        this.e.remove(dO2);
    }

    public void a(bv bv2) {
        this.l.remove(bv2);
    }

    public List<DO> r() {
        return this.e;
    }

    public List<bv> u() {
        return this.l;
    }

    public List<wM> w() {
        return this.f;
    }

    public Color I() {
        if (this.p == null) {
            this.p = wM.b.k;
        }
        return this.p;
    }

    public Ds D() {
        return this.t;
    }

    @Override
    public double d() {
        return this.u;
    }

    @Override
    public double c() {
        return this.m;
    }

    @Override
    public double e() {
        return this.q ? this.x : Math.max(this.x, this.g());
    }

    @Override
    public double f() {
        return this.y ? this.d : Math.max(this.d, this.h());
    }

    @Override
    public boolean b() {
        if (this.t != null && this.t.o() != null && this.t.o() instanceof DR) {
            Ds ds2 = this.D();
            boolean bl = true;
            for (DR dR2 = (DR)this.t.o(); dR2 != null && (bl = dR2.b(ds2)) && dR2.o() != null && dR2.o() instanceof DR; dR2 = (DR)dR2.o()) {
                ds2 = dR2;
            }
            return this.w && bl;
        }
        return this.w;
    }

    public boolean y() {
        return this.k;
    }

    public wc F() {
        return this.n;
    }

    public wM a(String string) {
        if (string.length() < 1) {
            return this;
        }
        this.g = new xn(this, string);
        return this;
    }

    public wM a(xn xn2) {
        this.g = xn2;
        return this;
    }

    public void a(Ds ds2) {
        this.t = ds2;
        ds2.a(this);
        if (ds2.c() != null && ds2.c() instanceof qp) {
            this.a(((qp)ds2.c()).L());
        }
    }

    public void a(wc wc2) {
        this.n = wc2;
    }

    public wM a(Color color) {
        this.p = color;
        return this;
    }

    @Override
    public void c(double d10) {
        this.u = d10;
    }

    @Override
    public void a(double d10) {
        this.m = d10;
    }

    @Override
    public void b(double d10) {
        this.x = d10;
    }

    @Override
    public void d(double d10) {
        this.d = d10;
    }

    public void a(boolean bl) {
        this.w = bl;
    }

    public void e(boolean bl) {
        this.k = bl;
    }

    public void b(boolean bl) {
        this.y = bl;
    }

    public void c(boolean bl) {
        this.q = bl;
    }

    public static void d(boolean bl) {
        v = bl;
    }

    public static boolean G() {
        return v;
    }

    public static boolean H() {
        boolean bl = wM.G();
        return !bl;
    }

    private static CodeAttribute$RuntimeCopyException b(CodeAttribute$RuntimeCopyException codeAttribute$RuntimeCopyException) {
        return codeAttribute$RuntimeCopyException;
    }

    static {
        if (!wM.G()) {
            wM.d(true);
        }
    }
}

