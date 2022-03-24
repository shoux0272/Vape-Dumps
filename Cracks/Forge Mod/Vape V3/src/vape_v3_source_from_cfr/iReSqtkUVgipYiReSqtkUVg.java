/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 */
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import java.util.HashSet;
import java.util.Set;

public class iReSqtkUVgipYiReSqtkUVg {
    private Set<iReSqtkUVgowliReSqtkUVg> a = new HashSet<iReSqtkUVgowliReSqtkUVg>();

    public void a(iReSqtkUVgowliReSqtkUVg iReSqtkUVgowliReSqtkUVg2) {
        this.a.add(iReSqtkUVgowliReSqtkUVg2);
        iReSqtkUVghUmiReSqtkUVg iReSqtkUVghUmiReSqtkUVg2 = iReSqtkUVgFuiiReSqtkUVg.e.d().a(iReSqtkUVghUmiReSqtkUVg.class);
        iReSqtkUVghUmiReSqtkUVg2.a(iReSqtkUVgowliReSqtkUVg2);
    }

    public void a(iReSqtkUVgDgxiReSqtkUVg iReSqtkUVgDgxiReSqtkUVg2) {
        iReSqtkUVgowliReSqtkUVg iReSqtkUVgowliReSqtkUVg2 = null;
        for (iReSqtkUVgowliReSqtkUVg iReSqtkUVgowliReSqtkUVg3 : this.a) {
            if (!iReSqtkUVgowliReSqtkUVg3.equals(iReSqtkUVgDgxiReSqtkUVg2.G())) continue;
            iReSqtkUVgowliReSqtkUVg2 = iReSqtkUVgowliReSqtkUVg3;
        }
        if (iReSqtkUVgowliReSqtkUVg2 != null) {
            iReSqtkUVghUmiReSqtkUVg iReSqtkUVghUmiReSqtkUVg2 = iReSqtkUVgFuiiReSqtkUVg.e.d().a(iReSqtkUVghUmiReSqtkUVg.class);
            iReSqtkUVghUmiReSqtkUVg2.b(iReSqtkUVgowliReSqtkUVg2);
            iReSqtkUVgFCaiReSqtkUVg.e.a(iReSqtkUVgDgxiReSqtkUVg2);
            this.a.remove(iReSqtkUVgowliReSqtkUVg2);
        }
    }

    public void a() {
        for (iReSqtkUVgowliReSqtkUVg iReSqtkUVgowliReSqtkUVg2 : new HashSet<iReSqtkUVgowliReSqtkUVg>(this.a)) {
            this.a(iReSqtkUVgowliReSqtkUVg2.e());
        }
    }

    public boolean a(int n) {
        for (iReSqtkUVgowliReSqtkUVg iReSqtkUVgowliReSqtkUVg2 : this.a) {
            if (iReSqtkUVgowliReSqtkUVg2.a() != n) continue;
            return true;
        }
        return false;
    }

    public JsonArray b() {
        JsonArray jsonArray = new JsonArray();
        for (iReSqtkUVgowliReSqtkUVg iReSqtkUVgowliReSqtkUVg2 : this.a) {
            jsonArray.add((JsonElement)iReSqtkUVgowliReSqtkUVg2.c());
        }
        return jsonArray;
    }

    public void a(JsonArray jsonArray) {
        this.a();
        for (int i = 0; i < jsonArray.size(); ++i) {
            JsonElement jsonElement = jsonArray.get(i);
            if (!jsonElement.isJsonObject() || jsonElement.isJsonNull()) continue;
            iReSqtkUVgowliReSqtkUVg iReSqtkUVgowliReSqtkUVg2 = new iReSqtkUVgowliReSqtkUVg("", 0).a(jsonElement.getAsJsonObject());
            this.a(iReSqtkUVgowliReSqtkUVg2);
        }
    }
}

