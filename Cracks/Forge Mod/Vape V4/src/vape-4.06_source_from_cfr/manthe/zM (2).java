/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.AO;
import manthe.CQ;
import manthe.DB;
import manthe.DF;
import manthe.DX;
import manthe.Ds;
import manthe.cB;
import manthe.ds;
import manthe.eJ;
import manthe.fX;
import manthe.gl;
import manthe.km;
import manthe.ks;
import manthe.on;
import manthe.pb;
import manthe.y5;

public class zM
extends y5 {
    private final pb v = new pb("AntiCheat");
    private final pb E = new pb("Normal");
    private final DF z = DF.a(this, "Speed", "#.#", "", 0.1, 0.5, 5.0, 0.1, "Speed for Normal fly mode.");
    private final DF B = DF.a(this, "Vertical Speed", "#.#", "", 0.1, 0.2, 5.0, 0.1, "Speed for Normal vertical fly mode.");
    private final DF w = DF.a((Object)this, "Boost", "#.##", "x", 1.0, 1.25, 1.5, 0.01);
    private final DX u = DX.a((Object)this, "Mode", this.E, this.E);
    private final DB x = DB.a((Object)this, "Boost", false, "Increases fly speed\nYou will not be able to fly infinitely with this enabled.");
    private final AO C = new AO();
    private final double y;
    private int D;
    private int A;

    public zM() {
        super("Fly", 49630, CQ.f, "Makes you go zoom.");
        this.x.a(new Ds[]{this.w});
        this.a(this.u, this.z, this.B, this.x, this.w);
        this.y = this.a(6969.0, -6969.0) / 2.0E15;
    }

    @Override
    public boolean n() {
        return true;
    }

    @Override
    public void s() {
        on.p.t().a(this);
        ds.O().a(1.0f);
        this.D = -1;
        if (this.x.u().booleanValue() && this.C.a(5000L)) {
            this.A = 30;
        }
    }

    @Override
    public void J() {
        ds.O().a(1.0f);
    }

    @Override
    public void a(km km2) {
        if (km2.c()) {
            eJ eJ2 = ds.k();
            km.setOnGround(false);
            eJ2.e(false);
        }
    }

    @Override
    public void a(ks ks2) {
        double d10;
        if (!ks2.c()) {
            return;
        }
        this.a(this.u.v().H());
        eJ eJ2 = ds.k();
        gl gl2 = ds.O();
        double d11 = d10 = cB.h ? eJ2.s().l() : eJ2.l();
        if (this.u.v() == this.v) {
            ks2.setY(0.0);
            eJ2.l(0.0);
            this.a(ks2, this.S());
            if (this.x.u().booleanValue()) {
                --this.A;
                if (this.C.a(7000L)) {
                    this.C.d();
                }
                float f10 = this.w.a().floatValue();
                if (this.A > 0 && f10 > 1.0f && !this.C.a(7000L)) {
                    gl2.a(1.0f + f10);
                    if (this.A < 10) {
                        float f11 = this.A / 10;
                        if ((double)f11 > 0.5) {
                            f11 = 1.0f;
                        }
                        gl2.a(1.0f + f10 * f11);
                    }
                } else {
                    gl2.a(1.0f);
                }
            }
            ++this.D;
            if (this.D == 1) {
                eJ2.a(eJ2.z(), d10 + 9.6918752349782E-13 + this.y, eJ2.g(), eJ2.U(), eJ2.K());
            }
            if (this.D == 2) {
                eJ2.a(eJ2.z(), d10 - (9.6918752349782E-13 + this.y), eJ2.g(), eJ2.U(), eJ2.K());
                this.D = 0;
            }
        } else if (this.u.v() == this.E) {
            double d12 = ds.s().l().h() ? this.B.a() : (ds.s().u().h() ? -this.B.a().doubleValue() : 0.0);
            ks2.setY(d12);
            eJ2.l(d12);
            eJ2.a(eJ2.z(), d10, eJ2.g(), eJ2.U(), eJ2.K());
            this.a(ks2, Math.max(this.z.a(), this.S()));
        }
    }

    public double S() {
        double d10 = 0.2873;
        if (ds.k().a(fX.q())) {
            int n6 = ds.k().b(fX.q()).h();
            d10 *= 1.0 + 0.2 * (double)(n6 + 1);
        }
        return d10;
    }

    private void a(ks ks2, double d10) {
        eJ eJ2 = ds.k();
        double d11 = eJ2.bg().j();
        double d12 = eJ2.bg().h();
        float f10 = eJ2.U();
        if (d11 == 0.0 && d12 == 0.0) {
            ks2.setX(0.0).setZ(0.0);
        } else {
            if (d11 != 0.0) {
                if (d12 > 0.0) {
                    f10 += (float)(d11 > 0.0 ? -45 : 45);
                } else if (d12 < 0.0) {
                    f10 += (float)(d11 > 0.0 ? 45 : -45);
                }
                d12 = 0.0;
                if (d11 > 0.0) {
                    d11 = 1.0;
                } else if (d11 < 0.0) {
                    d11 = -1.0;
                }
            }
            ks2.setX(d11 * d10 * Math.cos(Math.toRadians(f10 + 90.0f)) + d12 * d10 * Math.sin(Math.toRadians(f10 + 90.0f)));
            ks2.setZ(d11 * d10 * Math.sin(Math.toRadians(f10 + 90.0f)) - d12 * d10 * Math.cos(Math.toRadians(f10 + 90.0f)));
        }
    }

    private double a(double d10, double d11) {
        return Math.random() * (d10 - d11) + d11;
    }
}

