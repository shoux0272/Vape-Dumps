/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
package manthe;

import com.google.gson.JsonObject;
import manthe.on;

public class pr {
    private String b;
    private String c;
    private boolean a;

    public pr(String string, String string2, boolean bl) {
        this.b = string;
        this.c = string2;
        this.a = bl;
    }

    public pr(String string, String string2) {
        this(string, string2, false);
    }

    public String b() {
        return this.b;
    }

    public String c() {
        if (on.p.b().d.u().booleanValue()) {
            return this.a();
        }
        return this.b;
    }

    public void a(String string) {
        this.c = string;
    }

    public String a() {
        return this.c;
    }

    public boolean e() {
        return this.a;
    }

    public void a(boolean bl) {
        this.a = bl;
        on.p.N().b();
    }

    public static pr a(JsonObject jsonObject) {
        String string = "";
        String string2 = "";
        boolean bl = true;
        if (jsonObject.get("name") != null && !jsonObject.get("name").isJsonNull()) {
            string = jsonObject.get("name").getAsString();
        }
        if (jsonObject.get("alias") != null && !jsonObject.get("alias").isJsonNull()) {
            string2 = jsonObject.get("alias").getAsString();
        }
        if (jsonObject.get("exclusive") != null && !jsonObject.get("exclusive").isJsonNull()) {
            bl = jsonObject.get("exclusive").getAsBoolean();
        }
        return new pr(string, string2, bl);
    }

    public JsonObject d() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("name", this.b);
        jsonObject.addProperty("alias", this.c);
        jsonObject.addProperty("exclusive", Boolean.valueOf(this.a));
        return jsonObject;
    }
}

