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
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class iReSqtkUVgLnYiReSqtkUVg {
    private Set<iReSqtkUVgZsZiReSqtkUVg> a = new HashSet<iReSqtkUVgZsZiReSqtkUVg>();

    public void a(iReSqtkUVgZsZiReSqtkUVg iReSqtkUVgZsZiReSqtkUVg2) {
        this.a.add(iReSqtkUVgZsZiReSqtkUVg2);
        iReSqtkUVgFCaiReSqtkUVg.d.a(iReSqtkUVgZsZiReSqtkUVg2);
    }

    public void b(iReSqtkUVgZsZiReSqtkUVg iReSqtkUVgZsZiReSqtkUVg2) {
        this.a.remove(iReSqtkUVgZsZiReSqtkUVg2);
        iReSqtkUVgFCaiReSqtkUVg.d.b(iReSqtkUVgZsZiReSqtkUVg2);
    }

    public iReSqtkUVgZsZiReSqtkUVg a(String string) {
        for (iReSqtkUVgZsZiReSqtkUVg iReSqtkUVgZsZiReSqtkUVg2 : this.a) {
            if (!iReSqtkUVgZsZiReSqtkUVg2.a().equalsIgnoreCase(string)) continue;
            return iReSqtkUVgZsZiReSqtkUVg2;
        }
        return null;
    }

    public iReSqtkUVgZsZiReSqtkUVg a(int n) {
        for (iReSqtkUVgZsZiReSqtkUVg iReSqtkUVgZsZiReSqtkUVg2 : this.a) {
            if (iReSqtkUVgZsZiReSqtkUVg2.b() != n) continue;
            return iReSqtkUVgZsZiReSqtkUVg2;
        }
        return null;
    }

    public List<iReSqtkUVgZsZiReSqtkUVg> b(int n) {
        ArrayList<iReSqtkUVgZsZiReSqtkUVg> arrayList = new ArrayList<iReSqtkUVgZsZiReSqtkUVg>();
        for (iReSqtkUVgZsZiReSqtkUVg iReSqtkUVgZsZiReSqtkUVg2 : this.a) {
            if (iReSqtkUVgZsZiReSqtkUVg2.b() != n) continue;
            arrayList.add(iReSqtkUVgZsZiReSqtkUVg2);
        }
        return arrayList;
    }

    private void b() {
        for (iReSqtkUVgZsZiReSqtkUVg iReSqtkUVgZsZiReSqtkUVg2 : new HashSet<iReSqtkUVgZsZiReSqtkUVg>(this.a)) {
            this.b(iReSqtkUVgZsZiReSqtkUVg2);
        }
    }

    public void a(JsonArray jsonArray) {
        this.b();
        for (int i = 0; i < jsonArray.size(); ++i) {
            JsonObject jsonObject;
            JsonElement jsonElement = jsonArray.get(i);
            if (!jsonElement.isJsonObject() || jsonElement.isJsonNull() || (jsonObject = jsonElement.getAsJsonObject()).get("name") == null || jsonObject.get("name").isJsonNull()) continue;
            String string = jsonObject.get("name").getAsString();
            iReSqtkUVgZsZiReSqtkUVg iReSqtkUVgZsZiReSqtkUVg2 = string.startsWith("/") ? new iReSqtkUVghnYiReSqtkUVg(string) : (string.equalsIgnoreCase("fishing rod") ? new iReSqtkUVglLjiReSqtkUVg(string) : new iReSqtkUVgZsZiReSqtkUVg(string));
            iReSqtkUVgZsZiReSqtkUVg2.a(jsonObject);
            this.a(iReSqtkUVgZsZiReSqtkUVg2);
        }
    }

    public JsonArray a() {
        JsonArray jsonArray = new JsonArray();
        for (iReSqtkUVgZsZiReSqtkUVg iReSqtkUVgZsZiReSqtkUVg2 : this.a) {
            jsonArray.add((JsonElement)iReSqtkUVgZsZiReSqtkUVg2.f());
        }
        return jsonArray;
    }
}

