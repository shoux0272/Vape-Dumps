/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.A5;
import manthe.AO;
import manthe.CQ;
import manthe.DB;
import manthe.DF;
import manthe.Ds;
import manthe.cB;
import manthe.ds;
import manthe.f4;
import manthe.fG;
import manthe.fI;
import manthe.fk;
import manthe.fz;
import manthe.g4;
import manthe.gb;
import manthe.y5;

public class zD
extends y5 {
    private final DB y = DB.a((Object)this, "Swap Weapon", false, "Swaps to the strongest weapon on your hotbar.");
    private final DF F = DF.a(this, "Wait Delay", "#", "ms", 0.0, 0.0, 500.0, 50.0, "How long to wait before swapping to tool.");
    private final DB x = DB.a((Object)this, "Swap Back", false, "Swaps back to your original item\nwhen not hovering over blocks.");
    private final DF u = DF.a(this, "Swap Delay", "#", "ms", 50.0, 350.0, 1000.0, 50.0, "How long to wait before swapping back.");
    private final DB z = DB.a((Object)this, "Tool Hover Check", false, "Only swaps if you were hovering over the block.\nHelps prevent accidentally swapping during combat.");
    private final DF w = DF.a(this, "Hover Delay", "#", "ms", 50.0, 550.0, 1500.0, 50.0, "Automatically AutoTools if looking at\na block for the set delay amount.");
    private int v = -1;
    private boolean E;
    private boolean C;
    private final AO B = new AO();
    private final AO D = new AO();
    private final AO A = new AO();

    public zD() {
        super("AutoTool", 6485058, CQ.e, "Automatically swaps your hand to the appropriate tool.");
        this.x.a(new Ds[]{this.u});
        this.z.a(new Ds[]{this.w});
        this.a(this.y, this.F, this.x, this.u, this.z, this.w);
    }

    @Override
    public void q() {
        if (ds.k().e() || ds.x().d()) {
            return;
        }
        boolean bl = cB.f();
        gb gb2 = ds.I();
        if (bl) {
            if (gb2.h().e() && !gb2.g().equals(g4.g())) {
                if (!this.z.u().booleanValue() || this.E) {
                    float f10 = 1.0f;
                    int n6 = -1;
                    fI fI2 = ds.k().aY();
                    for (int k = 44; k >= 9; --k) {
                        f4 f42;
                        fG fG2 = fI2.a(k).f();
                        if (fG2.e()) continue;
                        float f11 = fG2.a(gb2.l(), gb2.m(), gb2.j());
                        fk fk2 = fG2.k();
                        if (fk2.d() && fk2.a(A5.aP) && (f42 = new f4(fk2)).m().equals(fz.f())) {
                            f11 = 1.5f;
                        }
                        if (!(f11 > f10)) continue;
                        f10 = f11;
                        n6 = k;
                    }
                    if (n6 >= 36 && n6 <= 44 && this.B.a(this.F.a().longValue())) {
                        this.D.d();
                        if (this.v == -1) {
                            this.v = ds.k().aU().i();
                        }
                        ds.k().aU().a(n6 - 36);
                    }
                }
            } else if (gb2.h().d() && this.y.u().booleanValue()) {
                float f12 = 1.0f;
                int n10 = -1;
                fI fI3 = ds.k().aY();
                for (int k = 44; k >= 9; --k) {
                    float f13;
                    fG fG3 = fI3.a(k).f();
                    if (fG3.e() || !((f13 = (float)cB.c(fG3)) > f12)) continue;
                    f12 = f13;
                    n10 = k;
                }
                if (n10 >= 36 && n10 <= 44 && this.B.a(this.F.a().longValue())) {
                    this.D.d();
                    if (this.v == -1) {
                        this.v = ds.k().aU().i();
                    }
                    ds.k().aU().a(n10 - 36);
                }
            }
        } else {
            this.B.d();
        }
        if (this.D.a(this.u.a().longValue()) && this.v != -1) {
            if (this.x.u().booleanValue()) {
                ds.k().aU().a(this.v);
            }
            this.v = -1;
        }
        if (gb2.d() && gb2.g().equals(g4.f())) {
            if (!this.C && bl || this.A.a(this.w.a().longValue())) {
                this.E = true;
            }
        } else {
            if (this.E && !bl) {
                this.E = false;
            }
            this.A.d();
        }
        this.C = bl;
    }

    @Override
    public void s() {
        this.a(50L, true);
    }
}

