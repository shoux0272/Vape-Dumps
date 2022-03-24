/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 */
import a.a;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class iReSqtkUVgJZmiReSqtkUVg
extends iReSqtkUVgewJiReSqtkUVg
implements iReSqtkUVgqXEiReSqtkUVg {
    private final String b;
    private String c;
    protected iReSqtkUVgqTOiReSqtkUVg a;
    private int d;
    private int e;
    private boolean f;
    private boolean g;
    private List<iReSqtkUVgWaoiReSqtkUVg> h = new ArrayList<iReSqtkUVgWaoiReSqtkUVg>();
    private List<iReSqtkUVgnCWiReSqtkUVg> i = new ArrayList<iReSqtkUVgnCWiReSqtkUVg>();
    private boolean j = false;
    private String k;
    private iReSqtkUVgYJUiReSqtkUVg l;
    private iReSqtkUVgYTjiReSqtkUVg m;
    private boolean n = true;
    private List<iReSqtkUVgZYoiReSqtkUVg> o = new ArrayList<iReSqtkUVgZYoiReSqtkUVg>();

    public iReSqtkUVgJZmiReSqtkUVg(String string, int n, int n2, iReSqtkUVgqTOiReSqtkUVg iReSqtkUVgqTOiReSqtkUVg2, String string2) {
        this.b = string;
        this.d = n;
        this.e = n2;
        this.a = iReSqtkUVgqTOiReSqtkUVg2;
        this.k = string2;
        if (n != 0) {
            this.I().add(n);
        }
    }

    public iReSqtkUVgJZmiReSqtkUVg(String string, int n, iReSqtkUVgqTOiReSqtkUVg iReSqtkUVgqTOiReSqtkUVg2) {
        this(string, 0, n, iReSqtkUVgqTOiReSqtkUVg2, null);
    }

    public iReSqtkUVgJZmiReSqtkUVg(String string, int n, iReSqtkUVgqTOiReSqtkUVg iReSqtkUVgqTOiReSqtkUVg2, String string2) {
        this(string, 0, n, iReSqtkUVgqTOiReSqtkUVg2, string2);
    }

    private iReSqtkUVgJZmiReSqtkUVg(String string, int n) {
        this(string, n, 0, iReSqtkUVgqTOiReSqtkUVg.b, null);
    }

    public iReSqtkUVgJZmiReSqtkUVg(String string) {
        this(string, 0, iReSqtkUVgqTOiReSqtkUVg.b);
    }

    public void a() {
        if (this.f() && !a.a.ib()) {
            return;
        }
        if (this.r() && this.I().isEmpty()) {
            return;
        }
        this.a(!this.f);
    }

    public boolean b() {
        return this.f;
    }

    public void a(boolean bl) {
        if (this.f() && !a.a.ib()) {
            return;
        }
        this.f = bl;
        if (this.f) {
            this.g();
        } else {
            this.h();
        }
        iReSqtkUVgFuiiReSqtkUVg.e.d().a(this);
    }

    @Override
    public String N() {
        return this.b;
    }

    public String c() {
        return this.c != null ? iReSqtkUVgVUTiReSqtkUVg.b + "7 " + this.c : "";
    }

    public void a(String string) {
        this.c = string;
    }

    public int d() {
        return this.e;
    }

    public iReSqtkUVgqTOiReSqtkUVg e() {
        return this.a;
    }

    public boolean f() {
        return false;
    }

    public void a(iReSqtkUVgMDuiReSqtkUVg iReSqtkUVgMDuiReSqtkUVg2) {
        if (iReSqtkUVgMDuiReSqtkUVg2.b() <= 0) {
            return;
        }
        if (this.I().isEmpty()) {
            return;
        }
        if (iReSqtkUVgMDuiReSqtkUVg2.a() && iReSqtkUVgeLLiReSqtkUVg.f().a() == null) {
            this.d(iReSqtkUVgMDuiReSqtkUVg2.b());
        }
    }

    public void a(iReSqtkUVggpgiReSqtkUVg iReSqtkUVggpgiReSqtkUVg2) {
    }

    public void g() {
        this.o.forEach(iReSqtkUVgJZmiReSqtkUVg::g);
    }

    public void h() {
        this.o.forEach(iReSqtkUVgJZmiReSqtkUVg::h);
    }

    public void a(iReSqtkUVglBNiReSqtkUVg iReSqtkUVglBNiReSqtkUVg2) {
    }

    public void b(iReSqtkUVglBNiReSqtkUVg iReSqtkUVglBNiReSqtkUVg2) {
    }

    public void a(iReSqtkUVgXsFiReSqtkUVg iReSqtkUVgXsFiReSqtkUVg2) {
    }

    public void a(iReSqtkUVgDVPiReSqtkUVg iReSqtkUVgDVPiReSqtkUVg2) {
    }

    public void b(iReSqtkUVgDVPiReSqtkUVg iReSqtkUVgDVPiReSqtkUVg2) {
    }

    public void a(iReSqtkUVgWkmiReSqtkUVg iReSqtkUVgWkmiReSqtkUVg2) {
    }

    public void a(iReSqtkUVgpUSiReSqtkUVg iReSqtkUVgpUSiReSqtkUVg2) {
    }

    public void a(iReSqtkUVgDhPiReSqtkUVg iReSqtkUVgDhPiReSqtkUVg2) {
    }

    public void a(iReSqtkUVgLSmiReSqtkUVg iReSqtkUVgLSmiReSqtkUVg2) {
    }

    public void a(iReSqtkUVgAxriReSqtkUVg iReSqtkUVgAxriReSqtkUVg2) {
    }

    public void a(iReSqtkUVgkqhiReSqtkUVg iReSqtkUVgkqhiReSqtkUVg2) {
    }

    public void a(iReSqtkUVgKYjiReSqtkUVg iReSqtkUVgKYjiReSqtkUVg2) {
    }

    public void a(iReSqtkUVgbmEiReSqtkUVg iReSqtkUVgbmEiReSqtkUVg2) {
    }

    public void a(iReSqtkUVgbZEiReSqtkUVg iReSqtkUVgbZEiReSqtkUVg2) {
    }

    public void a(iReSqtkUVgIXsiReSqtkUVg iReSqtkUVgIXsiReSqtkUVg2) {
    }

    public void a(iReSqtkUVgXWziReSqtkUVg iReSqtkUVgXWziReSqtkUVg2) {
    }

    public void a(iReSqtkUVgTXviReSqtkUVg iReSqtkUVgTXviReSqtkUVg2) {
    }

    public void a(iReSqtkUVgBvIiReSqtkUVg iReSqtkUVgBvIiReSqtkUVg2) {
    }

    public void a(iReSqtkUVgbUJiReSqtkUVg iReSqtkUVgbUJiReSqtkUVg2) {
    }

    public void a(iReSqtkUVgrbbiReSqtkUVg iReSqtkUVgrbbiReSqtkUVg2) {
    }

    public void a(iReSqtkUVgYAGiReSqtkUVg iReSqtkUVgYAGiReSqtkUVg2) {
    }

    public void a(iReSqtkUVgQgQiReSqtkUVg iReSqtkUVgQgQiReSqtkUVg2) {
    }

    public void a(iReSqtkUVgHbMiReSqtkUVg iReSqtkUVgHbMiReSqtkUVg2) {
    }

    public void a(iReSqtkUVgjuiiReSqtkUVg iReSqtkUVgjuiiReSqtkUVg2) {
    }

    public void b(iReSqtkUVgjuiiReSqtkUVg iReSqtkUVgjuiiReSqtkUVg2) {
    }

    public void a(iReSqtkUVglTuiReSqtkUVg iReSqtkUVglTuiReSqtkUVg2) {
    }

    public void a(iReSqtkUVgmTziReSqtkUVg iReSqtkUVgmTziReSqtkUVg2) {
    }

    public void a(iReSqtkUVgaWmiReSqtkUVg iReSqtkUVgaWmiReSqtkUVg2) {
    }

    public void a(iReSqtkUVgeoIiReSqtkUVg iReSqtkUVgeoIiReSqtkUVg2) {
    }

    public void a(iReSqtkUVgFltiReSqtkUVg iReSqtkUVgFltiReSqtkUVg2) {
    }

    public void a(iReSqtkUVgRcsiReSqtkUVg iReSqtkUVgRcsiReSqtkUVg2) {
    }

    public void a(iReSqtkUVgxsliReSqtkUVg iReSqtkUVgxsliReSqtkUVg2) {
    }

    public void a(iReSqtkUVgWjqiReSqtkUVg iReSqtkUVgWjqiReSqtkUVg2) {
    }

    public void i() {
    }

    public void j() {
    }

    public void a(iReSqtkUVgJZmiReSqtkUVg iReSqtkUVgJZmiReSqtkUVg2) {
    }

    public List<iReSqtkUVgZYoiReSqtkUVg> k() {
        return this.o;
    }

    public List<iReSqtkUVgWaoiReSqtkUVg> l() {
        return this.h;
    }

    public iReSqtkUVgZYoiReSqtkUVg b(String string) {
        for (iReSqtkUVgZYoiReSqtkUVg iReSqtkUVgZYoiReSqtkUVg2 : this.k()) {
            if (!iReSqtkUVgZYoiReSqtkUVg2.N().equalsIgnoreCase(string)) continue;
            return iReSqtkUVgZYoiReSqtkUVg2;
        }
        return null;
    }

    public iReSqtkUVgWaoiReSqtkUVg c(String string) {
        for (iReSqtkUVgWaoiReSqtkUVg iReSqtkUVgWaoiReSqtkUVg2 : this.l()) {
            if (!iReSqtkUVgWaoiReSqtkUVg2.e().equalsIgnoreCase(string) && !iReSqtkUVgWaoiReSqtkUVg2.N().equalsIgnoreCase(string)) continue;
            return iReSqtkUVgWaoiReSqtkUVg2;
        }
        return null;
    }

    public void a(iReSqtkUVgZYoiReSqtkUVg ... arriReSqtkUVgZYoiReSqtkUVg) {
        this.k().addAll(Arrays.asList(arriReSqtkUVgZYoiReSqtkUVg));
    }

    public void a(iReSqtkUVgWaoiReSqtkUVg ... arriReSqtkUVgWaoiReSqtkUVg) {
        this.l().addAll(Arrays.asList(arriReSqtkUVgWaoiReSqtkUVg));
    }

    public List<iReSqtkUVgnCWiReSqtkUVg> m() {
        if (!this.j) {
            this.x();
        }
        return this.i;
    }

    private void x() {
        for (iReSqtkUVgWaoiReSqtkUVg iReSqtkUVgWaoiReSqtkUVg2 : this.l()) {
            if (iReSqtkUVgWaoiReSqtkUVg2.c() == null) continue;
            this.i.add((iReSqtkUVgnCWiReSqtkUVg)iReSqtkUVgWaoiReSqtkUVg2.c());
        }
        this.j = true;
    }

    public JsonObject n() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("name", this.N());
        jsonObject.add("keybinds", (JsonElement)this.M());
        JsonArray jsonArray = new JsonArray();
        for (iReSqtkUVgWaoiReSqtkUVg iReSqtkUVgWaoiReSqtkUVg2 : this.h) {
            if (!iReSqtkUVgWaoiReSqtkUVg2.h()) continue;
            jsonArray.add((JsonElement)iReSqtkUVgWaoiReSqtkUVg2.g());
        }
        jsonObject.add("values", (JsonElement)jsonArray);
        if (this.m != null) {
            jsonObject.addProperty("visible", Boolean.valueOf(this.m.J().b()));
        }
        return jsonObject;
    }

    public void a(JsonObject jsonObject) {
        this.I().clear();
        if (jsonObject.get("name") != null && !jsonObject.get("name").isJsonNull() && jsonObject.get("name").getAsString().equalsIgnoreCase(this.N())) {
            if (jsonObject.get("keybind") != null && !jsonObject.get("keybind").isJsonNull()) {
                this.f(jsonObject.get("keybind").getAsInt());
                this.I().add(this.p());
            } else if (jsonObject.get("keybinds") != null && jsonObject.get("keybinds").isJsonArray()) {
                try {
                    this.a(jsonObject.getAsJsonArray("keybinds"));
                }
                catch (Exception exception) {}
            } else {
                this.I().clear();
                this.I().add(this.d);
            }
            JsonArray jsonArray = jsonObject.getAsJsonArray("values");
            Iterator iterator = jsonArray.iterator();
            while (iterator.hasNext()) {
                JsonObject jsonObject2 = ((JsonElement)iterator.next()).getAsJsonObject();
                for (iReSqtkUVgWaoiReSqtkUVg iReSqtkUVgWaoiReSqtkUVg2 : this.h) {
                    if (!iReSqtkUVgWaoiReSqtkUVg2.e().equalsIgnoreCase(jsonObject2.get("id").getAsString())) continue;
                    iReSqtkUVgWaoiReSqtkUVg2.a(jsonObject2);
                }
            }
            if (jsonObject.get("visible") != null && !jsonObject.get("visible").isJsonNull() && this.m != null) {
                boolean bl = jsonObject.get("visible").getAsBoolean();
                this.m.J().b(bl);
            }
        }
    }

    public String o() {
        return this.k;
    }

    public void d(String string) {
        this.k = string;
    }

    public int p() {
        return this.d;
    }

    public void q() {
    }

    public void a(long l, boolean bl) {
        if (this.l != null) {
            this.l.a(false);
        }
        this.l = new iReSqtkUVgYJUiReSqtkUVg(this, l, bl);
        new Thread(this.l).start();
    }

    public boolean r() {
        return this.g;
    }

    @Override
    public String s() {
        return String.format(" %s7[%sr%s%s7]%sr %s", iReSqtkUVgVUTiReSqtkUVg.b, iReSqtkUVgVUTiReSqtkUVg.b, this.J(), iReSqtkUVgVUTiReSqtkUVg.b, iReSqtkUVgVUTiReSqtkUVg.b, this.N());
    }

    @Override
    public void t() {
        this.a();
    }

    public void a(iReSqtkUVgYTjiReSqtkUVg iReSqtkUVgYTjiReSqtkUVg2) {
        this.m = iReSqtkUVgYTjiReSqtkUVg2;
    }

    public boolean u() {
        return this.n;
    }

    public void b(boolean bl) {
        this.n = bl;
    }

    public iReSqtkUVgYTjiReSqtkUVg v() {
        return this.m;
    }

    public boolean w() {
        return this.m.J().b();
    }
}

