/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import manthe.A5;
import manthe.DB;
import manthe.DF;
import manthe.DX;
import manthe.Ds;
import manthe.Dy;
import manthe.ds;
import manthe.eJ;
import manthe.eP;
import manthe.ei;
import manthe.fG;
import manthe.fh;
import manthe.fk;
import manthe.kf;
import manthe.pb;
import manthe.u_;
import manthe.y8;

public class yE
extends y8 {
    private final CopyOnWriteArrayList<u_> z = new CopyOnWriteArrayList();
    private final pb v = new pb("All");
    private final pb B = new pb("One of each");
    private final pb x = new pb("First");
    private final DX w = DX.a((Object)this, "Mode", "All - Throws all debuffs on hotbar\nOne of each - Throws one of each debuff\nFirst - Throws only first debuff on hotbar", this.B, this.v, this.B, this.x);
    private final DB[] u = new DB[]{DB.a(this, "Harming", true), DB.a(this, "Weakness", true), DB.a(this, "Poison", true), DB.a(this, "Slowness", true)};
    private final Dy y = Dy.a(this, "Delay", "#.#", "", 0.0, 70.0, 120.0, 200.0);
    private final DB A = DB.a(this, "Scroll", false);
    private final DF D = DF.a(this, "Scroll delay", "#", "ms", 0.0, 100.0, 200.0);
    private boolean C;

    public yE() {
        super("ThrowDebuff");
        this.a(this.w);
        for (DB dB2 : this.u) {
            this.a(dB2);
        }
        this.a(this.y);
        this.A.a(new Ds[]{this.D});
        this.a(this.A);
        this.a(this.D);
    }

    private void e(int n6) {
        if (!this.A.u().booleanValue()) {
            ds.k().aU().a(n6);
            return;
        }
        int n10 = ds.k().aU().i();
        while (true) {
            ds.k().aU().a(n10);
            try {
                Thread.sleep(this.D.a().longValue());
            }
            catch (InterruptedException interruptedException) {
                // empty catch block
            }
            if (n6 > n10) {
                ++n10;
                continue;
            }
            if (n6 >= n10) break;
            --n10;
        }
    }

    private boolean S() {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (int k = 0; k < 9; ++k) {
            arrayList.add(k);
        }
        Object[] arrobject = ds.k().aU().h();
        ArrayList<DB> arrayList2 = new ArrayList<DB>();
        block1: for (Integer n6 : arrayList) {
            fk fk2;
            fG fG2 = new fG(arrobject[n6]);
            if (fG2.e() || (fk2 = fG2.k()).e() || !A5.dx.isInstance(fk2.a())) continue;
            fh fh2 = new fh(fk2.a());
            for (DB dB2 : this.u) {
                if (this.w.v().equals(this.B) && arrayList2.contains(dB2)) continue;
                String string = fh2.a(fG2).toLowerCase();
                String string2 = dB2.H().toLowerCase();
                if (!dB2.u().booleanValue() || !string.contains(string2)) continue;
                this.z.add(new u_(n6, fG2));
                arrayList2.add(dB2);
                if (!this.w.v().equals(this.x)) continue block1;
                break block1;
            }
        }
        return !this.z.isEmpty();
    }

    @Override
    public void q() {
        eJ eJ2 = ds.k();
        eP eP2 = eJ2.aU();
        int n6 = eP2.i();
        for (u_ u_2 : this.z) {
            try {
                this.e(u_2.a());
                int n10 = ds.s().s().i();
                ei.a(n10, true);
                ei.a(n10);
                Thread.sleep(51L);
                ei.a(n10, false);
                Thread.sleep((long)this.y.t());
            }
            catch (Exception exception) {}
        }
        this.e(n6);
        this.C = false;
    }

    @Override
    public void a(kf kf2) {
        if (!this.C && this.N()) {
            this.d(false);
        }
    }

    @Override
    public void s() {
        if (this.S()) {
            this.C = true;
            this.a(0L, false);
        } else {
            this.d(false);
        }
    }

    @Override
    public void J() {
        this.z.clear();
    }
}

