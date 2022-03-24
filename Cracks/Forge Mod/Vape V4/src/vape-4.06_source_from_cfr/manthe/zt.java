/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import manthe.A5;
import manthe.CQ;
import manthe.d5;
import manthe.ds;
import manthe.e6;
import manthe.eC;
import manthe.eF;
import manthe.eq;
import manthe.ex;
import manthe.ey;
import manthe.fE;
import manthe.fG;
import manthe.fV;
import manthe.fX;
import manthe.fh;
import manthe.fp;
import manthe.gO;
import manthe.gS;
import manthe.kJ;
import manthe.kS;
import manthe.k_;
import manthe.kf;
import manthe.nH;
import manthe.on;
import manthe.tB;
import manthe.y5;

public class zt
extends y5 {
    private HashMap<Integer, tB> v = new HashMap();
    private List<eF> w = new ArrayList<eF>();
    private Object u;

    public zt() {
        super("CombatPrediction", 0, 0, CQ.b, "Estimates player health on pvp servers\nBy default attacks and health pots will be estimated\nNOTE: This feature may not always be accurate!");
    }

    public boolean S() {
        return on.p.t().i.u();
    }

    public boolean T() {
        return on.p.t().A.u();
    }

    @Override
    public boolean N() {
        return on.p.t().k.u();
    }

    @Override
    public void a(kf kf2) {
        if (kf2.c()) {
            return;
        }
        gO gO2 = ds.t();
        if (gO2.e()) {
            return;
        }
        if (this.u == null) {
            this.u = gO2.a();
        }
        if (!gO2.a().equals(this.u)) {
            this.w.clear();
            this.v.clear();
            this.u = gO2.a();
        }
        for (Object object : gO2.k()) {
            if (!A5.cc.isAssignableFrom(object.getClass()) || A5.u.isAssignableFrom(object.getClass())) continue;
            eC ex2 = new eC(object);
            if (this.v.containsKey(ex2.q())) {
                tB tB2 = this.v.get(ex2.q());
                tB2.a();
                continue;
            }
            this.v.put(ex2.q(), new tB(ex2));
        }
        ArrayList arrayList = new ArrayList();
        for (eF eF2 : this.w) {
            if (gO2.k().contains(eF2.a())) continue;
            double d10 = eF2.z();
            double d11 = eF2.l();
            double d12 = eF2.g();
            for (Map.Entry<Integer, tB> entry : this.v.entrySet()) {
                ex ex2 = ((gS)gO2).a(entry.getKey());
                if (!ex2.d() || !ex2.a(A5.cc)) continue;
                boolean bl = false;
                if (eF2.l() > ex2.l() + 0.5 && (double)ex2.a(eF2) < 2.2 && eF2.ad() >= 5) {
                    bl = true;
                }
                float f10 = zt.a(new eC(ex2.a()), eF2.at(), d10, d11, d12, bl);
                tB tB3 = entry.getValue();
                tB.b(tB3, tB.b(tB3) + f10);
            }
            arrayList.add(eF2);
        }
        if (arrayList.size() > 0) {
            this.w.removeAll(arrayList);
        }
    }

    @Override
    public void a(kJ kJ2) {
        tB tB2;
        if (kJ2.getTarget().a(A5.cc) && (tB2 = (tB)this.v.getOrDefault(kJ2.getTarget().q(), null)) != null) {
            tB.b(tB2, new eC(kJ2.getTarget().a()).aT());
            tB.c(tB2, 0);
            tB.a(tB2, true);
            tB.a(tB2, ds.k().aG());
        }
    }

    @Override
    public void a(kS kS2) {
        if (kS2.getEntity().a(A5.cc)) {
            tB tB2 = this.v.getOrDefault(kS2.getEntity().q(), new tB(new eC(kS2.getEntity())));
            if (tB2 != null) {
                tB.a(tB2, new eC(kS2.getEntity().a()));
                if (tB.a(tB2).a(10000L)) {
                    tB.b(tB2, 20.0f);
                    tB.b(tB2, 20);
                    tB.a(tB2, 0);
                    tB.a(tB2, 0.0f);
                    tB.c(tB2, 5.0f);
                    tB.a(tB2, null);
                    tB.a(tB2, false);
                    tB.a(tB2).d();
                }
            }
            return;
        }
        if (!kS2.getEntity().a(A5.aX)) {
            return;
        }
        if (ds.k().e()) {
            return;
        }
        eF eF2 = new eF(kS2.getEntity());
        if (eF2.at().e()) {
            return;
        }
        boolean bl = nH.a(eF2.at());
        if (!bl) {
            return;
        }
        this.w.add(new eF(kS2.getEntity().a()));
    }

    @Override
    public void a(k_ k_2) {
        tB tB2;
        if (!k_2.getName().equals("game.player.hurt")) {
            return;
        }
        if (k_2.getEntity().a(A5.cc) && ds.k().a(k_2.getEntity()) < 6.0f && (tB2 = (tB)this.v.getOrDefault(k_2.getEntity().q(), null)) != null) {
            tB.c(tB2, true);
        }
    }

    public float b(eC eC2) {
        tB tB2 = this.v.getOrDefault(eC2.q(), null);
        return !this.N() || tB2 == null ? eC2.aD() : tB.b(tB2);
    }

    private static float a(eC eC2, fG fG2, double d10, double d11, double d12, boolean bl) {
        fh fh2;
        double d13 = zt.a(eC2, d10, d11, d12);
        int n6 = 0;
        if (fG2.k().a(A5.dx) && (fh2 = new fh(fG2.k().a())).c(fG2) != null && fh.d(fG2)) {
            for (fE fE2 : fh2.f(fG2)) {
                if (fE2.g() != 6) continue;
                n6 = fE2.h();
            }
        }
        if (d13 < 16.0) {
            double d14 = 1.0 - Math.sqrt(d13) / 4.0;
            if (bl) {
                d14 = 1.0;
            }
            return zt.a(n6, d14);
        }
        return 0.0f;
    }

    private static float a(int n6, double d10) {
        return (int)(d10 * (double)(4 << n6) + 0.5);
    }

    private static double a(ex ex2, double d10, double d11, double d12) {
        double d13 = ex2.z() - d10;
        double d14 = ex2.l() - d11;
        double d15 = ex2.g() - d12;
        return d13 * d13 + d14 * d14 + d15 * d15;
    }

    private static float b(fG fG2, eC eC2, boolean bl, boolean bl2) {
        d5 d52;
        float f10 = 1.0f;
        if (fG2.d() && (d52 = fG2.f()).f() > 0) {
            e6 e62 = new e6(d52.g().toArray()[0]);
            f10 += (float)e62.g();
        }
        float f11 = 0.0f;
        f11 = eq.b(fG2, ey.f());
        if (f10 > 0.0f || f11 > 0.0f) {
            if (bl2 && f10 > 0.0f) {
                f10 *= 1.5f;
            }
            float f12 = zt.a(eC2, bl, f10 += f11);
            return f12;
        }
        return 0.0f;
    }

    private static float a(eC eC2, boolean bl, float f10) {
        if (bl && f10 > 0.0f) {
            f10 = (1.0f + f10) * 0.5f;
        }
        f10 = zt.a(eC2, f10);
        f10 = zt.b(eC2, f10);
        return f10;
    }

    private static float a(eC eC2, float f10) {
        int n6 = 25 - zt.a(eC2);
        float f11 = f10 * (float)n6;
        f10 = f11 / 25.0f;
        return f10;
    }

    private static int a(eC eC2) {
        int n6 = 0;
        for (Object object : eC2.aU().g()) {
            fG fG2 = new fG(object);
            if (!fG2.d() || !fG2.k().a(A5.cN)) continue;
            fV fV2 = new fV(fG2.k().a());
            int n10 = fV2.m();
            n6 += n10;
        }
        return n6;
    }

    private static float b(eC eC2, float f10) {
        if (eC2.a(fX.l())) {
            int n6 = (eC2.b(fX.l()).h() + 1) * 5;
            int n10 = 25 - n6;
            float f11 = f10 * (float)n10;
            f10 = f11 / 25.0f;
        }
        if (f10 <= 0.0f) {
            return 0.0f;
        }
        ArrayList<fG> arrayList = new ArrayList<fG>();
        for (Object object : eC2.aU().g()) {
            arrayList.add(new fG(object));
        }
        int n11 = zt.a(arrayList.toArray(new fG[0]), fp.a(ds.k()));
        if (n11 > 20) {
            n11 = 20;
        }
        if (n11 > 0) {
            int n12 = 25 - n11;
            float f12 = f10 * (float)n12;
            f10 = f12 / 25.0f;
        }
        return f10;
    }

    private static int a(fG[] arrfG, fp fp2) {
        eq.f().a(0);
        eq.f().a(fp2);
        eq.a(eq.f(), arrfG);
        if (eq.f().g() > 25) {
            eq.f().a(25);
        } else if (eq.f().g() < 0) {
            eq.f().a(0);
        }
        return (eq.f().g() + 1 >> 1) + ((eq.f().g() >> 1) + 1) / 2;
    }

    static float a(fG fG2, eC eC2, boolean bl, boolean bl2) {
        return zt.b(fG2, eC2, bl, bl2);
    }

    static float b(eC eC2, boolean bl, float f10) {
        return zt.a(eC2, bl, f10);
    }
}

