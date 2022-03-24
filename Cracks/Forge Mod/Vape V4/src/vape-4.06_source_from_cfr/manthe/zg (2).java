/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import manthe.A5;
import manthe.AO;
import manthe.CQ;
import manthe.DF;
import manthe.Da;
import manthe.Y;
import manthe.cB;
import manthe.ds;
import manthe.eJ;
import manthe.en;
import manthe.ep;
import manthe.fX;
import manthe.f_;
import manthe.fn;
import manthe.ft;
import manthe.km;
import manthe.ks;
import manthe.ky;
import manthe.on;
import manthe.y5;

public class zg
extends y5 {
    private final DF z = DF.a(this, "Speed", "#.#", "", 3.0, 4.1, 5.0);
    private int y;
    private int E;
    private int D;
    private double u;
    private double A;
    private boolean B;
    private boolean w;
    private boolean C;
    private Queue<Object> v = new ConcurrentLinkedQueue<Object>();
    private AO F = new AO();
    private double x = Math.random();

    public zg() {
        super("FastFly", 11924545, CQ.f, "May not work on certain anti-cheats.");
        this.a(this.z);
        this.u = 0.27999999999999997;
        this.w = false;
        this.A = 0.0;
    }

    @Override
    public boolean n() {
        return true;
    }

    public boolean U() {
        return !this.F.a(150L);
    }

    @Override
    public void s() {
        on.p.t().a(this);
        this.u = 0.27999999999999997;
        this.w = false;
        this.A = 0.0;
        this.B = false;
        this.E = 0;
        this.x = Math.random();
        this.y = 7;
        this.D = 50;
        this.T();
        ep ep2 = ds.k().a8();
        boolean bl = ep2.i();
        boolean bl2 = ep2.h();
        float f10 = ep2.f();
        ep2.c(true);
        ep2.a(true);
        ep2.b(ep2.f() * 5.0f);
        ep2.c(bl);
        ep2.a(bl2);
        ep2.b(f10);
    }

    @Override
    public void J() {
        this.E = 0;
        if (this.v.size() > 0) {
            this.S();
        }
        ds.O().a(1.0f);
    }

    @Override
    public void a(ky ky2) {
        fn fn2 = ky2.getPacket();
        if (fn2.a(A5.U)) {
            this.V();
            this.z();
        }
        if (fn2.a(A5.bN) && !this.C && this.a(ds.k()) && !ds.k().J() && this.D > 0) {
            this.v.add(ky2.getPacketInstance());
            ky2.a(true);
            ky2.setPacket(null);
            this.F.d();
            on.a("Choking");
        }
    }

    @Override
    public void a(ks ks2) {
        if (!ks2.c()) {
            return;
        }
        eJ eJ2 = ds.k();
        if (eJ2.aF() == 0.0f && eJ2.ay() == 0.0f || eJ2.i().e() || eJ2.H()) {
            this.u = 0.27999999999999997;
            return;
        }
        --this.y;
        if (this.y > 4) {
            ks2.setX(0.0);
            ks2.setZ(0.0);
            return;
        }
        if (eJ2.J()) {
            if (this.w) {
                this.u *= 1.83949644 + 9.238423E-6 * Math.random();
                double d10 = 0.42f;
                if (eJ2.a(fX.k())) {
                    d10 += (double)((float)(eJ2.b(fX.k()).h() + 1) * 0.1f);
                }
                eJ2.l(d10);
                ks2.setY(d10);
            } else {
                double d11 = 0.27999999999999997;
                if (eJ2.a(fX.q())) {
                    int n6 = eJ2.b(fX.q()).h();
                    d11 *= 1.0 + 0.105 * (double)(n6 + 1);
                }
                this.u = this.z.a() * d11;
            }
        } else if (this.w) {
            if (this.A < 1.73949644) {
                this.A = 1.73949644;
            }
            this.u = this.A - (double)((float)(0.66 * (this.A - 0.27999999999999997)));
            this.B = true;
        } else {
            this.u = this.A - this.A / 159.0;
            ds.O().a(0.85f + (float)((double)0.1f * Math.random()));
            ks2.setY(0.0);
            eJ2.l(0.0);
            if (this.B) {
                this.B = false;
            }
        }
        this.w = eJ2.J();
        this.u = Math.max(this.u, 0.27999999999999997);
        ks2.setX(-(Math.sin(this.b(eJ2)) * this.u));
        ks2.setZ(Math.cos(this.b(eJ2)) * this.u);
    }

    @Override
    public void a(km km2) {
        if (km2.a() == Da.b) {
            eJ eJ2 = ds.k();
            this.A = Math.hypot(eJ2.z() - eJ2.aq(), eJ2.g() - eJ2.ap());
            if (!eJ2.J()) {
                --this.D;
            }
            if (this.v.size() > 0 && this.D == 0) {
                this.S();
                this.D = 50;
            }
            if (!eJ2.J() && this.y <= 3) {
                ++this.E;
                double d10 = 0.0;
                if (this.E == 1) {
                    d10 = 0.00883f + (float)Y.a((double)(4.2E-6f * (float)this.x), 7);
                } else if (this.E == 2) {
                    d10 = 0.0133f + (float)Y.a((double)(2.8E-6f * (float)this.x), 6);
                } else if (this.E == 3) {
                    d10 = 0.0179f + (float)Y.a((double)(1.3E-6f * (float)this.x), 6);
                } else if (this.E == 4) {
                    d10 = 0.0216f + (float)Y.a((double)(6.2E-6f * (float)this.x), 6);
                } else if (this.E == 5) {
                    this.E = 0;
                    d10 = 0.0252f + (float)Y.a((double)(2.1E-6f * (float)this.x), 6);
                }
                km.setY(km.getY() + d10);
                km.setOnGround(false);
                eJ2.e(false);
            }
        }
    }

    private void T() {
        eJ eJ2 = ds.k();
        if (!eJ2.v() || !eJ2.J()) {
            return;
        }
        double d10 = 0.0;
        double d11 = 0.7 * Math.random();
        for (int k = 0; k < 50; ++k) {
            double d12 = 0.10234f + 3.9E-4f * ((float)Math.min(k, 39) / 39.0f);
            double d13 = 0.04093f;
            ft ft2 = cB.h ? ft.a(eJ2.z(), eJ2.l() + d13 + (d12 - d13) * (double)0.65f, eJ2.g(), false) : ft.a(eJ2.z(), eJ2.s().l() + d13 + (d12 - d13) * (double)0.65f, eJ2.l() + d13 + (d12 - d13) * (double)0.65f, eJ2.g(), false);
            ft ft3 = cB.h ? ft.a(eJ2.z(), eJ2.l() + d12, eJ2.g(), false) : ft.a(eJ2.z(), eJ2.s().l() + d12, eJ2.l() + d12, eJ2.g(), false);
            f_ f_2 = f_.a(false);
            ft ft4 = cB.h ? ft.a(eJ2.z(), eJ2.l() + d12, eJ2.g(), false) : ft.a(eJ2.z(), eJ2.s().l() + d13, eJ2.l() + d13, eJ2.g(), false);
            this.C = true;
            eJ2.bp().a(ft2);
            eJ2.bp().a(ft3);
            eJ2.bp().a(f_2);
            eJ2.bp().a(ft4);
            this.C = false;
            if ((d10 += d12 - d13) >= 3.0 + d11) break;
        }
    }

    private void S() {
        on.a("Sent");
        while (this.v.peek() != null) {
            this.C = true;
            ds.k().bp().a(new fn(this.v.poll()));
            this.C = false;
        }
        this.V();
    }

    private void V() {
        this.v.clear();
    }

    private float b(eJ eJ2) {
        float f10 = eJ2.U();
        if (eJ2.aF() < 0.0f) {
            f10 += 180.0f;
        }
        float f11 = eJ2.aF() < 0.0f ? -0.5f : (eJ2.aF() > 0.0f ? 0.5f : 1.0f);
        if (eJ2.ay() > 0.0f) {
            f10 -= 90.0f * f11;
        }
        if (eJ2.ay() < 0.0f) {
            f10 += 90.0f * f11;
        }
        return f10 *= (float)Math.PI / 180;
    }

    private boolean a(eJ eJ2) {
        en en2 = ds.s();
        return en2.j().h() || en2.A().h() || en2.g().h() || en2.n().h() || eJ2.bg().j() != 0.0f || eJ2.bg().h() != 0.0f;
    }
}

