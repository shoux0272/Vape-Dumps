/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.util.ArrayList;
import java.util.List;
import manthe.CQ;
import manthe.DB;
import manthe.DF;
import manthe.Dp;
import manthe.ds;
import manthe.dx;
import manthe.eJ;
import manthe.g7;
import manthe.kY;
import manthe.kf;
import manthe.kv;
import manthe.l3;
import manthe.l4;
import manthe.lQ;
import manthe.lb;
import manthe.lh;
import manthe.lo;
import manthe.on;
import manthe.u7;
import manthe.y5;

public class Ao
extends y5 {
    private final Dp z = Dp.a((Object)this, "xray-blocks", "Xray Blocks", Dp.q, "Gold Ore", "Iron Ore", "Diamond Ore", "Emerald Ore", "Lapis Lazuli Ore", "Gold Block", "Iron Block", "Diamond Block", "Emerald Block");
    private final DF y = DF.a((Object)this, "Opacity", "#", "", 0.0, 60.0, 255.0, 1.0);
    private final DB w = DB.a((Object)this, "Cave Mode", false, "Only shows ores that are exposed to air.");
    private float v = 1.0f;
    private double x = 0.0;
    private final List<Integer> A = new ArrayList<Integer>();
    private static int[] u;

    public Ao() {
        super("Xray", 65535, CQ.e, "Renders whitelisted blocks through walls.");
        this.a(this.y, this.w, this.z);
        this.y.a(new u7(this));
    }

    @Override
    public boolean n() {
        return true;
    }

    private void U() {
        if (ds.k().e() || this.y.a() == this.x) {
            return;
        }
        int n6 = 4000;
        eJ eJ2 = ds.k();
        int n10 = (int)eJ2.z();
        int n11 = (int)eJ2.g();
        ds.t().a(n10 - n6, 0, n11 - n6, n10 + n6, 300, n11 + n6);
        this.x = this.y.a();
    }

    @Override
    public void a(kf kf2) {
        this.A.clear();
        for (String string : this.z.s()) {
            dx dx2 = dx.a(string.replace(" ", "_").toLowerCase());
            if (dx2 == null || this.A.contains(dx.a(dx2))) continue;
            this.A.add(dx.a(dx2));
        }
    }

    @Override
    public void s() {
        if (!on.p.s().d()) {
            on.p.s().e();
        }
        ds.G().f();
        this.v = ds.s().p();
        ds.s().b(10.0f);
        this.U();
    }

    @Override
    public void J() {
        ds.G().f();
        ds.s().b(this.v);
    }

    public int S() {
        return this.y.a().intValue();
    }

    public boolean a(dx dx2) {
        return this.A.contains(dx.a(dx2));
    }

    public void a(l4 l42) {
        if (!this.N()) {
            return;
        }
        if (this.a(l42.getBlock())) {
            l42.a(this.w.u() == false);
        }
    }

    public void a(lb lb2) {
        if (!this.N()) {
            return;
        }
        lb2.a(true);
    }

    public void a(lo lo2) {
        if (!this.N()) {
            return;
        }
        lo2.a(true);
        if (this.a(lo2.getBlock())) {
            lo2.setShouldRender(true);
        }
    }

    public void a(lh lh2) {
        lh2.setOpacity(this.y.a().intValue());
    }

    public void a(lQ lQ2) {
        if (this.a(lQ2.getBlock())) {
            lQ2.a(true);
            if (lQ2.getEnumWorldBlockLayer().equals(g7.g())) {
                lQ2.setShouldRender(true);
            } else {
                lQ2.setShouldRender(false);
            }
        }
    }

    public void a(kY kY2) {
        if (!this.N()) {
            return;
        }
        kY2.a(true);
    }

    public void a(l3 l32) {
        if (!this.N()) {
            return;
        }
        l32.a(true);
    }

    public void a(kv kv2) {
        if (!this.N()) {
            return;
        }
        kv2.getRenderBlocks().a(this.a(kv2.getBlock()));
    }

    static void a(Ao ao) {
        ao.U();
    }

    public static void b(int[] arrn) {
        u = arrn;
    }

    public static int[] T() {
        return u;
    }

    static {
        if (Ao.T() == null) {
            Ao.b(new int[5]);
        }
    }
}

