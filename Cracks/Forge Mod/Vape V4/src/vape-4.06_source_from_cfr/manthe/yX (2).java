/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Queue;
import java.util.Random;
import java.util.concurrent.ConcurrentLinkedQueue;
import manthe.A5;
import manthe.DB;
import manthe.DD;
import manthe.DX;
import manthe.Ds;
import manthe.Dy;
import manthe.dE;
import manthe.ds;
import manthe.ei;
import manthe.fG;
import manthe.fQ;
import manthe.fk;
import manthe.kt;
import manthe.n3;
import manthe.nH;
import manthe.pb;
import manthe.y8;

public class yX
extends y8 {
    private final pb D = new pb("Both");
    private final pb B = new pb("Pots");
    private final pb C = new pb("Soup");
    private final DX z = DX.a((Object)this, "Type", this.D, this.D, this.B, this.C);
    private final DD u = DD.a((Object)this, "refill-alloweditems", "Non Junk Items", DD.m, Collections.emptyList());
    private final DB G = DB.a(this, "Vertical", false);
    private final DB E = DB.a(this, "Scatter", false);
    private final DB v = DB.a((Object)this, "Hotbar clear", false, "Clears junk from your hotbar to refill.\nWhitelisted items will not be considered junk\nOnly one stack of each non-junk item is kept");
    private final Dy w = Dy.a(this, "Delay", "#", "ms", 0.0, 75.0, 125.0, 200.0, 5.0);
    private final Queue<n3> A = new ConcurrentLinkedQueue<n3>();
    private final Random y = new Random();
    private dE F;
    private boolean x;

    public yX() {
        super("Refill", "Refills your hotbar with healing items.");
        this.v.a(new Ds[]{this.u});
        this.a(this.G, this.E, this.v, this.u, this.w, this.z);
    }

    @Override
    public void s() {
        if (this.T().size() == 0) {
            this.d(false);
            return;
        }
        if (!this.S()) {
            this.d(false);
            return;
        }
        int n6 = ds.s().t().i();
        ei.a(n6, true);
        ei.a(n6);
        ei.a(n6, false);
        this.a(0L, false);
    }

    private void a(int n6, int n10, int n11, int n12) {
        this.A.add(new n3(n6, n10, n11, n12));
    }

    @Override
    public void q() {
        try {
            block17: {
                int n6 = 0;
                do {
                    Thread.sleep(10L);
                    if (++n6 > 5) break block17;
                } while (!ds.x().a(A5.bt));
                this.F = new dE(ds.x().a());
            }
            if (!ds.x().a(A5.bt)) {
                this.x = true;
                return;
            }
            ArrayList<Integer> arrayList = new ArrayList<Integer>();
            ArrayList arrayList2 = new ArrayList();
            int n10 = 0;
            List<Integer> list = this.T();
            int n11 = 9;
            while (n11 < 36) {
                fk fk2;
                fQ fQ2 = this.F.l().f().get(n11);
                Object object = fQ2.f();
                if (!((fG)object).e() && !(fk2 = ((fG)object).k()).e() && nH.a((fG)object, this.z.v().equals(this.C) || this.z.v().equals(this.D))) {
                    arrayList.add(n11);
                }
                if (this.G.u().booleanValue()) {
                    n11 += 9;
                    if (++n10 != 3) continue;
                    ++n11;
                    n11 -= 27;
                    n10 = 0;
                    continue;
                }
                ++n11;
            }
            if (arrayList.isEmpty()) {
                this.x = true;
                return;
            }
            if (this.E.u().booleanValue()) {
                Collections.shuffle(arrayList);
            }
            for (n11 = 0; n11 < list.size() && n11 < arrayList.size(); ++n11) {
                arrayList2.add(arrayList.get(n11));
            }
            n11 = 0;
            for (Object object : arrayList2) {
                if (this.F.e() || !ds.x().equals(this.F)) {
                    this.x = true;
                    return;
                }
                boolean bl = false;
                int n12 = 0;
                if (this.v.u().booleanValue()) {
                    fk fk3;
                    n12 = list.get(n11);
                    fG fG2 = ds.k().aU().b(n12);
                    if (fG2.d() && (fk3 = fG2.k()).d()) {
                        bl = true;
                    }
                }
                if (bl) {
                    this.a(this.F.l().g(), (Integer)object, 0, 0);
                    Thread.sleep((long)this.w.t());
                    this.a(this.F.l().g(), 36 + n12, 0, 0);
                    Thread.sleep((long)this.w.t());
                    this.a(this.F.l().g(), (Integer)object, 0, 0);
                    Thread.sleep((long)this.w.t());
                } else {
                    Thread.sleep((long)this.w.t() + (long)this.y.nextInt(10));
                    this.a(this.F.l().g(), (Integer)object, 0, 1);
                }
                ++n11;
            }
            while (!this.A.isEmpty()) {
                Thread.sleep(5L);
            }
            this.x = true;
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    @Override
    public void b(kt kt2) {
        if (this.x) {
            if (!ds.x().e()) {
                ds.k().aX();
            }
            this.x = false;
            this.d(false);
        } else {
            while (!this.A.isEmpty()) {
                n3 n32 = this.A.poll();
                n32.a();
            }
        }
    }

    private boolean S() {
        boolean bl = false;
        for (int k = 9; k < 36; ++k) {
            fk fk2;
            fG fG2 = ds.k().aU().b(k);
            if (fG2.e() || (fk2 = fG2.k()).e() || !nH.a(fG2, this.z.v().equals(this.C) || this.z.v().equals(this.D))) continue;
            bl = true;
        }
        return bl;
    }

    private List<Integer> T() {
        ArrayList<fG> arrayList = new ArrayList<fG>();
        ArrayList<Integer> arrayList2 = new ArrayList<Integer>();
        Object[] arrobject = ds.k().aU().h();
        for (int k = 0; k < 9; ++k) {
            fG fG2 = new fG(arrobject[k]);
            if (fG2.e()) {
                arrayList2.add(k);
                continue;
            }
            if (this.v.u().booleanValue()) {
                if (!this.a(fG2.k(), fG2, arrayList)) continue;
                arrayList2.add(k);
                continue;
            }
            if (!fG2.toString().contains("tile.air")) continue;
            arrayList2.add(k);
        }
        return arrayList2;
    }

    private boolean a(fG fG2, List<fG> list) {
        for (fG fG3 : list) {
            if (fG2.equals(fG3) || !fG2.k().a().getClass().isInstance(fG3.k().a())) continue;
            return true;
        }
        return false;
    }

    private boolean a(fk fk2, fG fG2, List<fG> list) {
        if (nH.a(fG2, this.z.v().equals(this.C) || this.z.v().equals(this.D))) {
            return false;
        }
        if (this.u.a(fG2)) {
            if (!this.a(fG2, list)) {
                list.add(fG2);
                return false;
            }
            return true;
        }
        return true;
    }
}

