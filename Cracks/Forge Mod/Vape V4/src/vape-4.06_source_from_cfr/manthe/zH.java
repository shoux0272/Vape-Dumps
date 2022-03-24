/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import manthe.A5;
import manthe.AO;
import manthe.CQ;
import manthe.DB;
import manthe.DD;
import manthe.DF;
import manthe.DX;
import manthe.Ds;
import manthe.Dy;
import manthe.cB;
import manthe.cy;
import manthe.ds;
import manthe.eC;
import manthe.eJ;
import manthe.ei;
import manthe.ej;
import manthe.ex;
import manthe.f5;
import manthe.fE;
import manthe.fG;
import manthe.fX;
import manthe.fh;
import manthe.fk;
import manthe.km;
import manthe.kt;
import manthe.mD;
import manthe.n3;
import manthe.on;
import manthe.pb;
import manthe.y5;

public class zH
extends y5 {
    private final int E = 281;
    private final int aa = 282;
    private final int L = 39;
    private final int U = 40;
    private final int K = 397;
    private final DB H = DB.a((Object)this, "Soup", false, "Uses soups to heal.");
    private final DB C = DB.a((Object)this, "Replace", false, "Refills empty slots with healing items.");
    private final DB J = DB.a((Object)this, "Inventory Only", false, "Only refills/crafts when your inventory is open.");
    private final DB x = DB.a((Object)this, "Potions", false, "Uses splash healing potions to heal.").d(true);
    private final DB W = DB.a((Object)this, "Regen", true, "Uses regeneration potions when available.");
    private final DB F = DB.a((Object)this, "Speed", false, "Uses speed potions when available.");
    private final DB S = DB.a((Object)this, "Resistance", false, "Uses resistance potions when available.");
    private final DB X = DB.a((Object)this, "Use Custom Items", false, "Uses other custom healing items.\nUses the same delay as soup/potion.");
    private final DD w = DD.a((Object)this, "autoheal-customitems", "Healing Items", DD.m, new mD("397:3"));
    private final pb v = new pb("Throw");
    private final pb B = new pb("Stack");
    private final pb P = new pb("None");
    private final DX y = DX.a((Object)this, "Bowl Mode", this.B, this.B, this.v, this.P);
    private final pb T = new pb("Silent");
    private final pb Q = new pb("Legit");
    private final DX R = DX.a((Object)this, "Mode", this.T, this.T, this.Q);
    private final Dy I = Dy.a((Object)this, "Swap Delay", "#", "ms", 0.0, 75.0, 125.0, 200.0, 5.0, "The delay between using the item and swapping back.");
    private final DF Y = DF.a(this, "Delay", "#", "ms", 50.0, 500.0, 1000.0, 50.0, "The delay to wait before healing again.");
    private final DF ab = DF.a((Object)this, "Health", "#", "HP", 1.0, 17.0, 20.0, 1.0);
    private final DF O = DF.a(this, "Slot", "#", "", 1.0, 6.0, 9.0, 1.0, "The slot to fill a potion for autopot.");
    private final AO N = new AO();
    private boolean D;
    private boolean Z;
    private int M;
    private int u;
    private boolean z;
    private int A = -1;
    private final Queue<n3> V = new ConcurrentLinkedQueue<n3>();
    private boolean G;

    public zH() {
        super("AutoHeal", 0, 16711819, CQ.f, "Automatically heals for you when health is under threshold.");
        this.T.a(true);
        this.R.a(this.T, this.x, this.y);
        this.R.a(this.Q, this.I);
        this.X.a(new Ds[]{this.w});
        this.H.a(new Ds[]{this.y});
        this.x.d(true);
        this.x.a(this.W, this.F, this.S, this.O);
        this.a(this.R, this.H, this.y, this.x, this.W, this.F, this.S, this.O, this.X, this.w, this.C, this.ab, this.Y, this.I);
    }

    @Override
    public void b(kt kt2) {
        boolean bl;
        Object object;
        if (!kt2.getPlayer().a(A5.u) || on.p.t().c() || ds.x().d()) {
            return;
        }
        boolean bl2 = false;
        if (this.R.v() == this.Q) {
            if (this.G) {
                if (!ds.x().e()) {
                    ds.k().aX();
                }
                this.G = false;
            } else {
                while (!this.V.isEmpty()) {
                    object = this.V.poll();
                    ((n3)object).a();
                    bl2 = true;
                }
            }
        }
        if (this.D || this.Z) {
            return;
        }
        object = ds.k();
        int n6 = this.ab.a().intValue();
        boolean bl3 = bl = ((ej)object).aD() / Math.max(((ej)object).at(), 1.0f) <= (float)n6 / 20.0f && this.N.a(this.Y.a().intValue());
        if (bl) {
            for (int k = 36; k < 45; ++k) {
                fG fG2;
                if (!((eC)object).aY().a(k).h() || !this.b(fG2 = ((eC)object).aY().a(k).f())) continue;
                if (this.R.v() == this.Q) {
                    this.D = true;
                    this.M = k - 36;
                    this.u = ((eC)object).aU().i();
                    this.a(bl2 ? 51L : 0L, false);
                } else {
                    this.M = -1;
                    this.u = -1;
                    ((eJ)object).bp().a(f5.a(k - 36));
                    ds.K().a((eC)object, ((ex)object).i(), ((eC)object).aY().a(k).f());
                    ((eJ)object).bp().a(f5.a(((eC)object).aU().i()));
                }
                this.N.d();
                return;
            }
        }
        this.M = -1;
    }

    @Override
    public void q() {
        if (!this.D) {
            return;
        }
        try {
            boolean bl;
            int n6 = ds.s().s().i();
            ds.k().aU().a(this.M);
            boolean bl2 = bl = ds.k().bd() && cB.a(n6);
            if (bl) {
                ei.a(n6, false);
                ei.a(n6);
                Thread.sleep(51L);
            }
            ei.a(n6, true);
            ei.a(n6);
            Thread.sleep(51L);
            ei.a(n6, false);
            long l = Math.max((long)this.I.t() + (long)(bl ? -35 : 0), 0L);
            Thread.sleep(l);
            ds.k().aU().a(this.u);
            if (cB.a(n6)) {
                ei.a(n6, true);
                ei.a(n6);
            }
        }
        catch (Exception exception) {
            this.D = false;
            this.M = -1;
            this.u = -1;
        }
        this.M = -1;
        this.u = -1;
        this.D = false;
    }

    @Override
    public void a(kt kt2) {
        if (!kt2.getPlayer().a(A5.u) || on.p.t().c()) {
            return;
        }
        this.S();
    }

    @Override
    public void a(km km2) {
        eJ eJ2 = ds.k();
        if (!this.x.x().booleanValue()) {
            return;
        }
        if (km2.c()) {
            int n6 = this.ab.a().intValue();
            boolean bl = (eJ2.aD() <= (float)n6 && (this.W.u() == false || !eJ2.a(fX.f())) || this.F.u() != false && !eJ2.a(fX.q()) || this.S.u() != false && !eJ2.a(fX.l())) && eJ2.v() && eJ2.J();
            int n10 = this.T();
            if (n10 != -1 && bl && this.N.a(this.Y.a().intValue())) {
                if (this.A == -1) {
                    this.z = true;
                    this.A = n10;
                    km.setRotationPitch(88.99f);
                }
            } else {
                this.z = false;
            }
        } else if (this.z && this.A != -1 && this.N.a(this.Y.a().intValue())) {
            fG fG2 = eJ2.aY().a(36 + this.A).f();
            if (fG2.d()) {
                int n11 = eJ2.aU().i();
                eJ2.aU().a(this.A);
                eJ2.bp().a(f5.a(this.A));
                ds.K().a(eJ2, eJ2.i(), fG2);
                eJ2.aU().a(n11);
                eJ2.bp().a(f5.a(n11));
            }
            this.N.d();
            this.z = false;
            this.A = -1;
        }
    }

    private boolean b(fG fG2) {
        if (fG2.e() || fG2.k().e()) {
            return false;
        }
        fk fk2 = fG2.k();
        if (this.H.u().booleanValue()) {
            int n6 = fk2.h();
            this.getClass();
            if (n6 == 282) {
                return true;
            }
        }
        return this.X.u() != false && this.w.a(fG2);
    }

    private int T() {
        eJ eJ2 = ds.k();
        int n6 = -1;
        for (int k = 0; k < 45; ++k) {
            fG fG2;
            if (!eJ2.aY().a(k).h() || !this.a(fG2 = eJ2.aY().a(k).f())) continue;
            if (k < 8) {
                n6 = k;
                break;
            }
            if (!this.C.u().booleanValue()) break;
            this.a(k, 36 + this.O.a().intValue() - 1);
            n6 = this.O.a().intValue() - 1;
            break;
        }
        return n6;
    }

    private void a(int n6, int n10, int n11, int n12) {
        this.V.add(new n3(n6, n10, n11, n12));
    }

    private void a(int n6, int n10) {
        n10 -= 36;
        if (this.R.v() == this.Q) {
            this.a(ds.k().aY().g(), n6, n10, 2);
        } else {
            ds.K().a(ds.k().aY().g(), n6, n10, 2, ds.k());
        }
    }

    private boolean a(fG fG2) {
        if (fG2.e()) {
            return false;
        }
        if (fG2.k().a(A5.dx) && fh.d(fG2)) {
            eJ eJ2 = ds.k();
            fh fh2 = new fh(fG2.k().a());
            if (fh2.c(fG2) != null) {
                for (Object e10 : fh2.c(fG2)) {
                    boolean bl;
                    fE fE2 = new fE(e10);
                    boolean bl2 = bl = (double)eJ2.aD() <= this.ab.a();
                    if (fE2.g() == fX.m().g() && bl) {
                        return true;
                    }
                    if (fE2.g() == fX.q().g() && this.F.u().booleanValue() && !eJ2.a(fX.q())) {
                        return true;
                    }
                    if (fE2.g() != fX.f().g() || !this.W.u().booleanValue() || !bl || eJ2.a(fX.f())) continue;
                    return true;
                }
            }
        }
        return false;
    }

    private void S() {
        cy cy2;
        int n6;
        if (this.J.u().booleanValue() && !ds.x().a(A5.ag)) {
            return;
        }
        if (this.D) {
            return;
        }
        eJ eJ2 = ds.k();
        if (!this.Z && this.H.x().booleanValue() && this.y.v() != this.P) {
            for (n6 = 9; n6 < 45; ++n6) {
                boolean bl;
                fG fG2;
                boolean bl2;
                boolean bl3 = bl2 = n6 >= 36;
                if (!eJ2.aY().a(n6).h() || !(cy2 = (fG2 = eJ2.aY().a(n6).f()).k()).d() || ((fk)cy2).h() != 281) continue;
                if (this.y.v() == this.v) {
                    ds.K().a(0, n6, 1, 4, ds.k());
                    return;
                }
                if (this.y.v() != this.B || n6 == 17) continue;
                boolean bl4 = bl = !eJ2.aY().a(17).h();
                if (bl || eJ2.aY().a(17).f().k().h() != 281) {
                    if (bl2) {
                        this.a(17, n6);
                    } else {
                        ds.K().a(0, n6, 0, 0, ds.k());
                        ds.K().a(0, 17, 0, 0, ds.k());
                        ds.K().a(0, n6, 0, 0, ds.k());
                    }
                } else if (eJ2.aY().a(17).f().k().h() == 281) {
                    if (bl2) {
                        ds.K().a(0, n6, 0, 1, ds.k());
                    } else {
                        ds.K().a(0, n6, 0, 0, ds.k());
                        ds.K().a(0, 17, 0, 0, ds.k());
                    }
                }
                return;
            }
        }
        if (this.C.u().booleanValue()) {
            for (n6 = 9; n6 < 36; ++n6) {
                fG fG3;
                if (!eJ2.aY().a(n6).h() || !this.b(fG3 = eJ2.aY().a(n6).f())) continue;
                for (int k = 36; k < 45; ++k) {
                    cy2 = eJ2.aY().a(k).f();
                    if (!((fG)cy2).e() && !((fG)cy2).k().e()) continue;
                    if (!this.Z) {
                        int n10 = ds.s().t().i();
                        ei.a(n10, true);
                        ei.a(n10);
                        ei.a(n10, false);
                        this.Z = true;
                        return;
                    }
                    this.G = false;
                    this.a(n6, k);
                    return;
                }
            }
            if (this.Z) {
                this.Z = false;
                this.G = true;
            }
        }
    }
}

