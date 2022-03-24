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
import java.util.UUID;

public class iReSqtkUVgBvTiReSqtkUVg {
    private List<iReSqtkUVgnWNiReSqtkUVg> a = new ArrayList<iReSqtkUVgnWNiReSqtkUVg>();
    private iReSqtkUVgnWNiReSqtkUVg b;

    public List<iReSqtkUVgnWNiReSqtkUVg> a() {
        return this.a;
    }

    public iReSqtkUVgnWNiReSqtkUVg a(String string) {
        for (iReSqtkUVgnWNiReSqtkUVg iReSqtkUVgnWNiReSqtkUVg2 : this.a) {
            if (!iReSqtkUVgnWNiReSqtkUVg2.g().equalsIgnoreCase(string)) continue;
            return iReSqtkUVgnWNiReSqtkUVg2;
        }
        return null;
    }

    public iReSqtkUVgnWNiReSqtkUVg a(UUID uUID) {
        for (iReSqtkUVgnWNiReSqtkUVg iReSqtkUVgnWNiReSqtkUVg2 : this.a) {
            if (!iReSqtkUVgnWNiReSqtkUVg2.f().toString().equalsIgnoreCase(uUID.toString())) continue;
            return iReSqtkUVgnWNiReSqtkUVg2;
        }
        return null;
    }

    public iReSqtkUVgnWNiReSqtkUVg b() {
        if (this.b == null || !this.a().contains(this.b)) {
            this.b = this.a().get(0);
            this.b.a();
        }
        return this.b;
    }

    public void a(iReSqtkUVgnWNiReSqtkUVg iReSqtkUVgnWNiReSqtkUVg2) {
        this.b = iReSqtkUVgnWNiReSqtkUVg2;
        this.b.a();
    }

    public void b(iReSqtkUVgnWNiReSqtkUVg iReSqtkUVgnWNiReSqtkUVg2) {
        this.a.add(iReSqtkUVgnWNiReSqtkUVg2);
        iReSqtkUVgFCaiReSqtkUVg.c.a(iReSqtkUVgnWNiReSqtkUVg2);
        iReSqtkUVgFCaiReSqtkUVg.g.a(iReSqtkUVgnWNiReSqtkUVg2);
    }

    public void c(iReSqtkUVgnWNiReSqtkUVg iReSqtkUVgnWNiReSqtkUVg2) {
        this.a.remove(iReSqtkUVgnWNiReSqtkUVg2);
        iReSqtkUVgFCaiReSqtkUVg.c.b(iReSqtkUVgnWNiReSqtkUVg2.g());
        iReSqtkUVgFCaiReSqtkUVg.g.b(iReSqtkUVgnWNiReSqtkUVg2);
    }

    public void c() {
        this.a.clear();
        iReSqtkUVgFCaiReSqtkUVg.c.p.D().o().clear();
        iReSqtkUVgFCaiReSqtkUVg.g.R().D().o().clear();
        iReSqtkUVgFCaiReSqtkUVg.g.S().D().o().clear();
    }

    public void a(JsonArray jsonArray) {
        if (jsonArray != null) {
            this.c();
            for (int i = 0; i < jsonArray.size(); ++i) {
                try {
                    iReSqtkUVgnWNiReSqtkUVg iReSqtkUVgnWNiReSqtkUVg2;
                    JsonElement jsonElement = jsonArray.get(i);
                    if (!jsonElement.isJsonObject() || jsonElement.isJsonNull()) continue;
                    JsonObject jsonObject = jsonElement.getAsJsonObject();
                    if (jsonObject.get("private").getAsBoolean()) {
                        iReSqtkUVgnWNiReSqtkUVg2 = new iReSqtkUVgnWNiReSqtkUVg("", "", true).b(jsonObject);
                    } else {
                        iReSqtkUVgnWNiReSqtkUVg2 = new iReSqtkUVgntKiReSqtkUVg("", "").b(jsonObject);
                        if (jsonObject.get("owns") != null && jsonObject.get("owns").getAsBoolean()) {
                            ((iReSqtkUVgntKiReSqtkUVg)iReSqtkUVgnWNiReSqtkUVg2).b(true);
                        }
                    }
                    this.b(iReSqtkUVgnWNiReSqtkUVg2);
                    if (i != 0) continue;
                    this.b = iReSqtkUVgnWNiReSqtkUVg2;
                    this.b.a();
                    continue;
                }
                catch (Exception exception) {
                    // empty catch block
                }
            }
        }
        if (jsonArray == null || jsonArray.size() == 0) {
            iReSqtkUVgnWNiReSqtkUVg iReSqtkUVgnWNiReSqtkUVg3 = new iReSqtkUVgnWNiReSqtkUVg("default", "3.25");
            iReSqtkUVgnWNiReSqtkUVg3.d();
            this.b(iReSqtkUVgnWNiReSqtkUVg3);
        }
    }

