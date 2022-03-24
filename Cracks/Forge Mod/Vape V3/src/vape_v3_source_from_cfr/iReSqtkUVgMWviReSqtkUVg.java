/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
import com.google.gson.JsonObject;

public class iReSqtkUVgMWviReSqtkUVg {
    private String a;
    private String b;
    private boolean c = true;

    public iReSqtkUVgMWviReSqtkUVg(String string, String string2) {
        this.a = string;
        this.b = string2;
    }

    public String a() {
        return this.a;
    }

    public String b() {
        if (iReSqtkUVgFuiiReSqtkUVg.e.j().b.i().booleanValue()) {
            return this.c();
        }
        return this.a;
    }

    public void a(String string) {
        this.b = string;
    }

    public String c() {
        return this.b;
    }

    public boolean d() {
        return this.c;
    }

    public void a(boolean bl) {
        this.c = bl;
        iReSqtkUVgFuiiReSqtkUVg.e.j().e();
    }

    public iReSqtkUVgMWviReSqtkUVg a(JsonObject jsonObject) {
        if (jsonObject.get("name") != null && !jsonObject.get("name").isJsonNull()) {
            this.a = jsonObject.get("name").getAsString();
        }
        if (jsonObject.get("alias") != null && !jsonObject.get("alias").isJsonNull()) {
            this.b = jsonObject.get("alias").getAsString();
        }
        if (jsonObject.get("target") != null && !jsonObject.get("target").isJsonNull()) {
            this.c = jsonObject.get("target").getAsBoolean();
        }
        return this;
    }

    public JsonObject e() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("name", this.a);
        jsonObject.addProperty("alias", this.b);
        jsonObject.addProperty("target", Boolean.valueOf(this.c));
        return jsonObject;
    }
}

