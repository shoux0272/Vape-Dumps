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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class iReSqtkUVgCFniReSqtkUVg {
    private List<Class<? extends Object>> a = Arrays.asList(iReSqtkUVgJZmiReSqtkUVg.class, iReSqtkUVgNeViReSqtkUVg.class, iReSqtkUVgZsZiReSqtkUVg.class, iReSqtkUVgowKiReSqtkUVg.class);
    private List<Class<? extends Object>> b = Arrays.asList(iReSqtkUVgypOiReSqtkUVg.class);
    private List<iReSqtkUVgWaoiReSqtkUVg> c = new ArrayList<iReSqtkUVgWaoiReSqtkUVg>();

    public void a(iReSqtkUVgWaoiReSqtkUVg iReSqtkUVgWaoiReSqtkUVg2) {
        this.c.add(iReSqtkUVgWaoiReSqtkUVg2);
    }

    public List<iReSqtkUVgWaoiReSqtkUVg> a() {
        return this.c;
    }

    public void a(JsonArray jsonArray) {
        for (int i = 0; i < jsonArray.size(); ++i) {
            JsonObject jsonObject;
            JsonElement jsonElement = jsonArray.get(i);
            if (!jsonElement.isJsonObject() || jsonElement.isJsonNull() || (jsonObject = jsonElement.getAsJsonObject()).get("id") == null || jsonObject.get("id").isJsonNull()) continue;
            for (iReSqtkUVgWaoiReSqtkUVg iReSqtkUVgWaoiReSqtkUVg2 : this.a()) {
                if (!this.b.contains(iReSqtkUVgWaoiReSqtkUVg2.f().getClass().getSuperclass()) && !this.b.contains(iReSqtkUVgWaoiReSqtkUVg2.f().getClass()) && this.a.contains(iReSqtkUVgWaoiReSqtkUVg2.f().getClass().getSuperclass()) || this.a.contains(iReSqtkUVgWaoiReSqtkUVg2.f().getClass()) || !iReSqtkUVgWaoiReSqtkUVg2.e().equalsIgnoreCase(jsonObject.get("id").getAsString())) continue;
                iReSqtkUVgWaoiReSqtkUVg2.a(jsonObject);
            }
            for (iReSqtkUVgWaoiReSqtkUVg iReSqtkUVgWaoiReSqtkUVg2 : iReSqtkUVgFuiiReSqtkUVg.e.w().b()) {
                if (!iReSqtkUVgWaoiReSqtkUVg2.e().equalsIgnoreCase(jsonObject.get("id").getAsString()) || iReSqtkUVgFuiiReSqtkUVg.e.t()) continue;
                iReSqtkUVgWaoiReSqtkUVg2.a(jsonObject);
            }
        }
    }

    public JsonArray b() {
        JsonArray jsonArray = new JsonArray();
        for (iReSqtkUVgWaoiReSqtkUVg iReSqtkUVgWaoiReSqtkUVg2 : this.a()) {
            if (this.a.contains(iReSqtkUVgWaoiReSqtkUVg2.f().getClass()) || !iReSqtkUVgWaoiReSqtkUVg2.h()) continue;
            jsonArray.add((JsonElement)iReSqtkUVgWaoiReSqtkUVg2.g());
        }
        for (iReSqtkUVgWaoiReSqtkUVg iReSqtkUVgWaoiReSqtkUVg2 : iReSqtkUVgFuiiReSqtkUVg.e.w().b()) {
            if (!iReSqtkUVgWaoiReSqtkUVg2.h()) continue;
            jsonArray.add((JsonElement)iReSqtkUVgWaoiReSqtkUVg2.g());
        }
        return jsonArray;
    }
}

