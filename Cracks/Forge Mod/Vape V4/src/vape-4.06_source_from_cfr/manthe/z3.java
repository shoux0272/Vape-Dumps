/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import a.a;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;
import manthe.A5;
import manthe.AO;
import manthe.BZ;
import manthe.CQ;
import manthe.DB;
import manthe.DD;
import manthe.DF;
import manthe.DX;
import manthe.DY;
import manthe.De;
import manthe.Ds;
import manthe.Dy;
import manthe.V;
import manthe.Y;
import manthe.ab;
import manthe.ac;
import manthe.cB;
import manthe.cs;
import manthe.cy;
import manthe.dm;
import manthe.ds;
import manthe.eC;
import manthe.eJ;
import manthe.ej;
import manthe.ex;
import manthe.fG;
import manthe.fk;
import manthe.kO;
import manthe.km;
import manthe.kt;
import manthe.kx;
import manthe.ky;
import manthe.np;
import manthe.on;
import manthe.p4;
import manthe.pb;
import manthe.pf;
import manthe.rz;
import manthe.sV;
import manthe.ub;
import manthe.uq;
import manthe.wg;
import manthe.y5;
import manthe.ye;
import manthe.yx;

public class z3
extends y5 {
    public final DY ag = DY.a(this);
    public final DF am = DF.a(this, "Swing range", "#.#", "", 0.0, 4.0, 6.0);
    public final DF W = DF.a(this, "Attack range", "#.#", "", 0.0, 3.5, 6.0);
    public final DF ae = DF.a((Object)this, "Switch Delay", "#", "", 50.0, 400.0, 1000.0, 50.0);
    public final DB E = DB.a(this, "Require mouse down", false);
    public final DB O = DB.a(this, "Disable on Death", false);
    public final DB J = DB.a(this, "Show target", false);
    public final DB D = DB.a((Object)this, "Limit to items", false, "Killaura functions only while holding selected items");
    public final DB z = DB.a((Object)this, "AutoBlock", false, "Automatically blocks").d(true);
    public final DB aa = DB.a((Object)this, "GUI Check", true, "Does not attack when inside of a GUI.");
    public final DB M = DB.a((Object)this, "Legit Aura", false, "Use Legit Aura instead of Blatant Aura when blatant is enabled.").d(true);
    public final DB H = DB.a((Object)this, "No Swing", false, "Prevents you from swinging server side.").d(true);
    public final DB U = DB.a((Object)this, "Perfect Swing", false, "Attacks perfectly on 1.9+ combat servers.\n(1.12.2 Only)");
    public final Dy af = Dy.a(this, "Attacks per Second", "#.#", "", 1.0, 6.0, 13.0, 20.0);
    public final DF ac = DF.a((Object)this, "Max angle", "#", "", 1.0, 90.0, 360.0, 5.0);
    public final DF ad = DF.a((Object)this, "Max targets", "#", "", 1.0, 1.0, 6.0, 1.0);
    private final p4 u = new p4("Switch", new yx(this, "Switch"));
    private final p4 x = new p4("Normal", new ye(this, "Normal"));
    private final DX V = DX.a((Object)this, "Blatant Mode", "Killaura mode when blatant is enabled.\nSwitch - NCP switch killaura\nNormal - Vanilla Killaura (attacks multiple entities at once)", (pb)this.u, this.u, this.x);
    private final pb B = new pb("Distance");
    public final pb ai = new pb("Yaw");
    public final pb P = new pb("Armor");
    public final pb ao = new pb("Threat");
    public final pb Z = new pb("Health");
    private final DD A = DD.a((Object)this, "killaura-alloweditems", "Allowed Items", DD.m, Collections.emptyList());
    private final Random y = new Random();
    private final Random F = new Random();
    private final Random aj = new Random();
    private final Random ah = new Random();
    private final Color C = new Color(255, 0, 0, 100);
    private final Color S = new Color(255, 112, 112, 100);
    public pb L = new pb("Lock View");
    public pb I = new pb("Anti-Cheat");
    public pb G = new pb("Silent");
    public pb v = new pb("None");
    public DX T = DX.a((Object)this, "Aim Mode", "Aim Mode when blatant is enabled.\nSilent - Aims silently for you (server side)\nAnti-Cheat - Silent aim but bypasses\nLock View - Locks your view client side to server side angles\nNone - Does not manipulate your view angles", this.G, this.G, this.I, this.L, this.v);
    public AO K = new AO();
    public AO Q = new AO();
    public List<ej> R = new CopyOnWriteArrayList<ej>();
    public int Y;
    public DX ab = DX.a((Object)this, "Target Mode", "How Killaura should prioritize targets.\nArmor/Threat will default to Distance for non player targets.", this.B, this.B, this.ai, this.P, this.ao, this.Z);
    private long N;
    private int w;
    private boolean ak;
    private int al;
    private boolean X = false;
    private static cy[] an;

    public z3() {
        super("Killaura", -2420426, CQ.f, "Attack players around you\nwithout aiming at them.");
        ((rz)this.V.c()).a(new uq(this));
        this.V.a(this.u, this.H, this.z, this.ae);
        this.a(this.ag, this.af, this.ae, this.am, this.W, this.ac, this.ad, this.V, this.ab, this.T);
        if (manthe.V.c() <= 15) {
            this.a(this.z);
        } else {
            this.a(this.U);
        }
        this.a(this.O, this.E, this.aa, this.J, this.M, this.H, this.D.a(new Ds[]{this.A}), this.A);
        ((sV)this.am.c()).a(new cs(this));
    }

    public ej S() {
        if (this.R.isEmpty() || this.R.size() - 1 < this.Y) {
            return null;
        }
        return this.R.get(this.Y);
    }

    @Override
    public void s() {
        super.s();
        this.R.clear();
    }

    @Override
    public void J() {
        super.J();
        this.R.clear();
    }

    private boolean V() {
        return this.M.x() != false || ds.k().d() && ds.k().P();
    }

    @Override
    public void a(kO kO2) {
        ((y5)((p4)this.V.v()).f()).a(kO2);
    }

    @Override
    public void b(kt kt2) {
        boolean bl;
        Object object;
        if (this.am.a() < this.W.a()) {
            this.am.b(this.W.a() + 0.1);
        }
        if (this.O.u().booleanValue()) {
            if (ds.k().j() || ds.k().aD() <= 0.0f) {
                this.z();
                return;
            }
            dm dm2 = ds.i();
            if (dm2.d()) {
                object = dm2.f();
                if (!this.X && object != null && (((String)object).toLowerCase().contains("died") || ((String)object).toLowerCase().contains("dead"))) {
                    this.X = true;
                    this.z();
                    return;
                }
                if (object == null || ((String)object).equals("")) {
                    this.X = false;
                }
            }
        }
        if (!this.V() && a.ib()) {
            return;
        }
        if (this.aa.u().booleanValue() && ds.x().d()) {
            return;
        }
        if (ds.t().e()) {
            return;
        }
        if (this.E.u().booleanValue() && !cB.f()) {
            this.R.clear();
            return;
        }
        boolean bl2 = manthe.V.c() < 23;
        object = ds.k();
        boolean bl3 = manthe.V.c() > 15 && this.U.u().booleanValue() ? ((eC)object).s(0.5f) == 1.0f : (bl = this.Q.a(this.U()));
        if (!bl) {
            return;
        }
        this.T();
        for (ej ej2 : this.R) {
            double d10;
            if (!this.a(ej2) || !((d10 = (double)((ex)object).a(ej2)) <= this.am.a())) continue;
            if (bl2) {
                ((ej)object).aO();
            }
            if (d10 <= this.W.a()) {
                ds.K().a((eC)object, ej2);
                if (bl2) continue;
                ((ej)object).aO();
                continue;
            }
            if (bl2) continue;
            ((ej)object).aO();
            ((eC)object).a4();
        }
        this.Q.d();
    }

    @Override
    public void a(kx kx2) {
        this.a(this.V.v().H());
        if (this.J.u().booleanValue() && !this.R.isEmpty()) {
            eJ eJ2 = ds.k();
            for (ej ej2 : this.R) {
                ej ej3 = this.S();
                if ((double)eJ2.a(ej2) <= this.W.a() && (!a.ib() || ej3 != null && ej3.equals(ej2))) {
                    manthe.ac.a(ej2, 0.0, null, this.C, kx2.getTicks());
                    continue;
                }
                manthe.ac.a(ej2, 0.0, null, this.S, kx2.getTicks());
            }
        }
    }

    @Override
    public void a(km km2) {
        if (this.V()) {
            return;
        }
        ((y5)((p4)this.V.v()).f()).a(km2);
    }

    @Override
    public void a(ky ky2) {
        if (this.V()) {
            return;
        }
        ((y5)((p4)this.V.v()).f()).a(ky2);
    }

    public long U() {
        int n6;
        int n10;
        int n11 = this.af.v()[0].intValue();
        int n12 = n11 - (n10 = this.af.v()[1].intValue());
        int n13 = n6 = n12 <= 0 ? n10 : this.y.nextInt(n12) + n10 + 1;
        if (n6 == 0) {
            n6 = 1;
        }
        if (!this.ak) {
            this.N = 1000 / n6;
            if (this.ah.nextInt(4) == 1) {
                this.ak = true;
                this.al = 1 + this.ah.nextInt(5);
            } else if (this.ah.nextInt(10) != 1 && this.ah.nextInt(10) == 1) {
                this.ak = true;
                this.al = 5 + this.ah.nextInt(10);
            }
        }
        if (this.ak) {
            ++this.w;
            if (this.w >= this.al) {
                this.w = 0;
                this.ak = false;
            }
        }
        boolean bl = true;
        if (this.F.nextInt(48) % (!bl ? 4 : 10) == 0 && !this.ak) {
            n10 = !bl ? 50 : 25;
            n11 = !bl ? 120 : 70;
            n12 = n11 - n10;
            this.N += (long)(this.aj.nextInt(n12) + n10);
        }
        return this.N;
    }

    public void T() {
        this.R.clear();
        ArrayList arrayList = new ArrayList(ds.t().k());
        for (Object e10 : arrayList) {
            ej ej2;
            ex ex2 = new ex(e10);
            if (cB.h && ex2.a(A5.a8) || !ex2.a(A5.cF) || !this.a(ej2 = new ej(e10))) continue;
            this.R.add(ej2);
        }
        if (this.ab.v() == this.ai) {
            this.R.sort(new wg(this, null));
        } else if (this.ab.v() == this.B) {
            this.R.sort(new np(this, null));
        } else if (this.ab.v() == this.ao) {
            this.R.sort(new De(this, null));
        } else if (this.ab.v() == this.P) {
            this.R.sort(new ub(this, null));
        } else if (this.ab.v() == this.Z) {
            this.R.sort(new BZ(this, null));
        }
        ArrayList<ej> arrayList2 = new ArrayList<ej>(this.R);
        this.R.clear();
        for (int k = 0; k < this.ad.a().intValue() && k < arrayList2.size(); ++k) {
            this.R.add((ej)arrayList2.get(k));
        }
    }

    private boolean b(ej ej2) {
        if (this.D.u().booleanValue()) {
            fG fG2 = ds.k().a_();
            if (fG2.e()) {
                return false;
            }
            fk fk2 = fG2.k();
            if (fk2.e()) {
                return false;
            }
            return this.A.a(fG2, true) && this.ag.a(ej2);
        }
        return this.ag.a(ej2);
    }

    public boolean a(ej ej2) {
        if (ej2.e()) {
            return false;
        }
        if (ej2.equals(ds.k())) {
            return false;
        }
        if (!this.b(ej2)) {
            return false;
        }
        if (ej2.aD() <= 0.0f || ej2.j()) {
            return false;
        }
        if ((double)ds.k().a(ej2) >= this.am.a()) {
            return false;
        }
        if (pf.b(ds.k(), ej2) > this.ac.a().intValue() / 2) {
            return false;
        }
        ab ab2 = on.p.N().b(ej2.S());
        if (ab2 != null && !ab2.c()) {
            return false;
        }
        return !ej2.equals(ds.k().m());
    }

    private float[] a(double d10, double d11, double d12) {
        eJ eJ2 = ds.k();
        double d13 = d10 - eJ2.z();
        double d14 = d11 - eJ2.g();
        double d15 = d12 - eJ2.s().l() - 1.2;
        double d16 = manthe.Y.e(d13 * d13 + d14 * d14);
        float f10 = (float)(Math.atan2(d14, d13) * 180.0 / Math.PI) - 90.0f;
        float f11 = (float)(-(Math.atan2(d15, d16) * 180.0 / Math.PI));
        return new float[]{f10, f11};
    }

    public float[] c(ej ej2) {
        double d10 = ej2.z();
        double d11 = ej2.g();
        double d12 = ej2.s().l() + (double)(ej2.am() / 2.0f);
        return this.a(d10, d11, d12);
    }

    public float a(double d10, double d11, float f10) {
        eJ eJ2 = ds.k();
        double d12 = d10 - eJ2.z();
        double d13 = d11 - eJ2.g();
        double d14 = d13 < 0.0 && d12 < 0.0 ? 90.0 + Math.toDegrees(Math.atan(d13 / d12)) : (d13 < 0.0 && d12 > 0.0 ? -90.0 + Math.toDegrees(Math.atan(d13 / d12)) : Math.toDegrees(-Math.atan(d12 / d13)));
        return manthe.Y.a(-(f10 - (float)d14));
    }

    static DX a(z3 z32) {
        return z32.V;
    }

    public static void a(cy[] arrcy) {
        an = arrcy;
    }

    public static cy[] W() {
        return an;
    }

    static {
        if (z3.W() != null) {
            z3.a(new cy[3]);
        }
    }
}

