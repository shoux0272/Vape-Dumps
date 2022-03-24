/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import manthe.A5;
import manthe.AO;
import manthe.Ab;
import manthe.Ag;
import manthe.BA;
import manthe.CQ;
import manthe.DB;
import manthe.DF;
import manthe.DX;
import manthe.Ds;
import manthe.Dv;
import manthe.U;
import manthe.cF;
import manthe.dE;
import manthe.dX;
import manthe.ds;
import manthe.ei;
import manthe.fG;
import manthe.fI;
import manthe.fQ;
import manthe.fk;
import manthe.kt;
import manthe.n3;
import manthe.nw;
import manthe.on;
import manthe.pb;
import manthe.py;
import manthe.qe;
import manthe.u3;
import manthe.y5;
import manthe.z6;
import manthe.zP;

public class zY
extends y5 {
    private final Dv A;
    private final DF v = DF.a(this, "Delay", "#", "", 0.0, 110.0, 300.0);
    private final Queue<n3> w = new ConcurrentLinkedQueue<n3>();
    private final AO D = new AO();
    private final HashMap<Class, Comparator> y = new HashMap();
    private final List<Integer> B = new ArrayList<Integer>();
    private final pb u = new pb("On Key");
    private final pb E = new pb("Toggle");
    private final DX F = DX.a((Object)this, "Activation", this.u, this.u, this.E);
    private final DB C = DB.a(this, "Open Inventory", true);
    private boolean G = true;
    private boolean z;
    private boolean x = false;

    public zY() {
        super("AutoHotbar", -6656, CQ.a, "Automatically arranges hotbar to your liking.\nDoes not work in creative.");
        this.A = Dv.a(this, "hotbar");
        this.F.a((Ds)this.C, this.E);
        this.a(this.F, this.C, this.v, this.A);
        this.U();
    }

    @Override
    public boolean p() {
        return this.F.v() == this.u;
    }

    public boolean V() {
        return this.N() && this.w.size() > 0 && (this.C.u() != false || ds.x().e());
    }

    private void U() {
        Ab ab2 = new Ab(this);
        nw nw2 = new nw(this);
        BA bA2 = new BA(this);
        cF cF2 = new cF(this);
        qe qe2 = new qe(this);
        this.y.put(A5.bO, ab2);
        this.y.put(A5.cW, ab2);
        this.y.put(A5.dW, nw2);
        this.y.put(A5.ay, nw2);
        this.y.put(A5.cZ, bA2);
        this.y.put(A5.dx, cF2);
        this.y.put(A5.c0, qe2);
    }

    @Override
    public void s() {
        if (this.F.v() == this.u) {
            this.G = true;
            this.z = false;
        } else {
            this.G = false;
            this.z = false;
        }
        this.w.clear();
        this.D.d();
        this.B.clear();
    }

    @Override
    public void J() {
        super.J();
        this.G = false;
        this.z = false;
        this.w.clear();
        this.D.d();
        this.B.clear();
    }

    private fQ a(fQ fQ2, U u6) {
        fI fI2;
        Object object;
        if (ds.x().a(A5.bt)) {
            object = new dE(ds.x());
            fI2 = ((dE)object).l();
        } else {
            fI2 = ds.k().aY();
        }
        object = new ArrayList();
        if (u6.b(fQ2.f())) {
            object.add(fQ2);
        }
        for (fQ class_ : fI2.f()) {
            if (!u6.b(class_.f()) || this.B.contains(class_.g()) || object.contains(class_)) continue;
            object.add(class_);
        }
        if (!object.isEmpty()) {
            if (u6.e()) {
                fk fk2 = u6.g();
                Class<?> class_ = fk2.a().getClass();
                if (this.y.containsKey(class_)) {
                    Comparator comparator = this.y.get(class_);
                    object.sort(comparator);
                    Collections.reverse(object);
                    if (u6.b(fQ2.f()) && comparator.compare(object.get(0), fQ2) == 0) {
                        return null;
                    }
                }
                return (fQ)object.get(0);
            }
            return (fQ)object.get(0);
        }
        return null;
    }

    private boolean e(int n6) {
        fI fI2;
        if (ds.x().a(A5.bt)) {
            dE dE2 = new dE(ds.x());
            fI2 = dE2.l();
        } else {
            fI2 = ds.k().aY();
        }
        for (int k = 0; k < 9; ++k) {
            fQ fQ2 = fI2.a(36 + k);
            if (!fQ2.f().e()) continue;
            return k == n6;
        }
        return false;
    }

    private boolean a(fQ fQ2) {
        fG fG2 = fQ2.f();
        if (fG2.d()) {
            fk fk2 = fG2.k();
            return fk2.d();
        }
        return false;
    }

    private List<fQ> a(fI fI2, fQ fQ2, U u6) {
        List<fQ> list = fI2.f();
        ArrayList<fQ> arrayList = new ArrayList<fQ>();
        fG fG2 = fQ2.f();
        if (fG2.d()) {
            for (int k = 9; k < list.size(); ++k) {
                fQ fQ3 = fI2.a(k);
                fG fG3 = fQ3.f();
                if (!fG3.d() || !u6.b(fG3) || this.B.contains(k)) continue;
                arrayList.add(fQ3);
            }
        }
        return arrayList;
    }

    private boolean S() {
        dX dX2 = ds.x();
        if (!dX2.a(A5.ag)) {
            return false;
        }
        dE dE2 = new dE(dX2);
        fI fI2 = dE2.l();
        for (int k = 9; k < 36; ++k) {
            fQ fQ2 = fI2.a(k);
            fG fG2 = fQ2.f();
            if (!fG2.e()) continue;
            new py(u3.CLICK, k, 0, null).a(fI2.g(), this.w);
            return true;
        }
        return false;
    }

    private void T() {
        fG fG2 = ds.k().aU().f();
        if (fG2.d() && this.S()) {
            this.z = false;
            return;
        }
        if (this.F.v() == this.u) {
            this.d(false);
        }
        if (!ds.x().e()) {
            ds.k().aX();
            this.z = false;
        }
        this.w.clear();
        this.D.d();
        this.B.clear();
        this.z = false;
        this.x = false;
    }

    @Override
    public void b(kt kt2) {
        fI fI2;
        Object object;
        if (on.p.H().b(Ag.class).U() || on.p.H().b(z6.class).S() || on.p.H().b(zP.class).S() || on.p.t().c()) {
            this.w.clear();
            this.D.d();
            this.B.clear();
            return;
        }
        if (ds.k().a8().g()) {
            return;
        }
        if (this.z) {
            this.T();
            return;
        }
        if (ds.x().a(A5.bt) && this.F.v() == this.E && !this.C.u().booleanValue()) {
            return;
        }
        if (!ds.x().a(A5.ag) && (this.F.v() == this.u || this.C.u().booleanValue() && this.G)) {
            if (this.G) {
                int n6 = ds.s().t().i();
                ei.a(n6, true);
                ei.a(n6);
                ei.a(n6, false);
            } else if (this.F.v() == this.u) {
                this.d(false);
            }
            return;
        }
        this.G = false;
        this.z = false;
        if (this.w.size() > 0) {
            if (this.D.a(this.v.a().intValue())) {
                this.w.poll().a();
                this.D.d();
                this.x = true;
            }
            return;
        }
        if (ds.x().a(A5.ag)) {
            object = new dE(ds.x());
            fI2 = ((dE)object).l();
        } else {
            fI2 = ds.k().aY();
        }
        object = this.A.r();
        boolean bl = false;
        if (object.size() == 9) {
            for (int k = 0; k < 9; ++k) {
                boolean bl2;
                U u6 = (U)object.get(k);
                int n10 = 36 + k;
                fQ fQ2 = fI2.a(n10);
                fQ fQ3 = this.a(fQ2, u6);
                if (fQ3 == null) continue;
                fG fG2 = fQ2.f();
                fG fG3 = fQ3.f();
                if (fQ3.equals(fQ2)) {
                    List<fQ> list;
                    this.B.add(n10);
                    if (fG2.d() && fG2.n() < fG2.h() && !(list = this.a(fI2, fQ2, u6)).isEmpty()) {
                        fQ3 = list.get(0);
                    }
                }
                if (fQ3.equals(fQ2)) continue;
                if (this.C.u().booleanValue() && !ds.x().a(A5.ag)) {
                    this.G = true;
                    this.z = false;
                    return;
                }
                this.B.add(n10);
                this.B.add(fQ3.g());
                int n11 = 0;
                if (fG2.d()) {
                    n11 += fG2.h();
                }
                boolean bl3 = !this.a(fQ2);
                boolean bl4 = bl2 = this.e(k) && fQ3.g() < 36;
                new py(bl2 ? u3.SHIFTCLICK : (bl3 ? u3.SWAP : u3.MOVE), fQ3.g(), n10, null).a(fI2.g(), this.w);
                if ((n11 += fG3.n()) > fG3.h()) {
                    new py(u3.CLICK, fQ3.g(), n10, null).a(fI2.g(), this.w);
                }
                bl = true;
                break;
            }
        }
        if (!bl && this.F.v() == this.u) {
            this.z = true;
            this.D.d();
        }
        if (this.x && this.F.v() == this.E && this.C.u().booleanValue() && this.w.isEmpty()) {
            this.z = true;
        }
    }
}

