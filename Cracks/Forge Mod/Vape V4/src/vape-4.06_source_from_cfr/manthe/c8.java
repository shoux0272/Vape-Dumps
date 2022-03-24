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
import java.util.ArrayList;
import java.util.List;
import manthe.Ds;
import manthe.on;

public class c8 {
    private final List<Ds> a = new ArrayList<Ds>();

    public void a(Ds ds2) {
        this.a.add(ds2);
    }

    public JsonArray a() {
        JsonArray jsonArray = new JsonArray();
        for (Ds ds2 : this.a) {
            jsonArray.add((JsonElement)ds2.m());
        }
        JsonObject jsonObject = new JsonObject();
        jsonObject.add("enemies", (JsonElement)on.p.b().b());
        jsonArray.add((JsonElement)jsonObject);
        return jsonArray;
    }

    public void a(JsonArray jsonArray) {
        if (jsonArray.size() == 0) {
            return;
        }
        for (int k = 0; k < jsonArray.size(); ++k) {
            JsonElement jsonElement = jsonArray.get(k);
            if (!jsonElement.isJsonObject() || jsonElement.isJsonNull()) continue;
            JsonObject jsonObject = jsonElement.getAsJsonObject();
            if (jsonObject.get("id") != null && !jsonObject.get("id").isJsonNull()) {
                for (Ds ds2 : this.a) {
                    if (!ds2.e().equalsIgnoreCase(jsonObject.get("id").getAsString())) continue;
                    ds2.a(jsonObject);
                }
            }
            if (jsonObject.get("enemies") == null || jsonObject.get("enemies").isJsonNull()) continue;
            JsonArray jsonArray2 = jsonObject.get("enemies").getAsJsonArray();
            on.p.b().a(jsonArray2);
        }
    }

    public List<Ds> b() {
        return this.a;
    }
}

