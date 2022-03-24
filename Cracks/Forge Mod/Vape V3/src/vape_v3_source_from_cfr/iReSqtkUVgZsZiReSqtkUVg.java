/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 */
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class iReSqtkUVgZsZiReSqtkUVg {
    private String a;
    private int b = 0;
    private iReSqtkUVgfXGiReSqtkUVg c = iReSqtkUVgfXGiReSqtkUVg.a(this, "Delay", "#", "", 1.0, 100.0, 200.0, 1000.0);
    private iReSqtkUVgoRmiReSqtkUVg d = iReSqtkUVgoRmiReSqtkUVg.a(this, "Double Click", false);
    private iReSqtkUVgfXGiReSqtkUVg e = iReSqtkUVgfXGiReSqtkUVg.a(this, "Double Click Delay", "#", "", 1.0, 100.0, 200.0, 1000.0);
    private iReSqtkUVgwgUiReSqtkUVg f;

    public iReSqtkUVgZsZiReSqtkUVg(String string) {
        this.a = string;
        this.d.k().add(this.e);
    }

    public String a() {
        return this.a;
    }

    public int b() {
        return this.b;
    }

    public void a(int n) {
        this.b = n;
    }

    public iReSqtkUVgfXGiReSqtkUVg c() {
        return this.c;
    }

    public void a(iReSqtkUVgfXGiReSqtkUVg iReSqtkUVgfXGiReSqtkUVg2) {
        this.c = iReSqtkUVgfXGiReSqtkUVg2;
    }

    public iReSqtkUVgfXGiReSqtkUVg d() {
        return this.e;
    }

    public void b(iReSqtkUVgfXGiReSqtkUVg iReSqtkUVgfXGiReSqtkUVg2) {
        this.e = iReSqtkUVgfXGiReSqtkUVg2;
    }

    public iReSqtkUVgoRmiReSqtkUVg e() {
        return this.d;
    }

    public void a(iReSqtkUVgoRmiReSqtkUVg iReSqtkUVgoRmiReSqtkUVg2) {
        this.d = iReSqtkUVgoRmiReSqtkUVg2;
    }

    public JsonObject f() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("name", this.a);
        jsonObject.addProperty("key", (Number)this.b);
        jsonObject.add("delay", (JsonElement)this.c.g());
        jsonObject.add("double_click_enabled", (JsonElement)this.d.g());
        jsonObject.add("double_click", (JsonElement)this.e.g());
        return jsonObject;
    }

    public iReSqtkUVgZsZiReSqtkUVg a(JsonObject jsonObject) {
        if (jsonObject.get("name") != null && !jsonObject.get("name").isJsonNull()) {
            this.a = jsonObject.get("name").getAsString();
        }
        if (jsonObject.get("key") != null && !jsonObject.get("key").isJsonNull()) {
            this.b = jsonObject.get("key").getAsInt();
        }
        if (jsonObject.get("double_click_enabled") != null && !jsonObject.get("double_click_enabled").isJsonNull()) {
            this.d.a(jsonObject.get("double_click_enabled").getAsJsonObject());
        }
        if (jsonObject.get("double_click") != null && !jsonObject.get("delay").isJsonNull()) {
            this.c.a(jsonObject.get("delay").getAsJsonObject());
        }
        if (jsonObject.get("double_click") != null && !jsonObject.get("double_click").isJsonNull()) {
            this.e.a(jsonObject.get("double_click").getAsJsonObject());
        }
        return this;
    }

    public iReSqtkUVgwgUiReSqtkUVg g() {
        return this.f;
    }

    public void a(iReSqtkUVgwgUiReSqtkUVg iReSqtkUVgwgUiReSqtkUVg2) {
        this.f = iReSqtkUVgwgUiReSqtkUVg2;
    }
}

