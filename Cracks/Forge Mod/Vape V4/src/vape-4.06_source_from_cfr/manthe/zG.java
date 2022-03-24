/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.util.vector.Vector2f
 */
package manthe;

import java.awt.Color;
import java.util.Arrays;
import java.util.List;
import manthe.A5;
import manthe.AO;
import manthe.CQ;
import manthe.DB;
import manthe.DD;
import manthe.DF;
import manthe.DX;
import manthe.Da;
import manthe.Ds;
import manthe.Dy;
import manthe.V;
import manthe.Y;
import manthe.bH;
import manthe.d0;
import manthe.dJ;
import manthe.dL;
import manthe.dR;
import manthe.ds;
import manthe.dx;
import manthe.eJ;
import manthe.ei;
import manthe.ej;
import manthe.en;
import manthe.fG;
import manthe.fP;
import manthe.fk;
import manthe.fq;
import manthe.g1;
import manthe.gK;
import manthe.gO;
import manthe.gg;
import manthe.gh;
import manthe.kf;
import manthe.km;
import manthe.kn;
import manthe.ks;
import manthe.mD;
import manthe.on;
import manthe.pb;
import manthe.rh;
import manthe.y5;
import org.lwjgl.util.vector.Vector2f;

public class zG
extends y5 {
    private final pb w = new pb("Legit");
    private final pb J = new pb("Blatant");
    private final DB N = DB.a((Object)this, "Tower", false, "Builds a tower upwards when you're standing still.");
    private final DB Q = DB.a((Object)this, "Block Count", false, "Renders your block count on\nthe center of your screen.\nBlatant counts inventory.");
    private final DB C = DB.a((Object)this, "Stop Motion", false, "Force stops your motion to tower.");
    private final DB x = DB.a((Object)this, "Stop Sprinting", false, "Stops you from sprinting when scaffolding.\nThis is required to bypass AAC/GWEN");
    private final DB K = DB.a((Object)this, "Whitelist Only", false, "Only activates scaffold when\nwhitelisted blocks are held.");
    private final DB z = DB.a((Object)this, "Use blacklist", true, "Scaffold will not use these blocks for scaffolding");
    private final DF D = DF.a(this, "Delay", "#", "ms", 0.0, 100.0, 500.0, 50.0, "Blatant scaffold place delay.");
    private final Dy H = Dy.a((Object)this, "Sneak delay", "#", "", 0.0, 100.0, 200.0, 500.0, 1.0, "Delay until standing after sneaking");
    private final DD P = DD.a((Object)this, "scaffold-allowedblocks", "Held whitelist", DD.m, new mD("blocks"));
    private final DD M = DD.a((Object)this, "scaffold-blacklist", "Block blacklist", DD.n, new mD[0]);
    private final DX F = DX.a((Object)this, "Mode", "Legit - Automatically shifts at edge of block when backwards (fastbridge)\nBlatant - Automatically place blocks under you", this.w, this.w, this.J);
    private final AO y = new AO();
    private final AO R = new AO();
    private final AO E = new AO();
    private final List<Integer> v = Arrays.asList(0, 6, 8, 9, 10, 11, 26, 27, 28, 31, 32, 37, 38, 39, 40, 51, 65, 66, 83, 92, 96, 120, 111, 131, 132, 171, 78, 146, 147, 148, 149, 150, 151, 154, 54, 50, 71, 64, 63, 69, 75, 76, 77, 143);
    private final List<Integer> u = Arrays.asList(23, 25, 30, 46, 52, 116, 85, 84, 103, 137, 145, 102, 160, 101, 79, 174, 145, 152, 14, 15, 16, 21, 73, 74, 163, 72, 70, 138);
    private boolean A;
    private long L;
    private boolean I;
    private Vector2f B = new Vector2f(-1337.0f, -1337.0f);
    private float G;
    private int O = -1;

    public zG() {
        super("Scaffold", 49630, CQ.f, "Helps you make bridges/scaffold walk.");
        this.N.a(new Ds[]{this.C});
        this.K.a(new Ds[]{this.P});
        this.z.a(new Ds[]{this.M});
        this.J.a(true);
        this.F.a(this.N, this.x, this.D, this.H, this.z);
        this.F.a((Ds)this.N, this.J);
        this.F.a((Ds)this.x, this.J);
        this.F.a((Ds)this.D, this.J);
        this.F.a((Ds)this.z, this.J);
        this.F.a((Ds)this.H, this.w);
        this.a(this.F, this.H, this.N, this.C, this.x, this.D, this.Q, this.K, this.P, this.z, this.M);
        ((rh)this.P.c()).b("Scaffold will not function unless you are currently holding an item whitelisted here");
        for (int n6 : this.u) {
            this.M.b(new mD(n6));
        }
    }

    public boolean V() {
        return this.N() && this.x.u() != false && this.F.v() == this.J;
    }

    public boolean U() {
        return this.F.v().equals(this.w);
    }

    @Override
    public void t() {
        Object object;
        if (!this.Q.u().booleanValue()) {
            return;
        }
        d0 d02 = d0.a(new ds(), ds.F(), ds.H());
        float f10 = d02.g();
        float f11 = d02.h();
        dR dR2 = ds.m();
        int n6 = 0;
        int n10 = new Color(255, 0, 0).getRGB();
        if (this.F.v().equals(this.J)) {
            n6 = this.S();
            if (n6 >= 128) {
                n10 = new Color(9, 255, 198).getRGB();
            } else if (n6 >= 64) {
                n10 = new Color(255, 249, 18).getRGB();
            }
        } else {
            fk fk2;
            object = ds.k();
            fG fG2 = ((ej)object).aG();
            if (fG2.d() && (fk2 = fG2.k()).d() && fk2.a(A5.av)) {
                n6 = fG2.n();
            }
            if (n6 >= 48) {
                n10 = new Color(9, 255, 198).getRGB();
            } else if (n6 >= 24) {
                n10 = new Color(255, 249, 18).getRGB();
            }
        }
        object = String.valueOf(n6);
        dR2.d((String)object, (double)(f10 / 2.0f - (float)dR2.c((String)object) / 2.0f), (double)(f11 / 2.0f - 20.0f), n10);
    }

    @Override
    public void s() {
        on.p.t().a(this);
        this.B = new Vector2f(-1337.0f, -1337.0f);
        this.y.d();
        this.L = (long)this.H.t();
        eJ eJ2 = ds.k();
        if (eJ2.e() || !this.F.v().equals(this.J)) {
            this.O = -1;
            return;
        }
        this.O = eJ2.aU().i();
        if (this.V() && eJ2.C()) {
            eJ2.l(false);
            if (ds.s().o().h()) {
                ei.a(ds.s().o().i(), false);
                ei.a(ds.s().o().i());
            }
        }
    }

    @Override
    public void J() {
        eJ eJ2 = ds.k();
        if (eJ2.e() || !this.F.v().equals(this.J)) {
            this.O = -1;
            return;
        }
        if (this.O != -1) {
            eJ2.aU().a(this.O);
            ds.K().h();
            this.O = -1;
        }
    }

    @Override
    public void a(kn kn2) {
        boolean bl;
        if (!this.U()) {
            return;
        }
        if (ds.x().d()) {
            return;
        }
        if (!this.T()) {
            return;
        }
        if (!kn2.getEntity().equals(ds.k())) {
            return;
        }
        if (!Thread.currentThread().getName().equals("Client thread")) {
            return;
        }
        eJ eJ2 = ds.k();
        gh gh2 = eJ2.bg();
        en en2 = ds.s();
        ei ei2 = en2.u();
        if (eJ2.aQ()) {
            return;
        }
        this.A = ei2.f();
        boolean bl2 = false;
        boolean bl3 = bl = gh2.j() <= 0.0f;
        if (bl) {
            fP fP2;
            fP fP3;
            if (V.c() >= 15) {
                fP3 = eJ2.s();
            } else {
                fP2 = eJ2.s();
                fP3 = fP2.k();
            }
            fP2 = fP3.d(-0.2, 0.0, -0.2).c(eJ2.k(), -1.0, eJ2.u());
            int n6 = ds.t().b(eJ2, fP2).size();
            if (n6 == 0) {
                bl2 = true;
            }
        }
        boolean bl4 = false;
        if (!bl2 && !this.E.a(this.L) && this.L > 30L) {
            bl2 = true;
            bl4 = true;
        }
        if (bl2 && eJ2.v()) {
            if (!eJ2.af()) {
                this.L = (long)this.H.t();
            }
            ei.a(ei2.i(), true);
            ei.a(ei2.i());
            if (!bl4) {
                this.E.d();
            }
        } else if (!this.A) {
            ei.a(ei2.i(), false);
            ei.a(ei2.i());
        }
    }

    @Override
    public void a(kf kf2) {
        if (!this.U()) {
            return;
        }
        if (kf2.a() != Da.a) {
            return;
        }
        if (ds.x().d()) {
            return;
        }
        if (!this.T()) {
            return;
        }
        eJ eJ2 = ds.k();
        if (eJ2.aQ()) {
            return;
        }
        en en2 = ds.s();
        ei ei2 = en2.u();
        ei.a(ei2.i(), this.A);
        ei.a(ei2.i());
    }

    @Override
    public void a(ks ks2) {
        if (!this.T()) {
            return;
        }
        if (this.U()) {
            return;
        }
        eJ eJ2 = ds.k();
        if (ks2.c()) {
            this.I = eJ2.bg().g();
            fP fP2 = V.c() >= 15 ? eJ2.s() : eJ2.s().k();
            if (eJ2.i().b(eJ2, fP2.d(-0.05, 0.0, -0.05).c(eJ2.k(), -1.0, eJ2.u())).isEmpty()) {
                eJ2.bg().e(true);
            }
        } else {
            eJ2.bg().e(this.I);
        }
    }

    @Override
    public void a(km km2) {
        this.a(this.F.v().H());
        if (!this.F.v().equals(this.J)) {
            return;
        }
        eJ eJ2 = ds.k();
        en en2 = ds.s();
        bH bH2 = new bH(eJ2.z(), eJ2.l() - 1.0, eJ2.g());
        if (km2.c()) {
            if (this.V() && eJ2.C()) {
                ei.a(ds.s().o().i(), false);
                eJ2.l(false);
            }
            gK gK2 = this.c(bH2);
            if (this.B.x == -1337.0f) {
                float f10 = Y.a(eJ2.U());
                this.B.x = eJ2.U();
                this.G = eJ2.U() + (float)(f10 > 0.0f ? 180 : -180);
                km.setRotationYaw(this.G);
                this.B.y = 70.0f;
                km.setRotationPitch(70.0f);
            }
            int n6 = this.W();
            if (gK2 != null && this.e(bH2).f() && n6 != -1) {
                float[] arrf = this.a(gK2);
                this.G = arrf[0];
                this.B.y = Math.min(arrf[1], ds.s().l().h() ? 90.0f : 70.0f);
                km.setRotationPitch(this.B.y);
                this.B.y = km.getRotationPitch();
            }
            if (this.B.x != -1337.0f) {
                float f11 = 35.0f + (float)(10.0 * Math.random());
                this.B.x += Y.a(Y.a(this.G - this.B.x), -f11, f11);
                km.setRotationYaw(this.B.x);
                km.setRotationPitch(this.B.y);
            }
            if (this.X()) {
                for (int k = 9; k < 36; ++k) {
                    fG fG2;
                    if (!eJ2.aY().a(k).h() || !this.a(fG2 = eJ2.aY().a(k).f()) || !fG2.k().a(A5.av) || this.a(fG2.k())) continue;
                    this.e(k);
                    break;
                }
            }
        } else {
            boolean bl;
            boolean bl2 = bl = eJ2.bg().j() == 0.0f && eJ2.bg().h() == 0.0f;
            if (en2.l().h() && this.S() > 0 && this.N.u().booleanValue() && this.C.u().booleanValue()) {
                eJ2.h(eJ2.z());
                eJ2.e(eJ2.g());
                eJ2.b(eJ2.z());
                eJ2.f(eJ2.g());
                eJ2.k(0.0);
                eJ2.d(0.0);
            }
            if (!bl) {
                this.y.d();
            }
            if (!this.e(bH2).f()) {
                return;
            }
            int n10 = this.W();
            if (n10 == -1) {
                return;
            }
            int n11 = eJ2.aU().i();
            eJ2.aU().a(n10);
            if (en2.l().h() && this.N.x().booleanValue() && this.S() > 0) {
                if (this.C.u().booleanValue()) {
                    eJ2.k(0.0);
                    eJ2.d(0.0);
                }
                if (eJ2.l() != (double)(bH2.c() + 1) && !eJ2.i().a((double)bH2.d(), (double)bH2.c() - 0.5, (double)bH2.a()).h().equals(dJ.i()) && bl) {
                    eJ2.l((double)0.42f);
                    eJ2.k(0.0);
                    eJ2.d(0.0);
                    if (this.y.a(1000L)) {
                        eJ2.l(-0.28);
                        this.y.d();
                    }
                }
            }
            if (eJ2.aU().b(n10).k().a(A5.av) && !this.a(eJ2.aU().b(n10).k()) && this.R.a(this.D.a().longValue()) && !eJ2.i().b(bH2.d(), bH2.c(), bH2.a()).a(A5.bK)) {
                if (!(this.a(bH2) || this.a(bH2.a(1, 0, 0)) || this.a(bH2.a(0, 0, 1)) || this.a(bH2.a(-1, 0, 0)))) {
                    this.a(bH2.a(0, 0, -1));
                }
                this.R.d();
            }
        }
    }

    private void e(int n6) {
        eJ eJ2 = ds.k();
        ds.K().a(eJ2.aY().g(), n6, 7, 2, eJ2);
    }

    private int W() {
        if (this.T()) {
            for (int k = 0; k < 9; ++k) {
                fG fG2 = ds.k().aU().b(k);
                if (!this.a(fG2) || !this.b(fG2) || !fG2.k().a(A5.av) || this.a(fG2.k())) continue;
                return k;
            }
        }
        return -1;
    }

    private boolean X() {
        eJ eJ2 = ds.k();
        for (int k = 36; k < 45; ++k) {
            if (!eJ2.aY().a(k).h()) continue;
            fG fG2 = eJ2.aY().a(k).f();
            fk fk2 = fG2.k();
            if (!this.a(fG2) || !fk2.a(A5.av) || this.a(fk2)) continue;
            return false;
        }
        return true;
    }

    private boolean a(bH bH2) {
        eJ eJ2 = ds.k();
        gO gO2 = ds.t();
        gK gK2 = gK.b(eJ2.z(), eJ2.l() + (double)eJ2.am(), eJ2.g());
        gg[] arrgg = gg.f();
        if (V.c() > 13) {
            g1 g12 = g1.a(bH2.d(), bH2.c(), bH2.a());
            for (gg gg2 : arrgg) {
                gK gK3;
                g1 g13 = g12.a(gg2);
                gg gg3 = gg2.g();
                if (!(gK2.b(gK.b(g12.h(), g12.f(), g12.g()).a(0.5, 0.5, 0.5)) < gK2.b(gK.b(g13.h(), g13.f(), g13.g()).a(0.5, 0.5, 0.5))) || !this.d(new bH(g13.h(), g13.f(), g13.g())).a(this.a(g13), false).booleanValue() || !(gK2.b(gK3 = gK.b(g13.h(), g13.f(), g13.g()).a(0.5, 0.5, 0.5).c(gK.b(gg3.l().h(), gg3.l().f(), gg3.l().g()).a(0.5))) <= 18.0)) continue;
                if (ds.K().a(eJ2, gO2, eJ2.a_(), bH.a(g13), gg3, gK3)) {
                    eJ2.bp().a(fq.g());
                    this.R.d();
                }
                return true;
            }
        } else {
            for (gg gg4 : arrgg) {
                gK gK4;
                double d10;
                bH bH3 = bH2.a(gg4);
                gg gg5 = gg4.g();
                double d11 = gK2.b(gK.b(bH2.d(), bH2.c(), bH2.a()).a(0.5, 0.5, 0.5));
                if (!(d11 < (d10 = gK2.b(gK.b(bH3.d(), bH3.c(), bH3.a()).a(0.5, 0.5, 0.5)))) || !(gK2.b(gK4 = gK.b(bH3.d(), bH3.c(), bH3.a()).a(0.5, 0.5, 0.5).c(gK.b(gg5.i(), gg5.j(), gg5.k()).a(0.5))) <= 18.0)) continue;
                if (ds.K().a(eJ2, gO2, eJ2.a_(), bH3, gg5, gK4)) {
                    eJ2.bp().a(fq.g());
                    this.R.d();
                }
                return true;
            }
        }
        return false;
    }

    private gK b(bH bH2) {
        eJ eJ2 = ds.k();
        gK gK2 = gK.b(eJ2.z(), eJ2.l() + (double)eJ2.am(), eJ2.g());
        gg[] arrgg = gg.f();
        if (V.c() > 13) {
            g1 g12 = g1.a(bH2.d(), bH2.c(), bH2.a());
            for (gg gg2 : arrgg) {
                gK gK3;
                g1 g13 = g12.a(gg2);
                gg gg3 = gg2.g();
                if (!(gK2.b(gK.b(g12.h(), g12.f(), g12.g()).a(0.5, 0.5, 0.5)) < gK2.b(gK.b(g13.h(), g13.f(), g13.g()).a(0.5, 0.5, 0.5))) || !this.d(new bH(g13.h(), g13.f(), g13.g())).a(this.a(g13), false).booleanValue() || !(gK2.b(gK3 = gK.b(g13.h(), g13.f(), g13.g()).a(0.5, 0.5, 0.5).c(gK.b(gg3.l().h(), gg3.l().f(), gg3.l().g()))) <= 18.0)) continue;
                return gK3;
            }
        } else {
            for (gg gg4 : arrgg) {
                gK gK4;
                double d10;
                bH bH3 = bH2.a(gg4);
                gg gg5 = gg4.g();
                double d11 = gK2.b(gK.b(bH2.d(), bH2.c(), bH2.a()).a(0.5, 0.5, 0.5));
                if (!(d11 < (d10 = gK2.b(gK.b(bH3.d(), bH3.c(), bH3.a()).a(0.5, 0.5, 0.5)))) || !(gK2.b(gK4 = gK.b(bH3.d(), bH3.c(), bH3.a()).a(0.5, 0.5, 0.5).c(gK.b(gg5.i(), gg5.j(), gg5.k()))) <= 18.0)) continue;
                return gK4;
            }
        }
        return null;
    }

    private gK c(bH bH2) {
        gK gK2 = this.b(bH2);
        if (gK2 == null && (gK2 = this.b(bH2.a(1, 0, 0))) == null && (gK2 = this.b(bH2.a(0, 0, 1))) == null && (gK2 = this.b(bH2.a(-1, 0, 0))) == null) {
            gK2 = this.b(bH2.a(0, 0, -1));
        }
        return gK2;
    }

    private float[] a(gK gK2) {
        eJ eJ2 = ds.k();
        double d10 = gK2.g() - eJ2.z();
        double d11 = gK2.h() - (eJ2.l() + (double)eJ2.am());
        double d12 = gK2.f() - eJ2.g();
        double d13 = Y.e(d10 * d10 + d12 * d12);
        float f10 = (float)Math.toDegrees(Math.atan2(d12, d10)) - 90.0f;
        float f11 = (float)(-Math.toDegrees(Math.atan2(d11, d13)));
        float f12 = this.B.x + Y.a(f10 - this.B.x);
        float f13 = this.B.y + Y.a(f11 - this.B.y);
        return new float[]{f12, f13};
    }

    private boolean T() {
        return this.K.u() == false || ds.k().aG().d() && this.P.a(ds.k().aG());
    }

    private boolean b(fG fG2) {
        if (fG2.e() || fG2.k().e()) {
            return false;
        }
        if (fG2.g().equalsIgnoreCase("tile.cactus")) {
            return false;
        }
        return fG2.k().a(A5.av);
    }

    private dL a(g1 g12) {
        return ds.t().a(g12);
    }

    private dx d(bH bH2) {
        return ds.t().b(bH2.d(), bH2.c(), bH2.a());
    }

    public dJ e(bH bH2) {
        return this.d(bH2).h();
    }

    private boolean a(fG fG2) {
        return fG2.d();
    }

    private int S() {
        eJ eJ2 = ds.k();
        int n6 = 0;
        for (int k = 0; k < 45; ++k) {
            if (!eJ2.aY().a(k).h()) continue;
            fG fG2 = eJ2.aY().a(k).f();
            fk fk2 = fG2.k();
            if (!fG2.k().a(A5.av) || this.a(fk2)) continue;
            n6 += fG2.n();
        }
        return n6;
    }

    private boolean a(fk fk2) {
        if (!this.z.u().booleanValue()) {
            return false;
        }
        return this.M.c(String.valueOf(fk2.h())) || this.v.contains(fk2.h());
    }
}

