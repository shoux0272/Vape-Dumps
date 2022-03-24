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
import java.util.UUID;

public class iReSqtkUVgnWNiReSqtkUVg
extends iReSqtkUVgewJiReSqtkUVg {
    private UUID a = UUID.randomUUID();
    private String b;
    private String c;
    private JsonObject d;
    private String e = "";
    private boolean f;
    private JsonObject g = new JsonObject();

    public iReSqtkUVgnWNiReSqtkUVg(String string, String string2) {
        this.b = string;
        this.c = string2;
    }

    public iReSqtkUVgnWNiReSqtkUVg(String string, String string2, boolean bl) {
        this.b = string;
        this.c = string2;
        this.f = bl;
    }

    public void a() {
        JsonArray jsonArray;
        if (this.d.get("modules") != null && !this.d.get("modules").isJsonNull()) {
            iReSqtkUVgFuiiReSqtkUVg.e.d().a(this.d.get("modules").getAsJsonArray());
        }
        if (this.d.get("values") != null && !this.d.get("values").isJsonNull()) {
            iReSqtkUVgFuiiReSqtkUVg.e.e().a(this.d.get("values").getAsJsonArray());
        }
        if (this.d.get("macros") != null && !this.d.get("macros").isJsonNull()) {
            iReSqtkUVgFuiiReSqtkUVg.e.l().a(this.d.get("macros").getAsJsonArray());
        }
        if (this.d.get("search") != null && !this.d.get("search").isJsonNull()) {
            jsonArray = this.d.get("search").getAsJsonArray();
            iReSqtkUVgFuiiReSqtkUVg.e.s().a(jsonArray);
        }
        if (iReSqtkUVgFuiiReSqtkUVg.e.v().a.i().booleanValue()) {
            this.b();
        }
        if (this.d.get("frames") != null && !this.d.get("frames").isJsonNull()) {
            jsonArray = this.d.get("frames").getAsJsonArray();
            JsonArray jsonArray2 = new JsonArray();
            jsonArray2.add((JsonElement)jsonArray);
            iReSqtkUVgFuiiReSqtkUVg.e.m().a(jsonArray2);
        }
    }

    public void b() {
        iReSqtkUVgFuiiReSqtkUVg.e.d().a(this.g);
    }

    public void c() {
        this.g = iReSqtkUVgFuiiReSqtkUVg.e.d().g();
    }

    public void d() {
        this.c = "3.25";
        this.d = iReSqtkUVgFuiiReSqtkUVg.e.n();
        this.d.add("enabled", (JsonElement)this.g);
    }

    public JsonObject e() {
        return this.d;
    }

    public void a(JsonObject jsonObject) {
        this.d = jsonObject;
    }

    public UUID f() {
        return this.a;
    }

    public void a(UUID uUID) {
        this.a = uUID;
    }

    public String g() {
        return this.b;
    }

    public String h() {
        return this.c;
    }

    public iReSqtkUVgnWNiReSqtkUVg b(JsonObject jsonObject) {
        if (jsonObject.get("id") != null && !jsonObject.get("id").isJsonNull()) {
            this.a = UUID.fromString(jsonObject.get("id").getAsString());
        }
        if (jsonObject.get("name") != null && !jsonObject.get("name").isJsonNull()) {
            this.b = jsonObject.get("name").getAsString();
        }
        if (jsonObject.get("version") != null && !jsonObject.get("version").isJsonNull()) {
            this.c = jsonObject.get("version").getAsString();
        }
        if (jsonObject.get("data") != null && !jsonObject.get("data").isJsonNull() && jsonObject.get("data").isJsonObject()) {
            this.d = jsonObject.get("data").getAsJsonObject();
            if (this.d.get("keybinds") != null && !this.d.get("keybinds").isJsonNull()) {
                this.a(this.d.get("keybinds").getAsJsonArray());
            }
            if (this.d.has("enabled")) {
                this.g = this.d.getAsJsonObject("enabled");
            }
        }
        return this;
    }

    public JsonObject i() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("id", this.a.toString());
        jsonObject.addProperty("name", this.b);
        jsonObject.addProperty("version", this.c);
        this.d.add("keybinds", (JsonElement)this.M());
        jsonObject.add("data", (JsonElement)this.d);
        return jsonObject;
    }

    public String j() {
        return this.e;
    }

    public void a(String string) {
        this.e = string;
    }

    public boolean k() {
        return this.f;
    }

    public void a(boolean bl) {
        this.f = bl;
    }

    @Override
    public void t() {
        iReSqtkUVgFuiiReSqtkUVg.e.k().d(this);
    }

    @Override
    public String s() {
        return String.format(" %s7[%sr%s%s7]%sr %s", iReSqtkUVgVUTiReSqtkUVg.b, iReSqtkUVgVUTiReSqtkUVg.b, this.J(), iReSqtkUVgVUTiReSqtkUVg.b, iReSqtkUVgVUTiReSqtkUVg.b, this.g());
    }
}

