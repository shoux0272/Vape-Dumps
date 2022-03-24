/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import a.a;
import java.awt.Color;
import manthe.A5;
import manthe.CQ;
import manthe.DX;
import manthe.Da;
import manthe.V;
import manthe.ds;
import manthe.eJ;
import manthe.ej;
import manthe.ex;
import manthe.fB;
import manthe.fN;
import manthe.ft;
import manthe.kJ;
import manthe.kf;
import manthe.ky;
import manthe.n7;
import manthe.on;
import manthe.pb;
import manthe.rz;
import manthe.y5;
import manthe.zM;
import manthe.zQ;
import manthe.zz;

public class yP
extends y5 {
    private final pb x = new pb("Packet");
    private final pb w = new pb("Jump");
    public pb y = new pb("Ground");
    public pb u = new pb("AntiCheat");
    public DX z = DX.a((Object)this, "Mode", "Criticals bypass method\nPacket - May not bypass anti-cheats.\nGround - Ground crits (Works with Switch)\nAntiCheat - Like Ground but bypasses various anti-cheats\nGround/AntiCheat mode does not work separate from Switch mode Killaura.", this.x, this.x, this.y, this.u);
    private boolean A;
    private boolean v;

    public yP() {
        super("Criticals", new Color(193, 183, 92).getRGB(), CQ.f, "Forces critical hit every attack\nMay not bypass anti-cheats");
        this.a(this.z);
        ((rz)this.z.c()).a(new n7(this));
    }

    @Override
    public void s() {
        this.A = false;
    }

    public boolean S() {
        return (this.z.v() == this.u || this.z.v() == this.y) && this.N() && V.c() > 13;
    }

    @Override
    public boolean n() {
        return true;
    }

    public void e(boolean bl) {
        this.v = bl;
    }

    @Override
    public void a(kf kf2) {
        this.a(this.z.v().H());
    }

    @Override
    public void a(kJ kJ2) {
        if (this.z.v().equals(this.x) && kJ2.a() == Da.b) {
            on on2 = on.p;
            eJ eJ2 = ds.k();
            if (eJ2.J()) {
                if (on2.H().a(zz.class) || on2.H().a(zM.class) || on2.H().a(zQ.class)) {
                    return;
                }
                if (!kJ2.getTarget().e() && kJ2.getTarget().a(A5.cF)) {
                    ej ej2 = new ej(kJ2.getTarget().a());
                    if (ej2.a(A5.L) && on2.N().a(ej2)) {
                        return;
                    }
                    this.a(eJ2);
                    if (a.ib()) {
                        this.A = true;
                    }
                }
            }
        }
    }

    @Override
    public void a(ky ky2) {
        fN fN2;
        if (this.z.v().equals(this.x) && ky2.getPacket().a(A5.cU) && (fN2 = new fN(ky2.getPacketInstance())).g().equals(fB.g())) {
            if (!this.A) {
                eJ eJ2 = ds.k();
                if (eJ2.J()) {
                    on on2 = on.p;
                    if (on2.H().a(zz.class) || on2.H().a(zM.class) || on2.H().a(zQ.class)) {
                        return;
                    }
                    ex ex2 = fN2.a(eJ2.i());
                    if (!ex2.e() && ex2.a(A5.cF)) {
                        ej ej2 = new ej(ex2.a());
                        if (ej2.a(A5.L) && on2.N().a(ej2)) {
                            return;
                        }
                        this.a(eJ2);
                        this.A = true;
                    }
                }
            } else {
                this.A = false;
            }
        }
    }

    private void a(eJ eJ2) {
        if (this.v) {
            return;
        }
        for (double d10 : new double[]{0.040009234827343, 0.0, 0.030009234827343, 0.0}) {
            if (V.c() > 13) {
                eJ2.bp().a(ft.a(eJ2.z(), eJ2.l() + d10, eJ2.g(), false));
                continue;
            }
            eJ2.bp().a(ft.a(eJ2.z(), eJ2.s().l() + d10, eJ2.l() + d10, eJ2.g(), false));
        }
    }
}

