/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.A5;
import manthe.CQ;
import manthe.DB;
import manthe.DD;
import manthe.Da;
import manthe.Ds;
import manthe.ds;
import manthe.eJ;
import manthe.f2;
import manthe.fn;
import manthe.kF;
import manthe.km;
import manthe.mD;
import manthe.on;
import manthe.y5;
import manthe.zn;

public class zV
extends y5 {
    private final DB v = DB.a((Object)this, "Limit Items", false, "Limits to whitelisted items only.");
    private final DD w = DD.a((Object)this, "noslowdown-whitelist", "Whitelisted", DD.m, new mD("swords"));
    private boolean u;

    public zV() {
        super("NoSlowdown", 14828276, CQ.f, "Prevents slowing down when\nblocking or using items.");
        this.v.a(new Ds[]{this.w});
        this.a(this.v, this.w);
    }

    @Override
    public boolean n() {
        return true;
    }

    @Override
    public void a(kF kF2) {
        fn fn2 = kF2.getPacket();
        if (fn2.a(A5.cJ)) {
            this.u = true;
        }
        if (fn2.a(A5.cQ)) {
            f2 f22 = new f2(fn2);
            eJ eJ2 = ds.k();
            if (eJ2.d() && f22.h() == eJ2.q()) {
                this.u = true;
            }
        }
    }

    @Override
    public void a(km km2) {
        eJ eJ2 = ds.k();
        if (this.u) {
            if (eJ2.v()) {
                this.u = false;
            }
            return;
        }
        if (eJ2.H()) {
            return;
        }
        if (km2.a() == Da.b) {
            double d10 = eJ2.bg().j();
            double d11 = eJ2.bg().h();
            float f10 = eJ2.U();
            if (!(!eJ2.bd() || this.v.u().booleanValue() && !this.w.a(eJ2.a_()) || Math.abs(d11) != (double)0.2f && Math.abs(d10) != (double)0.2f)) {
                if (on.p.H().a(zn.class)) {
                    eJ2.l(true);
                }
                if (Math.abs(d11) == (double)0.2f) {
                    if (d11 > 0.0) {
                        eJ2.bg().a(1.0f);
                    } else if (d11 < 0.0) {
                        eJ2.bg().a(-1.0f);
                    }
                }
                if (Math.abs(d10) == (double)0.2f) {
                    if (d10 > 0.0) {
                        eJ2.bg().b(1.0f);
                    } else if (d10 < 0.0) {
                        eJ2.bg().b(-1.0f);
                    }
                }
                if (Math.abs(eJ2.bg().h()) != 1.0f && d10 > 0.0) {
                    d10 *= eJ2.C() ? (double)1.3f : 1.0;
                }
                d11 = d10 != 0.0 ? (d11 *= 0.5) : (d11 *= 0.85);
                eJ2.k(d10 * Math.cos(Math.toRadians(f10 + 90.0f)) + d11 * Math.sin(Math.toRadians(f10 + 90.0f)));
                eJ2.d(d10 * Math.sin(Math.toRadians(f10 + 90.0f)) - d11 * Math.cos(Math.toRadians(f10 + 90.0f)));
            }
        }
    }
}

