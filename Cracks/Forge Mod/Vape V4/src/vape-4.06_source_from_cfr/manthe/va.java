/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 */
package manthe;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import java.awt.Color;
import java.util.HashSet;
import java.util.Set;
import manthe.A5;
import manthe.DB;
import manthe.DE;
import manthe.Ds;
import manthe.ab;
import manthe.ds;
import manthe.e2;
import manthe.eC;
import manthe.ej;
import manthe.ex;
import manthe.gb;
import manthe.nV;
import manthe.ng;
import manthe.qD;
import manthe.vK;
import manthe.wX;
import manthe.zu;

public class va {
    private final Set<ab> a = new HashSet<ab>();
    public DB d = DB.a(this, "Use Friends", true);
    public DB g = DB.a(this, "Use Alias", true);
    public DB b = DB.a((Object)this, "Spoof alias", false, "This will make the friends name be replaced in chat with their alias and on their regular Nametags as well");
    public DB c = DB.a((Object)this, "Recolor visuals", true, "Re-colors certain render modules to use \"Friends Color\" on friends");
    public DE e = DE.a((Object)this, "Friends Color", new Color(66, 244, 137));
    private static int[] f;

    public va() {
        vK vK2 = ((qD)this.b.c()).a().a();
        ((qD)this.b.c()).a().a(new nV(this, vK2));
        this.c.a(new Ds[]{this.e});
        this.g.a(new Ds[]{this.b});
    }

    public Set<ab> e() {
        return this.a;
    }

    public void b(ab ab2) {
        ab ab3 = this.a(ab2.a());
        if (ab3 != null) {
            this.a.remove(ab3);
        }
        this.a.add(ab2);
        ng.g.a(ab2);
        this.b();
        zu.b(wX.class).ak();
    }

    public void f() {
        gb gb2 = ds.I();
        if (gb2.e()) {
            return;
        }
        ex ex2 = gb2.h();
        if (ex2.e()) {
            return;
        }
        if (ex2.a(A5.L)) {
            e2 e22 = new e2(ex2);
            String string = e22.S();
            ab ab2 = this.a(string);
            if (ab2 != null) {
                this.a(ab2);
            } else {
                this.b(new ab(string, string));
            }
        }
    }

    public void a(ab ab2) {
        this.a.remove(ab2);
        ng.g.b(ab2);
        this.b();
    }

    public ab a(String string) {
        for (ab ab2 : this.a) {
            if (!ab2.a().equalsIgnoreCase(string)) continue;
            return ab2;
        }
        return null;
    }

    public boolean c(String string) {
        if (!this.d.u().booleanValue()) {
            return false;
        }
        ab ab2 = this.a(string);
        return ab2 != null && ab2.c();
    }

    public boolean a(ej ej2) {
        return this.c(ej2.S());
    }

    public ab a(String string, boolean bl) {
        if (this.d.u().booleanValue() || !bl) {
            ab ab2 = this.a(string);
            if (ab2 != null && !ab2.c()) {
                return null;
            }
            return ab2;
        }
        return null;
    }

    public ab b(String string) {
        return this.a(string, true);
    }

    public void a() {
        this.e().clear();
        ng.g.ah.A().v().clear();
    }

    public void a(JsonArray jsonArray) {
        if (jsonArray.size() == 0) {
            return;
        }
        this.a();
        for (int k = 0; k < jsonArray.size(); ++k) {
            try {
                JsonElement jsonElement = jsonArray.get(k);
                if (!jsonElement.isJsonObject() || jsonElement.isJsonNull()) continue;
                ab ab2 = new ab("", "").a(jsonElement.getAsJsonObject());
                this.b(ab2);
                continue;
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
    }

    public JsonArray c() {
        JsonArray jsonArray = new JsonArray();
        for (ab ab2 : this.e()) {
            jsonArray.add((JsonElement)ab2.d());
        }
        return jsonArray;
    }

    public void b() {
        if (ds.t().e()) {
            return;
        }
        for (Object e10 : ds.t().j()) {
            new eC(e10).aZ();
        }
    }

    public static void b(int[] arrn) {
        f = arrn;
    }

    public static int[] d() {
        return f;
    }

    static {
        if (va.d() != null) {
            va.b(new int[4]);
        }
    }
}

