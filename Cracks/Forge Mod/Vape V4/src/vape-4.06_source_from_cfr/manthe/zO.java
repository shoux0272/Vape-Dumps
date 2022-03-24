/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.util.ArrayList;
import java.util.List;
import manthe.CM;
import manthe.CQ;
import manthe.DB;
import manthe.DF;
import manthe.DX;
import manthe.b5;
import manthe.ex;
import manthe.fP;
import manthe.gK;
import manthe.gb;
import manthe.oO;
import manthe.on;
import manthe.pb;
import manthe.tp;
import manthe.xv;
import manthe.y5;

public class zO
extends y5 {
    private final DF w = DF.a((Object)this, "Expand amount", "#.##", "", 0.0, 0.35, 1.0, 0.01);
    public final DB B = DB.a((Object)this, "Sort Targets", false, "Allows you to sort the hitboxes over your crosshair.\n\u00a7cMay not bypass anti-cheats!");
    private final DF A = DF.a((Object)this, "Minimum Size", "#", "ppl", 2.0, 2.0, 10.0, 1.0);
    public final DB u = DB.a((Object)this, "Weigh Health", false, "Will weigh Health into your target mode.\nIf two players have the same weights, the lowest health will be prioritized.");
    private final pb z = new pb("Distance");
    public final pb y = new pb("Yaw");
    public final pb D = new pb("Armor");
    public final pb x = new pb("Threat");
    public final pb E = new pb("Health");
    public DX v = DX.a((Object)this, "Target Mode", "How targets should be filtered.\nArmor/Threat will default to Distance for non player targets.", this.z, this.z, this.y, this.D, this.x, this.E);
    private static String[] C;

    public zO() {
        super("HitBoxes", -16711707, CQ.f, "Expands entities hitboxes");
        this.a(this.w);
        this.B.a(this.v, this.u, this.A);
        this.a(this.B, this.v, this.u, this.A);
    }

    public float S() {
        if (!this.N()) {
            return 0.0f;
        }
        return this.w.a().floatValue();
    }

    public List a(List list, gK gK2, gK gK3) {
        if ((double)list.size() < this.A.a()) {
            return list;
        }
        ArrayList<ex> arrayList = new ArrayList<ex>();
        for (int k = 0; k < list.size(); ++k) {
            ex ex2 = new ex(list.get(k));
            if (!ex2.V() || !on.p.t().a(ex2, false)) continue;
            float f10 = ex2.r() + this.S();
            fP fP2 = ex2.s().d(f10, f10, f10);
            gb gb2 = fP2.a(gK2, gK3);
            if (fP2.a(gK2)) {
                arrayList.add(ex2);
                continue;
            }
            if (!gb2.d()) continue;
            arrayList.add(ex2);
        }
        if ((double)arrayList.size() < this.A.a()) {
            return list;
        }
        if (this.v.v() == this.y) {
            arrayList.sort(new oO(this, null));
        } else if (this.v.v() == this.z) {
            arrayList.sort(new CM(this, null));
        } else if (this.v.v() == this.x) {
            arrayList.sort(new xv(this, null));
        } else if (this.v.v() == this.D) {
            arrayList.sort(new b5(this, null));
        } else if (this.v.v() == this.E) {
            arrayList.sort(new tp(this, null));
        }
        ArrayList<Object> arrayList2 = new ArrayList<Object>();
        arrayList2.add(((ex)arrayList.get(0)).a());
        return arrayList2;
    }

    public static void b(String[] arrstring) {
        C = arrstring;
    }

    public static String[] T() {
        return C;
    }

    static {
        if (zO.T() != null) {
            zO.b(new String[4]);
        }
    }
}

