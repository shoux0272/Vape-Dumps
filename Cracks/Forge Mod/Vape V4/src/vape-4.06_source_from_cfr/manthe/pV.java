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
import java.util.Arrays;
import java.util.List;
import manthe.Ds;
import manthe.on;
import manthe.rC;
import manthe.y5;
import manthe.y8;
import manthe.ya;
import manthe.zu;

public class pV {
    private final List<Class<? extends Object>> c = Arrays.asList(y5.class, y8.class, ya.class, rC.class);
    private final List<Class<? extends Object>> a = Arrays.asList(zu.class);
    private final List<Ds> b = new ArrayList<Ds>();

    public void a(Ds ds2) {
        this.b.add(ds2);
    }

    public List<Ds> a() {
        return this.b;
    }

    public void a(JsonArray jsonArray) {
        for (int k = 0; k < jsonArray.size(); ++k) {
            JsonObject jsonObject;
            JsonElement jsonElement = jsonArray.get(k);
            if (!jsonElement.isJsonObject() || jsonElement.isJsonNull() || (jsonObject = jsonElement.getAsJsonObject()).get("id") == null || jsonObject.get("id").isJsonNull()) continue;
            for (Ds ds2 : this.a()) {
                if (!this.a.contains(ds2.i().getClass().getSuperclass()) && !this.a.contains(ds2.i().getClass()) && this.c.contains(ds2.i().getClass().getSuperclass()) || this.c.contains(ds2.i().getClass()) || !ds2.e().equalsIgnoreCase(jsonObject.get("id").getAsString())) continue;
                ds2.a(jsonObject);
            }
            for (Ds ds2 : on.p.T().b()) {
                if (!ds2.e().equalsIgnoreCase(jsonObject.get("id").getAsString()) || on.p.L()) continue;
                ds2.a(jsonObject);
            }
        }
    }

    public JsonArray b() {
        JsonArray jsonArray = new JsonArray();
        for (Ds ds2 : this.a()) {
            if (this.c.contains(ds2.i().getClass()) || !ds2.f()) continue;
            jsonArray.add((JsonElement)ds2.m());
        }
        for (Ds ds2 : on.p.T().b()) {
            if (!ds2.f()) continue;
            jsonArray.add((JsonElement)ds2.m());
        }
        return jsonArray;
    }
}

