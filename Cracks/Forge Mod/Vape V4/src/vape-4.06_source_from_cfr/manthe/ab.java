/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
package manthe;

import com.google.gson.JsonObject;
import manthe.on;

public class ab {
    private String b;
    private String a;
    private boolean c = true;

    public ab(String string, String string2) {
        this.b = string;
        this.a = string2;
    }

    public String a() {
        return this.b;
    }

    public String b() {
        if (on.p.N().g.u().booleanValue()) {
            return this.e();
        }
        return this.b;
    }

    public void a(String string) {
        this.a = string;
    }

    public String e() {
        return this.a;
    }

    public boolean c() {
        return this.c;
    }

    public void a(boolean bl) {
        this.c = bl;
        on.p.N().b();
    }

    public ab a(JsonObject jsonObject) {
        if (jsonObject.get("name") != null && !jsonObject.get("name").isJsonNull()) {
            this.b = jsonObject.get("name").getAsString();
        }
        if (jsonObject.get("alias") != null && !jsonObject.get("alias").isJsonNull()) {
            this.a = jsonObject.get("alias").getAsString();
        }
        if (jsonObject.get("target") != null && !jsonObject.get("target").isJsonNull()) {
            this.c = jsonObject.get("target").getAsBoolean();
        }
        return this;
    }

    public JsonObject d() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("name", this.b);
        jsonObject.addProperty("alias", this.a);
        jsonObject.addProperty("target", Boolean.valueOf(this.c));
        return jsonObject;
    }
}

