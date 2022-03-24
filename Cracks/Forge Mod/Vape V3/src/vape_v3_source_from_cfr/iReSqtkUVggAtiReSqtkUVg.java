/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 */
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class iReSqtkUVggAtiReSqtkUVg
extends iReSqtkUVgNeViReSqtkUVg {
    private final Map<Integer, Set<Integer>> b = new HashMap<Integer, Set<Integer>>();
    private iReSqtkUVgyetiReSqtkUVg[] c;
    private iReSqtkUVgyetiReSqtkUVg d;
    private iReSqtkUVgyetiReSqtkUVg e;
    private iReSqtkUVgyetiReSqtkUVg f;
    private iReSqtkUVgyetiReSqtkUVg g;
    private iReSqtkUVgPzKiReSqtkUVg h = new iReSqtkUVgPzKiReSqtkUVg();
    private iReSqtkUVgfXGiReSqtkUVg i = iReSqtkUVgfXGiReSqtkUVg.a(this, "Delay", "#", "", 1.0, 60.0, 80.0, 200.0);
    private iReSqtkUVgoRmiReSqtkUVg j = iReSqtkUVgoRmiReSqtkUVg.a((Object)this, "Best Items", true, "Keeps the best set of armor, sword, axe, pickaxe and bow");
    private iReSqtkUVgoRmiReSqtkUVg k = iReSqtkUVgoRmiReSqtkUVg.a((Object)this, "Remove Negative Potions", true, "Will always throw out negative potions");
    private iReSqtkUVgoRmiReSqtkUVg l = iReSqtkUVgoRmiReSqtkUVg.a((Object)this, "Remove Food", true, "Remove Food except for Golden Apples");
    private iReSqtkUVgoRmiReSqtkUVg m = iReSqtkUVgoRmiReSqtkUVg.a((Object)this, "Open Inventory", true, "Opens your inventory when cleaning.");
    private iReSqtkUVgeMGiReSqtkUVg n = iReSqtkUVgeMGiReSqtkUVg.a((Object)this, "invcleaner-whitelisted", "Whitelisted", iReSqtkUVgeMGiReSqtkUVg.a, 1, Collections.emptyList());
    private iReSqtkUVgeMGiReSqtkUVg o = iReSqtkUVgeMGiReSqtkUVg.a((Object)this, "invcleaner-blacklisted", "Blacklisted", iReSqtkUVgeMGiReSqtkUVg.c, Collections.emptyList());

    public iReSqtkUVggAtiReSqtkUVg() {
        super("InvCleaner", "Cleans blacklisted items from your inventory.\nDoes not throw out whitelisted items.");
        this.a(this.i, this.m, this.j, this.k, this.l, this.n, this.o);
    }

    @Override
    public void j() {
        super.j();
        this.n.a("344", 1);
        this.n.a("384", 1);
        this.n.a("332", 1);
        this.n.a("346", 1);
        this.n.a("368", 1);
        this.o.a("280", -1);
        this.o.a("287", -1);
        this.o.a("318", -1);
        this.o.a("345", -1);
        this.o.a("288", -1);
        this.o.a("374", -1);
        this.o.a("116", -1);
        this.o.a("54", -1);
        this.o.a("145", -1);
    }

    @Override
    public void h() {
        this.b.clear();
    }

    @Override
    public void a(iReSqtkUVglBNiReSqtkUVg iReSqtkUVglBNiReSqtkUVg2) {
        iReSqtkUVgtlXiReSqtkUVg iReSqtkUVgtlXiReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.e();
        if (!iReSqtkUVgeLLiReSqtkUVg.f().a(iReSqtkUVgSzRiReSqtkUVg.y) && this.m.i().booleanValue()) {
            int n = iReSqtkUVgeLLiReSqtkUVg.i().f().d();
            iReSqtkUVgqzriReSqtkUVg.a(n, true);
            iReSqtkUVgqzriReSqtkUVg.a(n);
            iReSqtkUVgqzriReSqtkUVg.a(n, false);
            return;
        }
        if (this.h.a((long)this.i.l())) {
            this.b.clear();
            this.c = this.z();
            this.d = this.a(iReSqtkUVgSzRiReSqtkUVg.J, new iReSqtkUVgnJmiReSqtkUVg(this));
            this.e = this.a(iReSqtkUVgSzRiReSqtkUVg.bc, new iReSqtkUVgkcBiReSqtkUVg(this));
            this.g = this.a(iReSqtkUVgSzRiReSqtkUVg.bc, new iReSqtkUVgcwTiReSqtkUVg(this));
            this.f = this.a(iReSqtkUVgSzRiReSqtkUVg.as, new iReSqtkUVgwmdiReSqtkUVg(this));
            boolean bl = false;
            if (iReSqtkUVgtlXiReSqtkUVg2.ba().b()) {
                return;
            }
            block2: for (iReSqtkUVgIHfiReSqtkUVg iReSqtkUVgIHfiReSqtkUVg2 : iReSqtkUVgtlXiReSqtkUVg2.ba().d()) {
                try {
                    if (!iReSqtkUVgIHfiReSqtkUVg2.f() || iReSqtkUVgIHfiReSqtkUVg2.d().b()) continue;
                    for (Object object : iReSqtkUVgtlXiReSqtkUVg2.aZ().f()) {
                        if (object != null && object.equals(iReSqtkUVgIHfiReSqtkUVg2.d())) continue block2;
                    }
                    iReSqtkUVgLUhiReSqtkUVg iReSqtkUVgLUhiReSqtkUVg2 = iReSqtkUVgIHfiReSqtkUVg2.d().e();
                    int n = iReSqtkUVgLUhiReSqtkUVg.a(iReSqtkUVgLUhiReSqtkUVg2);
                    iReSqtkUVgDyziReSqtkUVg iReSqtkUVgDyziReSqtkUVg2 = this.n.c(iReSqtkUVgIHfiReSqtkUVg2.d().e().e() + "");
                    if (iReSqtkUVgDyziReSqtkUVg2 == null) {
                        iReSqtkUVgDyziReSqtkUVg2 = this.n.c(iReSqtkUVgIHfiReSqtkUVg2.d().e().b(iReSqtkUVgIHfiReSqtkUVg2.d()));
                    }
                    if (iReSqtkUVgDyziReSqtkUVg2 != null && iReSqtkUVgDyziReSqtkUVg2.c()) {
                        Set<Integer> set = this.b.get(n);
                        if (set != null) {
                            set.add(iReSqtkUVgIHfiReSqtkUVg2.e());
                            if (iReSqtkUVgIHfiReSqtkUVg2.d().equals(iReSqtkUVgtlXiReSqtkUVg2.bd())) continue;
                            if (set.size() > iReSqtkUVgDyziReSqtkUVg2.b()) {
                                for (Integer n2 : set) {
                                    if (n2.intValue() == iReSqtkUVgIHfiReSqtkUVg2.e() || set.size() <= iReSqtkUVgDyziReSqtkUVg2.b()) continue;
                                    iReSqtkUVgyetiReSqtkUVg iReSqtkUVgyetiReSqtkUVg2 = iReSqtkUVgtlXiReSqtkUVg2.ba().a(n2).d();
                                    if (!iReSqtkUVgyetiReSqtkUVg2.equals(iReSqtkUVgtlXiReSqtkUVg2.bd()) && this.d(iReSqtkUVgIHfiReSqtkUVg2.d()) >= this.d(iReSqtkUVgyetiReSqtkUVg2)) {
                                        this.a(n2);
                                    } else {
                                        this.a(iReSqtkUVgIHfiReSqtkUVg2.e());
                                    }
                                    bl = true;
                                }
                            }
                        } else {
                            HashSet<Integer> hashSet = new HashSet<Integer>();
                            hashSet.add(iReSqtkUVgIHfiReSqtkUVg2.e());
                            this.b.put(n, hashSet);
                            continue;
                        }
                    }
                    if (!this.a(iReSqtkUVgIHfiReSqtkUVg2.d())) continue;
                    this.a(iReSqtkUVgIHfiReSqtkUVg2.e());
                    bl = true;
                    break;
                }
                catch (Exception exception) {
                }
            }
            if (!bl) {
                this.a(false);
                if (this.m.i().booleanValue()) {
                    iReSqtkUVgtlXiReSqtkUVg2.aX();
                }
            }
            if (iReSqtkUVgtlXiReSqtkUVg2.bg().d() && iReSqtkUVgeLLiReSqtkUVg.f().a(iReSqtkUVgSzRiReSqtkUVg.y)) {
                this.a(false);
            }
            this.h.b();
        }
    }

    private void a(int n) {
        iReSqtkUVgtlXiReSqtkUVg iReSqtkUVgtlXiReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.e();
        iReSqtkUVgeLLiReSqtkUVg.k().a(iReSqtkUVgtlXiReSqtkUVg2.ba().e(), n, 0, 0, iReSqtkUVgtlXiReSqtkUVg2);
        iReSqtkUVgeLLiReSqtkUVg.k().a(iReSqtkUVgtlXiReSqtkUVg2.ba().e(), -999, 0, 0, iReSqtkUVgtlXiReSqtkUVg2);
    }

    private boolean a(iReSqtkUVgyetiReSqtkUVg iReSqtkUVgyetiReSqtkUVg2) {
        iReSqtkUVgWFfiReSqtkUVg iReSqtkUVgWFfiReSqtkUVg2;
        iReSqtkUVgLUhiReSqtkUVg iReSqtkUVgLUhiReSqtkUVg2 = iReSqtkUVgyetiReSqtkUVg2.e();
        if (iReSqtkUVgLUhiReSqtkUVg2.a(iReSqtkUVgSzRiReSqtkUVg.aO) && this.c[(iReSqtkUVgWFfiReSqtkUVg2 = new iReSqtkUVgWFfiReSqtkUVg(iReSqtkUVgLUhiReSqtkUVg2)).e()] != null && !this.c[iReSqtkUVgWFfiReSqtkUVg2.e()].equals(iReSqtkUVgyetiReSqtkUVg2)) {
            return true;
        }
        boolean bl = true;
        if (this.j.i().booleanValue()) {
            bl = iReSqtkUVgLUhiReSqtkUVg2.a(iReSqtkUVgSzRiReSqtkUVg.aW) && !this.g.equals(iReSqtkUVgyetiReSqtkUVg2) || iReSqtkUVgLUhiReSqtkUVg2.a(iReSqtkUVgSzRiReSqtkUVg.bc) && !this.e.equals(iReSqtkUVgyetiReSqtkUVg2) || iReSqtkUVgLUhiReSqtkUVg2.a(iReSqtkUVgSzRiReSqtkUVg.J) && !this.d.equals(iReSqtkUVgyetiReSqtkUVg2) || iReSqtkUVgLUhiReSqtkUVg2.a(iReSqtkUVgSzRiReSqtkUVg.as) && !this.f.equals(iReSqtkUVgyetiReSqtkUVg2);
        }
        return this.o.a(iReSqtkUVgyetiReSqtkUVg2) || bl || this.l.i() != false && iReSqtkUVgLUhiReSqtkUVg2.a(iReSqtkUVgSzRiReSqtkUVg.I) && !iReSqtkUVgLUhiReSqtkUVg2.a(iReSqtkUVgSzRiReSqtkUVg.bb) || this.k.i() != false && iReSqtkUVgLUhiReSqtkUVg2.a(iReSqtkUVgSzRiReSqtkUVg.x) && this.c(iReSqtkUVgyetiReSqtkUVg2);
    }

    private iReSqtkUVgyetiReSqtkUVg a(Class class_, Comparator comparator) {
        ArrayList<iReSqtkUVgyetiReSqtkUVg> arrayList = new ArrayList<iReSqtkUVgyetiReSqtkUVg>();
        for (iReSqtkUVgIHfiReSqtkUVg iReSqtkUVgIHfiReSqtkUVg2 : iReSqtkUVgeLLiReSqtkUVg.e().ba().d()) {
            if (!iReSqtkUVgIHfiReSqtkUVg2.f() || !iReSqtkUVgIHfiReSqtkUVg2.d().c() || !iReSqtkUVgIHfiReSqtkUVg2.d().e().a(class_)) continue;
            arrayList.add(iReSqtkUVgIHfiReSqtkUVg2.d());
        }
        arrayList.sort(comparator);
        Collections.reverse(arrayList);
        if (arrayList.isEmpty()) {
            return null;
        }
        return (iReSqtkUVgyetiReSqtkUVg)arrayList.get(0);
    }

    private iReSqtkUVgyetiReSqtkUVg[] z() {
        iReSqtkUVgyetiReSqtkUVg[] arriReSqtkUVgyetiReSqtkUVg = new iReSqtkUVgyetiReSqtkUVg[4];
        ArrayList<iReSqtkUVgyetiReSqtkUVg> arrayList = new ArrayList<iReSqtkUVgyetiReSqtkUVg>();
        List<iReSqtkUVgIHfiReSqtkUVg> list = iReSqtkUVgeLLiReSqtkUVg.e().ba().d();
        for (iReSqtkUVgIHfiReSqtkUVg iReSqtkUVgbBTiReSqtkUVg2 : list) {
            if (!iReSqtkUVgbBTiReSqtkUVg2.f() || !iReSqtkUVgbBTiReSqtkUVg2.d().e().a(iReSqtkUVgSzRiReSqtkUVg.aO)) continue;
            arrayList.add(iReSqtkUVgbBTiReSqtkUVg2.d());
        }
        for (iReSqtkUVgyetiReSqtkUVg iReSqtkUVgyetiReSqtkUVg2 : arrayList) {
            iReSqtkUVgWFfiReSqtkUVg iReSqtkUVgWFfiReSqtkUVg2 = new iReSqtkUVgWFfiReSqtkUVg(iReSqtkUVgyetiReSqtkUVg2.e());
            iReSqtkUVgyetiReSqtkUVg iReSqtkUVgyetiReSqtkUVg3 = arriReSqtkUVgyetiReSqtkUVg[iReSqtkUVgWFfiReSqtkUVg2.e()];
            if (iReSqtkUVgyetiReSqtkUVg3 != null && !(this.b(iReSqtkUVgyetiReSqtkUVg2) > this.b(iReSqtkUVgyetiReSqtkUVg3))) continue;
            arriReSqtkUVgyetiReSqtkUVg[iReSqtkUVgWFfiReSqtkUVg2.e()] = iReSqtkUVgyetiReSqtkUVg2;
        }
        return arriReSqtkUVgyetiReSqtkUVg;
    }

    private double b(iReSqtkUVgyetiReSqtkUVg iReSqtkUVgyetiReSqtkUVg2) {
        int n = 0;
        if (iReSqtkUVgyetiReSqtkUVg2.e().a(iReSqtkUVgSzRiReSqtkUVg.aO)) {
            iReSqtkUVgWFfiReSqtkUVg iReSqtkUVgWFfiReSqtkUVg2 = new iReSqtkUVgWFfiReSqtkUVg(iReSqtkUVgyetiReSqtkUVg2.e());
            n = iReSqtkUVgWFfiReSqtkUVg2.d();
        }
        return n += iReSqtkUVgBKdiReSqtkUVg.a(new iReSqtkUVgyetiReSqtkUVg[]{iReSqtkUVgyetiReSqtkUVg2}, iReSqtkUVgPpIiReSqtkUVg.a(iReSqtkUVgeLLiReSqtkUVg.e()));
    }

    private boolean c(iReSqtkUVgyetiReSqtkUVg iReSqtkUVgyetiReSqtkUVg2) {
        if (!iReSqtkUVgyetiReSqtkUVg2.e().a(iReSqtkUVgSzRiReSqtkUVg.x)) {
            return false;
        }
        iReSqtkUVgSijiReSqtkUVg iReSqtkUVgSijiReSqtkUVg2 = new iReSqtkUVgSijiReSqtkUVg(iReSqtkUVgyetiReSqtkUVg2.e());
        List<iReSqtkUVgQoLiReSqtkUVg> list = iReSqtkUVgSijiReSqtkUVg2.c(iReSqtkUVgyetiReSqtkUVg2);
        for (iReSqtkUVgQoLiReSqtkUVg iReSqtkUVgQoLiReSqtkUVg2 : list) {
            iReSqtkUVgnNhiReSqtkUVg iReSqtkUVgnNhiReSqtkUVg2 = iReSqtkUVgnNhiReSqtkUVg.a(iReSqtkUVgQoLiReSqtkUVg2.e());
            if (!iReSqtkUVgnNhiReSqtkUVg2.j()) continue;
            return true;
        }
        return false;
    }

    private double d(iReSqtkUVgyetiReSqtkUVg iReSqtkUVgyetiReSqtkUVg2) {
        double d2 = this.b(iReSqtkUVgyetiReSqtkUVg2);
        d2 += (double)iReSqtkUVgBKdiReSqtkUVg.a(32, iReSqtkUVgyetiReSqtkUVg2);
        d2 += (double)iReSqtkUVgBKdiReSqtkUVg.a(16, iReSqtkUVgyetiReSqtkUVg2);
        d2 += (double)iReSqtkUVgBKdiReSqtkUVg.a(19, iReSqtkUVgyetiReSqtkUVg2);
        d2 += (double)iReSqtkUVgBKdiReSqtkUVg.a(20, iReSqtkUVgyetiReSqtkUVg2);
        d2 += (double)iReSqtkUVgBKdiReSqtkUVg.a(48, iReSqtkUVgyetiReSqtkUVg2);
        return d2 += (double)iReSqtkUVgBKdiReSqtkUVg.a(34, iReSqtkUVgyetiReSqtkUVg2);
    }

    public iReSqtkUVgeMGiReSqtkUVg x() {
        return this.n;
    }

    public iReSqtkUVgeMGiReSqtkUVg y() {
        return this.o;
    }

    @Override
    public void a(JsonObject jsonObject) {
        JsonObject jsonObject2;
        JsonArray jsonArray;
        super.a(jsonObject);
        if (jsonObject.get("whitelisted-items") != null) {
            jsonArray = jsonObject.get("whitelisted-items").getAsJsonArray();
            jsonObject2 = new JsonObject();
            jsonObject2.addProperty("id", this.n.e());
            jsonObject2.add("value", (JsonElement)jsonArray);
            this.n.a(jsonObject2);
        }
        if (jsonObject.get("blacklisted-items") != null) {
            jsonArray = jsonObject.get("blacklisted-items").getAsJsonArray();
            jsonObject2 = new JsonObject();
            jsonObject2.addProperty("id", this.o.e());
            jsonObject2.add("value", (JsonElement)jsonArray);
            this.o.a(jsonObject2);
        }
    }
}

