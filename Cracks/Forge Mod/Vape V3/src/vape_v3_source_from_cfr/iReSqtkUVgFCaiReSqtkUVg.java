/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  iReSqtkUVgNruiReSqtkUVg
 */
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class iReSqtkUVgFCaiReSqtkUVg {
    public static iReSqtkUVgiTfiReSqtkUVg a;
    public static iReSqtkUVgBVLiReSqtkUVg b;
    public static iReSqtkUVgiSWiReSqtkUVg c;
    public static iReSqtkUVgAAGiReSqtkUVg d;
    public static iReSqtkUVgowKiReSqtkUVg e;
    public static iReSqtkUVgczkiReSqtkUVg f;
    public static iReSqtkUVgIcziReSqtkUVg g;
    public static iReSqtkUVgfSHiReSqtkUVg h;
    public static iReSqtkUVgfrCiReSqtkUVg i;
    public static iReSqtkUVgNruiReSqtkUVg j;
    public static iReSqtkUVgJrJiReSqtkUVg k;
    public static iReSqtkUVgYAniReSqtkUVg l;
    private List<iReSqtkUVgCMeiReSqtkUVg> m = new CopyOnWriteArrayList<iReSqtkUVgCMeiReSqtkUVg>();

    public static void a() {
        a = null;
        b = null;
        c = null;
        d = null;
        e = null;
        f = null;
        g = null;
        h = null;
        k = null;
        l = null;
    }

    public void b() {
        List<iReSqtkUVgqTOiReSqtkUVg> list = iReSqtkUVgqTOiReSqtkUVg.a();
        Collections.sort(list, new iReSqtkUVggeriReSqtkUVg());
        this.d().clear();
        k = new iReSqtkUVgJrJiReSqtkUVg();
        this.d().add(k);
        for (iReSqtkUVgqTOiReSqtkUVg iReSqtkUVgqXEiReSqtkUVg2 : list) {
            if (iReSqtkUVgqXEiReSqtkUVg2.equals(iReSqtkUVgqTOiReSqtkUVg.b)) continue;
            iReSqtkUVgFzCiReSqtkUVg iReSqtkUVgFzCiReSqtkUVg2 = new iReSqtkUVgFzCiReSqtkUVg(iReSqtkUVgqXEiReSqtkUVg2);
            ArrayList<iReSqtkUVgJZmiReSqtkUVg> arrayList = new ArrayList<iReSqtkUVgJZmiReSqtkUVg>(iReSqtkUVgFuiiReSqtkUVg.e.d().d());
            Collections.sort(arrayList, new iReSqtkUVggeriReSqtkUVg());
            for (iReSqtkUVgJZmiReSqtkUVg iReSqtkUVgJZmiReSqtkUVg2 : arrayList) {
                if (iReSqtkUVgJZmiReSqtkUVg2.e() != iReSqtkUVgqXEiReSqtkUVg2) continue;
                iReSqtkUVgFzCiReSqtkUVg2.a(iReSqtkUVgJZmiReSqtkUVg2);
            }
            iReSqtkUVgFzCiReSqtkUVg2.S();
            if (iReSqtkUVgFzCiReSqtkUVg2.J().o().size() <= 0) continue;
            this.d().add(iReSqtkUVgFzCiReSqtkUVg2);
        }
        l = new iReSqtkUVgYAniReSqtkUVg();
        this.d().add(l);
        b = new iReSqtkUVgBVLiReSqtkUVg();
        this.d().add(b);
        i = new iReSqtkUVgfrCiReSqtkUVg();
        this.d().add(i);
        e = new iReSqtkUVgowKiReSqtkUVg();
        this.d().add(e);
        c = new iReSqtkUVgiSWiReSqtkUVg();
        this.d().add(c);
        d = new iReSqtkUVgAAGiReSqtkUVg();
        this.d().add(d);
        this.d().add(new iReSqtkUVghzpiReSqtkUVg());
        a = new iReSqtkUVgiTfiReSqtkUVg();
        this.d().add(a);
        this.d().add(new iReSqtkUVgeXViReSqtkUVg());
        Collections.sort(this.d(), new iReSqtkUVggeriReSqtkUVg());
        for (iReSqtkUVgCMeiReSqtkUVg iReSqtkUVgCMeiReSqtkUVg2 : this.d()) {
            if (!iReSqtkUVgCMeiReSqtkUVg2.D()) continue;
            a.J().a((iReSqtkUVgnCWiReSqtkUVg)iReSqtkUVgCMeiReSqtkUVg2.E());
        }
        g.a(new iReSqtkUVgvJziReSqtkUVg(this));
        this.c();
    }

    public void c() {
        int n = 0;
        for (iReSqtkUVgCMeiReSqtkUVg iReSqtkUVgCMeiReSqtkUVg2 : this.d()) {
            if (!iReSqtkUVgCMeiReSqtkUVg2.equals(a)) {
                iReSqtkUVgCMeiReSqtkUVg2.a_(false);
                iReSqtkUVgCMeiReSqtkUVg2.c_(true);
                iReSqtkUVgCMeiReSqtkUVg2.a_(20.0);
                iReSqtkUVgCMeiReSqtkUVg2.b(n += 20);
                continue;
            }
            iReSqtkUVgCMeiReSqtkUVg2.a_(true);
            iReSqtkUVgCMeiReSqtkUVg2.c_(false);
            iReSqtkUVgCMeiReSqtkUVg2.a_(100.0);
            iReSqtkUVgCMeiReSqtkUVg2.b(20.0);
        }
        iReSqtkUVgypOiReSqtkUVg.a(null);
    }

    public iReSqtkUVgCMeiReSqtkUVg a(String string) {
        for (iReSqtkUVgCMeiReSqtkUVg iReSqtkUVgCMeiReSqtkUVg2 : this.d()) {
            if (!iReSqtkUVgCMeiReSqtkUVg2.I().D().equalsIgnoreCase(string)) continue;
            return iReSqtkUVgCMeiReSqtkUVg2;
        }
        return null;
    }

    public List<iReSqtkUVgCMeiReSqtkUVg> d() {
        return this.m;
    }

    public void a(JsonArray jsonArray) {
        if (jsonArray.size() == 0) {
            return;
        }
        jsonArray = jsonArray.get(0).getAsJsonArray();
        for (int i = 0; i < jsonArray.size(); ++i) {
            try {
                iReSqtkUVgCMeiReSqtkUVg iReSqtkUVgCMeiReSqtkUVg2;
                JsonObject jsonObject;
                JsonElement jsonElement = jsonArray.get(i);
                if (!jsonElement.isJsonObject() || jsonElement.isJsonNull() || (jsonObject = jsonElement.getAsJsonObject()).get("title") == null || jsonObject.get("title").isJsonNull() || (iReSqtkUVgCMeiReSqtkUVg2 = this.a(jsonObject.get("title").getAsString())) == null) continue;
                iReSqtkUVgCMeiReSqtkUVg2.a(jsonObject);
                continue;
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
    }

    public JsonArray e() {
        JsonArray jsonArray = new JsonArray();
        for (iReSqtkUVgCMeiReSqtkUVg iReSqtkUVgCMeiReSqtkUVg2 : this.d()) {
            jsonArray.add((JsonElement)iReSqtkUVgCMeiReSqtkUVg2.M());
        }
        return jsonArray;
    }

    static {
        f = new iReSqtkUVgczkiReSqtkUVg();
        g = new iReSqtkUVgIcziReSqtkUVg();
        h = new iReSqtkUVgfSHiReSqtkUVg();
    }
}