    public JsonArray d() {
        JsonArray jsonArray = new JsonArray();
        for (iReSqtkUVgnWNiReSqtkUVg iReSqtkUVgnWNiReSqtkUVg2 : this.a()) {
            jsonArray.add((JsonElement)iReSqtkUVgnWNiReSqtkUVg2.i());
        }
        return jsonArray;
    }

    public int e() {
        int n = 0;
        for (iReSqtkUVgnWNiReSqtkUVg iReSqtkUVgnWNiReSqtkUVg2 : this.a) {
            if (!(iReSqtkUVgnWNiReSqtkUVg2 instanceof iReSqtkUVgntKiReSqtkUVg) || !((iReSqtkUVgntKiReSqtkUVg)iReSqtkUVgnWNiReSqtkUVg2).m()) continue;
            ++n;
        }
        return n;
    }

    public void d(iReSqtkUVgnWNiReSqtkUVg iReSqtkUVgnWNiReSqtkUVg2) {
        if (this.b() != null) {
            this.b().d();
        }
        this.a(iReSqtkUVgnWNiReSqtkUVg2);
        for (iReSqtkUVgCMeiReSqtkUVg iReSqtkUVgCMeiReSqtkUVg2 : iReSqtkUVgFuiiReSqtkUVg.e.m().d()) {
            for (iReSqtkUVgnCWiReSqtkUVg iReSqtkUVgnCWiReSqtkUVg2 : iReSqtkUVgCMeiReSqtkUVg2.J().o()) {
                if (!(iReSqtkUVgnCWiReSqtkUVg2 instanceof iReSqtkUVgcvhiReSqtkUVg)) continue;
                this.a((iReSqtkUVgcvhiReSqtkUVg)iReSqtkUVgnCWiReSqtkUVg2);
            }
        }
        this.a(iReSqtkUVgnWNiReSqtkUVg2);
    }

    private void a(iReSqtkUVgcvhiReSqtkUVg iReSqtkUVgcvhiReSqtkUVg2) {
        for (iReSqtkUVgnCWiReSqtkUVg iReSqtkUVgnCWiReSqtkUVg2 : iReSqtkUVgcvhiReSqtkUVg2.o()) {
            iReSqtkUVgcvhiReSqtkUVg iReSqtkUVgcvhiReSqtkUVg3;
            if (iReSqtkUVgnCWiReSqtkUVg2 instanceof iReSqtkUVgbqSiReSqtkUVg && (iReSqtkUVgcvhiReSqtkUVg3 = (iReSqtkUVgbqSiReSqtkUVg)iReSqtkUVgnCWiReSqtkUVg2).x() != null) {
                ((iReSqtkUVgbqSiReSqtkUVg)iReSqtkUVgcvhiReSqtkUVg3).e((Double)iReSqtkUVgcvhiReSqtkUVg3.x().a());
                ((iReSqtkUVgbqSiReSqtkUVg)iReSqtkUVgcvhiReSqtkUVg3).c_();
            }
            if (iReSqtkUVgnCWiReSqtkUVg2 instanceof iReSqtkUVgBLuiReSqtkUVg && (iReSqtkUVgcvhiReSqtkUVg3 = (iReSqtkUVgBLuiReSqtkUVg)iReSqtkUVgnCWiReSqtkUVg2).x() != null) {
                iReSqtkUVgfXGiReSqtkUVg iReSqtkUVgfXGiReSqtkUVg2 = (iReSqtkUVgfXGiReSqtkUVg)iReSqtkUVgcvhiReSqtkUVg3.x();
                ((iReSqtkUVgBLuiReSqtkUVg)iReSqtkUVgcvhiReSqtkUVg3).e(iReSqtkUVgfXGiReSqtkUVg2.m());
                ((iReSqtkUVgBLuiReSqtkUVg)iReSqtkUVgcvhiReSqtkUVg3).f(iReSqtkUVgfXGiReSqtkUVg2.n());
                ((iReSqtkUVgBLuiReSqtkUVg)iReSqtkUVgcvhiReSqtkUVg3).c_();
            }
            if (!(iReSqtkUVgnCWiReSqtkUVg2 instanceof iReSqtkUVgcvhiReSqtkUVg)) continue;
            this.a((iReSqtkUVgcvhiReSqtkUVg)iReSqtkUVgnCWiReSqtkUVg2);
        }
    }
}

