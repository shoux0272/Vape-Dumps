/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import manthe.A5;
import manthe.CQ;
import manthe.DB;
import manthe.DX;
import manthe.V;
import manthe.Y;
import manthe.cB;
import manthe.cy;
import manthe.dJ;
import manthe.dL;
import manthe.ds;
import manthe.dx;
import manthe.dy;
import manthe.eC;
import manthe.eJ;
import manthe.eg;
import manthe.ex;
import manthe.fS;
import manthe.g1;
import manthe.gO;
import manthe.gS;
import manthe.kS;
import manthe.kt;
import manthe.on;
import manthe.pJ;
import manthe.pb;
import manthe.y5;

public class y0
extends y5 {
    private final pb C = new pb("Advanced");
    private final pb y = new pb("Normal");
    private final DX u = DX.a((Object)this, "Mode", "Advanced - More likely to work on anticheats with complex bots\nNormal - More likely to work on anticheats with basic bots", this.C, this.C, this.y);
    private final DB z = DB.a((Object)this, "Remove Bots", false, "Removes bots");
    private final List<Object> A = new ArrayList<Object>();
    private final Map<Integer, Integer> B = new HashMap<Integer, Integer>();
    private final Map<Integer, Integer> w = new HashMap<Integer, Integer>();
    private Object v;
    private int D = 0;
    private int x = 0;

    public y0() {
        super("AntiBot", -16711707, CQ.f, "Prevents modules from attacking bots");
        this.a(this.u, this.z);
    }

    private void T() {
        if (this.D >= 20) {
            this.D = 0;
        }
        if (this.D++ == 0) {
            this.w.clear();
            gO gO2 = ds.t();
            fS fS2 = ds.k().bp();
            if (gO2.e() || fS2.e()) {
                return;
            }
            List list = dy.f().a(fS2.g());
            List list2 = ds.t().j();
            for (Object e10 : list) {
                if (e10 == null) continue;
                eg eg2 = new eg(e10);
                for (Object e11 : list2) {
                    eC eC2 = new eC(e11);
                    if (!eC2.aV().d() || !eC2.aV().equals(eg2.f())) continue;
                    int n6 = Math.max(eg2.g(), 0);
                    this.w.put(eC2.q(), n6);
                }
            }
        }
    }

    private int a(eC eC2) {
        return this.w.getOrDefault(eC2.q(), -1);
    }

    public boolean a(ex ex2) {
        if (this.u.v() == this.C) {
            if (!cB.h) {
                return false;
            }
            if (ex2.a(A5.u)) {
                return false;
            }
            if (ex2.a(A5.cc)) {
                boolean bl;
                int n6;
                eC eC2 = new eC(ex2);
                if (this.a(ds.k()) == 1 && (n6 = this.a(eC2)) != -1) {
                    boolean bl2;
                    boolean bl3 = bl2 = n6 == 1;
                    return !bl2;
                }
                String string = eC2.h().f();
                if (this.B.getOrDefault(eC2.q(), 0) < 15) {
                    return true;
                }
                if (eC2.a1()) {
                    return true;
                }
                boolean bl4 = bl = !this.S().contains(eC2.N());
                if (string.equals("\u00a7r" + eC2.S() + "\u00a7r") || string.equals(eC2.S() + "\u00a7r") || string.contains("[NPC]")) {
                    if (bl) {
                        // empty if block
                    }
                    return bl;
                }
            }
        } else if (this.u.v() == this.y && ex2.a(A5.cc)) {
            eC eC3 = new eC(ex2);
            eJ eJ2 = ds.k();
            boolean bl = false;
            if (cB.h) {
                bl = eC3.aD() >= 0.0f;
            }
            return bl || eC3.l() > eJ2.l() + 3.0 && eJ2.a(eC3) < 10.0f && this.B.getOrDefault(eC3.q(), -1) < 20;
        }
        return false;
    }

    @Override
    public void a(kS kS2) {
        if (A5.cc.isAssignableFrom(kS2.getEntity().a().getClass())) {
            ++this.x;
        }
    }

    @Override
    public void b(kt kt2) {
        block23: {
            block24: {
                Object object;
                Object object2;
                Object object3;
                this.a(this.u.v().H());
                this.T();
                if (this.u.v() != this.C) break block24;
                if (this.v == null || !ds.t().a().equals(this.v)) {
                    this.w.clear();
                    this.B.clear();
                    this.A.clear();
                    this.v = ds.t().a();
                }
                gO gO2 = ds.t();
                if (this.D == 1) {
                    try {
                        object3 = this.B.entrySet().iterator();
                        while (object3.hasNext()) {
                            object2 = (Map.Entry)object3.next();
                            Integer n6 = (Integer)object2.getKey();
                            object = ((gS)gO2).a(n6);
                            if (!((cy)object).e()) continue;
                            object3.remove();
                        }
                        object3 = gO2.k();
                        object2 = this.A.iterator();
                        while (object2.hasNext()) {
                            if (object3.contains(object2.next())) continue;
                            object2.remove();
                        }
                    }
                    catch (Exception exception) {
                        on.a(exception);
                    }
                }
                object3 = ds.k();
                object2 = this.S();
                boolean bl = this.a((eC)object3) == 1;
                object = new ArrayList();
                for (Object object4 : gO2.j()) {
                    boolean bl2;
                    boolean bl3;
                    double d10;
                    double d11;
                    double d12;
                    double d13;
                    eC eC2;
                    if (A5.u.isAssignableFrom(object4.getClass()) || this.B.getOrDefault((eC2 = new eC(object4)).q(), 0) >= 3000 && eC2.V()) continue;
                    if (((ex)object3).ad() > 250 && eC2.ad() <= 2 && !this.A.contains(eC2.a())) {
                        d13 = ((ex)object3).z() - eC2.z();
                        d12 = ((ex)object3).l() - eC2.g();
                        d11 = ((ex)object3).g() - eC2.g();
                        d10 = Y.e(d13 * d13 + d12 * d12 + d11 * d11);
                        String string = eC2.h().f();
                        bl3 = string.endsWith("\u00a7c" + eC2.S() + "\u00a7r");
                        if (Math.abs(d10) > 3.0 && ((ex)object3).ad() > 260 && this.x <= 12 && bl3) {
                            this.A.add(eC2.a());
                            this.B.put(eC2.q(), -20);
                        }
                    }
                    if (eC2.ad() <= 150 && ((ex)object3).a(eC2) < 50.0f && ((ex)object3).ad() > 150 && (d10 = (d13 = eC2.T() - eC2.z()) * d13 + (d12 = eC2.R() - eC2.l()) * d12 + (d11 = eC2.X() - eC2.g()) * d11) > 2.0 && d10 < 400.0 && this.A.contains(eC2.a()) && (!((ex)object3).ae() || ((eC)object3).a8().i()) && !eC2.P()) {
                        int n10 = this.B.getOrDefault(eC2.q(), 0);
                        if (n10 > -50000 && !eC2.ae() && eC2.h().f().contains("\u00a7c" + eC2.S() + "\u00a7r") && (double)((ex)object3).a(eC2) < 7.5) {
                            on.p.r().a("\u00a7cInvalid Player Spawn", eC2.h().f() + " \u00a7fmay be a fake player!", pJ.WARNING, 5000L);
                            this.B.put(eC2.q(), -999999);
                        }
                        this.B.put(eC2.q(), Math.max(n10 - 50, -50));
                    }
                    if (bl && object2.contains(eC2.N()) && this.a(eC2) == 1 && eC2.V() && this.B.getOrDefault(eC2.q(), 0) > 1500) continue;
                    int n11 = (int)Math.floor(eC2.z());
                    int n12 = (int)Math.floor(eC2.l() + (double)eC2.am());
                    int n13 = (int)Math.floor(eC2.g());
                    dL dL2 = null;
                    if (V.c() >= 23) {
                        dL2 = gO2.a(g1.a(n11, n12, n13));
                    }
                    boolean bl4 = !gO2.b(n11, n12, n13).a(dL2);
                    double d14 = eC2.R() - eC2.l();
                    double d15 = Math.abs(eC2.R() - eC2.l());
                    bl3 = this.b(n11, (int)(eC2.l() - (d14 < 0.05 ? 0.45 : 0.9)), n13);
                    boolean bl5 = bl2 = bl4 && bl3;
                    if (bl2) {
                        this.B.put(eC2.q(), this.B.getOrDefault(eC2.q(), 0) + (d15 < 0.05 ? (eC2.ae() ? 1 : 3) : 1));
                    } else if (eC2.aN() <= 0 && !eC2.af() && !eC2.P() && d15 > 0.1 || eC2.ae() && (d15 == 0.0 || d15 > 0.5)) {
                        this.B.put(eC2.q(), this.B.getOrDefault(eC2.q(), 0) - (eC2.ae() ? 4 : 1));
                    }
                    String string = eC2.h().f();
                    boolean bl6 = string.endsWith("\u00a7c" + eC2.S() + "\u00a7r");
                    int n14 = this.B.getOrDefault(eC2.q(), 0);
                    if (!this.z.u().booleanValue()) continue;
                    if ((bl6 || string.equals(eC2.S())) && bl6 && !object2.contains(eC2.N()) && n14 < 0 && eC2.ae() && ((ex)object3).a(eC2) < 10.0f && eC2.ad() > 45) {
                        object.add(eC2);
                        continue;
                    }
                    if (eC2.ad() <= 45 || (!eC2.ae() || n14 >= 15 || !bl6 && !string.equals(eC2.S()) && !string.equals(eC2.S() + "\u00a7r")) && eC2.V()) continue;
                    object.add(eC2);
                }
                this.x = 0;
                if (!this.z.u().booleanValue() || object.size() <= 0) break block23;
                Iterator iterator = object.iterator();
                while (iterator.hasNext()) {
                    Object object4;
                    object4 = (eC)iterator.next();
                    gO2.a((ex)object4);
                }
                break block23;
            }
            if (this.u.v() == this.y) {
                if (this.v == null || !ds.t().a().equals(this.v)) {
                    this.B.clear();
                    this.v = ds.t().a();
                }
                gO gO3 = ds.t();
                eJ eJ2 = ds.k();
                for (Object e10 : gO3.j()) {
                    eC eC3 = new eC(e10);
                    if (eC3.a(A5.u)) continue;
                    if (cB.h) {
                        if (Float.isNaN(eC3.aD()) || !(eC3.l() > eJ2.l()) || !(eJ2.a(eC3) < 10.0f)) continue;
                        gO3.a(eC3);
                        break;
                    }
                    gO gO4 = ds.t();
                    int n15 = (int)eC3.z();
                    int n16 = (int)eC3.l();
                    int n17 = (int)eC3.g();
                    dL dL3 = gO3.a(g1.a(n15, n16, n17));
                    boolean bl = gO4.b((int)eC3.z(), (int)(eC3.l() + (double)eC3.am()), (int)eC3.g()).a(dL3);
                    boolean bl7 = gO4.a((double)((int)eC3.z()), (double)((int)eC3.l()) - 0.5, (double)((int)eC3.g())).h().equals(dJ.i());
                    if (!bl7 && bl) {
                        this.B.put(eC3.q(), this.B.getOrDefault(eC3.q(), -1) + 1);
                    } else {
                        this.B.put(eC3.q(), this.B.getOrDefault(eC3.q(), -1) - 1);
                    }
                    String string = eC3.h().f();
                    if (!(eC3.l() > eJ2.l() + 3.0 && string.endsWith(eC3.S() + cB.v + "r") && eJ2.a(eC3) < 7.0f && this.B.getOrDefault(eC3.q(), -1) < 60) && !eC3.ae()) continue;
                    if (!this.z.u().booleanValue()) break;
                    gO3.a(eC3);
                    break;
                }
            }
        }
    }

    @Override
    public void J() {
        this.w.clear();
        this.B.clear();
        this.A.clear();
    }

    public boolean a(double d10, double d11, double d12) {
        gO gO2 = ds.t();
        boolean bl = Y.a(d11 - (double)((int)d11), 1) == 0.5;
        dL dL2 = gO2.a(g1.a(d10, d11 - (bl ? 0.0 : 0.1), d12));
        dx dx2 = dL2.f();
        boolean bl2 = bl ? dx2.h().equals(dJ.i()) : !dx2.a(dL2) || dx2.h().equals(dJ.i());
        dL dL3 = gO2.a(g1.a(d10, d11 + 1.5, d12));
        return !bl2 && !dL3.f().a(dL3);
    }

    public boolean b(double d10, double d11, double d12) {
        double[][] arrarrd;
        boolean bl = false;
        for (double[] arrd : arrarrd = new double[][]{{0.0, 0.0}, {-0.35, -0.35}, {-0.35, 0.35}, {0.35, 0.35}, {0.35, -0.35}}) {
            double d13 = arrd[0];
            double d14 = d13 + d10;
            double d15 = arrd[1];
            double d16 = d15 + d12;
            if (!this.a(d14, d11, d16)) continue;
            bl = true;
            break;
        }
        return bl;
    }

    private List<UUID> S() {
        ArrayList<UUID> arrayList = new ArrayList<UUID>();
        fS fS2 = ds.k().bp();
        List list = dy.f().a(fS2.g());
        for (Object e10 : list) {
            eg eg2 = new eg(e10);
            if (!eg2.d()) continue;
            arrayList.add(eg2.f().g());
        }
        return arrayList;
    }
}

