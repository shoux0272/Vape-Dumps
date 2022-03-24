/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.stream.JsonReader
 */
import a.a;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.stream.JsonReader;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class iReSqtkUVgfSHiReSqtkUVg
extends iReSqtkUVgCMeiReSqtkUVg {
    private iReSqtkUVgwgUiReSqtkUVg p;
    private iReSqtkUVguOciReSqtkUVg q;
    private iReSqtkUVgilmiReSqtkUVg r = new iReSqtkUVgilmiReSqtkUVg("Profile preview", iReSqtkUVgIqLiReSqtkUVg.b, 0.7);
    private iReSqtkUVgntKiReSqtkUVg s;
    private iReSqtkUVgJZmiReSqtkUVg[] t = new iReSqtkUVgJZmiReSqtkUVg[]{iReSqtkUVgFuiiReSqtkUVg.e.d().a(iReSqtkUVgsLdiReSqtkUVg.class), iReSqtkUVgFuiiReSqtkUVg.e.d().a(iReSqtkUVgCmliReSqtkUVg.class), iReSqtkUVgFuiiReSqtkUVg.e.d().a(iReSqtkUVgxHBiReSqtkUVg.class), iReSqtkUVgFuiiReSqtkUVg.e.d().a(iReSqtkUVgfHYiReSqtkUVg.class), iReSqtkUVgFuiiReSqtkUVg.e.d().a(iReSqtkUVgMQLiReSqtkUVg.class), iReSqtkUVgFuiiReSqtkUVg.e.d().a(iReSqtkUVgelQiReSqtkUVg.class), iReSqtkUVgFuiiReSqtkUVg.e.d().a(iReSqtkUVgrotiReSqtkUVg.class), iReSqtkUVgFuiiReSqtkUVg.e.d().a(iReSqtkUVggHniReSqtkUVg.class), iReSqtkUVgFuiiReSqtkUVg.e.d().a(iReSqtkUVgXMNiReSqtkUVg.class)};
    private boolean[] u = new boolean[this.t.length];

    public iReSqtkUVgfSHiReSqtkUVg() {
        super("viewer", false);
        this.J().a(new iReSqtkUVgXVAiReSqtkUVg(0.0, 0.0, 5000, 1, new iReSqtkUVgbXziReSqtkUVg(0, 0, 0, 0)));
        this.S();
        this.c(90.0);
        this.d(200.0);
        this.a(new iReSqtkUVgDosiReSqtkUVg(this));
    }

    private void S() {
        this.p = new iReSqtkUVgwgUiReSqtkUVg(false);
        this.p.a(new iReSqtkUVgXVAiReSqtkUVg(0.0, 0.0, 5000, 1, new iReSqtkUVgbXziReSqtkUVg(0, 2, 0, 0)));
        this.c(this.p);
        this.r.c(65.0);
        this.r.d(12.0);
        this.p.a((iReSqtkUVgnCWiReSqtkUVg)this.r);
        this.q = new iReSqtkUVguOciReSqtkUVg(false);
        this.q.c(80.0);
        this.q.d(210.0);
        this.c(this.q);
    }

    @Override
    public void c_() {
        this.a_(this.s != null);
        this.b_(false);
        this.c_(false);
        this.L().a_(false);
        this.a_(iReSqtkUVgFCaiReSqtkUVg.f.c() - this.k());
        this.b(iReSqtkUVgFCaiReSqtkUVg.f.e_());
        this.q.d(198.0);
        super.c_();
    }

    @Override
    public void a(boolean bl) {
        super.a(false);
    }

    public void a(iReSqtkUVgntKiReSqtkUVg iReSqtkUVgntKiReSqtkUVg2) {
        this.s = iReSqtkUVgntKiReSqtkUVg2;
        if (iReSqtkUVgntKiReSqtkUVg2 == null) {
            return;
        }
        this.q.D().q();
        this.r.a(iReSqtkUVgntKiReSqtkUVg2.g());
        String string = new String(a.a.sp("/config/pub/get.individual.php", "profile_id=" + iReSqtkUVgntKiReSqtkUVg2.f().toString() + "&owns=0"));
        if (string.length() == 0) {
            return;
        }
        JsonReader jsonReader = new JsonReader((Reader)new StringReader(string));
        jsonReader.setLenient(true);
        JsonElement jsonElement = (JsonElement)new Gson().fromJson(jsonReader, JsonElement.class);
        if (jsonElement == null || jsonElement.isJsonNull() || !jsonElement.isJsonArray()) {
            return;
        }
        JsonArray jsonArray = jsonElement.getAsJsonArray();
        if (jsonArray.size() == 0) {
            return;
        }
        JsonObject jsonObject = jsonArray.get(0).getAsJsonObject();
        this.b(jsonObject);
    }

    public void b(JsonObject jsonObject) {
        JsonObject jsonObject2 = jsonObject.get("data").getAsJsonObject();
        JsonArray jsonArray = jsonObject2.get("modules").getAsJsonArray();
        int n = 0;
        for (iReSqtkUVgJZmiReSqtkUVg iReSqtkUVgJZmiReSqtkUVg2 : this.t) {
            try {
                Iterator iterator = jsonArray.iterator();
                while (iterator.hasNext()) {
                    try {
                        JsonElement jsonElement = (JsonElement)iterator.next();
                        JsonObject jsonObject3 = jsonElement.getAsJsonObject();
                        String string = jsonObject3.get("name").getAsString();
                        if (!string.equals(iReSqtkUVgJZmiReSqtkUVg2.N())) continue;
                        this.a(iReSqtkUVgJZmiReSqtkUVg2, jsonObject3.get("values").getAsJsonArray(), n);
                    }
                    catch (Exception exception) {}
                }
            }
            catch (Exception exception) {
                // empty catch block
            }
            ++n;
        }
    }

    private void a(iReSqtkUVgJZmiReSqtkUVg iReSqtkUVgJZmiReSqtkUVg2, JsonArray jsonArray, int n) {
        iReSqtkUVgwgUiReSqtkUVg iReSqtkUVgwgUiReSqtkUVg2 = new iReSqtkUVgwgUiReSqtkUVg(false);
        iReSqtkUVgwgUiReSqtkUVg2.a(k);
        iReSqtkUVgwgUiReSqtkUVg2.c(false);
        iReSqtkUVgwgUiReSqtkUVg2.a(new iReSqtkUVgXVAiReSqtkUVg(0.0, 4.0, 5000, 1, new iReSqtkUVgbXziReSqtkUVg(0, 2, 0, 2)));
        iReSqtkUVgwgUiReSqtkUVg2.d(15.0);
        iReSqtkUVgwgUiReSqtkUVg2.c(80.0);
        iReSqtkUVgwgUiReSqtkUVg iReSqtkUVgwgUiReSqtkUVg3 = new iReSqtkUVgwgUiReSqtkUVg(false);
        iReSqtkUVgwgUiReSqtkUVg3.a(new iReSqtkUVgXVAiReSqtkUVg(0.0, 4.0, 5000, 1, new iReSqtkUVgbXziReSqtkUVg(1, 0, 1, 0)));
        iReSqtkUVgwgUiReSqtkUVg3.c(80.0);
        iReSqtkUVgwgUiReSqtkUVg3.d(15.0);
        ArrayList<String> arrayList = new ArrayList<String>();
        ArrayList<iReSqtkUVgnCWiReSqtkUVg> arrayList2 = new ArrayList<iReSqtkUVgnCWiReSqtkUVg>();
        for (JsonElement jsonElement : jsonArray) {
            JsonObject jsonObject = jsonElement.getAsJsonObject();
            String string = jsonObject.get("id").getAsString();
            if (arrayList.contains(string)) continue;
            for (iReSqtkUVgWaoiReSqtkUVg iReSqtkUVgWaoiReSqtkUVg2 : iReSqtkUVgJZmiReSqtkUVg2.l()) {
                if (iReSqtkUVgWaoiReSqtkUVg2.d() != null || !string.equals(iReSqtkUVgWaoiReSqtkUVg2.e())) continue;
                this.a(arrayList2, iReSqtkUVgWaoiReSqtkUVg2, jsonObject, jsonArray);
                break;
            }
            arrayList.add(string);
        }
        iReSqtkUVgpMeiReSqtkUVg iReSqtkUVgpMeiReSqtkUVg2 = new iReSqtkUVgpMeiReSqtkUVg(n, iReSqtkUVgJZmiReSqtkUVg2.N(), arrayList2);
        if (this.u[n]) {
            iReSqtkUVgpMeiReSqtkUVg2.b_();
        }
        iReSqtkUVgpMeiReSqtkUVg2.G().f(true);
        iReSqtkUVgpMeiReSqtkUVg2.H().f(true);
        iReSqtkUVgpMeiReSqtkUVg2.c(80.0);
        iReSqtkUVgpMeiReSqtkUVg2.d(12.0);
        iReSqtkUVgwgUiReSqtkUVg2.a((iReSqtkUVgnCWiReSqtkUVg)iReSqtkUVgpMeiReSqtkUVg2);
        iReSqtkUVgwgUiReSqtkUVg3.a((iReSqtkUVgnCWiReSqtkUVg)iReSqtkUVgwgUiReSqtkUVg2);
        this.q.c(iReSqtkUVgwgUiReSqtkUVg3);
    }

    private void a(List<iReSqtkUVgnCWiReSqtkUVg> list, iReSqtkUVgWaoiReSqtkUVg iReSqtkUVgWaoiReSqtkUVg2, JsonObject jsonObject, JsonArray jsonArray) {
        double d2;
        iReSqtkUVgWaoiReSqtkUVg iReSqtkUVgWaoiReSqtkUVg3;
        if (iReSqtkUVgWaoiReSqtkUVg2 instanceof iReSqtkUVgfXGiReSqtkUVg) {
            iReSqtkUVgWaoiReSqtkUVg3 = (iReSqtkUVgfXGiReSqtkUVg)iReSqtkUVgWaoiReSqtkUVg2;
            d2 = jsonObject.get("minimum").getAsDouble();
            double d3 = jsonObject.get("maximum").getAsDouble();
            iReSqtkUVgBLuiReSqtkUVg object = new iReSqtkUVgBLuiReSqtkUVg(((iReSqtkUVgBLuiReSqtkUVg)iReSqtkUVgWaoiReSqtkUVg3.c()).G(), ((iReSqtkUVgBLuiReSqtkUVg)iReSqtkUVgWaoiReSqtkUVg3.c()).F(), "#.#", "", iReSqtkUVgWaoiReSqtkUVg3.N());
            object.a(iReSqtkUVgFuiiReSqtkUVg.e.r().d.k());
            object.d(true);
            iReSqtkUVgfXGiReSqtkUVg iReSqtkUVgfXGiReSqtkUVg2 = new iReSqtkUVgfXGiReSqtkUVg((Object)null, iReSqtkUVgWaoiReSqtkUVg2.e(), object);
            iReSqtkUVgfXGiReSqtkUVg2.a(new iReSqtkUVgpFLiReSqtkUVg[]{new iReSqtkUVgpFLiReSqtkUVg(d2), new iReSqtkUVgpFLiReSqtkUVg(d3)});
            object.b(iReSqtkUVgfXGiReSqtkUVg2);
            object.e(d2);
            object.f(d3);
            object.c(78.0);
            object.d(7.0);
            list.add(object);
        }
        if (iReSqtkUVgWaoiReSqtkUVg2 instanceof iReSqtkUVgkzHiReSqtkUVg) {
            iReSqtkUVgWaoiReSqtkUVg3 = (iReSqtkUVgkzHiReSqtkUVg)iReSqtkUVgWaoiReSqtkUVg2;
            d2 = jsonObject.get("value").getAsDouble();
            iReSqtkUVgbqSiReSqtkUVg iReSqtkUVgbqSiReSqtkUVg2 = new iReSqtkUVgbqSiReSqtkUVg(((iReSqtkUVgbqSiReSqtkUVg)iReSqtkUVgWaoiReSqtkUVg3.c()).M(), ((iReSqtkUVgbqSiReSqtkUVg)iReSqtkUVgWaoiReSqtkUVg3.c()).N(), "#.#", "", iReSqtkUVgWaoiReSqtkUVg3.N());
            iReSqtkUVgbqSiReSqtkUVg2.a(iReSqtkUVgFuiiReSqtkUVg.e.r().d.k());
            iReSqtkUVgbqSiReSqtkUVg2.d(true);
            iReSqtkUVgkzHiReSqtkUVg iReSqtkUVgkzHiReSqtkUVg2 = new iReSqtkUVgkzHiReSqtkUVg((Object)null, iReSqtkUVgWaoiReSqtkUVg2.e(), iReSqtkUVgbqSiReSqtkUVg2);
            iReSqtkUVgkzHiReSqtkUVg2.a(d2);
            iReSqtkUVgbqSiReSqtkUVg2.b(iReSqtkUVgkzHiReSqtkUVg2);
            iReSqtkUVgbqSiReSqtkUVg2.e(d2);
            iReSqtkUVgbqSiReSqtkUVg2.c(78.0);
            iReSqtkUVgbqSiReSqtkUVg2.d(7.0);
            list.add(iReSqtkUVgbqSiReSqtkUVg2);
        }
        if (iReSqtkUVgWaoiReSqtkUVg2 instanceof iReSqtkUVgoRmiReSqtkUVg) {
            iReSqtkUVgWaoiReSqtkUVg3 = (iReSqtkUVgoRmiReSqtkUVg)iReSqtkUVgWaoiReSqtkUVg2;
            boolean bl = jsonObject.get("value").getAsBoolean();
            iReSqtkUVgRNziReSqtkUVg iReSqtkUVgRNziReSqtkUVg2 = new iReSqtkUVgRNziReSqtkUVg(iReSqtkUVgWaoiReSqtkUVg2.e(), 10.0);
            iReSqtkUVgRNziReSqtkUVg2.d(true);
            iReSqtkUVgRNziReSqtkUVg2.a(iReSqtkUVgFuiiReSqtkUVg.e.r().d.k());
            iReSqtkUVgoRmiReSqtkUVg iReSqtkUVgoRmiReSqtkUVg2 = new iReSqtkUVgoRmiReSqtkUVg((Object)null, iReSqtkUVgWaoiReSqtkUVg2.e(), iReSqtkUVgRNziReSqtkUVg2);
            iReSqtkUVgoRmiReSqtkUVg2.a((Boolean)bl);
            iReSqtkUVgRNziReSqtkUVg2.b(iReSqtkUVgoRmiReSqtkUVg2);
            iReSqtkUVgRNziReSqtkUVg2.d(10.0);
            list.add(iReSqtkUVgRNziReSqtkUVg2);
            if (bl) {
                for (iReSqtkUVgWaoiReSqtkUVg iReSqtkUVgWaoiReSqtkUVg4 : ((iReSqtkUVgoRmiReSqtkUVg)iReSqtkUVgWaoiReSqtkUVg3).k()) {
                    for (JsonElement jsonElement : jsonArray) {
                        JsonObject jsonObject2 = jsonElement.getAsJsonObject();
                        String string = jsonObject2.get("id").getAsString();
                        if (!string.equals(iReSqtkUVgWaoiReSqtkUVg4.e())) continue;
                        this.a(list, iReSqtkUVgWaoiReSqtkUVg4, jsonObject2, jsonArray);
                    }
                }
            }
        }
    }

    public iReSqtkUVgntKiReSqtkUVg R() {
        return this.s;
    }

    static /* synthetic */ boolean[] a(iReSqtkUVgfSHiReSqtkUVg iReSqtkUVgfSHiReSqtkUVg2) {
        return iReSqtkUVgfSHiReSqtkUVg2.u;
    }
}

