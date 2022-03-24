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
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import manthe.ng;
import manthe.wF;
import manthe.yU;
import manthe.ya;
import manthe.yu;

public class v {
    private final Set<ya> a = new HashSet<ya>();

    public void a(ya ya2) {
        this.a.add(ya2);
        ng.o.c(ya2);
        wF.V.b(ya2);
    }

    public void b(ya ya2) {
        this.a.remove(ya2);
        ng.o.b(ya2);
        wF.V.a(ya2);
    }

    public ya a(String string) {
        for (ya ya2 : this.a) {
            if (!ya2.l().equalsIgnoreCase(string)) continue;
            return ya2;
        }
        return null;
    }

    public ya b(int n6) {
        for (ya ya2 : this.a) {
            if (ya2.n() != n6) continue;
            return ya2;
        }
        return null;
    }

    public List<ya> a(int n6) {
        ArrayList<ya> arrayList = new ArrayList<ya>();
        for (ya ya2 : this.a) {
            if (ya2.n() != n6) continue;
            arrayList.add(ya2);
        }
        return arrayList;
    }

    private void a() {
        for (ya ya2 : new HashSet<ya>(this.a)) {
            this.b(ya2);
        }
    }

    public void a(JsonArray jsonArray) {
        this.a();
        for (int k = 0; k < jsonArray.size(); ++k) {
            JsonObject jsonObject;
            JsonElement jsonElement = jsonArray.get(k);
            if (!jsonElement.isJsonObject() || jsonElement.isJsonNull() || (jsonObject = jsonElement.getAsJsonObject()).get("name") == null || jsonObject.get("name").isJsonNull()) continue;
            String string = jsonObject.get("name").getAsString();
            ya ya2 = string.startsWith("/") ? new yU(string) : (string.equalsIgnoreCase("fishing rod") ? new yu(string) : new ya(string));
            ya2.a(jsonObject);
            this.a(ya2);
        }
    }

    public JsonArray b() {
        JsonArray jsonArray = new JsonArray();
        for (ya ya2 : this.a) {
            jsonArray.add((JsonElement)ya2.r());
        }
        return jsonArray;
    }
}

