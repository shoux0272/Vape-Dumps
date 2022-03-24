/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.util.Iterator;
import manthe.Ak;
import manthe.Ay;
import manthe.D3;
import manthe.D8;
import manthe.my;
import manthe.ng;
import manthe.p1;
import manthe.pd;
import manthe.r1;
import manthe.r6;
import manthe.rf;
import manthe.rl;
import manthe.sg;

public class rX
extends r1 {
    private rf ae;
    private rf af;
    private r6 ag;
    private r6 ah;

    public rX() {
        super("Public Publish Profiles", false);
        this.aj().a(new D3(0.0, 0.0, 5000, 1, new pd(0, 0, 0, 0)));
        this.an();
        this.al();
        this.c(90.0);
        this.b(20.0);
        this.a(new D8(this));
    }

    private void a(r6 r62) {
        Iterator<p1> iterator = r62.A().v().iterator();
        while (iterator.hasNext()) {
            p1 p12 = iterator.next();
            if (!(p12 instanceof sg)) continue;
            iterator.remove();
        }
    }

    private void an() {
        this.af = new rf(false);
        this.af.a(new D3(0.0, 0.0, 5000, 1, new pd(0, 2, 0, 0)));
        this.d(this.af);
        rl rl2 = new rl("Your Private Profiles:", my.i, 0.7);
        rl2.c(85.0);
        rl2.b(12.0);
        this.af.b(rl2);
        this.ah = new r6(false);
        this.ah.c(100.0);
        this.ah.b(70.0);
        this.d(this.ah);
    }

    private void al() {
        this.ae = new rf(false);
        this.ae.a(new D3(0.0, 0.0, 5000, 1, new pd(0, 0, 0, 0)));
        this.d(this.ae);
        rl rl2 = new rl("Your Public Profiles:", my.i, 0.7);
        rl2.b("");
        rl2.a(new Ay(this, rl2));
        rl2.c(85.0);
        rl2.b(12.0);
        this.ae.b(rl2);
        this.ag = new r6(false);
        this.ag.c(100.0);
        this.ag.b(70.0);
        this.d(this.ag);
        for (int k = 0; k < 25; ++k) {
            Ak ak = new Ak("public  " + k, "6.9");
            sg sg2 = new sg(ak, 85.0);
            this.ag.d(sg2);
            this.ag.c();
        }
    }

    @Override
    public void c(double d10) {
        super.c(d10);
        for (p1 p12 : this.aj().v()) {
            p12.c(d10);
            if (!(p12 instanceof r6)) continue;
            r6 r62 = (r6)p12;
            for (p1 p13 : r62.A().v()) {
                p13.c(d10 - 4.0);
            }
        }
    }

    @Override
    public void b(double d10) {
        super.b(d10);
        this.ag.b((d10 -= 24.0) * 0.5);
        this.ah.b(d10 * 0.5);
        this.ae.b(12.0);
        this.af.b(12.0);
    }

    @Override
    public void c() {
        this.d(false);
        this.f(false);
        this.Z().a(false);
        this.a(ng.d.t() + ng.d.q() + 3.0);
        this.d(ng.d.k());
        this.b(ng.d.b());
        super.c();
    }

    @Override
    public void c(boolean bl) {
        super.c(false);
    }

    public void b(Ak ak) {
        if (ak.r().equalsIgnoreCase("default")) {
            return;
        }
        rf rf2 = new rf(false);
        rf2.a(new D3(0.0, 0.0, 1, 1, new pd(1, 2, 1, 2)));
        sg sg2 = new sg(ak, 85.0);
        rf2.b(sg2);
        if (ak.k()) {
            this.ag.d(rf2);
            this.ag.c();
        } else {
            this.ah.d(rf2);
            this.ah.c();
        }
    }

    public void a(Ak ak) {
        sg sg2;
        rf rf2;
        p1 p12 = null;
        for (p1 p13 : this.ah.A().v()) {
            if (!(p13 instanceof rf) || (rf2 = (rf)p13).v().isEmpty() || !(rf2.v().get(0) instanceof sg) || !(sg2 = (sg)rf2.v().get(0)).a().l().toString().equalsIgnoreCase(ak.l().toString())) continue;
            p12 = p13;
        }
        if (p12 == null) {
            for (p1 p13 : this.ag.A().v()) {
                if (!(p13 instanceof rf) || (rf2 = (rf)p13).v().isEmpty() || !(rf2.v().get(0) instanceof sg) || !(sg2 = (sg)rf2.v().get(0)).a().l().toString().equalsIgnoreCase(ak.l().toString())) continue;
                p12 = p13;
            }
        }
        if (p12 != null) {
            this.ah.A().a(p12);
            this.ah.c();
            this.ag.A().a(p12);
            this.ag.c();
        }
    }

    public r6 ao() {
        return this.ag;
    }

    public r6 am() {
        return this.ah;
    }

    static r6 a(rX rX2) {
        return rX2.ag;
    }

    static void a(rX rX2, r6 r62) {
        rX2.a(r62);
    }

    static r6 b(rX rX2) {
        return rX2.ah;
    }
}

