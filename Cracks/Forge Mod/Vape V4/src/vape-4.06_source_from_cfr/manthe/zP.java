/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 */
package manthe;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import manthe.A5;
import manthe.AO;
import manthe.AW;
import manthe.Ag;
import manthe.BE;
import manthe.CQ;
import manthe.DB;
import manthe.DD;
import manthe.DX;
import manthe.Ds;
import manthe.Dy;
import manthe.ds;
import manthe.eJ;
import manthe.ei;
import manthe.eq;
import manthe.fE;
import manthe.fG;
import manthe.fQ;
import manthe.fV;
import manthe.fX;
import manthe.fh;
import manthe.fk;
import manthe.fp;
import manthe.kt;
import manthe.mD;
import manthe.on;
import manthe.p9;
import manthe.pb;
import manthe.u8;
import manthe.vj;
import manthe.y5;
import manthe.z6;
import manthe.zY;

public class zP
extends y5 {
    private final Queue<Integer> v = new ArrayDeque<Integer>();
    private final AO I = new AO();
    private final Dy B = Dy.a(this, "Delay", "#", "", 1.0, 100.0, 120.0, 200.0, 1.0);
    private final DB A = DB.a((Object)this, "Best Items", true, "Keeps the best set of armor, sword, axe, pickaxe and bow");
    private final DB C = DB.a((Object)this, "Remove Negative Potions", true, "Will always throw out negative potions");
    private final DB N = DB.a((Object)this, "Remove Food", true, "Remove Food except for Golden Apples");
    private final DB G = DB.a((Object)this, "Open Inventory", true, "Opens your inventory when cleaning.");
    private final DB H = DB.a((Object)this, "Inventory Only", true, "Only cleans while your inventory is open.");
    private final DD F = DD.a((Object)this, "invcleaner-whitelisted", "Whitelisted", DD.m, 1, Collections.emptyList());
    private final DD x = DD.a((Object)this, "invcleaner-blacklisted", "Blacklisted", DD.n, Collections.emptyList());
    private final pb w = new pb("On Key");
    private final pb y = new pb("Toggle");
    private final DX E = DX.a((Object)this, "Activation", this.w, this.w, this.y);
    private fG[] z;
    private fG J;
    private fG D;
    private fG u;
    private fG L;
    private boolean K;
    private static String[] M;

    public zP() {
        super("InvCleaner", -13181746, CQ.a, "Cleans blacklisted items from your inventory.\nDoes not throw out whitelisted items.");
        this.E.a(this.G, this.H);
        this.E.a((Ds)this.G, this.w);
        this.E.a((Ds)this.H, this.y);
        this.a(this.E, this.B, this.G, this.H, this.A, this.C, this.N, this.F, this.x);
    }

    private static double a(fG fG2) {
        int n6 = 0;
        if (fG2.e()) {
            return n6;
        }
        if (fG2.k().d() && fG2.k().a(A5.cN)) {
            fV fV2 = new fV(fG2.k());
            n6 = fV2.m();
        }
        return n6 += eq.a(new fG[]{fG2}, fp.a(ds.k()));
    }

    public static double b(fG fG2) {
        double d10 = zP.a(fG2);
        d10 += (double)eq.a(32, fG2);
        d10 += (double)eq.a(16, fG2);
        d10 += (double)eq.a(19, fG2);
        d10 += (double)eq.a(20, fG2);
        d10 += (double)eq.a(48, fG2);
        return d10 += (double)eq.a(34, fG2);
    }

    @Override
    public boolean p() {
        return this.E.v() == this.w;
    }

    public boolean S() {
        return this.N() && this.K && (this.G.u() != false || ds.x().e());
    }

    @Override
    public void m() {
        this.F.b("344", 1);
        this.F.b("384", 1);
        this.F.b("332", 1);
        this.F.b("346", 1);
        this.F.b("368", 1);
        this.x.b("280", -1);
        this.x.b("287", -1);
        this.x.b("318", -1);
        this.x.b("345", -1);
        this.x.b("288", -1);
        this.x.b("374", -1);
        this.x.b("116", -1);
        this.x.b("54", -1);
        this.x.b("145", -1);
    }

    @Override
    public void s() {
        this.v.clear();
        this.K = false;
    }

    private boolean W() {
        Object object;
        eJ eJ2 = ds.k();
        if (!ds.x().a(A5.bt) && this.G.u().booleanValue() && this.E.v() == this.w) {
            int n6 = ds.s().t().i();
            ei.a(n6, true);
            ei.a(n6);
            ei.a(n6, false);
            return false;
        }
        this.z = this.V();
        this.J = this.a(A5.bO, new BE(this));
        this.D = this.a(A5.dW, new p9(this));
        this.L = this.a(A5.cZ, new AW(this));
        this.u = this.a(A5.cW, new vj(this));
        if (eJ2.aY().e()) {
            return false;
        }
        HashMap<Integer, u8> hashMap = new HashMap<Integer, u8>();
        block4: for (fQ object2 : eJ2.aY().f()) {
            try {
                if (!object2.h() || object2.f().e()) continue;
                for (Object object3 : eJ2.aU().g()) {
                    if (object3 != null && object3.equals(object2.f())) continue block4;
                }
                object = object2.f().k();
                int list = fk.a((fk)object);
                mD mD2 = this.F.d(object2.f().k().h() + "");
                if (mD2 == null) {
                    mD2 = this.F.d(object2.f().k().a(object2.f()));
                }
                if (mD2 != null && mD2.c()) {
                    Object object3;
                    if (hashMap.containsKey(list)) {
                        object3 = (u8)hashMap.get(list);
                    } else {
                        u8 u82 = new u8(list, mD2.f());
                        hashMap.put(list, u82);
                        object3 = u82;
                    }
                    ((u8)object3).a(object2.g());
                }
                if (!this.c(object2.f())) continue;
                this.e(object2.g());
            }
            catch (Exception exception) {
                on.a(exception);
            }
        }
        try {
            for (Map.Entry entry : hashMap.entrySet()) {
                object = (u8)entry.getValue();
                ((u8)object).c();
                List<Integer> list = ((u8)object).a();
                if (list.size() <= 0) continue;
                for (int k = u8.a((u8)object); k < list.size(); ++k) {
                    this.e(list.get(k));
                }
            }
        }
        catch (Exception exception) {
            on.a(exception);
        }
        return true;
    }

    @Override
    public void b(kt kt2) {
        if (on.p.H().b(Ag.class).U() || on.p.H().b(zY.class).V() || on.p.H().b(z6.class).S() || on.p.t().c()) {
            this.K = false;
            return;
        }
        eJ eJ2 = ds.k();
        if (!this.K) {
            if (this.W() && !this.K && this.E.v() == this.w) {
                this.d(false);
                if (this.G.u().booleanValue()) {
                    eJ2.aX();
                }
            }
            return;
        }
        if (this.E.v() == this.y && this.H.u().booleanValue() && (!ds.x().a(A5.bt) || eJ2.a8().g())) {
            return;
        }
        if (this.K && this.G.u().booleanValue() && !ds.x().a(A5.bt)) {
            this.z();
            return;
        }
        if (!this.v.isEmpty()) {
            if (this.I.a((long)this.B.t())) {
                this.I.d();
                int n6 = this.v.poll();
                ds.K().a(eJ2.aY().g(), n6, 0, 0, eJ2);
            }
            return;
        }
        if (this.E.v() == this.w) {
            this.d(false);
            if (this.G.u().booleanValue()) {
                eJ2.aX();
            }
        } else {
            this.K = false;
        }
        if (eJ2.a8().g() && ds.x().a(A5.bt) && this.E.v() == this.w) {
            this.d(false);
        }
    }

    private void e(int n6) {
        if (this.v.contains(n6)) {
            return;
        }
        this.v.add(n6);
        this.v.add(-999);
        this.K = true;
    }

    private boolean c(fG fG2) {
        fV fV2;
        fk fk2 = fG2.k();
        if (fk2.a(A5.cN) && this.z[(fV2 = new fV(fk2)).k()] != null && !this.z[fV2.k()].equals(fG2)) {
            return true;
        }
        boolean bl = true;
        if (this.A.u().booleanValue()) {
            bl = fk2.a(A5.cZ) && !this.L.equals(fG2) || fk2.a(A5.dW) && !this.D.equals(fG2) || fk2.a(A5.bO) && !this.J.equals(fG2) || fk2.a(A5.cW) && !this.u.equals(fG2);
        }
        return this.x.a(fG2) || bl || this.N.u() != false && fk2.a(A5.c0) && !fk2.a(A5.cf) || this.C.u() != false && fk2.a(A5.dx) && this.d(fG2);
    }

    private fG a(Class class_, Comparator comparator) {
        ArrayList<fG> arrayList = new ArrayList<fG>();
        for (fQ fQ2 : ds.k().aY().f()) {
            if (!fQ2.h() || !fQ2.f().d() || !fQ2.f().k().a(class_)) continue;
            arrayList.add(fQ2.f());
        }
        arrayList.sort(comparator);
        Collections.reverse(arrayList);
        if (arrayList.isEmpty()) {
            return null;
        }
        return (fG)arrayList.get(0);
    }

    private fG[] V() {
        fG[] arrfG = new fG[4];
        ArrayList<fG> arrayList = new ArrayList<fG>();
        List<fQ> list = ds.k().aY().f();
        for (fQ cy2 : list) {
            if (!cy2.h() || !cy2.f().k().a(A5.cN)) continue;
            arrayList.add(cy2.f());
        }
        for (fG fG2 : arrayList) {
            fV fV2 = new fV(fG2.k());
            fG fG3 = arrfG[fV2.k()];
            if (fG3 != null && !(zP.a(fG2) > zP.a(fG3))) continue;
            arrfG[fV2.k()] = fG2;
        }
        return arrfG;
    }

    private boolean d(fG fG2) {
        if (!fG2.k().a(A5.dx)) {
            return false;
        }
        fh fh2 = new fh(fG2.k());
        List<fE> list = fh2.f(fG2);
        for (fE fE2 : list) {
            fX fX2 = fX.a(fE2.g());
            if (!fX2.r()) continue;
            return true;
        }
        return false;
    }

    public DD X() {
        return this.F;
    }

    public DD U() {
        return this.x;
    }

    @Override
    public void a(JsonObject jsonObject) {
        JsonObject jsonObject2;
        JsonArray jsonArray;
        super.a(jsonObject);
        if (jsonObject.get("whitelisted-items") != null) {
            jsonArray = jsonObject.get("whitelisted-items").getAsJsonArray();
            jsonObject2 = new JsonObject();
            jsonObject2.addProperty("id", this.F.e());
            jsonObject2.add("value", (JsonElement)jsonArray);
            this.F.a(jsonObject2);
        }
        if (jsonObject.get("blacklisted-items") != null) {
            jsonArray = jsonObject.get("blacklisted-items").getAsJsonArray();
            jsonObject2 = new JsonObject();
            jsonObject2.addProperty("id", this.x.e());
            jsonObject2.add("value", (JsonElement)jsonArray);
            this.x.a(jsonObject2);
        }
    }

    public static void b(String[] arrstring) {
        M = arrstring;
    }

    public static String[] T() {
        return M;
    }

    static {
        if (zP.T() != null) {
            zP.b(new String[2]);
        }
    }
}

