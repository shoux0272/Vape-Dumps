/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Keyboard
 */
import a.a;
import org.lwjgl.input.Keyboard;

public class iReSqtkUVgYlriReSqtkUVg
extends iReSqtkUVgJZmiReSqtkUVg {
    private boolean b;
    private int c;
    private iReSqtkUVgPzKiReSqtkUVg d = new iReSqtkUVgPzKiReSqtkUVg();
    private iReSqtkUVgtBCiReSqtkUVg e;
    private double f;
    private double g;
    private double h;
    private double i;
    private double j;
    private double k;
    private float l;
    private float m;
    private double n;
    private double o;
    private double p;
    private double q;
    private double r;
    private iReSqtkUVgsMgiReSqtkUVg s;
    private iReSqtkUVgsMgiReSqtkUVg t;
    private double u;
    private iReSqtkUVgkzHiReSqtkUVg v = iReSqtkUVgkzHiReSqtkUVg.a((Object)this, "Speed", "#.#", "", 1.0, 3.0, 5.0, 0.1);
    private iReSqtkUVgoRmiReSqtkUVg w = iReSqtkUVgoRmiReSqtkUVg.a((Object)this, "Spawn Fake", true, "Spawns an entity on where your player is server-sided.");

    public iReSqtkUVgYlriReSqtkUVg() {
        super("Freecam", 3248986, iReSqtkUVgqTOiReSqtkUVg.g, "Lets you fly and clip through walls freely\nwithout moving your player server-sided.");
        this.a(this.v, this.w);
    }

    @Override
    public void a(iReSqtkUVgjuiiReSqtkUVg iReSqtkUVgjuiiReSqtkUVg2) {
        if (iReSqtkUVgeLLiReSqtkUVg.g().a() == null) {
            return;
        }
        if (this.w.i().booleanValue() && iReSqtkUVgeLLiReSqtkUVg.g().a(-420) == null) {
            iReSqtkUVgeLLiReSqtkUVg.g().a(-420, this.e);
            this.e.s(this.l);
        }
        this.A();
        if (this.d.a(10L)) {
            this.C();
            this.d.b();
        }
        this.z();
        iReSqtkUVgeLLiReSqtkUVg.a(null);
        if (this.s == null) {
            this.s = new iReSqtkUVgsMgiReSqtkUVg(a.a.grh());
        }
        iReSqtkUVgeLLiReSqtkUVg.g().h().a(this.s);
    }

    @Override
    public void b(iReSqtkUVgjuiiReSqtkUVg iReSqtkUVgjuiiReSqtkUVg2) {
        if (iReSqtkUVgeLLiReSqtkUVg.g().a() == null) {
            return;
        }
        this.B();
        iReSqtkUVgeLLiReSqtkUVg.e().e(iReSqtkUVgeLLiReSqtkUVg.e().G());
        iReSqtkUVgeLLiReSqtkUVg.e().d(iReSqtkUVgeLLiReSqtkUVg.e().F());
        if (this.e != null) {
            iReSqtkUVgtlXiReSqtkUVg iReSqtkUVgtlXiReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.e();
            this.e.a(iReSqtkUVgtlXiReSqtkUVg2.z(), iReSqtkUVgVUTiReSqtkUVg.a ? iReSqtkUVgtlXiReSqtkUVg2.A() : iReSqtkUVgtlXiReSqtkUVg2.A() - 1.5, iReSqtkUVgtlXiReSqtkUVg2.B(), this.l, this.m);
        }
        iReSqtkUVgeLLiReSqtkUVg.g().h().a(new iReSqtkUVgsMgiReSqtkUVg(null));
    }

    @Override
    public void g() {
        this.y();
        this.b = true;
        this.c = iReSqtkUVgeLLiReSqtkUVg.i().p();
        iReSqtkUVgeLLiReSqtkUVg.i().a(0);
        if (this.w.i().booleanValue()) {
            iReSqtkUVgtlXiReSqtkUVg iReSqtkUVgtlXiReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.e();
            this.e = iReSqtkUVgtBCiReSqtkUVg.a(iReSqtkUVgeLLiReSqtkUVg.g(), iReSqtkUVgeLLiReSqtkUVg.e().be());
            this.e.a(iReSqtkUVgtlXiReSqtkUVg2, true);
            this.x();
            this.e.s(this.l);
            iReSqtkUVgeLLiReSqtkUVg.g().a(-420, this.e);
            iReSqtkUVgtlXiReSqtkUVg2.h(0.0);
            iReSqtkUVgtlXiReSqtkUVg2.i(0.0);
            iReSqtkUVgtlXiReSqtkUVg2.j(0.0);
        }
        iReSqtkUVgeLLiReSqtkUVg.w().d();
    }

    private void x() {
        iReSqtkUVgtlXiReSqtkUVg iReSqtkUVgtlXiReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.e();
        this.e.a(iReSqtkUVgtlXiReSqtkUVg2.z(), iReSqtkUVgVUTiReSqtkUVg.a ? iReSqtkUVgtlXiReSqtkUVg2.A() : iReSqtkUVgtlXiReSqtkUVg2.A() - 1.5, iReSqtkUVgtlXiReSqtkUVg2.B(), iReSqtkUVgtlXiReSqtkUVg2.F(), iReSqtkUVgtlXiReSqtkUVg2.G());
    }

    @Override
    public void h() {
        iReSqtkUVgeLLiReSqtkUVg.e().f(this.l);
        iReSqtkUVgeLLiReSqtkUVg.e().g(this.m);
        iReSqtkUVgeLLiReSqtkUVg.i().a(this.c);
        if (this.e != null) {
            iReSqtkUVgeLLiReSqtkUVg.g().a(this.e);
        }
    }

    private void y() {
        this.n = iReSqtkUVgeLLiReSqtkUVg.e().z();
        this.o = iReSqtkUVgeLLiReSqtkUVg.e().A();
        this.p = iReSqtkUVgeLLiReSqtkUVg.e().B();
        this.q = iReSqtkUVgeLLiReSqtkUVg.e().Q();
        this.r = iReSqtkUVgeLLiReSqtkUVg.e().R();
        this.u = iReSqtkUVgeLLiReSqtkUVg.e().S();
        this.l = iReSqtkUVgeLLiReSqtkUVg.e().F();
        this.m = iReSqtkUVgeLLiReSqtkUVg.e().G();
        this.b = false;
    }

    @Override
    public void a(iReSqtkUVglBNiReSqtkUVg iReSqtkUVglBNiReSqtkUVg2) {
        if (this.b) {
            this.y();
        }
        if (iReSqtkUVgeLLiReSqtkUVg.f().c()) {
            return;
        }
        int n = iReSqtkUVgeLLiReSqtkUVg.i().g().d();
        int n2 = iReSqtkUVgeLLiReSqtkUVg.i().h().d();
        int n3 = iReSqtkUVgeLLiReSqtkUVg.i().i().d();
        int n4 = iReSqtkUVgeLLiReSqtkUVg.i().j().d();
        int n5 = iReSqtkUVgeLLiReSqtkUVg.i().k().d();
        int n6 = iReSqtkUVgeLLiReSqtkUVg.i().l().d();
        iReSqtkUVgqzriReSqtkUVg.a(n, false);
        iReSqtkUVgqzriReSqtkUVg.a(n2, false);
        iReSqtkUVgqzriReSqtkUVg.a(n3, false);
        iReSqtkUVgqzriReSqtkUVg.a(n4, false);
        iReSqtkUVgqzriReSqtkUVg.a(n5, false);
        iReSqtkUVgqzriReSqtkUVg.a(n6, false);
    }

    @Override
    public void b(iReSqtkUVglBNiReSqtkUVg iReSqtkUVglBNiReSqtkUVg2) {
        if (this.b) {
            this.y();
        }
    }

    private void z() {
        iReSqtkUVgeLLiReSqtkUVg.e().n(this.n);
        iReSqtkUVgeLLiReSqtkUVg.e().k(this.q);
        iReSqtkUVgeLLiReSqtkUVg.e().o(this.o);
        iReSqtkUVgeLLiReSqtkUVg.e().l(this.r);
        iReSqtkUVgeLLiReSqtkUVg.e().p(this.p);
        iReSqtkUVgeLLiReSqtkUVg.e().m(this.u);
    }

    private void A() {
        this.f = iReSqtkUVgeLLiReSqtkUVg.e().z();
        this.g = iReSqtkUVgeLLiReSqtkUVg.e().Q();
        this.h = iReSqtkUVgeLLiReSqtkUVg.e().A();
        this.i = iReSqtkUVgeLLiReSqtkUVg.e().R();
        this.j = iReSqtkUVgeLLiReSqtkUVg.e().B();
        this.k = iReSqtkUVgeLLiReSqtkUVg.e().S();
    }

    private void B() {
        iReSqtkUVgeLLiReSqtkUVg.e().n(this.f);
        iReSqtkUVgeLLiReSqtkUVg.e().k(this.g);
        iReSqtkUVgeLLiReSqtkUVg.e().o(this.h);
        iReSqtkUVgeLLiReSqtkUVg.e().l(this.i);
        iReSqtkUVgeLLiReSqtkUVg.e().p(this.j);
        iReSqtkUVgeLLiReSqtkUVg.e().m(this.k);
    }

    private void C() {
        boolean bl;
        if (iReSqtkUVgeLLiReSqtkUVg.f().c()) {
            return;
        }
        int n = iReSqtkUVgeLLiReSqtkUVg.i().g().d();
        int n2 = iReSqtkUVgeLLiReSqtkUVg.i().h().d();
        int n3 = iReSqtkUVgeLLiReSqtkUVg.i().i().d();
        int n4 = iReSqtkUVgeLLiReSqtkUVg.i().j().d();
        double d2 = this.v.i() / 5.0;
        if (iReSqtkUVgVUTiReSqtkUVg.a(iReSqtkUVgeLLiReSqtkUVg.i().k()) && iReSqtkUVgeLLiReSqtkUVg.y()) {
            this.o += d2;
            this.r += d2;
        } else if (iReSqtkUVgVUTiReSqtkUVg.a(iReSqtkUVgeLLiReSqtkUVg.i().l()) && iReSqtkUVgeLLiReSqtkUVg.y()) {
            this.o -= d2;
            this.r -= d2;
        }
        double d3 = iReSqtkUVgeLLiReSqtkUVg.e().F() + 90.0f;
        boolean bl2 = Keyboard.isKeyDown((int)n) && iReSqtkUVgeLLiReSqtkUVg.y();
        boolean bl3 = Keyboard.isKeyDown((int)n2) && iReSqtkUVgeLLiReSqtkUVg.y();
        boolean bl4 = Keyboard.isKeyDown((int)n3) && iReSqtkUVgeLLiReSqtkUVg.y();
        boolean bl5 = bl = Keyboard.isKeyDown((int)n4) && iReSqtkUVgeLLiReSqtkUVg.y();
        if (bl2) {
            if (bl4) {
                d3 -= 45.0;
            } else if (bl) {
                d3 += 45.0;
            }
        } else if (bl3) {
            d3 += 180.0;
            if (bl4) {
                d3 += 45.0;
            } else if (bl) {
                d3 -= 45.0;
            }
        } else if (bl4) {
            d3 -= 90.0;
        } else if (bl) {
            d3 += 90.0;
        }
        if (bl2 || bl4 || bl3 || bl) {
            this.n += Math.cos(Math.toRadians(d3)) * d2;
            this.p += Math.sin(Math.toRadians(d3)) * d2;
            this.q += Math.cos(Math.toRadians(d3)) * d2;
            this.u += Math.sin(Math.toRadians(d3)) * d2;
        }
    }

    @Override
    public void a(iReSqtkUVglTuiReSqtkUVg iReSqtkUVglTuiReSqtkUVg2) {
        if (iReSqtkUVglTuiReSqtkUVg2.a().toString().toUpperCase().equals("BLOCK")) {
            iReSqtkUVglTuiReSqtkUVg2.b().d(true);
        }
    }
}

