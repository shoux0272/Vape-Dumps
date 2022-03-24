/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.CQ;
import manthe.DX;
import manthe.Da;
import manthe.ds;
import manthe.eJ;
import manthe.ei;
import manthe.f_;
import manthe.km;
import manthe.on;
import manthe.pb;
import manthe.rz;
import manthe.vQ;
import manthe.y5;
import manthe.zM;

public class zo
extends y5 {
    private final pb w = new pb("Normal");
    private final pb u = new pb("AntiCheat");
    private final DX v = DX.a((Object)this, "Mode", "NoFall method to prevent you from taking fall damage.\nNormal - Works on vanilla/some anti-cheats (Does not Bypass AntiCheat)\nAntiCheat - Works and bypasses on various anti-cheats", this.w, this.w, this.u);
    private float x;

    public zo() {
        super("NoFall", 8919359, CQ.f, "Prevents taking fall damage.\nThis may not bypass AntiCheats.");
        ((rz)this.v.c()).a(new vQ(this));
        this.a(this.v);
    }

    @Override
    public boolean n() {
        return true;
    }

    @Override
    public void a(km km2) {
        eJ eJ2 = ds.k();
        this.a(this.v.v().H());
        if (eJ2.e() || eJ2.i().e() || eJ2.j() || eJ2.a8().g() || eJ2.a8().h() || on.p.H().a(zM.class)) {
            return;
        }
        if (this.v.v() == this.w) {
            boolean bl;
            boolean bl2 = bl = (double)eJ2.t() > 2.224 && eJ2.D() < 0.0;
            if (km2.a() == Da.b) {
                if (bl) {
                    km.setOnGround(true);
                    eJ2.e(10);
                    if (ds.s().l().g()) {
                        ei.a(ds.s().l().i(), false);
                        ei.a(ds.s().l().i());
                    }
                }
            } else if (bl) {
                eJ2.e(false);
            }
        }
        if (this.v.v() == this.u) {
            if (this.x > eJ2.t()) {
                this.x = 0.0f;
            }
            if ((double)eJ2.t() > 2.124 && eJ2.D() < 0.0 && km2.a() == Da.b && eJ2.t() >= 3.0f && eJ2.t() - this.x > 3.0f) {
                this.x = eJ2.t();
                eJ2.bp().a(f_.a(true));
                eJ2.bp().a(f_.a(false));
            }
        }
    }

    static DX a(zo zo2) {
        return zo2.v;
    }
}

