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
import java.util.List;

public class iReSqtkUVgkXGiReSqtkUVg {
    private List<iReSqtkUVgWaoiReSqtkUVg> a = new ArrayList<iReSqtkUVgWaoiReSqtkUVg>();

    public void a(iReSqtkUVgWaoiReSqtkUVg iReSqtkUVgWaoiReSqtkUVg2) {
        this.a.add(iReSqtkUVgWaoiReSqtkUVg2);
    }

    public JsonArray a() {
        JsonArray jsonArray = new JsonArray();
        for (iReSqtkUVgWaoiReSqtkUVg iReSqtkUVgWaoiReSqtkUVg2 : this.a) {
            jsonArray.add((JsonElement)iReSqtkUVgWaoiReSqtkUVg2.g());
        }
        return jsonArray;
    }

    public void a(JsonArray jsonArray) {
        if (jsonArray.size() == 0) {
            return;
        }
        for (int i = 0; i < jsonArray.size(); ++i) {
            JsonObject jsonObject;
            JsonElement jsonElement = jsonArray.get(i);
            if (!jsonElement.isJsonObject() || jsonElement.isJsonNull() || (jsonObject = jsonElement.getAsJsonObject()).get("id") == null || jsonObject.get("id").isJsonNull()) continue;
            for (iReSqtkUVgWaoiReSqtkUVg iReSqtkUVgWaoiReSqtkUVg2 : this.a) {
                if (!iReSqtkUVgWaoiReSqtkUVg2.e().equalsIgnoreCase(jsonObject.get("id").getAsString())) continue;
                iReSqtkUVgWaoiReSqtkUVg2.a(jsonObject);
            }
        }
    }

    public List<iReSqtkUVgWaoiReSqtkUVg> b() {
        return this.a;
    }
}

