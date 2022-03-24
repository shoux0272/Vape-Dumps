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
import manthe.ds;
import manthe.e2;
import manthe.eC;
import manthe.ej;
import manthe.ex;
import manthe.gb;
import manthe.ng;
import manthe.pr;
import manthe.qD;
import manthe.uE;
import manthe.vK;
import manthe.wm;
import manthe.zu;

public class c_ {
    private final Set<pr> a = new HashSet<pr>();
    public DB f = DB.a(this, "Use Enemies", true);
    public DB d = DB.a(this, "Use Alias", true);
    public DB b = DB.a((Object)this, "Spoof alias", false, "This will make the enemies name be replaced in chat with their alias.\nApplies on regular Nametags as well");
    public DB c = DB.a((Object)this, "Use color", true, "Re-colors certain render modules to use \"Enemies Color\" on enemies");
    public DE e = DE.a((Object)this, "Enemies Color", new Color(244, 66, 66));
    private static String g;

    public c_() {
        vK vK2 = ((qD)this.b.c()).a().a();
        ((qD)this.b.c()).a().a(new uE(this, vK2));
    }

    public Set<pr> e() {
        return this.a;
    }

    public void b(pr pr2) {
        pr pr3 = this.c(pr2.b());
        if (pr3 != null) {
            this.a.remove(pr3);
        }
        this.a.add(pr2);
        ng.n.a(pr2);
        this.d();
    }

    public void a() {
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
            pr pr2 = this.c(string);
            if (pr2 != null) {
                this.a(pr2);
            } else {
                this.b(new pr(string, string));
            }
        }
    }

    public void a(pr pr2) {
        this.a.remove(pr2);
        ng.n.b(pr2);
        this.d();
    }

    public pr c(String string) {
        for (pr pr2 : this.a) {
            if (!pr2.b().equalsIgnoreCase(string)) continue;
            return pr2;
        }
        return null;
    }

    public boolean a(String string) {
        if (!this.f.u().booleanValue()) {
            return false;
        }
        pr pr2 = this.c(string);
        return pr2 != null;
    }

    public boolean a(ej ej2) {
        return this.a(ej2.S());
    }

    public boolean b(ej ej2) {
        pr pr2 = this.d(ej2.S());
        if (pr2 != null) {
            return pr2.e();
        }
        return false;
    }

    public pr a(String string, boolean bl) {
        if (this.f.u().booleanValue() || !bl) {
            pr pr2 = this.c(string);
            if (pr2 != null) {
                return null;
            }
            return pr2;
        }
        return null;
    }

    public pr d(String string) {
        return this.a(string, true);
    }

    public void c() {
        this.e().clear();
        ng.n.ag.A().v().clear();
    }

    public void a(JsonArray jsonArray) {
        if (jsonArray.size() == 0) {
            return;
        }
        this.c();
        for (int k = 0; k < jsonArray.size(); ++k) {
            try {
                JsonElement jsonElement = jsonArray.get(k);
                if (!jsonElement.isJsonObject() || jsonElement.isJsonNull()) continue;
                pr pr2 = pr.a(jsonElement.getAsJsonObject());
                this.b(pr2);
                continue;
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
        zu.b(wm.class).ak();
    }

    public JsonArray b() {
        JsonArray jsonArray = new JsonArray();
        for (pr pr2 : this.e()) {
            jsonArray.add((JsonElement)pr2.d());
        }
        return jsonArray;
    }

    public void d() {
        if (ds.t().e()) {
            return;
        }
        for (Object e10 : ds.t().j()) {
            new eC(e10).aZ();
        }
    }

    public static void b(String string) {
        g = string;
    }

    public static String f() {
        return g;
    }

    static {
        if (c_.f() != null) {
            c_.b("JUHpeb");
        }
    }
}

