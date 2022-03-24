/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.CopyOnWriteArrayList;
import manthe.A5;
import manthe.DB;
import manthe.DF;
import manthe.DX;
import manthe.Ds;
import manthe.Dy;
import manthe.ds;
import manthe.eP;
import manthe.ei;
import manthe.fG;
import manthe.fh;
import manthe.fk;
import manthe.kf;
import manthe.nH;
import manthe.pb;
import manthe.u_;
import manthe.y8;
import manthe.yw;

public class yF
extends y8 {
    private final pb E = new pb("Both");
    private final pb G = new pb("Pots");
    private final pb y = new pb("Soup");
    private final DX F = DX.a((Object)this, "Type", this.E, this.E, this.G, this.y);
    private final pb I = new pb("Dynamic");
    private final pb B = new pb("Single");
    private final DX w = DX.a((Object)this, "Mode", "Dynamic - uses only as many items as needed to heal as much as possible without over-healing\nSingle - Always uses one item, regardless of health", this.I, this.I, this.B);
    private final DF v = DF.a(this, "Scroll delay", "#", "ms", 0.0, 100.0, 200.0);
    private final Dy H = Dy.a(this, "Delay", "#", "ms", 0.0, 80.0, 115.0, 200.0, 1.0);
    private final DB C = DB.a(this, "Scroll", false);
    private final DB D = DB.a(this, "Random", false);
    private final DB u = DB.a((Object)this, "Throw bowls", true, "Throws soup bowls after consuming");
    private final CopyOnWriteArrayList<u_> z = new CopyOnWriteArrayList();
    private int A;
    private boolean x;

    public yF() {
        super("Throwpot", "Throws or consumes healing items upon pressing keybind");
        this.C.a(new Ds[]{this.v});
        this.a(this.F, this.w, this.H, this.C, this.v, this.D, this.u);
    }

    @Override
    public void s() {
        if (this.x) {
            this.d(false);
            return;
        }
        eP eP2 = ds.k().aU();
        this.A = eP2.i();
        if (this.S()) {
            this.x = true;
            this.a(0L, false);
        } else {
            this.d(false);
        }
    }

    @Override
    public void J() {
        this.z.clear();
    }

    private void e(int n6) {
        if (!this.C.u().booleanValue()) {
            ds.k().aU().a(n6);
            return;
        }
        int n10 = ds.k().aU().i();
        while (true) {
            ds.k().aU().a(n10);
            try {
                Thread.sleep(this.v.a().longValue());
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

    @Override
    public void q() {
        if (!this.x) {
            return;
        }
        try {
            int n6 = ds.s().s().i();
            int n10 = ds.s().y().i();
            this.z.sort(new yw(this.A));
            for (u_ u_2 : this.z) {
                this.e(u_2.a());
                ei.a(n6, true);
                ei.a(n6);
                Thread.sleep(51L);
                ei.a(n6, false);
                if (this.u.u().booleanValue() && u_2.c().k().a(A5.bU)) {
                    ei.a(n10, true);
                    ei.a(n10);
                    Thread.sleep(51L);
                    ei.a(n10, false);
                }
                Thread.sleep((long)this.H.t());
            }
            this.e(this.A);
        }
        catch (Exception exception) {
            this.x = false;
            exception.printStackTrace();
        }
        this.x = false;
    }

    @Override
    public void a(kf kf2) {
        if (!this.x && this.N()) {
            this.d(false);
        }
    }

    private boolean S() {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (int k = 0; k < 9; ++k) {
            arrayList.add(k);
        }
        if (this.D.u().booleanValue()) {
            Collections.shuffle(arrayList);
        }
        Object[] arrobject = ds.k().aU().h();
        int n6 = 0;
        for (Integer n10 : arrayList) {
            boolean bl;
            fk fk2;
            fG fG2 = new fG(arrobject[n10]);
            if (fG2.e() || (fk2 = fG2.k()).e()) continue;
            boolean bl2 = this.F.v().equals(this.y) || this.F.v().equals(this.E);
            boolean bl3 = bl = this.F.v().equals(this.G) || this.F.v().equals(this.E);
            if (A5.bU.isInstance(fk2.a()) && bl2) {
                if (this.w.v().equals(this.B)) {
                    this.z.add(new u_(n10, fG2));
                    break;
                }
                int n11 = 8;
                if ((double)(n6 + n11) + Math.floor(ds.k().aD()) > (double)ds.k().at()) continue;
                n6 += n11;
                this.z.add(new u_(n10, fG2));
            }
            if (!A5.dx.isInstance(fk2.a()) || !bl) continue;
            if (this.w.v().equals(this.B)) {
                this.z.add(new u_(n10, fG2));
                break;
            }
            fh fh2 = new fh(fk2.a());
            if (!nH.a(fG2)) continue;
            int n12 = 0;
            n12 = fh2.c(fG2).get(0).toString().contains(" x ") ? (n12 += 4 * Integer.parseInt(fh2.c(fG2).get(0).toString().split(" x ")[1].split(",")[0])) : (n12 += 4);
            if ((double)(n6 + n12) + Math.floor(ds.k().aD()) > (double)ds.k().at()) continue;
            n6 += n12;
            this.z.add(new u_(n10, fG2));
        }
        return !this.z.isEmpty();
    }
}

