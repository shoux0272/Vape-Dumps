/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.AO;
import manthe.C9;
import manthe.D7;
import manthe.mD;
import manthe.my;
import manthe.n;
import manthe.on;
import manthe.p1;
import manthe.pd;
import manthe.r1;
import manthe.r6;
import manthe.rf;
import manthe.rg;
import manthe.rl;
import manthe.ro;
import manthe.s7;
import manthe.sV;
import manthe.sb;
import manthe.zP;

public class re
extends r1 {
    private final rl ae;
    private final AO ag = new AO();
    private final r6 af;

    public re() {
        super("InvCleaner", false);
        this.aj().a(new D7(0.0, 0.0, 5000, 1, new pd(0, 0, 0, 0)));
        this.c(100.0);
        this.b(20.0);
        zP zP2 = on.p.H().b(zP.class);
        rf rf2 = new rf(false);
        rf2.a(new D7(0.0, 3.0, 5000, 1, new pd(0, 2, 2, 2)));
        rf2.c(this.q());
        this.d(rf2);
        double d10 = rf2.q() - 0.0;
        rf2.b(new s7(on.p.H().b(zP.class))).c(d10);
        sb sb2 = new sb(64);
        sb2.c(d10);
        sb2.b(12.0);
        sb2.a("<item name>");
        rf2.b(sb2);
        sV sV2 = new sV(10.0, 1.0, "", " stacks", "Allowed Stacks");
        sV2.f(1.0);
        sV2.c(d10);
        sV2.b(8.0);
        rf2.b(sV2);
        rf rf3 = new rf(false);
        rf3.j(false);
        rf3.b(c);
        rf3.a(new D7(2.0, 0.0, 1, 2, new pd(0, 0, 0, 0)));
        rf3.c(d10);
        rf2.b(rf3);
        rg rg2 = new rg("Whitelist", true);
        rg2.c(rf3.q() / 2.0);
        rg2.b(12.0);
        rg2.z().j(false);
        rg2.b("Allow the item to be in your inventory.\nIt will only drop if it exceeds the allowed stack limits.");
        rg2.a(new n(this, sb2, zP2, sV2));
        rf3.b(rg2);
        rg rg3 = new rg("Blacklist", true);
        rg3.c(rf3.q() / 2.0 - 2.0);
        rg3.b(12.0);
        rg3.z().j(false);
        rg3.b("Always remove this item from your inventory,\nregardless of item stacks");
        rg3.a(new C9(this, sb2, zP2));
        rf3.b(rg3);
        this.af = new r6(false);
        this.af.b(80.0);
        this.af.c(d10 - 0.0);
        this.d(this.af);
        this.ae = new rl("", my.i, 0.8);
        this.ae.c(d10);
        this.ae.b(15.0);
        this.ae.a(false);
        this.d(this.ae);
    }

    @Override
    public void c() {
        super.c();
        if (this.ae.e() && this.ag.a(2000L)) {
            this.ae.a("");
            this.ag.d();
        }
        this.ae.a(!this.ae.E().isEmpty());
    }

    public void a(mD mD2) {
        double d10 = this.q() - 0.0;
        rf rf2 = new rf(false);
        rf2.c(d10);
        rf2.a(new D7(1.0, 1.0, 2, 2, new pd(0, 0, 0, 0)));
        this.af.d(rf2);
    }

    public void b(mD mD2) {
        p1 p12 = null;
        block0: for (p1 p13 : this.af.A().v()) {
            if (!(p13 instanceof rf)) continue;
            rf rf2 = (rf)p13;
            for (p1 p14 : rf2.v()) {
                ro ro2;
                if (!(p14 instanceof ro) || !(ro2 = (ro)p14).H().equals(mD2) && !ro2.H().d().equalsIgnoreCase(mD2.d())) continue;
                p12 = p13;
                continue block0;
            }
        }
        if (p12 != null) {
            this.af.A().a(p12);
        }
    }

    static AO a(re re2) {
        return re2.ag;
    }

    static rl b(re re2) {
        return re2.ae;
    }
}

