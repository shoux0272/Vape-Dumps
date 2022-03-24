/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.CQ;
import manthe.DF;
import manthe.DX;
import manthe.Da;
import manthe.Db;
import manthe.ds;
import manthe.eJ;
import manthe.fX;
import manthe.km;
import manthe.ks;
import manthe.on;
import manthe.p4;
import manthe.pb;
import manthe.rz;
import manthe.y2;
import manthe.y5;
import manthe.yC;
import manthe.yd;
import manthe.yj;

public class zz
extends y5 {
    private final p4 y = new p4("AntiCheat A", new yd(this, "AntiCheat A"));
    private final p4 v = new p4("AntiCheat B", new yj(this, "AntiCheat B"));
    private final p4 A = new p4("Bhop", new yC(this, "Bhop"));
    private final p4 B = new p4("Y-Port", new y2(this, "Y-Port"));
    private final DX u = DX.a((Object)this, "Mode", "Speed mode to use.\nAntiCheat A/B works on various servers\nBhop - Bypasses Old NCP\nY-Port - Bypasses Old NCP", (pb)this.y, this.y, this.v, this.A, this.B);
    public double z;
    public double C;
    public int x;
    public DF w = DF.a((Object)this, "Steps", "#.#", "", 25.0, 43.5, 180.0, "The amount of degrees to step by per tick.\nThe lower the number the smoother Speed rotates.");

    public zz() {
        super("Speed", 49630, CQ.f, "Increases your movement with various methods.");
        ((rz)this.u.c()).a(new Db(this));
        this.u.a(this.y, this.w);
        this.a(this.u, this.w);
    }

    @Override
    public boolean n() {
        return true;
    }

    public void e(int n6) {
        this.x = n6;
    }

    public double S() {
        double d10 = 0.28730000691562896;
        eJ eJ2 = ds.k();
        if (eJ2.a(fX.q()) && eJ2.b(fX.q()).f() > 10) {
            int n6 = eJ2.b(fX.q()).h();
            d10 *= 1.0 + 0.15 * (double)(n6 + 1);
        }
        return d10;
    }

    @Override
    public void s() {
        on.p.t().a(this);
        this.z = this.S();
        this.C = 0.0;
        this.x = 2;
        if (this.u.v() == this.y) {
            ((y5)this.y.f()).s();
        }
    }

    @Override
    public void a(ks ks2) {
        if (!ks2.c()) {
            return;
        }
        if (this.u.v() == this.y) {
            ((y5)this.y.f()).a(ks2);
        } else if (this.u.v() == this.A) {
            ((y5)this.A.f()).a(ks2);
        } else if (this.u.v() == this.B) {
            ((y5)this.B.f()).a(ks2);
        } else if (this.u.v() == this.v) {
            ((y5)this.v.f()).a(ks2);
        }
    }

    @Override
    public void a(km km2) {
        this.a(this.u.v().H());
        if (km2.a() == Da.b) {
            eJ eJ2 = ds.k();
            if (this.u.v() == this.y) {
                ((y5)this.y.f()).a(km2);
            } else if (this.u.v() == this.B) {
                ((y5)this.B.f()).a(km2);
            }
            double d10 = eJ2.z() - eJ2.aq();
            double d11 = eJ2.g() - eJ2.ap();
            this.C = Math.sqrt(d10 * d10 + d11 * d11);
        }
    }

    public void a(ks ks2, double d10, eJ eJ2) {
        double d11 = eJ2.bg().j();
        double d12 = eJ2.bg().h();
        float f10 = eJ2.U();
        if (d11 == 0.0 && d12 == 0.0) {
            ks2.setX(0.0);
            ks2.setZ(0.0);
        } else if (d11 != 0.0) {
            if (d12 != 0.0) {
                if (d12 > 0.0) {
                    f10 += d11 > 0.0 ? -45.0f : 45.0f;
                    d12 = 0.0;
                } else {
                    f10 += d11 > 0.0 ? 45.0f : -45.0f;
                    d12 = 0.0;
                }
            }
            d11 = d11 > 0.0 ? 1.0 : -1.0;
        }
        double d13 = Math.cos(Math.toRadians(f10 + 90.0f));
        double d14 = Math.sin(Math.toRadians(f10 + 90.0f));
        ks2.setX(d11 * d10 * d13 + d12 * d10 * d14);
        ks2.setZ(d11 * d10 * d14 - d12 * d10 * d13);
    }

    static DX a(zz zz2) {
        return zz2.u;
    }
}

