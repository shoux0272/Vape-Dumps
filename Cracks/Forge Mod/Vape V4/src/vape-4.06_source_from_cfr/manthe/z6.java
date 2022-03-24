/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import manthe.A5;
import manthe.AO;
import manthe.Ag;
import manthe.CQ;
import manthe.Cg;
import manthe.DB;
import manthe.Dy;
import manthe.ds;
import manthe.e5;
import manthe.eC;
import manthe.eJ;
import manthe.ei;
import manthe.eq;
import manthe.fG;
import manthe.fV;
import manthe.kt;
import manthe.n3;
import manthe.on;
import manthe.y5;
import manthe.zP;
import manthe.zY;

public class z6
extends y5 {
    private final int[] y = new int[]{313, 309, 317, 305, 301};
    private final int[] A = new int[]{311, 307, 315, 303, 299};
    private final int[] H = new int[]{310, 306, 314, 302, 298};
    private final int[] u = new int[]{312, 308, 316, 304, 300};
    private final DB J = DB.a((Object)this, "Open Inventory", true, "Opens your inventory when you can equip armor.");
    private final DB E = DB.a((Object)this, "Inventory Only", false, "Only equip armor when in inventory.");
    private final DB I = DB.a((Object)this, "Check Durability", true, "Always puts on the armor with the highest durability.");
    private final DB D = DB.a((Object)this, "Drop Equipped", false, "Drops worse equipped armor for better armor when active.");
    private final DB w = DB.a((Object)this, "Combat check", false, "Won't equip armor while in combat");
    private final Dy B = Dy.a(this, "Delay", "#", "", 1.0, 100.0, 120.0, 200.0, 1.0);
    private final int x = 4;
    private final AO G = new AO();
    private final AO K = new AO();
    private final Cg v = new Cg(20);
    private final Queue<n3> C = new ConcurrentLinkedQueue<n3>();
    private boolean F;
    private boolean z;

    public z6() {
        super("AutoArmor", -12399628, CQ.a, "Automatically equips armor when needed.");
        this.a(this.J, this.E, this.I, this.D, this.w, this.B);
    }

    private void a(int n6, int n10, int n11, int n12) {
        this.C.add(new n3(n6, n10, n11, n12));
    }

    public boolean S() {
        return this.N() && this.C.size() > 0;
    }

    @Override
    public void J() {
        super.J();
        this.z = false;
        this.F = false;
    }

    @Override
    public void b(kt kt2) {
        if (on.p.H().b(Ag.class).U() || on.p.H().b(zY.class).V() || on.p.H().b(zP.class).S() || on.p.t().c()) {
            this.C.clear();
            return;
        }
        eJ eJ2 = ds.k();
        if (!eJ2.bf().e() && eJ2.bf().g() != 0) {
            return;
        }
        if (this.J.u().booleanValue() && !ds.x().a(A5.ag) && !ds.x().a(A5.S)) {
            this.C.clear();
        }
        if (!this.C.isEmpty()) {
            if (this.G.a((long)this.B.t())) {
                n3 n32 = this.C.poll();
                n32.a();
                this.G.d();
            }
            return;
        }
        if (!this.a(eJ2)) {
            if (this.z) {
                eJ2.aX();
                this.F = false;
                this.z = false;
            }
            if (this.F) {
                this.z = true;
            }
            return;
        }
        if (this.w.u().booleanValue()) {
            this.v.a(eJ2);
            if (this.v.a()) {
                this.K.d();
                return;
            }
        }
        for (int k = 5; k < 9; ++k) {
            int n6 = this.a(k, (boolean)this.I.u());
            if (n6 == -1) continue;
            if (this.J.u().booleanValue() && !ds.x().a(A5.ag) && this.K.a(1000L)) {
                int n10 = ds.s().t().i();
                ei.a(n10, true);
                ei.a(n10);
                ei.a(n10, false);
                this.F = true;
                this.K.d();
                return;
            }
            if (this.E.u().booleanValue() && !ds.x().a(A5.ag)) {
                return;
            }
            if (eJ2.aY().a(n6).f().d()) {
                if (this.D.u().booleanValue()) {
                    this.a(eJ2.aY().g(), k, 0, 0);
                    this.a(eJ2.aY().g(), -999, 0, 0);
                } else {
                    this.a(eJ2.aY().g(), k, 0, 1);
                }
            }
            this.a(eJ2.aY().g(), n6, 0, 1);
            if (!this.F) continue;
            this.z = true;
        }
    }

    private boolean a(eC eC2) {
        for (int k = 5; k <= 8; ++k) {
            for (int i10 = 9; i10 < 45; ++i10) {
                fG fG2;
                if (!eC2.aY().a(i10).f().d() || this.a(fG2 = eC2.aY().a(i10).f()) == -1 || this.a(fG2) != k || this.a(k, false) == -1) continue;
                return true;
            }
        }
        return false;
    }

    private int e(int n6) {
        eJ eJ2 = ds.k();
        return eJ2.aY().a(n6).f().d() ? eJ2.aY().a(n6).f().m() : 999;
    }

    private int a(int n6, boolean bl) {
        int n10 = -1;
        eJ eJ2 = ds.k();
        fG fG2 = eJ2.aY().a(n6).f();
        double d10 = 0.0;
        double d11 = 999.0;
        if (fG2.d()) {
            d10 = this.b(fG2);
            d11 = this.e(n6);
        }
        double d12 = d10;
        double d13 = d11;
        for (int k = 9; k < 45; ++k) {
            fG fG3;
            if (!eJ2.aY().a(k).f().d() || this.a(fG3 = eJ2.aY().a(k).f()) == -1 || this.a(fG3) != n6) continue;
            double d14 = this.b(fG3);
            double d15 = this.e(k);
            if (d14 > d12) {
                d12 = d14;
                n10 = k;
                d13 = d15;
                continue;
            }
            if (!bl || d14 != d12 || !(d15 < d13)) continue;
            d13 = d15;
            n10 = k;
        }
        return n10;
    }

    private int a(fG fG2) {
        for (int n6 : this.y) {
            if (fG2.k().h() != n6) continue;
            return 8;
        }
        for (int n6 : this.u) {
            if (fG2.k().h() != n6) continue;
            return 7;
        }
        for (int n6 : this.A) {
            if (fG2.k().h() != n6) continue;
            return 6;
        }
        for (int n6 : this.H) {
            if (fG2.k().h() != n6) continue;
            return 5;
        }
        return -1;
    }

    private double b(fG fG2) {
        if (fG2.d() && fG2.k().a(A5.cN)) {
            int n6;
            int n10;
            fV fV2 = new fV(fG2.k());
            double d10 = fV2.m();
            int n11 = eq.a(e5.i().l(), fG2);
            if (n11 > 0) {
                d10 += (double)n11 * 0.1;
            }
            if ((n10 = eq.a(e5.j().l(), fG2)) > 0) {
                d10 += (double)n10 * 0.1;
            }
            if ((n6 = eq.a(e5.n().l(), fG2)) > 0) {
                d10 += (double)n6 * 0.1;
            }
            return d10 + (100.0 - d10 * 4.0) * (double)eq.a(0, fG2) * 4.0 * 0.0075;
        }
        return 0.0;
    }
}

