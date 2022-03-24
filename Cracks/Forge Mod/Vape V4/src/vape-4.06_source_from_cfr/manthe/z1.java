/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Mouse
 */
package manthe;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import manthe.A5;
import manthe.CQ;
import manthe.DB;
import manthe.DD;
import manthe.Ds;
import manthe.Dy;
import manthe.V;
import manthe.b2;
import manthe.cB;
import manthe.dE;
import manthe.dX;
import manthe.ds;
import manthe.ei;
import manthe.fG;
import manthe.fQ;
import manthe.g4;
import manthe.gb;
import manthe.kf;
import manthe.kt;
import manthe.mD;
import manthe.nQ;
import manthe.oG;
import manthe.u5;
import manthe.uu;
import manthe.y5;
import org.lwjgl.input.Mouse;

public class z1
extends y5 {
    private final Dy N = Dy.a(this, "CPS", "#.#", "", 1.0, 6.0, 13.0, 20.0);
    private final DB H = DB.a((Object)this, "Inventory Fill", false, "AutoClicker functions while in inventory for refilling items");
    private final DB B = DB.a(this, "Blockhit", false);
    private final DB y = DB.a(this, "Right Click Mode", false);
    private final DB C = DB.a((Object)this, "Break Blocks", false, "Allows you to break blocks");
    private final DB M = DB.a((Object)this, "Disable click delay", true, "Disables Minecraft's delay between attacks upon missing hits");
    private final DD v = DD.a((Object)this, "autoclicker-alloweditems", "Allowed Items", DD.m, new mD("swords"));
    private final Dy x = Dy.a(this, "Right CPS", "#.#", "", 1.0, 6.0, 13.0, 20.0);
    private final DB G = DB.a((Object)this, "Limit to items", false, "AutoClicker functions only while holding selected items");
    private final DB I = DB.a((Object)this, "Limit to items", false, "AutoClicker functions only while holding selected items");
    private final DD E = DD.a((Object)this, "autoclicker-alloweditems-right", "Allowed Items", DD.m, new mD("blocks"));
    private final uu w = new uu(this, 0, true, true);
    private final uu D = new uu(this, 1, false, false);
    private final Queue<nQ> L = new ConcurrentLinkedQueue<nQ>();
    boolean J = false;
    boolean z = false;
    int K;
    private int u;
    private boolean A;
    private boolean F = false;

    public z1() {
        super("AutoClicker", -62703, CQ.c, "Hold attack button to automatically click");
        this.G.a(new Ds[]{this.E});
        this.I.a(new Ds[]{this.v});
        this.y.a(this.x, this.G);
        this.a(this.H, this.B, this.C);
        if (V.c() >= 15) {
            this.a(this.M);
        }
        this.a(this.N, this.y, this.x, this.G, this.E, this.I, this.v);
    }

    private List<Integer> X() {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        Object[] arrobject = ds.k().aU().h();
        for (int k = 0; k < 9; ++k) {
            fG fG2 = new fG(arrobject[k]);
            if (!fG2.e()) continue;
            arrayList.add(k);
        }
        return arrayList;
    }

    @Override
    public void a(kf kf2) {
        if (V.c() >= 15 && this.M.u().booleanValue() && cB.f() && ds.x().e()) {
            ds.b(0);
        }
        if (this.C.u().booleanValue() && ds.x().e() && ds.k().a8().m()) {
            gb gb2 = ds.I();
            if (gb2.d() && gb2.g().equals(g4.f())) {
                if (cB.f()) {
                    ei ei2 = ds.s().m();
                    if (!ei2.h()) {
                        uu.a(this.w);
                    }
                    if (this.z) {
                        uu.b(this.w);
                        this.z = false;
                    }
                }
                if (!this.H.u().booleanValue() || !ds.x().a(A5.bt)) {
                    this.J = true;
                    return;
                }
            } else if (cB.f()) {
                ei ei3 = ds.s().m();
                this.z = ei3.h();
            }
        }
        this.J = false;
    }

    private boolean W() {
        return this.J;
    }

    @Override
    public void J() {
        ei ei2 = ds.s().m();
        ei ei3 = ds.s().s();
        ei.a(ei2.i(), cB.f());
        if (cB.d()) {
            uu.a(this.D);
        }
    }

    @Override
    public void s() {
        if (!this.A) {
            this.A = true;
            new oG(this).start();
            new b2(this).start();
        }
    }

    private boolean V() {
        if (ds.x().d()) {
            return true;
        }
        if (!this.U()) {
            return true;
        }
        fG fG2 = ds.k().a_();
        return this.v.a(fG2, true);
    }

    private boolean U() {
        return this.I.u();
    }

    public boolean T() {
        if (ds.k().e()) {
            return false;
        }
        return this.V();
    }

    private boolean S() {
        if (ds.k().e()) {
            return false;
        }
        if (!this.G.u().booleanValue()) {
            return true;
        }
        fG fG2 = ds.k().a_();
        return this.E.a(fG2, true);
    }

    private void b(dE dE2) {
        int n6 = Mouse.getEventX() * dE2.h() / ds.F();
        int n10 = dE2.f() - Mouse.getEventY() * dE2.f() / ds.H() - 1;
        this.L.add(new nQ(n6, n10, null));
    }

    @Override
    public void b(kt kt2) {
        try {
            dX dX2 = ds.x();
            if (!dX2.a(A5.bt)) {
                return;
            }
            if (!this.L.isEmpty()) {
                nQ nQ2 = this.L.poll();
                dE dE2 = new dE(dX2);
                this.a(dE2);
                this.L.clear();
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    private void a(dE dE2) {
        boolean bl;
        int n6 = -1;
        int n10 = Mouse.getEventX() * dE2.h() / ds.F();
        int n11 = dE2.f() - Mouse.getEventY() * dE2.f() / ds.H() - 1;
        fQ fQ2 = dE2.a(n10, n11);
        int n12 = dE2.m();
        int n13 = dE2.p();
        boolean bl2 = bl = n10 < n12 || n11 < n13 || n10 >= n12 + dE2.n() || n11 >= n13 + dE2.j();
        if (fQ2.d()) {
            n6 = fQ2.g();
        }
        if (bl) {
            n6 = -1;
        }
        if (n6 >= 0) {
            boolean bl3 = false;
            fG fG2 = ds.k().aU().f();
            if (fG2.e()) {
                bl3 = true;
            }
            if (bl3) {
                int n14 = this.X().size();
                if (this.K != n6 && (n14 > 0 || n6 >= 36)) {
                    u5.a();
                    u5.d();
                    this.K = n6;
                }
            }
        }
    }

    static boolean a(z1 z12) {
        return z12.W();
    }

    static boolean f(z1 z12) {
        return z12.U();
    }

    static boolean l(z1 z12) {
        return z12.V();
    }

    static boolean c(z1 z12) {
        return z12.F;
    }

    static boolean a(z1 z12, boolean bl) {
        z12.F = bl;
        return z12.F;
    }

    static DB j(z1 z12) {
        return z12.H;
    }

    static uu b(z1 z12) {
        return z12.w;
    }

    static DB h(z1 z12) {
        return z12.y;
    }

    static uu k(z1 z12) {
        return z12.D;
    }

    static boolean g(z1 z12) {
        return z12.S();
    }

    static List i(z1 z12) {
        return z12.X();
    }

    static void a(z1 z12, dE dE2) {
        z12.b(dE2);
    }

    static DB m(z1 z12) {
        return z12.B;
    }

    static Dy d(z1 z12) {
        return z12.N;
    }

    static Dy e(z1 z12) {
        return z12.x;
    }
}

